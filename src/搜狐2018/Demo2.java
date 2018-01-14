package หับü2018;

import java.util.LinkedList;


public class Demo2 {
	
	
		public static void main(String[] args) {
			System.out.println(fun("/a/./b/../../c/"));
		}
		public static String fun(String path) {
			if (path == null || path.length() == 0) {
			      return "/";
			    }

			    String[] stree = path.split("/");
			    LinkedList<String> list = new LinkedList<String>();
			    for (String str : stree) {
			      if (str.length() == 0 || ".".equals(str)) {
			        continue;
			      }
			      if ("..".equals(str)) {
			        list.pollLast();
			        continue;
			      }
			      list.addLast(str);
			    }
			    String result = "";
			    while (list.size() > 0) {
			      result += "/" + list.pollFirst();
			    }
			    return result.length() > 0 ? result : "/";
		}
	}
