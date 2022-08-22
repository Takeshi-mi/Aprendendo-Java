public class Condicionais{
  public static void main(String [] args){
    int idade = 20;
    if (idade < 18){
      System.out.println("Menor de idade");
    }
    else{
        System.out.println("Maior de idade.");
    }
    System.out.println("\nUso do Else - if (elif do python)\n");
    System.out.println("=-=-=-=-ELEIÇÕES=-=-=--=");
    if (idade < 16){
      System.out.println("\tProibido votar");
    } else if(idade >18 && idade < 70){
        System.out.println("\tObrigatório votar");
    }  else if (idade == 17 || idade == 18 || idade > 70){
        System.out.println("Voto facultativo");
    }
     System.out.println("----------------------------------");
    System.out.println("EXEMPLO - switch case \n Funciona pra int e char.");
    int opcao = 1;
    System.out.println("1. Clientes");
    System.out.println("2. Serviços");
    System.out.println("3. Relatórios");
    System.out.println("Selecione sua opção");
    switch (opcao){
      case 1:
        System.out.println("Você selecionou clientes.");
        break;
      case 2:
        System.out.println("Você selecionou serviços.");
        break;
      case 3:
        System.out.println("Você selecionou serviços.");
        break;
      default:
        System.out.println("Opção inválida. Digite um número de 1 a 3.");
        break;
    }
    System.out.println(" ");
    System.out.println("while e do while");
    int contador = 1;
    while (contador <= 10){
      System.out.println(contador)
      contador++; //contador + 1
      
    }
  }
}
