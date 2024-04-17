package view;

import controller.ControleFuncionario;
import model.Funcionario;

public class Main {

	    public static void main(String[] args) {

	        Funcionario funcionario1 = ControleFuncionario.contrataFuncionario(1, "Ana", 2000.00, "TempoIntegral", 40);
	        Funcionario funcionario2 = ControleFuncionario.contrataFuncionario(2, "Maria", 1500.00, "TempoParcial", "08:00", "16:00");
	        Funcionario funcionario3 = ControleFuncionario.contrataFuncionario(3, "Silvia", 1800.00, "Temporario", 31, 12, 2022);

	        // Imprimindo informa��es dos funcion�rios
	        System.out.println("Funcion�rio 1:");
	        System.out.println("Tipo de contrato: " + funcionario1.tipoContrato());
	        System.out.println("ID: " + funcionario1.getId());
	        System.out.println("Nome: " + funcionario1.getNome());
	        System.out.println("Sal�rio: " + funcionario1.getSalario());
	        System.out.println("-----------------------------------------------------------------------------------------------------------" );

	        System.out.println("\nFuncion�rio 2:");
	        System.out.println("Tipo de contrato: " + funcionario2.tipoContrato());
	        System.out.println("ID: " + funcionario2.getId());
	        System.out.println("Nome: " + funcionario2.getNome());
	        System.out.println("Sal�rio: " + funcionario2.getSalario());
	        System.out.println("-----------------------------------------------------------------------------------------------------------" );
	        System.out.println("\nFuncion�rio 3:");
	        System.out.println("Tipo de contrato: " + funcionario3.tipoContrato());
	        System.out.println("ID: " + funcionario3.getId());
	        System.out.println("Nome: " + funcionario3.getNome());
	        System.out.println("Sal�rio: " + funcionario3.getSalario());
	        System.out.println("-----------------------------------------------------------------------------------------------------------" );
	    }
	}