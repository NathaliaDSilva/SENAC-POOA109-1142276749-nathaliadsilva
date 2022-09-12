package adoHeranca01;

/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//
/*
 
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Adicione o atributo limite do tipo double e o encapsule 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) 
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o CPMF devido.
 */
public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(double saldoInicial, String num, Cliente tit, Agencia ag, double limite) {
		super(saldoInicial, num, tit, ag);
		this.limite = limite;
	}

	public void imprimirDadosContaEspecial() {
		super.imprimeDados();
		System.out.println("CONTA ESPECIAL");
		System.out.println("Limite: R$ " + limite);
		System.out.println("========================================");
	}

	public void saqueContaEspecial(double valor) {
		super.saque(valor);
		double resto = (saldo - valor) * (-1);
		if (resto > 0) {
			if (resto <= limite) {
				limite -= resto;
				acumularCPMF(resto);
				System.out.println("Saque realizado pelo limite. Valor sacado do limite " + resto
						+ "\nValor disponivel no limite: " + limite);
			} else
				System.out.println("Limite insuficiente");
		}
	}

}
