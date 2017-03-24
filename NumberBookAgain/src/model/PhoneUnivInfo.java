package model;

/**
 * Created by Jo_seungwan on 2017. 3. 24..
 */
public class PhoneUnivInfo extends PhoneInfo {
    private String major;
    private int year;

    public PhoneUnivInfo(String name, String phoneNumber, String major, int year){
        super(name, phoneNumber);
        this.major = major;
        this.year = year;
    }

    public void showPhoneInfo(){
        super.showPhoneInfo();
        System.out.println("학과 : " + major);
        System.out.println("학년 : " + year);
    }
}
