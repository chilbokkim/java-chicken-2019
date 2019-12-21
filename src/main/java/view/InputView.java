package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
    	// ���������� ���̺� ��ȣ���� �Է¹޵��� ����
        System.out.println("## ���̺��� �����ϼ���");
        return scanner.nextInt();
    }
    
    public static int inputCommandList() {
    	/* 1 - �ֹ����
    	 * 2 - �����ϱ�
    	 * 3 - ���α׷� ����
    	 */
    	System.out.println("## ���ϴ� ����� �����ϼ���.");
    	return scanner.nextInt();
    }
    
    public static int inputMethodOfPayment(int tableNumber) {
    	/* 1 - �ſ�ī��
    	 * 2 - ����
    	 */
    	System.out.printf("## %s�� ���̺��� ������ �����մϴ�\n", tableNumber);
    	System.out.println("## �ſ�ī��� 1��, ������ 2��.");
    	return scanner.nextInt();
    }
    
    public static int inputMenuType() {
    	System.out.println("## ����� �޴��� �����ϼ���.");
    	return scanner.nextInt();
    }
    
    public static int inputMenuNumber() {
    	System.out.println("## �޴��� ������ �Է��ϼ���.");
    	return scanner.nextInt();
    }
}
