# 미션 - 자동차 경주 게임

## 개요
- 정해진 턴 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 차들의 이름과 개수, 몇 번의 턴을 진행할지는 사용자가 입력하여 결정한다.
- 차는 Random 값에 따라 해당 턴의 전진/정지 여부가 결정된다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

## 🚀 기능 요구사항

### 경주
- 주어진 턴 수 동안 차들은 전진/정지할 수 있다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차는 한 턴 당 전진/정지 중 하나의 동작만 한다.
    - 전진한 차는 한 칸 앞으로 이동한다.
    - 정지한 차는 이동하지 않고 그대로 있는다.
- 전진하는 자동차를 출력할 때 자동차 이름과 현재까지 나아간 거리를 같이 출력한다.
- 한 턴이 끝날 때 마다 공백 라인을 출력해 턴을 구분한다.

### 사용자 입력
- 경주할 자동차들의 이름을 입력한다.
    - 쉼표(,) 기준으로 구분한다.
    - 1자 이상 5자 이하만 가능하다.
    - 이름 앞 뒤의 공백이 있다면 제거된다. `ex) "car " or " car "`
- 진행할 턴 수를 입력한다.
    - 턴 수는 1 이상의 자연수만 가능하다.
- **예외 상황 검증**
    - 이름이 빈 문자열이거나, 공백만 존재 `ex) "" or " "`
    - 이름에 형식에 맞지 않은 `","` 존재 `ex) "joy,,hey" or ",,joy"`
    - 차들의 이름에 중복 존재 `ex) "joy,joy" `
    - 턴 수 입력 시 문자열, 실수, 0 이하의 정수

### 게임 진행
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 전진하는 자동차를 출력할 때 자동차 이름과 현재까지 나아간 거리를 같이 출력한다.
- 한 턴이 끝날 때 마다 공백 라인을 출력해 턴을 구분한다.

### 게임 결과
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

<br>

## ✍🏻 입출력 요구사항
### ⌨️ 입력
- 경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)
```
pobi,woni,jun
```
- 시도할 회수
```
5
```

### 🖥 출력
- 각 차수별 실행 결과
```
pobi : --
woni : ----
jun : ---
```
- 단독 우승자 안내 문구
```
최종 우승자: pobi
```
- 공동 우승자 안내 문구
```
최종 우승자: pobi, jun
```
- 예외 상황 시 에러 문구를 출력해야 한다. 단, 에러 문구는 [ERROR] 로 시작해야 한다.
```
[ERROR] 시도 횟수는 숫자여야 한다.
```

### 💻 프로그래밍 실행 결과 예시
```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,woni,jun
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
woni : 
jun : -

pobi : --
woni : -
jun : --

pobi : ---
woni : --
jun : ---

pobi : ----
woni : ---
jun : ----

pobi : -----
woni : ----
jun : -----

최종 우승자: pobi, jun
```

<br>

## 🎱 프로그래밍 요구사항
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - 기본적으로 [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)을 원칙으로 한다.
    - 단, 들여쓰기는 '2 spaces'가 아닌 '4 spaces'로 한다.
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- 프로그래밍 요구사항에서 별도로 변경 불가 안내가 없는 경우 파일 수정과 패키지 이동을 자유롭게 할 수 있다.
- 예외 상황 시 에러 문구를 출력해야 한다. 단, 에러 문구는 `[ERROR]` 로 시작해야 한다.

### 추가된 요구사항
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
- else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.

### 자체 추가 요구사항
- 하나의 java 파일에 하나의 클래스만 작성한다.
- getter, setter 보다는 객체에 메세지를 보내기 위한 메소드를 구현해 객체가 역할을 할수 있도록 한다.
- 객체에 메세지를 보내는 public 메소드를 제외하고 모두 private 메소드로 구현한다.
- 테스트 Junit4 사용해 작성.
- 최대한 마우스 안쓰고 단축키만 사용한다.
- 다른 지원자들의 코드를 보고 내 코드의 개선할 점을 찾는다.