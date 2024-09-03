import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variaveis();

        //operadores();
        var calculo = (1 + 2) - 3 * 2 / 5.0;
        System.out.println(calculo);
        calculo++;
        System.out.println(calculo);
        calculo--;
        System.out.println(calculo);

        //condicionais();
        var scanner = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        var idade = scanner.nextInt();

        if(idade >= 18 && idade < 200)
            System.out.println("A pessoa é maior de idade");
        else if (idade > 200)
            System.out.println("A pessoa é um elfo!");
        else
            System.out.println("A pessoa é menor de idade");



    }
     public static void variaveis(){
         System.out.println("Sistema iniciando...");

         var scan = new Scanner(System.in);
         System.out.println("Digite o numero 1: ");
         var numero1 = scan.nextBigDecimal();
         scan.nextLine();
         System.out.println("Digite o numero 2: ");
         var numero2 = scan.nextBigDecimal();
         scan.nextLine();

         System.out.println(numero1.add(numero2));

         var nome = "FIAP";
         System.out.println(nome);

         var numero = 10;
         System.out.println(numero + 10);

         var valor = 10.5;
         System.out.println(numero + 10.5);

         var valorGrande = 10000000000000000L;
         var valorPequeno = 10;

         var letra = 'A';

         var condição = true;

         var temp = 30.5;
         System.out.println("A temperatura é de: " + temp + " graus");

         var numeroTexto = "10";
         // Conversão explicita de string pra int
         var numeroConvertido = Integer.parseInt(numeroTexto);

         //declaração de variaveis
         int idade;
         //inicialização de variaveis
         idade = 10;
         idade = 20;
         idade = 30;
         //declaração e inicialização
         var idade2 = 10;



         System.out.println("Sistema finalizando...");



     }
}