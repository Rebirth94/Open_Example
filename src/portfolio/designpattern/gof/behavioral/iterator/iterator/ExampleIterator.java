package portfolio.designpattern.gof.behavioral.iterator.iterator;

public class ExampleIterator implements IExampleIterator {

	private final Object[] objs;
	private int index = 0;
	
	public ExampleIterator(Object[] objs) {
		this.objs = objs;
	}
	
	@Override
	public boolean hasNext() {
		return this.index < objs.length && objs[this.index] != null;
	}

	@Override
	public Object next() {
		this.index++;
		return objs[this.index-1];
	}

}
