#include <iostream>
#include <map>

using namespace std;

int main() {
    int n;
    string name;
    map<string, int> m;
    cin >> n;
    for(int i = 0; i<n; i++) {
        cin >> name;
        m[name]++;
    }
    for(int i = 0; i<n-1; i++) {
        cin >> name;
        m[name]--;
    }
     for(auto it = m.begin(); it!=m.end(); it++){
        if(it->second!=0)
            cout<<it->first<<'\n';
    }
    
}
