
public class Sundae extends Sorvete {
		
	private String calda;
	private int precoDeCalda;
	private int custo;

	public Sundae(String calda, int precoDeCalda, int custo){
		
		setCalda(calda);
		setPrecoDeCalda(precoDeCalda);
		setCusto(custo);
	}
	
	
	public String getCalda() {
		return calda;
	}


	public void setCalda(String calda) {
		System.out.printf("Digite o preco por quilo do doce: ", calda);
        this.calda = (String) calda;
		
	}


	public int getPrecoDeCalda() {
		return precoDeCalda;
	}


	public void setPrecoDeCalda(int precoDeCalda) {
		this.precoDeCalda = precoDeCalda;
	}

	public void setCusto(String custo, int precoDeCalda) {
		custo = calda + precoDeCalda;
        int imposto;
    	imposto = custo / 100 * 2;
    	custo = custo + imposto;
        this.custo = (int) custo;
	}
	
	@Override
	public int getCusto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
	  return String.format("Sundae de %s com\n%-25s %6s", getCalda(), 
	    getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	
}
