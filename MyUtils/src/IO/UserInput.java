package IO;
import java.io.*;
public class UserInput {
    
    static int getInteger(){
        String line;
        InputStreamReader eisodosString = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            int i=Integer.parseInt(line);
            return i;
        }
        catch(Exception e){
            return -1;
        }
    }
    
    static float getFloat(){
        String line;
        InputStreamReader eisodosString = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            float i=Float.parseFloat(line);
            return i;
        }
        catch (Exception e){
            return -1;
        }
    }
    
    static double getDouble(){
        String line;
        InputStreamReader eisodosString = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            double i=Double.parseDouble(line);
            return i;
        }
        catch (Exception e){
            return -1;
        }
    }
    
    static byte getByte(){
        String line;
        InputStreamReader eisodosString = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            byte i=Byte.parseByte(line);
            return i;
        }
        catch (Exception e){
            return -1;
        }
    }
    
    static short getShort(){
        String line;
        InputStreamReader eisodosString = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            short i=Short.parseShort(line);
            return i;
        }
        catch(Exception e){
            return -1;
        }
    }
    
    static long getLong(){
        String line;
        InputStreamReader eisodosString = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            long i=Long.parseLong(line);
            return i;
        }
        catch(Exception e){
            return -1;
        }
    }
    
    static char getChar(){
        char line;
        InputStreamReader eisodosString = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(eisodosString);
        try{
            line=(char)br.read();
            return line;
        }
        catch(Exception e){
            return 'e';
        }
    }
    
    static String getString(){
        String line;
        InputStreamReader eisodosString = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(eisodosString);
        try{
            line=br.readLine();
            return line;
        }
        catch(Exception e){
            return "Error";            
        }
    }
}
