package main;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Airplane;
import entities.Airport;
import services.AirportService;
import services.FixedwingService;
import services.HelicopterService;
import services.ValidatorRules;

/**
 * CaseFunction
 */
public class CaseFunction {
	private ValidatorRules validator = new ValidatorRules();
	private AirportService airportService = new AirportService();
	private FixedwingService fixedwingService = new FixedwingService();
	private HelicopterService helicopterService = new HelicopterService();

	public void case1(Scanner in, ArrayList<Airport> listAirport, ArrayList<Airplane> listAirplane) {
		while (true) {
			System.out.println("===================== Input Data =======================");
			System.out.println("1. Create airport");
			System.out.println("2. Create fixedwing airplane");
			System.out.println("3. Create helicopter");
			System.out.println("Another number to exist");
			int key = validator.inputNumber(in);
			switch (key) {
			case 1:
				airportService.createAirport(in, listAirport);
				break;
			case 2:
				fixedwingService.createFixedwing(in, listAirplane);
				break;
			case 3:
				helicopterService.createHelicopter(in, listAirplane);
				break;
			default:
				return;
			}
		}
	}

	public void case2(Scanner in, ArrayList<Airport> listAirport) {
		while (true) {
			System.out.println("===================== Airport Management =======================");
			System.out.println("1. Delete airport");
			System.out.println("2. Display list of all airport information, sorted by airport ID");
			System.out.println("3. Display the status of one airport, selected by airport ID");
			System.out.println("Another number to exist");
			int key = validator.inputNumber(in);
			switch (key) {
			case 1:
				airportService.deleteAirport(in, listAirport);
				break;
			case 2:
				airportService.search(listAirport);
				break;
			case 3:
				airportService.search(in, listAirport);
				break;
			default:
				return;
			}
		}
	}

	public void case3(Scanner in, ArrayList<Airplane> listAirplane, ArrayList<Airport> listAirport) {
		while (true) {
			System.out.println("===================== Fixed Wing Management =======================");
			System.out.println("1. Add fixed wing airplaine to airport");
			System.out.println("2. Remove fixed wing airplaine from airport");
			System.out.println("3. Change plane type");
			System.out.println("4. Change min runway size");
			System.out.println("5. Display list of all fixed wing airplanes with its parking airport ID");
			System.out.println("Another number to exist");
			int key = validator.inputNumber(in);
			switch (key) {
			case 1:
				fixedwingService.add(in, listAirplane, listAirport);
				break;
			case 2:
				fixedwingService.removeFromAnAirport(in, listAirplane, listAirport);
				break;
			case 3:
				fixedwingService.changePlaneType(in, listAirplane);
				break;
			case 4:
				fixedwingService.changeMinRunwaySize(in, listAirplane, listAirport);
				break;
			case 5:
				fixedwingService.displayByID(in, listAirplane, listAirport);
				break;
			default:
				return;
			}
		}
	}

	public void case4(Scanner in, ArrayList<Airplane> listAirplane, ArrayList<Airport> listAirport) {
		while (true) {
			System.out.println("===================== Helicopter Management =======================");
			System.out.println("1. Add helicopter airplaine to airport");
			System.out.println("2. Remove helicopter airplaine from airport");
			System.out.println("3. Display list of all helicopter airplanes with its parking airport ID");
			System.out.println("Another number to exist");
			int key = validator.inputNumber(in);
			switch (key) {
			case 1:
				helicopterService.add(in, listAirplane, listAirport);
				break;
			case 2:
				helicopterService.removeFromAnAirport(in, listAirplane, listAirport);
				break;
			case 3:
				helicopterService.displayByID(in, listAirplane, listAirport);
				break;
			default:
				return;
			}
		}
	}

    public ValidatorRules getValidator() {
        return validator;
    }

    public void setValidator(ValidatorRules validator) {
        this.validator = validator;
    }

    public AirportService getAirportService() {
        return airportService;
    }

    public void setAirportService(AirportService airportService) {
        this.airportService = airportService;
    }

    public FixedwingService getFixedwingService() {
        return fixedwingService;
    }

    public void setFixedwingService(FixedwingService fixedwingService) {
        this.fixedwingService = fixedwingService;
    }

    public HelicopterService getHelicopterService() {
        return helicopterService;
    }

    public void setHelicopterService(HelicopterService helicopterService) {
        this.helicopterService = helicopterService;
    }
}
