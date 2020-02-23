package jav.Task_4;

public class ReadFile {
    private String filePath;
    private String wordToFind;
    private String changeTo;

    ReadFile(String[] args) {
        this.filePath = args[0];
        this.wordToFind = args[1];
        if (args.length > 2) {
            this.changeTo = args[2];
        }
    }

    public String getFilePath() {
        return filePath;
    }

    public String getWordToFind() {
        return wordToFind;
    }

    public String getChangeTo() {
        return changeTo;
    }



    }


