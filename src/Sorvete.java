
public class Sorvete extends ItemSobremesa {
		
	private int custo;
	
	public Sorvete(int custo) {
		setCusto(custo);
	}
	
	public void setCusto(int custo) {
		System.out.printf("Digite o preco por quilo do doce: ", custo);
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
	  return String.format("%-25s %6s", getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}

}
