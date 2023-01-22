package abstraction_packages_exceptionhandling.interfaces.live;

import abstraction_packages_exceptionhandling.interfaces.music.Playable;
import abstraction_packages_exceptionhandling.interfaces.music.string.Veena;
import abstraction_packages_exceptionhandling.interfaces.music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena veena = new Veena();
		Saxophone saxophone = new Saxophone();
		veena.play();
		saxophone.play();
		
		Playable veenaObj = new Veena();
		Playable saxophoneObj = new Saxophone();
		veenaObj.play();
		saxophoneObj.play();
	}

}
