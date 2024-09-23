-- 코드를 입력하세요
SELECT  A.PRODUCT_CODE AS PRODUCT_CODE, SUM(A.PRICE * B.SALES_AMOUNT)AS SALES  FROM PRODUCT AS A JOIN OFFLINE_SALE AS B ON A.PRODUCT_ID = B.PRODUCT_ID
    GROUP BY B.PRODUCT_ID
    ORDER BY SALES DESC, PRODUCT_CODE ASC