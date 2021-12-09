package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VerhovnaRada {

	Scanner sc = new Scanner(System.in);

	@SuppressWarnings({ "rawtypes", "unchecked" })

	List<Faction> factions = new ArrayList();

	public void addFaction() {
		System.out.println("����� �������:");
		factions.add(new Faction(sc.next()));
		System.out.println("������� ������");
		System.out.println(factions);

	}

	public void removeFaction() {
		Iterator<Faction> iter = factions.iterator();
		int count = 0;
		while (iter.hasNext()) {
			System.out.println("�������: " + iter.next().toString() + ", ������ �������: " + count);
			count++;
		}
		int a;
		System.out.println("������ ������ ��� ���������");
		a = sc.nextInt();
		factions.remove(a);
		System.out.println(factions);
	}

	public void showAllFactions() {
		System.out.println(factions);
	}

	public void clearFaction() {
		Iterator<Faction> iter = factions.iterator();
		int count = 0;
		while (iter.hasNext()) {
			System.out.println("�������: " + iter.next().toString() + ", ������ �������: " + count);
			count++;
		}
		System.out.println("������ ������ ������� ��� �������");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		count = 0;
		int a = sc.nextInt();
		for (Faction f : factions) {
			if (count == a) {
				f.clearDeputies();
				System.out.println("������� �������");
			}
		}

	}

	public void showFaction() {
		Iterator<Faction> iter = factions.iterator();
		int count = 0;
		while (iter.hasNext()) {
			System.out.println("�������: " + iter.next().toString() + ", ������ �������: " + count);
			count++;
		}
		System.out.println("������ ������ ������� ��� ��������� ����������");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		count = 0;
		int a = sc.nextInt();
		for (Faction f : factions) {
			if (count == a) {
				f.allDeputies();
			}
		}

	}

	public void addDeputyToFraction() {
		Iterator<Faction> iter = factions.iterator();
		int count = 0;
		while (iter.hasNext()) {
			System.out.println("�������: " + iter.next().toString() + ", ������ �������: " + count);
			count++;
		}
		System.out.println("������ ������ ������� ��� ���������� ��������");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		count = 0;
		int a = sc.nextInt();
		for (Faction f : factions) {
			if (count == a) {
				f.addDeputy();
				System.out.println("�������� ���������");
				break;
			}
		}

	}

	public void removeDeputyfromFraction() {
		Iterator<Faction> iter = factions.iterator();
		int count = 0;
		while (iter.hasNext()) {
			System.out.println("�������: " + iter.next().toString() + ", ������ �������: " + count);
			count++;
		}
		System.out.println("������ ������ ������� ��� ��������� ��������");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		count = 0;
		int a = sc.nextInt();
		for (Faction f : factions) {
			if (count == a) {
				f.removeDeputy();
				System.out.println("�������� ��������");
				break;
			}
		}

	}

	public void showBribeTakers() {
		Iterator<Faction> iter = factions.iterator();
		int count = 0;
		while (iter.hasNext()) {
			System.out.println("�������: " + iter.next().toString() + ", ������ �������: " + count);
			count++;
		}
		System.out.println("������ ����� �������, ��� �������� ���������");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		count = 0;
		int a = sc.nextInt();
		for (Faction f : factions) {
			if (a == count) {
				f.allBribeTakers();
				break;
			}

		}

	}

	public void showBiggestBribe() {
		Iterator<Faction> iter = factions.iterator();
		int count = 0;
		while (iter.hasNext()) {
			System.out.println("�������: " + iter.next().toString() + ", ������ �������: " + count);
			count++;
		}
		System.out.println("������ ����� �������, ��� �������� ���������� ���������");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		count = 0;
		int a = sc.nextInt();
		for (Faction f : factions) {
			if (a == count) {
				f.biggestBribe();
				break;
			}

		}

	}
}
