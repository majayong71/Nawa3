package Nawa3.Nawa3.service;

import Nawa3.Nawa3.dto.CrawlingDataDto;

import java.util.List;

public interface CrawlingService {

    public List<CrawlingDataDto> getAllCrawlingData();

    public List<String> getImgSourcesByIds(List<Integer> crawlingId);


}