package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
        System.out.println("## �ֹ��� ���̺��� �����ϼ���");
        return scanner.nextInt();
    }
}
