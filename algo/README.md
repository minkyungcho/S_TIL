> 2020.01.22 수

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

---

#### 코드리뷰 방식

문제는 ~~

문제에서 핵심 포인트는~~

---

> 2020.01.23 목

다이아몬드 순회 - 디저트카페 문제

### exception

- ArrayIndexOutOfBoundsException 



#### 델타 배열

상, 하, 좌, 우, 좌상, 우상, 좌하, 우하

```java
		  //  상,하, 좌,우,좌상,우상,좌하,우하
int[] dirR = {-1, 1, 0, 0, -1, -1, 1, 1};
int[] dirC = {0, 0, -1, 1, -1, 1, -1, 1};
```



#### 과제

- 달팽이모양 순회
  - 순회 방향 : 오른쪽, 아래, 왼쪽, 위 - 우하좌상
  - 순회 길이 : 
  - 멈춰야 할 때 : 경계까지만 가야함, 0이 



---

선택정렬

- 가장 작은 값을 찾아서 제일 앞으로 옮겨주기
- 작은 값을 선택하겠다!



버블정렬

- 계속 비교하면서 큰값을 뒤로 밀어주기
- 큰값을 버블처럼 띄워주자!



---

### 완전 검색

- Baby-gin Game
- 모든 경우의 수를 생성하고 테스트하기 때문에 수행 속도는 느리지만, 해답을 찾아내지 못할 확률이 작다.



### :star: 부분 집합 subset :star:

- 완전 검색

- 집합의 원소가 n개 일때, 공집합을 포함한 부분집합의 수는 2^n개이다.

- n의 개수에 따라서 for문의 개수도 달라진다. -> 적합한 알고리즘이라 할 수 없음

- 집합의 원소를 선택하는 모든 경우의 수
- 순서 상관 없이 r개만 뽑아 - 조합
- 순서가 있고 r개 뽑아 - 순열



### 비트마스크

- 비트마스크를 이용하여 부분집합(subset) 구하기
- 0은 해당 원소가 선택되지 않은 것. 1은 해당 원소가 선택 된 것

- 특정 비트까지 1을 shift 한후 and 연산을 통해 1 / 0 의 값을 얻는다. 값이 1이라면 특정 비트는 1이고 값이 0이라면 특정 비트는 0이다.

:star:  ​`a&1<<j`  :star:

```java
public class BitMaskTest {
	public static void main(String[] args) {
		/**
		 * i의 j번째 bit가 1인지 아닌지 검사 : i & 1<<j
		 */
		for(int i=0; i<5; i++) {
			printBit(i);
		}
	}
	private static void printBit(int i) {
		for(int j=7; j>=0; j--) {
			System.out.printf("%d", (i & 1<<j) == 0 ? 0 : 1);
		}
		System.out.println();	
	}
}
```

```java
public class SubsetTest2 {
	
	public static void main(String[] args) {
		
		 int[] arr = {3,6,7,1};
		 int n = arr.length;
		 
		 /**
		  * subset의 개수는 2^n 개 이므로 
		  * size : 1<<n (2^n=2^4=16)
		  * 0 : 원소 선택 안함 	1 : 원소를 선택함 
		  * 
		  * 	0	0000	: 원소 하나도 선택안한 서브셋
		  * 	1	0001	: 맨 끝의 원소 하나를 선택한 서브셋
		  * 	2	0010	: 맨끝에서 두번째 원소 하나를 선택한 서브셋
		  * 	3	0011	: 맨 끝의 두개의 원소를 선택한 서브셋
		  * 	...
		  * size-1 	1111	: 모든 원소 선택한 서브셋
		  * O(1<<n) : n이 20개까지는 1초 안에 subset들을 구할 수 있다.
		  * O(1<<n *n) 
		  */
		 for(int i=0, size=1<<n; i<size; i++) { // i : 0 ~ 15
			 for(int j=0; j<n; j++) {
				 if((i & 1<<j) != 0) {
					 // 0이 아니면 선택된 것. 0이면 선택안한것이기 때문에 출력할 필요 없음
//					 System.out.print(j+" ");
					 System.out.print(arr[j]+" ");
				 }
			 }
			 System.out.println();
		 }
	}
}
```





---

어떤 선거구. 특정 지역에 있는 마을들.

마을들을 두 그룹으로 나눠서 선거지역으로 나누기를 원함

마을에 사는 인원수가 있음

나누려고 하는 마을들이 연결되어 있는가

마을을 나누었을때, 나눈 선거구가 모두 인접해야 하고, 인원수가 최소여야 한다.

하나를 선택했을때 나머지들은 나머지들을 선택한 것으로 생각하면 됨

서브셋으로 풀어보자

