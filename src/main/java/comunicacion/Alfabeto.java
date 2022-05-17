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
		for (int i; i< letras.length;i++) {
			String c = letras[i];
			if (i == letras.length-1) {
				a.concat(c);
			}
			else {
				a.concat(c);
				a.concat(b);
			}
		}
		return a;
	}
}
