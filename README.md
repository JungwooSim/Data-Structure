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
<pre><code>// O(1) - 상수회 실행될 때
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
			print(index)</code></pre>

  * 만약 시간 복잡도 함수가 2n^2 + 3n 이라면,
    * 가장 높은 차수 : 2n^2
    * 상수는 실제로 큰 영향이 없음
    * Big-O 표기법으로는 2n^2가 된다(Big-O : 2n^2)
- - -
### Hash Table(해시 테이블)

#### 구조
* Key 에 Value 를 저장하는 데이터 구조
* Key 를 통해 데이터를 접근할 수 있으므로 접근 속도가 빠르다
* 보통 배열로 미리 Hash Table 사이즈 만큼 생성 후 사용(공간과 탐색 시간을 Trade-Off)

#### 용어
* Hash : 임의의 값을 고정 길이의 값으로 변환시키는 것
* Hash Table : 키 값의 연산에 의해 직접 접근이 가능한 데이터 구조
* Hashing Function : Hash 된 Key 값을 산술 연산을 통해 데이터 위치를 찾을 수 있는 함수
* Hash Value or Hash Address : Key 를 Hashing Function 로 연산하여 Hash Value를 알 수 있고, Hash Value를 통해 Hash Table 에서 해당하는 Key의 위치를 알 수 있다
* Slot : 한 개의 데이터를 저장할 수 있는 공간
- - -
### Tree(트리)

#### 구조
* Node와 Branch를 이용해서, **사이클을 이루지 않도록 구성한 데이터 구조**
* 보통 Binary Tree 형태의 구조로, 탐색 알고리즘 구현을 위해 자주 사용 된다.

#### 용어
* Node : 트리에서 데이터를 저장하는 기본 요소
* Root Node : 트리의 맨 위에 있는 노드
* Level : 최상위 노드를 Level-0 으로 하였을 때, 하위 Branch로 연결된 노드의 깊이를 나타낸다
* Parent Node : n 노드의 상위 레벨에 연결된 노드
* Child Node : n 노드의 하위 레벨에 있는 노드
* Leaf Node(Terminal Node) : Child Node가 하나도 없는 노드
* Sibling (Brother Node) : 동일한 Parent Node를 가진 노드
* Depth : 트리에서 노드가 가질 수 있는 최대 Level
<img src="/src/img/img_2.png">

#### Binary Tree, Binary Search Tree
* 노드의 최대 Branch가 2인 트리
* Binary Search Tree
  * Parent Node 기준으로 왼쪽 노드는 작은 값, 오른쪽 노드는 큰 값으로 구성 된다
  * 트리가 균형 잡혀 있을 때의 시간 복잡도 : O(log n)
  * 트리가 균형 잡혀 있지 않을 때의 시간 복잡도 : O(n)
- - -
### Heap(힙)
* 데이터에서 최소값과 최대값을 빠르게 찾기 위해 고안된 Complete Binary Tree(완전 이진 트리)
  * Complete Binary Tree : 노드를 삽입할 때 최하단 왼쪽부터 차례로 삽입하는 트리

#### Heap을 사용하는 이유
* 배열에 데이터를 적재 후, 최소값과 최대값을 찾기 위해서는 O(n)의 시간복잡도가 필요하다
  * -> 이에 반해, Heap에 적재된 데이터의 **최소값과 최대값을 탐색할 때의 시간복잡도는 O(log n)** 이 소요 된다

#### 구조
* Heap은 최대값을 구하기 위한 구조인 Max Heap, 최소값을 구하기 위한 구조는 Min Heap로 분류 된다
* 2가지 조건을 가지고 있다
  * 각 노드는 Child Node 보다 값이 크거나 같다(Min Heap 일 때는 반대)
  * Complete Binary Tree 형태를 가진다

#### Heap과 Binary Tree의 공통점과 차이점
* 공통점
  * Binary Tree 이다
* 차이점
  * Heap은 각 Node의 값이 Child와 같거나 크다
  * Binary Tree는 Node의 값이 Root Node부터 Level이 낮아질 수록 값이 낮아지며 동일한 Level일때는 왼쪽의 값이 낮은 값을 가진다.
  <br> 반면에, Heap은 Node의 값이 Parent 보다 작기만 하면 된다
  * **Binary Tree는 탐색을 위한 구조, Heap은 최소값과 최대값을 찾기 위한 구조**

#### 시간복잡도
* n개의 Node를 가지는 Heap에 데이터 추가 및 삭제를 할 때, 최악의 경우는 depth = log n에 가깝다<br> 즉, Big-O : O(log n)
   
