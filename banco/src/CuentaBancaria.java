public class CuentaBancaria {

    //Atributos
    private double saldo;
    //Getters y setters

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //constructors

    public CuentaBancaria() {
        this.saldo = 0;
    }

    //funciones

    public double ingresarDinero(double dinero){

        this.saldo = this.saldo + dinero;
        return this.saldo;
    }

    /**
     * No se puede quedar la cuenta en negativo.
     * Si se intenta retirar mas dinero del disponible revuelve -1
     * @param dinero
     * @return
     */
    public double retirarDinero(double dinero){
        if(this.saldo - dinero > 0 ){
            this.saldo = this.saldo - dinero;
            return this.saldo;
        }else{
            return -1;
        }

    }
}
