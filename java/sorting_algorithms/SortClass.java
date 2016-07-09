import java.util.ArrayList;

interface ISortingAlgorithm {
	ArrayList sort(ArrayList al);
}

public abstract class SortClass implements ISortingAlgorithm {
	public void display(ArrayList al) {
		System.out.println(al);
	}
}