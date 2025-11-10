import java.util.ArrayList;
public class Bank {
  public static ArrayList<LoanRequest> loans = new ArrayList<>();
  
  public static void approveLoan(LoanRequest req) throws InvalidAmountException, InvalidTermException {
    if (req.sumLoan < 20000) {
      throw new InvalidAmountException("Сумма кредита в заявке ниже минимальной (20 000 руб).");
    }
    else if (req.timeReturn < 6) {
      throw new InvalidTermException("Время возрата кредита в заявке меньше минимального (6 мес).");
    }
    else {
      loans.add(req);
    }
  }
}