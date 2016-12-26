package com.poc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.vo.Country;
import com.poc.vo.Medicine;
import com.poc.vo.RequestParameter;

@RestController
public class CountryController {
	
	@RequestMapping(value = "/countries", method = RequestMethod.POST,headers="Accept=application/json")
	public List<Country> getCountries()
	{
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries=createCountryList();
		return listOfCountries;
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public Country getCountryById(@PathVariable int id)
	{
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries=createCountryList();

		for (Country country: listOfCountries) {
			if(country.getId()==id)
				return country;
		}
		
		return null;
	}

	
	
	@RequestMapping(value = "/workOrder", method = RequestMethod.POST,consumes="application/json",produces="application/json")
	public List<Medicine> getMedicines(@RequestBody RequestParameter request)
	{
		
		List<Medicine> listOfMedicines = new ArrayList<Medicine>();
		listOfMedicines=createMedicine(request.getCode());
		return listOfMedicines;
	}
	
private List<Medicine> createMedicine(String code) {
	
	List<Medicine> medicines = new ArrayList<Medicine>();
	
	if(code.equals("1")){
		medicines.add(new Medicine("1","Paramcetomol"));
		medicines.add(new Medicine("2","Citizine"));
	}else{
		medicines.add(new Medicine("3","Nasal Drops"));
		medicines.add(new Medicine("4","Ear Drops"));
	}
	return medicines;
		// TODO Auto-generated method stub
		
	}


	// Utiliy method to create country list.
	public List<Country> createCountryList()
	{
		Country indiaCountry=new Country(1, "India");
		Country chinaCountry=new Country(4, "China");
		Country nepalCountry=new Country(3, "Nepal");
		Country bhutanCountry=new Country(2, "Bhutan");

		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);
		return listOfCountries;
	}
}
