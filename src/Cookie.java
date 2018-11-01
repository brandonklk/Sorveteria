
public class Cookie extends ItemSobremesa {
	
	private int numero;
	private int precoPorDuzia;
	private int custo;
	public Cookie(int numero, int precoPorDuzia, int custo) {
		setNumero(numero);
		setPrecoPorDuzia(precoPorDuzia);
		setCusto(custo);
	}
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		System.out.printf("Digite o peso da compra: ", numero);
        this.numero = (int) numero;
		this.numero = numero;
	}


	public int getPrecoPorDuzia() {
		return precoPorDuzia;
	}


	public void setPrecoPorDuzia(int precoPorDuzia) {
		System.out.printf("Digite o preco por quilo do doce: ", precoPorDuzia);
        this.precoPorDuzia = (int) precoPorDuzia;
		
		
	}

	public void setCusto(int custo) {
		custo = numero / 12 * precoPorDuzia;
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
	  return String.format("%d @ %s /dz\n%-25s %6s", getNumero(), 
	    Sorveteria.centavos2ReaisECentavos(getPrecoPorDuzia()), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	
}
