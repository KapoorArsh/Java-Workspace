package oops;

class Type3 {
    int add(int a, int b) {
        System.out.println("Addition: ");
        return a + b;
    }

    int multi(int c, int d) {
        System.out.println("Multiplication: ");
        return c * d;
    }
}

class Noorpal extends Type3 {
}

class Kartik extends Type3 {
    public static void main(String[] args) {
        Noorpal k = new Noorpal();
        System.out.println(k.add(2, 3));
    }
}

