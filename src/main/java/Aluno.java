public class Aluno {
    private final String nome;
    private double primeiraNota;
    private double segundaNota;

    public Aluno(String nome){ this.nome = nome; }

    public Aluno(String nome, double primeiraNota, double segundaNota){
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public String getNome() {
        return nome;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double getMedia(){
        return (primeiraNota + segundaNota) / 2;
    }

    public boolean isPassou(){
        return getMedia() >= 5;
    }
}
