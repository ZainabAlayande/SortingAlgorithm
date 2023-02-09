package DiaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    private Entry myEntry;
    LocalDateTime now = LocalDateTime.now();


    @BeforeEach
    public void runThisTestFirst() {
        myEntry = new Entry(1,"The Love Birds", "Everything Love in here");
    }


    @Test
    public void titleOfDiaryTest() {
        String title = myEntry.getTitle();
        assertNotNull(title);
        assertEquals("The Love Birds", myEntry.getTitle());
    }


    @Test
    public void bodyOfDiaryTest() {
        String body = myEntry.getBody();
        assertNotNull(body);
        assertEquals("Everything Love in here", myEntry.getBody());

    }


    @Test
    public void dateOfDiaryTest() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd - MM  -yyyy  hh-mm");
        String formattedDate = now.format(formatter);
        System.out.println(formattedDate);
    }

    @Test
    public void identificationNumberTest() {

    }
}