서브셋으로 두 그룹 나누고 연결되었는지 확인하고 최솟값 확인???????

---

### 순열

- 순서가 중요 & 중복 : 중복 순열 5파이3
- 순서가 중요 : 순열 5P3

### 조합

- 순서 중요하지 않음 & 중복 : 중복 조합 5H3
- 순서 중요하지 않음 : 조합 5C3



#### 중복순열

[ 1, 2, 3 ]

{1,1,1}, {1,1,2}, {1,1,3}, ... , {3,3,3}

n파이r = n^r

```java
System.out.println("========중복순열========");
int n = 3; // 3^3 = 27
int cnt = 0;
// for문의 개수는 r과 같다
for(int i=1; i<n+1; i++) { 			// 첫번째 원소 뽑기
    for(int j=1; j<n+1; j++) { 		// 두번째 원소 뽑기
        for(int k=1; k<n+1; k++) { 	// 세번째 원소 뽑기
            cnt++;
            System.out.printf("%d %d %d\n", i, j, k);
        }
    }
}
System.out.printf("%dㅠ%d의 개수 : %d\n", n, n, cnt);
```

nPIn = n^n

```java
public class Permutation_nPIn {
	
	static int N; 			// 원소 수
	static int[] numbers; 	// 순열을 담을 배열
	static int testcase; 	// 순열의 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		numbers = new int[N];
		permutation(0); // 
		System.out.printf("중복 순열 %dㅠ%d의 개수 : %d", N, N, testcase);
		
	}
	
	/**
	 * 순열을 만들 함수
	 * cnt : 배열의 index
	 */
	private static void permutation(int cnt) {
		
		if(cnt == N) { // cnt가 N이라는 것은 원소를 N개만큼 다 뽑은것.
			testcase++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		for(int i=0; i<N; i++) {
			numbers[cnt] = i;
			permutation(cnt+1);
		}
	}

}
```

nPir

```java
public class Permutation_nPIr {
	
	static int N; 			// 원소 수
	static int R; 			// 추출할 원소 수
	static int[] numbers; 	// 순열을 담을 배열
	static int testcase; 	// 순열의 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		numbers = new int[R]; // R개를 뽑을거니까 R크기의 배열 선언
		permutation(0); // 
		System.out.printf("중복 순열 %dㅠ%d의 개수 : %d", N, R, testcase);
		
	}
	
	/**
	 * 순열을 만들 함수
	 * cnt : 배열의 index
	 */
	private static void permutation(int cnt) {
		
		// R 만큼만 뽑으면 된다!
		if(cnt == R) { // 원소를  R개 만큼만 추출
			testcase++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		for(int i=1; i<N+1; i++) {
			numbers[cnt] = i;
			permutation(cnt+1);
		}
	}

}
```



#### :star: 순열 :star:

nPn = n * (n-1) * (n-2) * ... * 1 = n!

nPr = n! / (n-r)!

```java
System.out.println("========순열========");
int n = 3; 
int cnt = 0;
// for문의 개수는 r과 같다
for(int i=1; i<n+1; i++) { 			// 첫번째 원소 뽑기
    for(int j=1; j<n+1; j++) { 		// 두번째 원소 뽑기
        if(i != j) {
            for(int k=1; k<n+1; k++) { 	// 세번째 원소 뽑기
                if(k != i && k != j) {
                    cnt++;
                    System.out.printf("%d %d %d\n", i, j, k);
                }
            }
        }
    }
}
System.out.printf("%dP%d의 개수 : %d\n", n, n, cnt);
```

```java
public class Permutation_nPn {
	
	static int N; 			// 원소 수
	static int[] numbers; 	// 순열을 담을 배열
	static int testcase; 	// 순열의 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		numbers = new int[N]; 
		permutation(0); // 
		System.out.printf("순열 %dP%d의 개수 : %d", N, N, testcase);
		
	}
	
	/**
	 * 순열을 만들 함수
	 * cnt : 배열의 index
	 */
	private static void permutation(int cnt) {
		
		if(cnt == N) { 
			testcase++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		top:
		for(int i=1; i<N+1; i++) {
			// 중복검사 : 0번째 원소부터 현재 원소 전까지 i값이 출현했는지 검사
			for(int j=0; j<cnt; j++) {
				if(numbers[j]==i) { // 중복된 경우
					continue top;
				}
			}
			// 중복 검사해서 중복안되게 만들면 순열!!
			// 중복되지 않는 경우 cnt번째에 i 데이터를 넣는다.
			numbers[cnt] = i;
			permutation(cnt+1);
		}
	}

}
```

:star: **boolean 활용하여 중복 제거** :star:

