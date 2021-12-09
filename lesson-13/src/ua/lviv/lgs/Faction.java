package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Faction {

	private String name;

	Faction(String name) {
		this.name = name;
	}

	Scanner sc = new Scanner(System.in);

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	List<Deputy> dep = new <Deputy>ArrayList();

	ListIterator<Deputy> depiterator = dep.listIterator();

	public void addDeputy() {
		System.out.println("Вкажіть по черзі(Кожні дані вводити з нового рядка):\n Вагу(int), Висоту(int), імя, "
				+ "Прізвище, вік, чи Хабарник(boolean)");
		dep.add(new Deputy(sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean()));
		System.out.println(dep);
	}

	@SuppressWarnings("rawtypes")
	public void removeDeputy() {
		Iterator depIter = dep.iterator();
		int count = 0;
		while (depIter.hasNext()) {
			System.out.println("Індекс: " + count + depIter.next().toString());
			System.out.println("Вкажіть індекс для видалення");
			count++;
		}
		int a = sc.nextInt();
		if (depIter.equals(a)) {
			dep.remove(a);
		}

	}

	public void allBribeTakers() {
		for (Deputy d : dep) {
			if (d.isBribeTaker() == true) {
				System.out.println(d.toString());
			}
		}
	}

	public void biggestBribe() {
		int size = 0;
		@SuppressWarnings("unused")
		Iterator<Deputy> iterator = dep.iterator();
		for (Deputy d : dep) {

			if (d.getBribeSize() > size) {
				d.setBribeSize(size);
				System.out.println(d.toString());
			}

			if (size != 0) {
				System.out.println("Найбільші хабарники: ");
				for (Deputy d2 : dep) {
					if (d2.getBribeSize() == size) {
						System.out.println(d2.toString());
					}
				}
			}

			else {
				System.out.println("У фрації немає хабарників");
			}
		}

	}

	public void allDeputies() {
		for (Deputy d : dep) {
			System.out.println(d.toString());
		}
	}

	public void clearDeputies() {
		dep.clear();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
