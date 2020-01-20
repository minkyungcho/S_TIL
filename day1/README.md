> 2020.01.20 월

## SW 흐름

1. 구조적 프로그래밍 기법 (기능 중심)

2. 정보공학 프로그래밍 기법 (Data 중심)
   - 네트워크, IoT, SNS -> 빅데이터 (클라우드 컴퓨팅) <- AI
   - 기능과 data 가 분리되어있음 -> 유지보수가 안좋음
   
3. 객체지향 프로그래밍 기법 (object 중심)
   - 하나의 sw를 부품화 -> 비용 절감, 품질 향상
   - data + 기능 = object
   - 유지보수성 좋음
   - 밀레니엄 버그 Y2K
   
4. ComponentBasedDevelopment CBD 

   - 독립실행 가능한 코드 묶음

5. FrameWork

   - 플랫폼 : 어떤 작업을 위한 공간

   - 빠른개발, 안정적

   - 유지보수성

   - 공톰점 : 미리 만들어서 제공

6. API



## JAVA

zulu : java open version

### 1. Java Platform

 다양한 가전기기의 애플리케이션을 구현하기 위해서는 기본의 플랫폼 종속적인 언어(C언어)를 이용하여 개발하기가 어려웠기 때문에 Sun의 그린프로젝트에 의해 Oak라는 언어를 만들게 된다. Oak는 플랫폼 독립적인 구조를 갖기 위해 VM(Virtual Machine)을 구현하고 그 VM위에서 프로그램이 작동하도록 고안되었다. Java라 명명하게 됨.

- 1990년대 초 다양한 임베디드 시스템에 호환성을 적용한 Oak라는 언어로 개발
- 1995년 Java의 공식 버전 발표
- 1990대 후반 Web Client Applet 기술에 쓰임
- 1990대 후반 ~ 현재 : Web Server, Application Server 프로그램 등 구현에 많이 쓰임
- 2008년 Android Platform 발표

 Java의 원래 설계된 목표가 가전기기를 위한 언어로 설계되었지만, 1990년대의 네트워크(인터넷) 붐을 타고, 인터넷 초창기에 클라이언트 환경의 Applet 기술을 이용하여 동영상을 지원하게 된다. 인터넷 서버 사이드 프로그램 개발이 활발해 지면서 10여년 동안 서버환경 프로그래밍 언어로 널리 쓰이게 된다.

- java8.0부터는 병렬처리가 가능하다
- Java Standard Edition (Java SE)
  - Application, Applet, JDBC, XML...

- Java Enterprise Edition (Java EE)
  - Servlet/JSP, Web-Service...
- Java Micro Edition (Java ME)



### 2. Java 특징

#### 1) 객체지향

 객체지향의 기본 개념은 실 세계의 모든 것은 객체간의 상호작용에 의해 이루어진다는 개념 하에 모든 것을 객체로 정의한다.

 객체지향의 개념을 적용하여 sw 시스템을 기본 구성이 객체(Object) 단위로 구성되며, 객체들이 서로 관계성을 가지므로 시스템이 구성된다고 본다.

- 추상화 Abstraction
  - 현상에 존재하는 객체의 주요특징을 추출하는 과정
- 캡슐화 Encapsulation
  - 하나의 클래스 안에 데이터와 기능을 담아 정의하고, 중요한 데이터나 복잡한 기능 등은 숨기고, 외부에서 가용에 필요한 기능만을 공개하는 것.
- 상속 Inheritance
  - 객체 정의 시 기존에 존재하는 객체의 속성과 기능을 상속받아 정의하는 것.
- 다형성 Polymorphism
  - 같은 타입 또는 같은 기능의 호출로 다양한 효과를 가져오는 것



#### 2) 플랫폼 독립적

 Java로 작성된 응용프로그램은 JVM 위에서 작동되어 지기 때문에 Java의 컴파일 코드는 플랫폼이 이해하는 코드로 번역되는 것이 아니고, JVM이 해석 가능하도록 번역된다. 그렇기 때문에 어떤 HW라도 JVM만 설치되면 Java로 작성된 응용프로그램은 실행이 가능한 플랫폼에 독립적인 구조를 갖게 된다.



#### 3) 간단하다.

 Java는 기존언어(C, C++)의 복잡성과 메모리관리의 어려움을 해결하여 보다 쉽게 접근할 수 있도록 설계되었다.



