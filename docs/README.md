## :white_check_mark: 프로그래밍 요구사항 체크리스트
- [x] JDK 17 버전에서 실행 가능해야 한다. JDK 17에서 정상적으로 동작하지 않을 경우 0점 처리한다.
- [x] 프로그램 실행의 시작점은 Application의 main()이다.
- [x] build.gradle 파일을 변경할 수 없고, 외부 라이브러리를 사용하지 않는다.
- [x] Java 코드 컨벤션 가이드를 준수하며 프로그래밍한다.
- [x] 프로그램 종료 시 System.exit()를 호출하지 않는다.
- [x] 프로그램 구현이 완료되면 ApplicationTest의 모든 테스트가 성공해야 한다. 테스트가 실패할 경우 0점 처리한다.
- [x] 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 이름을 수정하거나 이동하지 않는다.
- [x] indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
- [x] 3항 연산자를 쓰지 않는다.
- [x] 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- [x] JUnit 5와 AssertJ를 이용하여 본인이 정리한 기능 목록이 정상 동작함을 테스트 코드로 확인한다.
- [x] 테스트 도구 사용법이 익숙하지 않다면 test/java/study를 참고하여 학습한 후 테스트를 구현한다.

## 구현할 기능 목록

### 사용자 🧔
- [x] n개의 자동차 이름을 쉼표로 구분하여 입력할 수 있다.
  - [x] 이때 이름은 5자 이하로 입력해야 한다.
- [x] 시도할 횟수를 입력할 수 있다.
  - [x] 숫자만 입력 가능.
  - [x] 1 이상의 숫자만 가능
- [x] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException 예외 발생
  - [x] 예외 메세지 상수값으로 정의하기.

### 자동차 🏇
- [x] 이름, 전진 횟수를 필드로 갖는다.
- [x] 0에서 9사이의 무작위 값을 구한 후 4이상일 경우 전진한다.
  - [x] 0에서 9사이의 무작위 값 추출 메서드
  - [x] 전진 메서드
- [x] 차수별 게임 결과 위한 자동차 상태 반환 메서드
- [x] 우승자인지 확인하는 메서드

### 자동차 경주 게임 :game_die:
- [x] 총 시도 횟수, 현재 진행한 시도 횟수, 최고 전진 횟수, 자동차 리스트를 필드로 갖는다
  - [x] 자동차 이름 리스트로 자동차 리스트 생성 메서드
- [x] 레이스 게임 시작 메서드
- [x] 전진을 가장 많이 한 우승자 구하는 메서드
- [x] 게임 종료 확인 메서드

### 출력 :printer:
- [x] 입력 값 그대로 출력
- [x] 차수별 게임 결과 출력
- [x] 우승자 출력

### Main 로직 :sunflower:
- [x] 자동차 이름들을 입력받는다.
- [x] 시도할 횟수를 입력받는다.
- [x] 시도 횟수 만큼 차수별로 실행 결과를 출력한다.
- [x] 최종 우승자를 출력한다.
