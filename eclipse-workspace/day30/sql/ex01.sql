-- DML (select, insert, update, delete) - CRUD
select * from dept;

--입력
--insert into 테이블명 (컬럼명, ...) values (값, ...);
--테이블에 새로운 행 추가 => insert into 행이름
--(컬럼이름의 갯수와 벨류값의 갯수가 같아야한다.)
insert into dept(deptno,dname,loc) values(50,'add1','add2');
insert into dept(deptno,dname) values(60,'add3');	-- dept에 컬럼중 벨류값하나가 빠진채 행이 추가된다면 나머지 벨류값은 추가되고 빠진 컬럼의 벨류값은 null로 들어간다.
insert into dept(deptno,dname) values(70,'add4');
insert into dept(deptno,dname,loc) values('60','aaa','한글');
insert into dept(deptno,dname,loc) values(50,'aaaa','한글');

--삭제
--delete from 테이블명 where 조건;
--테이블 불필요한 행 삭제 => delete ~ where
--(where뒤의 조건을 붙이지않고 from까지만해서 delete하면 from의 모든 내용이 전체 삭제되어버림으로 주의!)-예시:delete from dept;
delete from dept where deptno=60;

--수정
--update 테이블명 set 컬럼명=값,... where 조건;
--테이블 내용 수정 => update ~ where
--(where뒤의 조건을 붙이지 않으면 모든 내용이 set에 쓰여진대로 수정된다.)
update dept set dname='AA', loc='BB' where deptno=50;
--------------------------------------------------------------

insert into dept values (60,'CC','DD');
insert into dept values (70,'EE',null);
insert into dept values (80,'FF','');	-- dataBase에서는 ''은null과 같은 값을 지닌다.

delete from dept where deptno>60;
delete from dept where deptno in (50,60);
delete from dept where deptno between 50 and 60;
delete from dept where dname like '__';


















