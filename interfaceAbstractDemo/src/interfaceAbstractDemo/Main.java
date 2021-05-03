package interfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"Berkay", "Alic", 1995, "129091275");
		BaseCustomerManager starbacksCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		starbacksCustomerManager.save(customer1);
	}

}
