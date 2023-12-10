package aplicacao;

import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Servidores.Servidores_Ativos;
import Servidores.Servidores_Inativos;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Servidores_Ativos ser1 = new Servidores_Ativos(null, "123.155.456-11", "Ana Paula", 5000.00, "PP");
		Servidores_Ativos ser2 = new Servidores_Ativos(null, "163.058.655-01", "Maria Silva", 3500.00, "PMAL");
		Servidores_Ativos ser3 = new Servidores_Ativos(null,"892.145.730-22", "Pedro Oliveira", 4200.00, "CBMAL");
		Servidores_Ativos ser4 = new Servidores_Ativos(null,"506.837.924-11", "Ana Santos", 3800.00, "PF");
		Servidores_Ativos ser5 = new Servidores_Ativos(null,"179.623.840-10", "João Costa", 4000.00, "PRF");
		Servidores_Ativos ser6 = new Servidores_Ativos(null,"354.218.679-26", "Juliana Rodrigues", 3600.00, "DMTT");
		/*Servidores_Inativos serI1 = new Servidores_Inativos(null, "740.965.812-45", "Lucas Pereira", 4500.00, "SMTT");
		Servidores_Inativos serI2 = new Servidores_Inativos(null,"268.413.597-05", "Camila Fernandes", 3900.00, "CBM-AL");
		Servidores_Inativos serI3 = new Servidores_Inativos(null,"685.392.170-01", "Guilherme Almeida", 4100.00, "TRJ");
		Servidores_Inativos serI4 = new Servidores_Inativos(null,"417.869.523-00", "Beatriz Gomes", 3700.00, "STR");
		Servidores_Inativos serI5 = new Servidores_Inativos(null,"503.928.716-15", "Rafaela Martins", 4300.00, "STJ"); 
		Servidores_Inativos serI6 = new Servidores_Inativos(null,"153.156.452-00", "Jarson Melo", 5539.12, "PMAL");
		*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(ser1);
		em.persist(ser2);
		em.persist(ser3);
		em.persist(ser4);
		em.persist(ser5);
		em.persist(ser6);
		/*
		em.persist(serI1);
		em.persist(serI2);
		em.persist(serI3);
		em.persist(serI4);
		em.persist(serI5);
		em.persist(serI6);
		*/
		
		em.getTransaction().commit();
		System.out.println("Pronto");
	}
}
