## Instrumentation and profiling data for a public pure method in PDFBox

__Class__: org.apache.fontbox.cmap.CodespaceRange

__Source__: https://github.com/apache/pdfbox/blob/2.0.20/fontbox/src/main/java/org/apache/fontbox/cmap/CodespaceRange.java

__Test__: https://github.com/apache/pdfbox/blob/2.0.20/fontbox/src/test/java/org/apache/fontbox/cmap/TestCodespaceRange.java

__Method__:
```
public boolean isFullMatch(byte[] code, int codeLen)
    {
        // code must be the same length as the bounding codes
        if (codeLength != codeLen)
        {
            return false;
        }
        for (int i = 0; i < codeLength; i++)
        {
            int codeAsInt = code[i] & 0xFF;
            if (codeAsInt < start[i] || codeAsInt > end[i])
            {
                return false;
            }
        }
        return true;
    }
```

__Tags__: `{loops=true, multiple_statements=true, conditionals=false, local_variables=true, returns_primitives=true, static=false, ifs=true, switches=false, returns=true, parameters=true}`

__PDFBox documentation__: https://pdfbox.apache.org/2.0/commandline.html

__Workload__: [This](https://docs.google.com/document/d/1cWdjUHaX0TPBpqjmw0BEFEOZl-YneriwGGPzz1yFVGs/edit?usp=sharing) PDF

__Number of invocations__: 36

__Unique triples__ of receiving objects, parameters, returned objects (Same for both ExtractText and ExtractImages):

<table>
<thead>
  <tr>
    <th>#</th>
    <th>occurrences</th>
    <th>receiving-object</th>
    <th>param1</th>
    <th>param2</th>
    <th>returned-object</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td>1</td>
    <td>1</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;ACs=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>2</td>
    <td>2</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AEg=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>3</td>
    <td>4</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AE8=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>4</td>
    <td>5</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AFI=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>5</td>
    <td>2</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AA8=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>6</td>
    <td>10</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AAM=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>7</td>
    <td>2</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AFo=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>8</td>
    <td>2</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AFU=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>9</td>
    <td>3</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AEc=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>10</td>
    <td>2</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AAQ=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>11</td>
    <td>1</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;ACo=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>12</td>
    <td>1</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AFw=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
  <tr>
    <td>13</td>
    <td>1</td>
    <td><pre>&lt;org.apache.fontbox.cmap.CodespaceRange&gt;
  &lt;start&gt;
    &lt;int&gt;0&lt;/int&gt;
    &lt;int&gt;0&lt;/int&gt;
  &lt;/start&gt;
  &lt;end&gt;
    &lt;int&gt;255&lt;/int&gt;
    &lt;int&gt;255&lt;/int&gt;
  &lt;/end&gt;
  &lt;codeLength&gt;2&lt;/codeLength&gt;
&lt;/org.apache.fontbox.cmap.CodespaceRange&gt;</pre></td>
    <td><pre>&lt;byte-array&gt;AEU=&lt;/byte-array&gt;</pre></td>
    <td><pre>&lt;int&gt;2&lt;/int&gt;</pre></td>
    <td><pre>&lt;boolean&gt;true&lt;/boolean&gt;</pre></td>
  </tr>
</tbody>
</table>


__Three (manually) generated test cases__: https://github.com/Deee92/journal/blob/master/data/sample-tests/TestCodespaceRange2.java

## ExtractText

`java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar ExtractText -password 123 -sort /home/user/dev/workload-locked.pdf /home/user/dev/workload-from-pdf.txt`

__Profiling__: `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extracttext-codespacerange-fullmatch-1ns-%t.html,event=org.apache.fontbox.cmap.CodespaceRange.isFullMatch,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractText -password 123 -sort /home/user/dev/workload-locked.pdf /home/user/dev/workload-from-pdf.txt`

__Call stack__: 
```
[0] 100.00% 36 self: 0.00% 0 [main tid=418377]
[1] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.tools.PDFBox.main
[2] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.tools.ExtractText.main
[3] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.tools.ExtractText.startExtraction
[4] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.tools.ExtractText.extractPages
[5] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.text.PDFTextStripper.writeText
[6] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.text.PDFTextStripper.processPages
[7] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.text.PDFTextStripper.processPage
[8] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage
[9] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.processPage
[10] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.processStream
[11] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.processStreamOperators
[12] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.processOperator
[13] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.operator.text.ShowText.process
[14] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.showTextString
[15] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.showText
[16] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.pdmodel.font.PDType0Font.readCode
[17] 100.00% 36 self: 0.00% 0 org.apache.fontbox.cmap.CMap.readCode
[18] 100.00% 36 self: 100.00% 36 org.apache.fontbox.cmap.CodespaceRange.isFullMatch
```

## ExtractImages

`java -javaagent:/home/user/glowroot/glowroot.jar -jar pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`

__Profiling__: `java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -agentpath:/home/user/dev/async-profiler/build/libasyncProfiler.so=start,tree,file=/home/user/dev/async-profiler/pdfbox-profiling/threads-pdfbox-extractimages-codespacerange-fullmatch-1ns-%t.html,event=org.apache.fontbox.cmap.CodespaceRange.isFullMatch,interval=1,alluser,dot,threads,framebuf=5000000 -jar /home/user/dev/pdfbox/app/target/pdfbox-app-2.0.20.jar ExtractImages -password 123 -directJPEG /home/user/dev/workload-locked.pdf`

__Call stack__:

```
[0] 100.00% 36 self: 0.00% 0 [main tid=414760]
[1] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.tools.PDFBox.main
[2] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.tools.ExtractImages.main
[3] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.tools.ExtractImages.run
[4] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.tools.ExtractImages.extract
[5] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.tools.ExtractImages$ImageGraphicsEngine.run
[6] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.processPage
[7] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.processStream
[8] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.processStreamOperators
[9] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.processOperator
[10] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.operator.text.ShowText.process
[11] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.showTextString
[12] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.contentstream.PDFStreamEngine.showText
[13] 100.00% 36 self: 0.00% 0 org.apache.pdfbox.pdmodel.font.PDType0Font.readCode
[14] 100.00% 36 self: 0.00% 0 org.apache.fontbox.cmap.CMap.readCode
[15] 100.00% 36 self: 100.00% 36 org.apache.fontbox.cmap.CodespaceRange.isFullMatch
```
