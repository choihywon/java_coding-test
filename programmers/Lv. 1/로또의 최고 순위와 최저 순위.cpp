#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
     vector<int> answer;
    vector<int> same_num;
    
    for(int & i : lottos) {
        for(int & u : win_nums) {
            if(i == u || i == 0) {
                same_num.push_back(i);
                break;
            }
        }
    }
    
    answer.push_back(same_num.size());
    answer.push_back(count_if(same_num.begin(), same_num.end(), [](int e){return e != 0;}));
    
    for(int i=0; i<2; i++) {
        switch(answer[i]) {
            case 6:
                answer[i] = 1;
                break;
            case 5:
                answer[i] = 2;
                break;
            case 4:
                answer[i] = 3;
                break;
            case 3:
                answer[i] = 4;
                break;
            case 2:
                answer[i] = 5;
                break;
            default:
                answer[i] = 6;
                break;
        }
    }
    
    return answer;
}
