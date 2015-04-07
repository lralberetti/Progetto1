package ese104;
import gestione.*;

public class Ese104 {

	public static void main(String[] args) {
		Rubrica miaRubrica = new Rubrica();
		Menu mioMenu = new Menu();
		
		
		int scelta= mioMenu.scelta();
		
		while(scelta!=4){
			if(scelta==1){
				Voce v=new Voce();
				v.setNome("Lorenzo");
				v.setCognome("Alberetti");
				v.setTelefono("3495579988");
				miaRubrica.aggiungiVoce(v);
			}
			else if(scelta==2){
				int indice=mioMenu.leggiIndice();
				miaRubrica.rimuoviVoce(indice);
				
			}
			else if(scelta==3){
				miaRubrica.visualizza();
				
				
			}
			scelta=mioMenu.scelta();
		}
		System.out.println("Programma completato");
	}

}
