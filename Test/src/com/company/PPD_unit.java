package com.company;

public class PPD_unit extends OilObjects{
    Pump pumps[];
    PPD_unit(int n){
        this.pumps = new Pump[n];
        for (int i=0; i<n; i++)
        {
            pumps[i] = new Pump("Насос"+i);
        }
    }
}
