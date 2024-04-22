package Nawa3.Nawa3.service;

import Nawa3.Nawa3.dto.CrawlingDataDto;
import Nawa3.Nawa3.entity.CrawlingData;
import Nawa3.Nawa3.repository.CrawlingDataRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CrawlingServiceImpl implements CrawlingService {

    private final ModelMapper modelMapper;
    private final CrawlingDataRepository crawlingDataRepository;

    public CrawlingServiceImpl(ModelMapper modelMapper, CrawlingDataRepository memberRepository, CrawlingDataRepository crawlingDataRepository) {
        this.modelMapper = modelMapper;
        this.crawlingDataRepository = crawlingDataRepository;
    }

    @Override
    public List<CrawlingDataDto> getAllCrawlingData() {
        List<CrawlingData> crawlingDataList = crawlingDataRepository.findAll();
        return crawlingDataList.stream()
                .map(crawlingData -> modelMapper.map(crawlingData, CrawlingDataDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getImgSourcesByIds(List<Integer> ids) {

        // id에 해당하는 데이터를 조회
        List<CrawlingData> crawlingDatas = crawlingDataRepository.findByIdIn(ids);

        // 조회한 데이터에서 이미지 소스만 추출
        return crawlingDatas.stream()
                .map(CrawlingData::getImgSource)
                .collect(Collectors.toList());

    }



}