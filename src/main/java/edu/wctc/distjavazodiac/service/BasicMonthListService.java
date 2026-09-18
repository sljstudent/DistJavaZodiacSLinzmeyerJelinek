package edu.wctc.distjavazodiac.service;

import edu.wctc.distjavazodiac.Repository.MonthRepository;
import edu.wctc.distjavazodiac.entity.Month;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BasicMonthListService implements MonthListService {
    private final MonthRepository monthRepository;

    public BasicMonthListService(MonthRepository monthRepository) {
        this.monthRepository = monthRepository;
    }

    @Override
    public List<Month> getMonths() {
        List<Month> months = new ArrayList<>();

        monthRepository.findAll().forEach(months::add);

        return months;
    }
}
