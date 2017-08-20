package jp.techacademy.kenta.imabayashi.javalog;

import android.util.Log;

/**
 * Created by kenta on 2017/08/20.
 */

class BigDog extends Dog {

    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }

}
