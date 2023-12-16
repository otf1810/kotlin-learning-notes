package com.example.fy24.mockito.dao;


import com.example.fy24.mockito.entity.SalesRep;

/**
 * @author echo
 * @version 1.0
 * @date 2022/3/28 15:36
 */
public class SalesDao {

    public SalesRep findRep(String areaCode, String operatorCode) {
        if ("a".equals(areaCode) && "b".equals(operatorCode)) {
            return new SalesRep("Echo");
        }
        return null;
    }
}
