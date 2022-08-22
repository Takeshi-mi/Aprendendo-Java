/**
        NOMES DE VARIÁVEIS
Variaveis começam com letra minuscula;
Não usar caracteres e termos especiais;
Definir os nomes de acordo com o tipo de informação(clean code)
-------------------------------------------------------


*/
public class Fundamentos{
  public static void main(String[] args){
    String nome; //= "Takeshi Miura";/
    int idade = 20;
    char sexo = "M"; //Char aceita uma letra só e tabela ASCII
    double temperatura = 26.7;
    boolean arCondicionado = false;
    byte byterson = 12;
    nome = "Takeshi Miura";
    System.out.println("Byte: " + byterson);
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Sexo: " + sexo);
    System.out.println("Temperatura: " + temperatura);
    System.out.println("Ar condicionado: " + arCondicionado);
  }
}

/*
IDENTIFIERS:
The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter and it cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names
*/