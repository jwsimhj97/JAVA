-- 주석

-- 테이블 목록 확인
select tname from tab; -- execute all 클릭 -> 하단 Result1 탭

-- 사원정보테이블(emp)
select * from emp; 	-- emp 모든 내용 출력

-- 부서명정보테이블(dept)
select * from dept;	-- dept의 모든 내용 출력	-- select dname,loc,deptno * from dept; (순서변경가능)
select deptno, dname from dept;

-- dbms(데이터베이스 관리 시스템)
-- 관계형 데이터베이스 모델 (RDBMS)
-- 순서가 없는 집합

-- (데이터베이스)테이블 : 세로줄(컬럼, 속성)과 가로줄(row or 레코드)의 모델을 이용하여 정렬된 데이터 집합(값)의 모임

-- <SQL문장의 종류>
-- DML : 데이터 조작(SELECT-DQL로 분류가능(데이터 조회or검색)), INSERT(삽입), UPDATE(수정), DELETE(삭제))
-- DDL : 데이터 설계&정의(CREATE, ALTER, DROP, RENAME, TRUNCATE)
-- TCL : 트레젝션 제어(COMMIT, ROLLBACK, SAVEPOINT)
-- DCL : 데이터베이스 컨트롤(=제어(GRANT(권한주고), REVOKE(권한을 뺏고))

-- select ~ from 사이에는  column이름들이 와야한다 (colunm구분 - ,)

-- 예시
select ename, sal, hiredate from emp;	-- emp:사원정보가 저장된테이블 / ename:사원이름, sal:급여, hiredate:입사일자

select deptno as "부서번호", dname as "부서명" from dept;	--as 키워드는 별칭을 부여한다(별칭부여시 제일 좋은 방법)
select deptno as a, dname as b from dept;	-- 이렇게도 쓸수 있지만 ""을 사용하면 안에 특수문자나 띄워쓰기,대소문자를 구분하여 별칭을 사용할 수 있다.(ex: "a A")
select deptno A, dname B from dept;			-- as키워드 생략 가능
select distinct job from emp;				-- distinct:중복생략

--사원들의 소속 부서번호를 중복되지 않고 한번씩 출력하라.
select distinct deptno from emp;
--사원중에 급여가 3000이상 받는 사람만 출력하라.
select ename, sal from emp where sal>=3000;	-- where:조건을 붙일 수 있다.(=:같다, (<>, !=, ^=):다르다, 그 외 <, >, <=, >=)
--부서번호가 10번인 사원정보를 모두 출력하라.
select * from emp where deptno=10;
--테이블emp중에서 급여가 2000미만이 되는 사원의 정보 중 사번, 이름, 급여를 출력하라
select empno,ename,sal from emp where sal<2000;

select empno, sal, ename from emp where ename='SCOTT'; -- 문자데이터는 반드시 단일따옴표 안에 표시한다.(소문자x)
select empno, ename, job from emp where ename='MILLER';	-- job:직급

select ename,hiredate from emp where hiredate>='1985/01/01'; -- 날짜데이터는 반드시 단일따옴표 안에 표시하고 '년/월/일'의 형식으로 쓰인다.
select ename,hiredate from emp where hiredate>='1981/01/01'; -- '1999/01/01', '99/01/01', '99-01-01', '19990101' - 등 사용가능형식('990101'은 사용x)

--81년도 입사일, 이름
select ename,hiredate from emp where hiredate>='1981/01/01'and hiredate<='1981/12/31';	-- and
--급여가 1000에서 3000 사이에 있는 사원
select ename,sal from emp where sal>=1000 and sal<= 3000;	-- and
select enaem,sal from emp where sal between 100 and 3000;	-- between and
--사원번호가 7844이거나 7654이거나 7521인 사원
select empno,ename from emp where empno='7844' or empno='7654' or empno='7521';				-- or
--급여가 1500과 2500사이인 사원의 사번, 이름, 급여를 출력하라.
select empno,ename,sal from emp where sal between 1500 and 2500;
--사원의 이름이 A로 시작하는 사원들의 이름을 출력하라.
select ename from emp where ename like 'A%';				-- like(% or _)
-- like (%(문자가 없거나, 하나 이상의 문자가 어떤 값이 와도 된다) or _(하나의 문자가 어떤값이 와도된다))
--A가 들어가는 사원의 이름을 출력하라.
select ename from emp where ename like '%A%';
--A가 3번째에 들어가는 사원의 이름을 출력하라.
select ename from emp where ename like '__A%';

select sal,comm from emp;
select ename,sal,comm from emp where comm is null;			-- comm	-- is	-- null
select ename,sal,comm from emp where comm is not null;		-- not

select * from dept;
select * from dept order by deptno;			-- order by:순서결정
select * from dept order by dname asc;		-- asc:오름차순
select * from dept order by dname desc;	-- desc:내림차순



