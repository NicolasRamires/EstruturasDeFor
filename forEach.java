package ForEach;

public class forEach {
    public static void main(String[] args){
        //ForEach simples
        int[] idades = new int[]{12,22,17,18,21};

        for(int idade:idades){
            if(idade>=18){
                System.out.println("Esses são Maiores de idade: " +idade);}
        }
    }
}
