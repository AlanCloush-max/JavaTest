package test2;

public class Girlfriendtest {
    public static void main(String[] args){
        //1. 创建一个容量为4的数组
        Girlfriend[] arr = new Girlfriend[4];

        //2. 将4个对象全部初始化出来
        Girlfriend gf1 = new Girlfriend("Alice", 18, "female",
                "tennis");
        Girlfriend gf2 = new Girlfriend("Olivia", 19, "female",
                "biking");
        Girlfriend gf3 = new Girlfriend("Charlotte", 20, "female",
                "hiking");
        Girlfriend gf4 = new Girlfriend("Sophia", 20, "female",
                "shopping");

        //3. 将4个对象装入数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //4. 计算4个女生的平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Girlfriend girlfriend = new Girlfriend();
            girlfriend = arr[i];
            sum += girlfriend.getAge();
        }
        int averageAge = sum / arr.length;
        System.out.println("平均年龄为" + averageAge);


        //5.将每个女生的年龄和平均年龄做比较
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge() < averageAge){
                System.out.println("低于平均年龄的女孩有");
                System.out.println(arr[i].getAge() + " " + arr[i].getGender() +
                        " " + arr[i].getName());
            }
        }

    }
}
