package Chapter_02;

public class Phone {
    private String brand;
    private double price;

    public Phone(String brand, double price){
        this.brand = brand;
        this.price = price;

    }

    public Phone(){

    }


    //set


    public void call(){
        System.out.println("calling");

    }

    public void setPrice(double price){
        if( price >=1000 && price < 10000){
            this.price = price;
        }else{
            System.out.println("Error");
        }

    }

    public double getPrice(){
        return price;
    }
    public void setBrand(String b) {
        if (b == "HUAWEI") {
            System.out.println("ERROR!");
        } else {
            brand = b;
        }
    }

    // get
    public String getBrand(){
        return brand;
    }

}
