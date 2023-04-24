package part1;


import java.io.File;

public abstract class Pessoa {
	
	
		private String nome;
		private String cidade;
		private String bairro; 
		private String cod;
		private String cpf;
		private String status;
		
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getCidade() {
			return cidade;
		}
		
		public void setCidade1(String cidade) {
			this.cidade = cidade;
		}
		public String getBairro() {
			return bairro;
		}
		
		public void setBairro1(String bairro) {
			this.bairro = bairro;
		}
		public String getCod() {
			return cod;
		}
		
		public void setCod1(String cod) {
			this.cod = cod;
		}
		public String getCpf() {
			return cpf;
		}
		
		public void setCpf1(String cpf) {
			this.cpf = cpf;
		}
		
		public String getStatus() {
			return status;
		}
		
		public void setStatus1(String status) {
			this.status = status;
		}
		
		
		
		
		public String toString() {
			
			return String.format("Nome: %s\nCidade: %s\nBairro: %s\nCod: %s\nCpf: %s\nStatus: %s\n", this.nome, this.cidade, this.bairro, this.cod, this.cpf, this.status);
		}
		
		
		public abstract String getRegistro();
		
	

		public void setCod(String string) {
			// TODO Auto-generated method stub
			
		}
           
		public void setCpf(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setPedido(String string) {
			// TODO Auto-generated method stub
		
			
		}

		public void setPedido1(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setBairro(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setCidade(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setStatus(String string) {
			// TODO Auto-generated method stub
			
		}

	
           
	}


