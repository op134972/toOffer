package Å£¿Í;

import java.util.*;

public class Main{
    
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> list = fun1(str);
        Collections.sort(list);
        for (String string : list) {
			System.out.println(string);
		}
        
    }
    private static ArrayList<String> fun1(String str){
        ArrayList<String> list = new ArrayList<>();
        char[] arr = str.toCharArray();
        all(list,arr,0);
        
        return list;
    }
    
    private static void all(ArrayList<String> list, char[] arr,int k){
        if(k == arr.length-1){
            list.add(new String(arr));
        }
        
        for(int i = k;i<arr.length;i++){
            swap(arr,i,k);
            all(list,arr,k+1);
            swap(arr,i,k);
        }
    }
    
    private static void swap(char[] arr,int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
   
}
