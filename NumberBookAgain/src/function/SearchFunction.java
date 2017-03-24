package function;

import model.PhoneInfo;

import java.util.HashSet;

/**
 * Created by Jo_seungwan on 2017. 3. 24..
 */
public interface SearchFunction {
    public PhoneInfo search(String name, HashSet<PhoneInfo> infoStorage);
}
