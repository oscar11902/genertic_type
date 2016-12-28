package general_type;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
        boolean loop=true,nloop=true;
        int choice,nchoice,index;
        Integer[] in;
        Double[] dou;
        String[] str;
        int k;
        double a;
        String key;
        do{
        	System.out.println("1)Int");
        	System.out.println("2)Double");
        	System.out.println("3)String");
        	System.out.println("4)Exit");
        	System.out.println("");
        	System.out.println("Please input your choice:");
        	choice=sc.nextInt();
        	switch(choice){
        		case 1:
        			System.out.println("Please input your array length:");
        			index = sc.nextInt();
        			in = new Integer[index];
        			System.out.println("Please input your value:");
        			for(int i = 0 ; i < in.length ; i++){
        				in[i]=sc.nextInt();
        			} 
        			while(nloop){
        				System.out.println("1)Bubblesort");
                    	System.out.println("2)Quicksort");
                    	System.out.println("3)Search");
                    	System.out.println("4)BinarySearch");
                    	System.out.println("5)PrintAll");
                    	System.out.println("6)Exit");
                    	System.out.println("");
                    	System.out.println("Please input your choice:");
                    	nchoice = sc.nextInt();
            			switch(nchoice){
            				case 1:
            					method.bubblesort(in);
            					break;
            				case 2:
            					method.quicksort(in);
            					break;
            				case 3:
            					k=sc.nextInt();
            					method.search(in,k);
            					break;
            				case 4:
            					k=sc.nextInt();
            					method.binerysearch(in, k);
            					break;
            				case 5:
                    			method.printarray(in);
            					break;
            				case 6:
            					nloop = false;
            					break;
            				default:
            					System.out.println("Please enter a right number");
            			}
        			}
        			
        			break;
        		case 2:
        			System.out.println("Please input your array length:");
        			index = sc.nextInt();
        			dou = new Double[index];
        			System.out.println("Please input your value:");
        			for(int i = 0 ; i < dou.length ; i++){
        				dou[i]=sc.nextDouble();
        			}
        			while(nloop){
        				System.out.println("1)Bubblesort");
                    	System.out.println("2)Quicksort");
                    	System.out.println("3)Search");
                    	System.out.println("4)BinarySearch");
                    	System.out.println("5)PrintAll");
                    	System.out.println("6)Exit");
                    	System.out.println("");
                    	System.out.println("Please input your choice:");
                    	nchoice = sc.nextInt();
            			switch(nchoice){
            				case 1:
            					method.bubblesort(dou);
            					break;
            				case 2:
            					method.quicksort(dou);
            					break;
            				case 3:
            					a=sc.nextDouble();
            					method.search(dou,a);
            					break;
            				case 4:
            					a=sc.nextDouble();
            					method.binerysearch(dou, a);
            					break;
            				case 5:
                    			method.printarray(dou);
            					break;
            				case 6:
            					nloop = false;
            					break;
            				default:
            					System.out.println("Please enter a right number");
            			}
        			}
        			
        			break;
        		case 3:
        			System.out.println("Please input your array length:");
        			index = sc.nextInt();
        			str = new String[index];
        			System.out.println("Please input your value:");
        			for(int i = 0 ; i < str.length ; i++){
        				str[i]=sc.nextLine();
        			}
        			while(nloop){
        				System.out.println("1)Bubblesort");
                    	System.out.println("2)Quicksort");
                    	System.out.println("3)Search");
                    	System.out.println("4)BinarySearch");
                    	System.out.println("5)PrintAll");
                    	System.out.println("6)Exit");
                    	System.out.println("");
                    	System.out.println("Please input your choice:");
                    	nchoice = sc.nextInt();
            			switch(nchoice){
            				case 1:
            					method.bubblesort(str);
            					break;
            				case 2:
            					method.quicksort(str);
            					break;
            				case 3:
            					key=sc.nextLine();
            					method.search(str,key);
            					break;
            				case 4:
            					key=sc.nextLine();
            					method.binerysearch(str, key);
            					break;
            				case 5:
                    			method.printarray(str);
            					break;
            				case 6:
            					nloop = false;
            					break;
            				default:
            					System.out.println("Please enter a right number");
            			}
        			}
        			
        			break;
        		case 4:
        			loop = false;
        			break;
        		default:
        			System.out.println("Please enter a right number");
        	}
        	
        }while(loop);
        sc.close();
    }
}