-- 학생성적관리프로그램 숙제(2022.01.20)
create table student(
	num number,
	name varchar2(9),
	subKor number(3),
	subEng number(3),
	subMath number(3)
);
--drop table student;
select * from student;