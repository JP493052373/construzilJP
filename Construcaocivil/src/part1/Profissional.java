package part1;
public class Profissional extends Pessoa {
	
	
	private String estado;
	private String empresa;
	private String cargo;

	
	

	
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + String.format("Estado:  %s\nEmpresa: %s\nCargo: %s\n",  this.estado,  this.empresa, this.cargo);
	}
	

	
	
	
	
	
	
	
	
	
	

	@Override
	public String getRegistro() {
		// TODO Auto-generated method stub
		return "Registro do Profissional";
	}

}
