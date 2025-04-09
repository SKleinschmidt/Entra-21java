
public class Exercicio14dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrizB = {
                {7, 8, 9},
                {10, 11, 12}
        };

        // 2. Chamar o método para somar as matrizes
        int[][] matrizSoma = somarMatrizes(matrizA, matrizB);

        // 3. Verificar se a soma foi bem-sucedida e imprimir o resultado
        if (matrizSoma != null) {
            System.out.println("Matriz A:");
            imprimirMatriz(matrizA);

            System.out.println("\nMatriz B:");
            imprimirMatriz(matrizB);

            System.out.println("\nMatriz Soma:");
            imprimirMatriz(matrizSoma);
        }
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        // 1. Verificar se as matrizes têm o mesmo tamanho
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("Erro: As matrizes devem ter o mesmo tamanho para serem somadas.");
            return null; // Retorna null para indicar um erro
        }

        // 2. Criar uma nova matriz para armazenar o resultado da soma
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        int[][] matrizResultado = new int[linhas][colunas];

        // 3. Iterar sobre as matrizes e realizar a soma elemento por elemento
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // 4. Retornar a matriz resultante da soma
        return matrizResultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // Adiciona uma tabulação para melhor formatação
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
    }

	}


