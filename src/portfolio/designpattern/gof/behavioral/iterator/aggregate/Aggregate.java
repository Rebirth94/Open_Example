package portfolio.designpattern.gof.behavioral.iterator.aggregate;

import portfolio.designpattern.gof.behavioral.iterator.iterator.IExampleIterator;

public interface Aggregate {
	IExampleIterator iterator();
}
