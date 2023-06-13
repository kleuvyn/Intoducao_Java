public class VarIdade {
    public static void main(String[] args) {
        //Variáveis primitivas: podem ser do tipo byte, short, int, long, float, double, char ou boolean.

        System.out.println("Olá novo teste!");

        //Tipos Inteiros (byte, short, int ou long)
        //Tipos inteiros trabalham apenas com números inteiros, positivos ou negativos.
        //Os valores podem ser representados nas bases octal, decimal e hexadecimal.
        int idade;
        idade = 28;
        long numeroGrandes = 32432423523L;
        // e para numeros menores que 16 bytes
        short numeroMenor = 2131;
        //e o byte e um menor ainda que vai ate 127
        byte bi= 127;

        System.out.println("A minha idade é " + idade + " anos");

        //Inteiro em octal//
        //Qualquer valor escrito utilizando números de 0 a 7 começando com 0 é um valor na base octal, exemplo:

        //Inteiro em decimal//
        //Qualquer valor escrito utilizando números de 0 a 9 é um valor decimal,
        //este é o tipo de representação mais comum uma vez que é utilizada no dia a dia, exemplo:
        //int i = 9;
        //long b = 9871342132;

        //Inteiro em hexadecimal//
        //Qualquer valor escrito utilizando números de 0 a 9 e A a F começando com 0x ou 0X é um valor hexadecimal, exemplo:
        //long a = 0xCAFE;  Equivale ao valor 51966 em decimal
        //int b = 0X14a3;   Equivale ao valor 5283 em decimal

        //Tipos Ponto Flutuante (float ou double)//
        double salario;
        salario = 1345.99;
        System.out.println("Meu salário atual é " + salario + " reais ");

        double salarioo = 1345.99;
        int valor = (int) salarioo;
        System.out.println(valor);

        //Tipos de ponto flutuante serve para representar números com casas decimais, tanto negativos quanto positivos.
        // Todos números com ponto flutuante são por padrão do tipo double, mas é possível especificar o tipo do valor durante a criação,
        // para float utilize f ou F e se quiser pode especificar para double usando d ou D, exemplo:
        double divisao = 3.14 / 2;
        System.out.println("Aqui foi feita a divisão de 3.14 / 2 = " + divisao);

        // e para nuneros maiores que 64 byteS
        float pontoFlutuante = (float) 3.14;
        // ou
        float flutuante = 3.14f;

        //Tipo caractere (char)//

        //O tipo caractere, como o próprio nome já diz, serve para representar um valor deste tipo.
        //Sua inicialização permite 2 modelos:

        char ae = 'a';
        char ba = 97; //Equivale a letra ‘a’

        //Tipo Booleano (boolean)
        //Os palavras true, false e null representam valores básicos e não podem ser utilizados na declaração de atributos, métodos ou classes.
        //Tipo que representa valores lógicos true (verdadeiro) ou false (falso), exemplo:
        boolean a = true;
        boolean b = false;




    }

}
