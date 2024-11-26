#include <iostream>
#include <set>
#include <map>
#include <vector>
#include <string>

using namespace std;

int solution(string dirs) {
    set<string> visited;
    int cx = 5, cy = 5;
    int answer = 0; 

    for (char ch : dirs) {
        int nx = cx, ny = cy;

        if (ch == 'U')
            ny++;
        else if (ch == 'D')
            ny--;
        else if (ch == 'L')
            nx--;
        else if (ch == 'R')
            nx++;

        if (nx < 0 || nx > 10 || ny < 0 || ny > 10)
            continue;

        string path1 = to_string(cx) +  to_string(cy) + to_string(nx) + to_string(ny);
        string path2 = to_string(nx) + to_string(ny) +  to_string(cx) + to_string(cy);

        if (visited.find(path1) == visited.end()) {
            visited.insert(path1);
            visited.insert(path2);
            answer++;
        }


        cx = nx;
        cy = ny;
    }

    return answer;
}

int main() {
    string dirs1 = "ULURRDLLU";
    string dirs2 = "LULLLLLLU";

    cout << "Result for dirs1: " << solution(dirs1) << endl; // 예상 결과: 7
    cout << "Result for dirs2: " << solution(dirs2) << endl; // 예상 결과: 7

    return 0;
}