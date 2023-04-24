package part1;



public class Projeto extends Pessoa  {
	private String cp;
	private String datefim;
	private String dateini;
	private String estado;
	private String cte;
	private String custo;
    private String avaliacao;
	
	public String getCusto() {
		return custo;
	}

	public void setCusto(String custo) {
		this.custo = custo;
	}


	
	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}  

	public String getDatefim() {
		return datefim;
	}

	public void setDatefim(String string) {
		this.datefim = string;
	}

	public String getDateini() {
		return dateini;
	}

	public void setDateini(String string) {
		this.dateini = string;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCte() {
		return cte;
	}

	public void setCte(String cte) {
		this.cte = cte;
	}
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String string) {
		this.avaliacao = string;
	}
	
	

	public String toString() {
		return super.toString() + "Codigo do projeto: " + this.cp + "\n"+ "Estado:"+ this.estado+ "\n"+ "Data de inicio: " + this.dateini + "\n"+ "Data de fim: "+ this.datefim + "\n"+ "Avaliação:"+ this.avaliacao + "\n"+ "Nome do Construtor encarregado:"+ this.cte+ "\n"+"Custo:"+ this.custo+ "\n" ;                        
	}

	@Override
	public String getRegistro() {
		// TODO Auto-generated method stub
		return "Registro do Projeto";
	}

	

}
