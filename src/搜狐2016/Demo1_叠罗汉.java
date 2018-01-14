package หับü2016;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Demo1_ตþยÞบบ {

	static class Person {
		int height;
		int weight;

		public Person(int h, int w) {
			this.height = h;
			this.weight = w;
		}

		@Override
		public String toString() {
			return "Person [height=" + height + ", weight=" + weight + "]";
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person[] arr = new Person[n];
		for (int i = 0; i < arr.length; i++) {
			int weight = sc.nextInt();
			int height = sc.nextInt();
			Person p = new Person(height,weight);
			arr[i] = p;
		}
		
		System.out.println(Math.max(fun(arr), fun2(arr)));

	}

	
	
	private static int fun(Person[] arr) {
		if(arr.length <=1)
			return arr.length;
		
		Arrays.sort(arr, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.height == o2.height) {
					return o1.weight - o2.weight;
				} else {
					return o1.height - o2.height;
				}
			}
		});
		//System.out.println(Arrays.toString(arr));
		
		int [] temp = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i].height>=arr[i-1].height && arr[i].weight>=arr[i-1].weight){
				temp[i] = temp[i-1]+1;
			}else{
				for (int j = i-1; j >=0 ; j--) {
					temp[i] = 1;
					if(arr[j].weight<=arr[i].weight&&arr[j].height<=arr[i].height){
						temp[i] = temp[j]+1;
						break;
					}
				}
			}
		}
		
		//System.out.println(Arrays.toString(temp));
		int max = 0;
		for (int i = 0; i < temp.length; i++) {
			max = Math.max(max, temp[i]);
		}
		return max;
	}
	private static int fun2(Person[] arr) {
		if(arr.length <=1)
			return arr.length;
		
		Arrays.sort(arr, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.weight == o2.weight) {
					return o1.height - o2.height;
				} else {
					return o1.weight - o2.weight;
				}
			}
		});
		
		//System.out.println(Arrays.toString(arr));
		int [] temp = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i].height>=arr[i-1].height && arr[i].weight>=arr[i-1].weight){
				temp[i] = temp[i-1]+1;
			}else{
				for (int j = i-1; j >=0 ; j--) {
					temp[i] = 1;
					if(arr[j].weight<=arr[i].weight&&arr[j].height<=arr[i].height){
						temp[i] = temp[j]+1;
						break;
					}
				}
			}
		}
		//System.out.println(Arrays.toString(temp));

		int max = 0;
		for (int i = 0; i < temp.length; i++) {
			max = Math.max(max, temp[i]);
		}
		return max;
	}
}
