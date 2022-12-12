package com.demo.builder.url;

public class Main {
    public static void main(String[] args) {
        URL.Builder  builder = new URL.Builder();
        URL url= builder.protocol("http://").hostname("google.com:").port("8080").pathParam("/abc").queryParam("/?param=1").build();
        System.out.print(url.protocol);
        System.out.print(url.hostname);
        System.out.print(url.port);
        System.out.print(url.pathParam);
        System.out.print(url.queryParam);
        System.out.println();

        URL url2= builder.protocol("http://").hostname("google.com:").port("8080").build();
        System.out.print(url2.protocol);
        System.out.print(url2.hostname);
        System.out.print(url2.port);

    }
}
