       IDENTIFICATION DIVISION.
       PROGRAM-ID. test4.
       DATA DIVISION.
       FILE SECTION.
       SD  SORT-FILE
           RECORD CONTAINS 115 CHARACTERS
           DATA RECORD SORT-RECORD.
       01  SORT-RECORD.
           05  SORT-KEY.
               10  SORT-SHIFT              PIC X(1).
               10  SORT-GRID-LOCATION      PIC X(2).
               10  SORT-REPORT             PIC X(3).
           05  SORT-EXT-RECORD.
               10  SORT-EXT-EMPLOYEE-NUM   PIC X(6).
               10  SORT-EXT-NAME           PIC X(30).
               10  FILLER                  PIC X(73).
      
       WORKING-STORAGE SECTION.
       01  TAB1.
           05 TAB-ENTRY OCCURS 10 TIMES
                  INDEXED BY TAB-INDX.
               10  WS-SHIFT                PIC X(1).
               10  WS-GRID-LOCATION        PIC X(2).
               10  WS-REPORT               PIC X(3).
               10  WS-EXT-EMPLOYEE-NUM     PIC X(6).
               10  WS-EXT-NAME             PIC X(30).
               10  FILLER                  PIC X(73).
       
       PROCEDURE DIVISION.
           
           SORT SORT-FILE
               ON ASCENDING KEY SORT-GRID-LOCATION SORT-SHIFT
               INPUT PROCEDURE 600-SORT3-INPUT
               OUTPUT PROCEDURE 700-SORT3-OUTPUT.
               
        FIN.
           
          STOP RUN.
           
       600-SORT3-INPUT.
           PERFORM VARYING TAB-INDX FROM 1 BY 1 UNTIL TAB-INDX > 10
               RELEASE SORT-RECORD FROM TAB-ENTRY
           END-PERFORM.
       
       700-SORT3-OUTPUT.
           PERFORM VARYING TAB-INDX FROM 1 BY 1 UNTIL TAB-INDX > 10
               RETURN SORT-FILE INTO TAB-ENTRY
                   AT END DISPLAY 'Out Of Records In SORT File'
               END-RETURN
           END-PERFORM.
      