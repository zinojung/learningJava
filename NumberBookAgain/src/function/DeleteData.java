package function;

import model.PhoneInfo;
import view.MenuViewer;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Jo_seungwan on 2017. 3. 24..
 */
public class DeleteData {

    public DeleteData(HashSet<PhoneInfo> infoStorage){
        System.out.println("데이터 삭제를 시작합니다.");

        System.out.print("이름 : ");
        String name = MenuViewer.keyboard.nextLine();
        Iterator<PhoneInfo> itr = infoStorage.iterator();
        while(itr.hasNext()) {
            PhoneInfo curInfo = itr.next();
            if (name.compareTo(curInfo.getName()) == 0) {
                itr.remove();
                System.out.println("데이터 삭제가 완료 되었습니다.");
            }
        }
    }
}
