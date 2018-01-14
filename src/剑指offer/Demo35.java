package ½£Ö¸offer;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo35 {

	public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("hhhbbbccc"));
	}
	
	
	public static int FirstNotRepeatingChar(String str) {
        if(str.length() == 0)
            return -1;
        
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        
        char[] charArr = str.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
			if(map.containsKey(charArr[i])){
				map.put(charArr[i], (map.get(charArr[i])+1));
			}else{
				map.put(charArr[i], 1);
			}
		}
        
        Set<Entry<Character,Integer>> entrySet = map.entrySet();
        for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue() == 1)
				return str.indexOf(entry.getKey());
		}
        return -1;
    }
}
