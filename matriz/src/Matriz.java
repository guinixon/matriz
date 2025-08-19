import java.util.Random;
import java.util.Scanner;
public class Matriz {

    private int linhas;
    private int colunas;
    private int [][] dados;

    
    
    public Matriz (int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
    }

    public void setValor(int linha, int coluna, int valor){
        if(linha >= 0 && linha < this.linhas && coluna >=0 && coluna < this.colunas){
            this.dados[linha][coluna] = valor;
        }else{
            System.err.println("Erro: Posicao ["+ linha +"]["+ coluna +"] esta fora dos limites da matriz");
        }
    }

    public int getValor(int linha, int coluna){
        if(linha >= 0 && linha < this.linhas && coluna >=0 && coluna < this.colunas){
            return this.dados[linha][coluna];
        }else{
            System.err.println("Erro: Posicao ["+ linha +"]["+ coluna +"] esta fora dos limites da matriz");
            return -1;
        }
    }
    public void setAutomatico(int valorMax){
        Random gerador = new Random();
        for (int i= 0; i < this.linhas; i++){
            for (int j = 0; j < this.colunas; j++){
                this.dados[i][j] = gerador.nextInt(valorMax);
            }
        }
    }

    public void Exibir(){
        System.out.println("MATRIZ: "+this.linhas +"x" +this.colunas);
        for (int i= 0; i < this.linhas; i++){
            for (int j = 0; j < this.colunas; j++){
                System.out.print(this.dados[i][j]+"\t");
            }
        System.out.println();
        }
    }

    public void Preencher(){
        Scanner scanner = new Scanner(System.in);
        for (int i= 0; i < this.linhas; i++){
            for (int j = 0; j < this.colunas; j++){
                System.out.print("Digite o valor para a posicao ["+ i +"] ["+ j +"]: ");
                this.dados[i][j] = scanner.nextInt();
                
            }
    }
    scanner.close();
}

    public int getLinha(){
        return this.linhas;
    }

    public int getColunas(){
        return this.colunas;
    }

    
}
