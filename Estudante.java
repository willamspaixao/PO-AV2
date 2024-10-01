package avaliacao2;

public class Estudante extends Pessoa{
	private String emailResponsavel;
	private int matricula;
	private boolean liberado;
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}
	
	public boolean isLiberado() {
		return liberado;
	}

	public void setLiberado(boolean liberado) {
		this.liberado = liberado;
	}

	public Estudante(String nome, String cpf, String email, int matricula, String emailResponsavel) {
		super(nome, cpf, email);
		this.matricula = matricula;
		this.emailResponsavel = emailResponsavel;
		this.liberado= false;
	}

	public Estudante() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Estudante [Nome: "+getNome() +", E-mail Responsavel: " + emailResponsavel + ", matricula: " + matricula + ", liberado:" + liberado
				+ ", Email: " + getEmail() + "]\n";
	}


	
}
