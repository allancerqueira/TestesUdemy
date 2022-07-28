package EntitiesPagamento;

public class Pagamento {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double netSalary () {
		return grossSalary - (grossSalary * (tax/100));
	}
	
	public void increaseSalary (double increase) {
		this.grossSalary +=  grossSalary*(increase/100);
	}
	
	public String toString () {
		return "Employee: "
				+ name
				+ " , recebe de salário $"
				+ String.format("%.2f", netSalary())
			
				;
	}
	
	
	

}
