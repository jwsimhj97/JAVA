--<단일행문자>
--문자열함수
select 'aAbBcCdD',LOWER('aAbBcCdD'),UPPER('aAbBcCdD') from dual;
select LOWER('aAbBcCdD') from dual;	-- 소문자
select UPPER('aAbBcCdD') from dual;	-- 대문자

select ename, empno, sal from emp where lower(ename)='scott';

select initcap('aAbBcCdD') from dual;

select concat('문자', '열') from dual;
select concat('문', concat('자','열')) from dual;	-- 문+자+열

select substr('aAbBcCdD',1,3) from dual;	-- 1~3까지 뽑아서 출력하라(substr)
select substrb('aAbBcCdD',1,3) from dual;	-- substrb => b=byte
select substr('한글로작성',1,3) from dual;	-- 한글로 출력
select substrb('한글로작성',1,3) from dual;	-- 한 (b=한글은 3byte) -> '한글'출력하려면 뒤에 1,6으로

select LENGTH('aAbBcCdD') from dual;		-- LENGTH() ()안의 글자 몇개인지
select LENGTHB('aAbBcCdD') from dual;
select LENGTH('한글로작성') from dual;
select LENGTHB('한글로작성') from dual;

select instr('aAbBcCdD','b') from dual;		-- instr('문장','선택') 선택된 문장이 몇번째인지
select instrb('aAbBcCdD','b') from dual;
select instr('한글로작성','로') from dual;
select instrb('한글로작성','로') from dual;

select replace('한글로작성','로','만') from dual;	-- replace('작성문장','선택','변경')

select lpad('abc',10,'#') from dual;		-- lpad('문장',앞에채울 문자갯수,'문자') : left
select rpad('abc',10,'#') from dual;		-- rpad('문장',뒤에채울 문자갯수,'문자') : right

select lpad(rpad(trim('   ab c  '),20,'#'),30,'#') from dual;

select trim('#' from '####ab#cd####') from dual;	-- trim : 공백뿐아니라 앞에조건을 붙여주면 앞뒤로붙은 해당 문자를 제거하고 보여준다


--숫자함수
--ABS 절대값을 반환
--FLOOR 소수점 아래를 잘라낸다(버림)
--ROUND 특정자릿수에서 반올림
--TRUNC 특정자릿수에서 잘라냄
--MOD
select 5/2,floor(5/2),mod(5,2) from dual;
select round(3.14),round(3.54) from dual;
select TRUNC(123.456) from dual;
select TRUNC(123.456,1) from dual;



--날짜함수
--SYSDATE			시스템 저장된 현재 날짜를 반환한다.
--MONTHS_BETWEEN	두 날짜 사이가 몇개월인지를 반환
--ADD_MONTHS		특정날짜에 개월수를 더함
--NEXT_DAY			특정날짜에서 최초로 도래하는 인자로 받은 요일의 날짜 반환
--LAST_DAY			해당 달의 마지막 날짜를 반환
--ROUND				인자로 받은 날짜를 특정기준으로 반올림 (mm, mi)
--TRUNC				인자로 받은 날짜를 특정기준으로 버림
--TO_CHAR 			날짜형or숫자형을
select sysdate from dual;
select hiredate,sysdate,sysdate-hiredate from emp;

select MONTHS_BETWEEN(sysdate,hiredate) from emp;

select sysdate-1 from dual;
select ADD_MONTHS(sysdate,-12) from dual;

select NEXT_DAY(sysdate,'월요일') from dual;
select LAST_DAY(sysdate+20) from  dual;

select round(sysdate,'mm') from dual;
select trunc(sysdate,'mm') from dual;

select to_char(sysdate,'YY-MM-DD HH:MI:SS') from dual;

select to_date('220120','YYMMDDHHMI')+1 from dual;

select to_number('12.34')+1 from dual;

select to_char(1234,'000000') from dual;
select to_char(1234,'000,000.00') from dual;
select to_char(1234,'$999,999.99') from dual;
select to_char(1234,'L999,999.99') from dual;

select null+1234 from dual;
select ename,sal,nvl(comm,0),sal+nvl(comm,0) from emp;

select ename,decode(deptno,10,'관리팀',20,'영업팀',30,'총무팀') from emp;

select ename,
			case 
				when deptno=10 then '관리팀'
				when deptno=20 then '영업팀'
				when deptno=30 then '총무팀'
				else '몰라'
			end
		from emp;





