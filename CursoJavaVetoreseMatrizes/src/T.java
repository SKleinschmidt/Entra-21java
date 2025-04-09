
public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = {
                {2104, 3, 399900},
                {1600, 3, 329900},
                {2400, 3, 369000},
                {1416, 2, 232000},
                {3000, 4, 539900},
                {1985, 4, 299900},
                {1534, 3, 314900},
                {1427, 3, 199000},
                {1380, 3, 212000},
                {1494, 3, 242500},
                {1940, 4, 240000},
                {2000, 3, 347000},
                {1890, 3, 330000},
                {4478, 5, 699900},
                {1268, 3, 259900}
        };

        calcularMediaPrecos(matriz);
        encontrarMenorCasa(matriz);
        encontrarQuartosCasaMaisCara(matriz);
        calcularDiferencaTamanhoQuartos(matriz);
        calcularMediaTamanhoCasasAcimaDe300Mil(matriz);
    }

    public static void calcularMediaPrecos(int[][] matriz) {
        double somaPrecos = 0;
        for (int[] casa : matriz) {
            somaPrecos += casa[2]; // A terceira coluna (índice 2) é o preço
        }
        double mediaPrecos = somaPrecos / matriz.length;
        System.out.printf("a) A média dos preços das casas é: R$ %.2f%n", mediaPrecos);
    }

    public static void encontrarMenorCasa(int[][] matriz) {
        int menorPreco = Integer.MAX_VALUE;
        for (int[] casa : matriz) {
            if (casa[2] < menorPreco) {
                menorPreco = casa[2];
            }
        }
        System.out.printf("b) O preço da menor casa é: R$ %d%n", menorPreco);
    }

    public static void encontrarQuartosCasaMaisCara(int[][] matriz) {
        int maiorPreco = Integer.MIN_VALUE;
        int quartosCasaMaisCara = 0;
        for (int[] casa : matriz) {
            if (casa[2] > maiorPreco) {
                maiorPreco = casa[2];
                quartosCasaMaisCara = casa[1]; // A segunda coluna (índice 1) é a quantidade de quartos
            }
        }
        System.out.printf("c) A casa mais cara tem %d quartos.%n", quartosCasaMaisCara);
    }

    public static void calcularDiferencaTamanhoQuartos(int[][] matriz) {
        int maiorNumeroQuartos = Integer.MIN_VALUE;
        int tamanhoCasaMaiorQuartos = 0;
        int menorNumeroQuartos = Integer.MAX_VALUE;
        int tamanhoCasaMenorQuartos = 0;

        for (int[] casa : matriz) {
            if (casa[1] > maiorNumeroQuartos) {
                maiorNumeroQuartos = casa[1];
                tamanhoCasaMaiorQuartos = casa[0]; // A primeira coluna (índice 0) é o tamanho
            }
            if (casa[1] < menorNumeroQuartos) {
                menorNumeroQuartos = casa[1];
                tamanhoCasaMenorQuartos = casa[0];
            }
        }
        int diferencaTamanho = tamanhoCasaMaiorQuartos - tamanhoCasaMenorQuartos;
        System.out.printf("d) A diferença de tamanho é de %d metros quadrados.%n", diferencaTamanho);
    }

    public static void calcularMediaTamanhoCasasAcimaDe300Mil(int[][] matriz) {
        double somaTamanhos = 0;
        int quantidadeCasas = 0;
        for (int[] casa : matriz) {
            if (casa[2] > 300000) {
                somaTamanhos += casa[0]; // A primeira coluna (índice 0) é o tamanho
                quantidadeCasas++;
            }
        }
        if (quantidadeCasas > 0) {
            double mediaTamanhos = somaTamanhos / quantidadeCasas;
            System.out.printf("e) A média do tamanho das casas com preço acima de R$ 300.000 é: %.2f metros quadrados.%n", mediaTamanhos);
        } else {
            System.out.println("e) Não há casas com preço acima de R$ 300.000.");
        }
    }

	}


