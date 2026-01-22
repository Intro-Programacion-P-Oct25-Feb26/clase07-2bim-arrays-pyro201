package paquete01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author reroes
 */

import java.util.ArrayList;
import paquete02.Establecimiento;
import paquete03.Pedido;
import paquete03.Ubicacion;
import paquete04.Operacion;
import paquete05.Informe;
import paquete06.Reporte;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> misCafeterias = Establecimiento.obtenerCafeterias();/*
        esta funcion pide obtener los nombres de las cafeterias y las almacena 
        en un Array
        */
        ArrayList<ArrayList<Integer>> misPedidos = Pedido.obtenerPedidos();/*
        aqui se asigna los cafes vendidos y los almacena en un  Array
        */
        ArrayList<String> misSedes = Ubicacion.obtenerUbicaciones();/*
        se asigna la ubicacion de los cafes y los almacena en un  Array
        */
        ArrayList<Double> promedioSemanal = Operacion.obtenerPromedioSemanal(misPedidos);/*
        calcula el promediop de cafes vendidos en cada cafeteria y los almacena
        en un  Array
        */
        int pedidosMiercoles = Informe.obtenerTotalDia(misPedidos, 3);/*
        suma el total de cafes vendidos el dia miercoles
        */
        int sumaPedidosTotal = Operacion.obtenerSumaTotal(misPedidos);/*
        raliza una suma de todos los cafes vendidos en toda la semana
        */
        String cafeteriaMasPedida = Informe.obtenerCafeteriaMasPedidos(misPedidos, misCafeterias);/*
        aqui se verifica cual es la cafeteria que registro mas pedidos en la semana
        y la retorna 
        */
        ArrayList<Integer> pedidosMenores = Informe.obtenerMenorPedidoCafeteria(misPedidos);/*
        verifica cual es la menor cantidad de pedidos realizados en cada 
        cafeteria y los almacena en un  Array
        */
        ArrayList<Integer> pedidosMayores = Informe.obtenerMayorPedidoCafeteria(misPedidos);/*
        verifica cual es la mayor cantidad de pedidos realizados en cada 
        cafeteria y los almacena en un  Array
        */
        Reporte.imprimirReporte(misCafeterias, misSedes, 
                promedioSemanal, 
                pedidosMenores, 
                pedidosMayores, 
                pedidosMiercoles, 
                cafeteriaMasPedida);/*
        se uriliza para imprimir todos los datos y un reporte general
        */
    }
    
}
