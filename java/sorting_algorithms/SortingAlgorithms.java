import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class SortingAlgorithms {
	private SortClass sc;
	private ArrayList al;
	private final LinkedHashMap<int, String> options = new LinkedHashMap<int, String>() {{
		put(1, "Put list");
		put(2, "Display list");
		put(3, "Exit");
	}};

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

	public LinkedHashMap<int, String> getOptions() {
		return this.options;
	}

	public void displayList() {
		this.sc.display(this.al);
	}

	public void displayMenu() {
		LinkedHashMap<int, String> ht = this.getOptions();

		for(int key: ht.keySet()) {
			System.out.println(key + " - " + ht.get(key));
		}
	}

	public int 

	public static void main(String[] args) {
		SortingAlgorithms sa = new SortingAlgorithms();
		MergeSort ms = new MergeSort();
		ArrayList<int> al = new ArrayList<int>(Arrays.asList(1, 3));

		sa.displayMenu();
	}
}