package com.adventofcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Day_2_1Test {

	@Test
	void example() {
		String input = "1-3 a: abcde\n" +
				"1-3 b: cdefg\n" +
				"2-9 c: ccccccccc";

		Day_2_1 solution = new Day_2_1(input);

		assertThat(solution.solve()).isEqualTo(2);
	}

	@Test
	void my() {
		String input = "17-19 p: pwpzpfbrcpppjppbmppp\n" +
				"10-11 b: bbbbbbbbbbbj\n" +
				"17-19 c: ccccccccccfrcctcccjc\n" +
				"8-10 k: kkkkkkkfkkks\n" +
				"13-14 l: lvllvllllslllv\n" +
				"8-9 n: nhhcnnnknnqnb\n" +
				"1-3 d: pdbdfbws\n" +
				"5-6 v: vvvgvb\n" +
				"7-8 x: gxcxtwbl\n" +
				"2-15 r: xlgrwqpcsqtrvfrrt\n" +
				"9-14 l: glnldlllllllln\n" +
				"2-3 r: vxnw\n" +
				"8-9 g: gfggczgkgggjgg\n" +
				"4-5 d: ddddh\n" +
				"6-9 t: zttttbhbttttftd\n" +
				"3-6 k: kkkzwnmv\n" +
				"2-7 w: sgmvplwwjx\n" +
				"11-13 h: hhhvhhhhhhvhh\n" +
				"9-10 f: mhfdfffffmlffsfvts\n" +
				"17-18 l: llllllllllllllllrzl\n" +
				"4-5 c: crcccccccvc\n" +
				"9-12 q: qqqqqpqrqqlcq\n" +
				"7-8 n: nnnnnndn\n" +
				"3-5 f: ffqnfpffhf\n" +
				"3-4 j: djpj\n" +
				"17-18 q: qqqqqqqmqqsqqqqqjq\n" +
				"8-15 j: bjmjbbqfjjrgjgfkjj\n" +
				"2-11 d: xdgdmxgwzdpdxdhjwd\n" +
				"8-9 p: bppppppmp\n" +
				"10-11 t: ttttttttttb\n" +
				"5-8 v: vhxvfcsvvxjvvvpgwdv\n" +
				"9-17 q: mqqqqqqqqqjvqqqqzlq\n" +
				"1-2 t: tptbbn\n" +
				"9-11 q: gqqqqqqfwqqqq\n" +
				"8-9 h: hsdsfkgphxglmsjndhh\n" +
				"2-3 z: mzgz\n" +
				"4-16 n: nxnsqmrnnnpfvnfnb\n" +
				"1-3 r: rbzcrkjrqrrnjxj\n" +
				"1-5 c: ccccccq\n" +
				"4-11 m: mmmgmmmmmmm\n" +
				"8-9 z: zlzvzzzpzz\n" +
				"1-18 h: xzqhmkzhhrtxpljptbc\n" +
				"3-4 p: pbpg\n" +
				"16-20 j: jrfjjzjjjrjjgvjkzjjj\n" +
				"6-9 t: ctdtthtlttttpt\n" +
				"3-4 h: mfhj\n" +
				"5-10 t: tgtxttqhtl\n" +
				"1-3 w: fwgw\n" +
				"6-7 q: qvqlrqp\n" +
				"12-13 m: mmmmmmmmrmmmplm\n" +
				"12-14 r: rrrrhrrrrrrrrbrc\n" +
				"4-6 b: ljzbqgwxcdmdjfbcwd\n" +
				"7-10 g: gggggggmgpg\n" +
				"2-3 c: mbcc\n" +
				"7-8 k: kbkkkktkckc\n" +
				"7-8 p: pppppppbp\n" +
				"5-8 w: twwwwwwgvvwvdttmh\n" +
				"13-17 p: ppppfppppppppppppp\n" +
				"8-12 x: xxxcxxxbjxxxxk\n" +
				"9-18 b: hhbbqcbbbsblbgpwbbhf\n" +
				"6-8 h: hhhhfhhchhjhhch\n" +
				"7-11 g: ggtnwvcdgctkrggxj\n" +
				"5-8 k: kknhndzm\n" +
				"4-5 z: zzznz\n" +
				"2-4 p: pbtp\n" +
				"16-18 r: rrrrtrrrrrrrrrrhrr\n" +
				"15-16 r: rhrrrrrrrrrrrrrx\n" +
				"7-10 l: lllklmhxzlxcdljz\n" +
				"7-8 q: qqpwsqqb\n" +
				"9-13 k: qkknkkxlzkrkkkkkpk\n" +
				"4-8 h: wlrhfbth\n" +
				"6-8 q: vppqqqgntfqqgqq\n" +
				"19-20 g: ggggggggggggggggggfg\n" +
				"4-5 m: shmzmsdm\n" +
				"3-4 k: kkhkk\n" +
				"4-7 b: cbsqkcpnkcfzhmpvfvgz\n" +
				"18-19 l: lllllllnllltdlwgllxl\n" +
				"14-15 z: zztzzzthdzzzzzn\n" +
				"9-10 s: ksssbsssstss\n" +
				"2-10 t: mltjpttttthpttttz\n" +
				"3-9 n: pqnpfxgfnzqxv\n" +
				"7-11 d: ndddddhdddddddd\n" +
				"11-13 v: vkvbwrchzvhhvpc\n" +
				"13-15 l: llllllllllllllll\n" +
				"10-13 c: ccclwbcbccbxvcrdzctc\n" +
				"8-9 w: klvwtwwwbwhww\n" +
				"2-4 j: mnmb\n" +
				"10-14 w: wwwmwwwwwwwwlnwsw\n" +
				"14-17 x: xxxxxxxxxxxxxlxxkxx\n" +
				"3-7 r: bxrqzxsrfmclfdrqrtpf\n" +
				"7-14 b: bbbbqbbbbbbbbbbbbbb\n" +
				"7-13 p: wwvhwdprjxppwnhsbp\n" +
				"2-3 h: hqhh\n" +
				"8-11 n: nnnnnnnjcnn\n" +
				"5-12 l: cwzxlpvwlsfjqrgk\n" +
				"3-5 v: vvphwvv\n" +
				"5-16 d: dpdrdfdrhwdrrqdqxd\n" +
				"14-18 z: zzzzzzzzzzzzzzzzzkzz\n" +
				"2-5 h: hcjlh\n" +
				"12-13 w: wwwwwwwwwbwlw\n" +
				"15-16 c: ccccccccccccccxc\n" +
				"4-7 b: lbbsbbwhb\n" +
				"2-5 z: qtwmzhzmwqw\n" +
				"5-6 d: drjddc\n" +
				"7-9 q: qqqqjqqfdqq\n" +
				"14-15 r: rvrqrrrrrwsrrmrrd\n" +
				"16-17 h: hhhhhhhhhhhhhhhhlh\n" +
				"10-16 f: fvhgfzffchmffgfff\n" +
				"3-7 q: qcqlvdvgrqtqcq\n" +
				"7-9 x: xxsxxrxxpsx\n" +
				"3-10 h: hjhjthhrthcdhhhhxz\n" +
				"15-16 t: tttttttztwbwptjt\n" +
				"3-5 x: xrlxqx\n" +
				"3-4 b: bbbp\n" +
				"1-4 n: jnhnndn\n" +
				"3-6 c: ccccfm\n" +
				"7-8 v: tvtvdvspvvv\n" +
				"6-8 l: lljlllgsglcsw\n" +
				"2-13 h: jhzzcgpxhbgqsbwhf\n" +
				"17-18 j: jjjjjjjjjjjjjjjjhc\n" +
				"2-3 c: ctcchxklnbrqc\n" +
				"3-14 w: wwcwwwwwwwcwww\n" +
				"1-3 k: kcxf\n" +
				"9-14 t: ttttkttlnttmtttt\n" +
				"2-4 x: xkxxqzxvck\n" +
				"5-6 h: dgmxghjxjnhs\n" +
				"4-12 f: fvhlffxnfjhfffqxfcf\n" +
				"1-10 b: pfsbflbbkbqk\n" +
				"8-9 s: qzkfszjss\n" +
				"1-14 m: mmmmmsmmxmqmmmmmmmm\n" +
				"11-13 w: nsgwwwwwwpbwvwww\n" +
				"2-15 t: sprsbpztsznslst\n" +
				"3-4 d: tqscgnrjxrqdwqd\n" +
				"5-17 x: xqrzxxxxfxzxrzxxxw\n" +
				"8-9 m: mkmhmgdmq\n" +
				"6-8 q: qqqqqqqxq\n" +
				"2-5 m: mmmmmf\n" +
				"4-13 v: gvvvsvfmmmvvx\n" +
				"13-16 t: ttttttttgtvtwttntt\n" +
				"8-16 c: ccccccczccccccccc\n" +
				"10-11 b: bbbbbbkbbvbbbbb\n" +
				"1-12 n: pnnnnbnhnnbng\n" +
				"5-6 b: qbbbbb\n" +
				"4-6 z: zzzzzvjzzznxdzx\n" +
				"2-3 p: dwxqpjp\n" +
				"4-6 w: wwwxwq\n" +
				"2-3 x: pvpdh\n" +
				"5-8 n: pqnnkncnnfnnnnnn\n" +
				"10-12 w: drqwwxrwwkwwwswwl\n" +
				"2-4 g: rbggfslgjqqhj\n" +
				"9-19 r: pzxhrcfrrrqjqfkhrhjz\n" +
				"3-6 n: rngtnnnnn\n" +
				"4-14 t: tttttttttttftgttttht\n" +
				"6-8 q: qqdtqqmrgqcqqqqc\n" +
				"3-14 t: tttnttttttttqk\n" +
				"9-10 w: qqwcjzwgjnqdrdxwjwl\n" +
				"10-12 t: tthtthtktvtttt\n" +
				"2-7 v: vzvvvvv\n" +
				"5-17 p: zzpsmpgpprdmhxprsvs\n" +
				"8-9 t: ttttttvnt\n" +
				"4-8 v: vvvfvvvvvvvvvvv\n" +
				"7-15 h: cwkhdzmththzjnh\n" +
				"7-9 v: vjvlwzvvmv\n" +
				"1-2 c: hchw\n" +
				"7-8 f: ffpfffsfqf\n" +
				"5-8 s: xlssskszb\n" +
				"2-15 x: fxzpbvqzmkxvtlljjrg\n" +
				"1-3 s: hsss\n" +
				"7-14 m: xmmtmmmgmrmmxzmxm\n" +
				"10-13 z: dnzztzzzzzfszxzczg\n" +
				"3-8 h: rhthhnhh\n" +
				"6-9 g: hbggggggggbg\n" +
				"13-15 z: zzzzpzbzzzzzfzzz\n" +
				"5-15 l: llllwlllllllllll\n" +
				"3-5 m: dhmmm\n" +
				"2-13 h: hrrhgqhhnhkhhhhb\n" +
				"1-5 p: kpppp\n" +
				"2-13 m: fmqjmrzhskzwdnt\n" +
				"7-8 q: bqxvzqqsjpqqqq\n" +
				"2-13 d: ddhdddddddddbddddd\n" +
				"5-9 s: nhkmxssqsjssjs\n" +
				"2-11 b: vlrtxpzkqwb\n" +
				"6-7 q: qqqqqcq\n" +
				"7-9 n: nnnnnknnmgn\n" +
				"3-9 n: qfkxknwnn\n" +
				"15-16 d: dddddddddddddddgd\n" +
				"12-13 h: hhhhhhhhhjmvhhh\n" +
				"3-4 w: tbfw\n" +
				"8-9 f: fkffbfhtf\n" +
				"2-4 q: qjsqqf\n" +
				"2-11 t: ttttpdgtlxhtx\n" +
				"7-10 k: dkkkkkkkkh\n" +
				"6-7 c: hccccxcgv\n" +
				"6-7 j: sjcbfmj\n" +
				"1-2 w: vtrwjcgndvwx\n" +
				"12-13 m: mmmcmmmmmmmms\n" +
				"3-7 h: hhhhhhw\n" +
				"9-13 g: gghgwgrrkgcgg\n" +
				"12-13 g: gggggggggggfgggg\n" +
				"13-16 s: sssssssfsssssszb\n" +
				"2-17 p: pbpmpmwpnqppppppphbd\n" +
				"2-9 c: cmrcwfnjcdcxccccrzc\n" +
				"8-12 j: jvjjjcjxjjdqjjjr\n" +
				"6-9 m: mgjxmcfdm\n" +
				"2-5 l: klmxlx\n" +
				"2-10 x: jvxwxpxrxx\n" +
				"2-3 r: rrzrp\n" +
				"2-12 v: cbfrnctdmzwvlbvjmdgg\n" +
				"2-9 r: wrbrrrrzm\n" +
				"12-13 h: fhsbhhhhhhhwhhhhhh\n" +
				"5-8 d: ddhqdddddp\n" +
				"4-5 l: djnlnlllbl\n" +
				"2-9 t: tdtgttddtwwj\n" +
				"16-20 t: tttttttttttttttttttt\n" +
				"5-8 z: zzzszzzmszz\n" +
				"8-13 d: dddddddbdzwddd\n" +
				"9-10 z: zzztzzzhzxgz\n" +
				"10-12 p: wppcppxpppgpppzr\n" +
				"4-5 w: wkwtwwzww\n" +
				"3-9 m: dmmmrmmmm\n" +
				"1-4 g: gvmr\n" +
				"8-9 d: frxndpdzwd\n" +
				"17-20 q: qqqqqqnqqqqqqqqqhqqq\n" +
				"7-13 w: pwfwwrwwwkwww\n" +
				"3-5 q: qqpqw\n" +
				"11-13 p: pplpppppppppb\n" +
				"4-12 g: glggjmsggggjrgbgm\n" +
				"3-7 p: cfphqrxpsgthp\n" +
				"12-15 f: gfnrhffgftnbggfwtbp\n" +
				"16-18 p: pppppppppppppppppm\n" +
				"3-4 l: lllzn\n" +
				"1-2 d: dddd\n" +
				"8-12 n: nnnnxnnhnnnn\n" +
				"2-4 z: zzzzz\n" +
				"1-4 s: sssms\n" +
				"2-4 h: hghhh\n" +
				"1-10 l: nhtnzhdtmslxqskf\n" +
				"5-13 j: bpzjjrrqzndjtw\n" +
				"1-2 x: xxchn\n" +
				"1-16 v: vjvrxvdbdnvvkzvg\n" +
				"9-10 b: xbvzbbmfmbqbbvbbrb\n" +
				"8-12 k: ktnkfbgkkkkbkmkk\n" +
				"7-9 h: hhhhhhwhh\n" +
				"16-17 g: sgggmggggggggggvggg\n" +
				"3-10 q: qmlqqqqqqq\n" +
				"11-14 h: hhhxhhhhhchhwkh\n" +
				"9-14 f: kqwqcftkfdxgmsd\n" +
				"12-13 p: pppppppppppph\n" +
				"7-8 f: dkfnjfff\n" +
				"5-6 f: jtfrrfxckhfmfffszggg\n" +
				"6-8 n: jzhpkszn\n" +
				"8-10 c: cccccnckcxmrchjc\n" +
				"14-15 d: dddjdjdddddddpp\n" +
				"8-10 f: cfshmqfffwtffltfzff\n" +
				"3-4 b: bdbq\n" +
				"2-6 b: cfqkbtvmn\n" +
				"15-16 z: zgzzqzjhzzmnzkzvzz\n" +
				"4-6 r: krrrrlm\n" +
				"3-6 c: dcczrfr\n" +
				"8-9 s: ssssssfws\n" +
				"11-12 s: mssssssssssq\n" +
				"1-2 r: zrznpmzrs\n" +
				"10-11 k: kkkkkkkkkfk\n" +
				"3-9 k: kbkkkkgkk\n" +
				"1-4 w: lwwtw\n" +
				"3-4 t: ttkt\n" +
				"2-3 m: htvmjk\n" +
				"2-4 p: mdpp\n" +
				"10-17 s: ssssssssssssssssws\n" +
				"1-2 m: gmmc\n" +
				"5-9 d: dddbvjkdd\n" +
				"5-8 z: tmnfplzz\n" +
				"7-14 s: ssssssssssssstkss\n" +
				"2-7 q: gqbcxnqcvszwbxqkz\n" +
				"6-17 b: btbxlbbbbbbbbbvtbkd\n" +
				"6-9 l: lllllllld\n" +
				"11-12 q: nqqjjrhgxgqp\n" +
				"6-9 n: nlnnfnnjb\n" +
				"13-17 x: xnxxxxxxxxbdbxxrc\n" +
				"5-13 w: wwtwrwzwwwqfwtkwtwbw\n" +
				"5-10 g: gggxbgmgrgggggg\n" +
				"13-16 h: mhhhhmshhchhhhhl\n" +
				"2-3 f: flff\n" +
				"2-4 k: kkhr\n" +
				"2-6 m: mmmqmml\n" +
				"6-7 p: ppppppp\n" +
				"2-6 k: ksktkkk\n" +
				"2-4 m: gkml\n" +
				"5-6 h: hhvqhjz\n" +
				"2-5 h: hkhqhfh\n" +
				"3-4 z: zzglz\n" +
				"2-3 f: zhfn\n" +
				"10-11 m: mmzmmmmmmfmm\n" +
				"3-13 d: ddwzdmmddmddz\n" +
				"1-2 h: hvkhm\n" +
				"4-5 n: nnnnb\n" +
				"5-7 f: fjppbffffz\n" +
				"2-4 g: tmlp\n" +
				"15-16 q: bqfvqqqcptqqzqqx\n" +
				"18-19 g: lpgqgcgsdtngfddbggnp\n" +
				"3-5 z: kjzkq\n" +
				"1-6 q: qjkqqzqq\n" +
				"3-4 m: bpmmjgmmfmj\n" +
				"2-5 k: jkvkz\n" +
				"11-14 q: qqqbjqqqqqgqqq\n" +
				"6-17 q: bfqqtlqqfjgqtqtqs\n" +
				"5-16 s: ssdzfbsdhsszspssvs\n" +
				"1-7 n: nhnvmhb\n" +
				"4-5 b: hbbrk\n" +
				"9-14 f: fffbffkfftcfnfgf\n" +
				"1-3 n: nznxndpb\n" +
				"3-4 k: qkktw\n" +
				"3-8 r: rrprrgrrr\n" +
				"2-5 l: sqmllls\n" +
				"6-7 n: njnknvnnpvlbnx\n" +
				"3-5 t: hbrtmcttt\n" +
				"5-9 j: fjjnjcgjhnkcpqjbc\n" +
				"2-4 l: jllx\n" +
				"7-8 d: dddddndd\n" +
				"3-6 t: gtsttjnt\n" +
				"9-11 m: cbmgjlqcbsmllm\n" +
				"1-2 l: vllfcckl\n" +
				"10-11 p: ppppzppppplp\n" +
				"2-4 m: slzmmrw\n" +
				"3-8 h: bhhgmpbs\n" +
				"7-14 t: tttttthttttttttt\n" +
				"1-3 r: rrvvrrprwrfrcr\n" +
				"5-15 w: gwbhwjwwwkswcsww\n" +
				"2-5 v: zvtls\n" +
				"1-4 v: vsvv\n" +
				"10-15 z: zzzzzzzzzztrjzr\n" +
				"3-5 v: vvvjhdvv\n" +
				"3-12 s: wqssnmdlwlws\n" +
				"2-3 r: djrftptcrskpzrz\n" +
				"1-3 p: nbppgkmfnjp\n" +
				"17-18 w: wwwwwwwwtwwwwwwwrw\n" +
				"2-5 l: xqntklqlt\n" +
				"2-5 g: gtkggghcvgl\n" +
				"18-19 z: zzzzzzgzzzzzzzzzzztz\n" +
				"16-17 x: xxcxxwxxblpxzkfxzj\n" +
				"15-19 f: frffffstcwffccffffff\n" +
				"3-4 n: npnm\n" +
				"2-3 d: zvddd\n" +
				"7-9 x: xzxxctxxl\n" +
				"13-14 s: hhsxbzssdtssfss\n" +
				"4-5 m: vbpmhmrmvrjnmhlsbmm\n" +
				"3-6 z: zzzzzwdzzzzzzzzzz\n" +
				"18-19 g: gggggggggggggggggng\n" +
				"14-15 x: fxxjxxxxxxmxxwxxnxb\n" +
				"10-12 m: xmmmmfmdmmkh\n" +
				"3-4 b: bbgbgb\n" +
				"11-13 c: cclcccbcxcccqcczc\n" +
				"10-17 w: wwwwwwwswwwwwwnwpw\n" +
				"5-7 l: blllqll\n" +
				"4-10 n: nnnnnnnnntn\n" +
				"9-10 z: fzzztzczwzzgkzzn\n" +
				"4-5 x: gxjhxbxxx\n" +
				"3-6 p: plhxppk\n" +
				"10-19 p: mpgpmxdvqphrcckpvqw\n" +
				"3-14 p: kfdwtqxpstpcfpgcfmp\n" +
				"2-6 k: gnxkkkjrzkknskmpbsj\n" +
				"8-10 l: lzllklldplllzl\n" +
				"16-17 n: nnnsnnnnnnnnpnnjnnn\n" +
				"1-14 c: kccccccccgccccc\n" +
				"2-11 s: lsqghkzwsgsbdmgq\n" +
				"6-7 p: pcpgqrcpqpptpm\n" +
				"1-11 h: lhhhhhhhhqhhxbhhfhhh\n" +
				"11-12 r: rrhjrbrrvrrrrdrrr\n" +
				"5-8 c: cccccwck\n" +
				"6-8 w: wwwwwwwb\n" +
				"12-15 n: htvxnnhvnpnnknnhnt\n" +
				"1-2 c: jcct\n" +
				"2-10 v: vsvvvvvvvvv\n" +
				"4-5 x: xhxtx\n" +
				"3-4 f: ffxf\n" +
				"5-8 v: wprmvflppqwvwfwpkq\n" +
				"5-7 n: znnnnnxblcrn\n" +
				"8-9 n: zljnjjbnn\n" +
				"10-11 m: mzwkrvmzrdc\n" +
				"3-7 h: hxkhfhcqhr\n" +
				"6-13 j: vhcmljdxwkqnfcvmjjb\n" +
				"1-6 g: gvgggthkr\n" +
				"6-10 l: bldnllklkllllclslm\n" +
				"6-7 g: gggggng\n" +
				"1-4 x: xxxxxpnsv\n" +
				"15-16 q: qqqqqsqqqqqqqqqbq\n" +
				"6-7 q: qnqqqdqqq\n" +
				"5-6 p: ppppspppp\n" +
				"3-5 k: kkskkk\n" +
				"1-2 j: jrjjjjj\n" +
				"8-9 d: ddpzdlldmddhdhdd\n" +
				"5-8 t: ttsljtnt\n" +
				"2-4 w: qwwmwwhwwwwwwww\n" +
				"6-8 c: clcccccv\n" +
				"1-8 f: ffbfqfpfbfb\n" +
				"5-13 r: rrrrkrrrrrrrrr\n" +
				"15-18 v: vvvvvvvvjvvvvvvvvvvv\n" +
				"7-8 r: xjwxkzqrrxr\n" +
				"7-10 d: kddddddddbddd\n" +
				"1-8 k: kkkkkkkkk\n" +
				"4-6 q: rhdkjsqjqvzqcpsnq\n" +
				"1-2 t: tdtt\n" +
				"5-6 l: lllwlh\n" +
				"3-5 f: pdzfff\n" +
				"7-8 s: qsswssks\n" +
				"3-5 d: dcdddd\n" +
				"1-12 r: rvlrrrwdtkrcxffr\n" +
				"2-7 d: rddcdlqtnffbdd\n" +
				"5-9 t: phmtdzfjtdb\n" +
				"9-12 x: jxxxxxxxxxxcx\n" +
				"14-16 c: fcclccccmcnccwccqccv\n" +
				"4-5 p: zxpzk\n" +
				"15-19 t: ttttttttttttfkttttl\n" +
				"5-10 k: kdmjgkkkkkblkvkkkk\n" +
				"6-15 q: wqgmcqcmcjlgxkqrdstw\n" +
				"6-7 r: rrrrrrr\n" +
				"2-6 n: ksnnnnnzn\n" +
				"16-17 g: ggggggggggggggghgg\n" +
				"11-13 k: nsgkkkkzckxtkn\n" +
				"2-5 q: jqvkqm\n" +
				"2-10 q: lpqqmqlqqqqqtqqw\n" +
				"10-20 k: dkztkkkkshkkkkkkkkdk\n" +
				"4-7 d: fddddxd\n" +
				"3-5 v: vvvvs\n" +
				"7-9 b: bbbbbbrzb\n" +
				"4-14 z: nbnzkbxbwhqpjsdlzz\n" +
				"3-14 x: xxvxxxnxxxxxxxdxktxx\n" +
				"7-9 z: qqpzzxzvsgzfzdzz\n" +
				"14-15 c: ccccccccccccccmc\n" +
				"11-12 k: kkkkkkkkkskv\n" +
				"15-16 d: ddddddddddddddddd\n" +
				"6-8 x: xkjhxwgxxzxxnzwxcxk\n" +
				"2-6 t: tmwttc\n" +
				"7-8 w: jwcwwwql\n" +
				"5-14 d: jdpddtkddrdddpq\n" +
				"9-14 t: mwctmnjxmztckt\n" +
				"4-8 l: llnlxlmjn\n" +
				"3-6 s: sssskvk\n" +
				"4-8 c: ccchcrctczt\n" +
				"4-6 s: wssnlsnsss\n" +
				"8-18 s: sfkssssbswshsvshms\n" +
				"6-7 b: bbkbcffmwblcmp\n" +
				"8-15 w: fwwmswcwwhlwjwvtlq\n" +
				"2-9 n: wnnnnmqhdpsnzn\n" +
				"1-7 x: xkzzxpz\n" +
				"5-8 x: txxxxmlxkrxsxzsx\n" +
				"7-10 t: lchndztdttgk\n" +
				"1-2 q: tqqq\n" +
				"1-9 z: nzzzzzzzz\n" +
				"1-2 l: djfmfwpnjclt\n" +
				"2-6 x: xxxxxmxxs\n" +
				"2-4 p: ppcv\n" +
				"4-10 d: dddpddddddd\n" +
				"8-11 n: nnnnnnnxnnnn\n" +
				"17-18 v: vvvvnvtvvvjvvvvvzzvv\n" +
				"5-8 h: hhhhhhhfhh\n" +
				"9-16 v: vvvvvvvbvvvvsvtq\n" +
				"3-4 r: hrhrrtrgrr\n" +
				"11-17 g: mvgggwggggggwggxw\n" +
				"3-6 r: rrnrrgrrrr\n" +
				"8-10 n: rgjntnrmkn\n" +
				"6-7 f: sffftmm\n" +
				"4-5 b: bbddn\n" +
				"4-9 d: cdrbqddsqqpzkdd\n" +
				"9-17 n: nnnnnnnnrnnnnnnnjn\n" +
				"1-4 n: knnn\n" +
				"15-16 k: kkkhkkkkkkkkkkkv\n" +
				"15-17 v: jkrddvtmgfqvqvvxk\n" +
				"10-16 j: jjjjjjjjgpsjhjjljjj\n" +
				"9-10 d: jdndwddvdrhndddd\n" +
				"5-7 x: bxxxxwmcb\n" +
				"5-7 r: mlrrdsrrrnrgwrrq\n" +
				"14-17 h: hhhlhhhhhhhhhhhhm\n" +
				"1-12 n: zpnwtpnnnnxzm\n" +
				"11-19 k: ccktkhkwthkkklkvhkmk\n" +
				"6-14 s: sfssxsscssgssqhsnssl\n" +
				"17-18 g: ggdgggggggggfgggrggg\n" +
				"4-13 k: dwddvztkhjnzk\n" +
				"17-19 k: kkkkkkkkkkkkkkkkkkx\n" +
				"5-8 q: qmqzqqqqqqqqqcqq\n" +
				"2-4 q: vqqqqhxd\n" +
				"1-13 c: fjccqcmrcjxgccdvbzr\n" +
				"8-12 h: hkhhhhhhhvhhch\n" +
				"4-10 w: jmwfwxwwkwwcnbwwftrc\n" +
				"8-11 f: fffffffbffdf\n" +
				"12-18 b: bbbbbbbbbbbcbbbbbbb\n" +
				"2-8 k: rdwwjvrkcs\n" +
				"13-14 p: pppphpnppppphpppp\n" +
				"1-3 d: nddddddddddd\n" +
				"5-8 m: mmfdkmnfmqm\n" +
				"2-9 x: xjgwxxxxxl\n" +
				"1-2 v: vhvsvv\n" +
				"11-17 r: tlrgrrrrrwrzrrrrsrr\n" +
				"1-7 c: lcclcvgk\n" +
				"3-5 s: slnkss\n" +
				"3-4 w: hqwbw\n" +
				"11-19 l: lfxllllllldlllllllq\n" +
				"4-5 t: tttbt\n" +
				"10-12 g: gggggggggsgfg\n" +
				"6-8 k: kkmkkkkmk\n" +
				"10-11 q: qqqqqqpqqpsqd\n" +
				"5-17 k: pxwkmdxkskthkkkkn\n" +
				"14-16 m: mmmmmmmmmmmmmpmmmmmm\n" +
				"14-15 k: kkkkkkkkkjkkkkt\n" +
				"13-14 c: ccccccdccccccccccccc\n" +
				"1-2 v: gvmqqnkpln\n" +
				"4-6 k: lwkkkjgwkkk\n" +
				"1-12 h: mhhthhghhhhhhhhh\n" +
				"6-7 t: ptxtwtg\n" +
				"3-9 j: zsjkcjlzj\n" +
				"5-8 q: cpzhqfhvsjx\n" +
				"5-11 s: ssbsskssgssdss\n" +
				"4-12 t: ltkttnzdvxttllttt\n" +
				"4-5 j: jjfjh\n" +
				"4-5 r: rrrprjdtrfr\n" +
				"4-8 d: ccwqskmd\n" +
				"2-9 p: npzptdhsxxpkpk\n" +
				"6-17 x: cxnxxpmxxxxhxxfhxxxx\n" +
				"1-7 q: nqqzqnqqqf\n" +
				"15-17 v: vvvvmkvjvwvscvvvv\n" +
				"12-16 d: mddddbdddjddxddbd\n" +
				"3-7 f: fxpfffff\n" +
				"6-7 d: dgdwrddwhprchmvdr\n" +
				"5-17 h: whhphdbxzwcdhhshwkkh\n" +
				"5-7 f: ffffffjw\n" +
				"10-12 s: grcsbsnssbfs\n" +
				"6-10 z: zzzzzrzzzzzjz\n" +
				"14-15 m: kdmmcmmmmmdmldm\n" +
				"6-7 m: mcxmmcmm\n" +
				"5-6 l: lmlllrlw\n" +
				"3-16 q: qqwqqqqcmqqqqqxqbqq\n" +
				"14-16 p: pppzspppppnppbppwwpp\n" +
				"10-12 q: qqqqqqqqqqqqqq\n" +
				"1-5 j: rjkjvjj\n" +
				"3-9 d: fhqwddjrdzpkgdkd\n" +
				"2-4 v: vlvw\n" +
				"1-4 w: qwcww\n" +
				"6-12 r: rhhzkrzhrwrxrkvrcbmr\n" +
				"3-5 t: xxbtr\n" +
				"5-6 x: xxxpxx\n" +
				"2-5 q: qhqqq\n" +
				"8-16 n: nnnnnknnnnnnnnnt\n" +
				"8-10 g: gdzvghxcnbq\n" +
				"4-19 m: rgmmbqmljmzswbkpkcn\n" +
				"8-12 g: ggggggmhggrgbtghg\n" +
				"13-15 t: ttttttttttttttxttt\n" +
				"1-3 n: nntn\n" +
				"3-4 h: hhxh\n" +
				"6-7 f: ffffffbf\n" +
				"2-3 t: bgtt\n" +
				"7-9 n: nnnnnnjnn\n" +
				"2-4 j: ljgj\n" +
				"12-15 c: ccccdcccccccccfccc\n" +
				"4-9 s: wssssssqlcssz\n" +
				"1-2 z: ljzjgcvg\n" +
				"6-7 q: qqqqqqs\n" +
				"1-6 d: xpddgd\n" +
				"4-14 f: ffffffffdzfffmf\n" +
				"13-14 r: rrrrrrrrrrrrwrrr\n" +
				"6-7 r: rrrcgbrrr\n" +
				"9-15 b: lkkbbbbhbsbgxpgpbb\n" +
				"3-4 f: qzfzwnffv\n" +
				"4-14 m: rkksnmbgjmqmmmc\n" +
				"8-13 n: fjnbrnnnqnnnnn\n" +
				"13-17 h: hhhhhhchhhhhhhhhz\n" +
				"8-9 n: rbtknnmpng\n" +
				"1-6 c: qgtfhqtjkw\n" +
				"2-8 m: wzfmmmmmflmdk\n" +
				"5-7 v: cnvvvvvvv\n" +
				"10-15 n: nxnnnjnsnnnnngnnknrt\n" +
				"12-13 d: ddjddddddddddddd\n" +
				"4-5 n: jncnnh\n" +
				"6-10 z: zzzznbzzzczzl\n" +
				"4-5 s: bsjsv\n" +
				"9-11 g: hvkccbpfxkg\n" +
				"1-2 b: bbqb\n" +
				"7-16 l: lllllllllllllllplll\n" +
				"1-5 l: llllml\n" +
				"3-4 f: fmsf\n" +
				"2-4 g: tgshjbgg\n" +
				"2-7 h: vlzzhhhhhphhf\n" +
				"8-9 p: pnpppppqh\n" +
				"9-11 w: wrxlwdtwnwwtqwpwxgw\n" +
				"8-10 m: mmmmmmmnmm\n" +
				"1-5 p: dpnpppzpp\n" +
				"3-5 l: bllflklcmp\n" +
				"11-19 j: jkjjjvmjjjkjljjjjfj\n" +
				"6-9 k: kkkkkkkbkk\n" +
				"2-4 r: njprlsrmtr\n" +
				"9-10 d: dxhdddddfdd\n" +
				"3-8 z: dmrqpzwzghmznc\n" +
				"2-8 r: tlgqwxcrdpj\n" +
				"10-11 z: zzzzzzzzzzhz\n" +
				"1-10 q: qqqqqqqqqsqqqqqqqq\n" +
				"2-4 x: xrwxx\n" +
				"10-11 s: zssssssssfz\n" +
				"3-9 z: rszsgfzzz\n" +
				"6-13 x: zsxwxxqtgxvbcxxbn\n" +
				"10-16 s: smsssgssshsspwxsq\n" +
				"1-2 g: ngqgc\n" +
				"4-8 l: xllllngb\n" +
				"4-7 h: rhhhhhghbm\n" +
				"1-7 v: vqvslhm\n" +
				"2-7 z: jjfmnmz\n" +
				"1-10 v: vvvvvvvvvqv\n" +
				"11-13 g: ggpgrgggggggggg\n" +
				"3-6 p: tpgqnpphpl\n" +
				"1-3 d: sddddd\n" +
				"8-9 g: gggggggvg\n" +
				"2-6 w: wtvwnw\n" +
				"1-4 m: kmmwm\n" +
				"3-4 h: mhvh\n" +
				"1-4 h: cnjhxvhkdch\n" +
				"7-8 w: wwwwwfwww\n" +
				"6-9 r: rlrrrgrrr\n" +
				"2-4 h: lggh\n" +
				"10-11 q: qqqqqqqqqlh\n" +
				"4-5 l: llllgl\n" +
				"13-16 k: kmffmjbzrpprcdkxglk\n" +
				"1-3 f: ffpf\n" +
				"19-20 n: nnnnnnnbnnnnnnnnnnnv\n" +
				"3-7 h: hhpmhjhwdhzhm\n" +
				"1-5 k: hlkkrkzkf\n" +
				"2-4 s: sssxssssssssssssssss\n" +
				"12-13 d: dddgdddddqndtdkd\n" +
				"3-14 c: cccczvcxchccccclctcl\n" +
				"2-5 b: mbgbb\n" +
				"6-8 j: jjtrtbsjnj\n" +
				"5-6 s: sssqsk\n" +
				"8-16 l: lfrlllllctllqxrpllll\n" +
				"6-12 g: grxlwlnggxvg\n" +
				"16-17 j: jjjjjjjjjjjjjjjjp\n" +
				"6-10 q: nqmzqflbhqqb\n" +
				"12-19 j: jjjjjjwjjjjkjjjjjjgt\n" +
				"8-10 s: sscssssssp\n" +
				"11-12 s: ssssssssssds\n" +
				"2-5 n: hswqnqldwwbbmnnrnht\n" +
				"4-7 p: ztpvbqpwsxrgrkp\n" +
				"3-9 h: hhlhhcjrkhwnhq\n" +
				"10-12 k: kkkkkkkkklkwk\n" +
				"14-15 w: wwwwwvwwwwkwwqwnw\n" +
				"16-20 b: bbbbbbbbbbbbbbbhbbbt\n" +
				"2-5 t: tttttftttttt\n" +
				"3-12 l: qswhtwvnfmfwn\n" +
				"11-12 b: bbbbbbbbbjgvbbbbbbz\n" +
				"8-13 w: wwwwtwwvwwwww\n" +
				"5-6 f: kgjfhfffv\n" +
				"7-17 g: qpxgkvgttkhxjhzxnv\n" +
				"2-3 n: rhffpsqknv\n" +
				"2-10 p: pkpppppppppp\n" +
				"3-15 p: rnpqjpgmcpgzkxcppk\n" +
				"12-13 d: nhdddldxdddddndpdddj\n" +
				"14-16 h: hhhhhhhhhhhhhbrhhhhh\n" +
				"4-9 r: rpzrcnrrrlx\n" +
				"2-14 f: ffffzfzffffffjfff\n" +
				"1-9 s: snhfksssxssss\n" +
				"1-14 n: bnnnnnnnnlnnnn\n" +
				"2-3 c: cwtccc\n" +
				"10-12 k: kkkkkkkkcskkkdkk\n" +
				"2-5 r: qrqsrkrk\n" +
				"3-11 k: nlkqkszttxk\n" +
				"2-3 d: vqdgpwnjprgsgsdrxwk\n" +
				"7-12 k: hkkkkkkdkkkrk\n" +
				"6-8 r: smmfvtxrhzvnrj\n" +
				"8-10 l: llrllllllmll\n" +
				"5-10 l: bpwgqlnktt\n" +
				"4-6 f: flfvjfff\n" +
				"13-14 b: bbbbbbbbbbfbqzzb\n" +
				"5-6 m: rmhmqmkmtkmjnmvdx\n" +
				"10-16 j: jtjjjjjjjdkjgjjjj\n" +
				"3-4 c: cpcc\n" +
				"10-11 v: vxgbfvqftvmc\n" +
				"5-12 n: knqlnbhdphpw\n" +
				"7-13 r: rrrrrtrrrrrrrrr\n" +
				"4-7 n: nbnnffkjnwpqnhvqnr\n" +
				"4-13 r: htrkdwrcmcndrxngd\n" +
				"1-8 h: dhhhhjhdxhh\n" +
				"4-8 b: bbbcbbbg\n" +
				"1-7 b: zqpzzqbfbwbwcbbbp\n" +
				"6-7 l: jlhllllmljvl\n" +
				"9-11 w: hwpwlcwkwcwjgkt\n" +
				"14-17 m: mmmmmmmmmmmmmmmmjm\n" +
				"6-11 r: rrrrrbrrrrr\n" +
				"1-6 c: fccxxc\n" +
				"14-15 j: jjkjjjbjjjfjjljfjj\n" +
				"15-17 q: qqqqqqqqvqqjqqqqz\n" +
				"11-14 j: qjjsjjjjjjcjjjj\n" +
				"11-13 m: mfhjhnsshfxmmm\n" +
				"6-9 z: wrsjtzzzj\n" +
				"6-19 b: lbkksbnggbcdpffqjxbb\n" +
				"1-5 w: wwwwwww\n" +
				"3-5 h: htdhh\n" +
				"5-15 n: nlfdnkvknxgbqlw\n" +
				"3-4 z: pzrz\n" +
				"7-9 h: hhslhhkhhhhh\n" +
				"11-13 n: wqnrnbnnlnjnd\n" +
				"15-17 f: ffsfffffffffffbfff\n" +
				"1-2 m: pmmt\n" +
				"8-9 z: zzzzzzzmzz\n" +
				"2-12 q: qqftqqqklxjc\n" +
				"12-13 p: pppppppppppbp\n" +
				"8-9 q: qqqqxqqlqqqqq\n" +
				"3-5 m: mhmfbq\n" +
				"3-5 j: ckpkjjf\n" +
				"7-11 k: kgkkkkkkkkkkkk\n" +
				"2-3 n: pnnnnmmnkl\n" +
				"1-6 l: lnvqjlflmp\n" +
				"3-14 t: nhzvstnltttdftt\n" +
				"2-3 s: hsrscsz\n" +
				"9-12 b: bbdbbbsbbjbgb\n" +
				"1-10 h: mlkcgnrkwhpgwjvflhgx\n" +
				"5-7 p: spnpmppwp\n" +
				"2-3 h: hrhh\n" +
				"8-11 g: fggsggqhgpg\n" +
				"5-8 n: nsxnvnlpnvn\n" +
				"9-11 f: fvffffjfffrcfff\n" +
				"6-9 q: qqqpzqmqpstrk\n" +
				"8-12 v: vmvvvvpzvrvvv\n" +
				"2-4 x: cnbx\n" +
				"3-5 h: hhqrhhh\n" +
				"6-13 t: ttttttttttttltvttt\n" +
				"2-4 v: zqvvgrxwtw\n" +
				"6-8 v: vdbvvfjv\n" +
				"16-19 g: gggggggggggggggjggg\n" +
				"4-6 m: mmwmstmpmj\n" +
				"1-11 b: bnxzhlbbgbpdvp\n" +
				"7-16 n: txfjncnhsxgbjvhh\n" +
				"5-8 m: mmtvmkmvfkmzmpmd\n" +
				"3-6 g: ggjgggg\n" +
				"8-12 l: lslllglqcnlwlll\n" +
				"2-4 l: llpqjdwxq\n" +
				"6-7 b: bbbbbvb\n" +
				"6-12 b: bbbnbbbbbkrq\n" +
				"17-18 s: msfggsssfsrdvssssdr\n" +
				"3-5 m: mmmmb\n" +
				"4-7 g: ggrwgbgggg\n" +
				"5-6 z: zzzzjpz\n" +
				"1-3 l: mrvclxrpvgnrl\n" +
				"11-13 g: gggjgggggggbgg\n" +
				"1-6 q: qqqqqjqqqz\n" +
				"3-5 d: dndnpzdmqcjrdgd\n" +
				"8-11 g: gggggggbggqggggggg\n" +
				"1-7 k: dkkkkkfkkkkkkrk\n" +
				"3-9 p: slbxznfwvjpnj\n" +
				"12-14 t: kbthtttfttrttt\n" +
				"3-6 x: xxbxxkxx\n" +
				"4-5 z: zzzdz\n" +
				"6-13 c: ccbcjccpcnscqc\n" +
				"11-14 x: xxxgmnxxxxfxhx\n" +
				"2-4 b: gjbrwk\n" +
				"3-4 l: bwmlzldj\n" +
				"10-13 d: qdcxdbrdrdddkdnddd\n" +
				"7-9 d: dddflddbwnmddd\n" +
				"12-14 f: rkgdfbdkqhnfsqjltntx\n" +
				"5-14 x: xxxxxxxxxxxxxxx\n" +
				"8-18 r: rrrrrrrlrrrrrrrrrr\n" +
				"1-19 q: qqqqqqqqqqqqqqqqqqdq\n" +
				"7-11 c: kscqhtcccctprbc\n" +
				"3-5 h: dchjkntfhrbmmkkjpnh\n" +
				"2-9 l: lllllllln\n" +
				"1-6 c: sqczzcnkpwrcgvctlrc\n" +
				"6-16 f: wcnppfpffjxpthhfxf\n" +
				"16-17 x: xxxxcxxxrxsfxxpxfq\n" +
				"7-9 q: qqqqqqqqt\n" +
				"4-6 h: hxhhkgg\n" +
				"12-20 v: pwvzsxtvvslvfxhvcvtz\n" +
				"12-17 k: tkkkkkkkcfktknkkkk\n" +
				"2-3 b: bpqr\n" +
				"4-5 m: mhppm\n" +
				"4-9 g: jrgxgqjqgrrpj\n" +
				"7-12 h: hhswhqwhhqhhhlhtkhzw\n" +
				"5-19 l: llllhlllllllllllllll\n" +
				"2-3 n: mqncngfps\n" +
				"6-15 q: qqqqqnhqqqqqqqtqq\n" +
				"1-8 k: kfkkkkkkr\n" +
				"5-10 f: pmpffbdkfpffgffcf\n" +
				"3-8 b: bbsbcbbb\n" +
				"9-12 h: hwhhhxhshhhhhc\n" +
				"1-5 r: nhcrrbrrrj\n" +
				"2-4 q: qqqsq\n" +
				"13-17 h: lrlngvrhpsdmhkhzt\n" +
				"8-17 m: rmmmmmmlmmmmqmsmmqm\n" +
				"4-8 n: njnsnkjkhnkgblg\n" +
				"9-10 d: pdwdkgcdrdzqdd\n" +
				"3-4 p: pppp\n" +
				"10-12 j: zcjjjjqwjrjj\n" +
				"1-9 d: mddgrxsdk\n" +
				"2-4 v: gsvvjv\n" +
				"5-7 h: hhhbbhjh\n" +
				"15-16 w: wwjwwwwwwwwwwwbw\n" +
				"8-10 b: cbczjdpbkhdbkpbztn\n" +
				"7-10 z: skfvjzzxzt\n" +
				"15-16 m: mmmmmmrmjzxmmmbtmmm\n" +
				"2-6 j: rjjgqb\n" +
				"4-16 d: dptndnvddgtpqdddd\n" +
				"7-8 j: jjhjjjbd\n" +
				"2-3 w: bwdr\n" +
				"4-6 g: jgngnmgggfpgcn\n" +
				"2-3 p: ppkp\n" +
				"7-8 m: mmmmmmnm\n" +
				"5-6 l: lfllln\n" +
				"3-4 r: rrrm\n" +
				"6-7 s: ssssssss\n" +
				"4-15 g: kdtgzznwrczjzgx\n" +
				"11-12 w: jhwwrwwpwwwmwwfwgww\n" +
				"13-15 w: wwwwcjjwwwwwgwwwwwf\n" +
				"4-11 f: fffxffffffff\n" +
				"3-7 g: ggggggpg\n" +
				"3-10 m: mmnmmmmmmm\n" +
				"9-11 h: hfhhhqhhhchhhwh\n" +
				"4-5 j: jjqjq\n" +
				"13-14 x: jmxnxbjrklnvxtn\n" +
				"5-6 f: zzkqnzchtfnvffqd\n" +
				"4-8 j: cxcjvfjjkjz\n" +
				"8-14 s: sssssswnrsssscsss\n" +
				"6-12 t: dftrtdvtxttt\n" +
				"3-4 p: ppmp\n" +
				"1-5 z: zzgszfrg\n" +
				"1-8 g: wbgwggdgtswrlllj\n" +
				"2-4 f: fffpf\n" +
				"16-17 t: tttrktsmtmpttttttnt\n" +
				"6-11 m: mqsxmmtfthmfwn\n" +
				"2-3 c: mcbs\n" +
				"1-3 j: xmjj\n" +
				"15-16 j: jtjjjjjjjjjjjjjxj\n" +
				"6-8 k: kkrkktckk\n" +
				"9-11 l: ltlllllsllmlz\n" +
				"17-18 s: sxmssqtjrhmzhssssk\n" +
				"9-13 k: kkkkkkkkkkkkkkkhk\n" +
				"6-9 g: kpnhsggmqklvtttgcxvl\n" +
				"5-7 z: vzrxbmzzwglvczz\n" +
				"4-10 k: khkkdkkckkkkkzkk\n" +
				"2-6 q: qsqqnqq\n" +
				"1-3 x: qxsxxxx\n" +
				"10-14 x: xxzxxtxxxjcxxx\n" +
				"4-6 z: dzzzvz\n" +
				"1-2 c: cccv\n" +
				"9-12 h: hhhhhhhhhhhc\n" +
				"13-15 z: zzgzzzzzzmzzqzzkzz\n" +
				"3-6 h: pgvjdhtpmthbz\n" +
				"10-13 x: mxqbxxwxxxhxfrxxchxx\n" +
				"2-5 b: qbbmpzrzkcjqqwbj\n" +
				"3-14 q: ltxhrqqqqzfqqq\n" +
				"6-10 j: jjjjprjkqj\n" +
				"9-15 c: dsncxxlqwvzccwc\n" +
				"12-16 m: nxrmdgmmxmscmhnm\n" +
				"4-5 p: ppppthp\n" +
				"10-13 d: ddddddddddddb\n" +
				"2-6 x: bxkwbtsx\n" +
				"5-7 j: jjjjqjjjjjj\n" +
				"8-10 d: wzdddddtdddd\n" +
				"6-9 z: dlzzzzzvwz\n" +
				"2-3 h: hhhh\n" +
				"11-13 t: ttttjtttttttxtt\n" +
				"4-5 s: sdbps\n" +
				"2-10 x: dcmxxxlxxhgxftrjbp\n" +
				"9-15 h: hhhhhhhzjzhwhrkhh\n" +
				"2-6 f: ftxhffff\n" +
				"4-5 k: kkfrkwnbkkh\n" +
				"3-5 m: mmdmm\n" +
				"5-10 z: znvxzzldzvhqztr\n" +
				"7-8 r: rrrrrrcr\n" +
				"14-16 k: kkkkkkvkkkkkkbkk\n" +
				"4-10 x: cxsxzxxxxxxxxn\n" +
				"12-13 s: ssssssssssssss\n" +
				"7-9 s: sswssssshs\n" +
				"1-3 c: ncccrc\n" +
				"7-9 r: rrrwrrtwr\n" +
				"13-14 v: vvvvvvvvvvvvnv\n" +
				"4-6 k: bkkkkx\n" +
				"7-10 r: rrrrrrrrrrrrr\n" +
				"7-8 l: llllllzll\n" +
				"3-11 v: vqvvmnkvvswgkqvmvd\n" +
				"8-10 c: cccccdcccm\n" +
				"1-9 s: sssksqsshsj\n" +
				"5-8 c: cccchmcccc\n" +
				"5-6 h: hsqhhghrhk\n" +
				"4-5 z: czzzrzlzn\n" +
				"2-4 f: fzfffj\n" +
				"14-17 p: pppppppppppppppmpp\n" +
				"4-5 x: ldqxq\n" +
				"12-16 g: gtgggggggggpgggggt\n" +
				"13-14 v: zfbmrhphzmrvqv\n" +
				"6-10 p: ppppppppphppkp\n" +
				"10-12 l: xlllklllllkwlcl\n" +
				"4-6 v: qvbvgdw\n" +
				"6-12 q: qqqsqlqqqqqq\n" +
				"3-5 s: rssgpssnb\n" +
				"1-2 g: gzlpcmbsmgrq\n" +
				"2-9 w: lpmbmfvpwggfvmzmmw\n" +
				"4-6 n: nqtfzz\n" +
				"3-4 f: fftf\n" +
				"13-17 n: nnnznkgmnnnnpnngnfn\n" +
				"8-10 p: ppppxppppppppprppsp\n" +
				"10-12 g: ggnggkggggcvg\n" +
				"3-8 l: lxrcbjnddcbpg\n" +
				"6-7 q: qkjqfqqdkkkqrqqqc\n" +
				"5-8 p: wpbpmpwpfsblpplmpp\n" +
				"2-7 n: bbrtwnhhttntqhnr\n" +
				"1-2 p: pcdxzjwmnkfjkpbj\n" +
				"1-15 n: nnnnnnnnnnnnnnznn\n" +
				"18-20 s: ssmsssssssssssssrssw\n" +
				"1-12 h: vhxhmhhhhhhhd\n" +
				"3-7 r: qkkvhvr\n" +
				"3-5 k: xkpkkkzbtwkv\n" +
				"2-4 z: zfzz\n" +
				"1-2 t: ktttt\n" +
				"2-3 p: pbwp\n" +
				"2-4 j: ljjj\n" +
				"14-15 t: pzpcktthttfttttt\n" +
				"3-4 n: nwnj\n" +
				"8-10 l: lzllllllln\n" +
				"1-12 q: qqqqqqqqqqqqq\n" +
				"6-12 z: xxltbzrpwzzmw\n" +
				"15-16 q: qqqqqqqqqqqvqqqjq\n" +
				"4-5 r: rhmrkrd\n" +
				"7-10 r: rrrrrrlrrrrrr\n" +
				"16-18 t: ttttwttttttttttttn\n" +
				"9-17 m: bmmmmmmzmmpmmhmrw\n" +
				"9-13 r: rrxfrrxrrrrrrr\n" +
				"13-18 p: ppdxprpqppbpppprpz\n" +
				"5-8 p: rprmpfpxgjphfktszplp\n" +
				"5-7 h: hhhhhhnh\n" +
				"3-7 h: rwhpshznhhh\n" +
				"9-10 x: xwxzbrxxgxrxxdxxs\n" +
				"6-7 h: hvhhhhng\n" +
				"5-6 b: bbbbwhbb\n" +
				"4-5 g: gbgggg\n" +
				"3-9 g: gsbggghggpgdgg\n" +
				"1-3 r: rxrhh\n" +
				"3-4 c: rccn\n" +
				"4-8 z: zpzzznzzzwz\n" +
				"14-17 b: bbbbbbbbbbbbbbbbbzb\n" +
				"2-4 w: rwvwrdn\n" +
				"3-6 p: pfpsgp\n" +
				"2-12 p: zpwkjpppbppjrppknh\n" +
				"5-9 t: tmttgtttn\n" +
				"2-3 v: wvvcv\n" +
				"3-5 h: bnbhhtjhk\n" +
				"15-17 f: tffwftdskgfxgfffpk\n" +
				"16-17 h: hphhhhdhhhhhxhhhrhh\n" +
				"7-8 d: ddddddtnd\n" +
				"9-20 t: tqttttttttttttttbttw\n" +
				"1-11 v: vxcgzvvvkrlqvg\n" +
				"2-6 r: ghrbwrtfksqkxx\n" +
				"8-10 w: wwwswwwmvwww\n" +
				"4-10 m: mqmmmtmmfq\n" +
				"2-3 g: gkgtgv\n" +
				"9-11 w: wwwwsqwwpwwxrwww\n" +
				"3-4 w: zwxwtcscwmwmndcw\n" +
				"8-9 q: xsqqqqzxfqfv\n" +
				"2-4 w: wwhh\n" +
				"9-18 d: ddddddhddddddddddq\n" +
				"3-4 s: sssjsvs\n" +
				"15-16 p: wphpxpppppppppppppvp\n" +
				"10-12 t: qftttqhtvttt\n" +
				"1-2 b: vbfxqgbzrktjm\n" +
				"3-4 k: lkkr\n" +
				"9-11 d: dddddkdqdttddd\n" +
				"9-11 m: mwngbfmhmcvwx\n" +
				"2-5 b: scbxbb\n" +
				"6-9 z: zzzzzzzzzzz\n" +
				"1-3 z: zzvhz\n" +
				"5-7 x: xxxxxxkxx\n" +
				"1-5 s: ssscshss\n" +
				"1-7 s: csrfvfsqjss\n" +
				"16-17 k: fwdkkkckkkkrrkkck\n" +
				"3-4 h: hhhs\n" +
				"4-8 w: wwwswwwx\n" +
				"1-10 f: fffskffsdfcfvfff\n" +
				"7-15 r: rrrrrrrrrrrrrrxr\n" +
				"1-2 k: kvxbzdcnsqrskhmx\n" +
				"2-4 s: wbvsfs\n" +
				"2-7 q: rbgqpqdq\n" +
				"15-16 f: fffffffffffffffq\n" +
				"1-3 c: bccpkm\n" +
				"5-11 g: fsvgthpglgg\n" +
				"3-5 f: ffffwf\n" +
				"5-16 j: djmwqfxsbzwjdwtj\n" +
				"3-4 p: pprpp\n" +
				"5-6 n: nhnnwj\n" +
				"8-12 s: tssssssrsssksss\n" +
				"5-8 p: pppppppppppp\n" +
				"10-15 w: wgfwwcwtmwwgwpwwh\n" +
				"12-15 l: lllllllllllplll\n" +
				"1-8 c: ccccqccd\n" +
				"3-4 z: zzzvzkzgc\n" +
				"2-10 h: swwbtfkvfhrjztdzx\n" +
				"2-7 z: zhbzkzlzz\n" +
				"2-9 q: ddqdqpkcjqkfgqtcjqq\n" +
				"9-10 l: lllmllkltlll\n" +
				"2-3 n: ngwn\n" +
				"2-3 r: rrnr\n" +
				"5-10 n: ltnnnknnvcnnn\n" +
				"7-9 p: jtpptpllpj\n" +
				"2-5 s: slssssszssssssss\n" +
				"16-17 d: dddddddddddddddlp\n" +
				"2-5 q: bbwqqbkmdhqmjhn\n" +
				"7-10 m: qmpgmmsmmmmkmmkj\n" +
				"4-7 g: vczggdgbgxgg";

		Day_2_1 solution = new Day_2_1(input);

		assertThat(solution.solve()).isEqualTo(620);
	}

}
