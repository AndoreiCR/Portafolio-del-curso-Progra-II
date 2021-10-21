package test.Servicios;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;
import Entidades.Libro;
import Servicios.Libreria;

public class LibreriaTest {

    @Test
    public void testPrestarLibroQueNoSeHaPrestado() {
        Libro miLibro = new Libro("Moby Dick", "Herman Melville");
        Libreria miLibreria = new Libreria();
        try {
            miLibreria.prestar(miLibro);
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testPrestarLibroQueYaSeHaPrestado() {
        Libro miLibro = new Libro("Moby Dick", "Herman Melville");
        miLibro.setPrestado(true);
        Libreria miLibreria = new Libreria();
        try {
            miLibreria.prestar(miLibro);
            fail();

        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testDevolver() {
        Libro miLibro = new Libro("Moby Dick", "Herman Melville");
        Libreria miLibreria = new Libreria();
        try {
            miLibreria.devolver(miLibro);
            fail();

        } catch (Exception e) {
            assertTrue(true);
        }
    }

}
