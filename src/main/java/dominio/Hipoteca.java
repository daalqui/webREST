package dominio;

public class Hipoteca {

	private int idHipoteca;
	private String nombre;
	private String ape1;
	private String ape2;
	private String nif;
	private int edad;
	private String telefono;
	private String email;
	private double ingresosMensuales;
	
	private double cuotaMensual;
	private double interesAplicado;
	
	private DatosFinancieros datosFinancieros = new DatosFinancieros();
	private ProductosContratados productosContratados = new ProductosContratados();
	
	public int getIdHipoteca() {
		return idHipoteca;
	}
	
	public void setIdHipoteca(int idHipoteca) {
		this.idHipoteca = idHipoteca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApe1() {
		return ape1;
	}
	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}
	public String getApe2() {
		return ape2;
	}
	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getIngresosMensuales() {
		return ingresosMensuales;
	}
	public void setIngresosMensuales(double ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}
	public double getCuotaMensual() {
		return cuotaMensual;
	}
	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}
	public double getInteresAplicado() {
		return interesAplicado;
	}
	public void setInteresAplicado(double interesAplicado) {
		this.interesAplicado = interesAplicado;
	}
	

	public DatosFinancieros getDatosFinancieros() {
		return datosFinancieros;
	}

	public void setDatosFinancieros(DatosFinancieros datosFinancieros) {
		this.datosFinancieros = datosFinancieros;
	}

	public ProductosContratados getProductosContratados() {
		return productosContratados;
	}

	public void setProductosContratados(ProductosContratados productosContratados) {
		this.productosContratados = productosContratados;
	}
}
