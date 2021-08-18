package modules;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BinhLuan {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String author;
    String feedBack;
    int thich;
    int khongThich;
    int rate;

    public BinhLuan() {
    }

    public BinhLuan(int id, String author, String feedBack) {
        this.id = id;
        this.author = author;
        this.feedBack = feedBack;
    }


    public BinhLuan(int id, String author, String feedBack, int thich, int khongThich, int rate) {
        this.id = id;
        this.author = author;
        this.feedBack = feedBack;
        this.thich = thich;
        this.khongThich = khongThich;
        this.rate = rate;
    }

    public int getThich() {
        return thich;
    }

    public void setThich(int thich) {
        this.thich = thich;
    }

    public int getKhongThich() {
        return khongThich;
    }

    public void setKhongThich(int khongThich) {
        this.khongThich = khongThich;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
