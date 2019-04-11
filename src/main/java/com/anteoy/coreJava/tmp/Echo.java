package com.anteoy.coreJava.tmp;

import java.io.*;

/**
 * @auther zhoudazhuang
 * @date 19-4-10 16:50
 * @description
 */
public class Echo {
    private static final String SYSTEM_FILE_ENCODING = System.getProperty("file.encoding");

    public static void main(String[] args){
        try(
                InputStreamReader inputStreamReader = new InputStreamReader(System.in,SYSTEM_FILE_ENCODING);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out,SYSTEM_FILE_ENCODING);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                ){
//            int i = 0;
//            while(i!=-1){
//                i = System.in.read();
//        System.out.println(i);
//            }
            String in = bufferedReader.readLine();
            while (in != null){
                in = in + "\n";
                bufferedWriter.write(in);
                bufferedWriter.flush();
                in = bufferedReader.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
