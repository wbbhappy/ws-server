package com.wyait.ws.domain;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }
    public Country createCountry() {
        return new Country();
    }
    public GetCountryRequest createGetCountryRequest() {
        return new GetCountryRequest();
    }
}
