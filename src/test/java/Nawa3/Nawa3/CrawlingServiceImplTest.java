//package Nawa3.Nawa3;
//
//
//import Nawa3.Nawa3.dto.CrawlingDataDto;
//import Nawa3.Nawa3.entity.CrawlingData;
//import Nawa3.Nawa3.repository.CrawlingDataRepository;
//import Nawa3.Nawa3.service.CrawlingServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.modelmapper.ModelMapper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.Mockito.*;
//
//public class CrawlingServiceImplTest {
//
//    @Mock
//    private ModelMapper modelMapper;
//
//    @Mock
//    private CrawlingDataRepository crawlingDataRepository;
//
//    @InjectMocks
//    private CrawlingServiceImpl crawlingServiceImpl;
//
//    @Test
//    void getAllCrawlingData() {
//
//
//        // Mockito 의 어노테이션을 활성화하여 모의 객체를 초기화 한다.
//        MockitoAnnotations.initMocks(this);
//
//        CrawlingData crawlingData1 = new CrawlingData(); // CrawlingData 객체 생성
//        CrawlingData crawlingData2 = new CrawlingData(); // CrawlingData 객체 생성
//        List<CrawlingData> dataList = new ArrayList<>(); // CrawlingData 객체를 담을 리스트 생성
//
//        // 리포지토리 호출 시 모의 객체에서 특정 결과를 반환하도록 설정
//        when(crawlingDataRepository.findAll()).thenReturn(dataList);
//
//        // ModelMapper의 map 함수 호출 시 CrawlingDataDto 객체를 반환하도록 설정
//        when(modelMapper.map(crawlingData1, CrawlingDataDto.class)).thenReturn(new CrawlingDataDto());
//        when(modelMapper.map(crawlingData2, CrawlingDataDto.class)).thenReturn(new CrawlingDataDto());
//
//        // 실제 메소드 호출
//        List<CrawlingDataDto> result = crawlingServiceImpl.getAllCrawlingData();
//
//        // 반환된 결과가 null이 아닌지 및 올바른 크기인지 확인
//        assertNotNull(result);
//        assertEquals(2, result.size());
//
//        // crawlingDataRepository의 findAll 메소드가 정확히 한 번 호출되었는지 검증
//        verify(crawlingDataRepository, times(1)).findAll();
//        // modelMapper의 map 메소드가 각 객체에 대해 정확히 한 번씩 호출되었는지 검증
//        verify(modelMapper, times(1)).map(crawlingData1, CrawlingDataDto.class);
//        verify(modelMapper, times(1)).map(crawlingData2, CrawlingDataDto.class);
//
//    }
//
//}
