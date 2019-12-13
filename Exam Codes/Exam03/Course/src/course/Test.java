/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author cstuser
 */
public class Test {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Assessment a1 = new Assessment("", "", 5);
        Assessment a2 = new Assessment("", "", 15);
        Assessment a3 = new Assessment("", "", 40);
        Assessment a4 = new Assessment("", "", 40);
        Course c1 = new Course("Programming One", 3, a1, a2, a3, a4);
        Course c2 = new Course("Programming One", 3, a1, a2, a3, a4);
        Course c4 = new Course("Programming One");
        Course c3 = c2;
        System.out.println(a1);
        System.out.println(c1.equals(c2));
//        System.out.println(c2);
        System.out.println(c4);
        
    }
}
