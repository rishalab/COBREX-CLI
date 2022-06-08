       IDENTIFICATION DIVISION.
       PROGRAM-ID. perform_test.

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
           
           PERFORM UNTIL A > 100           
           END-PERFORM.
           
           PERFORM WITH TEST BEFORE UNTIL A > 100
        
           END-PERFORM.

           PERFORM WITH TEST AFTER UNTIL A > 100
               
           END-PERFORM.
           
           PERFORM 
           
           END-PERFORM.
           
           PERFORM PARA-NAME-1.
           PERFORM PARA-NAME-1     3 TIMES.
           PERFORM PARA-NAME-1 THRU PARA-NAME-4    E TIMES.
           PERFORM PARA-NAME-1 WITH TEST BEFORE UNTIL AGE > 10.
           PERFORM PARA-NAME-1 WITH TEST AFTER UNTIL AGE > 10.
           PERFORM PARA-NAME-1 UNTIL AGE > 10.
           PERFORM PARA-NAME-1 VARYING A FROM C BY D
               UNTIL A > 20
           END-PERFORM
           PERFORM PARA-NAME-1 THRU PARA-NAME-3.
           
           
    

           STOP RUN.

          END PROGRAM AGE-CALC.