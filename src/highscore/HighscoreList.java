package highscore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HighscoreList extends ObservableList implements Iterable<Comparable> {

	private int maxSize;
	
	public HighscoreList(int maxSize) {
		this.maxSize = maxSize;
	}

	private List<Comparable> results = new ArrayList<Comparable>();

	@Override
	protected List getList() {
		return results;
	}
	
	@Override
	protected void addElement(int pos, Object element) {
		if (maxSize < 0 || pos < maxSize) {
			while (maxSize >= 0 && results.size() >= maxSize) {
				results.remove(results.size() - 1);
			}
			super.addElement(pos, element);
		}
	}

	public void addResult(Comparable result) {
		int pos = 0;
		while (pos < results.size() && result.compareTo(results.get(pos)) >= 0) {
			pos++;
		}
		addElement(pos, result);
	}

	public Iterator<Comparable> iterator() {
		return results.iterator();
	}
}
