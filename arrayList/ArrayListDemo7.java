package arrayList;

import java.util.ArrayList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        User u1 = new User(1,"alan", "123456");
        User u2 = new User(2,"bob", "888888");
        User u3 = new User(3,"Charlie", "666666");
        ArrayList<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        int result = searchUser(3, list);
        System.out.println(result);


    }

    public static int searchUser(int id, ArrayList<User> list){
        int flag = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                flag = 1;
                count = i;

            }

        }
        if(flag == 0){
            return -1;
        } else {
            return count;
        }


    }
}
