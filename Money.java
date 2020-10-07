abstract class Money  {
    protected int amount;
    private String currency;

    String currency() {
        return currency;
    }

    public boolean equals(Object object)  {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Money dollar(int amount)   {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
   }

    abstract Money times(int multiplier);
}

class Franc extends Money {	
    Franc(int amount, String currency) {
        super(amount, currency);
    }
     
    Money times(int multiplier)  {
        return Money.franc(amount * multiplier);
   }
}

class Dollar extends Money {	
    Dollar(int amount, String currency)  {
        super(amount, currency);
    }
	
    Money times(int multiplier)  {
        return Money.dollar(amount * multiplier);
    }
}