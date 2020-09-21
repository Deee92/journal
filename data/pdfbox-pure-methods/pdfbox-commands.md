From `/home/user/dev/pdfbox/app/target`

1. **Encrypt**: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar Encrypt -O 123 -U 123 /home/user/panktigen-workload/new-workload.pdf /home/user/panktigen-workload/new-workload-locked.pdf`
  - JaCoCo workload coverage: `java -javaagent:/home/user/dev/jacoco/lib/jacocoagent.jar -jar pdfbox-app-2.0.21.jar Encrypt -O 123 -U 123 /home/user/panktigen-workload/new-workload.pdf /home/user/panktigen-workload/new-workload-locked.pdf` 

2. **Decrypt**: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar Decrypt -password 123 /home/user/panktigen-workload/new-workload-locked.pdf /home/user/panktigen-workload/new-workload-unlocked.pdf`
  - JaCoCo workload coverage: `java -javaagent:/home/user/dev/jacoco/lib/jacocoagent.jar -jar pdfbox-app-2.0.21.jar Decrypt -password 123 /home/user/panktigen-workload/new-workload-locked.pdf /home/user/panktigen-workload/new-workload-unlocked.pdf`

3. **ExtractText**: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar ExtractText -password 123 -sort /home/user/panktigen-workload/new-workload-locked.pdf /home/user/panktigen-workload/new-workload-from-pdf.txt`
  - JaCoCo workload coverage: `java -javaagent:/home/user/dev/jacoco/lib/jacocoagent.jar -jar pdfbox-app-2.0.21.jar ExtractText -password 123 -sort /home/user/panktigen-workload/new-workload-locked.pdf /home/user/panktigen-workload/new-workload-from-pdf.txt`

4. **ExtractImages**: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar ExtractImages -password 123 -directJPEG /home/user/panktigen-workload/new-workload-locked.pdf`
  - JaCoCo workload coverage: `java -javaagent:/home/user/dev/jacoco/lib/jacocoagent.jar -jar pdfbox-app-2.0.21.jar ExtractImages -password 123 -directJPEG /home/user/panktigen-workload/new-workload-locked.pdf`

5. **PDFToImage**: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar PDFToImage -password 123 -imageType png -outputPrefix workloadAsImage -time /home/user/panktigen-workload/new-workload-locked.pdf`
  - JaCoCo workload coverage: `java -javaagent:/home/user/dev/jacoco/lib/jacocoagent.jar -jar pdfbox-app-2.0.21.jar PDFToImage -password 123 -imageType png -outputPrefix workloadAsImage -time /home/user/panktigen-workload/new-workload-locked.pdf`

6. **TextToPDF**: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar TextToPDF -standardFont Helvetica-BoldOblique -fontSize 18 /home/user/panktigen-workload/new-workload-from-txt.pdf /home/user/panktigen-workload/new-workload-from-pdf.txt`
  - JaCoCo workload coverage: `java -javaagent:/home/user/dev/jacoco/lib/jacocoagent.jar -jar pdfbox-app-2.0.21.jar TextToPDF -standardFont Helvetica-BoldOblique -fontSize 18 /home/user/panktigen-workload/new-workload-from-txt.pdf /home/user/panktigen-workload/new-workload-from-pdf.txt`

7. **PDFSplit**: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar PDFSplit -password 123 -split 1 /home/user/panktigen-workload/new-workload-locked.pdf`
  - JaCoCo workload coverage: `java -javaagent:/home/user/dev/jacoco/lib/jacocoagent.jar -jar pdfbox-app-2.0.21.jar PDFSplit -password 123 -split 1 /home/user/panktigen-workload/new-workload-locked.pdf`

8. **PDFMerger**: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar PDFMerger /home/user/panktigen-workload/new-workload-locked-*.pdf /home/user/panktigen-workload/new-workload-merged.pdf`
  - JaCoCo workload coverage: ` java -javaagent:/home/user/dev/jacoco/lib/jacocoagent.jar -jar pdfbox-app-2.0.21.jar PDFMerger /home/user/panktigen-workload/new-workload-locked-*.pdf /home/user/panktigen-workload/new-workload-merged.pdf`

9. **WriteDecodedDoc**: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar WriteDecodedDoc -password 123 /home/user/panktigen-workload/new-workload-locked.pdf /home/user/panktigen-workload/new-workload-decoded.pdf`
  - JaCoCo workload coverage: `java -javaagent:/home/user/dev/jacoco/lib/jacocoagent.jar -jar pdfbox-app-2.0.21.jar WriteDecodedDoc -password 123 /home/user/panktigen-workload/new-workload-locked.pdf /home/user/panktigen-workload/new-workload-decoded.pdf`

10. **OverlayPDF**: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar OverlayPDF /home/user/panktigen-workload/new-workload.pdf /home/user/panktigen-workload/overlay.pdf -position foreground /home/user/panktigen-workload/new-workload-overlaid.pdf`
  - JaCoCo workload coverage: `java -javaagent:/home/user/dev/jacoco/lib/jacocoagent.jar -jar pdfbox-app-2.0.21.jar OverlayPDF /home/user/panktigen-workload/new-workload.pdf /home/user/panktigen-workload/overlay.pdf -position foreground /home/user/panktigen-workload/new-workload-overlaid.pdf`

11. **TODO** PDFDebugger: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.21.jar PDFDebugger -password 123 -viewstructure false /home/user/panktigen-workload/new-workload-locked.pdf`
  - problem: CME for 23 - 28, 30, 53 - 56, 59 if no viewstructure?
  - fix: `-viewstructure false` ?

12. **TODO** PrintPDF:

---

#### JaCoCo workload coverage html:
` java -jar /home/user/dev/jacoco/lib/jacococli.jar report ./jacoco-encrypt.exec ./jacoco-decrypt.exec ./jacoco-extracttext.exec ./jacoco-extractimages.exec ./jacoco-pdftoimage.exec ./jacoco-texttopdf.exec ./jacoco-pdfsplit.exec ./jacoco-pdfmerger.exec ./jacoco-writedecodeddoc.exec ./jacoco-overlaypdf.exec --classfiles ../../fontbox/target/classes/org/ --classfiles ../../pdfbox/target/classes/org/ --classfiles ../../examples/target/classes/org --classfiles ../../tools/target/classes/org --classfiles ../../preflight/target/classes/org/ --classfiles ../../debugger/target/classes/org/ --classfiles ../../xmpbox/target/classes/org/ --sourcefiles ../../fontbox/src/main/java --sourcefiles ../../pdfbox/src/main/java/ --sourcefiles ../../examples/src/main/java/ --sourcefiles ../../tools/src/main/java/ --sourcefiles ../../preflight/src/main/java/ --sourcefiles ../../debugger/src/main/java/ --sourcefiles ../../xmpbox/src/main/java/ --html ./jacoco-report`

