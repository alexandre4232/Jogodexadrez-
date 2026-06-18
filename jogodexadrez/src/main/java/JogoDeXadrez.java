public class JogoDeXadrez implements Jogo
{
    public static void main(String[] args)
    {
        new JogoDeXadrez().iniciar();
        System.out.println("diego alexandre");
    }

    @Override
    public void iniciar()
    {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogadorHumano = new JogadorHumano('b');
        Jogador jogadorSintetico = new JogadorSintetico('p');
        int turno = 0;

        while (!tabuleiro.acabouOJogo())
        {
            if (turno % 2 == 0)
            {
                jogadorHumano.jogar(tabuleiro, "P1b", turno + 1);
            }
            else
            {
                jogadorSintetico.jogar(tabuleiro, "P1p", turno + 1);
            }
            turno++;
        }
    }
}
