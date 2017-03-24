package model;

/**
 * Created by Jo_seungwan on 2017. 3. 24..
 */
public class PhoneInfo {
    private String name, phoneNumber;

    public PhoneInfo(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void showPhoneInfo(){
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
    }

    public String getName(){
        return this.name;
    }

    public int hashCode(){
        return name.hashCode();
    }

    public boolean equals(Object obj){
        PhoneInfo cmp = (PhoneInfo)obj;
        if(name.compareTo(cmp.name) == 0)
            return true;
        else
            return false;
    }
}
