package com.endes.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class LibroTest {

	Book prueba;
	 List<Author> autores = new ArrayList<>(); 
    @BeforeEach
    void setUp() {
        // Se inicializa un libro
    /*
     * 		public BookItem(String isbn, String title, List<Author> autores, String summary, String publisher,
			String publicationDate, Integer nPages, Language language) {
     */
        prueba = new BookItem("ISBN 0-7645-2641-3","El arco",autores,"Es un libro de","Publicador","20 de marzo de 2020",23,Language.ES);
    }
    
    @Test
    @DisplayName("Crear un libro y comprobar que se crea correctamente")
    void testCrearCasaConHabitaciones() {
        assertEquals(3, casa.getHabitaciones().size(), "La casa debe ser creada con 3 habitaciones.");
    }
	
}
