package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		TellerMachine tellerMachine = new TellerMachine("BugsBunny", new BigDecimal("1000.00"),
				new BigDecimal("500.00"));


		System.out.println("Manufacturer " + tellerMachine.getManufacturer());
		System.out.println("Deposits: " + tellerMachine.getDeposit());
		System.out.println("Withdrawals: " + tellerMachine.getWithdrawal());
		System.out.println("Balance: " + tellerMachine.getBalance());

		System.out.println(tellerMachine.toString());
		File file = new File("data-files/TellerInput.csv");
		Scanner scanner = new Scanner(file);

		List<TellerMachine> tellerMachineList = new ArrayList<>();
		BigDecimal total = new BigDecimal("0.00");

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] lineArray = line.split(",");
			TellerMachine temp = new TellerMachine(lineArray[0],new BigDecimal(lineArray[1]),new BigDecimal(lineArray[2]));
			tellerMachineList.add(temp);
			total = total.add(temp.getBalance());
		}

		for (int i = 0; i < tellerMachineList.size(); i++){
			System.out.println(tellerMachineList.get(i));
		}
		System.out.println("Total " + total);

	}

}
