/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.downloadsourcecode;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author int_miwg
 */
public class HtmlConnection {

    public static void Connection() throws IOException {
        Connection connect = Jsoup.connect("http://www.onet.pl/");
        Document document = connect.get();
        Elements allHl = document.select("h1");
        for(Element el:allHl){
            System.out.println(el.text());
        }
    }
}
