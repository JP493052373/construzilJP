package part1;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private String nome;
	private String tipo;
	private String cpf;
	private String bairro;
	
private List<Pessoa> geral;

	public Project() {
		this.geral = new ArrayList<Pessoa>();
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getBairro() {
		return  bairro;
	}
	
	public void setBairro(String Bairro) {
		this.bairro = bairro;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public List<Pessoa> getGeral() {
		return geral;
	}
	
	public void addIntegrante(Pessoa geral) {
		this.geral.add(geral);
	}

}
