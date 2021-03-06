package br.ufrn.imd.lpii.telegram.bot;


class Bem
{
	String nome_do_bem;
	String descricao_do_bem;
	long codigo_do_bem;


	CategoriaModel categoria_do_bem;
	Localizacao localizacao_do_bem;
	
	/*
	Localizacao local = new Localizacao();
	Bem bem = new Bem(asas, asas, asas);
	bem.setLocalizacao(local);
	
	setLocalizacao(Localizacao local){
		this.localizacao_do_bem(local.descricao_da_localizacao, local.nome_da_localizacao);
	}
	*/

	Bem(String nome_do_bem , String descricao_do_bem , long codigo_do_bem) {

		System.out.println(categoria_do_bem.getNomeDaCategoria());

		this.nome_do_bem      = nome_do_bem;
		this.codigo_do_bem    = codigo_do_bem;
		this.descricao_do_bem = descricao_do_bem;
	}

	// Acessores
	String getNomeDoBem() {
		return this.nome_do_bem;
	}
	String getDescricaoDoBem() {
		return this.descricao_do_bem;
	}
	long getCodigoDoBem() {
		return this.codigo_do_bem;
	}
	CategoriaModel getCategoriaDoBem() {
		return this.categoria_do_bem;
	}
	Localizacao getLocalizacaoDoBem() {
		return this.localizacao_do_bem;
	}
	void setNomeDoBem(String nome_do_bem) {
		this.nome_do_bem = nome_do_bem;
	}
	void setDescricaoDoBem(String descricao_do_bem) {
		this.descricao_do_bem = descricao_do_bem;
	}
	void setCodigoDoBem(int codigo_do_bem) {
		this.codigo_do_bem = codigo_do_bem;
	}
	void setCategoriaDoBem(CategoriaModel categoria_do_bem) {
		this.categoria_do_bem = categoria_do_bem;
	}
	void setLocalizacaoDoBem(Localizacao localizacao_do_bem) {
		this.localizacao_do_bem = localizacao_do_bem;
	}
}
