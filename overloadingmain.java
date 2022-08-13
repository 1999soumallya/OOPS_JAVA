class overloadingmain{
    public static void main(boolean args1) {
        if(args1){
            System.out.println("main with string[]");
        }
    }
    public static void main(boolean args2,boolean args3) {
        if(args2 && args3)
        System.out.println("main with args2");
    }
    public static void main(String[] args) {
        System.out.println("Main with out arg");
        overloadingmain.main(true);
        overloadingmain.main(true, true);
    }
}