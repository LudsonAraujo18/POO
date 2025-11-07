package model;

public abstract class C1 {
    protected String nome;

    public C1() {
        this.nome = "Sem nome";
    }

    public C1(String nome) {
        this.nome = nome;
    }

    public abstract void mostrarInfo();

    public void saudacao() {
        System.out.println("Eu sou um objeto da classe " + getClass().getSimpleName());
    }
}
