package net.engineeringdigest.journalAPP.controller;

import net.engineeringdigest.journalAPP.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {



    @GetMapping
    public List<JournalEntry> getAll(){ // localhost:8080/journal GET
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){ // localhost:8080/journal POST

        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntry(@PathVariable Long myId){
        return null;
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteEntryById(@PathVariable Long myId){

        return true;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntry(@PathVariable Long id,@RequestBody JournalEntry myEntry){
        return null;
    }
}
