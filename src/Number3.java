import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Number3 {
    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        //Вводится сдвиг...
        int n = inp.nextInt();
        //Вводится размер массива...
        int length = inp.nextInt();
        int[] mas = new int[length];

        for (int i = 0; i < length; i++){
            mas[i] = inp.nextInt();
        }

        System.out.println(Arrays.toString(shift(mas, n)));
    }

    public static int[] shift(int[] mas, int n){
        String res1 = "";
        String res2 = "";
        int cnt = 0;
        if(n >= 0) {
            while (cnt != mas.length - n) {
                res1 += Integer.toString(mas[cnt]);
                cnt += 1;
            }
        }else{
            while (cnt != abs(n)) {
                res1 += Integer.toString(mas[cnt]);
                cnt += 1;
            }
        }
        while (cnt != mas.length) {
            res2 += Integer.toString(mas[cnt]);
            cnt += 1;
        }

        String res3 = res2 + res1;

        for (int j = 0; j < res3.length(); j++){
            char k = res3.charAt(j);
            int k1 =(int)k - 48;
            mas[j] = k1;
        }

        return mas;
    }
}
