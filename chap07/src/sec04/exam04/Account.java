package sec04.exam04;

public class Account {
	 private String ano;
	    private String owner;
	    private int balance;

	    public Account(String ano, String owner, int balance){
	        this.ano = ano;
	        this.owner = owner;
	        this.balance = balance;
	    }
	    //getter ano
	    public String getAno() {
	        return ano;
	    }
	    //setter ano
	    public void setAno(String ano){
	        this.ano = ano;
	    }
	    //getter owner
	    public String getOwner(){
	        return owner;
	    }
	    //setter owner
	    public void setOwner(String owner){
	        this.owner = owner;
	    }
	    //getter balance
	    public int getBalance() {
	        return balance;
	    }
	    //setter balance
	    public void setBalance(int balance){
	        this.balance = balance;
	    }
}
