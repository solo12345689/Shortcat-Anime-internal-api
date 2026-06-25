package H2;

import H2.f;
import H2.i;
import Q2.o;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o3.p;
import q2.AbstractC6079K;
import q2.AbstractC6096k;
import q2.C6080L;
import q2.C6102q;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f7898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f7899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f7854c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f7856d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f7858e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f7860f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f7862g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f7864h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f7866i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f7868j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f7870k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f7872l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f7874m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f7876n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f7878o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f7880p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f7882q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f7884r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f7886s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f7888t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f7890u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f7892v = c("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f7894w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f7895x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f7896y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f7897z = c("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Pattern f7826A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final Pattern f7827B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final Pattern f7828C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final Pattern f7829D = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Pattern f7830E = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final Pattern f7831F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final Pattern f7832G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final Pattern f7833H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final Pattern f7834I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final Pattern f7835J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final Pattern f7836K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final Pattern f7837L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final Pattern f7838M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final Pattern f7839N = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Pattern f7840O = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final Pattern f7841P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final Pattern f7842Q = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final Pattern f7843R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Pattern f7844S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final Pattern f7845T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final Pattern f7846U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final Pattern f7847V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final Pattern f7848W = c("AUTOSELECT");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final Pattern f7849X = c("DEFAULT");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final Pattern f7850Y = c("FORCED");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Pattern f7851Z = c("INDEPENDENT");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Pattern f7852a0 = c("GAP");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Pattern f7853b0 = c("PRECISE");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Pattern f7855c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Pattern f7857d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Pattern f7859e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Pattern f7861f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Pattern f7863g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Pattern f7865h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Pattern f7867i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Pattern f7869j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Pattern f7871k0 = c("END-ON-NEXT");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Pattern f7873l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Pattern f7875m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Pattern f7877n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Pattern f7879o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Pattern f7881p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Pattern f7883q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Pattern f7885r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f7887s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f7889t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f7891u0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f7893v0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends IOException {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BufferedReader f7900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue f7901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f7902c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.f7901b = queue;
            this.f7900a = bufferedReader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.f7902c != null) {
                return true;
            }
            if (!this.f7901b.isEmpty()) {
                this.f7902c = (String) AbstractC6614a.e((String) this.f7901b.poll());
                return true;
            }
            do {
                String line = this.f7900a.readLine();
                this.f7902c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f7902c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f7902c;
            this.f7902c = null;
            return str;
        }
    }

    public k() {
        this(i.f7802n, null);
    }

    private static f.h A(String str) {
        double dT = t(str, f7890u, -9.223372036854776E18d);
        long j10 = dT == -9.223372036854776E18d ? -9223372036854775807L : (long) (dT * 1000000.0d);
        boolean zS = s(str, f7892v, false);
        double dT2 = t(str, f7895x, -9.223372036854776E18d);
        long j11 = dT2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dT2 * 1000000.0d);
        double dT3 = t(str, f7896y, -9.223372036854776E18d);
        return new f.h(j10, zS, j11, dT3 != -9.223372036854776E18d ? (long) (dT3 * 1000000.0d) : -9223372036854775807L, s(str, f7897z, false));
    }

    private static String B(String str, Pattern pattern, Map map) throws C6080L {
        String strX = x(str, pattern, map);
        if (strX != null) {
            return strX;
        }
        throw C6080L.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long C(String str, Pattern pattern) {
        return new BigDecimal(B(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String D(String str, Map map) {
        Matcher matcher = f7891u0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int E(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !a0.N0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean b(BufferedReader bufferedReader) throws IOException {
        int i10 = bufferedReader.read();
        if (i10 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i10 = bufferedReader.read();
        }
        int iE = E(bufferedReader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (iE != "#EXTM3U".charAt(i11)) {
                return false;
            }
            iE = bufferedReader.read();
        }
        return a0.N0(E(bufferedReader, false, iE));
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(NO" + com.amazon.a.a.o.b.f.f34696c + "YES)");
    }

    private static C6102q d(String str, C6102q.b[] bVarArr) {
        C6102q.b[] bVarArr2 = new C6102q.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].b(null);
        }
        return new C6102q(str, bVarArr2);
    }

    private static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static i.b f(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i.b bVar = (i.b) arrayList.get(i10);
            if (str.equals(bVar.f7820d)) {
                return bVar;
            }
        }
        return null;
    }

    private static i.b g(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i.b bVar = (i.b) arrayList.get(i10);
            if (str.equals(bVar.f7821e)) {
                return bVar;
            }
        }
        return null;
    }

    private static i.b h(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i.b bVar = (i.b) arrayList.get(i10);
            if (str.equals(bVar.f7819c)) {
                return bVar;
            }
        }
        return null;
    }

    private static boolean i(String str, String str2, String str3, String str4) {
        if (!AbstractC6079K.p(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    private static f.b k(String str, String str2, Map map) {
        String str3 = str2 + com.amazon.a.a.o.b.f.f34695b;
        int iIndexOf = str.indexOf(str3) + str3.length();
        String strSubstring = str.substring(iIndexOf, (str.length() == iIndexOf + 1 ? 1 : 2) + iIndexOf);
        if (strSubstring.startsWith("\"")) {
            return new f.b(str2, B(str, Pattern.compile(str2 + com.amazon.a.a.o.b.f.f34695b + "\"((?:.|\f)+?)\""), map), 0);
        }
        if (strSubstring.equals("0x") || strSubstring.equals("0X")) {
            return new f.b(str2, B(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new f.b(str2, l(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    private static double l(String str, Pattern pattern) {
        return Double.parseDouble(B(str, pattern, Collections.EMPTY_MAP));
    }

    private static C6102q.b m(String str, String str2, Map map) throws C6080L {
        String strW = w(str, f7838M, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strB = B(str, f7839N, map);
            return new C6102q.b(AbstractC6096k.f56896d, "video/mp4", Base64.decode(strB.substring(strB.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new C6102q.b(AbstractC6096k.f56896d, "hls", a0.z0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strW)) {
            return null;
        }
        String strB2 = B(str, f7839N, map);
        byte[] bArrDecode = Base64.decode(strB2.substring(strB2.indexOf(44)), 0);
        UUID uuid = AbstractC6096k.f56897e;
        return new C6102q.b(uuid, "video/mp4", p.a(uuid, bArrDecode));
    }

    private static String n(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int o(String str, Pattern pattern) {
        return Integer.parseInt(B(str, pattern, Collections.EMPTY_MAP));
    }

    private static long p(String str, Pattern pattern) {
        return Long.parseLong(B(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x068d, code lost:
    
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0691, code lost:
    
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x069f, code lost:
    
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06ac, code lost:
    
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x081d, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0822, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0832, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0841, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x084e, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x085b, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0868, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0875, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0883, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0890, code lost:
    
        r66 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0331 A[PHI: r14
  0x0331: PHI (r14v9 java.lang.String) = (r14v7 java.lang.String), (r14v2 java.lang.String) binds: [B:119:0x0340, B:113:0x0324] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x068f A[PHI: r33
  0x068f: PHI (r33v15 int) = (r33v11 int), (r33v12 int), (r33v13 int), (r33v16 int) binds: [B:247:0x06b4, B:243:0x06a7, B:239:0x0699, B:236:0x068d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x081f A[PHI: r66
  0x081f: PHI (r66v13 java.util.ArrayList) = 
  (r66v3 java.util.ArrayList)
  (r66v4 java.util.ArrayList)
  (r66v5 java.util.ArrayList)
  (r66v6 java.util.ArrayList)
  (r66v7 java.util.ArrayList)
  (r66v8 java.util.ArrayList)
  (r66v9 java.util.ArrayList)
  (r66v10 java.util.ArrayList)
  (r66v11 java.util.ArrayList)
  (r66v14 java.util.ArrayList)
 binds: [B:355:0x0898, B:351:0x088b, B:347:0x087d, B:343:0x0870, B:339:0x0863, B:335:0x0856, B:331:0x0849, B:327:0x083a, B:323:0x082a, B:320:0x081d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r1v25, types: [H2.f$c$a] */
    /* JADX WARN: Type inference failed for: r1v37, types: [H2.f$c$a] */
    /* JADX WARN: Type inference failed for: r1v38, types: [H2.f$c$a] */
    /* JADX WARN: Type inference failed for: r1v39, types: [H2.f$c$a] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v10 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v12 */
    /* JADX WARN: Type inference failed for: r34v13 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v20 */
    /* JADX WARN: Type inference failed for: r34v22 */
    /* JADX WARN: Type inference failed for: r34v26 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v30 */
    /* JADX WARN: Type inference failed for: r34v31 */
    /* JADX WARN: Type inference failed for: r34v32 */
    /* JADX WARN: Type inference failed for: r34v33 */
    /* JADX WARN: Type inference failed for: r34v34 */
    /* JADX WARN: Type inference failed for: r34v35 */
    /* JADX WARN: Type inference failed for: r34v36 */
    /* JADX WARN: Type inference failed for: r34v38 */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Type inference failed for: r54v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r55v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r56v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r56v15 */
    /* JADX WARN: Type inference failed for: r56v9 */
    /* JADX WARN: Type inference failed for: r60v0 */
    /* JADX WARN: Type inference failed for: r60v1 */
    /* JADX WARN: Type inference failed for: r60v10 */
    /* JADX WARN: Type inference failed for: r60v16 */
    /* JADX WARN: Type inference failed for: r60v18 */
    /* JADX WARN: Type inference failed for: r60v2 */
    /* JADX WARN: Type inference failed for: r60v21 */
    /* JADX WARN: Type inference failed for: r60v26 */
    /* JADX WARN: Type inference failed for: r60v27 */
    /* JADX WARN: Type inference failed for: r60v28 */
    /* JADX WARN: Type inference failed for: r60v29 */
    /* JADX WARN: Type inference failed for: r60v3 */
    /* JADX WARN: Type inference failed for: r60v30 */
    /* JADX WARN: Type inference failed for: r60v31 */
    /* JADX WARN: Type inference failed for: r60v32 */
    /* JADX WARN: Type inference failed for: r60v4 */
    /* JADX WARN: Type inference failed for: r60v5 */
    /* JADX WARN: Type inference failed for: r60v6 */
    /* JADX WARN: Type inference failed for: r60v7 */
    /* JADX WARN: Type inference failed for: r60v8 */
    /* JADX WARN: Type inference failed for: r60v9 */
    /* JADX WARN: Type inference failed for: r64v1 */
    /* JADX WARN: Type inference failed for: r64v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r64v3 */
    /* JADX WARN: Type inference failed for: r64v4 */
    /* JADX WARN: Type inference failed for: r64v5 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r7v31, types: [H2.f$c$a] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static H2.f q(H2.i r91, H2.f r92, H2.k.b r93, java.lang.String r94) throws H2.k.a, q2.C6080L {
        /*
            Method dump skipped, instruction units count: 2954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.k.q(H2.i, H2.f, H2.k$b, java.lang.String):H2.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static H2.i r(H2.k.b r36, java.lang.String r37) throws q2.C6080L {
        /*
            Method dump skipped, instruction units count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.k.r(H2.k$b, java.lang.String):H2.i");
    }

    private static boolean s(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    private static double t(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) AbstractC6614a.e(matcher.group(1))) : d10;
    }

    private static int u(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) AbstractC6614a.e(matcher.group(1))) : i10;
    }

    private static long v(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) AbstractC6614a.e(matcher.group(1))) : j10;
    }

    private static String w(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) AbstractC6614a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : D(str2, map);
    }

    private static String x(String str, Pattern pattern, Map map) {
        return w(str, pattern, null, map);
    }

    private static int y(String str, Map map) {
        String strX = x(str, f7846U, map);
        if (TextUtils.isEmpty(strX)) {
            return 0;
        }
        String[] strArrV1 = a0.v1(strX, com.amazon.a.a.o.b.f.f34694a);
        int i10 = a0.u(strArrV1, "public.accessibility.describes-video") ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING : 0;
        if (a0.u(strArrV1, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (a0.u(strArrV1, "public.accessibility.describes-music-and-sound")) {
            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        return a0.u(strArrV1, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int z(String str) {
        boolean zS = s(str, f7849X, false);
        ?? r02 = zS;
        if (s(str, f7850Y, false)) {
            r02 = (zS ? 1 : 0) | 2;
        }
        return s(str, f7848W, false) ? r02 | 4 : r02;
    }

    @Override // Q2.o.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public j a(Uri uri, InputStream inputStream) throws C6080L {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw C6080L.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    a0.p(bufferedReader);
                    throw C6080L.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    } else {
                        arrayDeque.add(strTrim);
                        return r(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(strTrim);
            return q(this.f7898a, this.f7899b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            a0.p(bufferedReader);
        }
    }

    public k(i iVar, f fVar) {
        this.f7898a = iVar;
        this.f7899b = fVar;
    }
}
