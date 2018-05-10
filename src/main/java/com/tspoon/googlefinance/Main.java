package com.tspoon.googlefinance;

import com.tspoon.googlefinance.model.Stock;
import org.joda.time.DateTime;
import retrofit.RestAdapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GoogleFinance.init();
        GoogleFinance.init("QuandlApiKey", RestAdapter.LogLevel.BASIC);

        Stock stock = GoogleFinance.getStock("NASDAQ_TSLA");

        System.out.println(stock);

//        Stock stock2 = GoogleFinance.getStock("NASDAQ_TSLA", new DateTime().withYear(2011), new DateTime().withYear(2012));
//
//        List<Stock> stocks = GoogleFinance.getSAndP500Stocks();
    }
}
