public class Main{
	public static void main(String[] args){
		for(int i = 1; i < 11; i++){
			new MeuThread("Múltiplo de "+i, i, i*10).start();
		}
	}
}