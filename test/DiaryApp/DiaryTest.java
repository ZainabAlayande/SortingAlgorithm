package DiaryApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DiaryTest {

    private Diary myDiary;

    @BeforeEach
    public void startWithThisAlwaysTest() {
        myDiary = new Diary("1234");
        myDiary.createEntry("Love", "Love is a beautiful thing");
        myDiary.createEntry("Family", "Family are the best ever");
        myDiary.createEntry("Marriage", "Marriage is the best Institution");
        myDiary.createEntry("Life", "Life is a mystery");
    }

    @Test
    public void deleteEntryTest() {
        Entry entry = myDiary.getEntry(2);
        myDiary.deleteEntry(2);
        boolean isDeleted = !myDiary.getEntries().contains(entry);
        assertTrue(isDeleted);
    }

    @Test
    public void countEntryTest() {
        assertEquals(4, myDiary.getCountOfDiaryCreated());
        System.out.println(myDiary.getCountOfDiaryCreated());
    }


    @Test
    public void viewEntryTest() {
        Entry expected = new Entry(1, "Love", "Love is a beautiful thing");
        String expect = """
                =======================
                ID: 1
                Date: 04 - 02  -2023  09:14
     
                My Title: Love
                The Body: Love is a beautiful thing
                """;
        assertEquals(expect, myDiary.viewEntry(1));

    }


    @Test
    public String editEntryTest() {
        Entry entry = myDiary.getEntry(2);
        myDiary.editEntry(2, "Lol", "Lil");
        String isEdited = myDiary.getEntries().set(2, editEntryTest());
        assertTrue(Boolean.parseBoolean(isEdited));
        return isEdited;
    }
}



