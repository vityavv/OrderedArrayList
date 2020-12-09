public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	public OrderedArrayList() {
		super();
	}
	public OrderedArrayList(int startingCapacity) {
		super(startingCapacity);
	}
	public boolean add(T element) {
		for (int i = 0; i < size(); i++) {
			if (element.compareTo(get(i)) < 0) {
				super.add(i, element);
				// TODO
				return true;
			}
		}
		super.add(element);
		return true;
	}
	public void add(int index, T element) {
		add(element);
	}
	public T set(int index, T element) {
		T elAt = get(index);
		remove(index);
		add(element);
		return elAt;
	}
}
