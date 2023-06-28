//Add two complex number

public class complexNum{
    int real, imagi;

    //constructor for creating complex number
    public complexNum(int r, int i){
        this.real = r;
        this.imagi = i;
    }

    //function to print complex number
    public void showcomp(){
        System.out.println(this.real + "+i" +this.imagi);
    }

    //function to add complex number
    public static complexNum add(complexNum n1, complexNum n2){
        complexNum result = new complexNum(0,0);

        //adding real parts
        result.real = n1.real + n2.real;

        //adding imaginary parts
        result.imagi = n1.imagi + n2.imagi;
        return result;
    }

    public static void main(String[] args){
        complexNum c1 = new complexNum(3,4);
        complexNum c2 = new complexNum(6, 9);

        System.out.println("Fist complex number: ");
        c1.showcomp();

        System.out.println("Second complex number: ");
        c2.showcomp();

        //calling add function
        complexNum result = add(c1, c2);
        System.out.println("Addition is: ");
        result.showcomp();
    }
}

//Time complexity = O(1)
//Space complexity = O(1)