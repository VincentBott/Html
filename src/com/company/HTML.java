package com.company;


public class HTML {

    private String titel;
    private String paragraaf = "";

    public HTML(String titel) {

        this.titel = titel;

    }
    public void addParagraaf(String s) {

        paragraaf = paragraaf + "<p>" + s + "</p>\n";
    }

    public String getHTML() {

        return "<html>\n<head>\n<title>" + titel + "</title>\n</head>\n<body>"
                + "\n<h1>" + titel + "</h1>"
                + "\n" + paragraaf

                + "</body>\n</html>";

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
