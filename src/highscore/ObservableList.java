package highscore;

import java.util.ArrayList;
import java.util.List;

public abstract class ObservableList {
	
	private List<ListListener> listListeners = new ArrayList<ListListener>();

	public void addListListener(ListListener listListener) {
		if (! listListeners.contains(listListener)) {
			listListeners.add(listListener);
		}
	}

	public void removeListListener(ListListener listListener) {
		listListeners.remove(listListener);
	}
	
	protected abstract List getList();

	public int size() {
		return getList().size();
	}
	
	protected void setElement(int pos, Object element) {
		getList().set(pos, element);
		fireListChanged(pos, pos);
	}
	protected void addElement(Object element) {
		addElement(getList().size(), element);
	}
	protected void addElement(int pos, Object element) {
		getList().add(pos, element);
		fireListChanged(pos, getList().size() - 1);
	}
	protected void removeElement(Object element) {
		removeElement(getList().indexOf(element));
	}
	protected void removeElement(int pos) {
		if (pos >= 0 && pos < getList().size()) {
			getList().remove(pos);
			fireListChanged(pos, getList().size());
		}
	}
	
	protected void fireListChanged(int start, int end) {
		for (ListListener listListener : listListeners) {
			listListener.listChanged(this, start, end);
		}
	}
}
