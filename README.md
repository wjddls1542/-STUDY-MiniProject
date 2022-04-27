# MiniProject-Note-
미니 프로젝트 인텔리제이 사용

##Contents
+코드 Edit
+포커스
+검색
+자동완성
+리팩토링
+디버깅
+Git
+플러그인

##기본 단축키

###디렉터리, 패키지, 클래스 등 생성 목록 보기

+MacOS: Cmd + n
+Win/Linux: Alt + Insert

##코드 Edit

###Main method 생성 및 실행

+메인 메서드 선언
+live template 이용: psvm
+(live template은 아래 참고)

메인 메서드 실행
좌측 실행 버튼
단축키
현재 Focus 가 해당 메서드에 있어야 함
MacOS: Ctrl + Shift + r
Win/Linux: Ctrl + Shift + F10 - 이전 실행문 재실행 (우측 상단에 실행문 목록 확인 가능)
MacOS: Ctrl + r
Win/Linux: Shift + F10
라인 수정하기
라인 복제하기
MacOS: Cmd + d
Win/Linux: Ctrl + d
라인 삭제하기
MacOS: Cmd + 백스페이스
Win/Linux: Ctrl + y
문자열 라인 합치기
MacOS: Ctrl + Shift + j
Win/Linux: Ctrl + Shift + j
라인 단위로 옮기기
1) 문법에 관계 없이 라인 이동
MacOS: Opt + Shift + ↑↓
Win/Linux: Alt + Shift + ↑↓
2) 구문 안에서만 라인 이동 (메서드를 벗어날 수 없음)
MacOS: Cmd + Shift + ↑↓
Win/Linux: Ctrl + Shift + ↑↓
Element 단위로 옮기기
Ex. html, xml 등의 규격이 정해진 마크업 언어에서 활용
MacOS: Cmd + Opt + Shift + ←→
Win/Linux: Ctrl + Alt + Shift + ←→
코드 즉시 보기
인자값 즉시 보기 (Parameter Info)
MacOS: Cmd + p
Win/Linux: Ctrl + p
코드 구현부 즉시 보기 (Quick Definition)
클래스- 클래스 전체 코드
인스턴스- 인스턴스 생성 코드
메서드- 메서드 정의 코드
MacOS: Opt + Space
Win/Linux: Ctrl + Shift + i
Doc 즉시 보기 (Quick Documentation)
MacOS: F1
Win/Linux: Ctrl + q
포커스
포커스 에디터
단어별 이동
MacOS: Opt + ←→
Win/Linux: Ctrl + ←→
단어별 선택 (Move Caret to Next Word with Selection)
MacOS: Opt + Shift + ←→
Win/Linux: Ctrl + Shift + ←→
라인 첫/끝 이동
MacOS: fn + ←→
Win/Linux: Home, End
라인 전체 선택
MacOS: fn + Shift + ←→
Win/Linux: Shift + Home, End
Page Up/Down
MacOS: fn + ↑↓
Win/Linux: Page Up, Page Down
포커스 특수키
포커스 범위 한 단계씩 늘리기 (Extend Selection)
해당 커서의 단어 포커스하기
MacOS: Opt + ↑↓
Win/Linux
위: Ctrl + w
아래: Ctrl + Shift + w
포커스 뒤로/앞으로 가기 (Navigate -> Back/Forward)
이전 커서가 있던 화면으로 돌아갈 때 유용
클래스 이동도 가능
MacOS: Cmd + [ 또는 ]
Win/Linux: Ctrl + Alt + ←→
멀티 포커스 (Clone Caret Below)
MacOS: Opt + Opt + ↓ (Opt 누른 상태)
Win/Linux: Ctrl + Ctrl + ↓ (Ctrl 누른 상태)
오류 라인으로 자동 포커스 (Navigate -> Next Highlighted Error)
MacOS: F2
Win/Linux: F2
검색
검색 텍스트
현재 파일에서 검색 (Find)
MacOS: Cmd + f
Win/Linux: Ctrl + f
현재 파일에서 교체 (Replace)
MacOS: Cmd + r
Win/Linux: Ctrl + r
전체에서 검색 (Find in Path)
MacOS: Cmd + Shift + f
Win/Linux: Ctrl + Shift + f
전체에서 교체 (Replace in Path)
MacOS: Cmd + Shift + r
Win/Linux: Ctrl + Shift + r
정규표현식으로 검색, 교체
[Find/Replace] -> Regex 체크
검색 기타
파일 검색 (Navigate -> File)
MacOS: Cmd + Shift + o
Win/Linux: Ctrl + Shift + n
메서드 검색 (Navigate -> Symbol)
MacOS: Cmd + Opt + o
Win/Linux: Ctrl + Shift + Alt + n
Action 검색 (Find Action: Enter action or option name)
MacOS: Cmd + Shift + a
Win/Linux: Ctrl + Shift + a
최근 열었던 파일 목록 보기 (Recent Files)
MacOS: Cmd + e
Win/Linux: Ctrl + e
최근 수정한 파일 목록 보기 (Recently Changed Files)
MacOS: Cmd + Shift + e
Win/Linux: Ctrl + Shift + e
자동완성
자동완성
기본 자동완성 (Completion -> Basic)
MacOS: Ctrl + Space
Win/Linux: Ctrl + Space
스마트 자동완성 (Completion -> SmartType)
MacOS: Ctrl + Shift + Space
Win/Linux: Ctrl + Shift + Space
static method 자동완성
MacOS: Ctrl + Space + Space
Win/Linux: Ctrl + Space + Space
getter/setter/생성자 자동완성 (Generate)
MacOS: Cmd + n
Win/Linux: Alt + Insert
Override 메서드 자동완성 (Implement Methods)
MacOS: Ctrl + i
Win/Linux: Ctrl + i
Live Template (Code Template)
live template 목록 확인하기 (Insert Live Template)
[Find Action] -> Live Templates 입력
MacOS: Cmd + j
Win/Linux: Ctrl + j
자주 사용하는 live template 예시
psvm: 메인메서드 선언
sout: System.out.println(); 자동 생성
나만의 live template 추가하기
[Find Action] -> Live Templates 입력
other 선택 -> “+” 버튼 -> Live Template
Abbreviation(축약어)
Ex. ent
Description(설명)
Ex. Entity Class Header
Template text(텍스트)
아래 예시
Error(No applicable contexts yet.)에서 Define 클릭
Ex. Java 선택
Apply & OK
https://gmlwjd9405.github.io/2019/05/21/intellij-shortkey.html
