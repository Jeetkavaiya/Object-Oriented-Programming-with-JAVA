package OOPs.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Jk = new Human(19,"Jeet");
//        Human twin = new Human(Jk);

        Human  twin = (Human)Jk.clone();
        System.out.println(twin.age +  " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(Jk.arr));
    }
}
