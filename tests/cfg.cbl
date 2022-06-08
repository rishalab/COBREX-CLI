       IDENTIFICATION DIVISION.
       PROGRAM-ID. SHOP.
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       SOURCE-COMPUTER. PC-MICROFOCUS.
       OBJECT-COMPUTER. PC-MICROFOCUS.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 SHOP.
           10 OP          PICTURE 9.
           10 QT-VEG      PICTURE 99.
           10 QT-MEAT     PICTURE 99.
           10 QT-BREAD    PICTURE 99.
           10 QT-MILK     PICTURE 99.
           10 QT-FRUIT    PICTURE 99.
           10 PR-VEG      PICTURE 9.
           10 PR-MEAT     PICTURE 9.
           10 PR-BREAD    PICTURE 9.
           10 PR-MILK     PICTURE 9.
           10 PR-FRUIT    PICTURE 9.
       77  MONEY        PICTURE 99, VALUE 50.
       77  REST         PICTURE 99.
       77  BAG          PICTURE 9.
       77  MAX-CAP      PICTURE 9, VALUE 10.
       77  RAND         PICTURE 9.
       77  NEED         PICTURE 9.	
 
       PROCEDURE DIVISION.
       PERFORM VARYING BAG FROM 1 BY 1 UNTIL BAG > 5
       
       IF BAG < 35
          CONTINUE
       ELSE          
           COMPUTE MONEY = MONEY + 1
           PERFORM VARYING REST FROM 1 BY 1 UNTIL REST > 5
            
           IF REST < 35
              CONTINUE
           END-IF                      
           END-PERFORM
           
       END-IF
       END-PERFORM.
           
       PERFORM ISNEEDED THROUGH ISNEEDED-FN.
       IF NEED = 1 AND QT-VEG > 0
          IF MONEY > PR-VEG AND BAG < MAX-CAP
       	ADD 1 TO BAG
       	COMPUTE MONEY = MONEY - PR-VEG
          ELSE
             GO TO PRINT
       ELSE
           GO TO CHECK.            
       CHECK.
       IF MONEY <= 0 OR BAG >= MAX-CAP
       	GO TO PRINT.       
       CHECK-FN. EXIT.
       PRINT.       
       DISPLAY "REST:" MONEY.
       DISPLAY "NB OF PRODUCTS:" BAG.			
       FIN.
          STOP RUN.
       ISNEEDED.
       COMPUTE NEED = FUNCTION RANDOM (1) * 2.
       ISNEEDED-FN. EXIT.
      