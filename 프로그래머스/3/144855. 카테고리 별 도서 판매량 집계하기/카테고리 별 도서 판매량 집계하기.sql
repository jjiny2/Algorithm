-- 코드를 입력하세요
SELECT A.CATEGORY, SUM(B.SALES)AS TOTAL_SALES
    FROM BOOK AS A JOIN BOOK_SALES AS B ON A.BOOK_ID=B.BOOK_ID
    WHERE YEAR(B.SALES_DATE)="2022" AND
            MONTH(B.SALES_DATE)="01"
    GROUP BY A.CATEGORY

ORDER BY CATEGORY ASC