package jp.techacademy.kenta.imabayashi.javalog;

import android.util.Log;

/**
 * Created by kenta on 2017/08/20.
 */

public class Human extends Animal implements Thinkable{

        String hobby ;

    // コンストラクタ
    public Human(String name,int age,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }


    @Override
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。");
        Log.d("javatest", "年は" + this.name + "です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考えています");
    }
}
