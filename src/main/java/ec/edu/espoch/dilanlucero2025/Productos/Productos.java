/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.dilanlucero2025.Productos;

/**
 *
 * @author USUARIO
 */
public class Productos {

    private String nombreP;
    private double precio;
    private Categorias categoria;
    private double PrecioPro;

    public Productos(String nombreP, double precio, Categorias categoria) {
        this.nombreP = nombreP;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    private double PrecioIva;

    public Productos(double PrecioIva) {
        this.PrecioIva = PrecioIva;
    }

    public double getPrecioIva() {
        return PrecioIva;
    }

    public void setPrecioIva(double PrecioIva) {
        this.PrecioIva = PrecioIva;
    }

    public void ObProductos(double PrecioPro) {
        PrecioIva = PrecioPro * 0.12 + PrecioPro;
    }

}
