import java.util.ArrayList;

public class SelectionSort extends SortClass {
	public ArrayList<Double> sort(ArrayList<Double> al) {
		int idx = 0;

		for (int i = 0; i < al.size(); i++) {
			idx = 1;
			for (int j = i+1; j < al.size(); j++) {
				if (al.get(j) < al.get(idx)) {
					idx = j;
				}
			}

			Double temp = al.get(idx);
			al.set(idx, al.get(i));
			al.set(i, temp);
		}

		return al;
	}
}