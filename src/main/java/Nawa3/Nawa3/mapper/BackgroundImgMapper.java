package Nawa3.Nawa3.mapper;


import Nawa3.Nawa3.dto.BackgroundDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BackgroundImgMapper {

        BackgroundDto selectBackgroundImg();

}
