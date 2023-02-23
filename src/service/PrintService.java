package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintService<T> {
	
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		
		return list.get(0);
	}
	
	public void print() {
		System.out.println("[" + list.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]");
	}
	
}
