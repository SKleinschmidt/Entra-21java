
public class CodigoGemini16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Figura a)
        System.out.println("Figura a:");
        int linhasA = 4;
        int colunasA = 4;

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Figura b)
        System.out.println("Figura b:");
        int linhasB = 4;
        int colunasB = 4;

        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                if (i == 0 || i == linhasB - 1 || (j == 0 || j == colunasB - 1) && (i > 0 && i < linhasB - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Figura c)
        System.out.println("Figura c:");
        int linhasC = 4;

        for (int i = 0; i < linhasC; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


	}


