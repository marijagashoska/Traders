package com.example.dians2.service;

import com.example.dians2.model.IssuerData;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IssuerDataService {
    public List<IssuerData> getIssuersByCodeAndTimeRange(String code, LocalDate from, LocalDate to);
}
