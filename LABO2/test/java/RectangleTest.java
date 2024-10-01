import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testCalculerSurface() {
        // Créer un rectangle avec une largeur de 5.0 et une hauteur de 3.0
        Rectangle rect = new Rectangle(5.0, 3.0);
        // La surface attendue est 5.0 * 3.0 = 15.0
        assertEquals(14.0, rect.calculerSurface(), 0.0001);
    }

    @Test
    public void testCalculerPerimetre() {
        // Créer un rectangle avec une largeur de 5.0 et une hauteur de 3.0
        Rectangle rect = new Rectangle(5.0, 3.0);
        // Le périmètre attendu est 2 * (5.0 + 3.0) = 16.0
        assertEquals(16.0, rect.calculerPerimetre(), 0.0001);
    }

    @Test
    public void testDimensionsZero() {
        // Créer un rectangle avec une largeur et une hauteur de 0.0
        Rectangle rect = new Rectangle(0.0, 0.0);
        // La surface et le périmètre devraient être de 0.0
        assertEquals(0.0, rect.calculerSurface(), 0.0001);
        assertEquals(0.0, rect.calculerPerimetre(), 0.0001);
    }

    @Test
    public void testDimensionsNegatives() {
        // Créer un rectangle avec des dimensions négatives
        Rectangle rect = new Rectangle(-5.0, -3.0);
        // Tester les calculs (les dimensions négatives peuvent ne pas être réalistes, mais les mathématiques restent valides)
        assertEquals(15.0, rect.calculerSurface(), 0.0001); // Cela dépend de la logique de votre classe Rectangle
        assertEquals(-16.0, rect.calculerPerimetre(), 0.0001); // Logiquement, le périmètre pourrait être négatif ici
    }
}