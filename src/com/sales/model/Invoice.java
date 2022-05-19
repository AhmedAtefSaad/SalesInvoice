/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.model;

import java.util.ArrayList;

/**
 *
 * @author Magic
 */
public class Invoice {
    private int num;
    private String date;
    private String customer;
    private ArrayList<Line> lines;

    public Invoice() {
    }

    public Invoice(int num, String date, String customer) {
        this.num = num;
        this.date = date;
        this.customer = customer;
    }
    public double getInvoiceTotal(){
        double total = 0.0;
        for (Line line: getLines()){
            total += line.getlineTotal();
        }
        return total;
    }

    public ArrayList<Line> getLines() {
        if(lines==null){
            lines = new ArrayList<>();
        }
        return lines;
    }
    
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + num + ", date=" + date + ", customer=" + customer + '}';
    }

    public String getAsCSV(){
        return num + "," + date + "," + customer ;
    }
    
    
}
