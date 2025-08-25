package candidatura;

import java.util.concurrent.ThreadLocalRandom;

/* Case 2:
 Foi solicitado que nosso sistema garanta que diante das inúmeras
 candidaturas sejam selecionados apenas no máximo 5 candidatos para
 entrevista onde salário pretendido seja menor ou igual ao salário base.
 */

public class Case2 {
    public static void main(String[] args) {
        selecaoCandidatos();
    }
    public static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA",
                "FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double  salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s, Solicitou este valor de salário R$ %.2f ",
                    candidato,salarioPretendido);
            System.out.println("");
            if (salarioBase >= salarioPretendido){
                System.out.println( candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }
}
