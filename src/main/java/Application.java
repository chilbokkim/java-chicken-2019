import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Table> tables = TableRepository.tables();
        final List<Menu> menus = MenuRepository.menus();
        int command; //��ɾ�
        int tableNumber; //���̺� ��ȣ
        int menuType; //�ֹ��ϰ��� �ϴ� �޴��� ��ȣ
        int numberOfMenu; //�ֹ��� �޴��� ����
        int tableIndex; //tables�� ����ִ� table�� index
        int methodOfPayment; // ���� ����
         do{
        	 OutputView.printCommandList();
        	 command = InputView.inputCommandList();
        	if(command==1) {
        		// �ֹ����
        		OutputView.printTables(tables);
        		tableNumber = InputView.inputTableNumber();
        		tableIndex = parseTableNumberToIndex(tableNumber,tables);
        		OutputView.printMenus(menus);
        		menuType = InputView.inputMenuType();
        		numberOfMenu = InputView.inputMenuNumber();
        		tables.get(tableIndex).order(menuType, numberOfMenu);
        	}
        	if(command==2) {
        		// �����ϱ�
        		OutputView.printTables(tables);
        		tableNumber = InputView.inputTableNumber();
        		tableIndex = parseTableNumberToIndex(tableNumber,tables);
        		OutputView.printReceipt(tables.get(tableIndex));
        		methodOfPayment = InputView.inputMethodOfPayment(tableNumber);
        		OutputView.printTotalPrice(tables.get(tableIndex), methodOfPayment);
        		tables.get(tableIndex).clearOder();
        	}
        }while(command!=3);
        
    }
    
    public static int parseTableNumberToIndex(int tableNumber, List<Table> tables) {
    	int index = 0;
    	for(int i=0;i<tables.size();i++) {
    		if(tables.get(i).getNumber()==tableNumber) {
    			index = i;
    		}
    	}
    	return index;
    }
}
