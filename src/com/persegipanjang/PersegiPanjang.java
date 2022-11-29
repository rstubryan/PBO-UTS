/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persegipanjang;

import com.bangundatar.BangunDatar;

/**
 *
 * @author Restu
 */
public class PersegiPanjang implements BangunDatar {
    private int panjang;
    private int lebar;
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double luas() {
        return panjang * lebar;
    }
}
