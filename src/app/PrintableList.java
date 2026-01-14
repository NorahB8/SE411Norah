package app;
import java.util.*;

public class PrintableList<T> {
	private List<T> items;
	
	/*public PrintableLists() {
		this.items=new ArrayList<>();
	}*/
    @SafeVarargs
	public PrintableList(T... array) {
		this.items = new ArrayList<>(Arrays.asList(array));
		
	}
	
	public T get(int index) {
        return items.get(index);
    }
	
	public List<T> getList(){
		return items;
	}
	public void printAll() {
		System.out.print("Items: ");
		for(int i=0;i<items.size();i++) {
			System.out.print(items.get(i));
			if (i<items.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
