
public class ListaC {
	private Nodo actual;
	private Nodo actual2;
	private Nodo inicio;
	private Nodo inicioCryp;
	private Nodo suma;
	
	public String encriptarTodo() {
		
		
		return null;
	}

	public char getElemento() {
		if(actual == null)System.out.printf("vacia");;
		char salida = actual.getDato();
		actual = actual.getSiguiente();
		return salida;
	}
	
	public char getElementoDec() {
		if(actual2 == null)System.out.printf("vacia");;
		char salida = actual2.getDato();
		actual2 = actual2.getSiguiente();
		return salida;
	}
	
	public void insertarTexto(char elemento) {
		Nodo nuevo = new Nodo();
		nuevo.setDato(elemento);
		if(inicio == null)inicio=nuevo;
			else{
				nuevo.setSiguiente(inicio);
				inicio=nuevo;
			}
	}
	
	public void insertarTextoCryp(char elemento) {
		Nodo nuevo = new Nodo();
		Nodo auxi=null;
		nuevo.setDato(elemento);
		if(inicioCryp == null)inicioCryp=nuevo;
			else{
				auxi=inicioCryp;
				while(auxi.getSiguiente()!=null){
					auxi=auxi.getSiguiente();
				}
				auxi.setSiguiente(nuevo);
				nuevo.setSiguiente(null);
				
			}
	}
	

	public void insertar (char letra){
		Nodo nuevo = new Nodo();
		nuevo.setDato(letra);
		nuevo.setSiguiente(nuevo);
		
		if(actual==null){
			actual=nuevo;
		}else{
			nuevo.setSiguiente(actual.getSiguiente());
			actual.setSiguiente(nuevo);
			
		}
		
	}

	public void insertarDecryip (char letra){
		Nodo nuevo = new Nodo();
		nuevo.setDato(letra);
		nuevo.setSiguiente(nuevo);
		
		if(actual2==null){
			actual2=nuevo;
		}else{
			nuevo.setSiguiente(actual2.getSiguiente());
			actual2.setSiguiente(nuevo);
			
		}
		
	}
	
	public void recorrer() {
		if(actual != null){
			Nodo aux = actual;
			do{
				System.out.printf("%c,",aux.getDato());
				aux=aux.getSiguiente();
			}
			while(aux!=actual);
				
			
		}
	}
	
	public String encryptionString()  {

		Nodo aux1=inicio;
		String restring="";
		int res;
		
		while(aux1!=null) {
			char op =aux1.getDato();
			int asciitext = (int) op;
			char op2=getElemento();
			int ascii2clave = (int) op2;
			
			res = asciitext+ascii2clave;
			
			if(res>255)res-=255;
			
			restring+=(char) res;
			
			aux1=aux1.getSiguiente();
		}
		return restring;
	}
	
	public String decryptionString()  {

		Nodo aux1=inicioCryp;
		String restring="";
		int res;
		
		while(aux1!=null) {
			char op =aux1.getDato();
			int asciitext = (int) op;
			char op2=getElementoDec();
			int ascii2clave = (int) op2;
			
			res = asciitext-ascii2clave;
			
			if(res<0)res=res+255;
			
			restring+=(char) res;
			
			aux1=aux1.getSiguiente();
		}
		return restring;
	}

	public void mostrarDatos() {
		
		Nodo aux = inicio;
		
			while(aux != null){			
				System.out.printf("%c, ", aux.getDato());
				aux=aux.getSiguiente();
			}
	}
	

	public Nodo getActual2() {
		return actual2;
	}

	public void setActual2(Nodo actual2) {
		this.actual2 = actual2;
	}

	public Nodo getInicioCryp() {
		return inicioCryp;
	}

	public void setInicioCryp(Nodo inicioCryp) {
		this.inicioCryp = inicioCryp;
	}

	
	public Nodo getSuma() {
		return suma;
	}

	public void setSuma(Nodo suma) {
		this.suma = suma;
	}
	
	public Nodo getActual() {
		return actual;
	}

	public void setActual(Nodo actual) {
		this.actual = actual;
	}
	
	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public ListaC(){
		actual= null;
	}
}
