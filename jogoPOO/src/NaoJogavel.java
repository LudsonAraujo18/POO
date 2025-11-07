public class NaoJogavel extends Personagem {
    private boolean aliado;

    public NaoJogavel(String nome, int vitalidade, boolean aliado) {
        super(nome, vitalidade);
        this.aliado = aliado;
    }

    public boolean isAliado() {
        return aliado;
    }

    public void setAliado(boolean aliado) {
        this.aliado = aliado;
    }

    @Override
    public void aplicarGolpeEspecial(Personagem adversario) {
        if (getJogo() == null) {
            System.out.println(getNome() + " não pertence a nenhum jogo e não pode usar o golpe especial.");
            return;
        }

        int dano = 0;
        switch (getJogo().getDificuldade()) {
            case EASY:
                dano = 20;
                break;
            case MEDIUM:
                dano = 30;
                break;
            case HARD:
                dano = 40;
                break;
        }
        int novaVitalidade = adversario.getVitalidade() - dano;
        adversario.setVitalidade(novaVitalidade);
    }
}