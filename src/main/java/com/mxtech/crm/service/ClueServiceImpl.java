package com.mxtech.crm.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mxtech.crm.entity.Clue;
import com.mxtech.crm.mapper.ClueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClueServiceImpl implements ClueService {

    @Autowired
    private ClueMapper clueMapper;

    @Override
    @Cacheable(value = "clue", key = "#id")
    public Clue getClueById(Long id) {
        return clueMapper.getClueById(id);
    }

    @Override
    public List<Clue> getAllClues() {
        return clueMapper.getAllClues();
    }


    @Override
    public void insertClue(Clue clue) {
        clueMapper.insertClue(clue);
    }

    @Override
    public void updateClue(Clue clue) {
        clueMapper.updateClue(clue);
    }

    @Override
    public void deleteClue(Long id) {
        clueMapper.deleteClue(id);
    }

    @Override
    public IPage<Clue> getCluesByPage(Page<Clue> page) {
//        return clueMapper.selectPage(page,null);
        return null;
    }
}
