5주차에서는 객체지향의 개념, SOLID 원칙, 스프링 빈을 공부했다. 객체 지향은 추상화, 캡슐화, 상속, 다형성의 4가지 주요 특징이 있다. 추상화는 객체의 공통적인 속성과 기능을 추출하여 정의하는 것이고 캡슐화는 관련된 속성과 기능을 하나의 캡슐로 만들어 데이터를 보호하는 것이다. 상속은 기존 클래스의 속성과 기능을 새로운 클래스가 물려받아 재사용 하는 것이고 다형성은 객체의 속성과 기능이 상황에 따라 여러 형태를 가질 수 있는 성질이다.
이 때, 다형성을 적용하기 위해 인터페이스를 도입해서 사용하게 된다.
SOLID 원칙은 SRP: 단일 책임 원칙(Single Responsibility Principle), OCP: 개방 폐쇄 원칙(Open Closed Principle), LSP: 리스코프 치환 원칙(Liskov Substitution Principle), ISP: 인터페이스 분리 원칙(Interface Segregation Principle), DIP: 의존관계 역전 원칙(Dependency Inversion Principle)으로 객체 지향 설계를 위한 5가지 원칙이다.
스프링 빈(Spring Bean)은 어플리케이션 전역에서 사용하는 공용 객체로 스프링 컨테이너(Spring Container)가 관리하는 객체이다. 빈은 @Configuration, @Bean 을 이용해 수동으로 등록할 수 있고, @Component, @ComponentScan을 이용해 자동으로 등록할 수도 있다.
IoC는 제어의 역전(Inversion of Control)으로 객체 생성 및 관리에 대한 제어권을 개발자가 아닌 프레임워크가 갖는 것으로 스프링에서 객체를 생성하고 스프링 컨테이너가 관리하는 역할을 하는 것이다.
DI는 의존성 주입(Dependency Injection)으로 의존하는 객체를 직접 생성하지 않고 외부에서 주입받는 것이다.