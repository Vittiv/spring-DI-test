package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Egg6 {

    private Needle7 needdle;

    public Egg6(Needle7 needdle) {  this.needdle = needdle; }

    @Override
    public String toString() {
        return ", в яйце иголка " + needdle.toString();
    }

    @Autowired
    public void setNeeddle(Needle7 needdle){ this.needdle = needdle; }

}
