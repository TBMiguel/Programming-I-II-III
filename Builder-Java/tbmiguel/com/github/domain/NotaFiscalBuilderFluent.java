package tbmiguel.com.github.domain;

import java.util.Date;
import java.util.List;

import tbmiguel.com.github.domain.interfaces.INotaFiscalBuilderFluent;
import tbmiguel.com.github.types.Chave;
import tbmiguel.com.github.types.Numero;

public class NotaFiscalBuilderFluent implements INotaFiscalBuilderFluent{
	private Date dataEmissao;
	private Numero numero;
	private Chave chave;
	private Emissor emissor;
	private Cliente cliente;
	private List<Produto> listaProdutos;

	@Override
	public NotaFiscalBuilderFluent setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;		
		return this;
	}

	@Override
	public NotaFiscalBuilderFluent setNumero(Numero numero) {
		this.numero = numero;
		return this;
		
	}

	@Override
	public NotaFiscalBuilderFluent setChave(Chave chave) {
		this.chave = chave;
		return this;
	}

	@Override
	public NotaFiscalBuilderFluent setEmissor(Emissor emissor) {
		this.emissor = emissor;
		return this;
	}

	@Override
	public NotaFiscalBuilderFluent setCliente(Cliente cliente) {
		this.cliente = cliente;	
		return this;
	}

	@Override
	public NotaFiscalBuilderFluent setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
		return this;
	}
	
	public NotaFiscal gera() {
		return new NotaFiscal(this.dataEmissao, this.numero, this.chave, this.emissor, this.cliente, this.listaProdutos);
	}
	
	public static NotaFiscalBuilderFluent builder() {
		return new NotaFiscalBuilderFluent();
	}
}
