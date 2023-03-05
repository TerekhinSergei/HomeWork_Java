import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class program6hw {
    
    public static void main(String[] args) {
        int count = 0;
        
        Notebook itemtop1 = new Notebook("CHUWI Corebook X", 8, 256, 14.4, "Windows 10", "серебристый", 35000);
        Notebook itemtop2 = new Notebook("HIPER EXPERTBOOK", 16, 1024, 15.6, "Windows 11", "черный", 95000);
        Notebook itemtop3 = new Notebook("Honor MagicBook", 16, 512, 15.4, "без ОС", "серый", 46000);
        Notebook itemtop4 = new Notebook("Huawei MateBook", 16, 256, 15.0, "Windows 10", "серый", 72000);
        Notebook itemtop5 = new Notebook("Honor MagicBook", 8, 512, 15.6,"Ubunta", "черный", 54000);
        Notebook itemtop6 = new Notebook("MSI GF63 Thin", 32, 1024, 15.6, "без ОС", "черный", 89000);
        Notebook itemtop7 = new Notebook("MSI FJ46", 16, 512, 15.6, "Windows 11", "черный", 99000);
        Notebook itemtop8 = new Notebook("Xiomi RedmiBook", 8, 256, 15.4, "Windows 11", "серый", 52000);

        Set<Notebook> unicalitemtop = new HashSet<Notebook>();
        unicalitemtop.add(itemtop1);
        unicalitemtop.add(itemtop2);
        unicalitemtop.add(itemtop3);
        unicalitemtop.add(itemtop4);
        unicalitemtop.add(itemtop5);
        unicalitemtop.add(itemtop6);
        unicalitemtop.add(itemtop7);
        unicalitemtop.add(itemtop8);        

        Map<Integer, String> mapCharact = new HashMap<>();
        mapCharact.put(1, "объем оперативной памяти");
        mapCharact.put(2, "объем накопителя");
        mapCharact.put(3, "ОС");
        mapCharact.put(4, "цвет");
        mapCharact.put(5, "диагональ");
        mapCharact.put(6, "цена");

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики (если характеристика не важна введите 0):");
        System.out.print("объем оперативной памяти > ");
        int ramFind = scaner.nextInt();
        System.out.print("объем накопителя > ");
        int ssdFind = scaner.nextInt();        
        System.out.print("диагональ > ");
        double diagFind = scaner.nextDouble();
        System.out.print("максимальная цена или введите 111111 > ");
        double priceFind = scaner.nextInt();
        System.out.println();
        scaner.close();

        for(Notebook item: unicalitemtop) {
            if ((item.getRam() >= ramFind) && (item.getSsd() >= ssdFind)  && item.getDiagonal() >= diagFind && (item.getPrice() <= priceFind)) {
                System.out.println(item.toString());
                count ++;
            }
        }
        
        if (count == 0){
            System.out.println("совпадений не найдено, попобуйте изменить параметры поиска.");
        }else{
            System.out.println("[найдено " + count + " совпадений]" );
        }
    }
}