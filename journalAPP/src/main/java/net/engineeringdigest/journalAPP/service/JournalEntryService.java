package net.engineeringdigest.journalAPP.service;

import net.engineeringdigest.journalAPP.entity.JournalEntry;
import net.engineeringdigest.journalAPP.repositary.JournalEntryRepositary;
import org.springframework.beans.factory.annotation.Autowired;

public class JournalEntryService {

    @Autowired
    private JournalEntryRepositary journalEntryRepositary;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepositary.save(journalEntry);
    }

}
