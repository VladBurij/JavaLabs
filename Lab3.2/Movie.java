public class Movie {
  private String title = "";
  private int duration = 0;
  private double rating = 0.0;
  
  Movie(String name, int dur, double rait) {
    title = name;
    duration = dur;
    raiting = rait;
  }
  
  public String toString(){
    return "Название: " + title + ", Продолжительность: " + duration + ", Рейтинг: " + raiting;
  }
  
  public boolean equals(Object another) {
    if (this == another) {
      return true;
    }
    else if (!(this instanceof Movie)) {
      return false;
    }
    else if (this.title == ((Movie) another).title & this.duration == ((Movie) another).duration) {
      return true;
    }
    else {
      return false;
    }
  }
}
