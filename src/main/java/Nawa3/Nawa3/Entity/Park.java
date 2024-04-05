package Nawa3.Nawa3.Entity;
import jakarta.persistence.*;
import lombok.*;
@Entity //Entity 클래스
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Park {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) // PK 생성값을 DB종류에 따라서 맞는 방식을 사용한다
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column(name = "place_type")
    private String placeType;

    @Column(name = "img_source")
    private String imgSource;

}
