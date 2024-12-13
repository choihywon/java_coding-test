#include <iostream>
#include <string>
#include <vector>
#include <map>

using namespace std;

int solution(vector<string> want, vector<int> number, vector<string> discount) {
    int answer = 0;
    map<string, int> wantMap;
    //원하는 물품, 수량 넣어줌
    for (int i = 0; i < want.size(); i++) {
        wantMap.insert({want[i], number[i]});
    }

    //10일동안 하는데 그렇기 대문에 실제 길이에서 10을 빼줘야함 
    for (int i = 0; i <= discount.size()-10; i++) {
        map<string, int> map;
        for (int j = 0; j < 10; j++) {
            map[discount[i + j]]++;
        }

        bool isPossible = true;
        for (auto const& key : wantMap) {
            if (map[key.first] < key.second) {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            answer++;
        }
    }

    return answer;
}

int main() {
    vector<string> want1 = { "banana", "apple", "rice", "pork", "pot" };
    vector<int> number1 = { 3, 2, 2, 2, 1 };
    vector<string> discount1 = { "chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana" };

    // Test case 2
    vector<string> want2 = { "apple" };
    vector<int> number2 = { 10 };
    vector<string> discount2 = { "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana" };

    // 결과 출력
    cout << "Test case 1 result: " << solution(want1, number1, discount1) << endl;
    cout << "Test case 2 result: " << solution(want2, number2, discount2) << endl;

    return 0;
}