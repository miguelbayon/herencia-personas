   public class Alumno extends Persona{

	private int anosEnElCentro;

	public Alumno(int edad, int anosEnElCentro) { 
        super(edad);
        this.anosEnElCentro = anosEnElCentro; 
    }

	public int getAnosEnElCentro() {
        return anosEnElCentro;
    } 
    
    public int anosFueraDelCentro() {
        return getEdad() - anosEnElCentro;
    }
}
