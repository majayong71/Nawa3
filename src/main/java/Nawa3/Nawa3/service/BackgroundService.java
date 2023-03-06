package Nawa3.Nawa3.service;

import Nawa3.Nawa3.dto.BackgroundDto;
import Nawa3.Nawa3.mapper.BackgroundImgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackgroundService {

    @Autowired
    private BackgroundImgMapper backgroundImgMapper;

    public BackgroundDto getBackground() {
        return backgroundImgMapper.selectBackgroundImg();
    }

}
