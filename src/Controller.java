import java.util.ArrayList;
import java.util.Scanner;


public class Controller {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String read;
		int option;
		double value;
		int number,number2;
		
		System.out.println("enter with the account holder");
		
		ArrayList<Account> readAccount = new ArrayList<>();
		
		read= scan.nextLine();
		
		Account c1,c2;
		
		do{
			System.out.println("");
			System.out.println("--menu service--");
			System.out.println("1) open account ");
			System.out.println("2) dados bancarios ");
			System.out.println("3) deposito");
			System.out.println("4) saque ");
			System.out.println("5) transfer");
			System.out.println("0) sair");
			
			System.out.println("");
			System.out.println("option");
			option = scan.nextInt();
			scan.nextLine();
			
			switch (option) {

	        case 1:
	            System.out.println("digite o nome do titular");
	            read = scan.nextLine();
	            c1 = new Account(read);
	            readAccount.add(c1);
	            break;

	        case 2:
	            System.out.println("digite o numero da conta");
	            number = scan.nextInt();
	            c1 = readAccount.get(number - 1);//ajuste para auto incrementar o vetor devido o mesmo sair do 0, -1 do n dig
	            c1.bankData();
	            break;

	        case 3:

	            System.out.println("digite o numero da conta");
	            number = scan.nextInt();
	            c1 = readAccount.get(number - 1);
	            System.out.println("digite o valor do deposito ");
	            value = scan.nextDouble();
	            c1.Deposit(value);
	            break;

	        case 4:
	            System.out.println("digite o numero da conta");
	            number = scan.nextInt();
	            c1 = readAccount.get(number - 1);
	            System.out.println("digite o valor de saque");
	            value = scan.nextDouble();
	            c1.Withdraw(value);
	            break;
	            
	        case 5:
	            System.out.println("digite a conta de origem");
	            number = scan.nextInt();
	            c1 = readAccount.get(number - 1);
	            
	            System.out.println("digite a conta de destino");
	            number2 = scan.nextInt();
	            c2 = readAccount.get(number2 - 1);
	        
	            System.out.println("digite o valor de transfer");
	            value = scan.nextDouble();
	        //    c1.Transfer(c2,value);
	            break;

	        default:
	            if (option != 0)
	                System.out.println("Option invalid");
	            break;
	    }
	            System.out.println("");

	    } while (option != 0) ;

	    scan.close();
	}
	}