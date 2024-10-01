package avaliacao2;

import java.util.Scanner;

public class Portaria {
	
	public static void main(String[] args) {
		Turma turma = new Turma(2024);
		turma.curso.setNome("Redes");
		turma.adicionaEstudante("Dante","12345", "Dante@", 5, "Willams@");
		turma.adicionaEstudante("Jessica","12346", "Jessica@", 6, "Willams@");
		
		String palavra;
    	Scanner leitor = new Scanner(System.in);
		int aux=0;
		
		do {
			System.out.println("\n******Controle de Aluno******\n");
			System.out.println("1- Cadastrar Aluno");
			System.out.println("2- Buscar matrícula de aluno");
			System.out.println("3- Autorizar aluno (autorização dos pais)");
			System.out.println("4- Verificar se aluno está autorizado a sair "); //fazer a função
			System.out.println("5- Lista alunos");
			System.out.println("9- Finaliza programa");
			aux= leitor.nextInt();
			switch (aux) {
			case 1:
			{
				turma.adicionaEstudante();
				break;
			}
			case 2:
			{
				System.out.println("Buscas matrícula do aluno");
				System.out.print("Digite o CPF do aluno: ");
				turma.buscaMatricula(leitor.next());
				break;
			}
			
			case 3:
				
			{
				System.out.println("******Liberação de aluno por responsável******");
				System.out.print("AVISO: Antes de liberar o aluno no sistema verificar "
						+ "a documentação do responsável (RG) e armazenar em local próprio uma cópia.");
				System.out.print("\nDigite a matrícula do aluno: ");
				turma.liberacaoPai(leitor.nextInt());
				
				break;
			}
			case 4:
			{
				System.out.println("***Verificar se aluno se encontra liberado***\n");
				System.out.print("\nDigite a matrícula do aluno: ");
				turma.alunoLiberado(leitor.nextInt());
				break;
			}
			case 5:
			{
				turma.exibeTurma();
				break;
			}
			case 9:
			{
				System.out.println("\n-----Finalizando programa.----");
				break;
			}
			default:
				System.out.println("Valor não encontrado: " + aux);
				break;
			} // fim do switch
			
			
		}while (aux != 9);
		leitor.close();
	
	}

}
