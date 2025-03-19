-- 코드를 작성해주세요
WITH GRP AS (
    SELECT EMP_NO, YEAR, AVG(SCORE)AS SCORE
        FROM HR_GRADE
        GROUP BY EMP_NO, YEAR
)
SELECT B.EMP_NO, 
        B.EMP_NAME, 
        CASE 
            WHEN A.SCORE >= 96 THEN 'S'
            WHEN A.SCORE >= 90 AND A.SCORE <96 THEN 'A'
            WHEN A.SCORE >= 80 AND A.SCORE <90 THEN 'B'
            ELSE 'C'
            END AS GRADE, 
        SUM(CASE
            WHEN A.SCORE >= 96 THEN B.SAL*0.2
            WHEN A.SCORE >= 90 AND A.SCORE <96 THEN B.SAL*0.15
            WHEN A.SCORE >= 80 AND A.SCORE <90 THEN B.SAL*0.1
            ELSE 0  
         END) AS BONUS
    FROM GRP AS A JOIN HR_EMPLOYEES AS B
        ON A.EMP_NO = B.EMP_NO
    GROUP BY B.EMP_NO ,
            B.EMP_NAME,
            A.SCORE
    ORDER BY EMP_NO
    
    