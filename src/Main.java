import models.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ///region Instancio un producto de cada tipo
        Chair chair1 = new Chair("Vintage", 6, 10000d, 4);
        Desk desk1 = new Desk("Ombu", 3, 20000d, 1.0d, 1.5d);
        Printer printer1 = new Printer("HH1", 3, 90000d, "Epson", 30);
        Notebook notebook1 = new Notebook("HR4", 3, 1500000d, "HP", 50);
        //endregion

        //region Creo la lista de productos
        List<Products> productsList = new ArrayList<>();
        productsList.add(chair1);
        productsList.add(desk1);
        productsList.add(printer1);
        productsList.add(notebook1);
        System.out.println("_______________________________________________________________________________________");
        //endregion

        //region Muestro la lista
        System.out.println(">>>>>>>>>>>>>>>>> Muestro la lista de productos <<<<<<<<<<<<<<<<<<<<");
        productsList.forEach(lista -> System.out.println(lista.toString()));
        System.out.println("_______________________________________________________________________________________");
        //endregion

        //region Creo un escritorio mas y muestro solo los escritorios para demostrar como mostrar solo las instancias de la clase Desk
        System.out.println(">>>>>>>>>>>>> Lista de Escritorios <<<<<<<<<<<<<<<<<<<<");
        Desk desk2 = new Desk("Grande", 3, 50000d, 1d, 3d);
        productsList.add(desk2);
        for (Products p : productsList) {
            if (p instanceof Desk) {
                System.out.println(p);
            }
        }
        System.out.println("_______________________________________________________________________________________");
        //endregion

        //region Aplico descuento a una silla
        System.out.println(">>>>>>>>>>>>>>>>>>>> Descuento de la silla <<<<<<<<<<<<<<<<<<<<<");
        for (Products p : productsList) {
            if (p instanceof Chair) {
                System.out.println("Precio sin descuento de la silla '" + p.getProductName() + "' = [" + p.getPrice() + "]");
                Double newPrice = ((Chair) p).discount(20d);
                System.out.println("Precio con descuento de la silla '" + p.getProductName() + "' = [" + newPrice + "]");
            }
        }
        System.out.println("_______________________________________________________________________________________");
        //endregion

        //region Aplico descuento a una impresora
        System.out.println(">>>>>>>>>>>>>>>>>>>> Descuento de Impresora <<<<<<<<<<<<<<<<<<<<<");
        for (Products p : productsList) {
            if (p instanceof Printer) {
                System.out.println("Precio sin descuento de la Impresora '" + p.getProductName() + "' = [" + p.getPrice() + "]");
                Double newPrice = ((Printer) p).discount(15d);
                System.out.println("Precio con descuento de la Impresora '" + p.getProductName() + "' = [" + newPrice + "]");
            }
        }
        System.out.println("_______________________________________________________________________________________");
        //endregion

        //region Actualizacion de precios
        System.out.println(">>>>>>>>>>>>>>> Actualizacion de precios de los productos <<<<<<<<<<<<<");
        productsList.forEach(Products::priceUpdate);
        System.out.println("_______________________________________________________________________________________");
        //endregion
    }
}