package Test3;

public class Test {
    public static void main(String[] args) {

        //1. 创建一个长度为3的，类型为Student的数组
        Student[] arr = new Student[3];

        //2. 初始化学生对象并添加到数组当中
        Student stu1 = new Student(11, "Alan", 21);
        Student stu2 = new Student(12, "Bob", 22);
        Student stu3 = new Student(13, "Charlie", 22);

        //3. 将3个对象装入数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //4. 要求1， 再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        //这里就有两种情况，还能添加以及不能添加
        //不能添加的话我们就要新创建一个更大的数组并拷贝旧的数组
        Student stu4 = new Student(14, "Kyle", 20);

        //5. 先用flag判断重复
        boolean flag = contains(arr, stu4.getNumber());
        Student[] arr2 = new Student[4];
        if (flag) {

        } else {

            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr2[3] = stu4;
        }

        //6. 可以通过if语句来分别两种情况遍历
//        if (flag) {
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i].getName());
//
//            }
//
//        } else {
//            for (int i = 0; i < arr2.length; i++) {
//                System.out.println(arr2[i].getName());
//            }
//        }

        //7.首先判断是否存在,然后进行删除

        int index = getIndex(arr, 14);
        Student[] arr1 = delete(arr,index);
        printarr(arr);

        search(arr2,11);
        printarr(arr2);


        if(index != -1){
            System.out.println(index);
        }else{
            System.out.println("-1");
        }



    }


    public static boolean contains(Student[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            int snumber = stu.getNumber();
            if (snumber == number) {
                return true;
            }
        }
        return false;

    }

    public static Student[] remove(Student[] arr, int number) {
        Student[] arr1 = new Student[arr.length];
        int flag1 = 0;
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            int snumber = stu.getNumber();
            if (snumber == number) {
                flag1 = 1;
                break;
            }
            arr1[i] = arr[i];
        }
        if (flag1 == 0) {
            System.out.println("删除失败");
        }
        return arr1;
    }



    public static void printarr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.println(arr[i].getName() + " " + arr[i].getAge());
            }
        }
    }

    public static void search(Student[] arr, int number){
        int flag2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getNumber() == number){
                arr[i].setAge(arr[i].getAge()+1);
                flag2 = 1;
            }
        }
        if(flag2 == 1){
            System.out.println("查询成功并修改");
        }else{
            System.out.println("查询失败");
        }

    }

    public static int getIndex(Student[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                int snumber = stu.getNumber();
                if(snumber == number){
                    return i;
                }
            }
        }
        return -1;
    }

    public static Student[] delete(Student[] arr, int index){
        if(index >= 0){
            arr[index] = null;
        }else{
            System.out.println("删除失败");
        }
        return arr;

    }
}  
