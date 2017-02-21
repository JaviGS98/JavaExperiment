
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear una cuenta bancaria
		CuentaBancaria cuenta = new CuentaBancaria();
		CuentaBancaria cuenta2 = new CuentaBancaria("ESaafad","12345678W");
		//cuenta.iban = "231Pepe2241234";
		cuenta.setIban("ES3456789");
		cuenta.setDNI("12345678S");
		cuenta.setSaldo(2000);
		
		System.out.println(cuenta.getIban() + " " + cuenta.getDNI() + " " + cuenta.getSaldo());
		System.out.println("INFO DE LA CUENTA CREADA:");
		System.out.println(cuenta2);
		
		
		
		
		if(cuenta.getIban().contains("456")){
			System.out.println("Oficina Calle Urzaiz 34");
		}
		
		Object o = new Object();
		System.out.println(o);
		
		//Crear clientes
		
		Cliente cliente = new Cliente();
		cliente.setDni("12345678Q");
		cliente.setEdad(23);
		cliente.setNombre("Javier Perez Gzalez");
		
		System.out.println("DATOS CLIENTE: ");
		System.out.println(cliente.toString());
		
		//Obtener hashcode
		System.out.println(cliente.hashCode());
		
		
	}
//aportacion martin
	cliente cliente=new cliente();
	cliente setnom("martin posada");
	
}
