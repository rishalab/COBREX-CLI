       IDENTIFICATION DIVISION.
       PROGRAM-ID. HELLO-WORLD.
       DATA DIVISION.
              WORKING-STORAGE SECTION.
              77  AGE         PICTURE 99.
              77  A         PICTURE 99.
              77  B         PICTURE 99.
              77  C         PICTURE 99.
              
       PROCEDURE DIVISION.
       DISPLAY 'Hello, world'.
       ACCEPT AGE.
       ACCEPT A.
       
       EVALUATE TRUE ALSO AGE
           WHEN A = 5 ALSO 1
              DISPLAY "A IS 5 AND CHILDREN GROUP"
              MOVE 10 TO B
           WHEN A = 10 ALSO 10
              DISPLAY "A IS 10 AND ADOLESCENTS GROUP"
              ADD 15 TO C
           WHEN A = 15 ALSO 25
              DISPLAY "A IS 15 AND ADULT GROUP"

       END-EVALUATE.
       
       DISPLAY 'After Evaluate'.
       STOP RUN.