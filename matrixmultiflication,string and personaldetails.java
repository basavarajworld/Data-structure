import java.util.Scanner;
class matrix{
    int rows;
    int columns;
    int array[][];
    Scanner sc = new Scanner(System.in);
    matrix(int rows,int columns){
        this.rows = rows;
        this.columns = columns;
        this.array = new int[rows][columns];
    }
    public void getInput(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                array[i][j] = sc.nextInt();
            }
        }
    }


    public int matrixMul(matrix m1,matrix m2){
        int flag =0;
        if(m1.columns != m2.rows){
            flag =1;
            return flag;
        }
        else{
            for(int i=0;i<m1.rows;i++){
                for(int j=0;j<m2.columns;j++){
                    for(int k=0;k<m1.columns;k++){
                        array[i][j] += m1.array[i][k] * m2.array[k][j];
                    }
                }
            }
            return flag;
        }
    }


    public void printMatrix(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        //For matrix 1.
        System.out.println("For matrix 1");
        System.out.print("Enter the no of rows:\t");
        int rows1 = sc.nextInt();
        System.out.print("Enter the no of columns:\t");
        int columns1 = sc.nextInt();


        matrix m1 = new matrix(rows1,columns1);
        System.out.println("Enter the elements of the matrix");
        m1.getInput();




        //For matrix 2.
        System.out.println("For matrix 2");
        System.out.print("Enter the no of rows:\t");
        int rows2 = sc.nextInt();
        System.out.print("Enter the no of columns:\t");
        int columns2 = sc.nextInt();


        matrix m2 = new matrix(rows2,columns2);
        System.out.println("Enter the elements of the matrix");
        m2.getInput();
        matrix m3 = new matrix(m1.rows,m2.columns);
       int flag = m3.matrixMul(m1,m2);


        //Printing the matrices.
        System.out.println("The First matrix is");
        m1.printMatrix();


        System.out.println("The Second matrix is");
        m2.printMatrix();


        if(flag == 0){
            System.out.println("The multiplication of two matrices is");
            m3.printMatrix();
        }
        else{
            System.out.println("The multiplication of the two matrices is not possible");
        }
    }
}




String program number-6
import java.util.Scanner;
import java.util.Arrays;
class strings{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("1. Extract a portion of a string");
        System.out.println("2. Count the occurences of a particular word in a string");
        System.out.println("3. Replace a substring in a given string");
        System.out.println("4. Rearrange the strings in alphabetical order");
        System.out.println("5. Compare two strings ignoring case");
        System.out.println("6. Concatenate two strings");
        System.out.println("7. Exit!");


        while(true){
            System.out.print("Enter your choice:\t");
            int ch = sc.nextInt();
            sc.nextLine();


            switch(ch){
                case 1:
                        System.out.print("Enter the String:\t");
                        String s = sc.nextLine();
                        System.out.print("\nEnter the position of the string from which you wanna start extracting:\t");
                        int n = sc.nextInt();
                        System.out.print("\nEnter the no of characters to be extracted:\t");
                        int m = sc.nextInt();
                        String k = s.substring(n-1,m+n-1);
                        System.out.println("\nThe extracted string is: "+k);
                        break;
                        
                
                case 2:
                        System.out.print("Enter the String:\t");
                        s = sc.nextLine();
                        System.out.print("\nEnter the word whose occurences you wanna find:\n");
                        k = sc.next();
                        int counter = 0;
                        String arr[] = s.split(" ");
                        for(int i=0;i<arr.length;i++){
                            if(arr[i].equals(k)){
                                counter++;
                            }
                        }
                        System.out.println("\nThe no of occurences of the word "+k+" are "+counter);
                        break;
                
                case 3:
                        System.out.print("Enter the string:\t");
                        s = sc.nextLine();
                        System.out.print("\nEnter the substring you wanna replace:\t");
                        k = sc.next();
                        System.out.print("\nEnter the substring you wanna replace with:\t");
                        String p = sc.next();
                        String t = s.replace(k,p);
                        System.out.println("\nThe new string is: "+t);
                        break;
                        
                case 4:
                        System.out.print("Enter the string:\t");
                        s = sc.nextLine();
                        k = s.toLowerCase();
                        char[] arr2 = k.toCharArray();
                        Arrays.sort(arr2);
                        p = new String(arr2);
                        System.out.println("\nThe string arranged aphabetically  is: "+p);
                        break;
                
                case 5:
                        System.out.print("Enter the string 1:\t");
                        s = sc.nextLine();
                        System.out.print("\nEnter the string 2:\t");
                        k = sc.nextLine();
                        boolean cmp = s.equalsIgnoreCase(k);
                        if(cmp){
                            System.out.println("\nThe two strings are equal");
                        }
                        else{
                            System.out.println("\nThe two strings are not equal");
                        }
                        break;
                
                case 6:
                        System.out.print("Enter the string 1:\t");
                        s = sc.nextLine();
                        System.out.print("Enter the string 2:\t");
                        k = sc.nextLine();
                        p = s+" "+k;
                        System.out.println("\nThe concatenated strings is: "+p);
                        break;
                case 7:
                        System.exit(0);
                        break;
                default:
                        System.out.println("Invalid choice");
            }
        }
    }
}




