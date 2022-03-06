package com.example.calc_wav_unitprice.domain;

import java.util.ArrayList;
import java.util.List;

public class WavUnitprices {
    List<WavUnitprice> wavUnitpriceList;

    public WavUnitprices() {
        wavUnitpriceList = new ArrayList<>();
    }

    public WavUnitprices(List<WavUnitprice> wavUnitpriceList1) {
        this.wavUnitpriceList  = wavUnitpriceList1;
    }

    public WavUnitprices add(WavUnitprice  wavUnitprice1){
        List<WavUnitprice> result = new ArrayList<>(wavUnitpriceList);
        result.add(wavUnitprice1);
        return new WavUnitprices(result);
    }

}
