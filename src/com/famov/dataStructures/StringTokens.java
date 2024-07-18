package com.famov.dataStructures;

public class StringTokens {

    private String text;
    private int nToken;

    public StringTokens(String text) {
        this.text = text.trim();
        this.nToken = 0;
    }

    public boolean hasMoreTokens() {
        return nToken < text.length();
    }

    public String nextToken() {        
        while (nToken < text.length() && Character.isWhitespace(text.charAt(nToken))) {
            nToken++;
        }

        if (nToken >= text.length()) {
            return null; 
        }
        
        char c = text.charAt(nToken);
        if (c == '(' || c == ')') {
            nToken++;
            return Character.toString(c);
        } else if (c == '+' || c == '-' || c == '*' || c == '/') {
            nToken++;
            return Character.toString(c);
        } else {
            // Leer una secuencia de caracteres hasta un espacio, paréntesis o operador
            StringBuilder sb = new StringBuilder();
            while (nToken < text.length() && !Character.isWhitespace(text.charAt(nToken)) &&
                   text.charAt(nToken) != '(' && text.charAt(nToken) != ')' &&
                   text.charAt(nToken) != '+' && text.charAt(nToken) != '-' &&
                   text.charAt(nToken) != '*' && text.charAt(nToken) != '/') {
                sb.append(text.charAt(nToken));
                nToken++;
            }
            return sb.toString();
        }
    }

}
