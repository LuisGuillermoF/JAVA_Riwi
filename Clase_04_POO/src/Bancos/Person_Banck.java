package Bancos;

public class Person_Banck {
    private String Titular = "";
    private double Balance =0;

    public Person_Banck(){

    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    @Override
    public String toString(){
        return "Person_Banck" +
                "Titular= " + Titular+"\'" +
                "Balance= "+ Balance+"\'";
    }

}
