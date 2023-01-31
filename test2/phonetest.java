package test2;

public class phonetest {
    public static void main(String[] args){
        //1. 创建一个新的容量为3的数组
        Phone[] arr = new Phone[3];

        //2. 初始化3个对象
        Phone p1 = new Phone("xiaomi", 1000, "red");
        Phone p2 = new Phone("apple", 5000, "white");
        Phone p3 = new Phone("huawei", 4000, "blue");

        //3. 将3个对象装到数组里面
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //4. 获取3个手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        double ap = sum * 1.0 / arr.length;

        System.out.println("the average price is " + ap);








    }

}
