package com.example.shopping;

public class order {
    public int OrdID;
    public int CustID;
    // public String Address;
    public String OrdDate;
    // public List<class_orderDetails> Items;

    public order(int _OrdID, int _CustID,String _Address, String _OrdDate) {
        this.OrdID = _OrdID;
        //   this.Address = _Address;
        this.CustID = _CustID;
        this.OrdDate = _OrdDate;
    }

}

