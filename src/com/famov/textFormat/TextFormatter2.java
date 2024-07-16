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
                + " que viv�a un hidalgo de los de lanza en astillero, adarga antigua, roc�n flaco y"
                + " galgo corredor. Una olla de algo m�s vaca que carnero, salpic�n las m�s noches,"
                + " duelos y quebrantos los s�bados, lantejas los viernes, alg�n palomino de a�adidura"
                + " los domingos, consum�an las tres cuartas partes de su hacienda. El resto della"
                + " conclu�an sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos"
                + " de lo mesmo, y los d�as de entresemana se honraba con su vellor� de lo m�s fino."
                + " Ten�a en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba"
                + " a los veinte, y un mozo de campo y plaza, que as� ensillaba el roc�n como tomaba"
                + " la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta a�os; era de"
                + " complexi�n recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de"
                + " la caza. Quieren decir que ten�a el sobrenombre de Quijada, o Quesada, que en"
                + " esto hay alguna diferencia en los autores que deste caso escriben; aunque, por"
                + " conjeturas veros�miles, se deja entender que se llamaba Quejana. Pero esto importa"
                + " poco a nuestro cuento; basta que en la narraci�n d�l no se salga un punto de la"
                + " verdad.";

        int width = 35;
        int columns = 3;
        formatText(str, width, columns);
    }
}
