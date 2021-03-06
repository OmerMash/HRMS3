package com.hrms.hrms;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Model implements IDAO {
    private static ObjectOutputStream output;
    private static ObjectInputStream input;
    private Object Stream;
    private Object FileContent;
    private List<Person> l = new ArrayList<Person>();
    public String fileName = "person_ser";


    public Model(String fileName) throws IOException {
        try {//read file to input stream and add file content to list
            input = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)));
            while(true){
                Person p = (Person) input.readObject();
                System.out.println(p);
                l.add(p);
            }
        } catch (ClassNotFoundException | IOException e) {
        }
    }

    public void add(Person p){
        l.add(p);
//        try {
//            writeListToFile(l);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public void writeListToFile(List<Person> l) throws IOException {
        //write to file
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("person_ser")));
            for (Person p : l) {
                output.writeObject(p);
        }
        output.close();
    }

//GETTERS
    public List<Person> getList(){ return l;}

}

//    public void writeListToFileFILE(List<Person> l) throws IOException {
//        //write to file
//        output = new ObjectOutputStream(Files.newOutputStream(Paths.get("person_ser")));
//        for (Person p : l) {
//            output.writeObject(p);
//            output.close();
//        }
//    }


//#VERSION1
//    public void writeListToFile(List<Person> l) throws IOException {
//        //write to file
//        if(output==null){
//            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("person_ser")));
//            for (Person p : l) {
//                output.writeObject(p);
//            }
//            output.close();
//        }
//    }

//    public List<String> getListFromFile(String filename, String listName) throws IOException {
//        List<String> result;
//        (Stream FileContent lines = Files.lines(Paths.get(filename))){
//            result = lines.collect(Collectors.toList());
//
//
//            return null;
//        }
//    }


//


//
//    public void readFile() throws IOException{
//        String currentLine;
//
//        BufferedReader reader = new BufferedReader(new FileReader(filePath));
//
//        while ((currentLine = reader.readLine()) != null) { //while not reached EOF
//            if (currentLine.matches("(.*)" + manipulatedString + "(.*)")) {
//                System.out.println(currentLine);
//    }}
//    public void CheckOut() throws IOException, InterruptedException {
//        File tempFile = new File("C:\\Users\\User\\IdeaProjects\\HRMS");
//        String currentLine;
//
//        BufferedReader reader = new BufferedReader(new FileReader(tempFile));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//
//        while ((currentLine = reader.readLine()) != null) { //while not reached EOF
//            if (currentLine.matches("(.*)" + manipulatedString + "(.*)")) {
//                System.out.println(currentLine);
//
//                writer.write(currentLine + System.getProperty("line.separator"));
//                writer.flush();
//            }
//            writer.close();
//            reader.close();
//
//        }
//
//
//    }
