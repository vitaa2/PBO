package praktikum10;

public interface Phone
{
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_BATT_LEVEL = 100;
    public static final int MIN_BATT_LEVEL = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getVolume();
	void topUpPulsa(int val);
	int getPulsa();
	void addContact(String nama, String nomor);
	void showContact();
	void findContact(String nama);
}