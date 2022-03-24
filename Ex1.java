package ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner intSC = new Scanner(System.in);
        String[] unidade = {"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove"};
        String[] dezena = {"Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"};
        String[] centena = {"Cento", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos", "Setecentos", "Oitocentos", "Novecentos"};
        
        System.out.print("Digite um número: ");
        int n = intSC.nextInt();
        
        String x = Integer.toString(n);
        
        if(x.length() == 1) {
        System.out.println(unidade[n]);
        } else if (x.length() == 2) {
            if (n < 20){
                System.out.println(unidade[n]);
            } else {
                char z = (x.charAt(0));
                char i = x.charAt(1);
                
                int h = Integer.parseInt(String.valueOf(z));
                int u = Integer.parseInt(String.valueOf(i));
                
                int d = h-2;
                if (n == 20){
                    System.out.println(dezena[d]);
                } else {
                    System.out.println(dezena[d] + " e " + unidade[u]);
                }
            }
        } else if (x.length() == 3){
           char f = x.charAt(1);
           int g = Integer.parseInt(String.valueOf(f));
            if (g == 1){
                char i = x.charAt(0);
                int h = Integer.parseInt(String.valueOf(i));
                int c = h-1;
                int v = h * 100;
                int u = n-v;
                System.out.println(centena[c] + " e " + unidade[u]);
            } else {
                char l = x.charAt(0);                
                char z = x.charAt(1);
                char i = x.charAt(2);
                
                int h = Integer.parseInt(String.valueOf(z));
                int u = Integer.parseInt(String.valueOf(i));
                int j = Integer.parseInt(String.valueOf(l));
                
                int c = j-1;
                int d = h-2;
                
                if (u == 0){
                    if (d != -2){
                    System.out.println(centena[c] + " e " + dezena[d]);
                    } else {
                        if (c == 0) {
                        System.out.println("Cem");
                        } else {
                        System.out.println(centena[c]);
                        }
                    }
                } else if (d == -2){
                    System.out.println(centena[c] + " e " + unidade[u]);
                } else {
                System.out.println(centena[c] + " e " + dezena[d] + " e " + unidade[u]);  
                }
            }
        }
    }
}