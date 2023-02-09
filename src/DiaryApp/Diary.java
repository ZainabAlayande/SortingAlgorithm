package DiaryApp;

import java.util.ArrayList;

public class Diary {

    private String password;

    static ArrayList<Entry> listOfDiary = new ArrayList<>();

    public Diary(String password) {
        this.password = password;
    }

    public void createEntry(String title, String body) {
        int identificationNumber = listOfDiary.size() + 1;
        Entry myEntry = new Entry(identificationNumber, title, body);
        listOfDiary.add(myEntry);
    }

    public String getPassword() {
        return password;
    }


    public int getCountOfDiaryCreated() {
        return listOfDiary.size();
    }


    public String viewEntry(int id) {
        validateIdentificationNumber(id);
        return String.valueOf(listOfDiary.get(id - 1));
    }

    public void deleteEntry(int id) {
        validateIdentificationNumber(id);
        for (int j = 0; j < listOfDiary.size(); j++) {
            if (j == id) {
                listOfDiary.remove(id - 1);
            }
        }
    }

    public void readAllTheEntries() {
        for (int i = 0; i < listOfDiary.size(); i++) {
            System.out.println(listOfDiary.get(i));
        }
    }

    public Entry getEntry(int index) {
        return listOfDiary.get(index);
    }

    public ArrayList<String> getEntries() {
        //return listOfDiary;
        return null;
    }


    public void validateIdentificationNumber(int id) {
        if (id <= 0 || id > listOfDiary.size()) {
            throw new IllegalArgumentException("Id does not exist");
        }
    }


    public void editEntry(int id, String title, String body) {
        validateIdentificationNumber(id);
        for (int i = 0; i < listOfDiary.size(); i++) {
            if (listOfDiary.get(i).getIdentificationNumber() == id) {
                listOfDiary.get(i).setTitle(title);
                listOfDiary.get(i).setBody(body);
                break;
            }
        }
        }

        public void validateThatEmptyStringCanNotBreakCode(String empty) {
            String emptyString = "";
            if (empty.equals(emptyString)) {
                throw new IllegalArgumentException("Invalid Argument");
            }
        }
}
