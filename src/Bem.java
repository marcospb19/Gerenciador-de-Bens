

class Bem
{
	String nome_do_bem;
	String descricao_do_bem;
	long codigo_do_bem;


	Categoria categoria_do_bem;
	Localizacao localizacao_do_bem;

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
	Categoria getCategoriaDoBem() {
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
	void setCategoriaDoBem(Categoria categoria_do_bem) {
		this.categoria_do_bem = categoria_do_bem;
	}
	void setLocalizacaoDoBem(Localizacao localizacao_do_bem) {
		this.localizacao_do_bem = localizacao_do_bem;
	}
}
