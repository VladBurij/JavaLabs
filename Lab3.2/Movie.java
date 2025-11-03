public class Movie {
  public String title = "";
  public int duration = 0;
  public double rating = 0.0;
  
  Movie(String name, int dur, double rait) {
    title = name;
    duration = dur;
    rating = rait;
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
  
  public String toString() {
    return "Название: " + title + ", Продолжительность: " + duration + ", Рейтинг: " + rating;
  }
}
