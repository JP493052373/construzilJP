package part1;

public class Formacao  extends Pessoa {
	private String pf;
	private String datefim;
	private String dateini;
	private String local;
	private String curso;
	private String nivel;
	
	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPf() {
		return pf;
	}

	public void setPf(String pf) {
		this.pf = pf;
	}
	public String getDateini() {
		return dateini;
	}

	public void setDateini(String string) {
		this.dateini = string;
	}
	public String getDatefim() {
		return datefim;
	}

	public void setDatefim(String string) {
		this.datefim = string;
	}
	
	public String toString() {
		return super.toString() + "Curso: " + this.curso + "\n"+ "Codigo do Profissional:"+ this.pf + "\n" + "Local: "+this.local +"\n"+ "Data de inicio: " + this.dateini + "\n"+ "Data de fim: "+ this.datefim + "\n"+ "Nivel do Curso:"+ this.nivel + "\n"   ;
	}
	
	

	@Override
	public String getRegistro() {
		// TODO Auto-generated method stub
		return "Registro de Formação";
	}

}