```java
public class Permutation_nPn2 {
	
	static int N; 			// 원소 수
	static int[] numbers; 	// 순열을 담을 배열
	static int testcase; 	// 순열의 수
	static boolean[] selected;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		numbers = new int[N]; 
		selected = new boolean[N+1]; // 0을 안쓰고 1부터 쓸 것이다. 배열의 index가 원소의 값
		permutation(0); // 
		System.out.printf("순열 %dP%d의 개수 : %d", N, N, testcase);
		
	}
	
	/**
	 * 순열을 만들 함수
	 * cnt : 배열의 index
	 */
	private static void permutation(int cnt) {
		
		if(cnt == N) { 
			testcase++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		for(int i=1; i<N+1; i++) {
			if(!selected[i]) { 		// 숫자 i가 사용되지 않은 경우
				numbers[cnt] = i; 	// 중복되지 않는 경우 cnt번째에 i 데이터를 넣는다.
				selected[i] = true; // i 숫자를 사용했다고 표시
				permutation(cnt+1);	//
				selected[i] = false; // 다른 순열로 생성을 위해 미사용으로 표시
			}
		}
	}

}
```

**비트마스크 활용하여 중복제거**

- 공간복잡도 안쓰지만 시간복잡도는 쓴다
- 인자가 필요해. 중복여부를 나타내주는 flag

```java
public class Permutation_nPn3_bit {
	
	static int N; 			// 원소 수
	static int[] numbers; 	// 순열을 담을 배열
	static int testcase; 	// 순열의 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		numbers = new int[N]; 
		permutation(0, 0); // 
		System.out.printf("순열 %dP%d의 개수 : %d", N, N, testcase);
		
	}
	
	/**
	 * 순열을 만들 함수
	 * cnt : 배열의 index
	 * flag : 데이터의 중복 여부를 검사할 bit mask
	 */
	private static void permutation(int cnt, int flag) {
		
		if(cnt == N) { 
			testcase++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		top:
		for(int i=1; i<N+1; i++) {
			// 중복검사 : 0번째 원소부터 현재 원소 전까지 i값이 출현했는지 검사
			if((flag & 1<<i) == 0) { // 0 이면 사용하지 않은 것, 0이 아니면 사용한 것
				// 중복되지 않은 경우 cnt 번째에 i 데이터를 넣는다.
				numbers[cnt] = i;
				permutation(cnt+1, flag | 1<<i); // flag에 i 사용했다고 표시한다.
			}
		}
	}

}
```



#### 조합

nCr = nPr / r! = n! / { (n-r)! * r! }

```java
public class Combination1 {
	
	static int testcase;
	static int n;
	static int r;
	static int[] numbers; // 조합을 담을 배열
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		numbers = new int[r];
		
		combination(0, 1);
		System.out.printf("%dC%d 조합의 수 : %d", n, r, testcase);
		
	}
	/**
	 * 조합을 구하는 함수
	 * @param cnt	배열의 index
	 * @param start	조합을 시작할 수
	 */
	private static void combination(int cnt, int start) {
		
		if(cnt == r) {
			testcase++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		for(int i=start; i<n+1; i++) {
			numbers[cnt] = i;
			combination(cnt+1, i+1);
		}
	}

}
```

**subset 활용하여 조합**

- subset이기 때문에 모든 경우를 다 돌리고 그 중에서 r개인 부분집합만 뽑는다.

```java
public class Combination2 {
	
//	static int[] arr = {3,6,7,1,5};
	static int[] arr = {1,2,3,4,5};
	static int r;
	static int[] combi;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextInt();
		int n = arr.length;
		combi = new int[n]; // subset을 만들기 때문에
		
		int k; // 배열의 index => 조합의 수 
		
		for(int i=0, size=1<<n; i<size; i++) { // i : 0 ~ 15
			k = 0;
			for(int j=0; j<n; j++) {
				if((i & 1<<j) != 0) {
					combi[k++] = j;
				}
			}
			if(k==r) {
				print();
			}
		
		}
	}
	private static void print() {
		
		for(int i=0; i<r; i++) {
			System.out.print(arr[combi[i]]+" ");
		}
		System.out.println();
		
	}
}
```





### 재귀호출

- 내 함수 안에서 나를 또 부른다.
- 조건을 안주면 무한히 자기 자신을 호출한다.
- callstacks : java의 JVM이 관리해줌. 함수 호출된것들 쌓아둔다.
  - 무한루프 돌게 되면 -> StackOverFlowException 발생

- 초기값, 조건, 증감 을 적절하게 주어야 무한루프 돌지 않아

