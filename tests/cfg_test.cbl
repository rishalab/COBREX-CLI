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
       77  exception-flag PICTURE 9.	
       77  not-exception-flag PICTURE 9.
 
       PROCEDURE DIVISION.
       PERFORM ISNEEDED THRU ISNEEDED-FN.
           
       IF NEED = 1 AND QT-VEG > 0
          IF MONEY > PR-VEG AND BAG < MAX-CAP
       	ADD 1 TO BAG
       	COMPUTE MONEY = MONEY - PR-VEG END-COMPUTE
          ELSE
             GO TO PRINT
       ELSE
           GO TO CHECK.            
       CHECK.
       IF MONEY <= 0 OR BAG >= MAX-CAP
       	GO TO PRINT.       
       CHECK-FN. EXIT.
       PRINT.       
       COMPUTE MONEY = MONEY - QT-MILK END-COMPUTE
       DISPLAY "REST:" MONEY.
       DISPLAY "NB OF PRODUCTS:" BAG.			
       FIN.
          STOP RUN.
       ISNEEDED.
       COMPUTE NEED = FUNCTION RANDOM (1) * 2 END-COMPUTE.
       ISNEEDED-FN. EXIT.
      