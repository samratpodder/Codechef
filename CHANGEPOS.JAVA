class solution{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();    
            if(a!=c && b!=d) System.out.println(1);
            else System.out.println(2);
        }
    }
}