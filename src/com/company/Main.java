package com.company;

import java.io.*;

public class Main {


    private static final String BESTANDSNAAM="tekst.html";
    private static final String TITEL = "Mijn eerste HTML bestand";
    private static final String[] PARAGRAFEN = {"De eerste paragraaf", "De tweede paragraaf", "Dit is mijn eigen paragraaf"};



    public static void main(String[] args) throws IOException {



                HTML html = new HTML(TITEL);

                for(String s: PARAGRAFEN){

                    html.addParagraaf(s);
                }

                try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(BESTANDSNAAM)))){
                    pw.print(html.getHTML());
                }

    }
}

