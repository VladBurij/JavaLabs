class Stock {
  String symbol = "SYM";
  String name = "Name";
  double previousClosingPrice = 0;
  double currentPrice = 0;

  Stock(String sym, String nam, double prev, double curr) {
    symbol = sym;
    name = nam;
    previousClosingPrice = prev;
    currentPrice = curr;
  }

  void changePrice(double newPrice) {
    previousClosingPrice = currentPrice;
    currentPrice = newPrice;
  }

  double getChangePercent() {
    return (currentPrice / previousClosingPrice - 1) * 100;
  }
}