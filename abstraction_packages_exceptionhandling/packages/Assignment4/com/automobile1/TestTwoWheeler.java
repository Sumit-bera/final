package abstraction_packages_exceptionhandling.packages.com.automobile1;

import abstraction_packages_exceptionhandling.packages.com.automobile1.twowheeler.Hero;
import abstraction_packages_exceptionhandling.packages.com.automobile1.twowheeler.Honda;

public class TestTwoWheeler{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Hero Splender", "WB30S56", "Sumit Bera", 100);
		System.out.print(hero.getModelName()+"\t");
		System.out.print(hero.getOwnerName()+"\t");
		System.out.print(hero.getRegistrationNumber()+"\t  ");
		System.out.print(hero.getSpeed()+" kmph"+"\t");
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda Civic", "WB56D98", "Srabanti Bera", 120);
		System.out.print(honda.getModelName()+"\t");
		System.out.print(honda.getOwnerName()+"\t");
		System.out.print(honda.getRegistrationNumber()+"\t  ");
		System.out.print(honda.getSpeed()+" kmph"+"\t");
		honda.cdplayer();	
	}

}

