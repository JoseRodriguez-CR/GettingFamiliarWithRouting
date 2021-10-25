package com.joserodriguez;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	
	@RequestMapping( value = "/{dojo}" )
	public String dojoMessage( @PathVariable( "dojo" ) String dojo ) {
		String message ="";
		String messageDojo = dojo; 
		if( dojo.equals( "dojo" )) {
			System.out.println(messageDojo);
			System.out.println( "The dojo is awesome!" );
			return message = "The dojo is awesome!";
		}else if( dojo.equals( "burbank-dojo" ) ){
			return "Burbank Dojo is located in Southern California";
		}else if( dojo.equals( "san-jose" ) ) {
			return "SJ dojo is the headquarters";
		}
		return "Hello "+ dojo +", have a nice day";
	}
}
