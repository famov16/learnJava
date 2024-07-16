package com.famov.textFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TextFormatter3 {

    private List lines;
    private int columns;
    private int lineWidth;

    public TextFormatter3(String text, int lineWidth, int columns, boolean justify) {
        setFormat(lineWidth, columns);
        setText(text, justify);
    }

    public void setFormat(int lineWidth, int columns) {
        this.lineWidth = lineWidth;
        this.columns = columns;
    }

    /*
    12345678901234567890123456789012345
    -----------------------------------   
    de   los  de  lanza  en  astillero,       
    */
    
    private void formatLines(){
        StringBuilder sb = new StringBuilder();
        for(int nLine =0; nLine<lines.size();  nLine++){
            String line = (String) lines.get(nLine);
            if(line.length() >= lineWidth)
                continue;
            
            //Numero de espacios
            int numsp = 0;
            for (int n = 0; n < line.length(); n++) {
                if (line.charAt(n) == ' ')
                    numsp++;
            }
            if(numsp == 0)
                continue; 
            
            sb.setLength(0);
            sb.append(line);
            
            // Cantidad de spacios en total para que este justificado
            int spaceCount = lineWidth - line.length() + numsp;
            // Cantidad de espacios uniformes entre cada palabra
            int space1 = spaceCount  / numsp;
            // Cantidad de espacios que faltan luego de calcular la cantidad de espacios uniformes entre cada palabra
            int mod = spaceCount % numsp;
            // Cantidad del lugares donde se deben llenar los espaacios faltantes
            int space2 = (mod + (numsp-1))/numsp;
            
            int ins = 0;
            for (int n = 0; n < numsp; n++) {
                ins = sb.indexOf(" ", ins);
                int insCount = (mod> space2) ? space2 : mod;
                mod-= insCount; 
                insCount +=space1 -1;
                for (int i = 0; i < insCount; i++) {
                    sb.insert(ins, ' ');
                }
                ins += 1 + insCount;
            }
            lines.set(nLine, sb.toString());
        }
    }
    
    public void setText(String text, boolean justify) {
        if (lines == null) 
            lines = new ArrayList();
        else
            lines.clear();
        
        int curPos = 0;
        StringBuilder curLine = new StringBuilder();
        StringTokenizer st = new StringTokenizer(text);
        boolean space = false;

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (curPos + s.length() > lineWidth ) {
                lines.add(curLine.toString());
                curLine.setLength(0);
                curPos = 0;
                space = false;
            }

            if (space) {
                curLine.append(" ");
            }

            curLine.append(s);
            curPos += s.length() + 1;
            space = true;

        }
        lines.add(curLine.toString());
        
        if (justify) {
            formatLines();
        }
    }

    public void println() {
        printRuler();
        StringBuilder curLine = new StringBuilder();
        int rows = (lines.size() + (columns - 1)) / columns;

        for (int n = 0; n < rows; n++) {
            curLine.setLength(0);
            int col = 0;
            while (col < columns) {

                if ((rows * col + n) < lines.size()) {
                    curLine.append(lines.get(rows * col + n));
                    if (col < (columns - 1)) {
                        while (curLine.length() < (lineWidth + 4) * (col + 1)) {
                            curLine.append(" ");
                        }

                    }
                }
                col++;
            }

            System.out.println(curLine.toString());
        }
        
    }

        
    private void printRuler(){
        for (int n = 0; n < lineWidth; n++) {
            System.out.print((((n + 1) % 10 == 0) ? ((n + 1) / 10) % 10 : " "));
        }
        System.out.println("");
        for (int i = 0; i < lineWidth; i++) {
            System.out.print((i + 1) % 10);
        }
        System.out.println("");
        for (int i = 0; i < lineWidth; i++) {
            System.out.print("-");
        }
        System.out.println("");
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

        int columns = 3;
        int lineWidth = 35;

        TextFormatter3 fmt = new TextFormatter3(str, lineWidth, columns, true);
        fmt.println();
    }


}
