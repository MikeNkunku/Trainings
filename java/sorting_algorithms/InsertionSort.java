import java.util.ArrayList;

public class InsertionSort extends SortClass {
	public ArrayList<Double> sort(ArrayList<Double> al) {
		int idx;
		Double val;

		for (int i = 1; i < al.size(); i++) {
			idx = i;
			val = al.get(i);

			while ((idx > 0) && (al.get(idx - 1) > val)) {
				al.set(idx, al.get(idx - 1));
				idx -= 1;
			}

			al.set(idx, val);
		}

		return al;
	}
}