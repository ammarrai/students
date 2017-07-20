package xyz;

public class ObjectSwapper<E> {

	private final E first;
	private final E second;

	public ObjectSwapper(E first, E second) {
		this.first = second;
		this.second = first;
	}

	public E getFirst() {
		return first;
	}

	public E getSecond() {
		return second;
	}
}
