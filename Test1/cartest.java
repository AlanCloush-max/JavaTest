package Test1;

import java.util.Scanner;

public class cartest {
    public static void main(String[] args){
        //1. 创建一个数组
        Car[] arr = new Car[3];


        //2.
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //
            Car c = new Car();
            System.out.println("请输入汽车地品牌");
            String brand = sc.next();
            c.setBrand(brand);

            System.out.println("请输入价格");
            int price =sc.nextInt();
            c.setPrice(price);

            System.out.println("请输入颜色");
            String color = sc.next();
            c.setColor(color);

            //把汽车对象添加到数组里面

            arr[i] = c;


        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + ", " + car.getPrice() + ", " +
                    car.getColor());
        }

    }
}
