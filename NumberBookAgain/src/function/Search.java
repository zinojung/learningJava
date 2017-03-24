package function;

import model.PhoneInfo;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Jo_seungwan on 2017. 3. 24..
 */
public class Search implements SearchFunction {

    @Override
    public PhoneInfo search(String name, HashSet<PhoneInfo> infoStorage) {
        Iterator<PhoneInfo> itr = infoStorage.iterator();
        while(itr.hasNext())
        {
            PhoneInfo curInfo = itr.next();
            if(name.compareTo(curInfo.getName()) == 0)
                return curInfo;
        }
        return null;
    }
}
