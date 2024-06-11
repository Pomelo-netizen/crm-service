package com.mxtech.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mxtech.crm.entity.Clue;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClueMapper  {
    @Select("SELECT * FROM clue WHERE id = #{id}")
    Clue getClueById(Long id);

    @Select("SELECT * FROM clue")
    List<Clue> getAllClues();

    @Insert("INSERT INTO clue(name, contact, status, score) VALUES(#{name}, #{contact}, #{status}, #{score})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertClue(Clue clue);

    @Update("UPDATE clue SET name=#{name}, contact=#{contact}, status=#{status}, score=#{score} WHERE id=#{id}")
    void updateClue(Clue clue);

    @Delete("DELETE FROM clue WHERE id=#{id}")
    void deleteClue(Long id);
}
