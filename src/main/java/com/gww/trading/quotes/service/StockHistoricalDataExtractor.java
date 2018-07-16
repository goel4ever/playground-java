package com.gww.trading.quotes.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class StockHistoricalDataExtractor {
    public void connect() throws MalformedURLException, IOException {
        // https://www.quandl.com/api/v3/datasets/OPEC/ORB.json
        URL url = new URL("https://www.quandl.com/api/v3/datasets/WIKI/AAPL.csv");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        System.out.println(status);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        System.out.println("##################");
        System.out.println(content);

        in.close();
        con.disconnect();

    }

    public static void main(String[] args) {
        StockHistoricalDataExtractor extractor = new StockHistoricalDataExtractor();
        try {
            extractor.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
