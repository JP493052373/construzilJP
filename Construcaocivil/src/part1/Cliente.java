package part1;


public  class Cliente  extends Pessoa    {
	
	private String pedido;
	private String orcamento;
	

	
	

	
	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	
	public String getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(String string){
		 this.orcamento = string;
	}

	

	@Override
	public String toString(){
		return super.toString() + "Pedido: " + this.pedido + "\n"+ "Orçamento:"+ this.orcamento+ "\n" ;
	}
	

	@Override
	public String getRegistro() {
		// TODO Auto-generated method stub
		return "Registro do Cliente";
	}

	

	

	

}
