package gestione;
import java.util.*;
public class Rubrica {
	private Vector elenco;
	/**
	 * costruttore del vettore inzialmente ad 1 ed implementato ogni volta di 1
	 */
	public Rubrica(){
		elenco = new Vector(1,1);
	}
	/**
	 * aggiunge al vettore una voce
	 * @param v
	 */
	public void aggiungiVoce(Voce v){
		elenco.addElement(v);
		
	}
	/**
	 * rimuove una voce a seconda della posizione passata come parametro
	 * @param indice
	 */
	public void rimuoviVoce(int indice){
		try{
			elenco.removeElementAt(indice);
		}
		catch(Exception e)
		{
			System.out.println("Impossibili rimuovere a quella posizione");
		}
		System.out.println("Eliminazione Effettuata ");
	}
	/**
	 * scorre il vettore e ne mostra il contenuto
	 */
	public void visualizza(){
		Voce v;
		for(int i=0;i<elenco.size();i++){
			v= (Voce) elenco.elementAt(i);
			System.out.println(+i+v.toString());
		}
	}
}
