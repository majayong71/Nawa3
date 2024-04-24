package Nawa3.Nawa3.repository;

import Nawa3.Nawa3.entity.CrawlingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrawlingDataRepository extends JpaRepository<CrawlingData, Integer> {

    List<CrawlingData> findAll();

    // find By id In -> in 은 SQL 의 In 이다 Integer 의 In 이 아니다.
    // 여러 id값에 해당하는 데이터를 한법에 조회할 수 있다.

    List<CrawlingData> findByCrawlingIdIn(List<Integer> crawlingId);
}