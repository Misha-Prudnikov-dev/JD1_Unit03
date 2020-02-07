package by.htp.customer08.main;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {

	public static List<Customer> sortAlphabet(Group group) {

		List<Customer> alphabetCustomer = new ArrayList<Customer>();

		alphabetCustomer = group.getCustomers();

		Customer minCustomer;
		int index;

		for (int i = 0; i < alphabetCustomer.size(); i++) {

			minCustomer = alphabetCustomer.get(i);
			index = i;

			for (int j = i + 1; j < alphabetCustomer.size(); j++) {

				String str1 = minCustomer.getName();
				String str2 = alphabetCustomer.get(j).getName();

				if (str1.compareTo(str2) > 0) {

					minCustomer = alphabetCustomer.get(j);
					index = j;

				}
			}
			Customer temp = alphabetCustomer.get(i);
			alphabetCustomer.set(i, minCustomer);
			alphabetCustomer.set(index, temp);
		}

		return alphabetCustomer;
	}

	public static List<Customer> getIntervalCreditCardNumber(int start, int end, Group group) {

		List<Customer> intervalCreditCardNum = new ArrayList<Customer>();

		for (Customer cust : group.getCustomers()) {

			if (cust.getCreditCardNumber() >= start && cust.getCreditCardNumber() <= end) {

				intervalCreditCardNum.add(cust);
			}
		}

		return intervalCreditCardNum;
	}

}
