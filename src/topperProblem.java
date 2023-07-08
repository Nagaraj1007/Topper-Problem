public class topperProblem {
    public boolean topperOrNot(int number){
        int oddNumberCount = 0, evenNumbercount = 0;
        while(number>0){
            oddNumberCount += ((number % 10) % 2 != 0) ? number%10 : 0;
            evenNumbercount += ((number % 10) % 2 == 0) ? number%10 : 0;
            number /= 10;
        }
        return (oddNumberCount == evenNumbercount)? true : false;
    }
}
