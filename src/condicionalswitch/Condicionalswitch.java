
package condicionalswitch;

import java.util.Scanner;

public class Condicionalswitch {

    public static void main(String[] args) {
       Scanner op=new Scanner(System.in);
       
        System.out.println("****MENU****");
        System.out.println("**UN-> escribe un un\n**DOUS-> escribe un dous\n**TRES-> escribe un tres\n**Elixe opcion");
        String opcion=op.nextLine();
        switch(opcion){
        case "un": System.out.println("un");
            break;
        case "dous": System.out.println("dous");
            break;
        case "tres": System.out.println("tres");
            break;
        default : System.out.println("opcion non valida");
    }
    }
    
}
