package aplicacao;

import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Servidores.servidoresAtivos;
import Servidores.servidoresInativos;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		servidoresAtivos ser1 = new servidoresAtivos(null, "123.155.456-11", "Ana Paula", 5000.00, "PP");
		servidoresAtivos ser2 = new servidoresAtivos(null, "163.058.655-01", "Maria Silva", 3500.00, "PMAL");
		servidoresAtivos ser3 = new servidoresAtivos(null,"892.145.730-22", "Pedro Oliveira", 4200.00, "CBMAL");
		servidoresAtivos ser4 = new servidoresAtivos(null,"506.837.924-11", "Ana Santos", 3800.00, "PF");
		servidoresAtivos ser5 = new servidoresAtivos(null,"179.623.840-10", "João Costa", 4000.00, "PRF");
		servidoresAtivos ser6 = new servidoresAtivos(null,"354.218.679-26", "Juliana Rodrigues", 3600.00, "DMTT");
		servidoresInativos serI1 = new servidoresInativos(null, "740.965.812-45", "Lucas Pereira", 4500.00, "SMTT");
		servidoresInativos serI2 = new servidoresInativos(null,"268.413.597-05", "Camila Fernandes", 3900.00, "CBM-AL");
		servidoresInativos serI3 = new servidoresInativos(null,"685.392.170-01", "Guilherme Almeida", 4100.00, "TRJ");
		servidoresInativos serI4 = new servidoresInativos(null,"417.869.523-00", "Beatriz Gomes", 3700.00, "STR");
		servidoresInativos serI5 = new servidoresInativos(null,"503.928.716-15", "Rafaela Martins", 4300.00, "STJ"); 
		servidoresInativos serI6 = new servidoresInativos(null,"153.156.452-00", "Jarson Melo", 5539.12, "PMAL");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(ser1);
		em.persist(ser2);
		em.persist(ser3);
		em.persist(ser4);
		em.persist(ser5);
		em.persist(ser6);
		
		em.persist(serI1);
		em.persist(serI2);
		em.persist(serI3);
		em.persist(serI4);
		em.persist(serI5);
		em.persist(serI6);
		
		em.getTransaction().commit();
		System.out.println("Pronto");
		
		em.close();
		emf.close();
	}
}
