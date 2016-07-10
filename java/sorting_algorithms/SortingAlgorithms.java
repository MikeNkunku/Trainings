import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class SortingAlgorithms {
	private SortClass sc;
	private ArrayList al;
	private final LinkedHashMap<String, int> options = new LinkedHashMap<String, int>() {{
		put("Put list", 1);
		put("Display list", 2);
		put("Exit", 3);
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

	public LinkedHashMap<String, int> getOptions() {
		return this.options;
	}

	public void displayList() {
		this.sc.display(this.al);
	}

	public void displayMenu() {
		LinkedHashMap<String, int> ht = this.getOptions();

		for(int key: ht.keySet()) {
			System.out.println(ht.get(key) + " - " + key);
		}
	}

	// public int getUserChoice() {
	// 	int userChoice = null;


	// }

	public static void main(String[] args) {
		SortingAlgorithms sa = new SortingAlgorithms();
		MergeSort ms = new MergeSort();
		ArrayList<int> al = new ArrayList<int>(Arrays.asList(1, 3));

		sa.displayMenu();
	}
}