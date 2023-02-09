package DiaryApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {

    private String title;
    private String body;
    private int identificationNumber;


    public Entry(int identificationNumber, String title, String body) {
        this.title = title;
        this.body = body;
        this.identificationNumber = identificationNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setBody(String body) {
        this.body = body;
    }

    public void setIdentificationNumber() {
        this.identificationNumber = Diary.listOfDiary.size() + 1;
    }

    public String getTitle() {
        return title;
    }

    public int getIdentificationNumber() {
        return this.identificationNumber;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd - MM  -yyyy  hh:mm");
        LocalDateTime now = LocalDateTime.now();
        return String.format("""
                =======================
                ID: %s
                Date: %s
     
                My Title: %s
                The Body: %s
                """,getIdentificationNumber(), now.format(formatter), getTitle(), getBody());
    }

}
