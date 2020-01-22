## 알고리즘

빅데이터, AI와 같은 신기술에서 문제해결 능력이 중요함

새로운 기술을 빨리 파악하고 문제해결력이 좋음

문제를 보고 시간복잡도를 생각해야함.

binary search : NlogN

bubble sort, insert sort : n^2 (10^5는 시간초과)

quick sort, merge sort : nlogn (10^5는 시간초과)



### 배열

- 하나의 변수에 여러개의 공간을 할당해서 같은 타입의 데이터만 저장
- index는 0 ~ length-1까지 접근가능
- 배열의 접근 범위를 벗어나면  ArrayIndexOutOfBoundsException이 발생한다.
- length라는 속성이 있으며 배열의 사이즈이다.
- 배열의 크기는 변경할 수 없다. 필요하면 새로 생성해서 값을 복사해서 사용한다.
- 배열은 Referance Type이다
- 배열을 생성하면 기본값으로 초기화 된다.
  - 정수 : 0
  - 실수 : 0.0
  - 문자 : \u0000
  - 논리 : false
  - 참조형 : null
- Arrays 라이브러리 활용
  - 복사
    - copyOf()
  - 출력
    - toString()
  - 채우기
    - fill()

- 탐색

  ```java
  int[][] datas = {{1,2,3}
  				,{4,5,6}
  				,{7,8,9}};
  int n = datas.length;
  ```

  - 행 우선 탐생

    ```java
    // 행 우선 탐색
    for (int i = 0; i < n; i++) { // 행
    	for (int j = 0; j < n; j++) { // 열
    		System.out.print(datas[i][j] + " ");
    	}
    	System.out.println();
    }
    ```

  - 열 우선 탐색

    ```java
    for (int i = 0; i < n; i++) { // 열
        for (int j = 0; j < n; j++) { // 행
        	System.out.print(datas[j][i] + " ");
        }
        System.out.println();
    }
    ```

  - 지그재그 탐색

    ```java
    // 지그재그 탐색
    for (int i = 0; i < n; i++) { // 행 반복
        if (i % 2 == 0) {
            for (int j = 0; j < n; j++) { // 열 반복
            	System.out.print(datas[i][j] + " ");
            }
        } else {
            for (int j = n - 1; j > -1; j--) { // 열 반복
            	System.out.print(datas[i][j] + " ");
            }
        }
        System.out.println();
    }
    System.out.println();
    // 지그재그 반대 탐색
    for (int i = 0; i < n; i++) { // 열 반복
        if (i % 2 == 0) {
            for (int j = 0; j < n; j++) { // 행 반복
            	System.out.print(datas[j][i] + " ");
            }
        } else {
            for (int j = n - 1; j > -1; j--) { // 행 반복
            	System.out.print(datas[j][i] + " ");
            }
        }
        System.out.println();
    }
    ```

    ```java
    // 지그재그 탐색 공식
    for (int i = 0; i < n; i++) { // 행
        for (int j = 0; j < n; j++) { // 열
        	System.out.print(datas[i][j+(n-1-2*j)*(i%2)] + " ");
        }
        System.out.println();
    }
    ```

  - 나선형(달팽이형) 탐색

---



- `indexOf("1")` : 앞에서 부터 찾아서  찾는 문자열이 처음 나온 인덱스 반환
- `charAt(idx)` : idx 위치에 해당하는 문자 하나를 반환
- `startWith(str)` : 문자열이 지정한 문자로 시작하면 true, 아니면 false
- `equals(str)` : 문자열 비교.

---

+ AD+ 2문제 - 시뮬레이션1, 탐색1(dfs, bfs, backtrcking + 순열, 조합, subset 등)

- IM : D2, D3
- AD : D4, D5 쫌 더 어려워짐



문제는 ~~

문제에서 핵심 포인트는~~

