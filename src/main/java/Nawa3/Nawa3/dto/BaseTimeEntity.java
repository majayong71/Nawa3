package Nawa3.Nawa3.dto;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass // 공통된 매핑 정보를 재사용할 때 사용하는 어노테이션
public abstract class BaseTimeEntity { // 모든 Entity에 들어갈 수 있는 정보를 추상클래스로 만들어 따로 저장한 클래스
    @Column (name = "created_at")
    @CreatedDate
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @LastModifiedDate
    private LocalDateTime updatedAt;


}
