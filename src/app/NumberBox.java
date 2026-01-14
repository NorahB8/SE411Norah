package app;

public class NumberBox<T extends Number> {
	private T item;
	
	public NumberBox() {
		
	}
	
	public NumberBox(T item) {
		this.item=item;
	}
	
	public void setItem(T item) {
		this.item=item;
	}
	
	public T getItem() {
		return item;
	}
	
	public double addNum(NumberBox<? extends Number> item2) {
		return this.item.doubleValue() + item2.getItem().doubleValue();
	}
	
}
