package candidatura;

import java.util.Scanner;

/* Case 1:
 Vamos imaginar que em um processo seletivo existe o valor base salarial de R$ 2.000,00 e o salário pretendido
 pelo candidato. Vamos elaborar um controle de fluxo onde:
  * Se o valor salario base for maior que valor salario pretendido, imprima LIGAR PARA O CANDIDATO;
  * Senão Se o valor salario base for igual ao valor salario pretendido, imprima: LIGAR PARA O CANDIDATO COM
   CONTRA PROPOSTA;
  * Senão imprima: AGUARDANDO RESULTADO DEMAIS CANDIDATOS.
 */
public class ProcessoSeletivo {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double salarioBase = 2000, salarioPretendido;
        System.out.println("Digite o salário pretendido:");
        salarioPretendido = leia.nextDouble();
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
        leia.close();
    }
}