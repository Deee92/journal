## Profling pure methods in PDFBox with async-profiler

All pure methods: https://github.com/Deee92/journal/blob/master/data/pdfbox-pure-methods/pdfbox-pure-methods.csv \
Criteria: https://github.com/Deee92/journal/blob/master/data/pdfbox-pure-methods/pdfbox-pure-analysis.ipynb \
Workload: [This](https://docs.google.com/document/d/1cWdjUHaX0TPBpqjmw0BEFEOZl-YneriwGGPzz1yFVGs/edit?usp=sharing) PDF

1. __Encrypt__
`java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar Encrypt -U 123 -O 123 -canAssemble false -canExtractContent false -canFillInForm false -canModify false -canPrint false /home/user/dev/workload.pdf /home/user/dev/workload-locked.pdf`

    1. _org.apache.pdfbox.pdfparser.BaseParser.isEndOfName(int)_
      - 1616 invocations, 1616 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-encrypt-baseparser-endofname-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isEndOfName,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar Encrypt -U 123 -O 123 -canAssemble false -canExtractContent false -canFillInForm false -canModify false -canPrint false /home/user/dev/workload.pdf /home/user/dev/workload-locked.pdf`
    2. _org.apache.pdfbox.pdfparser.BaseParser.isWhitespace(int)_
      - 1686 invocations, 1686 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-encrypt-baseparser-whitespace-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isWhitespace,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar Encrypt -U 123 -O 123 -canAssemble false -canExtractContent false -canFillInForm false -canModify false -canPrint false /home/user/dev/workload.pdf /home/user/dev/workload-locked.pdf`
    3. _org.apache.pdfbox.pdfparser.BaseParser.isCR(int)_
      - 58 invocations, 58 serialized triples
      - ` java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-encrypt-baseparser-cr-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isCR,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar Encrypt -U 123 -O 123 -canAssemble false -canExtractContent false -canFillInForm false -canModify false -canPrint false /home/user/dev/workload.pdf /home/user/dev/workload-locked.pdf`
    4. _org.apache.pdfbox.pdfparser.BaseParser.isLF(int)_
      - 58 invocations, 58 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-encrypt-baseparser-lf-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isLF,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar Encrypt -U 123 -O 123 -canAssemble false -canExtractContent false -canFillInForm false -canModify false -canPrint false /home/user/dev/workload.pdf /home/user/dev/workload-locked.pdf`
  
2. __Decrypt__
`java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar Decrypt -password 123 /home/user/dev/workload-locked.pdf /home/user/dev/workload-unlocked.pdf`

    1. _org.apache.pdfbox.pdmodel.encryption.AccessPermission.isPermissionBitOn(int)_
      - 8 invocations, 8 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-decrypt-accesspermission-permissionbiton-1ns-%t.html,event=org.apache.pdfbox.pdmodel.encryption.AccessPermission.isPermissionBitOn,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar Decrypt -password 123 /home/user/dev/workload-locked.pdf /home/user/dev/workload-unlocked.pdf`
    2. _org.apache.pdfbox.pdfparser.BaseParser.isEndOfName(int)_
      - 1465 invocations, 1465 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-decrypt-baseparser-endofname-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isEndOfName,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar Decrypt -password 123 /home/user/dev/workload-locked.pdf /home/user/dev/workload-unlocked.pdf`
    3. _org.apache.pdfbox.pdfparser.BaseParser.isWhitespace(int)_
      - 1548 invocations, 1548 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-decrypt-baseparser-whitespace-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isWhitespace,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar Decrypt -password 123 /home/user/dev/workload-locked.pdf /home/user/dev/workload-unlocked.pdf`
    4. _org.apache.pdfbox.pdfparser.BaseParser.isCR(int)_
      - 51 invocations, 51 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-decrypt-baseparser-cr-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isCR,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar Decrypt -password 123 /home/user/dev/workload-locked.pdf /home/user/dev/workload-unlocked.pdf`
    5. _org.apache.pdfbox.pdfparser.BaseParser.isLF(int)_
      - 51 invocations, 51 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-decrypt-baseparser-lf-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isLF,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar Decrypt -password 123 /home/user/dev/workload-locked.pdf /home/user/dev/workload-unlocked.pdf`
    
3. __ExtractImages__
`java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`

    1. _org.apache.pdfbox.pdmodel.encryption.AccessPermission.isPermissionBitOn(int)_
      - 1 invocation, 1 serialized triple
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extractimages-accesspermission-permissionbiton-1ns-%t.html,event=org.apache.pdfbox.pdmodel.encryption.AccessPermission.isPermissionBitOn,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`
    2. _org.apache.fontbox.cmap.CMapParser.isWhitespaceOrEOF(int)_
      - 1802 invocations, 1802 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extractimages-cmapparser-whitespaceoreof-1ns-%t.html,event=org.apache.fontbox.cmap.CMapParser.isWhitespaceOrEOF,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`
    3. _org.apache.fontbox.cmap.CMapParser.isDelimiter(int)_
      - 528 invocations, 528 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extractimages-cmapparser-delimiter-1ns-%t.html,event=org.apache.fontbox.cmap.CMapParser.isDelimiter,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`
    4. _org.apache.pdfbox.pdfparser.BaseParser.isEndOfName(int)_
      - 1659 invocations, 1659 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extractimages-baseparser-endofname-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isEndOfName,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`
    5. _org.apache.pdfbox.pdfparser.BaseParser.isWhitespace(int)_
      - 4158 invocations, 4158 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extractimages-baseparser-whitespace-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isWhitespace,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`
    6. _org.apache.pdfbox.pdfparser.BaseParser.isCR(int)_
      - 51 invocations, 51 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extractimages-baseparser-cr-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isCR,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`
    7. _org.apache.fontbox.cmap.CodespaceRange.isFullMatch(byte[], int)_
      - 36 invocations, 36 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extractimages-codespacerange-fullmatch-1ns-%t.html,event=org.apache.fontbox.cmap.CodespaceRange.isFullMatch,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`
    8. _org.apache.pdfbox.pdfparser.BaseParser.isLF(int)_
      - 51 invocations, 51 serialized triples
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extractimages-baseparser-lf-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isLF,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`
    9. _org.apache.pdfbox.pdfparser.BaseParser.isClosing(int)_
      - 460 invocations, 460 serialized objects
      - `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extractimages-baseparser-closing-1ns-%t.html,event=org.apache.pdfbox.pdfparser.BaseParser.isClosing,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`

