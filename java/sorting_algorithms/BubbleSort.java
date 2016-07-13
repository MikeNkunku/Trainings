import java.util.ArrayList;

public class BubbleSort extends SortClass {
	public ArrayList<Double> sort(ArrayList<Double> al) {
		boolean exch = true;

		while (exch) {
			exch = false;

			for (int i = 1; i < al.size(); i++) {
				if (Double.compare(al.get(i), al.get(i-1)) < 0) {
					exch = true;
					Double temp = al.get(i);
					al.set(i, al.get(i-1));
					al.set(i-1, temp);
				}
			}
		}

		return al;
	}
}