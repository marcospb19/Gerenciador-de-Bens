
class Main
{
	public static void main(String[] args) {
		System.out.println("Hey");
		EmpresaModel empresa = new EmpresaModel();

		empresa.addBem(new Bem("casa" , "casa do campo" , 0));
		System.out.println(empresa.getQuantidadeDeBens());
	}
}
