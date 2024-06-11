package com.mxtech.crm.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mxtech.crm.entity.Clue;

import java.util.List;

public interface ClueService {
    Clue getClueById(Long id);
    List<Clue> getAllClues();
    void insertClue(Clue clue);
    void updateClue(Clue clue);
    void deleteClue(Long id);

    // 分页查询方法
    IPage<Clue> getCluesByPage(Page<Clue> page);
}
