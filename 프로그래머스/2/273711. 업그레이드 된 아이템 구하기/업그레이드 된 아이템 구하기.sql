-- 코드를 작성해주세요
SELECT A.ITEM_ID AS ITEM_ID, A.ITEM_NAME AS ITEM_NAME, A.RARITY AS RARITY
FROM ITEM_INFO AS A JOIN ITEM_TREE AS B ON A.ITEM_ID=B.ITEM_ID 
WHERE B.PARENT_ITEM_ID IN(
    SELECT ITEM_ID FROM ITEM_INFO
        WHERE RARITY="RARE"
)
ORDER BY ITEM_ID DESC