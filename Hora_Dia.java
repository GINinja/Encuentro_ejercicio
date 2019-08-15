import java.util.Scanner;
public class Hora_Dia
{
public static void main(String[] args)
{Scanner scan = new Scanner( System.in );
  
 int hora_dia;
 
 
 System.out.print("Ingrese numero de 0 a 23 que representa la hora del dia: "); 
 
 hora_dia = scan.nextInt();
 
 if (hora_dia >=0 && hora_dia <6)
 {System.out.println("Madrugada");
 }else if (hora_dia >=6 && hora_dia <=12)
 {System.out.println("Manana");
 }else if (hora_dia >=13 && hora_dia<=18)
 {System.out.println("tarde");
 }else if (hora_dia >18 && hora_dia<=23)
 {System.out.println("noche");
 }else 
 {System.out.println("Hora incorrecta");}
    
   
}

}