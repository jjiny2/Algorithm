-- 코드를 입력하세요
SELECT A.ANIMAL_ID, A.NAME
    FROM ANIMAL_INS AS A JOIN ANIMAL_OUTS AS B ON A.ANIMAL_ID = B.ANIMAL_ID
    WHERE A.DATETIME > B.DATETIME
    ORDER BY A.DATETIME
    