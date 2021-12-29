
public class Account {

	private int number;
	private String holder;
	private double balance;
	static int qtdAccounts = 0;
	double value;

	public Account(String pHolder) {
		this.holder = pHolder;                 // atribuindo ao atributo holder, o parametro pholder
		qtdAccounts++;                        // auto incremento conta
		this.number = qtdAccounts;           // soma das contas
		this.balance = 0;                   // estabelecendo valor inicial

	}

	public void bankData() {
		System.out.println("");
		System.out.println("--Bank data--");
		System.out.println("--number-- " + this.number);
		System.out.println("--holder-- " + this.holder);
		System.out.println("--balance--" + this.balance);

	}
	
	public void Deposit (double valorDeposito) {
		System.out.println("");
		System.out.println("--processing the deposit--");
		System.out.println("--previous account balance-- "+this.balance);
		this.balance+=valorDeposito;     //this.saldo=this.saldo+pValor;
		System.out.println("--balance after deposit-- "+this.balance);
		System.out.println("---end of transaction---");
		

     	}
	
		
	public void Withdraw (double valorSaque) {
		System.out.println("");
		System.out.println("--realizando saque--");
		System.out.println("--account balance previously-- "+this.balance);
		
		if (valorSaque <=this.balance) {
		this.balance -= valorSaque;
		System.out.println("--account balance after withdrawal-- "+ this.balance);
		
        }else{
		System.out.println("insufficient funds");
        }

		System.out.println("fim saque");

		}
	
}