package Object;

public class ExemploJava {
    static int valor = 0;
    int value = 0;

    /*

    Uma variavel statica, ela pertence ao escopo da classe

    Uma variavel não estática pertence ao objeto

    * */


    public ExemploJava(){
        valor++;
        value++;
    }


    public static void main(String[] args) {
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();
        new ExemploJava();



       ExemploJava ex =  new ExemploJava();
        System.out.println(ex.value);
        System.out.println(ExemploJava.valor);
    }
}
