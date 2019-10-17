// Localização do bem
class CategoriaModel
{
	String nome_da_categoria;
	String descricao_da_categoria;
	long codigo_da_categoria;

	Categoria(String nome_da_categoria,
	          String descricao_da_categoria,
	          long codigo_da_categoria) {
		this.nome_da_categoria      = nome_da_categoria;
		this.descricao_da_categoria = descricao_da_categoria;
		this.codigo_da_categoria    = codigo_da_categoria;
	}

	// Acessores
	String getNomeDaCategoria() {
		return this.nome_da_categoria;
	}
	String getDescricaoDaCategoria() {
		return this.descricao_da_categoria;
	}
	long getCodigoDaCategoria() {
		return this.codigo_da_categoria;
	}
	void setNomeDaCategoria(String nome_da_categoria) {
		this.nome_da_categoria = nome_da_categoria;
	}
	void setDescricaoDaCategoria(String descricao_da_categoria) {
		this.descricao_da_categoria = descricao_da_categoria;
	}
	void setCodigoDaCategoria(int codigo_da_categoria) {
		this.codigo_da_categoria = codigo_da_categoria;
	}
}

class CategoriaController
{

}
