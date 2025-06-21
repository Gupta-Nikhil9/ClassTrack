package net.engineeringdigest.journalAPP.repositary;

import net.engineeringdigest.journalAPP.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepositary extends MongoRepository <JournalEntry,String>{

}
