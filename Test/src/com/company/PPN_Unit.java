package com.company;

public class PPN_Unit {
    Measure_line measureLines[];
    public PPN_Unit(int n)
    {
        this.measureLines = new Measure_line[n];
        for (int i=0; i<n; i++)
        {
            measureLines[i] = new Measure_line("Линия"+i);
        }
    }
}
