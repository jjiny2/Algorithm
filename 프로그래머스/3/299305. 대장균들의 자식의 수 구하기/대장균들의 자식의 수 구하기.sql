-- 코드를 작성해주세요
SELECT A.ID, CASE
    WHEN B.CHILD_COUNT IS NULL THEN 0
    ELSE CHILD_COUNT
    END AS CHILD_COUNT
    FROM ECOLI_DATA AS A 
        LEFT OUTER JOIN
        (SELECT PARENT_ID, COUNT(*)AS CHILD_COUNT
            FROM ECOLI_DATA
            GROUP BY PARENT_ID
        )AS B
        ON A.ID = B.PARENT_ID
    ORDER BY ID