package com.rotimatahari;

public class Rekening {
    private double saldo;

    public Rekening(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tarik(double tarik){
//        mengurangi nilai saldo
        this.saldo = saldo - tarik;
    }

    public void setor(double setor){
//        menambahkan nilai saldo
        this.saldo = saldo + setor;
    }

    @Override
    public String toString() {
        return "{" +
                "saldo=" + saldo +
                '}';
    }
}
