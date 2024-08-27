// TODO: Factor this so that we only read shit once.
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.LinkedList;

public class ReadAccounts {
    public BufferedReader reader;
    public String url;

    public ReadAccounts(){};
    public ReadAccounts(String url) { this.url = url; }

    public LinkedList<String> getFirstNames() throws IOException { 
        LinkedList<String> firstNames = new LinkedList<>();
        reader = new BufferedReader(new FileReader(url));
        String line;

        while((line=reader.readLine()) != null){
            String[] data = line.split(",");
            firstNames.add(data[0]);
        }

        reader.close();
        return firstNames;
    }
    public LinkedList<String> getLastNames() throws IOException{ 
        LinkedList<String> lastNames = new LinkedList<>();
        reader = new BufferedReader(new FileReader(url));
        String line;

        while((line=reader.readLine()) != null){
            String[] data = line.split(",");
            lastNames.add(data[1]);
        }
        reader.close();
        return lastNames;

    }
    public LinkedList<Integer> getAccounts() throws IOException{ 
        LinkedList<Integer> AccNumbers = new LinkedList<>();
        reader = new BufferedReader(new FileReader(url));
        String line;
        while((line=reader.readLine()) != null){
            String[] data = line.split(",");
            AccNumbers.add(Integer.parseInt(data[2]));
        }

        reader.close();
        return AccNumbers;

    }
    public LinkedList<Integer> getBalances() throws IOException{
        
        LinkedList<Integer> AccBalances = new LinkedList<>();
        reader = new BufferedReader(new FileReader(url));
        String line;
        while((line=reader.readLine()) != null){
            String[] data = line.split(",");
            AccBalances.add(Integer.parseInt(data[3]));
        }

        reader.close();
        return AccBalances;
    }
    

}
