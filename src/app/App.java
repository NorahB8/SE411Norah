package app;
import java.util.*;


public class App {
	public static void main(String[] args) {
		PrintableList<String> stringList = new PrintableList<>("Norah","Alothman","SE411");
		stringList.printAll();
		PrintableList<Integer> intList = new PrintableList<>(1,3,4,8);
		intList.printAll();

		NumberBox<Integer> intBox1 = new NumberBox<>();
		intBox1.setItem(8);
		System.out.println("int number is "+intBox1.getItem());
		NumberBox<Integer> intBox2 = new NumberBox<>();
		intBox2.setItem(3);
		System.out.println("int num 2 is "+intBox2.getItem());
		double intsum= intBox1.addNum(intBox2);
		System.out.println("int sum is "+intsum);
		
		NumberBox<Double> dBox1 = new NumberBox<>();
		dBox1.setItem(4.1);
		System.out.println("double num is "+ dBox1.getItem());
		NumberBox<Double> dBox2 = new NumberBox<>();
		dBox2.setItem(7.3);
		System.out.println("double num 2 is "+ dBox2.getItem());
		double dsum = dBox1.addNum(dBox2);
		System.out.println("double sum is "+dsum);
		
		
		System.out.println("wildcard");
		List<String> sList= new ArrayList<>();
		sList.add("hello");
		sList.add("hi");
		
		printList(sList);
		
		List<Integer> iList =new ArrayList<>();
		iList.add(1);
		iList.add(7);
		iList.add(99);
		printList(iList);
		
		double sum1= sumNum(iList);
		System.out.println("sum of integer list: "+sum1);
		
	}
	public static void printList(List<?> list) {
		System.out.println("List contains: ");
		for(Object item:list) {
			System.out.println(item);
		}
		
	}
	public static double sumNum(List<? extends Number> list) {
		double sum=0.0;
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		return sum;
	}
}
