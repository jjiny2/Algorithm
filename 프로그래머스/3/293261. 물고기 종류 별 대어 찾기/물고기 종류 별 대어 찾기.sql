SELECT A.ID, B.FISH_NAME, A.LENGTH 
    from FISH_INFO as A join
        FISH_NAME_INFO as B 
        on A.FISH_TYPE=B.FISH_TYPE
    WHERE A.LENGTH > 10 
        AND A.LENGTH = (
        SELECT MAX(LENGTH)
            FROM FISH_INFO
            WHERE FISH_TYPE = A.FISH_TYPE
    )
    ORDER BY A.ID 