       
       
       IDENTIFICATION DIVISION.
       PROGRAM-ID. EXAMPLE.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       77  NUM         PICTURE 99.
       77  QUOTIENT    PICTURE 99.
       77  REMAIN      PICTURE 9.
       PROCEDURE DIVISION.
           ACCEPT NUM.
           DIVIDE NUM BY 2 GIVING QUOTIENT REMAINDER REMAIN.
           IF REMAIN = 0
                   DISPLAY NUM ' IS EVEN'
           ELSE
                   DISPLAY  NUM ' IS ODD'
           END-IF.
           STOP RUN.