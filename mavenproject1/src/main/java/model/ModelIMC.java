/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Matheus
 */
public class ModelIMC {

    private double imc;
    private String mensagem;

    public void calcularIMC(double peso, double altura) {
        imc = peso / (altura * altura);
        if (peso != 0 && altura != 0) {
            if (imc <= 17) {
                mensagem = ("IMC = " + imc + "\nMuito abaixo do peso");
            } else if (imc > 17 && imc <= 18.49) {
                mensagem = ("IMC = " + imc + "\nAbaixo do peso");
            } else if (imc >= 18.5 && imc <= 24.99) {
                mensagem = ("IMC = " + imc + "\nPeso normal");
            } else if (imc >= 25 && imc <= 29.99) {
                mensagem = ("IMC = " + imc + "\nAcima do peso");
            } else if (imc >= 30 && imc <= 34.99) {
                mensagem = ("IMC = " + imc + "\nObesidade I");
            } else if (imc >= 35 && imc <= 39.99) {
                mensagem = ("IMC = " + imc + "\nObesidade II - severa");
            } else if (imc >= 40) {
                mensagem = ("IMC = " + imc + "\nObesidade III - mórbida");
            }
        } else {
            mensagem = ("Preencha todos campos corretamente!");
        }
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
