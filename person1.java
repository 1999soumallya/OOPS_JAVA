class person1{
    private String name;
    private int YOB;
    public person1(String n,int birth){
        this.name=n;
        this.YOB=birth;
    }
    @Override
    public String toString() {
        return (name+" "+YOB);
    }
}
