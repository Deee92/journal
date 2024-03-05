/* Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.apache.pdfbox.cos;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for PDFDocEncoding.
 */
public class TestProzeGen_parseHex_testPDFBox3864 {
    static java.util.List<String> deviations = new java.util.ArrayList<String>();

    static {
        // all deviations (based on the table in ISO 32000-1:2008)
        // block 1
        deviations.add(String.valueOf('˘'));// BREVE

        deviations.add(String.valueOf('ˇ'));// CARON

        deviations.add(String.valueOf('ˆ'));// MODIFIER LETTER CIRCUMFLEX ACCENT

        deviations.add(String.valueOf('˙'));// DOT ABOVE

        deviations.add(String.valueOf('˝'));// DOUBLE ACUTE ACCENT

        deviations.add(String.valueOf('˛'));// OGONEK

        deviations.add(String.valueOf('˚'));// RING ABOVE

        deviations.add(String.valueOf('˜'));// SMALL TILDE

        // block 2
        deviations.add(String.valueOf('•'));// BULLET

        deviations.add(String.valueOf('†'));// DAGGER

        deviations.add(String.valueOf('‡'));// DOUBLE DAGGER

        deviations.add(String.valueOf('…'));// HORIZONTAL ELLIPSIS

        deviations.add(String.valueOf('—'));// EM DASH

        deviations.add(String.valueOf('–'));// EN DASH

        deviations.add(String.valueOf('ƒ'));// LATIN SMALL LETTER SCRIPT F

        deviations.add(String.valueOf('⁄'));// FRACTION SLASH (solidus)

        deviations.add(String.valueOf('‹'));// SINGLE LEFT-POINTING ANGLE QUOTATION MARK

        deviations.add(String.valueOf('›'));// SINGLE RIGHT-POINTING ANGLE QUOTATION MARK

        deviations.add(String.valueOf('−'));// MINUS SIGN

        deviations.add(String.valueOf('‰'));// PER MILLE SIGN

        deviations.add(String.valueOf('„'));// DOUBLE LOW-9 QUOTATION MARK (quotedblbase)

        deviations.add(String.valueOf('“'));// LEFT DOUBLE QUOTATION MARK (quotedblleft)

        deviations.add(String.valueOf('”'));// RIGHT DOUBLE QUOTATION MARK (quotedblright)

        deviations.add(String.valueOf('‘'));// LEFT SINGLE QUOTATION MARK (quoteleft)

        deviations.add(String.valueOf('’'));// RIGHT SINGLE QUOTATION MARK (quoteright)

        deviations.add(String.valueOf('‚'));// SINGLE LOW-9 QUOTATION MARK (quotesinglbase)

        deviations.add(String.valueOf('™'));// TRADE MARK SIGN

        deviations.add(String.valueOf('ﬁ'));// LATIN SMALL LIGATURE FI

        deviations.add(String.valueOf('ﬂ'));// LATIN SMALL LIGATURE FL

        deviations.add(String.valueOf('Ł'));// LATIN CAPITAL LETTER L WITH STROKE

        deviations.add(String.valueOf('Œ'));// LATIN CAPITAL LIGATURE OE

        deviations.add(String.valueOf('Š'));// LATIN CAPITAL LETTER S WITH CARON

        deviations.add(String.valueOf('Ÿ'));// LATIN CAPITAL LETTER Y WITH DIAERESIS

        deviations.add(String.valueOf('Ž'));// LATIN CAPITAL LETTER Z WITH CARON

        deviations.add(String.valueOf('ı'));// LATIN SMALL LETTER DOTLESS I

        deviations.add(String.valueOf('ł'));// LATIN SMALL LETTER L WITH STROKE

        deviations.add(String.valueOf('œ'));// LATIN SMALL LIGATURE OE

        deviations.add(String.valueOf('š'));// LATIN SMALL LETTER S WITH CARON

        deviations.add(String.valueOf('ž'));// LATIN SMALL LETTER Z WITH CARON

        deviations.add(String.valueOf('€'));// EURO SIGN

        // end of deviations
    }

    /**
     * PDFBOX-3864: Test that chars smaller than 256 which are NOT part of PDFDocEncoding are
     * handled correctly.
     *
     * @throws IOException
     */
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void testPDFBox3864(String param0) throws IOException {
        for (int i = 0; i < 256; i++) {
            String hex = String.format("FEFF%04X", i);
            COSString cs1 = COSString.parseHex(param0);
            COSString cs2 = new COSString(cs1.getString());
            assertEquals(cs1, cs2);
        }
    }

