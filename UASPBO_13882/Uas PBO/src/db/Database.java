/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import static db.Database.DB_URL;
import static db.Database.JDBC_DRIVER;
import static db.Database.PASS;
import static db.Database.USER;
import static db.Database.conn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
/**
 *
 * @author gilan
 */


public class Database {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/penjualan";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

public static void connect(){
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        } catch(Exception e){
            System.out.println("Tidak dapat melakukan koneksi");
            e.printStackTrace();
        }
    }
    public static Connection con(){
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        } catch(Exception e){
            System.out.println("Tidak dapat melakukan koneksi");
            e.printStackTrace();
            return null;
        }
        
    }
    public static boolean userLogin(String username, String pass){
        try{
            connect();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM user WHERE username = ? AND pass = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, pass);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                sql = "UPDATE user SET last_login=now() WHERE username=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, username);
                ps.execute();
                return true;
            }
            else
                return false;
        }catch(Exception e){
            e.printStackTrace();
            
            return false;
        }
    }
    public static ResultSet showUser(){
        try{
            Class.forName(JDBC_DRIVER);	   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
 
            stmt = conn.createStatement();
            String sql = "SELECT * FROM user ORDER BY last_login DESC";
            int i = 1;
            rs = stmt.executeQuery(sql);
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static boolean userUpdate(String username, String pass, String selectedUser){
        try{
            connect();
            stmt = conn.createStatement();

            String sql = "UPDATE user SET username=?, pass=MD5(?) WHERE username=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,username);
            ps.setString(2,pass);
            ps.setString(3,selectedUser);

            ps.execute();

            stmt.close();
            conn.close();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    
    public static boolean deleteUser(String username){
        try {
            connect();
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT * FROM user WHERE username=\'"+username+"\'");

            if(rs.next()){
                String sql = "DELETE FROM user WHERE username=?";
                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1,username);
                ps.execute();
                stmt.close();
                conn.close();
                return true;
            } else {
                return false;
            }
            
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public static boolean userReg(String username, String pass){
        try{
            connect();
            stmt = conn.createStatement();

            String sql = "INSERT INTO user (username,pass) value (?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1,username);
            ps.setString(2,pass);
            
            ps.execute();
            
            return true;
        }catch(Exception e){
            e.printStackTrace();
            
            return false;
        }
    }
     public static boolean insert(String kode_brg, String nm_brg, String satuan, int hrg_beli, int hrg_jual, int stok, int stok_min){
        try{
            connect();
            stmt = conn.createStatement();

            String sql = "INSERT INTO barang (kd_brg, nm_brg, satuan, hrg_beli, hrg_jual, stok_brg, stok_min) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,kode_brg);
            ps.setString(2,nm_brg);
            ps.setString(3,satuan);
            ps.setInt(4,hrg_beli);
            ps.setInt(5,hrg_jual);
            ps.setInt(6,stok);
            ps.setInt(7,stok_min);

            ps.execute();

            stmt.close();
            conn.close();
            return true;
        }
        catch(SQLException b){
            b.printStackTrace();
            return false;
        }
    }
     public static boolean update(String kode_brg, String nm_brg, String satuan, int hrg_beli, int hrg_jual, int stok, int stok_min, String selectedBarang){
        try{
            connect();
            stmt = conn.createStatement();

            String sql = "UPDATE barang SET kd_brg=?, nm_brg=?, satuan=?, hrg_beli=?, hrg_jual=?, stok_brg=?, stok_min=? WHERE kd_brg=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,kode_brg);
            ps.setString(2,nm_brg);
            ps.setString(3,satuan);
            ps.setInt(4,hrg_beli);
            ps.setInt(5,hrg_jual);
            ps.setInt(6,stok);
            ps.setInt(7,stok_min);
            ps.setString(8,selectedBarang);

            ps.execute();

            stmt.close();
            conn.close();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
           
    public static boolean delete(String kd_brg){
        try {
            connect();
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT * FROM barang WHERE kd_brg=\'"+kd_brg+"\'");

            if(rs.next()){
                String sql = "DELETE FROM barang WHERE kd_brg=?";
                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1,kd_brg);
                ps.execute();
                stmt.close();
                conn.close();
                return true;
            } else {
                return false;
            }
            
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
        public static boolean barangKeluar(String kode_brg, int stok){
        try{
            connect();
            stmt = conn.createStatement();

            String sql = "UPDATE barang SET stok_brg=stok_brg-? WHERE kd_brg=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(2,kode_brg);
            ps.setInt(1,stok);
            

            ps.execute();

            stmt.close();
            conn.close();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean barangMasuk(String kode_brg, int stok){
        try{
            connect();
            stmt = conn.createStatement();

            String sql = "UPDATE barang SET stok_brg=stok_brg+? WHERE kd_brg=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1,stok);
            ps.setString(2,kode_brg);

            ps.execute();

            stmt.close();
            conn.close();
            
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean insertTransaksi(String username, String type,String kd_brg, String nm_brg, int stok, int stok_after){
        try{
            connect();
            stmt = conn.createStatement();

            String sql = "INSERT INTO transaksi (user, type, kd_brg, nm_brg, stok, stok_after, time) VALUES (?,?,?,?,?,?,current_timestamp())";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,username);
            ps.setString(2,type);
            ps.setString(3,kd_brg);
            ps.setString(4,nm_brg);
            ps.setInt(5,stok);
            ps.setInt(6,stok_after);

            ps.execute();

            stmt.close();
            conn.close();
            return true;
        }
        catch(SQLException b){
            b.printStackTrace();
            return false;
        }
    }
    public static ResultSet showBarang(){
        try{
            Class.forName(JDBC_DRIVER);	   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
 
            stmt = conn.createStatement();
            String sql = "SELECT * FROM barang ORDER BY kd_brg";
            int i = 1;
            rs = stmt.executeQuery(sql);
            return rs;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

}