- 재귀호출 대신 stack 써도 됨 -> OutOfMemoryException 발생
- for문은 재귀호출로 바꿀 수 있다. 하지만 재귀호출을 for문으로 바꾸지 못하는 경우가 있다.
  - for문은 depth가 정확해야 다중for문을 돌릴수 있다.
  - 재귀호출은 depth가 정확하지 않아도 조건이 있으면 된다.

**sum 함수**

```java
public class RecursiveCallSum {
	
	static int N = 10;
	
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		return n+sum(n-1);
	}
	
	public static int sum2(int n) {
		if(n==N) {
			return n;
		}
		return n+sum2(n+1);
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		int sum = 0;
		
		for(int i=1; i<n+1; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(sum(n));
		System.out.println(sum2(1));
	}

}
```

**factorial 함수**

```java
public class RecursiveCallFactorial {
	
	static int N = 7;
	
	public static int Fac2(int n) {
		if(n == N) {
			return n;
		}
		return n*Fac2(n+1);
	}
	
	public static int Fac(int n) {
		if(n==1) {
			return 1;
		}
		return n*Fac(n-1);
	}
	
	public static void main(String[] args) {
		
		int n = 7;
		int fac = 1;
		
		for(int i=2; i<n+1; i++) {
			fac *= i;
			System.out.printf("%d! : %d\n", i, fac);
			System.out.printf("%d! : %d\n", i, Fac(i));
		}
		
		System.out.println(Fac(n));
		System.out.println(Fac2(1));
	}

}
```

**피보나치 수열**

```java
/**
 * 1 2 3 4 5 6 7 8 9 10 11 12 
 * 1 1 2 3 5 8 13 21 34 55 89 ...
 */
public class RecursiveCallFibo {

	public static int fibo2(int n) {
		if(n<2) {
			return n;
		}
		return fibo2(n-1)+fibo2(n-2);
	}
	
	public static void main(String[] args) {
		int n = 7;
		System.out.printf("%d번째의 수열: %d\n", n,fibo2(n));
	}

}
```

**피보나치 수열의 합**

```java
public static int fibo3(int n, int old, int su) {
    if(n==1) {
        System.out.print(su+" ");
        return su;
    }
    System.out.print(su+" ");
    return su+fibo3(--n, su, old+su);
}
public static void main(String[] args) {
    int n = 7;
    System.out.printf("%d번째의 수열의 합: %d\n", n, fibo3(n, 0, 1));
}
```



---

#### 0129 review 

- 1175 주사위 :ballot_box_with_check:
- BitMaskTest
- SubsetTest2



#### 0130 review

- dd



---

### 카운팅 정렬 Counting Sort

> 알고리즘 교재 p.42

- sorting 중에서 가장 낮은 시간복잡도를 가지고 있음.

- k : 표현할 수 있는 최대값
- 최빈값 구하기

```java
public class CountSortTest {

	public static void main(String[] args) {
		
		int[] data = {0,4,1,3,1,2,4,1};
		int n = data.length;
		int[] temp = new int[n];
		
		// step1. max값 찾고 카운트 배열 선언
		int max = Integer.MIN_VALUE;
		for(int d : data) {
			max = Math.max(max, d);
		}
		int[] count = new int[max+1];
		
		// step2. 데이터 카운팅 (데이터의 출현 빈도수)
		for(int d : data) {
			count[d]++;
		}
		
		// step3. 카운팅 배열에 빈도수를 누적하기
		for(int i=1; i<max+1; i++) {
			count[i] += count[i-1];
		}
//		System.out.println(Arrays.toString(count));
		
		// step4. 데이터 배열과 카운트 배열 값을 참조해서 temp 배열에 정렬하기
		int idx = -1; // temp 배열에 저장할 index
		int d = -1;
		for(int i=n-1; i>-1; i--) {
			d = data[i]; 			// 데이터 == count 배열의 index
			idx = --count[d];	// temp 배열의 index
			temp[idx] = d;
		}
		System.out.println(Arrays.toString(temp));
		
	}

}
```

### 순차검색 Sequential Search

```java
public class SequentialSearchTest1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("res/lecture/search.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i=0; i<n; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(sequential(numbers, 11));
	}
	
	/**
	 * 정렬이 안되어 있는 배열에서 원하는 데이터의 위치를 찾는 기능
	 * @param numbers 	배열
	 * @param keys		찾을 데이터
	 * @return			찾은 데이터의 index를 리턴, 못 찾은 경우 -1을 리턴한다.
	 */
	private static int sequential(int[] numbers, int key) {
		
		for(int j=0, size=numbers.length; j<size; j++) {
			if(numbers[j] == key) {
				return j;
			}
		}
		return -1;
	}

}
```



---

### Stack 스택

- 연산

