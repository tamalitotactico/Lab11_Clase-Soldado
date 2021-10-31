package VideoJuegoxd;

class Soldado {
	
	private String nombre;
	private int nivelAtaque;
	private int nivelDefensa;
	private int nivelVida;
	private int vidaActual;
	private int velocidad;
	private String actitud;
	private Boolean vive;

	private int fila;
	private int columna;
		
	// 	Metodos mutadores
		
	Soldado (){
		nombre=null;
		nivelAtaque=0;
		nivelDefensa=0;
		nivelVida=0;
		vidaActual=0;
		velocidad=0;
		actitud=null;
		vive=null;
	}
	
	// SET ---------------------------
	public void setNombre(String str) {
		nombre = str;
	}
	public void setNivelAtaque(int atclevel) {
		nivelAtaque = atclevel;
	}	
	public void setNivelDefensa(int deflevel) {
		nivelDefensa = deflevel;
	}	
	public void setNivelVida(int lifelevel) {
		nivelVida = lifelevel;
	}	
	public void setVidaActual(int hp) {
		vidaActual = hp;
	}
	public void setVelocidad(int speed) {
		velocidad = speed;
	}
	public void setActitud(String act) {
		actitud = act;
	}	
	public void setVive(Boolean vida) {
		vive = vida;
	}	
	public void setFila(int fil) {
		fila = fil;
	}
	public void setColumna(int col) {
		columna = col;
	}
	
	// GET -------------------------
	
	public String getNombre() {
		return nombre;
	}
	public int getNivelAtaque() {
		return nivelAtaque;
	}	
	public int getNivelDefensa() {
		return nivelDefensa;
	}	
	public int getNivelVida() {
		return nivelVida;
	}	
	public int getVidaActual() {
		return vidaActual;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public String getActitud() {
		return actitud;
	}	
	public Boolean getVive() {
		return vive;
	}	
	public int getFila() {
		return fila;
	}
	public int getColumna() {
		return columna;
	}
}
