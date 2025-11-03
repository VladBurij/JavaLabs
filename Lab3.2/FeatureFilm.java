public class FeatureFilm extends Movie {
  public String genre = "";
  
  FeatureFilm(String name, int dur, double rait, String genr) {
    super(name, dur, rait);
    this.genre = genr;
  }
  
  public String toString() {
    return "Название: " + title + ", Продолжительность: " + duration + ", Рейтинг: " + rating + ", Жанр: " + genre;
  }
}
