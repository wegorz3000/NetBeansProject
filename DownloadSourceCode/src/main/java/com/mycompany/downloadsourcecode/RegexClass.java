/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.downloadsourcecode;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author int_miwg
 */
public class RegexClass {
    public static boolean searchSite(String wordName){
         return Pattern.matches("a href=.*b", wordName);
         
    }
    
    public static List<String> find(String searchString){
        List<String> listaWynikow = new ArrayList<>();
        Scanner in = null;
        String a ="";
        File f = new File(a);
        try{
            in = new Scanner(new FileReader(f));
            while (in.hasNextLine()){
              ///  if()
                 //   in.nextLine().indexOf(searchString)>=0;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return listaWynikow;
    }
}
