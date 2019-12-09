package pokemons;

import java.util.ArrayList;

import abstractClass.Capacity;
import abstractClass.Pokemon;
import abstractClass.Type;

public class Bulbasaur extends Pokemon{
	@SuppressWarnings("serial")
	private final static ArrayList<Capacity> capacities = new ArrayList<Capacity>() {{ 
//		add(new );
		
	}};
	
	public Bulbasaur(String name) {
		super(
			name, //name
			capacities, //list of capacities
			50, //exp
			45, //life
			49, //damages
			49, //protections
			specialAttack, //specialAttack name
			specialDefense, //specialDefense name
			45 //speed
		);
	}
}
