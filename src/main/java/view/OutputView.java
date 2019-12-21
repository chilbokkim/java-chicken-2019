package view;

import domain.Menu;
import domain.Table;

import java.util.List;

public class OutputView {
    private static final String TOP_LINE = "�� �� ��";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "�� %s ��";

    public static void printTables(final List<Table> tables) {
        System.out.println("## ���̺� ���");
        final int size = tables.size();
        printTopLine(size);
        printTableNumbers(tables);
        printBottomLine(tables);
        System.out.println();
    }
    
    public static void printCommandList() {
    	System.out.println("## ����ȭ��");
    	System.out.println("1 - �ֹ����");
    	System.out.println("2 - �����ϱ�");
    	System.out.println("3 - ���α׷� ����");
    	System.out.println();
    }

    public static void printMenus(final List<Menu> menus) {
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }
    
    private static void printTopLine(final int count) {
        for (int index = 0; index < count; index++) {
        	System.out.print(TOP_LINE);
        }
        System.out.println();
    }
    
    private static void printBottomLine(final List<Table> tables) {
    	for (final Table table : tables) {
    		if(table.isOrdered()) {
    			System.out.printf(BOTTOM_LINE, "*");
    			//System.out.println();
    			//return;
    		}
    		if(!table.isOrdered())
            System.out.printf(BOTTOM_LINE, "-");
        }
        System.out.println();
    }
    
    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }
    
    public static void printReceipt(Table table) {
    	System.out.println("## �ֹ� ����");
    	System.out.println("�޴� ���� �ݾ�");
    	table.printReceipt();
    	System.out.println();
    }
    public static void printTotalPrice(Table table, int methodOfPayment) {
    	System.out.println("## ���� ������ �ݾ�");
    	System.out.println(table.getTotalPrice(methodOfPayment)+"��");
    	System.out.println();
    }
}
