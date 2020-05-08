### 자료구조란? (자료구조, 데이터 구조, data structure)
* 대량의 데이터를 효율적으로 관리할 수 있는 데이터의 구조를 의미
* 코드상에서 효율적으로 데이터를 처리하기 위해, 데이터 특성에 따라 체계적으로 데이터를 구조화 해야함.
  * 어떤 데이터 구조를 사용하느냐에 따라, 코드 효율 및 성능이 달라진다.
* 대표적인 자료구조
  * Array, Stack, Queue, Linked List, HashTable, Heap, 등

### 알고리즘이란 ? (알고리즘, algorithm)
* 어떤 문제를 풀기 위한 절차/방법
* 어떤 문제에 대해 특정한 '입력'을 넣으면, 원하는 '출력'을 얻을 수 있도록 만든 프로그래밍

### 자료구조와 알고리즘이 중요한 이유
* 어떤 자료구조와 알고리즘을 쓰냐에 따라, 성능의 차이가 크다

- - -
### Array(배열)
* 데이터를 나열하고, **각 데이터를 인덱스에 대응하도록 구성한 데이터 구조**

#### 배열은 왜 필요한가?
* **같은 종류의 데이터** 를 순차적으로 저장하고 효율적으로 관리하기 위해 사용

#### 장점
* 인덱스를 사용하여 빠른 접근 가능

#### 단점
* 추가/삭제가 쉽지 않음
* 미리 최대 길이를 지정 필요
- - -
### Queue(큐)

#### 구조
* **가장 먼저 넣은 데이터를 가장 먼저 꺼낼 수 있는 구조**
* FIFO(First In First Out), LILO(Last In Last Out)

#### 주요 기능(용어)
* Enqueue : 큐에 데이터를 넣는 기능
* Dequeue : 큐에서 데이터를 꺼내는 기능
- - -
### Stack(스택)

#### 구조
* 한쪽 방향으로만 데이터를 넣거나 뺄 수 있는 구조
* **가장 나중에 넣은 데이터를 가장 먼저 뺄 수 있는 구조 (Queue와의 차이점)**

#### 주요 기능(용어)
* push : 데이터를 스택에 넣기
* pop : 데이터를 스택에서 꺼내기

#### 장점
* 구조가 단순하여 구현하기 쉽다.
* 데이터 저장/읽기 속도가 빠르다.(구현하기 나름)

#### 단점(일반적인 스택 구현시)
* 데이터 최대 개수를 미리 정해야 한다. -> 저장 공간을 확보해야 하므로 저장 공간의 낭비가 발생할 수 있다.
- - -
### Linked List(링크드 리스트)

#### 구조
* 배열을 순차적으로 연결된 공간에 데이터를 나열하는 데이터 구조
* 떨어진 곳에 존재하는 데이터의 주소를 저장하여 관리하는 데이터 구조(다음 데이터 값의 주소를 가지고 있음)

#### 주요 기능(용어)
* Node : 데이터 저장 단위(데이터 값, 주소)로 구성
* Pointer : 각 Node 안에서, 다음이나 이전의 노드와의 연결 정보를 가지고 있는 공간

#### 장점
* 미리 데이터 공간을 할당하지 않아도 된다 -> 배열과 차이점

#### 단점
* 연결을 위한 별도의 데이터 공간이 필요 -> 저장공간 효율이 좋지 않음
* 연결 정보를 찾는 시간 필요 -> 접근 속도 저하
* 중간 데이터 삭제 했을 시, 앞과 뒤 데이터의 연결을 재구성해야 하는 부가적인 작업 필요

#### 종류
* Doubly Linked List
  * 이중연결리스트 라고도 함리
  * 양방향으로 Pointer를 가지고 있음 -> 탐색에 유리
- - -
### 시간 복잡도
* 알고리즘 복잡도 표현 방법

#### 시간 복잡도 계산이 필요한 이유
* 하나의 문제를 푸는 알고리즘은 다양할 수 있다. -> 다양한 알고리즘 중 어느 알고리즘이 더 좋은지 분석하기 위해, 복잡도를 정의하고 계산 필요

#### 알고리즘 복잡도 계산 항목
* 시간 복잡도 : 알고리즘 실행 속도
* 공간 복잡도 : 메모리(공간)을 사용하는 사이즈

#### 알고리즘 성능 표기법
* Big-O 표기법 : O(N)
  * 최악의 실행 시간을 표기
  * 가장 일반적으로 사용
  * 최악의 상황이라도 어느 정도의 성능은 보장한다는 의
* 오메가 표기법 : 오메가(N)
  * 최상의 실행 시간을 표기
* 세타 표기법 : 세타(N)
  * 평균 실행 시간을 표기

> 시간 복잡도 계산은 반복문이 핵심 요소
> 계산 포기는 최상, 평균, 최악 중 최악의 시간인 Big-O 표기법이 중심이 된다(최선을 기대하되 최악은 대비해야 하기 때문)

#### Big-O 표기법
* O(n)
  * 입력 n 에 따라 결정되는 시간 복잡도 함수
  * O(1), O(log n), O(n), O(n log n), O(n^2), O(2^n), O(n!) 등으로 표기
  * 입력 n 의 크기에 따라 기하급수적으로 시간 복잡도가 늘어날 수 있다
    * O(1) < O(log n) < O(n) < O(n log n) < O(n^2) < O(n^2) < O(n!)
<img src="/src/img/img_1.png">

  * n 에 따라 몇번 실행되는지 계산하면 된다
    * 표현식에 큰 영향을 미치는 n 의 단위로 표기
    * n = 1, n = 100, n = 1000, ... n 이 몇이던간에,
    
'''
// O(1) - 상수회 실행될 때
if n > 10 : print(n);

// O(n) - n에 따라 n번, n + 10번, ... 3n + 10번 등 실행될 때
variable = 1
for num in range(3) :
	for index in range(n) :
		print(index)

// O(n^2)
variable = 1;
for i in range(100) :
	for num in range(n) :
		for index in range(n) :
			print(index)
'''
    * 만약 시간 복잡도 함수가 2n^2 + 3n 이라면,
      * 가장 높은 차수 : 2n^2
      * 상수는 실제로 큰 영향이 없음
      * Big-O 표기법으로는 2n^2가 된다(Big-O : 2n^2)

