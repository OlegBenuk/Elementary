package jav.Task_4;

import java.io.*;

public class FindEntriesOrReplaceWord {
    private String filePath;
    private String wordToFind;
    private String changeTo;
    public static final int BUF_SIZE = 1024;

    public FindEntriesOrReplaceWord(String filePath, String wordToFind, String changeTo) throws IOException {
        this.filePath = filePath;
        this.wordToFind = wordToFind;
        createFile();
        //     createFile();
//        if (changeTo == null) {
//            findEntries();
//        } else {
//            replaceWord(wordToFind, changeTo);
//            this.changeTo = changeTo;
//        }
    }

    BufferedReader buffReader;
    BufferedWriter bufferedWriter;
    StringBuilder stringBuilder = new StringBuilder();

    private void createFile() throws IOException {

        byte[] byteBuffer = new byte[BUF_SIZE];
        int start=0;
        try(RandomAccessFile raf = new RandomAccessFile(new File(filePath), "rw")){

       raf.read(byteBuffer,start, 10);
for (int i=0;i<BUF_SIZE;i++) System.out.println(byteBuffer[i]);
raf.seek(20);
raf.write(byteBuffer);
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
//            String temp;
//            while(br.ready()){
//                temp = br.readLine();
//                int index = temp.indexOf(wordToFind);
//                    while (index !=-1){
//                        index = replaceWord(temp);
//                    }
                }
            }
        }
//    }

//    private int replaceWord(String line) {
//        try (FileWriter fw = new FileWriter(new File(filePath + "1"))) {
//            int len = wordToFind.length();
//                        fw.write(tmp.substring(0, i));
//                        fw.write(changeTo);
//                        tmp = tmp.substring(i + len);
//                        i = tmp.indexOf(wordToFind);
//                        if (i == -1) fw.write(tmp + "\n");
//                    }
//                } else {
//                    fw.write(tmp + "\n");
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    private void findEntries() {
//    }
//
//}
