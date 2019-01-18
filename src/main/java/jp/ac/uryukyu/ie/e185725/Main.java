package jp.ac.uryukyu.ie.e185725;

public class Main {
    /**
     * ゲームを動かすクラス
     */
    public static void main(String[] args){
        /**
         * int keta //桁数
         * int [] target //シャッフルの元となるもの
         */

        int keta = 3;
        int [] target;
        target = new int[]{0,1,2,3,4,5,6,7,8,9};
        EnemyNumber enemy = new EnemyNumber(keta,target);
        Play play = new Play(keta,target);

        System.out.println("Numer0n!!");


    }
}
