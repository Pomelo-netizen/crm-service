package com.mxtech.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mxtech.crm.dto.ClueDto;
import com.mxtech.crm.entity.Clue;
import org.apache.ibatis.annotations.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface ClueMapper  {
    ClueMapper instance = Mappers.getMapper(ClueMapper.class);
    ClueDto clueToClueDto(Clue clue);
    Clue ClueDtoToClue(ClueDto clueDto);
}
