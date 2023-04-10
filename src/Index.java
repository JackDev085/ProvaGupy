import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		// questão 1
		System.out.println("questão 1");
		int indice = 13;
		int soma = 0;
		int k = 0;

		while (k < indice) {
			k = k + 1;
			soma = soma + k;
		}
		// questão 2
		System.out.println();
		System.out.println(soma);
		System.out.println();

		System.out.println("questão 2");
		int num1 = 1, num2 = 0;

		System.out.println(num2);
		System.out.println(num1);

		for (int i = 0; i < 8; i++) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			System.out.println(num1);
		}

		// questão 3
		System.out.println();
		System.out.println("Questão 3");
		System.out.println();

		// declarando as variáveis
		double menorFaturamentoDeUmDia = 20000;// adicionei um valor maior para que pudesse ser adicionado o primeiro
												// valor
		double maiorFaturamentoDeUmDia = 0;
		double numeroDeDiasFaturamentoMedia = 0;
		double[] faturamento = { 700.20, 300.60, 200.98, 800.27, 400.12, 600.45, 800.12, 300.23, 900.34, 50.23 };
		int diasFaturamentoAcimaMedia = 0;

		for (int f = 0; f < faturamento.length; f++) {

			if (faturamento[f] < menorFaturamentoDeUmDia) {
				menorFaturamentoDeUmDia = faturamento[f];
			} else if (faturamento[f] > maiorFaturamentoDeUmDia) {
				maiorFaturamentoDeUmDia = faturamento[f];
			}
			numeroDeDiasFaturamentoMedia += faturamento[f];

		}
		numeroDeDiasFaturamentoMedia = numeroDeDiasFaturamentoMedia / 10;

		for (int f = 0; f < faturamento.length; f++) {

			if (faturamento[f] > numeroDeDiasFaturamentoMedia) {
				diasFaturamentoAcimaMedia++;
			}

		}

		System.out.println("Menor faturamento de um dia: " + menorFaturamentoDeUmDia);

		System.out.println("Maior faturamento de um dia: " + maiorFaturamentoDeUmDia);

		System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: "
				+ diasFaturamentoAcimaMedia + " Dias");

		// questao 4
		System.out.println();
		System.out.println("questao 4");
		System.out.println();

		/*
		 * SP – R$67.836,43 RJ – R$36.678,66 MG – R$29.229,88 ES – R$27.165,48 Outros –
		 * R$19.849,53
		 */

		double sp = 67836.33;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;

		double percentualSp;
		double percentualRj;
		double percentualMg;
		double percentualEs;
		double percentualOutros;

		double total = sp + rj + mg + es + outros;

		percentualSp = (sp * 100) / total;
		percentualRj = (rj * 100) / total;
		percentualMg = (mg * 100) / total;
		percentualEs = (es * 100) / total;
		percentualOutros = (outros * 100) / total;
		System.out.println(
				"percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.");
		System.out.println("São Paulo: " + String.format(" %.2f", percentualSp) + "%");
		System.out.println("Rio de janeiro: " + String.format(" %.2f", percentualRj) + "%");
		System.out.println("Minas Gerais: " + String.format(" %.2f", percentualMg) + "%");
		System.out.println("Espito Santo: " + String.format(" %.2f", percentualEs) + "%");
		System.out.println("Percentual de outras localidades: " + String.format(" %.2f", percentualOutros) + "%");

	}

}
