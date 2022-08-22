public class Laços{
  public static void main(String[] args){
    for (int i = 1; i <= 10; i++){
      System.out.println(i);
    }
    System.out.println("------- TABUADA --------");
    //for (   variável  ;  chegada    ;  passo     )
    for (int tabuada = 0; tabuada <=10; tabuada++){
      System.out.println(" "); //For dentro de for: Para cada laço externo,executa todos os laços internos.
      for (int valor = 0; valor <= 10; valor++){
        System.out.println(tabuada + " + " + valor + " = " + (tabuada*valor));
      }
    }
  }
}