#### 4) 분산 프로그래밍 지원

 1990년대에 설계된 언어로 네트워크를 이용한 프로그래밍을 지원하고, 원격 접속을 위한 다양한 기술셋을 가지고 있다.



#### 5) 멀티 스레드

 사용되는 운영체제에 따라 멀티 스레드의 구현이 다르고, 처리 방식도 달라서 문제가 되었던 부분을 Java는 Thread API를 제공함으로써 운영체제에 종속적이지 않는 독립적인 설계와 JVM에 의해 스케쥴링이 되도록 구현되어 있다.



#### 6) 가독성



## Java 설치

### 1. Java 개발환경 구성 

1. Download JavaSE SDK

   Java를 컴파일하고, 실행할 수 있는 환경, 디버그 환경을 제공해주는 툴이다.

2. 다운로드 받은 JavaSE 파일을 기본값으로 설치한다.

   `C:\Program Files\Java\jdk_8.u191`으로 설치된다.

3. 시스템 환경 변수 설정

   다른 프로그램에게 java가 설치 되어 있는 곳을 알려주고, 어디서나 java 관련 명령어를 쉽게 쓰기 위해 환경설정을 하여보자.

4. Eclipse java EE 설치 : Eclipse는 널리 쓰이는 Java 개발 툴이다.



### 2. Simple Programming 작성

간단한 Java Programming을 작성하여 컴파일하고 실행하여 보자.

```java
package test;

public class Test {
	/**
	 * 실행 메소드
	 */
	public static void main(String[] args) {
		int a = 13;
		int b = 5;
		float c = a / b;
		String city = "Seoul";
		System.out.println(c + city+b+a);
		// 이항연산자 특성상 input값 중 하나가 문자열이면 문자열끼리의 덧셈으로 처리됨.
	}
}
```

- 자바는 객체를 설계하기 위한 클래스 단위로 작성된다.
- 실행을 위해서는 main()가 존재해야 한다.
- VM이 실행하는 범위는 오직 main()만을 실행한다.
- VM이 main()을 실행하기 위해서는 `public static void main(String[] 변수){...}`
- 모든 명령문은 ; 으로 종료를 표시한다.
- 공백이 표현이 자유롭기 때문에 가독성 있게 코드 작성한다.

코드를 컴파일하고 실행되는 과정

<img src>

> 이클립스에 코드(`Test.java`)를 저장하는 순간 컴파일(`javac Test.java`)하면서 `Test.class`가 생성됨.

> 하나의 파일에는 한개의 public class만 작업하는 것이 이상적.

- Java의 컴파일러는 java 언어로 작성된 코드를 JVM이 인식 가능한 코드인 byte code로 번역한다.
- 컴파일러는 주어진 Java 코드의 문법을 체크하고, 코드를 분석하여 생략된 부분의 코드(생성자, java.lang 클래스 경로, Object 의 상속 등)를 삽입하고, 기본 상수연산 등을 수행하고 코드의 실행성능을 높이기 위해 최적화 작업을 수행한다.
- JVM은 컴파일된 bytecode를 읽어서 한 문장씩 OS가 실행 가능한 코드로 번역하여 최적화 작업을 함께 실행한다.



### 03 Java Statements & Data Type

#### 1. Java Statement

- Statement

  - Java 문장은 ; 로 종료되어야 한다.

- Comment

  - 주석

  - 한줄 주석 `// 한줄 주석`

  - 여러 줄 주석

    ```java
    /*
    * 여러 줄 주석
    */
    ```

  - 문서화 주석

    ```java
    /**
    * 문서화 주석
    */
    ```

- 32

'A' : char 타입은 `' '`로 표기한다.

"A" : String 타입은 `" "`로 표기한다. 

`'A' + 1`은 int형이기 때문에 66이다.

```java
char c = 'A';
c++;
print(c) // B가 출력된다. char형으로 연산되기 때문
```





switch 문이 속도가 더 빠름.

expr1은 반드시 정수형(int, byte, short, char), 문자열(string)이어야 함

---

### 알고리즘

- swexpert
- 백준
- 정올 [사이트 바로가기](http://jungol.co.kr/)
  - IM : Intermediate Coder
  - 조건문, 반복문 : Langauge Coder - 선택제어문, 반복제어문1.2.3
  - 배열 : 배열1.2

---

박정님 010-8982-8929

diana@jaen.kr



SW검정 시험 일정

2/5 IM

2/15 AD

3/7 AD

5/16 AD