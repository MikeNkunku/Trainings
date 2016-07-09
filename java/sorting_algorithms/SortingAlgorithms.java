import java.util.ArrayList;
import java.util.Arrays;

public class SortingAlgorithms {
	private SortClass sc;
	private ArrayList al;

	public SortingAlgorithms(SortClass sc, ArrayList al) {
		this.sc = sc;
		this.al = al;
	}

	public SortingAlgorithms() {
		this(null, null);
	}

	public SortingAlgorithms(SortClass sc) {
		this(sc, null);
	}

	public SortingAlgorithms(ArrayList al) {
		this(null, al);
	}

	public SortClass getSortClass() {
		return this.sc;
	}

	public void setSortClass(SortClass sc) {
		this.sc = sc;
	}

	public ArrayList getList() {
		return this.al;
	}

	public void setList(ArrayList al) {
		this.al = al;
	}

	public void displayList() {
		this.sc.display(this.al);
	}

	public static void main(String[] args) {
		SortingAlgorithms sa = new SortingAlgorithms();
		MergeSort ms = new MergeSort();
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 3));

		sa.setSortClass(ms);
		sa.setList(al);

		sa.displayList();
	}
}