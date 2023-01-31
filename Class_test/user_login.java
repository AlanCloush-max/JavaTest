package Class_test;

import java.util.Scanner;

public class user_login {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Goods[] arr =new Goods[3];
        for (int i = 0; i < arr.length; i++) {
            Goods goods = new Goods();
            System.out.println("请输入车的品牌");
            String brand = sc.next();
            goods.setBrand(brand);
            System.out.println("请输入车的颜色");
            String color = sc.next();
            goods.setColor(color);
            System.out.println("请输入车的价格");
            double price = sc.nextDouble();
            goods.setPrice(price);
            //将每次创建出来的对象初始化后装进数组
            arr[i] = goods;





        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i].getBrand());

        }




    }
}
