package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiadeDescontos = new Maisde5Itens(
							new MaiorQue500(
							new SemDesconto()));

		return cadeiadeDescontos.efetuarCalculo(orcamento);
	}
}
