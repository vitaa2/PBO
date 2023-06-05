package praktikum10;

public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.volumeUp();
		cp.powerOn();
		System.out.println("Volume : "+cp.getVolume());
		cp.volumeUp();
		cp.volumeUp();
		cp.volumeUp();
		cp.volumeDown();
		System.out.println("Volume : "+cp.getVolume());
		System.out.println("Battery : "+cp.batteryLevel);
		cp.topUpPulsa(25000);
		System.out.println("Pulsa : "+cp.getPulsa());
		cp.addContact("Reiza","0892313231");
		cp.addContact("Agus 123","08923132321");
		cp.addContact("Budi","082347283");
		cp.addContact("Budi new","082347283");
		cp.showContact();
		cp.findContact("budi");
        cp.powerOff();
    }
}