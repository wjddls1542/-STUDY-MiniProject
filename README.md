# 🚩MiniProject note

## [intellij] 유용한 단축키
-------------

## 기본 단축키
### 디렉터리, 패키지, 클래스 등 생성 목록 보기
+ MacOS: Cmd + n
+ Win/Linux: Alt + Insert

## 코드 Edit
### Main method 생성 및 실행
+ 메인 메서드 선언
  + live template 이용: psvm
  + (live template은 아래 참고)
+ 메인 메서드 실행
  1. 좌측 실행 버튼
  2. 단축키
    + 현재 Focus 가 해당 메서드에 있어야 함
    + MacOS: Ctrl + Shift + r
    + Win/Linux: Ctrl + Shift + F10 - 이전 실행문 재실행 (우측 상단에 실행문 목록 확인 가능)
    + MacOS: Ctrl + r
    + Win/Linux: Shift + F10

 ## 리팩토링
 ### 리팩토링 Extract
+ 변수 추출하기 (Extract -> Variable)
  + MacOS: Cmd + Opt + v
  + Win/Linux: Ctrl + Alt + v
+ 파라미터 추출하기 (Extract -> Parameter)
  + MacOS: Cmd + Opt + p
  + Win/Linux: Ctrl + Alt + p
+ 메서드 추출하기 (Extract -> Method)
  + MacOS: Cmd + Opt + m
  + Win/Linux: Ctrl + Alt + m
+ 이너클래스 추출하기
  + MacOS: F6
  + Win/Linux: F6
 
### 리팩토링 기타

+ 이름 일괄 변경하기 (Rename)
  + MacOS: Shift + F6
  + Win/Linux: Shift + F6
+ 타입 일괄 변경하기 (Type Migration)
  + MacOS: Cmd + Shift + F6
  + Win/Linux: Ctrl + Shift + F6
+ Import 정리하기 (Optimize Imports)
  + MacOS: Ctrl + Opt + o
  + Win/Linux: Ctrl + Alt + o
  + 자동 설정: [Find Action] -> Optimize imports on 입력 -> “Auto import: …”
+ 코드 자동 정렬하기 (Reformat Code)
  + MacOS: Cmd + Opt + l
  + Win/Linux: Ctrl + Alt + l

## 자동완성

+ 기본 자동완성 (Completion -> Basic)
  + MacOS: Ctrl + Space
  + Win/Linux: Ctrl + Space
+ 스마트 자동완성 (Completion -> SmartType)
  + MacOS: Ctrl + Shift + Space
  + Win/Linux: Ctrl + Shift + Space
+ static method 자동완성
  + MacOS: Ctrl + Space + Space
  + Win/Linux: Ctrl + Space + Space
+ getter/setter/생성자 자동완성 (Generate)
  + MacOS: Cmd + n
  + Win/Linux: Alt + Insert
+ Override 메서드 자동완성 (Implement Methods)
  + MacOS: Ctrl + i
  + Win/Linux: Ctrl + i



