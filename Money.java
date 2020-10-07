abstract class Money  {
    protected int amount;
   
    public boolean equals(Object object)  {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }   

    static Dollar dollar(int amount) {
      return new Dollar(amount);
    }

    static Franc franc(int amount) {
      return new Franc(amount);
    }

    abstract Money times(int multiplier);
  } 
}

abstract class Money {
   ...
   static Dollar dollar(int amount)  {
      return new Dollar(amount);
   }
	
   abstract Money times(int multiplier);  
}

