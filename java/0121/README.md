자바의 컨셉은 가독성

```java
int y,m,d; // C 언어에서는 메모리 문제 때문에 짧게 쓰는 것이 특징
int year; // 한 문장씩 읽을 수 있도록
int month;
int day;
Thread.sleep(2*60*60*1000); //계산된 값을 넣지 않고 수식을 다 입력한다.
```



3항 연산자

`변수 = (조건) ? 값1 : 값2;` 조건이 참이면 변수에 값1이 저장됨, 거짓이면 변수에 값2 저장됨



```java
double d = 3.567;
float f = 3.567; // ERROR double형으로 인식
float f = 3.567F // float형으로 인식
double d = 3.567D; // double형으로 인식

30 이면 int 로 인식함.
30L이라고 쓰면 long 으로 인식
```



```java
package ~.~.~; // com.samsung.xxx 이런식으로 어느회사에서 만들었는지 표기함
import ~~~; // 여러개 import 할 수 있음
public class 클래스명{
    type 변수명;
    type 변수명 = 값;
}
```

- java.lang은 컴파일할때 자동적으로 import한다. 굳이 import할 필요 없음.
  - math
  - system
  - String



UML 분석설계 - class, 변수, 메서드

RUP

UP

Agile



#### shift 연산

- 왼쪽으로 미는것은 곱하기
- 오른쪽으로 미는것은 나누기

```java
int a = 15;
// 2진수로 찍기
System.out.println(Integer.toBinaryString(a)); // 1111
a = a<<33; // 11110 : 연산하기 전에 %32를 먼저 처리한다.
```

- `>>>`는 비트 비부호화 우이동. 음수를 나타내는 값이 사라져버린다.

#### mask 

- mask : 8자리 꺼내기
  - 11111111(2) 는 255 인 mask 변수 하나 지정
  - mask와 and 연산을 통해 뒤 8자리의 숫자만 꺼내온다.

```java
int a = 2020;
System.out.printf("%32s\n", Integer.toBinaryString(a));
a = a<<8;
System.out.printf("%32s\n", Integer.toBinaryString(a));
a = a+1;
System.out.printf("%32s\n", Integer.toBinaryString(a));
a = a<<8;
System.out.printf("%32s\n", Integer.toBinaryString(a));
a = a+28;
System.out.printf("%32s\n", Integer.toBinaryString(a));

int mask = 255; // 8자리 11111111 
System.out.printf("%32s\n", Integer.toBinaryString(mask));

int day = a & mask; // and 연산을 통해 마지막 8자리 숫자만 꺼내온다.
System.out.printf("%32s\n", Integer.toBinaryString(day));
System.out.println(day); // 28
a = a>>8; // 8자리를 빼내었으니 다시 뒤로 8번 밀기
System.out.printf("%32s\n", Integer.toBinaryString(a));
int month = a & mask;
System.out.printf("%32s\n", Integer.toBinaryString(month));
System.out.println(month); // 1
a = a>>8; // 8자리를 빼내었으니 다시 뒤로 8번 밀기
System.out.printf("%32s\n", Integer.toBinaryString(a));
System.out.println(a); // 2020
```





- 메서드 이름이 같은 애들이 있으면 그건 오버로딩!
- `toString(int i)` 
- `toString(int i, int radix)` : radix는 진법. 진법연산 가능
- 



### Java API

객체 class 생성

```java
package ~.~.~;
import ~~; // 내가 아닌 패키지는 가져와서 써야함. java.lang은 import 안해도됨.
import java.util.*; // java.util 에 있는 모든 클래스 쓸거야

public class 클래스명{
    type 변수;
    ...
    public static return_type 메서드명(..){..}
    return
}
// ===============================
public class Abc{
	
    public static return_type sm(..){..}
}
// =========================
class Math{
    ...
    static round(){}
    static sin(){}
    static cos(){}
    ...
}
// static 메서드는 new 로 객체 생성할 필요 없다.
```

#### String

- 계속 수정할 값들은 String으로 지정하지 않고 StringBuilder로 지정하자!

#### StringBuilder

```java
StringBuilder sb = new StringBuilder("Hello"); // new 로 생성해 줘야한다.
sb.append("a"); // 객체를 새로 만들지 않고 자기자신한테 더함
System.out.println(sb);
sb.insert(offset, b); // offset 위치에 삽입하기
sb.indexOf(str);
sb.length();
sb.reverse();
sb.setCharAt(index, ch); // 그 위치에 값을 넣어라
sb.setLength(newLength); // 글자 길이 설정하기.
```

*compareTo()* : 계속 비교하면서 같으면 0을 찍고 앞의 문자열이 더 크면 양수값을, 뒤의 문자열이 더 크면 음수값을 리턴한다.  문자열 값 비교할 때

```java
/**
* names를 알파벳 순으로 정렬해보기
* 오름차순
*/
String[] names = {"kim", "lee", "park", "kang", "choi"};

for(int i=0; i<names.length-1; i++) { // 기준
    String min = names[i];
    int minp = i;
    for(int j=i+1; j<names.length; j++) {
        if(min.compareTo(names[j]) > 0) {
            min = names[j];
            minp = j;
        }
	}
    // 변경 swap
    names[minp] = names[i];
    names[i] = min;

}

for(String name : names) {
	System.out.println(name);
}
```











---

### tip

- java 와 javascript는 기술적 교류가 없었다. 단지 java라는 이름을 쓴것 뿐.
- java에서 * 를 쓰면 안된다는 메모리 이슈는 없다.
- compile error 문법 오류
- runtime error 실행 오류
- 배열의 길이 length만 변수이다. 보통은 메서드.

- 자바에서는 기본형type(boolean, char, byte, short, int, long, float, double)빼고는 다 객체이다.
  - 계산하기 위해 남겨뒀다
  - Boolean, Character, Byte, Short, Integer, Long, Float, Double
    - 메소드를 가지고 있다.
  - 컴파일러가 알아서 객체화 해주거나 연산을 위해 기본형으로 바꿔주는 등 묵시적 형변환을 해준다.





---

#### 월말평가

5문제

3문제는 쉬운 문제

2문제는 어려움 - 2차원 배열 가지고 놀기





