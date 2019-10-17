import java.util.ArrayList;

class EmpresaModel
{
	ArrayList<Bem> bens;

	EmpresaModel() {
		this.bens = new ArrayList<Bem>();
	}
}

class EmpresaView
{
	// Métodos de ArrayList: https://www.javatpoint.com/java-arraylist
	// add(element)
}

class EmpresaController
{
	EmpresaModel model;
	EmpresaView view;

	int getQuantidadeDeBens() {
		return this.bens.size();
	}

	void addBem(Bem bem) {
		this.bens.add(bem);
	}
}
