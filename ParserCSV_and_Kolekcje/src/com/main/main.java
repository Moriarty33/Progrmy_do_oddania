package com.main;

import Parser.GenerateCSV;
import Parser.ParseCSV;
import Parser.duplicateCSV;
import properties.CrunchifyGetPropertyValues;

import java.io.IOException;


/**
 * Created by jamin on 21.11.2015.
 */
public class main{
    public static void main(String[]args) throws IOException {
        //----------------------------PARSER-------------------------------------
        CrunchifyGetPropertyValues properties = new CrunchifyGetPropertyValues();

        GenerateCSV.generateCsvFile(properties.getPropValues("filename"),5243);
        ParseCSV.ParseCsv(properties.getPropValues("filename"));
        //parsuje plik, vfliduje, usuwa dublikaty, i zapisuje (ZapisWCSV)
        //---------------------------KONIEC---------------------------------------
        //---------------------------KOLEKCJE-------------------------------------

    }
}

