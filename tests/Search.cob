       IDENTIFICATION DIVISION.
       PROGRAM-ID. HELLO-WORLD.
       DATA DIVISION.

           WORKING-STORAGE SECTION.
               77 N PIC 99.
               77 SEARCHRNO PIC 99.
               01 ARRAY.
                  02 ARR OCCURS 10 TIMES ASCENDING KEY IS RNO INDEXED BY I.
                    03 RNO PIC 99.
        PROCEDURE DIVISION.   
           SET I TO 1.
           SEARCH ARR AT END DISPLAY N
           WHEN N = SEARCHRNO NEXT SENTENCE
           WHEN RNO(I) = SEARCHRNO DISPLAY "FOUND ROLL NUMBER".
           DISPLAY 'After Search'.
           MOVE 10000 TO EMP-SALARY.
           IF EMP-GRADE = 'C THEN'
               NEXT SENTENCE
           ELSE
               ADD 1000 TO EMP-SALARY
           END-ID
           DISPLAY 'NEW SALARY: ' EMP-SALARY.
           DISPLAY 'EMP-GRADE: ' EMP-GRADE.
           STOP RUN.