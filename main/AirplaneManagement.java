package main;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Airplane;
import entities.Airport;

/**
 * AirplaneManagement 
 */
public class AirplaneManagement {
	public static void main(String[] args) {
		CaseFunction casefunction = new CaseFunction();
		Scanner in = new Scanner(System.in);
		ArrayList<Airport> listAirport = new ArrayList<Airport>();
		ArrayList<Airplane> listAirplane = new ArrayList<Airplane>();
		while (true) {
			System.out.println("===================== Main Menu =======================");
			System.out.println("1. Input data");
			System.out.println("2. Airport management");
			System.out.println("3. Fixed wing management");
			System.out.println("4. Helicopter management");
			System.out.println("Another number to exist");
			int key = Integer.parseInt(in.nextLine());
			switch (key) {
			case 1:
				casefunction.case1(in, listAirport, listAirplane);
				break;
			case 2:
				casefunction.case2(in, listAirport);
				break;
			case 3:
				casefunction.case3(in, listAirplane, listAirport);
				break;
			case 4:
				casefunction.case4(in, listAirplane, listAirport);
				break;
			default:
				in.close();
				return;
			}
            System.out.println();
		}
	}
}
// 1
// 1
// AP00001
// Tân Sơn Nhất
// 800
// 30
// 15
// 1
// AP00002
// Tào Lao
// 500
// 25
// 10
// 2
// FW00001
// model1
// 120
// 2
// 2
// CAG
// 600
// 3
// RW00001
// model1
// 60
// 15
// 37
// 100
// 0
// 2
// 2
// 0
// 3
// 5
