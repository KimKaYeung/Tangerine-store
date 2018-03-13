package kh.java.append;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		DataStreamTest dst=new DataStreamTest();
//		dst.writeDataFile();
		dst.readDataFile();
	}
	public void readDataFile(){
		try(FileInputStream fis =new FileInputStream("dataStream"); DataInputStream dis=new DataInputStream(fis)){
			System.out.println(dis.readUTF());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			
			System.out.println("");
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
	}
	public void writeDataFile(){
		try(FileOutputStream fos=new FileOutputStream("dataStream");DataOutputStream dos=new DataOutputStream(fos)){
			dos.writeUTF("김가영");
			dos.writeBoolean(true);
			dos.writeChar('c');
			dos.writeInt(76);
			
			System.out.println("작성완료");
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