    private static java.util.stream.Stream<org.junit.jupiter.params.provider.Arguments> provideProzeArguments() {
        return java.util.stream.Stream.of(
        org.junit.jupiter.params.provider.Arguments.of("0037C9EE91CA4C613A944859D6932CB8D1820ACE27C1F1B372D5E30C56DFADC0"),
        org.junit.jupiter.params.provider.Arguments.of("004B3A3A5C15EFCBCBD4A69BD0D1150214CC32C30E4F39F3E7F67A1A665DBA3F70E685D916BC70A5696824B344C6D5C4"),
        org.junit.jupiter.params.provider.Arguments.of("005481C27104B4CBFDF2FED58223A34D3D84694EF07EADEC2E547F0B91BAFBFF"),
        org.junit.jupiter.params.provider.Arguments.of("00780003"),
        org.junit.jupiter.params.provider.Arguments.of("039026973564A9831CD189B92242768065C15B2011531F038726B11D11B02BCFA5BE3B9245290F74D40ED916EC60B98C"),
        org.junit.jupiter.params.provider.Arguments.of("097928590AC55D138AEC676DB0DC8635A06CB5F64A36D59B0C713E69F6A9736521C96E0BF6289E5151D427D34DC4EE57"),
        org.junit.jupiter.params.provider.Arguments.of("09B7199CA39A1C9A673C685EEF886B0FE5286E5D6DD9BFF760F006BC67D3C769D964D8D5AFBD8710A583C58C46212401"),
        org.junit.jupiter.params.provider.Arguments.of("0ACA932346EC2283B30CFD515AADEE42225553F63BDE73FD340D43DDBC59D78C"),
        org.junit.jupiter.params.provider.Arguments.of("0E97507D45F28AFA15B78192B56B40E40F7BBEE27210076C40C0A77D20BC86D0"),
        org.junit.jupiter.params.provider.Arguments.of("0F7D9A54474A084FA9C560DE23CF5AE8"),
        org.junit.jupiter.params.provider.Arguments.of("0f7d9a54474a084fa9c560de23cf5ae8"),
        org.junit.jupiter.params.provider.Arguments.of("124ACAD053451909171819677A196FA1322FAC9F5C0CFC5968078698FBDC403DE3B30606E2B0CB7D1E83B3E07A4BAEA9"),
        org.junit.jupiter.params.provider.Arguments.of("1A04E14A339FC247B5C3675BF280D631C073806EAC0DC96F53CB115D1B7A4562A78147DAF64EF39BAFC37B955CE7CC09"),
        org.junit.jupiter.params.provider.Arguments.of("1B54A3733EC2C0459E2C61C4D8AC1FC7"),
        org.junit.jupiter.params.provider.Arguments.of("1BAD3A8E1672E7D3A1217FE4381C201A33C56A1C38A04C8144AB52ACF6735C3F"),
        org.junit.jupiter.params.provider.Arguments.of("1CB776B40CAB4C2B87C608E43E891581"),
        org.junit.jupiter.params.provider.Arguments.of("1CDA27450899593902FA3C4575DCB1A4C20B424D84E8D6CEB64D7A67471157D097719780A308E2BC209D2896EE7A4CA1"),
        org.junit.jupiter.params.provider.Arguments.of("1F900EBCAC4A01786F389B339D7D3209FCCEB71BD84B09C7B04BC456385D7820"),
        org.junit.jupiter.params.provider.Arguments.of("20287F4BA55FA8939F8C995E562D9B9572B60F4B401E37647FEB86D8F370C77B"),
        org.junit.jupiter.params.provider.Arguments.of("20CD4436614C49BBF959610493967B2AE20809B677EE30C0C9F06BA8DEBFD47C"),
        org.junit.jupiter.params.provider.Arguments.of("2106219EF5E4B0C98DE874D7A2E555A0A29D7C3B2CE00D3401E0A728775BA298"),
        org.junit.jupiter.params.provider.Arguments.of("238C93E812D78157974AE0F78D5D8F6EF7A667BC4E346C9039BBA91D891BF0063F1C9A7D2F26449A858C00405BF96BC6"),
        org.junit.jupiter.params.provider.Arguments.of("2440647A1D8F75CCD265974DFD637802721C7A9F94F442D1A134B762679A63FD"),
        org.junit.jupiter.params.provider.Arguments.of("2468BD2A464FD640F4D846E63F6BB5DFCB64682F6131FC7DE5349F72D0A27CE691E4228E4864E758A1B89B98F28BF78E"),
        org.junit.jupiter.params.provider.Arguments.of("2907D5CBC7A174B7EF076FC2D60FCDCDFDA54B339262D79F5010727B377AB1DA1CC706BE452AA201C575578A2981A835"),
        org.junit.jupiter.params.provider.Arguments.of("2B7A060E34D61F98AB0E4DF4D06555C49A870BC2D507EADD69531FA14BCAA119"),
        org.junit.jupiter.params.provider.Arguments.of("2F2F3B88A77A5CA4C512F34B4AE5470A64AC2D9B8C8A0B4C334F20EE03E20AE3"),
        org.junit.jupiter.params.provider.Arguments.of("2FA8CB8D0F80200BCB98BD0E1B754465D8567BE2BFABD7D24FC968367F0C2C46"),
        org.junit.jupiter.params.provider.Arguments.of("2FAC732CE6E6196DCB2726B3258CD68E6AE192C8560AB71A94D4FCF28791C28A"),
        org.junit.jupiter.params.provider.Arguments.of("31697E3B8C3418D6E67AFFF7B80BCB7C8DBF9BB38D65523285399CEBF147D7C920BB4A6C0049827291ACD85C32351269DC7EFD30D868340CE4C4F1F1FA63ADC1D8355436D186B0502A5A9D6D35CD9C552C427C0AFF8F3077C80D11303954F22609E2E86B46E9800C8EA4ACC3FD8D0BF6"),
        org.junit.jupiter.params.provider.Arguments.of("3755B3A731730150E51AA534D907E151EE60A3DA3D62FDBC7AE30EE9DC60B866"),
        org.junit.jupiter.params.provider.Arguments.of("37B05A71784A40EA2C97C2C3EA2ECA8AAF0869A566E3055B742828E627058B1EEA0F34A274DEC35F96C16AF1F0FD6F69B89C0BBC4E79A4DCCDD3A126A760A3F54DA5F2BD4524A8B9BB44960F16CA6129"),
        org.junit.jupiter.params.provider.Arguments.of("3896A1A546129FCDC4982B9145E853EB"),
        org.junit.jupiter.params.provider.Arguments.of("3C20235748B1481B5E8D8DDA88C06F41F8021F02D50798ECFE7104B13C1EE441DF8E1B5D9C6F89C986E29690F0E956E3"),
        org.junit.jupiter.params.provider.Arguments.of("3C320F94EACB49213891634F39E493F5CDA27BFA16BB535AC8184E1B3C3F8DE3"),
        org.junit.jupiter.params.provider.Arguments.of("3C58B0BF544217DF382A46C8F308EE910A8183B0123EC8A8208DC98A324BC496"),
        org.junit.jupiter.params.provider.Arguments.of("3CA3F8326556A73EA78E925B262E770918AEBB7F619BFFA061B35686C632897ECBE679FA333FA5A2D3E451C96FF09628C89FCE1B5685F6868CEEF8778E6AAE5F505CE83544B9C5452B6B6B0A65F7CD84"),
        org.junit.jupiter.params.provider.Arguments.of("3DCEB0430A7EF794D9F09EFFE698B69644A3C033D08D64DA1DCD6C87B4295438"),
        org.junit.jupiter.params.provider.Arguments.of("3EF6CEEC88256946B2F1E2F50F412BDF"),
        org.junit.jupiter.params.provider.Arguments.of("3FBD9449731C6B48A81E065571837FC9"),
        org.junit.jupiter.params.provider.Arguments.of("3FC08A67516899EE892038ED5350B7D0DCD5F37EFD392BE0D9E77B459E5173A9"),
        org.junit.jupiter.params.provider.Arguments.of("411B8B6701BB15BB3C036FD5BF98B8228BB0A1EA0D79ADA1505CD91059890E33A22CFB6A32C77E1E54A14A825AB8AFD41CE1A474C63E069285E9ECBE10D61717565272BD35C27577F82840A180260C8026A8D44BA395E1B8E6BBD21BF0F948D2984FECC7012755A33327238962DE8E8F"),
        org.junit.jupiter.params.provider.Arguments.of("43A78954A2D9E41BBF38C4514242560AB8D3D6C43180498A5BC7864A99623623"),
        org.junit.jupiter.params.provider.Arguments.of("47B08F1A741B0BAEBDBE114AA60B32ECCCC42D96D51561914A029FCAE6EC14985C02D19B99D4F13D5CD86E8C5C7F19B5662E12810550C72DF9AB15C4BC0874C4"),
        org.junit.jupiter.params.provider.Arguments.of("48CB5D9DCC3726503A513F58EA05B227"),
        org.junit.jupiter.params.provider.Arguments.of("4A65C32D19C87DDC5C0467691597675AEFCD5DE13596A4B08315524644D9991B"),
        org.junit.jupiter.params.provider.Arguments.of("4FBDD422EA073B2273D989EEFD9D0131804A0DDCB2FEF383E7BC4596C19677CF"),
        org.junit.jupiter.params.provider.Arguments.of("4FC3D2F27FC51AB9835FBEBC105087DC"),
        org.junit.jupiter.params.provider.Arguments.of("4FE536498EA513237B734FC17C95EE163B27816F12718870B5394746C9EE0C37"),
        org.junit.jupiter.params.provider.Arguments.of("4fc3d2f27fc51ab9835fbebc105087dc"),
        org.junit.jupiter.params.provider.Arguments.of("53EE84E980052B567BF77EEE66C2B762BBAFA30DA94A5005F31306D875520FB98AC43AEB28D25A5D4F0D815EC5204ECCF6C8CD323AD39A7E8979931EB09318DB"),
        org.junit.jupiter.params.provider.Arguments.of("545BD8A22DC9BC47D6DBE7172F25F46A91EAA3891D4C856CDFCCF7183FECBDCD9F1E3F093C0B62DE598722AF38036D59"),
        org.junit.jupiter.params.provider.Arguments.of("5E960FA86F8AA384126FD839C430CB02EDA924F93DF2197630AB167BDBC3DA65BF67033D108AE47F679F571ADD434936115B20D14018E9D5A663FD06CF60D30197AFA51875E7F44FAAB8A831A7F304D8A68460EC9A46CFB2CB8ACCC74492A32CB099A758CAD67BAC865983772DB5CE1A220DEFAE9DD1B2A6889FA889A4DCBF6D445F5459BA760BDD8CF60FB8F6DC58E145FD14F833BBD1674A0DB141B526858BF9EF913A0B8C74C1238C76D6808244CECEADEF7F81735517FC724A55682DB0621FCDCCE82DD5905F4DB7DF7E86BA1A7D860441C96B63007E7FFC40D93DF368D883C85AE905E11F887460377F0111761302DFCBF7A065F877E849CE06626B3AC6A8A1FDD8333EECE249DF9A8AB78693F9127BF705C472EF900E04D65D928B8AC062B16244AE5A8D99DDF7BF68994EA20D"),
        org.junit.jupiter.params.provider.Arguments.of("5FDA952BB40FC520B8C1095BDCF8305B1DD2C67BED9417D01BBE46B8DA23B0A8170B1FB06EED3F96F543D8F48BC7AB6D7F5CCCB46E0584A5FE666BEA55246605"),
        org.junit.jupiter.params.provider.Arguments.of("5FF083C0264A29BDA62184A65A7C9116"),
        org.junit.jupiter.params.provider.Arguments.of("5ff083c0264a29bda62184a65a7c9116"),
        org.junit.jupiter.params.provider.Arguments.of("610FCC85BE15569034B9ED03E2067810D970A4CC1879FEE3DB7537B901BD6C4E5BBB7F5277F0EC59C99FE183418FFFEB"),
        org.junit.jupiter.params.provider.Arguments.of("622BC2D977A946BD587E55AC25CB3186"),
        org.junit.jupiter.params.provider.Arguments.of("67B8277D4C3858E59A8A0F1A1D3A821BCD319B24FFA26C810849948FDB93BFF9621B3C8A134B5CD9366556B9393BB97EA5F4959D603876EEE581D01F09202193C3294815B6E45F120FEDEEEE6F47D457"),
        org.junit.jupiter.params.provider.Arguments.of("69CDA06314EC54BF53A50728E71FDBA007B4346C78A8F8608212691919B6D512EC69E3CB72C059560E30CAF5B974F844"),
        org.junit.jupiter.params.provider.Arguments.of("6ca1042f27ddbdf966bdd79155659fca"),
        org.junit.jupiter.params.provider.Arguments.of("71BAE67BDFA8A5FBC0414E1D5209FEFEEE3C063B292A57713184D2158CA541AE04DEBBF42EB7F81E7691645001B0F058"),
        org.junit.jupiter.params.provider.Arguments.of("71E2A400D33C80C726F2AEF9D4CFF966B7451B4F729339CB8E147D536EBF67BF"),
        org.junit.jupiter.params.provider.Arguments.of("73C8871DF920ED50636D5A40562B6D6D3332C9DCB4711B3B1D34F646A61747CB8EC110AC4018A17BC7D09A6EBD0031EE"),
        org.junit.jupiter.params.provider.Arguments.of("7520A080BB64FFF31D0807DB3319A8DA"),
        org.junit.jupiter.params.provider.Arguments.of("77AAF704898DF63E480D785EE9AE6514"),
        org.junit.jupiter.params.provider.Arguments.of("798E9D8E427E324E9240684C65BCC104"),
        org.junit.jupiter.params.provider.Arguments.of("7CC2EFF07D41FC24F3F3110161C88BA4"),
        org.junit.jupiter.params.provider.Arguments.of("7DA93BA8141C7BBAB18328B16EBCCE33F813A05253212CBF71A107811653DAC0"),
        org.junit.jupiter.params.provider.Arguments.of("8004F03C805AA36B9B7F7A335C2CFD42"),
        org.junit.jupiter.params.provider.Arguments.of("800C1745E4C524940AF53C783833A3B1E1897786816CD4BB325BB76948827D5418626DFB975B2358A3E3BC6BD7EB7B6773103794D967C5E8119F90F016851DD1DAC12B710B6E717AB1DA5C8A5F9EED81"),
        org.junit.jupiter.params.provider.Arguments.of("80496D6D1B7C76C927AE2CA8D2456D4DFAC1B0842CDE131D0FC157B1FCD4286D55555FD048D8C85FE541EE0A9D84DFA2281FA2F16425DDB3F47A8550C0C33E40E890CBBA3DBCB531D4BEE6D486AA9C53"),
        org.junit.jupiter.params.provider.Arguments.of("8225E35F7B1B227BA86FC7DBE6101688D978C3A4E778290B4EB4049CCA814BBE"),
        org.junit.jupiter.params.provider.Arguments.of("8357994A280BECE7DDF54DBC9DFEFE2720BDC7E95561E401EB697C6E8C3860FD6DACCA14E62911B45F1886A10B825A2D"),
        org.junit.jupiter.params.provider.Arguments.of("83A3BF83C4D2AFDC20AF23EF7D96A1AD9302B445E59F8DDF7551EEF41FD0BDC4"),
        org.junit.jupiter.params.provider.Arguments.of("84e40ae218bc385035381d56af730f99"),
        org.junit.jupiter.params.provider.Arguments.of("86631D00DEA802CF9C8441EE6F8E8D324DC5959317C3016BB3C17038AE5153D8"),
        org.junit.jupiter.params.provider.Arguments.of("8663A5A0901600AF604FC2C3C11FF758CF78F2C597922C0F20640810C08EFF1A"),
        org.junit.jupiter.params.provider.Arguments.of("8A6D1659397714BDD06B116F9E8E8D1B"),
        org.junit.jupiter.params.provider.Arguments.of("8CB2286EBC660146B894A80BBFC725E7"),
        org.junit.jupiter.params.provider.Arguments.of("A457D31F314C6871DA38345AD43DD2B3BA0821BCC6C0593C3611120EABC9B2A4"),
        org.junit.jupiter.params.provider.Arguments.of("A570F6683E3A7DC3BEEF596A3FC06C9794340E3671C0F25ED14C64D2D5A65DE57606A988B077334AE2F1E310E0B109DD"),
        org.junit.jupiter.params.provider.Arguments.of("A588957BD52141A0D99EA18717929FC36976135E1043B226B262CD9C5F4BB587C0D205E0323753558A782064DB61F261"),
        org.junit.jupiter.params.provider.Arguments.of("A6D672F9BB3EC2A17002423A3E95F2E1"),
        org.junit.jupiter.params.provider.Arguments.of("A805226A1BBD7A6A07CEA82994039DD868ABDAD92A7DCE0E676731B6EF709604CF362BD36CE1A8280C4609C6C033B0D4"),
        org.junit.jupiter.params.provider.Arguments.of("A841E939444A7B4873364AA9E976ED16"),
        org.junit.jupiter.params.provider.Arguments.of("A9978792DF2FBE48A7C6625D6FAFE1B0"),
        org.junit.jupiter.params.provider.Arguments.of("AA98660D2C32F247942B459B0E29D8C4"),
        org.junit.jupiter.params.provider.Arguments.of("AB954A984D8B8329AE797C292E1CE2DA79DDBFA4F607EAF7F9BFF79249A6C6A6"),
        org.junit.jupiter.params.provider.Arguments.of("AC8003EE2437FFFE6414A1E9FD22E5C95A9F7EEC0AEBCFF76BB9DCA965FD386C"),
        org.junit.jupiter.params.provider.Arguments.of("AD9951B32564AA9F8D982C6563CA4B9DE680D81158C887B944FBD09431FD00812929D2AC758E5D6E1EDF48927CA71EDD"),
        org.junit.jupiter.params.provider.Arguments.of("AEB7080608C9843287BC83B80B905626AF8C087B92B8AA2C1D01A49A7F13C9A026E0A956DFC433C4F9B17D3CBA371C268AA14B9F13B4742F423FA3267188C3FC3516D7DBF9871506594B72EC71F024AD"),
        org.junit.jupiter.params.provider.Arguments.of("AF662AE94328917C20CBA4175F58DE09C215429167CF4614BF9ED0FB92CAE830773E69B9EBA5753ED3D7DE9232A4F16E"),
        org.junit.jupiter.params.provider.Arguments.of("B39DE9521E2BAAA91B911F3283D2681B531D31AB705C3E8A805A481A09CD38BA"),
        org.junit.jupiter.params.provider.Arguments.of("B58B7579907A819FD097DEF52EA694698FD886C434D5D51DAEA637670497D44439D390877B5FD5FCBAB99E3379E14695"),
        org.junit.jupiter.params.provider.Arguments.of("B5D6F315FF5552737582D6CC6369BE55416D33C906FCE71EB20ED826A314A0A2"),
        org.junit.jupiter.params.provider.Arguments.of("B6548B67E6A3364F9409F89806CF0E8F"),
        org.junit.jupiter.params.provider.Arguments.of("BC4CA68A9B4E4565C542BD8BFE8EA52B1E96446C9EDF9915B28B8294CCD0B445"),
        org.junit.jupiter.params.provider.Arguments.of("BDAA0DA2FF5ABA3335945CC1A35287F8CBA3A0F5FA81C135769EA319705EE687D76EEE7866428391991C829E258B4F66"),
        org.junit.jupiter.params.provider.Arguments.of("BF5D613972A8D5F2D8250060A858C0E3E0C3E1834241B70225F047C6F61B75BB"),
        org.junit.jupiter.params.provider.Arguments.of("BF964E51BDF0A9C965C97A8CAB18F4A800A9536A3BA492E1715380CAC32A29E2"),
        org.junit.jupiter.params.provider.Arguments.of("BFCC56A72B7176BE1EC25EC71E242E8C3A521B64D994FC3760A9DC00A900E5C9C27901AA234AC35ACB455923BB73FA71"),
        org.junit.jupiter.params.provider.Arguments.of("C041575BA7ED7E184B6FA9A6A1467652"),
        org.junit.jupiter.params.provider.Arguments.of("C1FBD71658025AD3F7A11F5132C7673EF382B08590C3CE4C3A37A5D09F3C07EF"),
        org.junit.jupiter.params.provider.Arguments.of("C2E0BA12F206CF927EFAADA7744D0ED54829EC557C690BFFFF6D64ABA3735DB1"),
        org.junit.jupiter.params.provider.Arguments.of("C69B34C4435117093BB2B6D4169C80D7BDFB5D7230F0972B21FE5E23D6565EABF3E73C7BB8860E1FA4DABCA8E6FA98DE"),
        org.junit.jupiter.params.provider.Arguments.of("C7BD93E8DE291EC7C5A5B273FCB2EDC4DFDFAC009BE3B33DC0204E67859F5CB9"),
        org.junit.jupiter.params.provider.Arguments.of("C9765DE5AB5B87FF9A52002F1DB993001B2E360AE5488B987D2026640750B5F7"),
        org.junit.jupiter.params.provider.Arguments.of("CFC2F99030AB919B36289336E08796244C09E2718AB44795785DC723113ED7EA"),
        org.junit.jupiter.params.provider.Arguments.of("D13DF53A6DE498267D6A0A048C74E56D43C1E30940DDA05ADA05C147B5AC1734"),
        org.junit.jupiter.params.provider.Arguments.of("D38CEC4D97E4B9E4C7EA5B70901F5BE3976C8B7C67A00B717B62BF4242745D5F"),
        org.junit.jupiter.params.provider.Arguments.of("D393FE86BC3010A02DE1F7A17FEB3ED9"),
        org.junit.jupiter.params.provider.Arguments.of("D4931D2C80986BC25EFC77C56728C591"),
        org.junit.jupiter.params.provider.Arguments.of("D5AC3A739213158A26B7A4E71348FC7F4827B19B20C90CC09D380A76E44BF4E0754ACE97153C0F5B227EB67AF0DAD16E"),
        org.junit.jupiter.params.provider.Arguments.of("D68FB002119B6F3BFF514F5D2FD5A0DF09951023FDCEA1B3AE82B2BF8353AF4B"),
        org.junit.jupiter.params.provider.Arguments.of("DB93BCD948C4304284F9353A9B38ED88"),
        org.junit.jupiter.params.provider.Arguments.of("E103C9F7F49C154390801A2FB8C3558F0A0898458A026628438D1AA3F87486E806F3A113519E94737F2826BF4E5D2DAE"),
        org.junit.jupiter.params.provider.Arguments.of("E3DF52837EBD78CB8ADE5DEEFAC6DABCEA301115DADB6E082ED1E3AB7F27930C"),
        org.junit.jupiter.params.provider.Arguments.of("E5310EA48DE1FC15BF15762D373031FF"),
        org.junit.jupiter.params.provider.Arguments.of("E9C19D6077B3ADE7CEBA5A7B77165F65175BE0D6193BC171E27D68004C9A856C45985EE3913BEB8C9D817F1B6339C100"),
        org.junit.jupiter.params.provider.Arguments.of("EB9C86A85FC725A757E7E49498560BDFFF7652697F50D97428E69EAAE8855AB3"),
        org.junit.jupiter.params.provider.Arguments.of("EBABECD1AF6D91166979D50B9CBE3C02CB6E0FCBED51E83BDF9DCD35367C59673CC647B268BF9ED69027E1F07F3F5F4D"),
        org.junit.jupiter.params.provider.Arguments.of("EEAE2C1F828D9581D95CA7218FCC09F0AD7A0AC2E208C8B9FEE7F5BEE167880B"),
        org.junit.jupiter.params.provider.Arguments.of("F3D268316954FA19C3117C4C4310FEF3E1F4E36CA8E76C54556D808988C52D7332E03BBE8D211B7CDBD0C1545FFC7897"),
        org.junit.jupiter.params.provider.Arguments.of("F43F75F4704D094D8FFC38B26675C540"),
        org.junit.jupiter.params.provider.Arguments.of("F461DD2103894E41BAE3CA2CF1A2A7C1"),
        org.junit.jupiter.params.provider.Arguments.of("F76A2691DD87557BB8B4F99AB8F7643243CBADC02713D36C226ECAB49AC8F00AC1EE200208685CB774F2A700F063305D"),
        org.junit.jupiter.params.provider.Arguments.of("F76DC0FD4A149BA4C70AB4E767FA4704B19F601848C834DCEE7E512C96A12A0978382521270CF0572A05D1B462F610F8"),
        org.junit.jupiter.params.provider.Arguments.of("F87CBA72D16A880ED0398BDE4738011139EC4BA84822FCC51CDF04EFBB9697A80CF67BDFA3E669DCEB5CB85121E07EEC413E8E3A5ECE4601396E5EA7D014BC8BE1D443755F8FB47C310ECF0F8558E7DB"),
        org.junit.jupiter.params.provider.Arguments.of("FACFD1CEDE7D56670FFA6F5A301866C81BFFC3428BE7F308AB3D3156B1B12877"),
        org.junit.jupiter.params.provider.Arguments.of("FAF601AC4592BFD0D62FCD1C3508A0F22E52B146925B46E36C0F4A9EE6ADA2554DA26E091E039F578BD35F8025E2C8FD"),
        org.junit.jupiter.params.provider.Arguments.of("FC89876DF9E70EF1CD9C2361DF5F6F2CEA770F5B29E0522413FDD48932D49644"),
        org.junit.jupiter.params.provider.Arguments.of("FE94A1CE2DF17382EBF35A220D9AB5B4C681ECC4FD914A4503706FDFE0AAF74D746B4C8B95605032ED1039A0AE94DCE3"),
        org.junit.jupiter.params.provider.Arguments.of("FEE716659400AB07A964B7E7B665FA4519B6AE5FE120ADBCFCB9A4E5C24B673490C4C756ABC140CE5D6674336FD9C6D6B172EDB2DC4ABA59576EEB4EAA028E98F7CC5E4E5B02EF3C12E95EEAE3254209"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0000"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0001"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0002"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0003"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0004"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0005"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0006"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0007"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0008"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0009"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF000A"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF000B"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF000C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF000D"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF000E"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF000F"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0010"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0011"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0012"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0013"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0014"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0015"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0016"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0017"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0018"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0019"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF001A"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF001B"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF001C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF001D"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF001E"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF001F"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0020"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0021"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0022"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0023"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0024"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0025"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0026"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0027"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0028"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0029"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF002A"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF002B"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF002C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF002D"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF002E"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF002F"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0030"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0031"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0032"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0033"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0034"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0035"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0036"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0037"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0038"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0039"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF003A"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF003B"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF003C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF003D"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF003E"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF003F"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0040"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0041"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0042"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0043"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0044"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0045"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0046"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0047"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0048"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0049"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF004A"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF004B"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF004C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF004D"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF004E"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF004F"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0050"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0051"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0052"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0053"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0054"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0055"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0056"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0057"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0058"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0059"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF005A"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF005B"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF005C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF005D"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF005E"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF005F"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0060"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0061"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0062"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0063"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0064"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0065"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0066"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0067"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0068"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0068007400740070003A002F002F007700770077002E006E00610070002E006500640075002F0063006100740061006C006F0067002F00310031003100340030002E00680074006D006C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0069"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF006A"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF006B"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF006C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF006D"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF006E"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF006F"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0070"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0071"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0072"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0073"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0074"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0075"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0076"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0077"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0078"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0079"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF007A"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF007B"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF007C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF007D"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF007E"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF007F"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0080"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0081"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0082"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0083"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0084"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0085"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0086"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0087"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0088"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0089"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF008A"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF008B"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF008C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF008D"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF008E"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF008F"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0090"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0091"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0092"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0093"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0094"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0095"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0096"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0097"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0098"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF0099"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF009A"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF009B"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF009C"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF009D"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF009E"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF009F"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00A0"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00A1"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00A2"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00A3"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00A4"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00A5"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00A6"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00A7"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00A8"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00A9"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00AA"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00AB"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00AC"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00AD"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00AE"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00AF"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00B0"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00B1"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00B2"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00B3"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00B4"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00B5"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00B6"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00B7"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00B8"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00B9"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00BA"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00BB"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00BC"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00BD"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00BE"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00BF"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00C0"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00C1"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00C2"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00C3"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00C4"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00C5"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00C6"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00C7"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00C8"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00C9"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00CA"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00CB"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00CC"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00CD"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00CE"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00CF"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00D0"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00D1"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00D2"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00D3"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00D4"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00D5"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00D6"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00D7"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00D8"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00D9"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00DA"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00DB"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00DC"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00DD"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00DE"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00DF"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00E0"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00E1"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00E2"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00E3"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00E4"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00E5"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00E6"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00E7"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00E8"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00E9"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00EA"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00EB"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00EC"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00ED"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00EE"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00EF"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00F0"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00F1"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00F2"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00F3"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00F4"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00F5"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00F6"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00F7"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00F8"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00F9"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00FA"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00FB"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00FC"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00FD"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00FE"),
        org.junit.jupiter.params.provider.Arguments.of("FEFF00FF"),
        org.junit.jupiter.params.provider.Arguments.of("FFFE68007400740070003A00"),
        org.junit.jupiter.params.provider.Arguments.of("b6548b67e6a3364f9409f89806cf0e8f"),
        org.junit.jupiter.params.provider.Arguments.of("d4931d2c80986bc25efc77c56728c591"),
        org.junit.jupiter.params.provider.Arguments.of("e5310ea48de1fc15bf15762d373031ff")
        );
    }
}