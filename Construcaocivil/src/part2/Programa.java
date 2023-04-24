package part2;

import part1.Pessoa; 
import part1.Cliente;
import part1.Profissional;
import part1.Formacao;
import part1.Projeto;
import part1.Project;
import part1.Material;
import part1.Obra1;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa cli = new Cliente();
		
		cli.setNome("Pablo");
	    cli.setCod1("1123421");
		cli.setCidade1(" Niterói RJ");
	    cli.setBairro1("Boa Viagem");
	    cli.setStatus1("Cliente");
	    cli.setPedido("Construção de uma casa");
	    cli.setCpf1("223.456.124-56");
	    ((Cliente) cli).setOrcamento("45.000");
	    
	    
	    
	    
	    System.out.println( cli.toString() );
	    
	    Profissional pro = new Profissional();
	    pro.setNome("Gustavo");
	    pro.setCod1("12453325");
	    pro.setCpf1("134.567.543-23");
	    pro.setBairro1("Cosme Velho");
	    ((Profissional) pro).setEstado("Rio de Janeiro");
	    pro.setCidade1(" Niterói RJ");
	    ((Profissional) pro).setEmpresa("Construzil");
	    ((Profissional) pro).setCargo("Construtor Chefe");
	    pro.setStatus1("Construtor");
	    
	    System.out.println( pro.toString() );
	   
	    Formacao form = new Formacao();
	    
	    form.setNome("Gustavo");
	    form.setCpf1("134.567.543-23");
	    form.setBairro1("Ilha do Fundão");
	    form.setCidade1(" Rio de Janeiro");
		form.setCurso("Curso Gestão de cunstrução de obras");
		form.setCod1("1332445");
		((Formacao) form).setPf("1785903");
		form.setLocal("Universidade CTRJ ");
		form.setDateini("20-5-2012");
		form.setDatefim("20-7-2015");
		form.setNivel("Nivel Superior");
		form.setStatus1("Formado");
		
		 System.out.println( form .toString() );
		 
		 Projeto proj = new Projeto();
		 
		    proj.setCod1("12453325");
		    proj.setNome("Projeto Casa");
		    proj.setEstado("Rio de janeiro");
			proj.setCidade1(" Niterói RJ");
			proj.setBairro1(" Boa Viagem");
			proj.setDateini("21-4-2019");
			proj.setDatefim("4-9-2022");
			proj.setAvaliacao("100 Porcento completo");
			proj.setStatus1("completo");
			proj.setCpf1("134.567.543-23");
			((Projeto) proj).setCp("1299345");
			((Projeto) proj).setCte("Gustavo");
			((Projeto) proj).setCusto("25000");
		
		System.out.println(proj.toString());
		
		Obra1 a1 = new Obra1();
			System.out.println("Orçamento da Casa:"+ "\n" + a1.getOrcamento()+ ""+"R$");
			System.out.println("Custo de Tudo:"+ "\n"+ a1.getCusto()+ ""+"R$");
			System.out.println("Lucro Do Gustavo:");
			System.out.println( a1.getOrcamento() - a1.getCusto()+ ""+"R$");
	
	
	
	
	
	
		
		
	    
	   
	    
	    

		
		

	}

}
