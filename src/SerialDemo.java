import java.io.*;
import java.util.function.DoubleToIntFunction;

public class SerialDemo {
    public static void main(String[] args) throws Exception {
        Save obj=new Save();
        obj.i=4;


        File f=new File("Obj.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);//how to handle objects
        oos.writeObject(obj);


        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Save obj1=(Save)ois.readObject();//have to cast to Save because what readObject returns is an Object
        System.out.println("value of i in obj1 "+obj1.i);


    }
}



class Save implements Serializable{//to save object we NEED TO IMPLEMENT SERIALIZABLE
    int i;
}