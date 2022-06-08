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
          
       INIT.
                     
           IF OP = 1
                   DISPLAY "SHOP IS OPEN"
                   PERFORM INIT-PRD THROUGH INIT-PRD-FN
                   GO TO INIT-FN
           ELSE
                   DISPLAY "SHOP IS CLOSED"
           	       GO TO INIT
           END-IF.
           
       INIT-FN.
           EXIT.
       BUY-VEG.
           PERFORM ISNEEDED THROUGH ISNEEDED-FN.
           IF NEED = 1 AND QT-VEG > 0
              IF MONEY > PR-VEG AND BAG < MAX-CAP
           	ADD 1 TO BAG
           	COMPUTE MONEY = MONEY - PR-VEG
           	SUBTRACT 1 FROM QT-VEG
              ELSE
                 GO TO PRINT
              END-IF
           ELSE
               GO TO BUY-MEAT
           END-IF.
       BUY-VEG-FN. 
           EXIT.
       BUY-MEAT.
           PERFORM ISNEEDED THROUGH ISNEEDED-FN.    		
           IF NEED = 1 AND QT-MEAT > 0
              IF MONEY > PR-MEAT AND BAG < MAX-CAP
           	ADD 1 TO BAG
           	COMPUTE MONEY = MONEY - PR-MEAT
           	SUBTRACT 1 FROM QT-MEAT
              ELSE
                GO TO PRINT
              END-IF
           ELSE
               GO TO BUY-BREAD
           END-IF.
       BUY-MEAT-FN. 
           EXIT.
       BUY-BREAD.
           PERFORM ISNEEDED THROUGH ISNEEDED-FN.    		
           IF NEED = 1 AND QT-BREAD > 0
              IF MONEY > PR-BREAD AND BAG < MAX-CAP
           	ADD 1 TO BAG
           	COMPUTE MONEY = MONEY - PR-BREAD
           	SUBTRACT 1 FROM QT-BREAD
              ELSE
                GO TO PRINT
              END-IF
           ELSE
               GO TO BUY-MILK
           END-IF.
       BUY-BREAD-FN. 
           EXIT.    		
       BUY-MILK.
           PERFORM ISNEEDED THRU ISNEEDED-FN.    		
           IF NEED = 1 AND QT-MILK > 0
              IF MONEY > PR-MILK AND BAG < MAX-CAP
           	ADD 1 TO BAG
           	COMPUTE MONEY = MONEY - PR-MILK
           	SUBTRACT 1 FROM QT-MILK
               ELSE
                GO TO PRINT
              END-IF
           ELSE
               GO TO BUY-FRUIT
           END-IF.
       BUY-MILK-FN. 
           EXIT.
       BUY-FRUIT.
           PERFORM ISNEEDED THRU ISNEEDED-FN.    		
           IF NEED = 1 AND QT-FRUIT > 0
              IF MONEY > PR-FRUIT AND BAG < MAX-CAP
           	ADD 1 TO BAG
           	COMPUTE MONEY = MONEY - PR-FRUIT
           	SUBTRACT 1 FROM QT-FRUIT
               ELSE
                GO TO PRINT
              END-IF
           ELSE
               GO TO CHECK
           END-IF.
       BUY-FRUIT-FN. 
           EXIT.
       CHECK.
           IF MONEY <= 0 OR BAG >= MAX-CAP
           	GO TO PRINT
           ELSE
               GO TO BUY-VEG
           END-IF.
       CHECK-FN. 
           EXIT.
       PRINT.
           MOVE MONEY TO REST.
           DISPLAY "REST:" MONEY.
           DISPLAY "NB OF PRODUCTS:" BAG.			
       FIN.
          STOP RUN.
          
       ISNEEDED.
          COMPUTE NEED = FUNCTION RANDOM (1) * 2. 
       ISNEEDED-FN.
           EXIT.
           
       INIT-PRD.
          COMPUTE QT-VEG = FUNCTION RANDOM (1) * 10
          COMPUTE QT-MEAT = FUNCTION RANDOM (1) * 10
          COMPUTE QT-BREAD = FUNCTION RANDOM (1) * 10
          COMPUTE QT-MILK = FUNCTION RANDOM (1) * 10
          COMPUTE QT-FRUIT = FUNCTION RANDOM (1) * 10
          COMPUTE PR-VEG = FUNCTION RANDOM (1) * 10 + 3
          COMPUTE PR-MEAT = FUNCTION RANDOM (1) * 10 + 5
          COMPUTE PR-BREAD = FUNCTION RANDOM (1) * 10 + 1
          COMPUTE PR-MILK = FUNCTION RANDOM (1) * 10 + 2
          COMPUTE PR-FRUIT = FUNCTION RANDOM (1) * 10 + 1.
      
          
       INIT-PRD-FN. 
           EXIT.