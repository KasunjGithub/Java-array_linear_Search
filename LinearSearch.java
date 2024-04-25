import java.util.Scanner;
class LinearSearch
{
    int arr[]={12,67,45,87,34};

    Scanner sc=new Scanner(System.in);
    int i,a;

    void getSearchElement()
    {
        System.out.println("Enter the number what you want to search : ");
        a=sc.nextInt();

    }
    void search()
    {
        boolean eq=false;
        for (i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
            {
                eq=true;
                //b=i;
                break;
            }
        }
        if (eq)
        {
            System.out.println("Searched element is found ");
            System.out.println("index is : "+i);

        }
        else{
            System.out.println("Searched element not found");
        }
    }
    public static void main(String []args)
    {
        LinearSearch ob=new LinearSearch();
        ob.getSearchElement();
        ob.search();
    }
}