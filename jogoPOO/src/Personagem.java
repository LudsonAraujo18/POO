public abstract class Personagem {
    private String nome;
    private int vitalidade;
    private Jogo jogo;

    public Personagem(String nome, int vitalidade) {
        this.nome = nome;
        setVitalidade(vitalidade);
        this.jogo = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        if (vitalidade < 0) {
            this.vitalidade = 0;
        } else if (vitalidade > 100) {
            this.vitalidade = 100;
        } else {
            this.vitalidade = vitalidade;
        }
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public void aplicarGolpeNormal(Personagem adversario) {
        int novaVitalidade = adversario.getVitalidade() - 10;
        adversario.setVitalidade(novaVitalidade);
    }

    public abstract void aplicarGolpeEspecial(Personagem adversario);
}