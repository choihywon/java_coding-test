using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = -1;
    long result = 0;
    for (int i = 1; i <= count; i++) {
        result += price * i;
    }
    
    if (result > money) {
            answer = result - money; 
    }
    else {
        answer = 0;
    }
        
    return answer;
}
