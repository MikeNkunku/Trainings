import java.util.ArrayList;

interface ISortingAlgorithm {
	ArrayList<Double> sort(ArrayList<Double> al);
}

public abstract class SortClass implements ISortingAlgorithm {
	public void display(ArrayList<Double> al) {
		System.out.println(al);
	}
}