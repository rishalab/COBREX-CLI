       IDENTIFICATION DIVISION.
       PROGRAM-ID. AGE-CALC.

       ENVIRONMENT DIVISION.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.


       DATA DIVISION.
       FILE SECTION.
       

       WORKING-STORAGE SECTION.
       01  WS-AGE            PIC 999.
       01  WS-TEMP.
           05  WS-BIRTH-YEAR   PIC 9999.
           05  WS-CURRENT-YEAR PIC 9999.

       01  WS-DATE.
           05  WS-YEAR PIC 99.
           05  WS-MONTH PIC 99.
           05  WS-DAY   PIC 99.
       01  WS-NAME.
           05  WS-FIRST-NAME   PIC X(10).
           05  WS-LAST-NAME    PIC X(10).
       01  WS-DISPLAY-DATE.
           05  WS-DISPLAY-MONTH        PIC 99.
           05  FILLER          PIC X VALUE "/".
           05  WS-DISPLAY-DAY          PIC 99.
           05  FILLER          PIC X VALUE "/".
           05  WS-DISPLAY-YEAR         PIC 99.


       PROCEDURE DIVISION.

       0100-START-HERE.

           INITIALIZE WS-AGE.
           DISPLAY "Who are you? : ".
           ACCEPT WS-FIRST-NAME.

           DISPLAY "What is your birth date? (YYYY) : ".

           ACCEPT WS-BIRTH-YEAR.
           ACCEPT WS-DATE FROM DATE.

           MOVE WS-MONTH TO WS-DISPLAY-MONTH.
           MOVE WS-DAY TO WS-DISPLAY-DAY.
           MOVE WS-YEAR TO WS-DISPLAY-YEAR.

           COMPUTE WS-CURRENT-YEAR = WS-YEAR + 2000.
           COMPUTE WS-AGE = WS-CURRENT-YEAR - WS-BIRTH-YEAR.

           DISPLAY "Thank you for using my calculator  ", WS-FIRST-NAME.
           DISPLAY "Today's date is ", WS-DISPLAY-DATE.
           DISPLAY "And your age is ", WS-AGE.

           COMPUTE PAYMENT-RND ROUNDED PAYMENT-TRUNC =
            (INITIAL-PRINCIPAL * INTEREST-PER-PERIOD) /
            (1 - (1 +  INTEREST-PER-PERIOD) **
            (-  NUMBER-OF-PERIODS)).

           DELETE STUDENT RECORD
            INVALID KEY DISPLAY 'Invalid Key'
            NOT INVALID KEY DISPLAY 'Record Deleted'
           END-DELETE.

           EVALUATE menu-input
            WHEN "0"
                CALL init-proc
            WHEN "1" THRU "9"
                CALL process-proc
            WHEN "R"
                CALL read-parms
            WHEN "X"
                CALL cleanup-proc
            WHEN OTHER
                CALL error-proc
           END-EVALUATE;

           EVALUATE TRUE
            WHEN WS-A > 2
                DISPLAY 'WS-A GREATER THAN 2'

            WHEN WS-A < 0
                DISPLAY 'WS-A LESS THAN 0'

            WHEN OTHER
                DISPLAY 'INVALID VALUE OF WS-A'
           END-EVALUATE.
           
             READ EMPLOYEE INTO WS-EMPL     
              KEY IS EMPL-ID               
              INVALID KEY                  
                 DISPLAY 'RECEORD KEY IS INVALID'
              NOT INVALID KEY                    
                 DISPLAY 'REC : ' WS-EMPL2
                 
             RELEASE SORT-RECORD FROM  INPUT-RECORD          
             END-READ   
             
             REWRITE LOG-RECORD FROM A
             END-REWRITE.
             
             SUBTRACT A B FROM C D                             

           SUBTRACT A B C FROM D GIVING E      

           SUBTRACT  CORR WS-GR1 FROM WS-GR2        
           
           
           IF NEED = 1 AND QT-BREAD > 0
               IF MONEY > PR-BREAD AND BAG < MAX-CAP
            	ADD 1 TO BAG
           
           
       
    

           STOP RUN.

          END PROGRAM AGE-CALC.