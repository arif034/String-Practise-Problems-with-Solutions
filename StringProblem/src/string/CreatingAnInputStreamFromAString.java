package string;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class CreatingAnInputStreamFromAString {

	public static void main(String[] args) 
	{
		String s = "RandomTestString";
		InputStream is = new ByteArrayInputStream(StandardCharsets.UTF_16.encode(s).array());
		try 
		{
			int a = is.read();
			System.out.println(a);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
