package dominio;

public class ProductosContratados {

	

	private boolean seguroCasa;
	
	private boolean nomina;
	
	private boolean seguroVida;
	

	public ProductosContratados() {}
	
	public ProductosContratados(boolean seguroCasa, boolean nomina, boolean seguroVida) {
		
		this.seguroCasa = seguroCasa;
		this.nomina = nomina;
		this.seguroVida = seguroVida;
	}
	
	public boolean isSeguroCasa() {
		return seguroCasa;
	}

	public void setSeguroCasa(boolean seguroCasa) {
		this.seguroCasa = seguroCasa;
	}

	public boolean isNomina() {
		return nomina;
	}

	public void setNomina(boolean nomina) {
		this.nomina = nomina;
	}

	public boolean isSeguroVida() {
		return seguroVida;
	}

	public void setSeguroVida(boolean seguroVida) {
		this.seguroVida = seguroVida;
	}


}
