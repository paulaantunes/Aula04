import java.util.Scanner;
public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/

		Scanner leitor = new Scanner(System.in);
		
		int idade;
		int contador=0;
		int quantidade;
		double media = 0; 
		
		System.out.println("Informe a quantidade de alunos:"); 
		quantidade = leitor.nextInt(); 
		
		while (contador < quantidade) {
		System.out.println("Insira a idade do " + (contador + 1) + " aluno"); 
		idade = leitor.nextInt();
		contador = contador + 1;
		media = media + idade; 
		}
		
		media = media / quantidade;
		System.out.println("A média da idade dos alunos é " + media + " anos");
		
		leitor.close();
	}

}
