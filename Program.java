public class Program{
    public static void main(String[] args){
        Program program=new Program();
        System.out.println(program.power(2,3));
    }

    public void recursive(int num){
        if(num>0){
            recursive(num-1);
        }
        System.out.println(num);
    }

    public int recursiveOne(int num){
        if(num>0){
            recursiveOne(num-1);
        }
        return num;
    }

    public int power(int num1, int num2){
	    if(num2==0){
	    	return 1;
	    }else{
            System.out.println(num1+" "+num2);
	    	return num1 * power(num1, num2-1);
	    }
    }
}
