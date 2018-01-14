package test0914;

import java.math.BigDecimal;

public class D¶þÄ£ {
	public static void main(String[] args) {
		BigDecimal n = new BigDecimal("77777777777777777777777777777");
		BigDecimal b = new BigDecimal("7");
		BigDecimal[] divide = n.divideAndRemainder(b);
		System.out.println(divide[1].toString().equals("0"));
	}
}
