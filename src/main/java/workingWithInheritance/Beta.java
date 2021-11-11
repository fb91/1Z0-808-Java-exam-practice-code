/*
 * What will the following code print when compiled and run?
 */

package workingWithInheritance;

class Baap {
    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class Beta extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH());
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
    }
}

/*
 * Answer:
 * Beta 44
 * 4 44
 * Beta 44
 * 44 44
 *
 * Explanation:
 * Always remember: Instance methods are overridden and variables are hidden. Which method is invoked depends on the
 * class of the actual object, while which field is accessed depends on the class of the variable. Here, b refers to an
 * object of class Beta so b.getH() will always call the overridden (subclass's method). However, the type of reference
 * of b is Baap. so b.h will always refer to Baap's h.
 * Further, inside Beta's getH(), Beta's h will be accessed instead of Baap's h because you are accessing this.h ('this'
 * is implicit) and the type of this is Beta.  The class of bb, on the other hand, is Beta. Thus, bb.h will always refer
 * to Beta's h.
 */

