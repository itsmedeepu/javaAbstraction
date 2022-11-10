//contribution Deepak s


//1. Vegetables class File

public class Vegetables {
	
    public void Carrot(){
        
    }
  
    public void Potato(){
        
        
    }
    public void Beans(){
        
        
    }
    public void BeetRoot(){
        
        
    }
    public void LadiesFinger(){
        
        
    }
    public void CauliFlower(){
        
        
    }
    
    

}

//2. shopKeeper class File

public class shopKeeper extends Vegetables {
    @Override
	  public void Carrot(){
	        System.out.println("Carrot is available Carrot alva prepared");
	    }
    
    @Override
    public void Potato(){
    	System.out.println("Potato is available French fires prepared");
        
        
    }
    
   
}


//3.Daughter class file

public class Daughter extends Vegetables
{
	public void purchased(Vegetables v) {
		v.Carrot();
		
	}
	
}


//4.mom class file

public class Mom extends Vegetables {
	
	public void Cook(Daughter d)
    {
       d.purchased(new shopKeeper());
        
    }


}


//5.cook class file


public class Cook {
	
	public static void main(String[] args) {
		Mom m = new Mom();
		m.Cook(new Daughter());
	}

}

