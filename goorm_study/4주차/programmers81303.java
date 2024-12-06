import java.util.*;

class Solution {
    // 쓸 노드를 선택
    class Node {
        boolean removed;
        Node prev; //이전 행
        Node next; //다음 행
    }

    Node[] NodeArr = new Node[1000000];

    public String solution(int n, int k, String[] cmd) {

        for (int i = 0; i < n; ++i) {
            NodeArr[i] = new Node();
        }
        for (int i = 1; i < n; ++i) {
            NodeArr[i - 1].next = NodeArr[i]; //각 노드의 next는 다음 노드를 가리킴
            NodeArr[i].prev = NodeArr[i - 1]; //각 노드의 prev는 이전 노드를 가리킴
        }

        Node curr = NodeArr[k]; //초기 커서 위치

        ArrayDeque<Node> stack = new ArrayDeque<>(); //삭제된 노드를 저장하기 위한 스택

        for (String str : cmd) {
            String[] parts = str.split(" ");
            char command = parts[0].charAt(0); //comman와 필요한 숫자 추출

            if (command == 'U') {
                int x = Integer.parseInt(parts[1]);
                for (int i = 0; i < x; i++) {
                    curr = curr.prev; //prev 방향으로 이동
                }
            } else if (command == 'D') {
                int x = Integer.parseInt(parts[1]);
                for (int i = 0; i < x; i++) {
                    curr = curr.next; //next 방향으로 이동
                }
            } else if (command == 'C') {
                stack.push(curr); //삭제된 행 저장해두고
                curr.removed = true; // 현재 노드를 삭제 상태로 설정한다음
                Node up = curr.prev; //이전 노드 가져오고
                Node down = curr.next;//다음 노드 가져옴
                if (up != null) //노드가 삭제 되었으면
                    up.next = down; // 다음 노드와 이전노드 next 포인터를 연결
                if (down != null) { //현재 노드가 삭제 됨
                    down.prev = up; //현재의 이전노드와 다음 노드의 prev 포인터 연결
                    curr = down; //커서를 다음 노드로 이동
                } else { //다음 노드가 없는 경우
                    curr = up; //커서러르 이전 노드로 이동
                }
            } else if (command == 'Z') {
                Node node = stack.pop(); //스택에서 가장 최근 삭제된 노드를 가져와서
                node.removed = false; //복구된 노드를 삭제 상태에서 해제하고
                //이전 노드 다음 노드를 가져옴
                Node up = node.prev;
                Node down = node.next;
                //이전 노드가 존재하면 up.next를 복구된 노드로 설정
                if (up != null) up.next = node;
                //다음 노드가 존재하면 down.prev를 복구한 노드로 설정
                if (down != null) down.prev = node;
            }
        }
        //각 행 상태 확인해서 결과 문자열 생성하는 파트
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (NodeArr[i].removed) {
                answer.append('X'); //삭제 된 곳
            } else {
                answer.append('O'); //아직 있는 곳
            }
        }

        return answer.toString();
    }
}


public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 8;
        int k1 = 2;
        String[] cmd1 = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z"};
        System.out.println(sol.solution(n1, k1, cmd1));

        int n2 = 8;
        int k2 = 2;
        String[] cmd2 = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"};
        System.out.println(sol.solution(n2, k2, cmd2));
    }
}