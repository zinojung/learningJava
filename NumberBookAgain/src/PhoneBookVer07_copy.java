/*
 * 전화 번호 관리 프로젝트 
 * Version 0.2
 * */

import controller.PhoneBookManager;
import exception.MenuChoiceException;
import model.PhoneInfo;
import selectionNumber.INIT_MENU;
import view.MenuViewer;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;


//동작 관련 클래스
//class PhoneBookManager {
//	/*PhoneInfo[] infoStorage = new PhoneInfo[100];
//	int curCnt = 0;*/
//	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();
//
//	static PhoneBookManager inst = null;
//	public static PhoneBookManager creatManagerInst(){
//		if(inst == null) inst = new PhoneBookManager();
//		return inst;
//	}
//
//	public void saveData() throws MenuChoiceException{
//		int choice = 0;
//		System.out.println("친구의 소속을 선택해 주세요..\n1. 일반, 2. 대학, 3. 회사\n선택 : ");
//		choice = MenuViewer.keyboard.nextInt();
//		MenuViewer.keyboard.nextLine();
//		if(choice > 3 || choice < 0) throw new MenuChoiceException(choice);
//
//		System.out.println("데이터 입력을 시작합니다.");
//
//		//소속에 상관없이 공통된 부분.
//		System.out.print("name : ");
//		String name = MenuViewer.keyboard.nextLine();
//		System.out.print("phone : ");
//		String phoneNumber = MenuViewer.keyboard.nextLine();
//		//입력받을 데이터를 잠시 보관해둘 참조변수
//		PhoneInfo info = null;
//
//		switch(choice){
//			//일반 소속 친구 데이터
//			case INPUT_SELECT.NORMAL:
//				info = new PhoneInfo(name, phoneNumber);
//				break;
//			//학교 소속 친구 데이터
//			case INPUT_SELECT.UNIV:
//				System.out.print("전공 : ");
//				String major = MenuViewer.keyboard.nextLine();
//				System.out.print("학년 : ");
//				int year = MenuViewer.keyboard.nextInt();
//				MenuViewer.keyboard.nextLine();
//				info = new PhoneUnivInfo(name, phoneNumber, major, year);
//				break;
//			//회사 소속 친구 데이터
//			case INPUT_SELECT.COMPANY:
//				System.out.print("회사 : ");
//				String company = MenuViewer.keyboard.nextLine();
//				info = new PhoneCompanyInfo(name, phoneNumber, company);
//				break;
//		}
//
//		/*infoStorage[curCnt++] = info;*/
//		boolean isAdded = infoStorage.add(info);
//		if(isAdded == true)
//			System.out.println("데이터 입력이 완료되었습니다.");
//		else
//			System.out.println("이미 저장된 데이터 입니다.");
//	}
//
//	public void searchData(){
//		System.out.println("데이터 검색을 시작합니다.");
//
//		System.out.print("이름 : ");
//		String name = MenuViewer.keyboard.nextLine();
//
//		/*int dataIdx = search(name);
//		if(dataIdx < 0){
//			System.out.println("데이터가 존재하지 않습니다.");
//		} else {
//			infoStorage[dataIdx].showPhoneInfo();
//			System.out.println("데이터 검색이 완료되었습니다.");
//		}*/
//
//		PhoneInfo info = search(name);
//		if(info == null){
//			System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
//		}else{
//			info.showPhoneInfo();
//			System.out.println("데이터 검색이 완료되었습니다.\n");
//		}
//
//	}
//
//	public void deleteData(){
//		System.out.println("데이터 삭제를 시작합니다.");
//
//		System.out.print("이름 : ");
//		String name = MenuViewer.keyboard.nextLine();
//
//		/*int dataIdx = search(name);
//		if(dataIdx < 0){
//			System.out.println("해당하는 데이터가 존재하지 않습니다.");
//		}else{
//			for(int i = dataIdx; i < infoStorage.length - 1; i++){
//				infoStorage[i] = infoStorage[i + 1];
//
//			}
//			curCnt--;
//			System.out.println("데이터 삭제가 완료되었습니다.");
//		}*/
//
//		Iterator<PhoneInfo> itr = infoStorage.iterator();
//		while(itr.hasNext()){
//			PhoneInfo curInfo = itr.next();
//			if(name.compareTo(curInfo.name) == 0){
//				itr.remove();
//				System.out.println("데이터 삭제가 완료 되었습니다.");
//				return;
//			}
//		}
//
//		System.out.println("해당하는 데이터가 존재하지 않습니다.");
//	}
//
//	private PhoneInfo search(String name){
//		/*for(int idx = 0; idx < curCnt; idx++){
//			PhoneInfo curInfo = infoStorage[idx];
//			if(name.compareTo(curInfo.name) == 0) return idx;
//		}
//		return -1;*/
//
//		Iterator<PhoneInfo> itr = infoStorage.iterator();
//		while(itr.hasNext())
//		{
//			PhoneInfo curInfo = itr.next();
//			if(name.compareTo(curInfo.name) == 0)
//				return curInfo;
//		}
//		return null;
//	}
//
//}


public class PhoneBookVer07_copy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<PhoneInfo> database = new HashSet<>();
		int choice = 0;
		PhoneBookManager manager = new PhoneBookManager(database);

		while(true){
			try{
				MenuViewer.showMenu();
				choice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine(); //숫자 입력후 개행문자의 오류 방지
				if(choice > 4 || choice < 0) throw new MenuChoiceException(choice);
				
				switch(choice){
				case INIT_MENU.INPUT:
					manager.saveData();
					break;
				case INIT_MENU.SEARCH:
					manager.searchData();
					break;
				case INIT_MENU.DELETE:
					manager.functionDelete();
					break;
				case INIT_MENU.EXIT:
					System.out.println("프로그램이 종료 되었습니다.");
					return;
				}
			}
			catch(MenuChoiceException e){
				e.printStackTrace();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.\n");
			}
		}
	}

}
