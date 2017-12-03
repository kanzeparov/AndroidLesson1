package example.examplejava.Java;

/**
 * Created by Franck on 01.12.2017.
 */

public class Примитивы {
    int myNumber = 5;
    double d = 4.5;
    float f = 4.5f;
    char c = 'g';
    String s2 = "Who who who who!";
    boolean b = false;

    public static void main(String[] args) {
        String s1 = "Who who who who!";

        String a = new String("Wow");
        String b = new String("Wow");
        String sameA = a;

        boolean r1 = a == b;      // Ложь, так как a и b не один и тот же объект
        boolean r2 = a.equals(b); // Истина, так как a и b логически равны
        boolean r3 = a == sameA;  // Истина, так как a и sameA действительно один и тот же объект
        int ab = 4;
        int result = ab == 4 ? 1 : 8; // result будет равен 1

        // Или обычная форма записи:
        int result1;
        if (ab == 4) {
            result1 = 1;
        } else {
            result1 = 8;
        }
        System.out.println(s1);



        int[] arr = new int[5];
        arr[4] = 4;


        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            System.out.println(el);
        }

        int[] arr1 = {2, 0, 1, 3};
        for (int el : arr1) {
            System.out.println(el);
        }

        boolean condition = true;
        do {

        } while(condition);

    }

}
