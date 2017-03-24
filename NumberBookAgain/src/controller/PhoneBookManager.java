package controller;

import function.DeleteData;
import model.PhoneInfo;

import java.util.HashSet;

/**
 * Created by Jo_seungwan on 2017. 3. 24..
 */
public class PhoneBookManager {
    HashSet<PhoneInfo> infoStorage;
    public PhoneBookManager(HashSet<PhoneInfo> infoStorage){
        this.infoStorage = infoStorage;
    }
    public void functionDelete(){DeleteData deleteData = new DeleteData(infoStorage);}

}
