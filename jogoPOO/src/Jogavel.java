public class Jogavel extends Personagem implements Controle {
    private int nivel;

    public Jogavel(String nome, int vitalidade, int nivel) {
        super(nome, vitalidade);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void aplicarGolpeEspecial(Personagem adversario) {
        int dano = this.nivel * 10;
        int novaVitalidade = adversario.getVitalidade() - dano;
        adversario.setVitalidade(novaVitalidade);
    }

    @Override
    public void botaoA(Personagem adversario) {
        aplicarGolpeNormal(adversario);
    }

    @Override
    public void botaoB(Personagem adversario) {
        aplicarGolpeEspecial(adversario);
    }
}