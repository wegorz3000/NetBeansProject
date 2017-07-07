/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.downloadsourcecode;

import static com.mycompany.downloadsourcecode.HtmlConnection.Connection;
import static com.mycompany.downloadsourcecode.RegexClass.searchSite;
import static com.mycompany.downloadsourcecode.WebConnection.wikipedia;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
/**
 *
 * @author int_miwg
 */
public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        URL url = new URL("https://pl.wikipedia.org/wiki/28_listopada");
        wikipedia(url);
        Desktop d=Desktop.getDesktop();

        // Browse a URL, say google.com
        d.browse(new URI("http://google.com"));

        if(searchSite("acc"))
            System.out.println("jest okej");
    }
}
