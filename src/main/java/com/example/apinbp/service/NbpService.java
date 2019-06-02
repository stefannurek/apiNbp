package com.example.apinbp.service;

import com.example.apinbp.model.Currency;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpService implements CurrencyService {

    @Override
    public Currency getCurrency(String currency){
        String apiPath ="http://api.nbp.pl/api/exchangerates/rates/c/"+ currency +"/?format=json";
        Currency currencyModel = new RestTemplate().getForObject(apiPath, Currency.class);

        return new RestTemplate().getForObject(apiPath, Currency.class);
    }
}
