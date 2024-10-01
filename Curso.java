package avaliacao2;

public class Curso {
	private String codigo, nome;
	private boolean ativo;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Curso(String codigo, String nome, boolean ativo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.ativo = ativo;
	}
	public Curso() {
		
	}
	
	
	
	
}
