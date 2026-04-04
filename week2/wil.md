2주차에서 계층형 아키텍처를 중심으로 공부했다. 계층형 아키텍처(Layered Architecture)는 Browser, Controller, Service, DAO, DB로 이루어져 있다.
Browser가 Controller에게, Controller가 Service에게, Service가 DAO에서 DTO를 전달하고, DAO는 DB에서 Entity를 전달한다. DTO(Data Transfer Object)는 데이터 전송 객체로 소통 목적에 맞는 꼭 필요한 정보만 전달한다. Entity는 모든 정보가 포함되어서 외부에 직접적으로 노출되지 않아야 한다.
Controller 계층은 HTTP 요청과 응답을 처리하게 되는데 계층형 구조와 도메인형 구조로 설계할 수 있다. 계층형 구조는 애플리케이션을 기능별로 나누는 것이고, 도메인형 구조는 특정 도메인의 코드를 한 곳에 모아 처리하는 방식으로 개발 및 유지 보수가 용이하여 이 방법으로 실습을 진행하였다.
Service 계층은 레포지토리 계층과 소통하는 계층으로 애플리케이션의 비즈니스 로직이 담긴 계층이다. 이 계층은 원자성을 보장하기 위해 트랜잭션 단위로 처리한다.