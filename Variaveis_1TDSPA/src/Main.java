import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variaveis();
        //OperadoresECondicionais
        //ArrayOuVetores
        var nomes = new String[] {"João", "Maria", "José Carlos (felps)"};
        var numeros = new int[] {1,2,3,4,5,6,7,8,9};

        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(numeros[3]);

        for(int i = 0; i< numeros.length; i++)
            System.out.println(numeros[i]);

        //para cada nomes no vetor de nomes
        for (var nome : nomes)
            //imprime o nome
            System.out.println(nome);

        //While
        System.out.println("While: ");
        var contador = 0;
        while (contador < nomes.length){
            System.out.println(nomes[contador++]);
        }

    }
     public static void Variaveis(){
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

     public static void OperadoresECondicionais(){
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

         var notaDDD = 8;
         var notaCPT = 3;
         var notaBD = 10;


         // Operador ternario
         // função(<condição>) ? <valor se verdadeiro> : <valor se falso>
         // na metematica: f(x) = x > 0 ? x : -x
         System.out.println(
                 notaDDD < 6 || notaCPT < 6 || notaBD < 6 ?
                         "Reprovado em pelo menos uma disciplina, " +
                                 "não ira se formar no tempo minimo" : "Aprovado em todas as disciplinas");

         System.out.println("Digite um numero: ");
         var numero = scanner.nextInt();
         scanner.nextLine();
         System.out.println(numero % 2 == 0 ? "O numero é par" : "O numero é impar");

     }
}