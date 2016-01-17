A simple BloomFilter implementation in Java with MurmurHash.

More info: https://en.wikipedia.org/wiki/Bloom_filter

New BloomFilter:

	BloomFilter bf = new BloomFilter(500, 0.01);

500 is the number of expected elements and 0.01 is the false positive probability that must be between 0 and 1

Main File:

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
    
    
Will result in:

	true
    true
    false
    true
