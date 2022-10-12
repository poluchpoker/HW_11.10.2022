import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Number3 {
    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        int n = inp.nextInt();
        int length = inp.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();

        for (int i = 0; i < length; i++){
            mas.add(inp.nextInt());
        }

        String a = shift(mas, n);

        for (int j = 0; j < a.length(); j++){
            char k = a.charAt(j);
            int k1 = (int)k - 48;
            mas.add(k1);
        }

        System.out.println(mas);
    }

    public static String shift(ArrayList<Integer> mas, int n){
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        int cnt = 0;
        if(n >= 0) {
            while (cnt != n) {
                res1.append(mas.get(cnt));
                cnt += 1;
            }
        }else{
            while (cnt != abs(n)) {
                res1.append(mas.get(cnt));
                cnt += 1;
            }
        }
        while (cnt != mas.size()) {
            res2.append(mas.get(cnt));
            cnt += 1;
        }
        
        String res3 = res2 + res1.toString();

        mas.clear();

        return res3;
    }
}
