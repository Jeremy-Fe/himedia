package Guro_06_01;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {
	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);
		
		
		MenuBar mb = new MenuBar();
        Menu mFile = new Menu("파일");
        
        MenuItem miNewTab = new MenuItem("새 탭");
        MenuItem miOpenWindow = new MenuItem("새 창");
        MenuItem miOpen = new MenuItem("열기");
        MenuItem miSave = new MenuItem("저장");
        MenuItem miOtherSave = new MenuItem("다른 이름으로 저장");
        MenuItem miAllSave = new MenuItem("모두 저장");
        MenuItem miSetPage = new MenuItem("페이지 설정");
        MenuItem miPrint = new MenuItem("인쇄");
        MenuItem miCloseTab = new MenuItem("탭 닫기");
        MenuItem miCloseWindow = new MenuItem("창 닫기");
        MenuItem miClose = new MenuItem("종료");
        
        
        mFile.add(miNewTab);
        mFile.add(miOpenWindow);
        mFile.add(miOpen);
        mFile.add(miSave);
        mFile.add(miOtherSave);
        mFile.add(miAllSave);
        mFile.addSeparator();
        mFile.add(miSetPage);
        mFile.add(miPrint);
        mFile.addSeparator();
        mFile.add(miCloseTab);
        mFile.add(miCloseWindow);
        mFile.add(miClose);
        
       
        Menu mEdit = new Menu("편집");
        MenuItem miCtrlZ = new MenuItem("실행 취소");
        MenuItem miCut = new MenuItem("잘라내기");
        MenuItem miCopy = new MenuItem("복사");
        MenuItem miPaste = new MenuItem("붙여넣기");
        MenuItem miDelete = new MenuItem("삭제");
        MenuItem miFind = new MenuItem("찾기");
        MenuItem miNextFind = new MenuItem("다음 찾기");
        MenuItem miPastFind = new MenuItem("이전 찾기");
        MenuItem miChange = new MenuItem("바꾸기");
        MenuItem miMove = new MenuItem("이동");
        MenuItem miAllCheck = new MenuItem("모두 선택");
        MenuItem miDate = new MenuItem("시간/날짜");
        MenuItem miFont = new MenuItem("글꼴");

        mEdit.add(miCtrlZ);
        mEdit.addSeparator();
        mEdit.add(miCut);
        mEdit.add(miCopy);
        mEdit.add(miPaste);
        mEdit.add(miDelete);
        mEdit.addSeparator();
        mEdit.add(miFind);
        mEdit.add(miNextFind);
        mEdit.add(miPastFind);
        mEdit.add(miChange);
        mEdit.add(miMove);
        mEdit.addSeparator();
        mEdit.add(miAllCheck);
        mEdit.add(miDate);
        mEdit.addSeparator();
        mEdit.add(miFont);
        
        Menu mView = new Menu("보기");
        Menu mZoom = new Menu("확대/축소");
        MenuItem miZoomIn = new MenuItem("확대");
        MenuItem miZoomOut = new MenuItem("축소");
        MenuItem miZoomDefault = new MenuItem("기본 확대/축소 복원");
        CheckboxMenuItem miStatusbar = new CheckboxMenuItem("상태 표시줄");
        CheckboxMenuItem miLine = new CheckboxMenuItem("자동 줄 바꿈");
        
        mView.add(mZoom);
        mZoom.add(miZoomIn);
        mZoom.add(miZoomOut);
        mZoom.add(miZoomDefault);
        mView.add(miStatusbar);
        mView.add(miLine);

        
        mb.add(mFile);
        mb.add(mEdit);
        mb.add(mView);
 
        f.setMenuBar(mb);
        f.setVisible(true);
	}
}
