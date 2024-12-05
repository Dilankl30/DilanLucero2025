/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.dilanlucero2025;

import ec.edu.espoch.dilanlucero2025.Productos.Categorias;
import ec.edu.espoch.dilanlucero2025.Productos.Productos;

/**
 *
 * @author USUARIO
 */
public class DilanLucero2025 {

    public static void main(String[] args) {

        Productos objCafeteria = new Productos("Coca Cola", 10.5, Categorias.Bebida);
        objCafeteria.ObProductos(15);
        System.out.println("Precio sin Iva:" + objCafeteria.getPrecio());
        System.out.println("Precio con iva:" + objCafeteria.getPrecioIva());

        objCafeteria.ObProductos(14);

        System.out.println("Producto:" + objCafeteria.getNombreP() + " Categoria: " + objCafeteria.getCategoria());
  System.out.println("Precio sin Iva:" + objCafeteria.getPrecio());
        System.out.println("Precio con iva:" + objCafeteria.getPrecioIva());
    }
}