Person program number-7
import java.util.Scanner;
class personal{
    String name;
    int age;
    String education;
    double basic;
    double hra;
    double da;
    int years_of_exp;
    int no_of_loans;
    double loan_amt[];


    personal(String name,int age,String education,double basic,double hra,double da,int years_of_exp,int no_of_loans,double[] loan_amt){
        this.name = name;
        this.age = age;
        this.education = education;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.years_of_exp = years_of_exp;
        this.no_of_loans = no_of_loans;
        this.loan_amt =  new double[no_of_loans];
        this.loan_amt = loan_amt; 
    }
    void isEligible(personal p){
        if((p.basic+p.hra+p.da)>500000 && p.no_of_loans <=2){
            System.out.println("The person is eligible for loan");
        }
        else{
            System.out.println("The person is not eleigible for loan");
        }
    }


    void taxPay(personal p){
        double sal = p.basic + p.hra + p.da;
        if(sal<=250000){
            System.out.println("No tax is to be paid");
        }
        else if(sal<=500000){
            System.out.println("The tax to be paid is: "+0.2*sal);
        }
        else if(sal<=1000000){
            System.out.println("The tax to be paid is: "+0.3*sal);
        }
        else{
            System.out.println("The tax to be paid is: "+0.4*sal);
        }
    }


    void isEligiblePromotion(personal p){
        if(p.years_of_exp >=10 && p.age>=43){
            System.out.println("The person is eligible for promotion");
        }
        else{
            System.out.println("The person is not eleigible for promotion");
        }
    }


    void display(personal p){
        System.out.println("Name of the person is: "+p.name);
        System.out.println("Age of the person is: "+p.age);
        System.out.println("Education of the person is: "+p.education);
        System.out.println("The total salary of the person is: "+(p.basic+p.hra+p.da));
        System.out.println("The years of experience of the person is: "+p.years_of_exp);
        System.out.println("The no of loans in the name of the person is: "+p.no_of_loans);
        System.out.print("The lloan amount for each loan is:\t ");
            for(int i=0;i<p.no_of_loans;i++){
                System.out.print(p.loan_amt[i]+" ");
            }
            
            System.out.println();
            p.isEligible(p);
            p.taxPay(p);
            p.isEligiblePromotion(p);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of employees whose detail you wanna enter");
        int n = sc.nextInt();
        sc.nextLine();
        personal[] p = new personal[n];


        for(int i=0;i<n;i++){
            
            System.out.println("Enter the name");
            String name = sc.nextLine();
            System.out.println("Enter the age");
            int age = sc.nextInt();
            sc.nextLine();//Have to give after int
            System.out.println("Enter the education");
            String education = sc.nextLine();
            System.out.println("Enter the basic salary");
            double basic = sc.nextDouble();
            System.out.println("Enter the hra");
            double hra = sc.nextDouble();
            System.out.println("Enter the da");
            double da = sc.nextDouble();
            System.out.println("Enter the years of experience");
            int years_of_exp = sc.nextInt();
            System.out.println("Enter the no of loans");
            int no_of_loans = sc.nextInt();
            double[] loan_amt = new double[no_of_loans];
            for(int j=0;j<no_of_loans;j++){
                System.out.println("Enter the loan amount "+(j+1));
                loan_amt[j] = sc.nextDouble();
            }
            sc.nextLine();
            p[i] = new personal(name,age,education,basic,hra,da,years_of_exp,no_of_loans,loan_amt);
            System.out.println("The details of the employee are: ");
            System.out.println("---------------------------------------");
            p[i].display(p[i]);
            System.out.println("---------------------------------------");
        }
    }
}
