package ua.lviv.lgs;

public class Application {
public static void main(String[] args) {
	boolean bl=true;
	byte bt=2;
	short sh=8;
	int i=10;
	long l=15;
	float f=3.15f;
	double d=5.17;
	char c='d';
	
	System.out.println(Boolean.TRUE);
	System.out.println(Boolean.FALSE);
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Short.MAX_VALUE);
	System.out.println(Short.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Long.MAX_VALUE);
	System.out.println(Long.MIN_VALUE);
	System.out.println(Float.MAX_VALUE);
	System.out.println(Float.MIN_VALUE);
	System.out.println(Double.MAX_VALUE);
	System.out.println(Double.MIN_VALUE);
	System.out.println(Character.MAX_VALUE);
	System.out.println(Character.MIN_VALUE);	
	
	int a[] = {7,5,12,95,35,41,25,79,18,64};
	int min_a=a[0],max_a=a[0];
	for (int j=1; j<10; j++) {
		min_a=(min_a>a[j]) ? a[j]:min_a;
		max_a=(max_a<a[j]) ? a[j]:max_a;
	}
	System.out.println("Мінімальне значення: "+min_a);
	System.out.println("Максимальне значення: "+max_a);
	
}
}
