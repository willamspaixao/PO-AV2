package avaliacao2;
import java.util.ArrayList;
import java.util.Scanner;
public class Turma {
	
	private int anoTurma;
	private ArrayList<Estudante> estudantes = new ArrayList<>();
	Curso curso= new Curso();
	public int getAnoTurma() {
		return anoTurma;
	}
	public void setAnoTurma(int anoTurma) {
		this.anoTurma = anoTurma;
	}
	public Curso getCurso() {
		return curso;
	}
	
	public void ativaCurso() {
		curso.setAtivo(true);
	}
	
	public void inativaCurso() {
		curso.setAtivo(false);
	}
	
	public Turma()
	{
		
	}
	
	
	public Turma(int anoTurma, ArrayList<Estudante> estudantes, Curso curso) {
		this.anoTurma = anoTurma;
		this.estudantes = estudantes;
		this.curso = curso;
	}
	public Turma(int anoTurma)
	{
		this.anoTurma = anoTurma;
	}
	
	public boolean estaVazia()
	{
		if(estudantes==null) 
			return true;
		else
			return false;
	}
	
	public boolean existeMatricula(int matricula)
	{
		boolean ret = false;
		for (int j = 0; j < this.estudantes.size(); j++) {
			if(matricula== estudantes.get(j).getMatricula())
				return true;
		}
		return ret;
	}
	public int buscaEstudante(int matricula) {
		int i=0;
		do {
			if(matricula== estudantes.get(i).getMatricula())
				return i;
			else
				i++;
		}while(i<estudantes.size());
		System.out.println("Estudante não localizado.");
		return -1;
	}
	
	public void adicionaEstudante(String nome, String cpf, String email, int matricula, String emailR) {	
		Estudante aux = new Estudante(nome, cpf, email, matricula, emailR);
		if( existeMatricula(matricula))  {
			System.out.println("Estudante com matrícula "+matricula+" já se encontrava cadastrado na turma! ");;
		}
		else{
			estudantes.add(aux);
			System.out.println("Estudante cadastrado!");
		}
	}
	public void adicionaEstudante() {
		Scanner leitor = new Scanner(System.in);
		int numero;
		Estudante temp = new Estudante();
		System.out.println("Cadastrando aluno");
		System.out.print("Digite o nome do aluno: ");
		temp.setNome(leitor.next());
		System.out.print("Digite o CPF do aluno: ");
		temp.setCpf(leitor.next());
		System.out.print("Digite o e-mail do aluno: ");
		temp.setEmail(leitor.next());
		System.out.print("Digite a matrícula do aluno: ");
		numero=leitor.nextInt();
		if ( existeMatricula(numero)) {
			System.out.println("Estudante com matrícula "+numero+" já se encontrava cadastrado na turma! ");;
		}
		else
		{
			temp.setMatricula(numero);
			System.out.print("Digite o e-mail do responsável: ");
			temp.setEmailResponsavel(leitor.next());
			estudantes.add(temp);
			System.out.println("Cadastro efetuado com sucesso.");
		}
		//leitor.close();

	}
	public void liberacaoPai(int matricula) {
		int aux=buscaEstudante(matricula); 
		if(aux>=0) {
			estudantes.get(aux).setLiberado(true);
			System.out.println("Estudante liberado pelo responsável");
		}
		else
			System.out.println("Não foi possível liberar o estudante.");
	}
	public void buscaMatricula(String cpf) {
		int i=0;
		do {
			if(cpf.equalsIgnoreCase(estudantes.get(i).getCpf()))
			{
				System.out.println("A matrícula do estudante "+estudantes.get(i).getNome()+" é: "+estudantes.get(i).getMatricula()+".\n");
				return;
			}
			else
				i++;
		}while(i<estudantes.size());
		System.out.println("Estudante não localizado.");
	}
	
	@Override
	public String toString() {
		return "Turma [Ano da turma=" + anoTurma + ", estudantes: " + estudantes + " , Curso: " + curso + "]";
	}
	
	public void alunoLiberado(int matricula)
	{
		int aux=buscaEstudante(matricula); 
		if(estudantes.get(aux).isLiberado() == true) {
			System.out.println("\nEstudante liberado pelo responsável, podendo sair.");
		}
		else
			System.out.println("\nEstudante não possui liberação para saída.");
	}
	public void exibeTurma()
	{
		System.out.print("\nTurma: "+getAnoTurma() +" do curso "+getCurso().getNome() +"\nAlunos: ");
		for (int i = 0; i < estudantes.size(); i++) {
			System.out.print("\n"+estudantes.get(i).getNome()+", matrícula: "+estudantes.get(i).getMatricula()+".");
		}
		
	}
}
