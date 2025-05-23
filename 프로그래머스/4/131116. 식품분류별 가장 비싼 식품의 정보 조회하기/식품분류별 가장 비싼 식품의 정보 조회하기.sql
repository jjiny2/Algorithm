-- 코드를 입력하세요
SELECT CATEGORY,PRICE AS MAX_PRICE, PRODUCT_NAME
    FROM FOOD_PRODUCT AS A 
    WHERE CATEGORY IN ("과자","국","김치","식용유")
        AND PRICE =(
            SELECT MAX(PRICE)
                FROM FOOD_PRODUCT AS B
                WHERE A.CATEGORY=B.CATEGORY
        )
    ORDER BY MAX_PRICE DESC