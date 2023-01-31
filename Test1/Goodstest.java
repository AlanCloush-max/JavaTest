package Test1;

public class Goodstest {
    public static void main(String[] args){
        //1.创建一个数组
        test3[] arr = new  test3[3];

        //2.创建三个商品对象
        test3 t1 = new test3("001", "huawei", 1000.0, 100);
        test3 t2 = new test3("002", "apple", 2000.0, 500);
        test3 t3 = new test3("003", "gouqi", 3000.0, 300);

        //3.把商品添加到数组中
        arr[0] = t1;
        arr[1] = t2;
        arr[2] = t3;

        //4.遍历数组
        for (int i = 0; i < arr.length; i++) {
            test3 goods = arr[i];
            System.out.println(goods.getId() + ", " + goods.getName() + ", " +
                    goods.getCount());
        }


    }
}
