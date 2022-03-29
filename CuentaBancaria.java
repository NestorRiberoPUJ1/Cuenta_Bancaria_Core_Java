class CuentaBancaria {

    private double saldoAhorros;
    private double saldoCorriente;

    private static int cantidadCuentas = 0;
    private static double cantidadDinero = 0;

    public CuentaBancaria() {
        this.saldoAhorros = 0;
        this.saldoCorriente = 0;
        CuentaBancaria.cantidadCuentas++;
        CuentaBancaria.cantidadDinero += (this.saldoAhorros + this.saldoCorriente);
    }

    public CuentaBancaria(double saldoAhorros, double saldoCorriente) {
        this.saldoAhorros = saldoAhorros;
        this.saldoCorriente = saldoCorriente;
        CuentaBancaria.cantidadCuentas++;
        CuentaBancaria.cantidadDinero += (this.saldoAhorros + this.saldoCorriente);
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public double getSaldoCorriente() {
        return saldoCorriente;
    }

    public void addSaldoAhorros(double amount) {
        this.saldoAhorros += amount;
        CuentaBancaria.cantidadDinero += amount;
    }

    public void addSaldoCorriente(double amount) {
        this.saldoCorriente += amount;
        CuentaBancaria.cantidadDinero += amount;
    }

    public void retireSaldoAhorros(double amount) {
        if (this.saldoAhorros >= amount) {
            this.saldoAhorros -= amount;
            CuentaBancaria.cantidadDinero -= amount;
        }

    }

    public void retireSaldoCorriente(double amount) {
        if (this.saldoCorriente >= amount) {
            this.saldoCorriente -= amount;
            CuentaBancaria.cantidadDinero -= amount;
        }
    }

    public double getSaldoCombinado()
    {
        return (saldoCorriente+saldoAhorros);
    }
}