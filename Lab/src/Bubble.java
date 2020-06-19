/*
Entrega do Trabalho 2- Algoritmos e Programação II
Eu,
André G. Padovezi
declaro que
todas as respostas são fruto de meu próprio trabalho,
não copiei respostas de colegas externos,
não disponibilizei minhas respostas para colegas externos e
não realizei quaisquer outras atividades desonestas para me beneficiar ou
prejudicar outros.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Bubble {
    public static void main(String[] args) throws IOException {
        String Ls, ls;
        BufferedReader br = new BufferedReader(new FileReader("line"));
        // Entrada de Dados do usuário
        while ((Ls = br.readLine()) != null) {

            //Conversão de letras para minusculas
            ls = Ls.toLowerCase();
        /*Transformação de String -> vetor de string utilizando " " como fator de divisão e
         configurando o limite para -1 para excluir os espaços após o ordenamento*/
            String Retalho[]  = ls.split(" ",-1);
            //Processamento: comparação por quantidade de caracteres
            for (int g = 0; g < Retalho.length; g++){
                for (int i = g+1; i < Retalho.length; i++){
                    //Converte as strings sendo testadas em um vetor de string com uma regra de split
                    String y = Retalho[g];
                    String x = Retalho[i];
                    String ka[] = y.split("");
                    String jb[] = x.split("");
                    //Compara os v.lenght dos dois para determinar qual é maior/menor ou se são iguais e aplica a resolução
                    if (jb.length-1 > ka.length-1){
                        //Caso b.length < a.length, inverte os valores de Retalho[g] e Retalho[i]
                        String temp = Retalho[g];
                        Retalho[g] = Retalho[i];
                        Retalho[i] = temp;
                    }
                    else{
                        if (jb.length == ka.length){
                            //Realiza o Processamento das palavras que necessitam do ordenamento por ordem lexicográfica
                            for (int k = 0; k < ka.length; k++){
                                //Utiliza "compareTo" para testar a ordem lexicográfica das palavras
                                int teste = ka[k].compareTo(jb[k]);
                                if (teste > 0){
                                    // Caso teste > 0 , inverte os valores de Retalho [g] e Retalho [i] e encerra o teste
                                    String tempa = Retalho[g];
                                    Retalho[g] = Retalho[i];
                                    Retalho[i] = tempa;
                                    break;
                                }
                                if (teste < 0){
                                    // Caso teste < 0 encerra o teste, pois as palavras não necessitam de inversão
                                    break;
                                }


                            }

                        }
                    }
                }
            }
            //Saída do Código
            for (String s : Retalho) {
                System.out.print(s + " ");
            }
            System.out.println("");
        }
    }
}

