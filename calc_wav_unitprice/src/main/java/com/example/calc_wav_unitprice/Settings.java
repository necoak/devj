package com.example.calc_wav_unitprice;

import lombok.Data;

@Data
public class Settings {
    private Integer allowable_min_price;
    private Integer allowable_max_price;
    private Integer totalprice_unitvalue;
    private Integer allowable_min_wav_unitprice;
    private Integer allowable_max_wav_unitprice;
    private Integer wav_unitprice_unitvalue;
}
