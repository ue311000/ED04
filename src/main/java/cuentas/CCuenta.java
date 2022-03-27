package cuentas;

/**
 * Clase CCuenta
 * 
 * @author Xoaquín de Santiago Mallo
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * @param nom Nombre de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }

    /**
     * Devuelve el estado de la cuenta
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa dinero en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Excepción al ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira dinero de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Excepción al retirar una cantidad negativa o sin saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return Nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta Número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return Saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo Saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Tipo de interés de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres Tipo de interés de la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
