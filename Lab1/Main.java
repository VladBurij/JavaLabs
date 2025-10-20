public class Main {
	public static void main(String[] args) {
		Rectangle[] recs = new Rectangle[10];
		for (int i = 0; i < 10; i++) {
			recs[i] = new Rectangle((float) i + 1, (float) i + 2);
            System.out.println(i + 1 + ") W: " + recs[i].width + " H: " + recs[i].height + " S: " + recs[i].getArea() + " P: " + recs[i].getPerimeter());
		}
		Stock sber = new Stock("SBER", "ПАО Сбербанк", 281.5, 282.87);
		System.out.println(sber.getChangePercent() + "%");
		Stock[] stocks = new Stock[3];
		stocks[0] = new Stock("FUFL", "Fufelshmerts Inc", 1.005, 12.3);
		stocks[1] = new Stock("PSDN", "Poseidon Energy", 1034.1, 999.43);
		stocks[2] = new Stock("VLAD", "ВладКомп", 22.34, 25.01);
		System.out.println("Index|Company|PercentChange");
		for (Stock stock:stocks) {
            System.out.println(stock.symbol + "|" + stock.name + " | " + stock.getChangePercent() + "%");
		}
	}
}
