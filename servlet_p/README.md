Servlet Programming Practice
=====
```txt
현재 spring mvc 환경에서 일하고 있는데, redirect에 대해 잘 모르는 것 같아 알아보던 중 간단한 서블릿 환경에서 코딩해보며 느낀 바를 적어본다. 아래 간략히 염두할 점에 대해 기록하였고, 관련 링크는 밑에 따로 달아두었다.

1. 서블릿 프로그래밍 vs. JSP 프로그래밍 vs. 스프링 MVC
  - web.xml 설정 차이(front controller pattern)
  - Dynamic Web Project vs. Maven Project
    - WebContent vs. webapp
  - 공통적인 문제로 Context Root(Context Path) 설정에 관해 생각
2. Redirect vs. Forward
  - 보통 스프링 MVC 환경에서는 Controller 클래스에서 볼 수 있으나, Servlet/JSP에서도 사용
```

- - -
1. 서블릿 프로그래밍 vs. JSP 프로그래밍  vs. 스프링 MVC
	* [Dynamic Web Project 설정](https://androphil.tistory.com/262)
	* 비교
		* [Servlet이란](https://gmlwjd9405.github.io/2018/10/28/servlet.html)
		* [JSP란](https://gmlwjd9405.github.io/2018/11/03/jsp.html)
		* [Servlet과 JSP의 차이와 관계](https://gmlwjd9405.github.io/2018/11/04/servlet-vs-jsp.html)
		* [Spring MVC](https://gmlwjd9405.github.io/2018/10/29/web-application-structure.html)
2. Redirect vs Forward
	* [response.sendRedirect()에 대하여(feat. location.href())](https://blog.outsider.ne.kr/188)
	* [Spring MVC :: Redirect 사용하기](https://hongku.tistory.com/124)