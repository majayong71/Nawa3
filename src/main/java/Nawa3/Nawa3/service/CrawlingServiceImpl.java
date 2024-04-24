package Nawa3.Nawa3.service;

import Nawa3.Nawa3.dto.CrawlingDataDto;
import Nawa3.Nawa3.entity.CrawlingData;
import Nawa3.Nawa3.repository.CrawlingDataRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CrawlingServiceImpl implements CrawlingService {

    private final ModelMapper modelMapper;
    private final CrawlingDataRepository crawlingDataRepository;


    @Override
    public List<CrawlingDataDto> getAllCrawlingData() {
        List<CrawlingData> crawlingDataList = crawlingDataRepository.findAll();
        return crawlingDataList.stream()
                .map(crawlingData -> modelMapper.map(crawlingData, CrawlingDataDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getImgSourcesByIds(List<Integer> crawlingId) {
        List<CrawlingData> crawlingDataList = crawlingDataRepository.findByCrawlingIdIn(crawlingId);
        return crawlingDataList.stream()
                .map(CrawlingData::getImgSource)
                .collect(Collectors.toList());
    }
}