package Arrays;

import java.util.ArrayList;

public class Flip {
    public static void main(String[] args) {
        String str = "010011";
        System.out.println(flip(str));
    }
    public static ArrayList<Integer> flip(String str) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max=0;
        int s_min=0;
        int e_min=0;
        int sum=0;
        int s=0,e;
        for(int i = 0; i <str.length();i++){
            e = i;
            if(str.charAt(i) == '0'){
                sum+=1;
            }else{
                sum-=1;
            }
            if(sum < 0){
                sum = 0;
                s = i+1;
            }
            if(max < sum){
                max = sum;
                s_min = s;
                e_min = e;
            }
        }
        if(max!=0){
            ans.add(s_min+1);
            ans.add(e_min+1);
        }
        return ans;
    }
}