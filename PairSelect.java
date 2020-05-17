import tester.*;
class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a = a;
        this.b = b;
    }
    
}
class PairSelect{
    int[] getAs(Pair[] input){
        int[] temp =  new int[input.length];
        for(int i = 0;i<input.length;i++){
            temp[i] = input[i].a;
        }
        return temp;
    }

    Pair test1 = new Pair(2,3);
    Pair test2 = new Pair(22,33);
    Pair test3 = new Pair(1,90);
    Pair test4 = new Pair(11,25);
    Pair[] aha = {test1,test2,test3,test4};
    Pair[] woohoo = {test1,test2,test3};
    Pair[] eyyo = {test1,test2};
    Pair[] wow = {test1};
    int[] expect1 = {2,22,1,11};
    int[] expect2 = {2,22,1};
    int[] expect3 = {2,22};
    int[] expect4 = {2};

    boolean testgetAs1(Tester t){
        return t.checkExpect(this.getAs(aha),expect1);
    }
    boolean testgetAs2(Tester t){
        return t.checkExpect(this.getAs(woohoo),expect2);
    }
    boolean testgetAs3(Tester t){
        return t.checkExpect(this.getAs(eyyo),expect3);
    }
    boolean testgetAs4(Tester t){
        return t.checkExpect(this.getAs(wow),expect4);
    }
}