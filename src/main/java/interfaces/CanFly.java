package interfaces;

class myClass {
    static CanFly obj = new CanFly() {

        @Override
        public String fly() {
            //no hago nada
            return null;
        }

        @Override
        public void someMethod7() {
            //nada
        }
    };

    public static void main(String[] args) {
        CanFly otroObj = new CanFly() {

            public String fly() {
                return type;
            }

            public void someMethod7() {
                System.out.println("otroObj, someMethod7, type = " + type);
            }

            public String someMethod1() {
                return "Overrided someMethod1 otroObj.";
            }
        };
        System.out.println(myClass.obj.someMethod1());
        System.out.println(otroObj.someMethod1());
        if (otroObj.fly().equals("A")) {
            otroObj.someMethod7();
        }
    }
}

public interface CanFly {
    String type = "A";

    String fly();
    default String someMethod1() {
        return "interface, default someMethod1";
    }
    public static void someMethod4() {}
//    public void someMethod5() {}
    private void someMethod6() {}
    public void someMethod7();


    //changing the order:
    default public String someMethod2() {return "method 2";}
    static public void someMethod3() {}
//    XXXX String getType() {
//        return type;
//    }
}

// Answer: replace "XXXX" by "default"
// From Java SE 8, we can use static and/or default methods in interfaces, but they should
// be non-abstract methods.