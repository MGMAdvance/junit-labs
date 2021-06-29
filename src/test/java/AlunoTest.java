import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    private final Aluno aluno = new Aluno("Matheus");

    @Test
    @DisplayName("Calcular a média do aluno")
    void calcularMedia(){
        aluno.setPrimeiraNota(5.2);
        aluno.setSegundaNota(8.0);

        assertEquals(6.6, aluno.getMedia());
    }

    @Test
    @DisplayName("O aluno deve passar de ano")
    void alunoPassou(){
        aluno.setPrimeiraNota(5.2);
        aluno.setSegundaNota(8);

        assertTrue(aluno.isPassou());
    }


    @Test
    @DisplayName("O aluno não deve passar de ano")
    void alunoNaoPassou(){
        aluno.setPrimeiraNota(2);
        aluno.setSegundaNota(3);

        assertFalse(aluno.isPassou());
    }

    @Test
    @DisplayName("A estrutura do Aluno deve ser igual a apresentada com string")
    void estruturaDoAlunoComString(){
        aluno.setPrimeiraNota(2);
        aluno.setSegundaNota(3);

        String estrutura = "Aluno{" +
                "nome='Matheus'" +
                ", primeiraNota=2.0" +
                ", segundaNota=3.0" +
                '}';

        assertEquals(estrutura, aluno.toString());
    }

    @Test
    @DisplayName("A estrutura do Aluno deve ser igual a apresentada com toString")
    void estruturaDoAlunoComToString(){
        aluno.setPrimeiraNota(2);
        aluno.setSegundaNota(3);

        Aluno matheus = new Aluno("Matheus", 2, 3);

        assertEquals(matheus.toString(), aluno.toString());
    }

    @Test
    @DisplayName("Arredondamento das notas")
    void arredodamentoNotas(){
        aluno.setPrimeiraNota(2.005);
        aluno.setSegundaNota(3.885);

        assertEquals(2.0, aluno.getPrimeiraNota());
        assertEquals(3.8, aluno.getSegundaNota());
    }
}
