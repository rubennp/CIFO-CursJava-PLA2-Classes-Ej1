package main;

/**
 * 
 * Una clase para guardar empleados.
 * @author Rubèn Nieto
 *
 */
public class Empleado {
	private String nombre, DNI;
	private Double sueldo;
	
	/**
	 * Obtener nombre.
	 * @return el nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Almacenar nombre.
	 * @param nombre es el nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener el DNI.
	 * @return el DNI del empleado.
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Almacenar el DNI.
	 * @param dNI es el DNI del empleado.
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	/**
	 * Obtener el sueldo.
	 * @return el sueldo del empleado.
	 */
	public Double getSueldo() {
		return sueldo;
	}

	/**
	 * Almacenar el sueldo.
	 * @param sueldo es el sueldo del empleado
	 */
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	/**
	 * Obtener el sueldo neto.
	 * @return el sueldo neto (sueldo*.85) del empleado
	 */
	public Double sueldoNeto() {
		return sueldo*.85;
	}
	
	/**
	 * Constructor sin argumentos.
	 */
	public Empleado() {
		this.nombre = "Sin nombre";
		this.DNI = "00000000A";
	}
	
	/**
	 * Constructor con nombre y DNI.
	 * @param nombre es el nombre del empleado creado.
	 * @param dNI es el DNI del empleado creado.
	 */
	public Empleado(String nombre, String dNI) {
		this.nombre = nombre;
		this.DNI = dNI;
	}
}
