package org.apache.pdfbox.pdfparser;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestCOSParserPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setupXStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void testLastIndexOf1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf1.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2028</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>startxref</char-array><byte-array>cbPxR0jlvHzSSFbu3zOTymc4/acnuTuYecI0v849kvnDy6l88kh/nre8w6BO9Od6y/2GykurtjB2RzVS/fzmDkaTqzqYKpJWJoif9uwgxmwrb08Qfr+Vt1dXU2z04qLYovARtvxRpedAXZDen1xsn3Cif135pCr/U4nV/iwRUBOry/13id/+7GD/ZKfKSnewL4VXXbVDGsH+WTZRpEsjSquryzvYVE2PnOxL6GHFfKnpGZPIKfTIaUwK6K0P6KXifeilCA96JhOlanqpJpOmJzOht6Ulpax0S0qKphPjpBZNpyXG2Vtnfyp0UlM1nehW2q/p7I9uFTr+EZqK3Q6VJLumwuLJrqnYWbymMvUnlcygyi09KrdoNUnsJx17QMd67IyO9Rh0vBfqGkZ6vWzrsOqZNeJ3U3XusgZInf/WxY2x/tYZTueWmdXBH1R56mbMbBR+fYO/2t1Q6p/pLnVuGVZzjuwakT3MXbqFasomV22p8TWUtg/zDStz15dWbx1dmZPbp65beurKqTxHYZWisBxR1+jcc2TniuzRoq5cUVeuqGu0b7RWF2lrvLJqi5FGVpfUBPytPMSM9VqX4KoeGa00jdAW7zBX7PKEnbiQPEkh3mq/xT3Sb4WIrAHFA4pFFvaUyAoVP44LZsUuH+ZK2MmeDGYpSLa5R5J30VUtV1Fs2ZzSwF8LHJIWXSUGPEBvy/kc8sr8vvrSlkX4qOxPn1TuL5owrWqLwYDUOtElf8GZtJCQsg51TyBxIBILRKIk9SiKtEKRZjIFFX8+/1cF/RKxC1r5c1uZL4nhzlot+ZPKJ3OYgsnBXyHtxHVJHA8t1ehgC/OyljNlaM2mQJhEf8/IoquCoeA4LAr6gbfwSsuZ4ehxeAem6r8AnyPXfmVuZHN0cmVhbQplbmRvYmoKMTIgMCBvYmoKPDwgL0ZpbHRlciAvRmxhdGVEZWNvZGUgL0xlbmd0aCAyODEgPj4Kc3RyZWFtCnicXZHbaoQwEEDf8xXzuH1YvKyXLohQLAs+9EJtP0CT0QZqDDE++PeNGddCAxqOM2cyToKqfq6VtBC8m4k3aKGXShicp8VwhA4HqVgUg5Dc7uTffGw1C5zcrLPFsVb9xIoCIPhw0dmaFU5PYurwgQVvRqCRaoDTV9U4bhatf3BEZSFkZQkCe1fppdWv7YgQeO1cCxeXdj075y/jc9UIseeIuuGTwFm3HE2rBmRF6FYJxc2tkqES/+I5WV3Pv1vjsy8uOwzjsNwoTjwlEVFOlBBdiTJPF/JS8hLyMvKSR6LUd7CfFd9PPhpNbvcSPrvybprSx8xvebyXIGn7n23ux7D4Yoybk78cP6BtNFLhcX960pu1Pb8DV5DnZW5kc3RyZWFtCmVuZG9iagoxMyAwIG9iago8PCAvVHlwZSAvT2JqU3RtIC9MZW5ndGggNjMyIC9GaWx0ZXIgL0ZsYXRlRGVjb2RlIC9OIDkgL0ZpcnN0IDYxID4+CnN0cmVhbQp4nMVUTW/aQBC991fMMTng3dnvlaJIEJoGVUlRSJtDxMHBW2rV2Mh2pPLvO2sCJmnSqlWrCoHlnTfzZt68BRVwQA0SAQ1oDWgBHb04kFwAepDKgOCgrQBB5xzpSQEh1ZuTE2DTusoeFqGGo9nXPGXT8TmsnD2G09MuPLoEdlXVq7QAtkgB9+dpE86rsgU2rPO0GIyqIru8ATYOzSKUWVq2MdrAXeTmcA1zYG/LRZXl5RLYJAtlm7ebwQWw2cN9u1kHYDf0y+lRfSxzAgbqtcvsAsA6tpfZXyEWf0wsXiM+qx7oBYG9z7PIYXYUW+g0XYZmhx3GhlrwXCfCSqUoO11fhHz5pQWLOnGC09YeG29hIBATj4oboizSZQNqyz0aVd+IamCETbzwxsNAWpMoo5widaVMDKWRWsomTqM2sZ+YeJ4XQYDfzhIPrtJVeL6wSZsW+WJYLotAQDZrw+oTUHm06Kw+1CA2Wufrtqp/ZYKzyXi2aajSpPxcQUR+qLNQxw0c7TZwDOw6LPOmrTdwNMyq+3AcV7JeF2EV5eBE0lW6qd5Nxpfpul8eaXYbe33WFD5Out8rJUdInEA8WSa7JT05fa2OFuMgLEknSUuSjq7RHUhSlXNLF2kO0kekEAka6y2hDXJCe1J/DhpBKzDGJN4L6sA4gtI9JAE1XTGw8km1PvWQlB8k9KfOeaLkGPdJqU4eZDsdy+4BfXpPtZ2sj8zp86+caVSiNbGSM4VKLLfUvuDCJd0gyKVNkHvpnjoT8UVrvupKRZ3R8FTmd1z5/wwp8K8YUkZD9g6L4Z+48RA6/9GOvvtj3GW7A5tvLbU/0JzvLPMdkTay82VuZHN0cmVhbQplbmRvYmoKMSAwIG9iago8PCAvVHlwZSAvWFJlZiAvTGVuZ3RoIDE2IC9GaWx0ZXIgL0ZsYXRlRGVjb2RlIC9EZWNvZGVQYXJtcyA8PCAvQ29sdW1ucyA0IC9QcmVkaWN0b3IgMTIgPj4gL1cgWyAxIDIgMSBdIC9TaXplIDIgL0lEIFs8MTA1ZGMwOWZmZjJjZDljYjhlMjc4ZjQ5NTUzYmM2ZmM+PDEwNWRjMDlmZmYyY2Q5Y2I4ZTI3OGY0OTU1M2JjNmZjPl0gPj4Kc3RyZWFtCnicY2IAAibGXFYGAAF9AHgKZW5kc3RyZWFtCmVuZG9iagogICAgICAgICAgICAgICAKc3RhcnR4cmVmCjIxNgolJUVPRgo=</byte-array><int>2042</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf2.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2028</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>startxref</char-array><byte-array>7yN++D6CQgpD+PV8JfXBh1gVDFe2/djH7me3tLmeshf2ZjdTMlZROxtGLpaKMIeaZXwoJVlFOISS+CMIs9qSJuGxyDZXun0z6yGe2mj/MemI/dMkP4f6SdJT9rc1v8ra7G8h5ZGN9t1J19pfzvRbkbLF5WcINmvSdFNSjv3R7dJ0KTLWttmXiGCj/dKkEfYLk2RGfSDj/GbEPJH28a5z7CNRXknSVLunGWVutBcknW/PC1gNFc9stA9EE9wBNQ2N7Z8kK3UmywInZvtZgyfdssZSZRljOd2SZUm3OCx2Sx9LoqWXNdpqs/awhltDrVar2apauZWsvfzGAY9bbDR6mW0iMKuCqtRtnORvx3IfwpmV05mk91TKefmEIlaud9RS+VRN/26C089CsWE2OYuYHl1O5ZVFeo673G8xxuvZ7nLdMvbcqlbGrvciVefX+Bl2u35miKRlieJouokYi1p2XaIIT1t2nddLcTHzC+IKovOjhpWV/A6qg3T/esV10/voa8onVOkP9/HqWUIx+njL9RvF2XUT+5odLy3ZxL4Sgbdqk5LPvi4dL9KV/BKvt9zPJkk70thXsMOI+UraWZNJE3akWZMDdmsDdql4HnYpIoAdtqep0i41JETaqUzYtTanlJa0pqRIm1iNmqVNc6x2qs32VNikpkqbGB9tlzbbY3zCRs+XJklJMElOkiYsgZKkSRJLkCaTfjXJDJpc22VyraxJYb/aJAVsIg6ctIk4ABv3n73qi9xu1j7cWztZnPurnaX1kGp9+fyGON03VdNaa73BHwRc1VNrG0RYU697nfUleq2zRGsdPvl3sieL7OHOklZsoCurWid76kvahnuGlzprSrztI8YOye5W17VddQ0Z+zuFjRWFDRF1jcj+nexskT1C1JUt6soWdY3wjJB1kRzjY6tarVTkxTFThu08LBTjtTrR4S2KsTXly8E73BG3JHEzNiTrKQyn7nBnkR4BEVkZhRmFIgtzSmT1ED/uBLPilgx3JG5m64NZNiRHOYvIPXde8zyKK51eEvjXjAtJc+eJDg/Q3fxHF/JKdU9NSfNcHEf0tAnlegHOta0WC1KrxSvpuSfTwsJKcbwMJA5AYq5IVJQuQ5GWJ9JCQoKGv/3+84JhsZgFPv5UO/MkM+xZvYqeXF7J4Qoqg6fozdguieWh2YsXbGZu1nyyDNlsCugk3vekzJ0X1IL9MDcYBp7CI80nu6PrwjNwVf8FmKSL4WVuZHN0cmVhbQplbmRvYmoKMTAgMCBvYmoKPDwgL0ZpbHRlciAvRmxhdGVEZWNvZGUgL0xlbmd0aCAyMjMgPj4Kc3RyZWFtCnicXZBNasQwDIX3PoWW08VgT7oNgTKlkEV/aNoDOLaSGhrZKM4it6/shilUYIP83ieepa/9Y08hg37j6AbMMAXyjGvc2CGMOAdSlwZ8cPno6u0Wm5QWeNjXjEtPU1RtC6DfRV0z73B68HHEO6Vf2SMHmuH0eR2kH7aUvnFBymBU14HHSSY92/RiFwRdsXPvRQ95Pwvz5/jYE0JT+8tvGhc9rsk6ZEszqtZIddA+SXUKyf/TD2qc3Jfl6r4XtzGNqe7jvXDlf7dQbmOWPHUJNUiJEAhve0oxFaqcH0BjbzllbmRzdHJlYW0KZW5kb2JqCjExIDAgb2JqCjw8IC9UeXBlIC9PYmpTdG0gL0xlbmd0aCA0MzAgL0ZpbHRlciAvRmxhdGVEZWNvZGUgL04gNiAvRmlyc3QgMzggPj4Kc3RyZWFtCnicfVHLbtswELz3K+ZoHyw+RIkyEASw47oxCidG7DaHIAfGYlSisihINFD/fZdy3KQ9FHpB3Nmd2RkhwSFSpAJCIcsg6NY5RA4pqaKhlPh0dQW26Xx53NsOo+1PZ9hmscShyMe4vh7K8zXYne8OpgbbG4g/56a3S98EsFnnTL3egS1sv7dNaZoQCz2eIg3HA57BPjd7X7qmAluVtgkunCa3YNvjSzi1FmxHb04f/61xBLQQfOgcCmAD0RvxjT/SjwD76srIkV8oztCNqWx/wc6ioIApzxKpU6Wo27S31lU/ArTIkkJyMuhNeMBECpFMheI5Udam6qHO3PO5/0VUkzxXSZZxXWCSSpVornkKyWWRpDSJRKc6EXyaFlFPbFy62kpMz7vEgztzsB8sWwVTu/2sqWpLGLYN9vAdioRNC0VTPqwfNXauDb77TwI3q8X21NOQVfPqEUH3XWm76Pvo4vsY7MFWrg/dCaNZ6V/sOAbRtrU9RBM4zR8m7fyX1WJt2vfIyKnHKPMfPeIcwXua1BwhUbz8K0L2SC5yenQW8+WQWifF4N0zXbTYb23MxBhlbmRzdHJlYW0KZW5kb2JqCjEgMCBvYmoKPDwgL1R5cGUgL1hSZWYgL0xlbmd0aCAxNyAvRmlsdGVyIC9GbGF0ZURlY29kZSAvRGVjb2RlUGFybXMgPDwgL0NvbHVtbnMgNSAvUHJlZGljdG9yIDEyID4+IC9XIFsgMSAzIDEgXSAvU2l6ZSAyIC9JRCBbPGI3ZTQ1YzY4MmNiNTg3OGYxZGRiYzg2ODk3ZTJhMGRmPjxiN2U0NWM2ODJjYjU4NzhmMWRkYmM4Njg5N2UyYTBkZj5dID4+CnN0cmVhbQp4nGNiAAEmRiZXBQYAAUwAbQplbmRzdHJlYW0KZW5kb2JqCiAgICAgICAgICAgICAgICAKc3RhcnR4cmVmCjIxNgolJUVPRgo=</byte-array><int>2042</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf3.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2042</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>%%EOF</char-array><byte-array>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</byte-array><int>2048</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf4.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2042</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>%%EOF</char-array><byte-array>vlYo0a000Dcjt99Vl1KCT+HlQCFAGmF4o5eRbJv7oqabwZZ4KeCuY1+VQNvdgDWnwVrXOEz9rODyCpfOE8kp1Z6Q/y2FksefRp8bqt468z09ZGhTjuz0FmAtVAPTUgNUvV+AnXuWkAMGQ9MffIwFVr3zDn7uGtyYJQCqZlD/73ULeFBrBw3ghAc8JEV50SGajbt24syLyaBMV0MKbBzSHsh2UCexq8V1YpZQ9WjxSsEZpVUNt5pgde+bFOzzkqZNnJooGiHoUk23t636EfW51hq3fcGmD8wa4ZcJHnwctxCl1DhyNp5M1gJpkj55OjUuZ/o2IwL9mzeAjCRAgY/PJ1iRs5gUsoSRPuJ7V8Km7/JAsUfzfVBkI2nO3dEqVA3Ihz4M7I6rSc3pHjIlErrGobIXEoWcifpVtCR2JuR6JgjKCNzyJPSEqxfJpW02ZICmyUXs6iQOCvMDEnytL4NXXXbfwHSEzAI08FIRC6PRdW5nh22OQdIUflG3gZ9fO3SJ+lmYX8LThE9/plabeT45Gw0KTQ0P0h3ZWSvtH0jF1hJ4KOQNPCds1bw6K7sZjbrG5aSTWZMgOnDeGM0qD5woe9s+q62Q1iQ6aXQhc9iUuQ3fj04cljvUsA79LrYi4UHr/fRTw41ksmES18tYVsLrPDUHx2HY241M0ek1fJOwLi0HpZC7bRD6XBBnM4CqO4PjXlrDyuvY+CMRJK0ZbxYjWYZG8eX3bc7Db2UO5S3boPWonyZaeQsPz/94R9pzpsTYIzUGXAwaQ0N1mI/Jf0bQV9GjXLAEoWI0ekL/weYk3j9s4WUPF2oHuFGFPQ4bE1R1rxNGuLvCGj58fmTH5kVknXfjjfgETbW3c40iVyen8ITbfgDnRl+N2nJOdyX1Japx2RUPj9DHyXqk2j6cDmLdQt0MH+b5+bJ6oDK1NkD4F4v0uJRFgjQTAuxvwOzBL3K/JjzQgcsNWHKp8hPpc7sL/NWtuxRpvWehP7NciMLVkf6QdBLYlzoij6rUjexM6rko6RtET/59asQqWT689SzL+Kozz3aEUBKBBwB/+dxyXeJn4t0Mk9nwU2/9SP0C6zH3l6KFc59rfqLV6aT71jDTYhnlWFOCd/KguP4VUKJX97ApVXKewUfOqbq71W1EiaSJiBI1bDIC8FqR/th7jMknYIyNW6tbNJgZuWpXcXKQG4izdJhmtKr+5aX6Hfl+uNyKJf89AfksWuZnN6ta3DUo7r92+N7uSDbgRWL7pstN18oaXYcQwLdLAyDUNVpYWCtNKzvD/f5jp5V5sWTXIkTlYSFiQAx3W/7DlVPrwGF5960PYrQddc6LXb1XzqpJw6+19xj/Vzt+lCmMa2imh7y/1cdFGWMqvPiIHls6L15eY8stW4UmatY1jTU7cjB8nuwwcqSWUktdbd5/KeQeaCLar0u2kG1wDZidYYkgg7Ilb2KV0NUJXLYhq9pjTiRFSX0zfz0ODV0lg3HDnyMreKjO74rbrRGjA3rQE4gFGVepMy/xbp5Tp1v6Gwgc30VWDmQNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDwyRjQ2REIyM0IxMzk4QkQxRTdGMDJEQzQ0ODNEM0M4MUZCREY4NDdCNzg4NTVERDVGQkVFMjNCOEVFRjU3OERBNUI1NjhBNDMxODk1NzVFOTQ1QzAzQ0M4QUNBNzVCNUE+Ci9VRSA8RDcyQUJGMjI4OUVDMTBEMDE5ODZFRkM2OEZBNDVGQTMxNDBFOTFGMUJBQUFCRjNEM0JCM0IxNzQ1RjZFRDIxRj4KL08gPDU0MUVFQUI3MUM1NzcxNjFBNjJGNzlENERCRjQyQTBFN0EwODlBRTVCMkJBRENGQ0Q5NDBBQTk1REI4Qzc5ODc5Q0VCNDFERUFCRjQyMjZCODY1QzZGN0UzMUM2NzQ2Nz4KL09FIDwzMTU4RDQzQTM5NDcyRTk2NTJFNzc5QzA2MUQ3QThGNTgxMDc5NTEzMjRCQzQ4QjQ0MDU4M0QxOEI3OTIyNEZFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDxGRjBDQkY1N0I1QjYzRjdFODRDN0I4OTMzRTFENzhGOT4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array><int>2048</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf5.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2028</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>startxref</char-array><byte-array>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</byte-array><int>2042</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf6.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2025</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>startxref</char-array><byte-array>vlYo0a000Dcjt99Vl1KCT+HlQCFAGmF4o5eRbJv7oqabwZZ4KeCuY1+VQNvdgDWnwVrXOEz9rODyCpfOE8kp1Z6Q/y2FksefRp8bqt468z09ZGhTjuz0FmAtVAPTUgNUvV+AnXuWkAMGQ9MffIwFVr3zDn7uGtyYJQCqZlD/73ULeFBrBw3ghAc8JEV50SGajbt24syLyaBMV0MKbBzSHsh2UCexq8V1YpZQ9WjxSsEZpVUNt5pgde+bFOzzkqZNnJooGiHoUk23t636EfW51hq3fcGmD8wa4ZcJHnwctxCl1DhyNp5M1gJpkj55OjUuZ/o2IwL9mzeAjCRAgY/PJ1iRs5gUsoSRPuJ7V8Km7/JAsUfzfVBkI2nO3dEqVA3Ihz4M7I6rSc3pHjIlErrGobIXEoWcifpVtCR2JuR6JgjKCNzyJPSEqxfJpW02ZICmyUXs6iQOCvMDEnytL4NXXXbfwHSEzAI08FIRC6PRdW5nh22OQdIUflG3gZ9fO3SJ+lmYX8LThE9/plabeT45Gw0KTQ0P0h3ZWSvtH0jF1hJ4KOQNPCds1bw6K7sZjbrG5aSTWZMgOnDeGM0qD5woe9s+q62Q1iQ6aXQhc9iUuQ3fj04cljvUsA79LrYi4UHr/fRTw41ksmES18tYVsLrPDUHx2HY241M0ek1fJOwLi0HpZC7bRD6XBBnM4CqO4PjXlrDyuvY+CMRJK0ZbxYjWYZG8eX3bc7Db2UO5S3boPWonyZaeQsPz/94R9pzpsTYIzUGXAwaQ0N1mI/Jf0bQV9GjXLAEoWI0ekL/weYk3j9s4WUPF2oHuFGFPQ4bE1R1rxNGuLvCGj58fmTH5kVknXfjjfgETbW3c40iVyen8ITbfgDnRl+N2nJOdyX1Japx2RUPj9DHyXqk2j6cDmLdQt0MH+b5+bJ6oDK1NkD4F4v0uJRFgjQTAuxvwOzBL3K/JjzQgcsNWHKp8hPpc7sL/NWtuxRpvWehP7NciMLVkf6QdBLYlzoij6rUjexM6rko6RtET/59asQqWT689SzL+Kozz3aEUBKBBwB/+dxyXeJn4t0Mk9nwU2/9SP0C6zH3l6KFc59rfqLV6aT71jDTYhnlWFOCd/KguP4VUKJX97ApVXKewUfOqbq71W1EiaSJiBI1bDIC8FqR/th7jMknYIyNW6tbNJgZuWpXcXKQG4izdJhmtKr+5aX6Hfl+uNyKJf89AfksWuZnN6ta3DUo7r92+N7uSDbgRWL7pstN18oaXYcQwLdLAyDUNVpYWCtNKzvD/f5jp5V5sWTXIkTlYSFiQAx3W/7DlVPrwGF5960PYrQddc6LXb1XzqpJw6+19xj/Vzt+lCmMa2imh7y/1cdFGWMqvPiIHls6L15eY8stW4UmatY1jTU7cjB8nuwwcqSWUktdbd5/KeQeaCLar0u2kG1wDZidYYkgg7Ilb2KV0NUJXLYhq9pjTiRFSX0zfz0ODV0lg3HDnyMreKjO74rbrRGjA3rQE4gFGVepMy/xbp5Tp1v6Gwgc30VWDmQNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDwyRjQ2REIyM0IxMzk4QkQxRTdGMDJEQzQ0ODNEM0M4MUZCREY4NDdCNzg4NTVERDVGQkVFMjNCOEVFRjU3OERBNUI1NjhBNDMxODk1NzVFOTQ1QzAzQ0M4QUNBNzVCNUE+Ci9VRSA8RDcyQUJGMjI4OUVDMTBEMDE5ODZFRkM2OEZBNDVGQTMxNDBFOTFGMUJBQUFCRjNEM0JCM0IxNzQ1RjZFRDIxRj4KL08gPDU0MUVFQUI3MUM1NzcxNjFBNjJGNzlENERCRjQyQTBFN0EwODlBRTVCMkJBRENGQ0Q5NDBBQTk1REI4Qzc5ODc5Q0VCNDFERUFCRjQyMjZCODY1QzZGN0UzMUM2NzQ2Nz4KL09FIDwzMTU4RDQzQTM5NDcyRTk2NTJFNzc5QzA2MUQ3QThGNTgxMDc5NTEzMjRCQzQ4QjQ0MDU4M0QxOEI3OTIyNEZFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDxGRjBDQkY1N0I1QjYzRjdFODRDN0I4OTMzRTFENzhGOT4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array><int>2042</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf7.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2042</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>%%EOF</char-array><byte-array>vlYo0a000Dcjt99Vl1KCT+HlQCFAGmF4o5eRbJv7oqabwZZ4KeCuY1+VQNvdgDWnwVrXOEz9rODyCpfOE8kp1Z6Q/y2FksefRp8bqt468z09ZGhTjuz0FmAtVAPTUgNUvV+AnXuWkAMGQ9MffIwFVr3zDn7uGtyYJQCqZlD/73ULeFBrBw3ghAc8JEV50SGajbt24syLyaBMV0MKbBzSHsh2UCexq8V1YpZQ9WjxSsEZpVUNt5pgde+bFOzzkqZNnJooGiHoUk23t636EfW51hq3fcGmD8wa4ZcJHnwctxCl1DhyNp5M1gJpkj55OjUuZ/o2IwL9mzeAjCRAgY/PJ1iRs5gUsoSRPuJ7V8Km7/JAsUfzfVBkI2nO3dEqVA3Ihz4M7I6rSc3pHjIlErrGobIXEoWcifpVtCR2JuR6JgjKCNzyJPSEqxfJpW02ZICmyUXs6iQOCvMDEnytL4NXXXbfwHSEzAI08FIRC6PRdW5nh22OQdIUflG3gZ9fO3SJ+lmYX8LThE9/plabeT45Gw0KTQ0P0h3ZWSvtH0jF1hJ4KOQNPCds1bw6K7sZjbrG5aSTWZMgOnDeGM0qD5woe9s+q62Q1iQ6aXQhc9iUuQ3fj04cljvUsA79LrYi4UHr/fRTw41ksmES18tYVsLrPDUHx2HY241M0ek1fJOwLi0HpZC7bRD6XBBnM4CqO4PjXlrDyuvY+CMRJK0ZbxYjWYZG8eX3bc7Db2UO5S3boPWonyZaeQsPz/94R9pzpsTYIzUGXAwaQ0N1mI/Jf0bQV9GjXLAEoWI0ekL/weYk3j9s4WUPF2oHuFGFPQ4bE1R1rxNGuLvCGj58fmTH5kVknXfjjfgETbW3c40iVyen8ITbfgDnRl+N2nJOdyX1Japx2RUPj9DHyXqk2j6cDmLdQt0MH+b5+bJ6oDK1NkD4F4v0uJRFgjQTAuxvwOzBL3K/JjzQgcsNWHKp8hPpc7sL/NWtuxRpvWehP7NciMLVkf6QdBLYlzoij6rUjexM6rko6RtET/59asQqWT689SzL+Kozz3aEUBKBBwB/+dxyXeJn4t0Mk9nwU2/9SP0C6zH3l6KFc59rfqLV6aT71jDTYhnlWFOCd/KguP4VUKJX97ApVXKewUfOqbq71W1EiaSJiBI1bDIC8FqR/th7jMknYIyNW6tbNJgZuWpXcXKQG4izdJhmtKr+5aX6Hfl+uNyKJf89AfksWuZnN6ta3DUo7r92+N7uSDbgRWL7pstN18oaXYcQwLdLAyDUNVpYWCtNKzvD/f5jp5V5sWTXIkTlYSFiQAx3W/7DlVPrwGF5960PYrQddc6LXb1XzqpJw6+19xj/Vzt+lCmMa2imh7y/1cdFGWMqvPiIHls6L15eY8stW4UmatY1jTU7cjB8nuwwcqSWUktdbd5/KeQeaCLar0u2kG1wDZidYYkgg7Ilb2KV0NUJXLYhq9pjTiRFSX0zfz0ODV0lg3HDnyMreKjO74rbrRGjA3rQE4gFGVepMy/xbp5Tp1v6Gwgc30VWDmQNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDwyRjQ2REIyM0IxMzk4QkQxRTdGMDJEQzQ0ODNEM0M4MUZCREY4NDdCNzg4NTVERDVGQkVFMjNCOEVFRjU3OERBNUI1NjhBNDMxODk1NzVFOTQ1QzAzQ0M4QUNBNzVCNUE+Ci9VRSA8RDcyQUJGMjI4OUVDMTBEMDE5ODZFRkM2OEZBNDVGQTMxNDBFOTFGMUJBQUFCRjNEM0JCM0IxNzQ1RjZFRDIxRj4KL08gPDU0MUVFQUI3MUM1NzcxNjFBNjJGNzlENERCRjQyQTBFN0EwODlBRTVCMkJBRENGQ0Q5NDBBQTk1REI4Qzc5ODc5Q0VCNDFERUFCRjQyMjZCODY1QzZGN0UzMUM2NzQ2Nz4KL09FIDwzMTU4RDQzQTM5NDcyRTk2NTJFNzc5QzA2MUQ3QThGNTgxMDc5NTEzMjRCQzQ4QjQ0MDU4M0QxOEI3OTIyNEZFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDxGRjBDQkY1N0I1QjYzRjdFODRDN0I4OTMzRTFENzhGOT4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array><int>2048</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf8.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2042</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>%%EOF</char-array><byte-array>DOa8gTKN07PoLfnoN7Q9UUPbm43mvB0Dr6Yfw16ko0gc/RiPj+hHsJaexpViQixD2oF0FOk40lkkkZ7G4xQeH9IPsdUHkItUhjQVaQfSUaSzSBL9AFGhf2PrVUWWL0Oi9G+ICv0r3tZfEU30JOZO0pM4tLebikryDqqZSG4y4wslM86UZMbiyGulbzX90MPXSj9p9kd8Owf2pu9ADAmXP6KC5Ecag1SLVIckYu5dzL0LjUhbkXYixZDQtCAqSH56DOl1pHehN1IUaQyShp5owsu00uNN4UG+gQ76J/pH3Dt99A36ipq+Tl9W09foH9T0VUzTMD1GX25K88FAHdYD9lEwVTDNxXqB/r45w+KLDzTToygeH2IuUhnSaKSpSFuQRHqUpjfN8FmQyWE4hh69jzbBl2r6BDyqgeg8XzQ8GHXMzyDc7yrMIezw7wjTaHjbdjxlEL7zbswxCN+yGXMMwqvWYY5BeMEyzDEIz5iHOQbhyVMxxyA8egLmEFrpb57LyPQVjZ5P/ANNdDlKaTlKaTlKaTnwdDk74Aeeje3BpuxslNgD0UiPbF/jIdJ4hDSOI42PksaZpPEm0riONJaSxutIY4Q0ekljGmmMksbDpBhF0UiiLVeclkRdpPEYadxDGhtIY5g0hkhjBmn0k6JoKw00Dc9Xkwo1aR7I1hWmVw3IM+EYAyjRAKp1AJf9UcTjSHH1LIqN/OmJxu40lqY3Z5clznv1y1s0cBh9ETu+iNPwIpxC4nGCXkQ1ehGZvIgMTIhlSFOR2pDOIsWRRGydjgPfoqIJMRepDGkq0lqks0iiOpyzSBQWJYe4Vx1YbnLQo9kZfREP9gtHARqIpipeJaIM47Z4iSmNjE6Lp9EiYM4nWMwacysxHPiX4ft/YXg8UEvvpFsgFSdiazLd0vRDqq+V3N8UPuwbaCf3QRqPWkdKIExCmBZDg3peCF4NSwvAS5/BNK/JO8nHvvQTzvEdIkbW64DvB+8Z35feVorZL7yHfX/xt/KkyfdnLHnmgO8d722+V3NbNVhyJNxKMDnkV5se9Bb79hxTm67DigeafDex5IBvjXeob75XrZiZqLiuAc+iJt+48GTfMORX7r3eF21Angd8Zd7rfKWJVoWszwFfbxxCJJHNxsH28KoXDaapDCcWtZI50Rxpm1QljZb6SnlSjhSQfFKqlCLZNBaNojFq9BgbazSihtdQDWhs7EtyEeYA2kRFfe7PM+TVvEIZMi9DfeCtoXA1xKxcJa0cP4hUxtqmQ+X1/tiF8cFWIo+dHBOCg0jMUgmVEwbFiiOVrVJ8XKwoUhmTxlxbtY+QO6uxNEY3thKYUNVK4qxofQr7eZaDQIh5/R0pLM1af0d1Nbgcy8pcZZYB5pIh5f8BapPY7dWG64p8amxb5fiq2NOp1bE8lomnVlfGfs1+v+Ug+Zacqyg/SP7Bkuqqg9wA8m3FOFbODSivrq5sJZPUduAn/8B2qDH/UNtp0sDP2oFfk5Zo90CiXQj7Y7sMlmA7rRZCaruQVqu24wlrt68ho6J8X0aG2sbphwa1TYPT373NsRC2CYXUNo5GOKa2OeZoZG1iA9QmXi82SfOqTYgHvGoTL/GoTSZdbpKbbHJbV5Pb1Ctx5HIbb6KN4fSlNobT2CbyX/3MHBSJkOb+1dOnsN++qQ1WzESqjd2+bI4r1ni9379venXyR3HCtddPn8PSaTNj1cGZ5bHpwXL/vv5T/kP1FFbdP1i+D6ZUTKjaNyU6s7ypf7R/RXBaeXXz0DEFRVdc67auaxWM+Q/MxjBmBexaQ4v+Q3URqx7KrlXErlXErjU0OlS9Fqg6PqZqnwYGVQ+ekkibqU5Gfa1NCVQPcih1A1Tl7R9w3ZRyCB2Sp0AXqY7pg4NiBiRW1XNgz4GsCtcUqzKyHzhKVrlu6h9IOUSeSlYpWGwODoLIkqUNS8FVMbc88deAHyxaspQJPIGRhl/6YF1FLDqtvGEJBpix7PGVsbKxk6v2SRKW1rJbivW7VKbTVbTG2xKFvbCwHyvkuK6GrKyUlWm1yYY/n/+lyVR9ht9IDzeTaBpBn7Wai6VVTqBoCiYkf0nmELpLbHtoqMYbbCAR0nCJhzpsSL6dZPd7iZYsTeaScliSTBO9sEvDJXF0fbAPmqr/BbpeQAANCmVuZHN0cmVhbQplbmRvYmoKeHJlZgowIDEzCjAwMDAwMDAwMDAgNjU1MzUgZg0KMDAwMDAwMDAxNSAwMDAwMCBuDQowMDAwMDAwMTI0IDAwMDAwIG4NCjAwMDAwMDAwNzggMDAwMDAgbg0KMDAwMDAwMDE4MSAwMDAwMCBuDQowMDAwMDAwNDcxIDAwMDAwIG4NCjAwMDAwMDExMzggMDAwMDAgbg0KMDAwMDAwMTE3NyAwMDAwMCBuDQowMDAwMDAxMzEwIDAwMDAwIG4NCjAwMDAwODMyNDAgMDAwMDAgbg0KMDAwMDA4MzgyNyAwMDAwMCBuDQowMDAwMDg0MjMwIDAwMDAwIG4NCjAwMDAwODQ0NjYgMDAwMDAgbg0KdHJhaWxlcgo8PAovUm9vdCAxIDAgUgovSW5mbyAzIDAgUgovSUQgWzw1MkZGQjRFQUY5QkMwQTA2RTZDM0IzMTUyNEJGRUFGQT4gPDUyRkZCNEVBRjlCQzBBMDZFNkMzQjMxNTI0QkZFQUZBPl0KL1NpemUgMTMKPj4Kc3RhcnR4cmVmCjEwMDgxMgolJUVPRgo=</byte-array><int>2048</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf9.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2025</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>startxref</char-array><byte-array>vlYo0a000Dcjt99Vl1KCT+HlQCFAGmF4o5eRbJv7oqabwZZ4KeCuY1+VQNvdgDWnwVrXOEz9rODyCpfOE8kp1Z6Q/y2FksefRp8bqt468z09ZGhTjuz0FmAtVAPTUgNUvV+AnXuWkAMGQ9MffIwFVr3zDn7uGtyYJQCqZlD/73ULeFBrBw3ghAc8JEV50SGajbt24syLyaBMV0MKbBzSHsh2UCexq8V1YpZQ9WjxSsEZpVUNt5pgde+bFOzzkqZNnJooGiHoUk23t636EfW51hq3fcGmD8wa4ZcJHnwctxCl1DhyNp5M1gJpkj55OjUuZ/o2IwL9mzeAjCRAgY/PJ1iRs5gUsoSRPuJ7V8Km7/JAsUfzfVBkI2nO3dEqVA3Ihz4M7I6rSc3pHjIlErrGobIXEoWcifpVtCR2JuR6JgjKCNzyJPSEqxfJpW02ZICmyUXs6iQOCvMDEnytL4NXXXbfwHSEzAI08FIRC6PRdW5nh22OQdIUflG3gZ9fO3SJ+lmYX8LThE9/plabeT45Gw0KTQ0P0h3ZWSvtH0jF1hJ4KOQNPCds1bw6K7sZjbrG5aSTWZMgOnDeGM0qD5woe9s+q62Q1iQ6aXQhc9iUuQ3fj04cljvUsA79LrYi4UHr/fRTw41ksmES18tYVsLrPDUHx2HY241M0ek1fJOwLi0HpZC7bRD6XBBnM4CqO4PjXlrDyuvY+CMRJK0ZbxYjWYZG8eX3bc7Db2UO5S3boPWonyZaeQsPz/94R9pzpsTYIzUGXAwaQ0N1mI/Jf0bQV9GjXLAEoWI0ekL/weYk3j9s4WUPF2oHuFGFPQ4bE1R1rxNGuLvCGj58fmTH5kVknXfjjfgETbW3c40iVyen8ITbfgDnRl+N2nJOdyX1Japx2RUPj9DHyXqk2j6cDmLdQt0MH+b5+bJ6oDK1NkD4F4v0uJRFgjQTAuxvwOzBL3K/JjzQgcsNWHKp8hPpc7sL/NWtuxRpvWehP7NciMLVkf6QdBLYlzoij6rUjexM6rko6RtET/59asQqWT689SzL+Kozz3aEUBKBBwB/+dxyXeJn4t0Mk9nwU2/9SP0C6zH3l6KFc59rfqLV6aT71jDTYhnlWFOCd/KguP4VUKJX97ApVXKewUfOqbq71W1EiaSJiBI1bDIC8FqR/th7jMknYIyNW6tbNJgZuWpXcXKQG4izdJhmtKr+5aX6Hfl+uNyKJf89AfksWuZnN6ta3DUo7r92+N7uSDbgRWL7pstN18oaXYcQwLdLAyDUNVpYWCtNKzvD/f5jp5V5sWTXIkTlYSFiQAx3W/7DlVPrwGF5960PYrQddc6LXb1XzqpJw6+19xj/Vzt+lCmMa2imh7y/1cdFGWMqvPiIHls6L15eY8stW4UmatY1jTU7cjB8nuwwcqSWUktdbd5/KeQeaCLar0u2kG1wDZidYYkgg7Ilb2KV0NUJXLYhq9pjTiRFSX0zfz0ODV0lg3HDnyMreKjO74rbrRGjA3rQE4gFGVepMy/xbp5Tp1v6Gwgc30VWDmQNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDwyRjQ2REIyM0IxMzk4QkQxRTdGMDJEQzQ0ODNEM0M4MUZCREY4NDdCNzg4NTVERDVGQkVFMjNCOEVFRjU3OERBNUI1NjhBNDMxODk1NzVFOTQ1QzAzQ0M4QUNBNzVCNUE+Ci9VRSA8RDcyQUJGMjI4OUVDMTBEMDE5ODZFRkM2OEZBNDVGQTMxNDBFOTFGMUJBQUFCRjNEM0JCM0IxNzQ1RjZFRDIxRj4KL08gPDU0MUVFQUI3MUM1NzcxNjFBNjJGNzlENERCRjQyQTBFN0EwODlBRTVCMkJBRENGQ0Q5NDBBQTk1REI4Qzc5ODc5Q0VCNDFERUFCRjQyMjZCODY1QzZGN0UzMUM2NzQ2Nz4KL09FIDwzMTU4RDQzQTM5NDcyRTk2NTJFNzc5QzA2MUQ3QThGNTgxMDc5NTEzMjRCQzQ4QjQ0MDU4M0QxOEI3OTIyNEZFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDxGRjBDQkY1N0I1QjYzRjdFODRDN0I4OTMzRTFENzhGOT4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array><int>2042</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf10.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2025</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>startxref</char-array><byte-array>DOa8gTKN07PoLfnoN7Q9UUPbm43mvB0Dr6Yfw16ko0gc/RiPj+hHsJaexpViQixD2oF0FOk40lkkkZ7G4xQeH9IPsdUHkItUhjQVaQfSUaSzSBL9AFGhf2PrVUWWL0Oi9G+ICv0r3tZfEU30JOZO0pM4tLebikryDqqZSG4y4wslM86UZMbiyGulbzX90MPXSj9p9kd8Owf2pu9ADAmXP6KC5Ecag1SLVIckYu5dzL0LjUhbkXYixZDQtCAqSH56DOl1pHehN1IUaQyShp5owsu00uNN4UG+gQ76J/pH3Dt99A36ipq+Tl9W09foH9T0VUzTMD1GX25K88FAHdYD9lEwVTDNxXqB/r45w+KLDzTToygeH2IuUhnSaKSpSFuQRHqUpjfN8FmQyWE4hh69jzbBl2r6BDyqgeg8XzQ8GHXMzyDc7yrMIezw7wjTaHjbdjxlEL7zbswxCN+yGXMMwqvWYY5BeMEyzDEIz5iHOQbhyVMxxyA8egLmEFrpb57LyPQVjZ5P/ANNdDlKaTlKaTlKaTnwdDk74Aeeje3BpuxslNgD0UiPbF/jIdJ4hDSOI42PksaZpPEm0riONJaSxutIY4Q0ekljGmmMksbDpBhF0UiiLVeclkRdpPEYadxDGhtIY5g0hkhjBmn0k6JoKw00Dc9Xkwo1aR7I1hWmVw3IM+EYAyjRAKp1AJf9UcTjSHH1LIqN/OmJxu40lqY3Z5clznv1y1s0cBh9ETu+iNPwIpxC4nGCXkQ1ehGZvIgMTIhlSFOR2pDOIsWRRGydjgPfoqIJMRepDGkq0lqks0iiOpyzSBQWJYe4Vx1YbnLQo9kZfREP9gtHARqIpipeJaIM47Z4iSmNjE6Lp9EiYM4nWMwacysxHPiX4ft/YXg8UEvvpFsgFSdiazLd0vRDqq+V3N8UPuwbaCf3QRqPWkdKIExCmBZDg3peCF4NSwvAS5/BNK/JO8nHvvQTzvEdIkbW64DvB+8Z35feVorZL7yHfX/xt/KkyfdnLHnmgO8d722+V3NbNVhyJNxKMDnkV5se9Bb79hxTm67DigeafDex5IBvjXeob75XrZiZqLiuAc+iJt+48GTfMORX7r3eF21Angd8Zd7rfKWJVoWszwFfbxxCJJHNxsH28KoXDaapDCcWtZI50Rxpm1QljZb6SnlSjhSQfFKqlCLZNBaNojFq9BgbazSihtdQDWhs7EtyEeYA2kRFfe7PM+TVvEIZMi9DfeCtoXA1xKxcJa0cP4hUxtqmQ+X1/tiF8cFWIo+dHBOCg0jMUgmVEwbFiiOVrVJ8XKwoUhmTxlxbtY+QO6uxNEY3thKYUNVK4qxofQr7eZaDQIh5/R0pLM1af0d1Nbgcy8pcZZYB5pIh5f8BapPY7dWG64p8amxb5fiq2NOp1bE8lomnVlfGfs1+v+Ug+Zacqyg/SP7Bkuqqg9wA8m3FOFbODSivrq5sJZPUduAn/8B2qDH/UNtp0sDP2oFfk5Zo90CiXQj7Y7sMlmA7rRZCaruQVqu24wlrt68ho6J8X0aG2sbphwa1TYPT373NsRC2CYXUNo5GOKa2OeZoZG1iA9QmXi82SfOqTYgHvGoTL/GoTSZdbpKbbHJbV5Pb1Ctx5HIbb6KN4fSlNobT2CbyX/3MHBSJkOb+1dOnsN++qQ1WzESqjd2+bI4r1ni9379venXyR3HCtddPn8PSaTNj1cGZ5bHpwXL/vv5T/kP1FFbdP1i+D6ZUTKjaNyU6s7ypf7R/RXBaeXXz0DEFRVdc67auaxWM+Q/MxjBmBexaQ4v+Q3URqx7KrlXErlXErjU0OlS9Fqg6PqZqnwYGVQ+ekkibqU5Gfa1NCVQPcih1A1Tl7R9w3ZRyCB2Sp0AXqY7pg4NiBiRW1XNgz4GsCtcUqzKyHzhKVrlu6h9IOUSeSlYpWGwODoLIkqUNS8FVMbc88deAHyxaspQJPIGRhl/6YF1FLDqtvGEJBpix7PGVsbKxk6v2SRKW1rJbivW7VKbTVbTG2xKFvbCwHyvkuK6GrKyUlWm1yYY/n/+lyVR9ht9IDzeTaBpBn7Wai6VVTqBoCiYkf0nmELpLbHtoqMYbbCAR0nCJhzpsSL6dZPd7iZYsTeaScliSTBO9sEvDJXF0fbAPmqr/BbpeQAANCmVuZHN0cmVhbQplbmRvYmoKeHJlZgowIDEzCjAwMDAwMDAwMDAgNjU1MzUgZg0KMDAwMDAwMDAxNSAwMDAwMCBuDQowMDAwMDAwMTI0IDAwMDAwIG4NCjAwMDAwMDAwNzggMDAwMDAgbg0KMDAwMDAwMDE4MSAwMDAwMCBuDQowMDAwMDAwNDcxIDAwMDAwIG4NCjAwMDAwMDExMzggMDAwMDAgbg0KMDAwMDAwMTE3NyAwMDAwMCBuDQowMDAwMDAxMzEwIDAwMDAwIG4NCjAwMDAwODMyNDAgMDAwMDAgbg0KMDAwMDA4MzgyNyAwMDAwMCBuDQowMDAwMDg0MjMwIDAwMDAwIG4NCjAwMDAwODQ0NjYgMDAwMDAgbg0KdHJhaWxlcgo8PAovUm9vdCAxIDAgUgovSW5mbyAzIDAgUgovSUQgWzw1MkZGQjRFQUY5QkMwQTA2RTZDM0IzMTUyNEJGRUFGQT4gPDUyRkZCNEVBRjlCQzBBMDZFNkMzQjMxNTI0QkZFQUZBPl0KL1NpemUgMTMKPj4Kc3RhcnR4cmVmCjEwMDgxMgolJUVPRgo=</byte-array><int>2042</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf11.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2025</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>startxref</char-array><byte-array>vlYo0a000Dcjt99Vl1KCT+HlQCFAGmF4o5eRbJv7oqabwZZ4KeCuY1+VQNvdgDWnwVrXOEz9rODyCpfOE8kp1Z6Q/y2FksefRp8bqt468z09ZGhTjuz0FmAtVAPTUgNUvV+AnXuWkAMGQ9MffIwFVr3zDn7uGtyYJQCqZlD/73ULeFBrBw3ghAc8JEV50SGajbt24syLyaBMV0MKbBzSHsh2UCexq8V1YpZQ9WjxSsEZpVUNt5pgde+bFOzzkqZNnJooGiHoUk23t636EfW51hq3fcGmD8wa4ZcJHnwctxCl1DhyNp5M1gJpkj55OjUuZ/o2IwL9mzeAjCRAgY/PJ1iRs5gUsoSRPuJ7V8Km7/JAsUfzfVBkI2nO3dEqVA3Ihz4M7I6rSc3pHjIlErrGobIXEoWcifpVtCR2JuR6JgjKCNzyJPSEqxfJpW02ZICmyUXs6iQOCvMDEnytL4NXXXbfwHSEzAI08FIRC6PRdW5nh22OQdIUflG3gZ9fO3SJ+lmYX8LThE9/plabeT45Gw0KTQ0P0h3ZWSvtH0jF1hJ4KOQNPCds1bw6K7sZjbrG5aSTWZMgOnDeGM0qD5woe9s+q62Q1iQ6aXQhc9iUuQ3fj04cljvUsA79LrYi4UHr/fRTw41ksmES18tYVsLrPDUHx2HY241M0ek1fJOwLi0HpZC7bRD6XBBnM4CqO4PjXlrDyuvY+CMRJK0ZbxYjWYZG8eX3bc7Db2UO5S3boPWonyZaeQsPz/94R9pzpsTYIzUGXAwaQ0N1mI/Jf0bQV9GjXLAEoWI0ekL/weYk3j9s4WUPF2oHuFGFPQ4bE1R1rxNGuLvCGj58fmTH5kVknXfjjfgETbW3c40iVyen8ITbfgDnRl+N2nJOdyX1Japx2RUPj9DHyXqk2j6cDmLdQt0MH+b5+bJ6oDK1NkD4F4v0uJRFgjQTAuxvwOzBL3K/JjzQgcsNWHKp8hPpc7sL/NWtuxRpvWehP7NciMLVkf6QdBLYlzoij6rUjexM6rko6RtET/59asQqWT689SzL+Kozz3aEUBKBBwB/+dxyXeJn4t0Mk9nwU2/9SP0C6zH3l6KFc59rfqLV6aT71jDTYhnlWFOCd/KguP4VUKJX97ApVXKewUfOqbq71W1EiaSJiBI1bDIC8FqR/th7jMknYIyNW6tbNJgZuWpXcXKQG4izdJhmtKr+5aX6Hfl+uNyKJf89AfksWuZnN6ta3DUo7r92+N7uSDbgRWL7pstN18oaXYcQwLdLAyDUNVpYWCtNKzvD/f5jp5V5sWTXIkTlYSFiQAx3W/7DlVPrwGF5960PYrQddc6LXb1XzqpJw6+19xj/Vzt+lCmMa2imh7y/1cdFGWMqvPiIHls6L15eY8stW4UmatY1jTU7cjB8nuwwcqSWUktdbd5/KeQeaCLar0u2kG1wDZidYYkgg7Ilb2KV0NUJXLYhq9pjTiRFSX0zfz0ODV0lg3HDnyMreKjO74rbrRGjA3rQE4gFGVepMy/xbp5Tp1v6Gwgc30VWDmQNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDwyRjQ2REIyM0IxMzk4QkQxRTdGMDJEQzQ0ODNEM0M4MUZCREY4NDdCNzg4NTVERDVGQkVFMjNCOEVFRjU3OERBNUI1NjhBNDMxODk1NzVFOTQ1QzAzQ0M4QUNBNzVCNUE+Ci9VRSA8RDcyQUJGMjI4OUVDMTBEMDE5ODZFRkM2OEZBNDVGQTMxNDBFOTFGMUJBQUFCRjNEM0JCM0IxNzQ1RjZFRDIxRj4KL08gPDU0MUVFQUI3MUM1NzcxNjFBNjJGNzlENERCRjQyQTBFN0EwODlBRTVCMkJBRENGQ0Q5NDBBQTk1REI4Qzc5ODc5Q0VCNDFERUFCRjQyMjZCODY1QzZGN0UzMUM2NzQ2Nz4KL09FIDwzMTU4RDQzQTM5NDcyRTk2NTJFNzc5QzA2MUQ3QThGNTgxMDc5NTEzMjRCQzQ4QjQ0MDU4M0QxOEI3OTIyNEZFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDxGRjBDQkY1N0I1QjYzRjdFODRDN0I4OTMzRTFENzhGOT4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array><int>2042</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf12.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2025</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>startxref</char-array><byte-array>/Sve1l8RTfQk5k7Skzi0t5uKSvIOqplIbjLjCyUzzpRkxuLIa6VvNf3Qw9dKP2n2R3w7B/am70AMCZc/ooLkRxqDVItUhyRi7l3MvQuNSFuRdiLFkNC0ICpIfnoM6XWkd6E3UhRpDJKGnmjCy7TS403hQb6BDvon+kfcO330DfqKmr5OX1bT1+gf1PRVTNMwPUZfbkrzwUAd1gP2UTBVMM3FeoH+vjnD4osPNNOjKB4fYi5SGdJopKlIW5BEepSmN83wWZDJYTiGHr2PNsGXavoEPKqB6DxfNDwYdczPINzvKswh7PDvCNNoeNt2PGUQvvNuzDEI37IZcwzCq9ZhjkF4wTLMMQjPmIc5BuHJUzHHIDx6AuYQWulvnsvI9BWNnk/8A010OUppOUppOUppOfB0OTvgB56N7cGm7GyU2APRSI9sX+Mh0niENI4jjY+Sxpmk8SbSuI40lpLG60hjhDR6SWMaaYySxsOkGEXRSKItV5yWRF2k8Rhp3EMaG0hjmDSGSGMGafSTomgrDTQNz1eTCjVpHsjWFaZXDcgz4RgDKNEAqnUAl/1RxONIcfUsio386YnG7jSWpjdnlyXOe/XLWzRwGH0RO76I0/AinELicYJeRDV6EZm8iAxMiGVIU5HakM4ixZFEbJ2OA9+iogkxF6kMaSrSWqSzSKI6nLNIFBYlh7hXHVhuctCj2Rl9EQ/2C0cBGoimKl4logzjtniJKY2MToun0SJgzidYzBpzKzEc+Jfh+39heDxQS++kWyAVJ2JrMt3S9EOqr5Xc3xQ+7BtoJ/dBGo9aR0ogTEKYFkODel4IXg1LC8BLn8E0r8k7yce+9BPO8R0iRtbrgO8H7xnfl95WitkvvId9f/G38qTJ92cseeaA7x3vbb5Xc1s1WHIk3EowOeRXmx70Fvv2HFObrsOKB5p8N7HkgG+Nd6hvvletmJmouK4Bz6Im37jwZN8w5Ffuvd4XbUCeB3xl3ut8pYlWhazPAV9vHEIkkc3GwfbwqhcNpqkMJxa1kjnRHGmbVCWNlvpKeVKOFJB8UqqUItk0Fo2iMWr0GBtrNKKG11ANaGzsS3IR5gDaREV97s8z5NW8QhkyL0N94K2hcDXErFwlrRw/iFTG2qZD5fX+2IXxwVYij50cE4KDSMxSCZUTBsWKI5WtUnxcrChSGZPGXFu1j5A7q7E0Rje2EphQ1UrirGh9Cvt5loNAiHn9HSkszVp/R3U1uBzLylxllgHmkiHl/wFqk9jt1YbrinxqbFvl+KrY06nVsTyWiadWV8Z+zX6/5SD5lpyrKD9I/sGS6qqD3ADybcU4Vs4NKK+urmwlk9R24Cf/wHaoMf9Q22nSwM/agV+Tlmj3QKJdCPtjuwyWYDutFkJqu5BWq7bjCWu3ryGjonxfRobaxumHBrVNg9Pfvc2xELYJhdQ2jkY4prY55mhkbWID1CZeLzZJ86pNiAe8ahMv8ahNJl1ukptscltXk9vUK3Hkchtvoo3h9KU2htPYJvJf/cwcFImQ5v7V06ew376pDVbMRKqN3b5sjivWeL3fv296dfJHccK110+fw9JpM2PVwZnlsenBcv++/lP+Q/UUVt0/WL4PplRMqNo3JTqzvKl/tH9FcFp5dfPQMQVFV1zrtq5rFYz5D8zGMGYF7FpDi/5DdRGrHsquVcSuVcSuNTQ6VL0WqDo+pmqfBgZVD56SSJupTkZ9rU0JVA9yKHUDVOXtH3DdlHIIHZKnQBepjumDg2IGJFbVc2DPgawK1xSrMrIfOEpWuW7qH0g5RJ5KVilYbA4OgsiSpQ1LwVUxtzzx14AfLFqylAk8gZGGX/pgXUUsOq28YQkGmLHs8ZWxsrGTq/ZJEpbWsluK9btUptNVtMbbEoW9sLAfK+S4roasrJSVabXJhj+f/6XJVH2G30gPN5NoGkGftZqLpVVOoGgKJiR/SeYQuktse2ioxhtsIBHScImHOmxIvp1k93uJlixN5pJyWJJME72wS8MlcXR9sA+aqv8Ful5AAA0KZW5kc3RyZWFtCmVuZG9iagp4cmVmCjAgMTgKMDAwMDAwMDAwMCA2NTUzNSBmDQowMDAwMDAwMDE1IDAwMDAwIG4NCjAwMDAwMDAxMjQgMDAwMDAgbg0KMDAwMDAwMDA3OCAwMDAwMCBuDQowMDAwMDAwMTgxIDAwMDAwIG4NCjAwMDAwMDA0ODEgMDAwMDAgbg0KMDAwMDAwMTI2OSAwMDAwMCBuDQowMDAwMDAxMzA4IDAwMDAwIG4NCjAwMDAwMDE0NDcgMDAwMDAgbg0KMDAwMDAwMTU4MSAwMDAwMCBuDQowMDAwMTQ5Nzc4IDAwMDAwIG4NCjAwMDAxNTAyMjcgMDAwMDAgbg0KMDAwMDE1MDYwMCAwMDAwMCBuDQowMDAwMTUxMTg4IDAwMDAwIG4NCjAwMDAxNTE1OTEgMDAwMDAgbg0KMDAwMDE1MTgzMiAwMDAwMCBuDQowMDAwMTUyMDY4IDAwMDAwIG4NCjAwMDAxNjQ0MDkgMDAwMDAgbg0KdHJhaWxlcgo8PAovUm9vdCAxIDAgUgovSW5mbyAzIDAgUgovSUQgWzw4MjRFQzQzOTQ0Mjc0N0ZFOTdGMEQ0RDJGQTEzRTAyND4gPDgyNEVDNDM5NDQyNzQ3RkU5N0YwRDREMkZBMTNFMDI0Pl0KL1NpemUgMTgKPj4Kc3RhcnR4cmVmCjE4MDc1NQolJUVPRgo=</byte-array><int>2042</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf13.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2042</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>%%EOF</char-array><byte-array>7yN++D6CQgpD+PV8JfXBh1gVDFe2/djH7me3tLmeshf2ZjdTMlZROxtGLpaKMIeaZXwoJVlFOISS+CMIs9qSJuGxyDZXun0z6yGe2mj/MemI/dMkP4f6SdJT9rc1v8ra7G8h5ZGN9t1J19pfzvRbkbLF5WcINmvSdFNSjv3R7dJ0KTLWttmXiGCj/dKkEfYLk2RGfSDj/GbEPJH28a5z7CNRXknSVLunGWVutBcknW/PC1gNFc9stA9EE9wBNQ2N7Z8kK3UmywInZvtZgyfdssZSZRljOd2SZUm3OCx2Sx9LoqWXNdpqs/awhltDrVar2apauZWsvfzGAY9bbDR6mW0iMKuCqtRtnORvx3IfwpmV05mk91TKefmEIlaud9RS+VRN/26C089CsWE2OYuYHl1O5ZVFeo673G8xxuvZ7nLdMvbcqlbGrvciVefX+Bl2u35miKRlieJouokYi1p2XaIIT1t2nddLcTHzC+IKovOjhpWV/A6qg3T/esV10/voa8onVOkP9/HqWUIx+njL9RvF2XUT+5odLy3ZxL4Sgbdqk5LPvi4dL9KV/BKvt9zPJkk70thXsMOI+UraWZNJE3akWZMDdmsDdql4HnYpIoAdtqep0i41JETaqUzYtTanlJa0pqRIm1iNmqVNc6x2qs32VNikpkqbGB9tlzbbY3zCRs+XJklJMElOkiYsgZKkSRJLkCaTfjXJDJpc22VyraxJYb/aJAVsIg6ctIk4ABv3n73qi9xu1j7cWztZnPurnaX1kGp9+fyGON03VdNaa73BHwRc1VNrG0RYU697nfUleq2zRGsdPvl3sieL7OHOklZsoCurWid76kvahnuGlzprSrztI8YOye5W17VddQ0Z+zuFjRWFDRF1jcj+nexskT1C1JUt6soWdY3wjJB1kRzjY6tarVTkxTFThu08LBTjtTrR4S2KsTXly8E73BG3JHEzNiTrKQyn7nBnkR4BEVkZhRmFIgtzSmT1ED/uBLPilgx3JG5m64NZNiRHOYvIPXde8zyKK51eEvjXjAtJc+eJDg/Q3fxHF/JKdU9NSfNcHEf0tAnlegHOta0WC1KrxSvpuSfTwsJKcbwMJA5AYq5IVJQuQ5GWJ9JCQoKGv/3+84JhsZgFPv5UO/MkM+xZvYqeXF7J4Qoqg6fozdguieWh2YsXbGZu1nyyDNlsCugk3vekzJ0X1IL9MDcYBp7CI80nu6PrwjNwVf8FmKSL4WVuZHN0cmVhbQplbmRvYmoKMTAgMCBvYmoKPDwgL0ZpbHRlciAvRmxhdGVEZWNvZGUgL0xlbmd0aCAyMjMgPj4Kc3RyZWFtCnicXZBNasQwDIX3PoWW08VgT7oNgTKlkEV/aNoDOLaSGhrZKM4it6/shilUYIP83ieepa/9Y08hg37j6AbMMAXyjGvc2CGMOAdSlwZ8cPno6u0Wm5QWeNjXjEtPU1RtC6DfRV0z73B68HHEO6Vf2SMHmuH0eR2kH7aUvnFBymBU14HHSSY92/RiFwRdsXPvRQ95Pwvz5/jYE0JT+8tvGhc9rsk6ZEszqtZIddA+SXUKyf/TD2qc3Jfl6r4XtzGNqe7jvXDlf7dQbmOWPHUJNUiJEAhve0oxFaqcH0BjbzllbmRzdHJlYW0KZW5kb2JqCjExIDAgb2JqCjw8IC9UeXBlIC9PYmpTdG0gL0xlbmd0aCA0MzAgL0ZpbHRlciAvRmxhdGVEZWNvZGUgL04gNiAvRmlyc3QgMzggPj4Kc3RyZWFtCnicfVHLbtswELz3K+ZoHyw+RIkyEASw47oxCidG7DaHIAfGYlSisihINFD/fZdy3KQ9FHpB3Nmd2RkhwSFSpAJCIcsg6NY5RA4pqaKhlPh0dQW26Xx53NsOo+1PZ9hmscShyMe4vh7K8zXYne8OpgbbG4g/56a3S98EsFnnTL3egS1sv7dNaZoQCz2eIg3HA57BPjd7X7qmAluVtgkunCa3YNvjSzi1FmxHb04f/61xBLQQfOgcCmAD0RvxjT/SjwD76srIkV8oztCNqWx/wc6ioIApzxKpU6Wo27S31lU/ArTIkkJyMuhNeMBECpFMheI5Udam6qHO3PO5/0VUkzxXSZZxXWCSSpVornkKyWWRpDSJRKc6EXyaFlFPbFy62kpMz7vEgztzsB8sWwVTu/2sqWpLGLYN9vAdioRNC0VTPqwfNXauDb77TwI3q8X21NOQVfPqEUH3XWm76Pvo4vsY7MFWrg/dCaNZ6V/sOAbRtrU9RBM4zR8m7fyX1WJt2vfIyKnHKPMfPeIcwXua1BwhUbz8K0L2SC5yenQW8+WQWifF4N0zXbTYb23MxBhlbmRzdHJlYW0KZW5kb2JqCjEgMCBvYmoKPDwgL1R5cGUgL1hSZWYgL0xlbmd0aCAxNyAvRmlsdGVyIC9GbGF0ZURlY29kZSAvRGVjb2RlUGFybXMgPDwgL0NvbHVtbnMgNSAvUHJlZGljdG9yIDEyID4+IC9XIFsgMSAzIDEgXSAvU2l6ZSAyIC9JRCBbPGI3ZTQ1YzY4MmNiNTg3OGYxZGRiYzg2ODk3ZTJhMGRmPjxiN2U0NWM2ODJjYjU4NzhmMWRkYmM4Njg5N2UyYTBkZj5dID4+CnN0cmVhbQp4nGNiAAEmRiZXBQYAAUwAbQplbmRzdHJlYW0KZW5kb2JqCiAgICAgICAgICAgICAgICAKc3RhcnR4cmVmCjIxNgolJUVPRgo=</byte-array><int>2048</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf14.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2042</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>%%EOF</char-array><byte-array>cbPxR0jlvHzSSFbu3zOTymc4/acnuTuYecI0v849kvnDy6l88kh/nre8w6BO9Od6y/2GykurtjB2RzVS/fzmDkaTqzqYKpJWJoif9uwgxmwrb08Qfr+Vt1dXU2z04qLYovARtvxRpedAXZDen1xsn3Cif135pCr/U4nV/iwRUBOry/13id/+7GD/ZKfKSnewL4VXXbVDGsH+WTZRpEsjSquryzvYVE2PnOxL6GHFfKnpGZPIKfTIaUwK6K0P6KXifeilCA96JhOlanqpJpOmJzOht6Ulpax0S0qKphPjpBZNpyXG2Vtnfyp0UlM1nehW2q/p7I9uFTr+EZqK3Q6VJLumwuLJrqnYWbymMvUnlcygyi09KrdoNUnsJx17QMd67IyO9Rh0vBfqGkZ6vWzrsOqZNeJ3U3XusgZInf/WxY2x/tYZTueWmdXBH1R56mbMbBR+fYO/2t1Q6p/pLnVuGVZzjuwakT3MXbqFasomV22p8TWUtg/zDStz15dWbx1dmZPbp65beurKqTxHYZWisBxR1+jcc2TniuzRoq5cUVeuqGu0b7RWF2lrvLJqi5FGVpfUBPytPMSM9VqX4KoeGa00jdAW7zBX7PKEnbiQPEkh3mq/xT3Sb4WIrAHFA4pFFvaUyAoVP44LZsUuH+ZK2MmeDGYpSLa5R5J30VUtV1Fs2ZzSwF8LHJIWXSUGPEBvy/kc8sr8vvrSlkX4qOxPn1TuL5owrWqLwYDUOtElf8GZtJCQsg51TyBxIBILRKIk9SiKtEKRZjIFFX8+/1cF/RKxC1r5c1uZL4nhzlot+ZPKJ3OYgsnBXyHtxHVJHA8t1ehgC/OyljNlaM2mQJhEf8/IoquCoeA4LAr6gbfwSsuZ4ehxeAem6r8AnyPXfmVuZHN0cmVhbQplbmRvYmoKMTIgMCBvYmoKPDwgL0ZpbHRlciAvRmxhdGVEZWNvZGUgL0xlbmd0aCAyODEgPj4Kc3RyZWFtCnicXZHbaoQwEEDf8xXzuH1YvKyXLohQLAs+9EJtP0CT0QZqDDE++PeNGddCAxqOM2cyToKqfq6VtBC8m4k3aKGXShicp8VwhA4HqVgUg5Dc7uTffGw1C5zcrLPFsVb9xIoCIPhw0dmaFU5PYurwgQVvRqCRaoDTV9U4bhatf3BEZSFkZQkCe1fppdWv7YgQeO1cCxeXdj075y/jc9UIseeIuuGTwFm3HE2rBmRF6FYJxc2tkqES/+I5WV3Pv1vjsy8uOwzjsNwoTjwlEVFOlBBdiTJPF/JS8hLyMvKSR6LUd7CfFd9PPhpNbvcSPrvybprSx8xvebyXIGn7n23ux7D4Yoybk78cP6BtNFLhcX960pu1Pb8DV5DnZW5kc3RyZWFtCmVuZG9iagoxMyAwIG9iago8PCAvVHlwZSAvT2JqU3RtIC9MZW5ndGggNjMyIC9GaWx0ZXIgL0ZsYXRlRGVjb2RlIC9OIDkgL0ZpcnN0IDYxID4+CnN0cmVhbQp4nMVUTW/aQBC991fMMTng3dnvlaJIEJoGVUlRSJtDxMHBW2rV2Mh2pPLvO2sCJmnSqlWrCoHlnTfzZt68BRVwQA0SAQ1oDWgBHb04kFwAepDKgOCgrQBB5xzpSQEh1ZuTE2DTusoeFqGGo9nXPGXT8TmsnD2G09MuPLoEdlXVq7QAtkgB9+dpE86rsgU2rPO0GIyqIru8ATYOzSKUWVq2MdrAXeTmcA1zYG/LRZXl5RLYJAtlm7ebwQWw2cN9u1kHYDf0y+lRfSxzAgbqtcvsAsA6tpfZXyEWf0wsXiM+qx7oBYG9z7PIYXYUW+g0XYZmhx3GhlrwXCfCSqUoO11fhHz5pQWLOnGC09YeG29hIBATj4oboizSZQNqyz0aVd+IamCETbzwxsNAWpMoo5widaVMDKWRWsomTqM2sZ+YeJ4XQYDfzhIPrtJVeL6wSZsW+WJYLotAQDZrw+oTUHm06Kw+1CA2Wufrtqp/ZYKzyXi2aajSpPxcQUR+qLNQxw0c7TZwDOw6LPOmrTdwNMyq+3AcV7JeF2EV5eBE0lW6qd5Nxpfpul8eaXYbe33WFD5Out8rJUdInEA8WSa7JT05fa2OFuMgLEknSUuSjq7RHUhSlXNLF2kO0kekEAka6y2hDXJCe1J/DhpBKzDGJN4L6sA4gtI9JAE1XTGw8km1PvWQlB8k9KfOeaLkGPdJqU4eZDsdy+4BfXpPtZ2sj8zp86+caVSiNbGSM4VKLLfUvuDCJd0gyKVNkHvpnjoT8UVrvupKRZ3R8FTmd1z5/wwp8K8YUkZD9g6L4Z+48RA6/9GOvvtj3GW7A5tvLbU/0JzvLPMdkTay82VuZHN0cmVhbQplbmRvYmoKMSAwIG9iago8PCAvVHlwZSAvWFJlZiAvTGVuZ3RoIDE2IC9GaWx0ZXIgL0ZsYXRlRGVjb2RlIC9EZWNvZGVQYXJtcyA8PCAvQ29sdW1ucyA0IC9QcmVkaWN0b3IgMTIgPj4gL1cgWyAxIDIgMSBdIC9TaXplIDIgL0lEIFs8MTA1ZGMwOWZmZjJjZDljYjhlMjc4ZjQ5NTUzYmM2ZmM+PDEwNWRjMDlmZmYyY2Q5Y2I4ZTI3OGY0OTU1M2JjNmZjPl0gPj4Kc3RyZWFtCnicY2IAAibGXFYGAAF9AHgKZW5kc3RyZWFtCmVuZG9iagogICAgICAgICAgICAgICAKc3RhcnR4cmVmCjIxNgolJUVPRgo=</byte-array><int>2048</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf15.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2042</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>%%EOF</char-array><byte-array>/Sve1l8RTfQk5k7Skzi0t5uKSvIOqplIbjLjCyUzzpRkxuLIa6VvNf3Qw9dKP2n2R3w7B/am70AMCZc/ooLkRxqDVItUhyRi7l3MvQuNSFuRdiLFkNC0ICpIfnoM6XWkd6E3UhRpDJKGnmjCy7TS403hQb6BDvon+kfcO330DfqKmr5OX1bT1+gf1PRVTNMwPUZfbkrzwUAd1gP2UTBVMM3FeoH+vjnD4osPNNOjKB4fYi5SGdJopKlIW5BEepSmN83wWZDJYTiGHr2PNsGXavoEPKqB6DxfNDwYdczPINzvKswh7PDvCNNoeNt2PGUQvvNuzDEI37IZcwzCq9ZhjkF4wTLMMQjPmIc5BuHJUzHHIDx6AuYQWulvnsvI9BWNnk/8A010OUppOUppOUppOfB0OTvgB56N7cGm7GyU2APRSI9sX+Mh0niENI4jjY+Sxpmk8SbSuI40lpLG60hjhDR6SWMaaYySxsOkGEXRSKItV5yWRF2k8Rhp3EMaG0hjmDSGSGMGafSTomgrDTQNz1eTCjVpHsjWFaZXDcgz4RgDKNEAqnUAl/1RxONIcfUsio386YnG7jSWpjdnlyXOe/XLWzRwGH0RO76I0/AinELicYJeRDV6EZm8iAxMiGVIU5HakM4ixZFEbJ2OA9+iogkxF6kMaSrSWqSzSKI6nLNIFBYlh7hXHVhuctCj2Rl9EQ/2C0cBGoimKl4logzjtniJKY2MToun0SJgzidYzBpzKzEc+Jfh+39heDxQS++kWyAVJ2JrMt3S9EOqr5Xc3xQ+7BtoJ/dBGo9aR0ogTEKYFkODel4IXg1LC8BLn8E0r8k7yce+9BPO8R0iRtbrgO8H7xnfl95WitkvvId9f/G38qTJ92cseeaA7x3vbb5Xc1s1WHIk3EowOeRXmx70Fvv2HFObrsOKB5p8N7HkgG+Nd6hvvletmJmouK4Bz6Im37jwZN8w5Ffuvd4XbUCeB3xl3ut8pYlWhazPAV9vHEIkkc3GwfbwqhcNpqkMJxa1kjnRHGmbVCWNlvpKeVKOFJB8UqqUItk0Fo2iMWr0GBtrNKKG11ANaGzsS3IR5gDaREV97s8z5NW8QhkyL0N94K2hcDXErFwlrRw/iFTG2qZD5fX+2IXxwVYij50cE4KDSMxSCZUTBsWKI5WtUnxcrChSGZPGXFu1j5A7q7E0Rje2EphQ1UrirGh9Cvt5loNAiHn9HSkszVp/R3U1uBzLylxllgHmkiHl/wFqk9jt1YbrinxqbFvl+KrY06nVsTyWiadWV8Z+zX6/5SD5lpyrKD9I/sGS6qqD3ADybcU4Vs4NKK+urmwlk9R24Cf/wHaoMf9Q22nSwM/agV+Tlmj3QKJdCPtjuwyWYDutFkJqu5BWq7bjCWu3ryGjonxfRobaxumHBrVNg9Pfvc2xELYJhdQ2jkY4prY55mhkbWID1CZeLzZJ86pNiAe8ahMv8ahNJl1ukptscltXk9vUK3Hkchtvoo3h9KU2htPYJvJf/cwcFImQ5v7V06ew376pDVbMRKqN3b5sjivWeL3fv296dfJHccK110+fw9JpM2PVwZnlsenBcv++/lP+Q/UUVt0/WL4PplRMqNo3JTqzvKl/tH9FcFp5dfPQMQVFV1zrtq5rFYz5D8zGMGYF7FpDi/5DdRGrHsquVcSuVcSuNTQ6VL0WqDo+pmqfBgZVD56SSJupTkZ9rU0JVA9yKHUDVOXtH3DdlHIIHZKnQBepjumDg2IGJFbVc2DPgawK1xSrMrIfOEpWuW7qH0g5RJ5KVilYbA4OgsiSpQ1LwVUxtzzx14AfLFqylAk8gZGGX/pgXUUsOq28YQkGmLHs8ZWxsrGTq/ZJEpbWsluK9btUptNVtMbbEoW9sLAfK+S4roasrJSVabXJhj+f/6XJVH2G30gPN5NoGkGftZqLpVVOoGgKJiR/SeYQuktse2ioxhtsIBHScImHOmxIvp1k93uJlixN5pJyWJJME72wS8MlcXR9sA+aqv8Ful5AAA0KZW5kc3RyZWFtCmVuZG9iagp4cmVmCjAgMTgKMDAwMDAwMDAwMCA2NTUzNSBmDQowMDAwMDAwMDE1IDAwMDAwIG4NCjAwMDAwMDAxMjQgMDAwMDAgbg0KMDAwMDAwMDA3OCAwMDAwMCBuDQowMDAwMDAwMTgxIDAwMDAwIG4NCjAwMDAwMDA0ODEgMDAwMDAgbg0KMDAwMDAwMTI2OSAwMDAwMCBuDQowMDAwMDAxMzA4IDAwMDAwIG4NCjAwMDAwMDE0NDcgMDAwMDAgbg0KMDAwMDAwMTU4MSAwMDAwMCBuDQowMDAwMTQ5Nzc4IDAwMDAwIG4NCjAwMDAxNTAyMjcgMDAwMDAgbg0KMDAwMDE1MDYwMCAwMDAwMCBuDQowMDAwMTUxMTg4IDAwMDAwIG4NCjAwMDAxNTE1OTEgMDAwMDAgbg0KMDAwMDE1MTgzMiAwMDAwMCBuDQowMDAwMTUyMDY4IDAwMDAwIG4NCjAwMDAxNjQ0MDkgMDAwMDAgbg0KdHJhaWxlcgo8PAovUm9vdCAxIDAgUgovSW5mbyAzIDAgUgovSUQgWzw4MjRFQzQzOTQ0Mjc0N0ZFOTdGMEQ0RDJGQTEzRTAyND4gPDgyNEVDNDM5NDQyNzQ3RkU5N0YwRDREMkZBMTNFMDI0Pl0KL1NpemUgMTgKPj4Kc3RhcnR4cmVmCjE4MDc1NQolJUVPRgo=</byte-array><int>2048</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testLastIndexOf16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.COSParser.lastIndexOf16.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>2042</int>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><char-array>%%EOF</char-array><byte-array>vlYo0a000Dcjt99Vl1KCT+HlQCFAGmF4o5eRbJv7oqabwZZ4KeCuY1+VQNvdgDWnwVrXOEz9rODyCpfOE8kp1Z6Q/y2FksefRp8bqt468z09ZGhTjuz0FmAtVAPTUgNUvV+AnXuWkAMGQ9MffIwFVr3zDn7uGtyYJQCqZlD/73ULeFBrBw3ghAc8JEV50SGajbt24syLyaBMV0MKbBzSHsh2UCexq8V1YpZQ9WjxSsEZpVUNt5pgde+bFOzzkqZNnJooGiHoUk23t636EfW51hq3fcGmD8wa4ZcJHnwctxCl1DhyNp5M1gJpkj55OjUuZ/o2IwL9mzeAjCRAgY/PJ1iRs5gUsoSRPuJ7V8Km7/JAsUfzfVBkI2nO3dEqVA3Ihz4M7I6rSc3pHjIlErrGobIXEoWcifpVtCR2JuR6JgjKCNzyJPSEqxfJpW02ZICmyUXs6iQOCvMDEnytL4NXXXbfwHSEzAI08FIRC6PRdW5nh22OQdIUflG3gZ9fO3SJ+lmYX8LThE9/plabeT45Gw0KTQ0P0h3ZWSvtH0jF1hJ4KOQNPCds1bw6K7sZjbrG5aSTWZMgOnDeGM0qD5woe9s+q62Q1iQ6aXQhc9iUuQ3fj04cljvUsA79LrYi4UHr/fRTw41ksmES18tYVsLrPDUHx2HY241M0ek1fJOwLi0HpZC7bRD6XBBnM4CqO4PjXlrDyuvY+CMRJK0ZbxYjWYZG8eX3bc7Db2UO5S3boPWonyZaeQsPz/94R9pzpsTYIzUGXAwaQ0N1mI/Jf0bQV9GjXLAEoWI0ekL/weYk3j9s4WUPF2oHuFGFPQ4bE1R1rxNGuLvCGj58fmTH5kVknXfjjfgETbW3c40iVyen8ITbfgDnRl+N2nJOdyX1Japx2RUPj9DHyXqk2j6cDmLdQt0MH+b5+bJ6oDK1NkD4F4v0uJRFgjQTAuxvwOzBL3K/JjzQgcsNWHKp8hPpc7sL/NWtuxRpvWehP7NciMLVkf6QdBLYlzoij6rUjexM6rko6RtET/59asQqWT689SzL+Kozz3aEUBKBBwB/+dxyXeJn4t0Mk9nwU2/9SP0C6zH3l6KFc59rfqLV6aT71jDTYhnlWFOCd/KguP4VUKJX97ApVXKewUfOqbq71W1EiaSJiBI1bDIC8FqR/th7jMknYIyNW6tbNJgZuWpXcXKQG4izdJhmtKr+5aX6Hfl+uNyKJf89AfksWuZnN6ta3DUo7r92+N7uSDbgRWL7pstN18oaXYcQwLdLAyDUNVpYWCtNKzvD/f5jp5V5sWTXIkTlYSFiQAx3W/7DlVPrwGF5960PYrQddc6LXb1XzqpJw6+19xj/Vzt+lCmMa2imh7y/1cdFGWMqvPiIHls6L15eY8stW4UmatY1jTU7cjB8nuwwcqSWUktdbd5/KeQeaCLar0u2kG1wDZidYYkgg7Ilb2KV0NUJXLYhq9pjTiRFSX0zfz0ODV0lg3HDnyMreKjO74rbrRGjA3rQE4gFGVepMy/xbp5Tp1v6Gwgc30VWDmQNCmVuZHN0cmVhbQplbmRvYmoKMjEgMCBvYmoKPDwKL0ZpbHRlciAvU3RhbmRhcmQKL1YgNQovUiA2Ci9MZW5ndGggMjU2Ci9QIC00Ci9VIDwyRjQ2REIyM0IxMzk4QkQxRTdGMDJEQzQ0ODNEM0M4MUZCREY4NDdCNzg4NTVERDVGQkVFMjNCOEVFRjU3OERBNUI1NjhBNDMxODk1NzVFOTQ1QzAzQ0M4QUNBNzVCNUE+Ci9VRSA8RDcyQUJGMjI4OUVDMTBEMDE5ODZFRkM2OEZBNDVGQTMxNDBFOTFGMUJBQUFCRjNEM0JCM0IxNzQ1RjZFRDIxRj4KL08gPDU0MUVFQUI3MUM1NzcxNjFBNjJGNzlENERCRjQyQTBFN0EwODlBRTVCMkJBRENGQ0Q5NDBBQTk1REI4Qzc5ODc5Q0VCNDFERUFCRjQyMjZCODY1QzZGN0UzMUM2NzQ2Nz4KL09FIDwzMTU4RDQzQTM5NDcyRTk2NTJFNzc5QzA2MUQ3QThGNTgxMDc5NTEzMjRCQzQ4QjQ0MDU4M0QxOEI3OTIyNEZFPgovQ0YgPDwKL1N0ZENGIDw8Ci9DRk0gL0FFU1YzCi9MZW5ndGggMjU2Cj4+Cj4+Ci9TdG1GIC9TdGRDRgovU3RyRiAvU3RkQ0YKL1Blcm1zIDxGRjBDQkY1N0I1QjYzRjdFODRDN0I4OTMzRTFENzhGOT4KPj4KZW5kb2JqCjIyIDAgb2JqCjw8Ci9MZW5ndGggOTAKL0lEIFs8Nzg1ODU0RjNDRTdEMERDQTY3QjZBQzYyM0YzRkVEQjI+IDw3ODU4NTRGM0NFN0QwRENBNjdCNkFDNjIzRjNGRURCMj5dCi9JbmZvIDMgMCBSCi9Sb290IDEgMCBSCi9FbmNyeXB0IDIxIDAgUgovVHlwZSAvWFJlZgovU2l6ZSAyMwovSW5kZXggWzAgMjJdCi9XIFsxIDMgMF0KL0ZpbHRlciAvRmxhdGVEZWNvZGUKPj4Kc3RyZWFtDQp4nGNgYGBgZGDgB+JFQOwAxA8ZGRjvMjIwXWBkYP3FyMCmCMRrGBnYjRiZvIDY5y0jcy83I3O/PSPzhFOMzJM7GZmnmjAyT1NlZJ4uyMh8PJaRhd0TAC/SDvoNCmVuZHN0cmVhbQplbmRvYmoKc3RhcnR4cmVmCjI2NDUzOAolJUVPRgo=</byte-array><int>2048</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            char[] paramObject1 = (char[]) paramObjects[0];
            byte[] paramObject2 = (byte[]) paramObjects[1];
            int paramObject3 = (Integer) paramObjects[2];
            Assert.assertEquals(returnedObject, receivingObject.lastIndexOf(paramObject1, paramObject2, paramObject3));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}