import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jogo meuJogo = new Jogo(Dificuldade.MEDIUM);

        Jogavel p1 = new Jogavel("Paulo", 100, 3);
        NaoJogavel p2 = new NaoJogavel("Luisa", 100, false);

        meuJogo.adicionarPersonagem(p1);
        meuJogo.adicionarPersonagem(p2);

        System.out.println("--- TESTE 1: Jogavel (Paulo) ataca NaoJogavel (Luisa) ---");
        System.out.println("Vitalidade inicial de Luisa: " + p2.getVitalidade());

        p1.botaoA(p2);
        System.out.println("Apos 1o golpe normal (botaoA): " + p2.getVitalidade());

        p1.botaoA(p2);
        System.out.println("Apos 2o golpe normal (botaoA): " + p2.getVitalidade());

        p1.botaoB(p2);
        System.out.println("Apos golpe especial (botaoB): " + p2.getVitalidade());

        System.out.println("Vitalidade final de Luisa: " + p2.getVitalidade());
        System.out.println("---------------------------------------------------------");

        System.out.println("--- TESTE 2: NaoJogavel (Luisa) ataca Jogavel (Paulo) ---");
        System.out.println("Vitalidade inicial de Paulo: " + p1.getVitalidade());

        p2.aplicarGolpeEspecial(p1);
        System.out.println("Apos golpe especial de Luisa: " + p1.getVitalidade());

        p2.aplicarGolpeNormal(p1);
        System.out.println("Apos golpe normal de Luisa: " + p1.getVitalidade());

        System.out.println("Vitalidade final de Paulo: " + p1.getVitalidade());
        System.out.println("---------------------------------------------------------");
    }
}