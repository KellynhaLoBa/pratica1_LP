import java.util.Locale;
import java.util.Scanner;
public class carro {
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      String placa;
      int ano;
      System.out.println("Digite a placa");
      placa = ler.nextLine();
      System.out.println("Digite o ano");
      ano = ler.nextInt();
      if (ano<=2010)
          System.out.println("Carro velho");
      else if (ano<=2022)
          System.out.println("Carro siminovo");
      else if(ano==2023)
          System.out.println("Carro novo");
      else
          System.out.println("Inválido");

      placa= placa.toUpperCase();
      for(int i=0;i<placa.length();i++){
          if (placa.charAt(i)=='A'|| placa.charAt(i)=='E'|| placa.charAt(i)=='I'|| placa.charAt(i)=='O'|| placa.charAt(i)=='U')
          placa =placa.replace(placa.charAt(i),'*');

      }
    System.out.println("Placa alterada" + placa);
    }
}
