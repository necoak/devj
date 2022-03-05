package com.example.calc_wav_unitprice;

import lombok.Data;

@Data
public class TotalSettings {
    private Integer allowable_min_price;
    private Integer allowable_max_price;
    private Integer unit_price;
}
