
public class TestaConta {
	public static void main(String[] args) {
		Conta joao = new Conta();
		joao.deposita(50.0);
		
		try {
			joao.saca(100.0);
		} catch(Exception e) {
			System.out.println("saldo insuficiente!!");
		}
		System.out.println(joao.getSaldo());
	}
}
