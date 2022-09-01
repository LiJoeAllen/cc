package com.example.cc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author ht
 */
public class Utils {
    public static InputStream get(String filePath) throws FileNotFoundException {
        return new FileInputStream(filePath);
    }
}
