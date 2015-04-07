package gestione;

public class Voce {
	private String nome=new String();
	private String cognome=new String();
	private String telefono=new String();
	
	public void Voce(){
		
	}
	
	public String getNome() {
		return nome;
	}
	/**
	 * setta il nome 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * legge il cognome 
	 * @return
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * setta il cognome
	 * @param cognome
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * legge i numeri di telefono
	 * @return
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * setta il numero di telefono
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Voce [nome=" + nome + ", cognome=" + cognome + ", telefono="
				+ telefono + "]";
	}
	
	
}
