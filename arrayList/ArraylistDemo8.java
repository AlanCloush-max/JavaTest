package arrayList;

import java.util.ArrayList;

public class ArraylistDemo8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("xiaomi", 1000);
        Phone p2 = new Phone("Appple", 8000);
        Phone p3 = new Phone("Hammer", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> list1 = GetPhoneInfo(list);
        for (int i = 0; i < list1.size(); i++) {
            Phone p = list1.get(i);
            System.out.println(p.getBrand()  + ", " + p.getPrice());
        }






    }

    public static ArrayList<Phone> GetPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
           Phone p = list.get(i);
           int price = p.getPrice();
           if(price < 3000){
               resultList.add(p);

           }
        }
        return resultList;
    }
}
