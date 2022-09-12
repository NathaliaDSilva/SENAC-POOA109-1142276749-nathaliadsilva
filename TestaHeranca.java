package adoHeranca01;

/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//
/*
* 
* Esta classe e responsavel pelo teste das Herancas desenvolvidas nas classes 
*  Conta e ContaEspecial
* 
* Altere o metodo main fazendo com que sejam criadas 02 contas especiais e 01 conta poupanca. 
* Realize 1 saque na 1a. conta especial cujo valor exceda o saldo mas nao ultrapasse o limite.
* Realize 1 saque na 2a. conta especial cujo valor ultrapasse o saldo e o limite.
* Realize 1 saque na conta poupanca que exceda o saldo.
* Imprima os dados das contas para conferir se estao corretas.
* 
* Dica: Para obter a data do sistema e transformar em String: 
*  String strData = new java.util.Date().toString();
* 
*/
public class TestaHeranca {

	public static void main(String args[]) {
		
		Banco banco = new Banco("POO Bank", 1000);
		Agencia ag1 = new Agencia("001", banco);

		Cliente cliente1 = new Cliente("Jo�o", "1232323");
		Cliente cliente2 = new Cliente("Jose", "987789");

		Conta conta = new Conta(500, "741852", cliente1, ag1); // conta comum
		conta.saque(560);
		conta.imprimeDados();
		System.out.println();

		ContaEspecial contaEsp1 = new ContaEspecial(500, "123456", cliente1, ag1, 400); // 1a. conta especial
		contaEsp1.saqueContaEspecial(560);
		contaEsp1.imprimirDadosContaEspecial();
		System.out.println();

		ContaEspecial contaEsp2 = new ContaEspecial(60, "789123", cliente2, ag1, 100); // 2a. conta especial
		contaEsp2.saqueContaEspecial(400);
		contaEsp2.imprimirDadosContaEspecial();
		System.out.println();

		ContaPoupanca contaPoup = new ContaPoupanca(1500, "123789", cliente2, ag1, "05/09/2022"); // conta poupanca
		contaPoup.imprimirDadosPoupanca();
		System.out.println();

	}
}
