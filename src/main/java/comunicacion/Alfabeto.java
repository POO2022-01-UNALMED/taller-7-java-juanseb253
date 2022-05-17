package comunicacion;
public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	public String[] getLetras(){
		return letras;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public int cantidadLetras() {
		return letras.length;
		
	}
	public String toString() {
		String a = "";
		String b = ", ";
		for (int i = 0; i< letras.length;i++) {
			String c = letras[i];
			if (i == letras.length-1) {
				a = a.concat(c);
			}
			else {
				a = a.concat(c);
				a = a.concat(b);
			}
		}
		return a;
	}
}
