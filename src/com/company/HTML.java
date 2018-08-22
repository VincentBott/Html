package com.company;


public class HTML {

    private String titel;
    private String paragrafen = "";

    public HTML(String titel) {

        this.titel = titel;

    }

    public void addParagraaf(String s) {

        paragrafen = paragrafen + "<p>" + s + "</p>\n";
    }

    public String getHTML() {

        /*
        return "<html>\n<head>\n<title>" + titel + "</title>\n</head>\n<body>"    //  Kan ook met String.format()
                + "\n<h1>" + titel + "</h1>"
                + "\n" + paragrafen

                + "</body>\n</html>";
        */

        return String.format("<html>%n<head>%n<title>%s</title>%n</head>%n<body>%n<h1>%1$s</h1>%n%s</body>%n</html>", titel, paragrafen);

        //      %1$s     Voor het eerste argument in String.format()

    }
}


/*
<html>
<head>
<title>Mijn eerste HTML bestand</title>
</head>
<body>
<h1>Mijn eerste HTML bestand</h1>
<p>De eerste paragraaf</p>
<p>De tweede paragraaf</p>
</body>
</html>
 */
