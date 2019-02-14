package dominio;

public class DatosFinancieros {

	private double capital;
	private String tipoInteres;
	private String tipoEuribor;
	private double euribor;
	private double diferencial;
	private double interesFijo;
	private double plazoAnyos;
	

	
	public DatosFinancieros() {}
	
	public DatosFinancieros(double capital, String tipoInteres, String tipoEuribor, double euribor, double diferencial,
			double interesFijo, double plazoAnyos) {
		super();
		this.capital = capital;
		this.tipoInteres = tipoInteres;
		this.tipoEuribor = tipoEuribor;
		this.euribor = euribor;
		this.diferencial = diferencial;
		this.interesFijo = interesFijo;
		this.plazoAnyos = plazoAnyos;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public String getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(String tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public String getTipoEuribor() {
		return tipoEuribor;
	}

	public void setTipoEuribor(String tipoEuribor) {
		this.tipoEuribor = tipoEuribor;
	}

	public double getEuribor() {
		return euribor;
	}

	public void setEuribor(double euribor) {
		this.euribor = euribor;
	}

	public double getDiferencial() {
		return diferencial;
	}

	public void setDiferencial(double diferencial) {
		this.diferencial = diferencial;
	}

	public double getInteresFijo() {
		return interesFijo;
	}

	public void setInteresFijo(double interesFijo) {
		this.interesFijo = interesFijo;
	}

	public double getPlazoAnyos() {
		return plazoAnyos;
	}

	public void setPlazoAnyos(double plazoAnyos) {
		this.plazoAnyos = plazoAnyos;
	}


}
