Servlet Programming Practice
=====
```txt
���� spring mvc ȯ�濡�� ���ϰ� �ִµ�, redirect�� ���� �� �𸣴� �� ���� �˾ƺ��� �� ������ ���� ȯ�濡�� �ڵ��غ��� ���� �ٸ� �����. �Ʒ� ������ ������ ���� ���� ����Ͽ���, ���� ��ũ�� �ؿ� ���� �޾Ƶξ���.

1. ���� ���α׷��� vs. JSP ���α׷��� vs. ������ MVC
  - web.xml ���� ����(front controller pattern)
  - Dynamic Web Project vs. Maven Project
    - WebContent vs. webapp
  - �������� ������ Context Root(Context Path) ������ ���� ����
2. Redirect vs. Forward
  - ���� ������ MVC ȯ�濡���� Controller Ŭ�������� �� �� ������, Servlet/JSP������ ���
```

- - -
1. ���� ���α׷��� vs. JSP ���α׷���  vs. ������ MVC
	* [Dynamic Web Project ����](https://androphil.tistory.com/262)
	* ��
		* [Servlet�̶�](https://gmlwjd9405.github.io/2018/10/28/servlet.html)
		* [JSP��](https://gmlwjd9405.github.io/2018/11/03/jsp.html)
		* [Servlet�� JSP�� ���̿� ����](https://gmlwjd9405.github.io/2018/11/04/servlet-vs-jsp.html)
		* [Spring MVC](https://gmlwjd9405.github.io/2018/10/29/web-application-structure.html)
2. Redirect vs Forward
	* [response.sendRedirect()�� ���Ͽ�(feat. location.href())](https://blog.outsider.ne.kr/188)
	* [Spring MVC :: Redirect ����ϱ�](https://hongku.tistory.com/124)