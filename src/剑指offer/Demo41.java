package ½£Ö¸offer;

import java.util.ArrayList;

public class Demo41 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Demo41 d = new Demo41();
		d.FindNumbersWithSum(arr, 6);
	}
	
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        fun(array,list,0,array.length-1,sum);
        
        System.out.println(list.toString());
        
        return list;
    }

	private void fun(int[] array, ArrayList<Integer> list, int i, int j,int target) {
		if(i>j)
			return ;
		
		while(i<j){
			if(array[i]+array[j]>target){j--;}
			else if(array[j]+array[i]<target){i++;}
			else{
				list.add(array[i]);
				list.add(array[j]);
				return;
			}
		}
		
	}
}
