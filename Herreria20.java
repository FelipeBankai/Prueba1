/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herreria2.pkg0;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Herreria20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numCliente;
    int eleccion;//para seguir o parar por clinte
    int numProducto;
    int contProducto=0;
    int acumProducto=0;//el monto final del día
    int contTotalVenta=0;
    int compraXPersona=0;//para generar cada boleta de forma independiente
    int acumVentaTotal=0;
    
    int contMartillo=0;
    int contSierra=0;
    int contTijeras=0;
    int contAtornilla=0;
    int contClavos=0;
    int contTornillos=0;
    int contYunque=0;
    int acumMartillo=0;
    int acumSierra=0;
    int acumTijeras=0;
    int acumAtornilla=0;
    int acumClavos=0;
    int acumTornillos=0;
    int acumYunque=0;
    
    int contXMartillo=0;//PARA GENERAR LAS BOLETAS
    int contXSierra=0;
    int contXTijeras=0;
    int contXAtornilla=0;
    int contXClavos=0;
    int contXTornillos=0;
    int contXYunque=0;
    int acumXMartillo=0;
    int acumXSierra=0;
    int acumXTijeras=0;
    int acumXAtornilla=0;
    int acumXClavos=0;
    int acumXTornillos=0;
    int acumXYunque=0;
    
    int cancelar;
    int vuelto;
        System.out.println("La Herrería de Don Adrián");
        System.out.println("Código Producto Precio\n" +
                            "210   Martillo $2.990\n" +
                            "211   Sierra $3.490\n" +
                            "212   Tijeras $1.990\n" +
                            "213   Atornillador $2.390\n" +
                            "214   Clavos $490\n" +
                            "215   Tornillos $990\n" +
                            "216   Yunque $4.090");
    for(int i=1;i<=9999999;i++){
        System.out.println("Cliente "+i+" que desea comprar");
        for(int a=1;a<=9999999;a++){
            System.out.println("Ingrese codigo producto "+a+" o puede salir colocando codigo=0");
            numProducto=sc.nextInt();
            
            if(numProducto==210){//para el martillo
            acumProducto=acumProducto+2990;
            acumXMartillo=acumXMartillo+2990;
            acumMartillo=acumMartillo+2990;
            compraXPersona=compraXPersona+2990;
            contMartillo++;
            contXMartillo++;
            }
            if(numProducto==211){//para la sierra
            acumProducto=acumProducto+3490;
            acumXSierra=acumXSierra+3490;
            acumSierra=acumSierra+3490;
            compraXPersona=compraXPersona+3490;
            contSierra++;
            contXSierra++;
            }
            if(numProducto==212){//para la tijera
            acumProducto=acumProducto+3490;
            acumXTijeras=acumXTijeras+3490;
            acumTijeras=acumTijeras+3490;
            compraXPersona=compraXPersona+3490;
            contTijeras++;
            contXTijeras++;
            }
            if(numProducto==213){//para el atornillador
            acumProducto=acumProducto+2390;
            acumXAtornilla=acumXAtornilla+2390;
            acumAtornilla=acumAtornilla+2390;
            compraXPersona=compraXPersona+2390;
            contAtornilla++;
            contXAtornilla++;
            }
            if(numProducto==214){//para los clavos
            acumProducto=acumProducto+490;
            acumXClavos=acumXClavos+490;
            acumClavos=acumClavos+490;
            compraXPersona=compraXPersona+490;
            contClavos++;
            contXClavos++;
            }
            if(numProducto==215){//para los tornillos
            acumProducto=acumProducto+990;
            acumXTornillos=acumXTornillos+990;
            acumTornillos=acumTornillos+990;
            compraXPersona=compraXPersona+990;
            contTornillos++;
            contXTornillos++;
            }
            if(numProducto==216){//para el yunque
            acumProducto=acumProducto+4090;
            acumXYunque=acumXYunque+4090;
            compraXPersona=compraXPersona+4090;
            contYunque++;
            contXYunque++;
            }
            if(numProducto==0){
                System.out.println("Boleta");
                System.out.println("Nombre del Producto - Cantidad - Precio");
                if(contXMartillo>=1){
                System.out.println("Marillo "+contXMartillo+" "+acumXMartillo);
                }
                if(contXSierra>=1){
                System.out.println("Sierra "+contXSierra+" "+acumXSierra);
                }
                if(contXTijeras>=1){
                System.out.println("Tijeras "+contXTijeras+" "+acumXTijeras);
                }
                if(contXAtornilla>=1){
                System.out.println("Atornillador "+contXAtornilla+" "+acumXAtornilla);
                }
                if(contXClavos>=1){
                System.out.println("Clavos "+contXClavos+" "+acumXClavos);
                }
                if(contXTornillos>=1){
                System.out.println("Tornillos "+contXTornillos+" "+acumXTornillos);
                }
                
                if(contXYunque>=1){
                System.out.println("Yunque "+contXYunque+" "+acumXYunque);
                }
                
            break;
            }
        
        
        }
            System.out.println("Su total es de "+compraXPersona);
            System.out.println("Con cuanto desea cancelar");
            cancelar=sc.nextInt();
            vuelto=cancelar-compraXPersona;
            System.out.println("Su vuelto es "+vuelto);
            
            compraXPersona=0;
            contXMartillo=0;//PARA GENERAR LAS BOLETAS individuales
            contXSierra=0;
            contXTijeras=0;
            contXAtornilla=0;
            contXClavos=0;
            contXTornillos=0;
            contXYunque=0;
            acumXMartillo=0;
            acumXSierra=0;
            acumXTijeras=0;
            acumXAtornilla=0;
            acumXClavos=0;
            acumXTornillos=0;
            acumXYunque=0;
            System.out.println("Desea continuar con las ventas");
            System.out.println("1 para seguir  2 para finalizar");
            eleccion=sc.nextInt();
            acumVentaTotal++;
            if(eleccion==2){
            break;
            }
    
    }
        System.out.println("Monto total del dinero acumulado "+acumProducto);
        System.out.println("Numero total de ventas "+acumVentaTotal);
        System.out.println("Codigo - Nombre Producto - Numero de ventas - Ingresos totales");
        System.out.println("210 - Martillo - "+contMartillo+" - "+acumMartillo);
        System.out.println("211 - Sierra - "+contSierra+" - "+acumSierra);
        System.out.println("212 - Tijeras - "+contTijeras+" - "+acumTijeras);
        System.out.println("213 - Atornillador - "+contAtornilla+" - "+acumAtornilla);
        System.out.println("214 - Clavos - "+contClavos+" - "+acumClavos);
        System.out.println("215 - Tornillos - "+contTornillos+" - "+acumTornillos);
        System.out.println("216 - Yunque - "+contYunque+" - "+acumYunque);
    }   
}

