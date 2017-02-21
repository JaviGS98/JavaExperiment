
public class CuentaBancaria {

	private String iban;
	private String dni;
	private float saldo;
	private char c;
	
	//CONSTRUCTORES
	public CuentaBancaria(){
		iban = null;
		dni = null;
		saldo = 0;
	}
//	
	public CuentaBancaria(String iban,String dni){
		//this.iban = iban;
		setIban(iban);
		//this.dni = dni;
		this.setDNI(dni);
	}
	
	
	
	
	
	
	// Métodos de acceso . Setter y Getter
	
	public void setIban(String i){
		//Código de verificación del ibán: Dos primeras letras = ES
		if(i.startsWith("ES")){
			this.iban = i;
			
		}
	}
	
	public void setDNI(String dni){
		//Código de verificación
		if(dni.length() == 9){
			if(Character.isLetter(dni.charAt(8))){
				this.dni = dni;
			}
		}
	}
	
	public void setSaldo(float saldo){
		if(saldo > 0){
			this.saldo = saldo;
			
		}
	}
	
	//Métodos de lectura: getters.
	public String getIban(){
		return this.iban;
	}
	
	public String getDNI(){
		return this.dni;
	}
	
	public float getSaldo(){
		return this.saldo;
	}
	
	
	@Override
	public String toString(){
		
		return "IBAN: " + this.iban + " DNI: " + this.dni + " Saldo: " + this.saldo;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
