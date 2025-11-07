import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private Dificuldade dificuldade;
    private List<Personagem> listaPersonagens;

    public Jogo(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
        this.listaPersonagens = new ArrayList<>();
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<Personagem> getListaPersonagens() {
        return listaPersonagens;
    }

    public void adicionarPersonagem(Personagem personagem) {
        if (personagem != null && !this.listaPersonagens.contains(personagem)) {
            this.listaPersonagens.add(personagem);
            personagem.setJogo(this);
        }
    }

    public void removerPersonagem(Personagem personagem) {
        if (personagem != null && this.listaPersonagens.contains(personagem)) {
            this.listaPersonagens.remove(personagem);
            personagem.setJogo(null);
        }
    }
}