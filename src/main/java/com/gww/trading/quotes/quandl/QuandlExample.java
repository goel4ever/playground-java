package com.gww.trading.quotes.quandl;

import com.jimmoores.quandl.DataSetRequest;
import com.jimmoores.quandl.SearchRequest;
import com.jimmoores.quandl.SearchResult;
import com.jimmoores.quandl.TabularResult;
import com.jimmoores.quandl.classic.ClassicQuandlSession;

public class QuandlExample {
    public static void main(String[] args) {
        ClassicQuandlSession session = ClassicQuandlSession.create();
        SearchResult searchResult = session.search(new SearchRequest.Builder().withQuery("Apple").withMaxPerPage(2).build());
        System.out.println(searchResult.toPrettyPrintedString());

//        ClassicQuandlSession session = ClassicQuandlSession.create();
//        TabularResult tabularResult = session.getDataSet(
//                DataSetRequest.Builder.of("WIKI/AAPL").build());
//        System.out.println(tabularResult.toPrettyPrintedString());
    }
}
