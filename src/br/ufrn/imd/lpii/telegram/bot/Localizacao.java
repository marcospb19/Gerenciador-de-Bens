package br.ufrn.imd.lpii.telegram.bot;

// Localização do bem
class Localizacao
{
	String nome_da_localizacao;
	String descricao_da_localizacao;

	Localizacao(String nome_da_localizacao,
	            String descricao_da_localizacao) {
		this.nome_da_localizacao = nome_da_localizacao;
		this.descricao_da_localizacao = descricao_da_localizacao;
	}

	// Acessores
	String getNomeDaLocalizacao() {
		return this.nome_da_localizacao;
	}
	String getDescricaoDaLocalizacao() {
		return this.descricao_da_localizacao;
	}
	void setNomeDaLocalizacao(String nome_da_localizacao) {
		this.nome_da_localizacao = nome_da_localizacao;
	}
	void setDescricaoDaLocalizacao(String descricao_da_localizacao) {
		this.descricao_da_localizacao = descricao_da_localizacao;
	}
}
