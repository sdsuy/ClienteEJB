package cliente;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import servicios.SaludoBeanRemote;

public class ClienteSaludo {

	public static void main(String[] args) throws NamingException {
		String context = "ejb:/ServidorEJB/SaludoBean!servicios.SaludoBeanRemote";
		SaludoBeanRemote saludoBean = (SaludoBeanRemote)InitialContext.doLookup(context);
		System.out.println(saludoBean.saludar("Santiago Da Silva"));
		System.out.println("Excelente!");
	}

}
