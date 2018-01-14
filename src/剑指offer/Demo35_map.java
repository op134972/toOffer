package ½£Ö¸offer;

public class Demo35_map {
	
	public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar(",,llo"));
	}

		public static int FirstNotRepeatingChar(String str) {
		
			char[] charArray = str.toCharArray();
			int[] map = new int[65536];//char2×Ö½Ú 
			for (int i = 0; i < charArray.length; i++) {
				map[charArray[i]]++;
			}
			for (int i = 0; i < charArray.length; i++) {
				if(map[charArray[i]] == 1)
					return i;
			}
			
			return  -1;
		}
}
