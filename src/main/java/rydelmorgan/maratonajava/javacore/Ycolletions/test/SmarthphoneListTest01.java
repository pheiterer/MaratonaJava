package rydelmorgan.maratonajava.javacore.Ycolletions.test;

import rydelmorgan.maratonajava.javacore.Ycolletions.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmarthphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1abc1", "iphone");
        Smartphone s2 = new Smartphone("45545", "samsung");
        Smartphone s3 = new Smartphone("33333", "aple");
        List<Smartphone> smartphoneList = new ArrayList<>(6);
        smartphoneList.add(s1);
        smartphoneList.add(s2);
        smartphoneList.add(s3);


        for (Smartphone smartphone: smartphoneList){
            System.out.println(smartphone.toString());
        }
        Smartphone s4 = new Smartphone("45545", "samsung");
        smartphoneList.add(0,s4);

        System.out.println(smartphoneList.contains(s4));
        int indexS4 = smartphoneList.indexOf(s4);
        System.out.println(smartphoneList.get(indexS4));

    }

}
