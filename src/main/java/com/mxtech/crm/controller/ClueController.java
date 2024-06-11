package com.mxtech.crm.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.mxtech.crm.entity.Clue;
import com.mxtech.crm.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clues")
public class ClueController {

    @Autowired
    private ClueService clueService;

    @GetMapping("/{id}")
    @Cacheable(value = "clue", key = "#id")
    public Clue getClueById(@PathVariable Long id) {
        return clueService.getClueById(id);
    }

    @GetMapping
    public List<Clue> getAllClues() {
        return clueService.getAllClues();
    }

    @PostMapping
    public void insertClue(@RequestBody Clue clue) {
        clueService.insertClue(clue);
    }

    @PutMapping
    public void updateClue(@RequestBody Clue clue) {
        clueService.updateClue(clue);
    }

    @DeleteMapping("/{id}")
    public void deleteClue(@PathVariable Long id) {
        clueService.deleteClue(id);
    }

    @GetMapping("/page")
    public IPage<Clue> getCluesByPage(@RequestParam int page, @RequestParam int size) {
        Page<Clue> cluePage = new Page<>(page, size);
        return clueService.getCluesByPage(cluePage);
    }
}
