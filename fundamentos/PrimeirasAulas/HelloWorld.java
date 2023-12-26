package PrimeirasAulas;
/*
 * HelloWorld = Nome da classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 */

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello World");
        /*
         * Números (int, double, float, long)
         * Texto (String)
         * Booleanos (boolean)
         */
        int dadoDoTipoInt = 13;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 4564687444534132123L;
        String dadoDoTipoString = "Hello World";
        boolean dadoDoTipoBoolean = false; //true ou false

        //if - else
        if(dadoDoTipoInt == 10){
            System.out.println("entrou dentro do IF");
        }else if(dadoDoTipoInt == 12){
            System.out.println("entrou no IF do 12");
        }else{
            System.out.println("entrou no ELSE'");
        }
        //while (Enquanto algo for verdadeiro, faça alguma coisa)
        int valorInicial = 0;
        while(valorInicial<3){
            System.out.println("O valor inicial é: "+valorInicial);
            valorInicial++; //valorInicial = 3
        }
        System.out.println("Saiu do while");
        //FOR
        System.out.println("Inciando o FOR");
        for(int i = 0; i < 4; i++){
            System.out.println("Valor do i é: "+i);
        }
        System.out.println("Finalizando o FOR");
    }
    //Todo conteúdo deverá ser inserido aqui dentro
}

//Fora do escopo da classe