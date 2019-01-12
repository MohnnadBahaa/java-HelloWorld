import java.util.*;

public class MyClass {

    public void printMsg(String msg){

     System.out.println(msg);

    }

    public  void guessMyNumber(int x){

        double number = Math.floor(Math.random() * 10 + 1);

        System.out.println(number);
        System.out.println(x);


        if (number == x) {
            System.out.println("you gess a Number ");
        }
        else {
            System.out.println("you didnt gess a Number");
        }

    }

    public void repeatString(String str, int count) {
        String res = "";
        while (count > 0){
            res = res + str;
            count--;
        }
        System.out.println(res);
    }


//    public void acceptAndReverse(int[] array){
//        int[] myIntArray = new int[array.length];
//
//        for (int i = array.length; i < 0 ; i--) {
//            myIntArray[i]= array[i];
//        }
//        System.out.println(myIntArray);
//
//    }
}
