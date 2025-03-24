import java.util.List;
import java.lang.String;

public class SubCadena2 {
	
	public static void main (String[] args) {
		
		String str="libro**nombre**esto es una prueba";
		buscar(str);

		
	}
	
	private static void buscar(String fText) {
		// TODO Auto-generated method stub
		
		String frame=fText.substring(0,fText.indexOf("**"));
		
		int indice=fText.indexOf("**");
		System.out.println(indice , indice+2);
		//String campo=fText.substring(fText.indexOf("**")+2,fText.indexOf("**"));
		//String text=fText.substring(fText.indexOf("**")+2);
		System.out.println(frame);
		//System.out.println(campo);
		//System.out.println(text);
		
		String sql="SELECT * FROM "+frame;
		
		System.out.println(sql);
		
		//sql = sql +"WHERE "+campo+" =?";
		//System.out.println(sql);
		
	}
}
