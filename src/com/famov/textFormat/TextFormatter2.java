package com.famov.textFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TextFormatter2 {

    public static void formatText(String str, int width, int columns) {


        for (int n = 0; n < width; n++) {
            System.out.print((((n + 1) % 10 == 0) ? ((n + 1) / 10) % 10 : " "));
        }
        System.out.println("");
        for (int i = 0; i < width; i++) {
            System.out.print((i + 1) % 10);
        }
        System.out.println("");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("");
            int curPos = 0;
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(str);
            boolean space = false;
            List line = new ArrayList();

            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                if (curPos + s.length() > width) {
                    line.add(sb.toString());
                    sb.setLength(0);
                    curPos = 0;
                    space = false;
                }

                if (space) {
                    sb.append(" ");
                }

                sb.append(s);
                curPos += s.length() + 1;
                space = true;

            }

            if (sb.length() > 0) {
                line.add(sb.toString());
            }

        int rows = (line.size() + (columns - 1)) / columns;

        for (int n = 0; n < rows; n++) {
            sb.setLength(0);
            int col = 0;
            while (col < columns) {

                if ((rows * col + n) < line.size()) {
                    sb.append(line.get(rows * col + n));
                    if (col < (columns - 1)) {
                        while (sb.length() < (width + 4) * (col + 1)) {
                            sb.append(" ");
                        }

                    }
                }
                col++;
            }

            System.out.println(sb.toString());
        }

    }

    public static void main(String[] args) {

        String str = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo"
                + " que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y"
                + " galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches,"
                + " duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura"
                + " los domingos, consumían las tres cuartas partes de su hacienda. El resto della"
                + " concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos"
                + " de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino."
                + " Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba"
                + " a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba"
                + " la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años; era de"
                + " complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de"
                + " la caza. Quieren decir que tenía el sobrenombre de Quijada, o Quesada, que en"
                + " esto hay alguna diferencia en los autores que deste caso escriben; aunque, por"
                + " conjeturas verosímiles, se deja entender que se llamaba Quejana. Pero esto importa"
                + " poco a nuestro cuento; basta que en la narración dél no se salga un punto de la"
                + " verdad.";

        int width = 35;
        int columns = 3;
        formatText(str, width, columns);
    }
}
