import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Collections;

import java.util.Scanner;

public class SortingAlgorithms {
	private SortClass sc;
	private ArrayList al;
	private final LinkedHashMap<String, Integer> options = new LinkedHashMap<String, Integer>() {{
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

	public LinkedHashMap<String, Integer> getOptions() {
		return this.options;
	}

	public void displayList() {
		this.sc.display(this.al);
	}

	public void displayMenu() {
		LinkedHashMap<String, Integer> ht = this.getOptions();

		for(String key: ht.keySet()) {
			System.out.println(ht.get(key) + " - " + key);
		}
	}

	public int getUserChoice() {
		int userChoice = 0;
		Scanner in = new Scanner(System.in);

		while((userChoice < Collections.min(this.getOptions().values())) || (userChoice > Collections.max(this.getOptions().values()))) {
			this.displayMenu();
			userChoice = in.nextInt();
		}

		return userChoice;
	}

	public static void main(String[] args) {
		SortingAlgorithms sa = new SortingAlgorithms();
		MergeSort ms = new MergeSort();
		// ArrayList<int> al = new ArrayList<int>(Arrays.asList(1, 3));
		int userChoice = 0;

		while (userChoice != sa.getOptions().get("Exit")) {
			userChoice = sa.getUserChoice();
		}
	}
}