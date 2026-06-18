import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PecaTest
{
    @Test
    public void testPecaSubclassesCreatedSuccessfully()
    {
        assertNotNull(new Torre("T1"));
        assertNotNull(new Cavalo("H1"));
        assertNotNull(new Bispo("B1"));
        assertNotNull(new Rainha("Q1"));
        assertNotNull(new Rei("K1"));
        assertNotNull(new Peao("P1"));
    }

    @Test
    public void testPecaMoverMethodExists()
    {
        Peca peca = new Torre("T1");
        assertDoesNotThrow(peca::mover);
    }

    @Test
    public void testTabuleiroCreatedSuccessfully()
    {
        assertNotNull(new Tabuleiro());
    }
}

