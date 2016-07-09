import java.util.ArrayList;
import java.util.Arrays;

public class SortingAlgorithms {
	private SortClass sc;

	public SortingAlgorithms() {
		this.setSortClass(null);
	}

	public SortClass getSortClass() {
		return this.sc;
	}

	public void setSortClass(SortClass sc) {
		this.sc = sc;
	}

	public static void main(String[] args) {
		SortingAlgorithms sa = new SortingAlgorithms();
		MergeSort ms = new MergeSort();
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2));

		ms.display(al);
		// sa.setSortClass(ms);
	}
}