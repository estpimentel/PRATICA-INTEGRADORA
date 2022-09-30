package java1PI1;

public class MainJava1PI1 {
    public static void main(String[] args) {
        String[] cidades = new String[] {
                "Londres",
                "Madrid",
                "Nueva York",
                "Buenos Aires",
                "Asunción",
                "São Paulo",
                "Lima",
                "Santiago de Chile",
                "Lisboa",
                "Tokio"
        };

        int[][] temperaturas = new int[][]{
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        Integer tempMin = temperaturas[0][0];
        Integer tempMax = temperaturas[0][1];
        String cidadeMin = "Londres";
        String cidadeMax = "Londres";
        for (int i = 1; i < 9; i++) {
            if (tempMin > temperaturas[i][0]) {
                tempMin = temperaturas[i][0];
                cidadeMin = cidades[i];
            }
            if (tempMax < temperaturas[i][1]) {
                tempMax = temperaturas[i][1];
                cidadeMax = cidades[i];
            }
        }
            System.out.println(cidadeMin + " - Temperatura Mínima: " + tempMin);
            System.out.println(cidadeMax + " - Temperatura Máxima: " + tempMax);
        }
    }

