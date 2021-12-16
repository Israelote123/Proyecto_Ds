/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author Pc
 */
public class Moonglade {
private Font font=null;
public String MOON= "Moonglade.ttf";
public Font fuente(String fontName, int estilo, float size)
{
try{
InputStream is= getClass().getResourceAsStream(fontName);
font= Font.createFont(Font.TRUETYPE_FONT, is);
}
catch(Exception e){
 System.err.println(fontName+"No se cargó la gfuente");
 font=new Font("Arial", Font.PLAIN, 14);
}
Font tfont=font.deriveFont(estilo, size);
return tfont;
}
    
}



