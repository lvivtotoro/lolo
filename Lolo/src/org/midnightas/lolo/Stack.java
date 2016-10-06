package org.midnightas.lolo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack implements Iterable<Object> {

	private List<Object> list = new ArrayList<Object>();

	public <T> T pop(Class<T> t) {
		return pop(t, 0);
	}

	public <T> T pop(Class<T> t, int offset) {
		if (list.size() == 0) {
			String result = Lolo.stdin.get();
			if (t == Double.class)
				return t.cast(Double.parseDouble(result));
			else
				return t.cast(result);
		}
		return t.cast(list.remove(list.size() - 1 - offset));
	}

	public Object peek() {
		return peek(0);
	}

	public Object peek(int offset) {
		return list.get(list.size() - 1 - offset);
	}

	public void push(Object t) {
		list.add(t);
	}

	public void pushHolder(Object holder) {
		list.add(holder);
	}

	public Iterator<Object> iterator() {
		return list.iterator();
	}

	public String toString() {
		String s = "";
		for (Object o : list) {
			s = s + o;
		}
		return s;
	}

}
