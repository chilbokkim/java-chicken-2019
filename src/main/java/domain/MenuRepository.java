package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuRepository {
    private static final List<Menu> menus = new ArrayList<>();

    static {
        menus.add(new Menu(1, "�Ķ��̵�", Category.CHICKEN, 16_000));
        menus.add(new Menu(2, "���ġŲ", Category.CHICKEN, 16_000));
        menus.add(new Menu(3, "�ݹ�ġŲ", Category.CHICKEN, 16_000));
        menus.add(new Menu(4, "�뱸��", Category.CHICKEN, 16_000));
        menus.add(new Menu(5, "����ġŲ", Category.CHICKEN, 17_000));
        menus.add(new Menu(6, "����ġŲ", Category.CHICKEN, 17_000));
        menus.add(new Menu(21, "�ݶ�", Category.BEVERAGE, 1_000));
        menus.add(new Menu(22, "���̴�", Category.BEVERAGE, 1_000));
    }

    public static List<Menu> menus() {
        return Collections.unmodifiableList(menus);
    }
    public static String getMenuNameByIndex(int index) {
    	String name = "";
    	for(int i = 0;i<menus.size();i++) {
    		if(menus.get(i).getNumber()==index) {
    			name = menus.get(i).getName();
    		}
    	}
    	return name;
    }
    public static int getMenuPriceByIndex(int index) {
    	int price = 0;
    	for(int i = 0;i<menus.size();i++) {
    		if(menus.get(i).getNumber()==index) {
    			price = menus.get(i).getPrice();
    		}
    	}
    	return price;
    }
}
