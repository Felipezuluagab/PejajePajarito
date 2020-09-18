/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author b03s208
 */
public class Vehiculos  {
    
    private String tipo;
    private String placa;
    private String marca;
    private double valorpeaje;
    
    public Vehiculos(){
        
    }

    public Vehiculos(String tipo, String placa, String marca, double valorpeaje) {
        this.placa = placa;
        this.marca = marca;
        this.valorpeaje = valorpeaje;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorpeaje() {
        return valorpeaje;
    }

    public void setValorpeaje(double valorpeaje) {
        this.valorpeaje = valorpeaje;
    }

    @Override
    public String toString() {
         return "{\n" +"\""+ tipo + "\""+":{\n \"placa\":" + placa + "\","+ "\n \"marca\":"+  marca + "\","+ "\n \"valor\":" + valorpeaje + "\n }"+"\n}"; 
    }
    
    
    
    
}
