import java.io.*;
class coche
{
 //Atributos 
   String color;
   String marca;
   int km;
   
 //Metodo
 public static void main(String[]args)
  {
    //Crear objeto
     coche coche1 = new coche();

    //Modificar atributos
    coche1.color = "Rojo";
    coche1.marca = "Mitsubishi";
    coche1.km = 0;
   
  //Mostrar por pantallas valores del objeto
    System.out.println("El color del coche es : "+coche1.color);
    System.out.println("La marca del coche es : "+coche1.marca);
    System.out.println("El km del coche es :"+coche1.km);
  }
}