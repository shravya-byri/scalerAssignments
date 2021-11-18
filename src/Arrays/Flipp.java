package Arrays;

import java.util.ArrayList;

public class Flipp {
    public static void main(String[] args) {
        String S = "010001000001";
        System.out.println(solve(S));
    }

    public static ArrayList<Integer> solve(String S) {
        ArrayList<Integer> res = new ArrayList<>();
        int k = 0;
        int ans = 0;
        char[] ch = S.toCharArray();
        int[] kd = new int[S.length()];
         int prev = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1'){
                kd[i] = -1;
            } else kd[i] = 1;
        }
        for(int i = 0; i < ch.length; i++) {
            if(kd[0] == -1) kd[0] = 0;
            else if (kd[i]+prev < 0) {
                kd[i] = 0;
                prev = 0;
            } else{
                kd[i] = kd[i] + prev;
                prev = kd[i];
            }

        }
        int end = 0;
        int start = 0;
        for(int i = 0; i < ch.length; i++) {
            if(kd[i] > ans) {
                ans = kd[i];
                 end = i;
            }
        }
        if(ans == 0) return res;
        else if(end == 0){
            res.add(end+1);
            res.add(end+1);
            return res;
        } else {
            int end1 = end;
            if(end == 1 && kd[0] != 0) start = 0;
            else {
                for(int i = 0; i < ch.length; i++){
                    if(kd[0] > 0) {
                        start = 0;
                        break;
                    }
                    if(kd[i] == 0 && kd[i+1] != 0) {
                        start = i+1;
                        break;
                    }
                }

            }

            res.add(start+1);
            res.add(end1+1);
            return res;

        }

    }

}