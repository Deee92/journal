From `/home/user/dev/pdfbox/app/target`

1. Encrypt: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar Encrypt -O 123 -U 123 /home/user/panktigen-workload/new-workload.pdf /home/user/panktigen-workload/new-workload-locked.pdf`
2. Decrypt: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar Decrypt -password 123 /home/user/panktigen-workload/new-workload-locked.pdf /home/user/panktigen-workload/new-workload-unlocked.pdf`
3. ExtractText: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar ExtractText -password 123 -sort /home/user/panktigen-workload/new-workload-locked.pdf /home/user/panktigen-workload/new-workload-from-pdf.txt`
4. ExtractImages: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/panktigen-workload/new-workload-locked.pdf`
5. PDFToImage: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar PDFToImage -password 123 -imageType png -outputPrefix workloadAsImage -time /home/user/panktigen-workload/new-workload-locked.pdf`
6. TextToPDF: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar TextToPDF -standardFont Helvetica-BoldOblique -fontSize 18 /home/user/panktigen-workload/new-workload-from-txt.pdf /home/user/panktigen-workload/new-workload-from-pdf.txt`
7. PDFSplit: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar PDFSplit -password 123 -split 1 /home/user/panktigen-workload/new-workload-locked.pdf`
8. PDFMerger: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar PDFMerger /home/user/panktigen-workload/new-workload-locked-*.pdf /home/user/panktigen-workload/new-workload-merged.pdf`
9. WriteDecodedDoc: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar WriteDecodedDoc -password 123 /home/user/panktigen-workload/new-workload-locked.pdf /home/user/panktigen-workload/new-workload-decoded.pdf`
10. OverlayPDF: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar OverlayPDF /home/user/panktigen-workload/new-workload.pdf /home/user/panktigen-workload/overlay.pdf -position foreground /home/user/panktigen-workload/new-workload-overlaid.pdf`
11. **TODO** PDFDebugger: `java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar PDFDebugger -password 123 -viewstructure false /home/user/panktigen-workload/new-workload-locked.pdf`
  - problem: CME for 23 - 28, 30, 53 - 56, 59 if no viewstructure?
  - fix: `-viewstructure false` ?
12. **TODO** PrintPDF:

