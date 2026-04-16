import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //-----------EJERCICIO 1------------
    @Test
    void testSignoPositivo() {
        assertEquals(1, Main.signo(5));
    }
    @Test
    void testSignoNegativo() {
        assertEquals(-1, Main.signo(-10));
    }
    @Test
    void testSignoCero() {
        assertEquals(0, Main.signo(0));
    }


    //----------EJERCICIO 2--------------
    @Test
    void testEdadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Main.clasificarEdad(-1);
        });
    }
    @Test
    void testLimiteInferiorInfancia() {
        assertEquals("Infancia", Main.clasificarEdad(0));
    }
    @Test
    void testTransicionNiñez() {
        assertEquals("Niñez", Main.clasificarEdad(6));
    }
    @Test
    void testTransicionAdolescencia() {
        assertEquals("Adolescencia", Main.clasificarEdad(12));
    }
    @Test
    void testTransicionJuventud() {
        assertEquals("Juventud", Main.clasificarEdad(18));
    }
    @Test
    void testTransicionAdultez() {
        assertEquals("Adultez", Main.clasificarEdad(25));
    }
    @Test
    void testTransicionVejez() {
        assertEquals("Vejez", Main.clasificarEdad(60));
    }
    @Test
    void testVejezExtrema() {
        assertEquals("Vejez", Main.clasificarEdad(100));
    }

    //------------EJERCICIO 3---------------
    @Test
    void testArrayVacio() {
        int[] datos = {};
        assertEquals(0, Main.contarPositivos(datos));
    }

    @Test
    void testTodosNegativos() {
        int[] datos = {-1, -5};
        assertEquals(0, Main.contarPositivos(datos));
    }

    @Test
    void testMezclaPositivosNegativosYCeros() {
        int[] datos = {1, 0, -2};
        assertEquals(1, Main.contarPositivos(datos));
    }


    //-----------EJERCICIO 4--------------

    @Test
    void testNotaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> Main.calificacion(-1));
    }
    @Test
    void testNotaExcesiva() {
        assertThrows(IllegalArgumentException.class, () -> Main.calificacion(11));
    }
    @Test
    void testSuspenso() {
        assertEquals("SUSPENSO", Main.calificacion(2));
    }
    @Test
    void testSuficiente() {
        assertEquals("SUFICIENTE", Main.calificacion(5));
    }
    @Test
    void testBien() {
        assertEquals("BIEN", Main.calificacion(6));
    }
    @Test
    void testNotable() {
        assertEquals("NOTABLE", Main.calificacion(7));
    }
    @Test
    void testSobresaliente() {
        assertEquals("SOBRESALIENTE", Main.calificacion(9));
    }

    //------------EJERCICIO 5----------------------
    @Test
    void testNoDivisiblePorCuatro() {
        assertFalse(Main.esBisiesto(2023));
    }

    @Test
    void testBisiestoEstandar() {
        assertTrue(Main.esBisiesto(2024));
    }

    @Test
    void testSigloNoBisiesto() {
        assertFalse(Main.esBisiesto(1900));
    }

    @Test
    void testSigloBisiesto() {
        assertTrue(Main.esBisiesto(2000));
    }

    //----------------EJERCICIO 6--------------------
    @Test
    void testJugadaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            Main.jugar("PIEDRA", "ARCO");
        });
    }

    @Test
    void testEmpate() {
        assertEquals("EMPATE", Main.jugar("PAPEL", "PAPEL"));
    }

    @Test
    void testGanaJugador1() {
        assertEquals("GANA JUGADOR 1", Main.jugar("PIEDRA", "TIJERA"));
    }

    @Test
    void testGanaJugador2() {
        assertEquals("GANA JUGADOR 2", Main.jugar("TIJERA", "PIEDRA"));
    }


    //--------------EJERCICIO 7---------------------
    @Test
    void testPasswordDebil() {
        assertEquals("DEBIL", Main.evaluarPassword("abc"));
        assertEquals("DEBIL", Main.evaluarPassword("abc12"));
    }

    @Test
    void testPasswordMedia() {
        assertEquals("MEDIA", Main.evaluarPassword("Abc1234"));
    }

    @Test
    void testPasswordFuerte() {
        assertEquals("FUERTE", Main.evaluarPassword("Abc12345!"));
    }

    @Test
    void testNulo() {
        assertEquals("DEBIL", Main.evaluarPassword(null));
    }
}