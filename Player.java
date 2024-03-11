package player;

public class Player {
    private String name;
    private char symbol;
    private String address;
    private String contactNumber;
    private String emailid;
    private int age;

    public void setPlayerDetails(String name,char symbol,String address,String contactNumber,String emailid,int age){
        this.name=name;
        this.symbol=symbol;
        this.address=address;
        this.contactNumber=contactNumber;
        this.emailid=emailid;
        this.age=age;
    }
    public void setPlayerNameAndAge(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setNameSymbolEmailidAge(String name,char symbol,String emailid,int age){
        this.name=name;
        this.symbol=symbol;
        this.emailid=emailid;
        this.age=age;
    }
    public void setPlayerNameAndSymbol(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }
    public void changeSymbol(char symbol){
        this.symbol=symbol;
    }
    public String getPlayerName(){
        return this.name;
    }
    public void getPlayerNameAndSymbol(){
        System.out.println("Player  Name: "+this.name);
        System.out.println("Player  Symbol: "+this.symbol);
    }
    public char getPlayerSymbol(){
        return this.symbol;
    }
    public void getPlayerDetails(){
        System.out.println("Player  Name: "+this.name);
        System.out.println("Player  symbol: "+this.symbol);
        System.out.println("Player  age: "+this.age);
        System.out.println("Player  emailid: "+this.emailid);
        System.out.println("Player  contactno: "+this.contactNumber);
        System.out.println("Player  address: "+this.address);
    }
   
}
