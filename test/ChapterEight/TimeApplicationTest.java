package ChapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TimeApplicationTest {

    @Test
    public void testThatTimeClassWorks() {
        //TimeApplication time = new TimeApplication(22, 29, 10);
        assertThrows(IllegalArgumentException.class, ()->new TimeApplication(67, 29, 10));
    }
}