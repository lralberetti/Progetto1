package gestione;
import java.io.*;
public class Menu {
	/**
	 * mostra le possibili operazione da effettuare
	 */
	public void mostraMenu(){
		System.out.println("1 -> Aggiungi una voce all'elenco: ");
		System.out.println("2 -> Elimina una voce all'elenco ");
		System.out.println("3 -> Mostra la rubrica ");
		System.out.println("4 -> Esci");
	}
	/**
	 * 
	 * @return la scelta fatta dall'utente a seconda dell'operazione da svolgere
	 */
	public int scelta()
	{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int scelta;	
		mostraMenu();
		System.out.println("cosa vuoi fare? ");
		try{
			String numeroLetto=tastiera.readLine();
			scelta=Integer.valueOf(numeroLetto).intValue();
		}
		catch(Exception e)
		{
			scelta=0;
		}
		return scelta;	
	}
	/**
	 * 
	 * @return la posizione della voce che si vuole eliminare
	 */
	public int leggiIndice(){
		int indice;
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		System.out.println("Quale voce vuoi eliminare? ");
		try{
			String numeroLetto=tastiera.readLine();
			indice=Integer.valueOf(numeroLetto).intValue();
		}
		catch(Exception e)
		{
			indice=-1;
		}
		return indice;
	}
		
}
