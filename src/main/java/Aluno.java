import java.text.DecimalFormat;

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

    private double arredondamento(double nota){
        return Double.parseDouble(String.valueOf(nota).substring(0,3));
    }

    public double getPrimeiraNota() {
        return arredondamento(primeiraNota);
    }

    public double getSegundaNota() {
        return arredondamento(segundaNota);
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

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", primeiraNota=" + primeiraNota +
                ", segundaNota=" + segundaNota +
                '}';
    }
}
