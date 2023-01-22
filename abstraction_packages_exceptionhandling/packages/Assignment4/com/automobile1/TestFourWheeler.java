package abstraction_packages_exceptionhandling.packages.com.automobile1;


import abstraction_packages_exceptionhandling.packages.com.automobile1.fourwheeler.Ford;
import abstraction_packages_exceptionhandling.packages.com.automobile1.fourwheeler.Logan;

public class TestFourWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford ford = new Ford("Ford Ecosport", "WB03G69", "Srabanti Bera", 170);
		System.out.print(ford.getModelName()+"\t");
		System.out.print(ford.getOwnerName()+"\t");
		System.out.print(ford.getRegistrationNumber()+"\t  ");
		System.out.print(ford.speed()+" kmph"+"\t");
		ford.tempControl();
		
		System.out.println();
		
		Logan logan = new Logan("Mahindra Logan", "WB65K87", "Sumit Bera", 180);
		System.out.print(logan.getModelName()+"\t");
		System.out.print(logan.getOwnerName()+"\t");
		System.out.print(logan.getRegistrationNumber()+"\t  ");
		System.out.print(logan.speed()+" kmph"+"\t");
		logan.gps();
	}

}

