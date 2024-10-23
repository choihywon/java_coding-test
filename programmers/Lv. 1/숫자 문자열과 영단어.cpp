#include <vector>
#include <string>

using namespace std;

int solution(string s) {

    string numbers[10] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    string answer;

    for (int i = 0; i < s.size(); i++) {
        char isNumber = s[i] - '0';
        if (isNumber >= 0 && isNumber < 10) {
            answer += s[i];
            continue;
        }
        bool check_flag = false;
        for (int j = 3; j <= 5; j++) {
            string changeStr = s.substr(i,j);

            for (int k = 0; k < 10; k++) {
                if (! changeStr.compare(numbers[k])) {
                    i += (numbers[k].size() - 1);
                    answer += '0' + k;
                    check_flag = true;
                }
            }
            if (check_flag) break;
        }
    }

    return stoi(answer);
}

