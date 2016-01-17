package org.bloomfilter;

import java.io.IOException;

/**
 * Created by mauricio on 17/01/2016.
 */
public class main
{
    public static void main(String[] args) throws IOException
    {
        BloomFilter bf = new BloomFilter(500, 0.01);
        bf.add("www.github.com");
        bf.add("www.google.com");
        bf.add("www.yahoo.com");
        bf.add("www.bing.com");

        System.out.println(bf.contains("www.github.com"));
        System.out.println(bf.contains("www.bing.com"));
        System.out.println(bf.contains("www.ebay.com"));
        System.out.println(bf.contains("www.google.com"));
    }
}
