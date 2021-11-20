package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.HashMap;

public class LetterPhone {
    public static void main(String[] args) {
        String A = "23";
        System.out.println(letterCombinations(A));
    }
    public static ArrayList<String> letterCombinations(String A) {
        ArrayList<String> ans = new ArrayList<>();
        HashMap<Character,String> map = new HashMap<>();
        map.put('1',"1");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        map.put('0',"0");
         generate(map,A,0,ans);

        return ans;
    }


    public static void generate(HashMap<Character,String> map, String A, int i,ArrayList<String> ans) {
        String mapping;
        mapping = map.get(A.charAt(i));
        for(int k = 0; k < mapping.length();k++) {
//            ans.set(i);

        }
        //System.out.println(mapping);


    }
}
