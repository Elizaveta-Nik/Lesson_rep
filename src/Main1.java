public class Main1 {
    public static void main(String[] args) {

        String[][] chess = new String[8][8];


        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chess[i][j] = "W";
                } else {
                    chess[i][j] = "B";
                }
            }
        }


        for (String[] strings : chess) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}