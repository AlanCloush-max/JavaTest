package Chapter_02;

public class Java02_Variable {
    public static void main(String[] args) {

        Phone p = new Phone();
        p.setBrand("HUAEI");
        String p1Name = p.getBrand();
        System.out.println(p1Name);
        p.setPrice(1055.0);
        double p1Price = p.getPrice();
        System.out.println(p1Price);




        // 调用方法
        p.call();
        p.getPrice();

        Phone p2 = new Phone();




    }
}
