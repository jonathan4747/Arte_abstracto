package com.codingdojo;

public class Museo {
	
	 public static void main(String[] args) {

		 Pintura gioconda = new Pintura("la Gioconda","Leonardo","Pintura Clasica","Retrato");
		 Pintura noche = new Pintura("la Noche Estrellada ","Vicente","Pintura PostModernismo","Paisaje Azul");
		 Pintura musicos = new Pintura("los Tres Musicos ","Picasso","Pintura Cubismo","al oleo");
		 
		 Escultura david = new Escultura("David","Donatello","158cm,circa 1440","Bronce");
		 Escultura piedad = new Escultura("La Piedad","Miguel Angel","1498","Marmol");
		 
		 gioconda.arte();
		 noche.arte();
		 musicos.arte();
		 david.arte();
		 piedad.arte();
	 
	 }
}
