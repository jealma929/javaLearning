import java.util.List;
import java.lang.String;

public class SubCadena {
	
	private void Buscar(String fText) {
		// TODO Auto-generated method stub
		
		String frame=fText.substring(0,fText.indexOf("**"));
		String campo=fText.substring(fText.indexOf("**")+2,fText.indexOf("**"));
		String text=fText.substring(fText.indexOf("**")+2);
		System.out.println(frame);
		System.out.println(campo);
		System.out.println(text);
		
		String sql="SELECT * FROM "+frame;
		
		if (text=="*") {      //(text.length()==0) {
			System.out.println(sql);
		} else {
			sql = sql +"WHERE "+campo+" =?";
			System.out.println(sql);
		}

		}

	public void main (String[] args) {
		
		String str="libro**nombre**esto es una prueba";
		Buscar(str);

		
	}
}

		
