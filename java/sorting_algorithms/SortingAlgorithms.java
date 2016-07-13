import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Collections;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SortingAlgorithms {
	private SortClass sc;
	private ArrayList<Double> al;
	private final Scanner in = new Scanner(System.in);
	private final LinkedHashMap<String, Integer> options = new LinkedHashMap<String, Integer>() {{
		put("Put list", 1);
		put("Display list", 2);
		put("Put sorting method", 3);
		put("Sort list", 4);
		put("Exit", 5);
	}};

	public SortingAlgorithms(SortClass sc, ArrayList<Double> al) {
		this.sc = sc;
		this.al = al;
	}

	public SortingAlgorithms() {
		this(null, null);
	}

	public SortingAlgorithms(SortClass sc) {
		this(sc, null);
	}

	public SortingAlgorithms(ArrayList<Double> al) {
		this(null, al);
	}

	public SortClass getSortClass() {
		return this.sc;
	}

	public void setSortClass(SortClass sc) {
		this.sc = sc;
	}

	public ArrayList<Double> getList() {
		return this.al;
	}

	public void setList(ArrayList<Double> al) {
		this.al = al;
	}

	public LinkedHashMap<String, Integer> getOptions() {
		return this.options;
	}

	public Scanner getScanner() {
		return this.in;
	}

	public void displayList() {
		System.out.println(this.getList());
	}

	public void displayMenu() {
		LinkedHashMap<String, Integer> ht = this.getOptions();

		System.out.println();
		for(String key: ht.keySet()) {
			System.out.println(ht.get(key) + " - " + key);
		}
	}

	public int getUserChoice() {
		int userChoice = 0;

		while((userChoice < Collections.min(this.getOptions().values())) || (userChoice > Collections.max(this.getOptions().values()))) {
			this.displayMenu();
			userChoice = this.getScanner().nextInt();
		}

		return userChoice;
	}

	public void printStars(int nbStars) {
		for (int i = 0; i < nbStars; i++) {
			System.out.print('*');
		}
	}

	public void printTitle() {
		int nbStars = 15;

		this.printStars(nbStars);
		System.out.print(" Welcome to SortingAlgorithms! ");
		this.printStars(nbStars);
		System.out.println('\n');
	}

	public void putList() {
		this.setList(new ArrayList<Double>());

		System.out.print("Enter your elements: ");
		while (this.getScanner().hasNextDouble()) {
			this.getList().add(this.getScanner().nextDouble());
		}
		this.getScanner().next();
	}

	public void putSortClass() {
		this.setSortClass(new BubbleSort());
	}

	public void sortList() {
		if (this.getSortClass() == null) {
			System.out.println("A SortClass must be defined first!");
		} else {
			this.setList(this.getSortClass().sort(this.getList()));
		}
	}

	public void quit() {
		System.out.println();
		this.printStars(15);
		System.out.print(" See ya ");
		this.printStars(15);
		System.out.println();
	}

	public static void main(String[] args) {
		SortingAlgorithms sa = new SortingAlgorithms();
		MergeSort ms = new MergeSort();
		HashMap<Integer, Runnable> commands = new HashMap<Integer, Runnable>() {{
			put(1, () -> sa.putList());
			put(2, () -> sa.displayList());
			put(3, () -> sa.putSortClass());
			put(4, () -> sa.sortList());
			put(5, () -> sa.quit());
		}};
		int userChoice = 0;

		sa.printTitle();
		while (userChoice != sa.getOptions().get("Exit")) {
			userChoice = sa.getUserChoice();
			commands.get(userChoice).run();
		}
	}
}