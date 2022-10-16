import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Number3 {
    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        //Вводится сдвиг...
        int n = inp.nextInt();
        //Вводится размер массива...
        int length = inp.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < length; i++){
            mas.add(inp.nextInt());
        }

        System.out.println(shift(mas, n));
    }

    public static ArrayList<Integer> shift(ArrayList<Integer> mas, int n){
        String res1 = "";
        String res2 = "";
        int cnt = 0;
        if(n >= 0) {
            while (cnt != mas.toArray().length - n) {
                res1 += Integer.toString(mas.get(cnt));
                cnt += 1;
            }
        }else{
            while (cnt != abs(n)) {
                res1 += Integer.toString(mas.get(cnt));
                cnt += 1;
            }
        }
        while (cnt != mas.size()) {
            res2 += Integer.toString(mas.get(cnt));
            cnt += 1;
        }

        String res3 = res2 + res1;

        mas.clear();

        for (int j = 0; j < res3.length(); j++){
            char k = res3.charAt(j);
            int k1 =(int)k - 48;
            mas.add(k1);
        }

        return mas;
    }
}
