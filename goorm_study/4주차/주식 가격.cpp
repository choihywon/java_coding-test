#include <iostream>
#include <vector>
#include <stack>
#include <string>

using namespace std;

vector<int> solution(vector<int> prices) {
    vector<int> answer(prices.size(), 0);
    stack<int> stack;

    for (int i = 0; i < answer.size(); i++) {
        while (!stack.empty() && prices[i] < prices[stack.top()]) {
            int lastIndex = stack.top();
            stack.pop();
            answer[lastIndex] = i - lastIndex;
        }
        stack.push(i);
    }
    while (!stack.empty()) {
        int lastIndex = stack.top();
        stack.pop();
        answer[lastIndex] = prices.size() - lastIndex - 1;
    }
    return answer;
}

int main() {
    vector<int> prices = { 1, 2, 3, 2, 3 };
    vector<int> answer = solution(prices);
    for (int time : answer) {
        cout << time << " ";
    }
    cout << endl;

    return 0;
}