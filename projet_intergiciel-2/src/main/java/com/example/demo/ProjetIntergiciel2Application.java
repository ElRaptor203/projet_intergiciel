package com.example.demo;






import org.geonames.Toponym;
import org.geonames.ToponymSearchCriteria;
import org.geonames.ToponymSearchResult;
import org.geonames.WebService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetIntergiciel2Application {

	public static void main(String[] args) throws Exception {
	//	System.getProperties().put( "server.port", 8089 );
		SpringApplication.run(ProjetIntergiciel2Application.class, args);
		System.out.println("hello word leo");
		WebService.setUserName("leopold237"); // ajoutez votre nom d'utilisateur ici
		 
		  ToponymSearchCriteria searchCriteria = new ToponymSearchCriteria();
		  searchCriteria.setQ("Cameroun");
		  ToponymSearchResult searchResult = WebService.search(searchCriteria);
		  for (Toponym toponym : searchResult.getToponyms()) {
			   //  System.out.println(" donnee 1 "+ toponym.getName());
			   //  System.out.println(" donnee 2"+ toponym.getCountryName());
			     System.out.println(" Longitude : "+ toponym.getLongitude());
			     System.out.println(" Latitude : "+ toponym.getLatitude());
			     System.out.println("+++++++++++++++++++++++++++++++++++++++");

		  }	
	}

}
