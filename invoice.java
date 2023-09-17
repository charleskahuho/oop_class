package invoice;

public class invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************Adamson Computers Ltd*************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
		System.out.println("\t\t VAT REG. TIN 098-765-4321-0000");
		System.out.println("\t\t\t  SALES INVOICE");
		System.out.println(" ");
		System.out.println(" ");
		String Soldto = "C026-01-2549/2022";
		String Address = "Vinnius Cheruiyot";
		int contact = 0100100100;
		String date = "17/09/2023";
		System.out.println("Sold to:" + Soldto + "\t\t\t\tDate:" + date);
		System.out.println("Address:" + Address +"\t\t\t\tContact Number:" + contact);
		System.out.println("===============================================================================");
		System.out.println("Qty\t|\tItem Description\t|\t\tUnit price\t|Amount");
		System.out.println("===============================================================================");
		System.out.println("4\t|\tPencil\t\t\t|\t\t20\t\t|80.00");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("10\t|\tDuster\t\t\t|\t\t50\t\t|500.00");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("9\t|\tPens\t\t\t|\t\t30\t\t|270.00");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("10\t|\tcrayon\t\t\t|\t\t80\t\t|800.00");
		System.out.println("===============================================================================");
		System.out.println("\t\t\t\t\t\t\t|Sub Total\t|1650.00");	
		System.out.println("\t\t\t\t\t\t\t==============");
		System.out.println("\t\t\t\t\t\t\t|VAT(16%)\t|264.00");
		System.out.println("\t\t\t\t\t\t\t==============");
		System.out.println("\t\t\t\t\t\t\t|Total Amount\t|1914.00");
		System.out.println("\t\t\t\t\t\t\t==============");
		
		

	}

}