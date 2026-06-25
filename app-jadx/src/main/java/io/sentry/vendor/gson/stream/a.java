package io.sentry.vendor.gson.stream;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Reader f51503a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f51511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f51513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f51514l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String[] f51516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f51517o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f51504b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char[] f51505c = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51506d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51507e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51508f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f51509g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f51510h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f51515m = 1;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f51514l = iArr;
        iArr[0] = 6;
        this.f51516n = new String[32];
        this.f51517o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f51503a = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (j(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        r19.f51511i = r11;
        r19.f51506d += r8;
        r19.f51510h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        r19.f51512j = r8;
        r19.f51510h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c8, code lost:
    
        return r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int C() {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.C():int");
    }

    private void D(int i10) {
        int i11 = this.f51515m;
        int[] iArr = this.f51514l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f51514l = Arrays.copyOf(iArr, i12);
            this.f51517o = Arrays.copyOf(this.f51517o, i12);
            this.f51516n = (String[]) Arrays.copyOf(this.f51516n, i12);
        }
        int[] iArr2 = this.f51514l;
        int i13 = this.f51515m;
        this.f51515m = i13 + 1;
        iArr2[i13] = i10;
    }

    private char E() throws IOException {
        int i10;
        if (this.f51506d == this.f51507e && !h(1)) {
            throw Y("Unterminated escape sequence");
        }
        char[] cArr = this.f51505c;
        int i11 = this.f51506d;
        int i12 = i11 + 1;
        this.f51506d = i12;
        char c10 = cArr[i11];
        if (c10 == '\n') {
            this.f51508f++;
            this.f51509g = i12;
            return c10;
        }
        if (c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            throw Y("Invalid escape sequence");
        }
        if (i11 + 5 > this.f51507e && !h(4)) {
            throw Y("Unterminated escape sequence");
        }
        int i13 = this.f51506d;
        int i14 = i13 + 4;
        char c11 = 0;
        while (i13 < i14) {
            char c12 = this.f51505c[i13];
            char c13 = (char) (c11 << 4);
            if (c12 >= '0' && c12 <= '9') {
                i10 = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i10 = c12 - 'W';
            } else {
                if (c12 < 'A' || c12 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f51505c, this.f51506d, 4));
                }
                i10 = c12 - '7';
            }
            c11 = (char) (c13 + i10);
            i13++;
        }
        this.f51506d += 4;
        return c11;
    }

    private void H(char c10) throws IOException {
        char[] cArr = this.f51505c;
        do {
            int i10 = this.f51506d;
            int i11 = this.f51507e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f51506d = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f51506d = i12;
                    E();
                    i10 = this.f51506d;
                    i11 = this.f51507e;
                } else {
                    if (c11 == '\n') {
                        this.f51508f++;
                        this.f51509g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f51506d = i10;
        } while (h(1));
        throw Y("Unterminated string");
    }

    private boolean J(String str) {
        int length = str.length();
        while (true) {
            if (this.f51506d + length > this.f51507e && !h(length)) {
                return false;
            }
            char[] cArr = this.f51505c;
            int i10 = this.f51506d;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f51505c[this.f51506d + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f51508f++;
            this.f51509g = i10 + 1;
            this.f51506d++;
        }
    }

    private void O() {
        char c10;
        do {
            if (this.f51506d >= this.f51507e && !h(1)) {
                return;
            }
            char[] cArr = this.f51505c;
            int i10 = this.f51506d;
            int i11 = i10 + 1;
            this.f51506d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f51508f++;
                this.f51509g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void S() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f51506d
            int r2 = r1 + r0
            int r3 = r4.f51507e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f51505c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.a()
        L4b:
            int r1 = r4.f51506d
            int r1 = r1 + r0
            r4.f51506d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f51506d = r1
            r0 = 1
            boolean r0 = r4.h(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.S():void");
    }

    private IOException Y(String str) throws d {
        throw new d(str + k());
    }

    private void a() throws IOException {
        if (!this.f51504b) {
            throw Y("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void b() throws IOException {
        m(true);
        int i10 = this.f51506d;
        int i11 = i10 - 1;
        this.f51506d = i11;
        if (i10 + 4 <= this.f51507e || h(5)) {
            char[] cArr = this.f51505c;
            if (cArr[i11] == ')' && cArr[i10] == ']' && cArr[i10 + 1] == '}' && cArr[i10 + 2] == '\'' && cArr[i10 + 3] == '\n') {
                this.f51506d += 5;
            }
        }
    }

    private boolean h(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f51505c;
        int i13 = this.f51509g;
        int i14 = this.f51506d;
        this.f51509g = i13 - i14;
        int i15 = this.f51507e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f51507e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f51507e = 0;
        }
        this.f51506d = 0;
        do {
            Reader reader = this.f51503a;
            int i17 = this.f51507e;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f51507e + i18;
            this.f51507e = i11;
            if (this.f51508f == 0 && (i12 = this.f51509g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f51506d++;
                this.f51509g = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private boolean j(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        a();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m(boolean r9) throws java.io.IOException {
        /*
            r8 = this;
            char[] r0 = r8.f51505c
            int r1 = r8.f51506d
            int r2 = r8.f51507e
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r8.f51506d = r1
            boolean r1 = r8.h(r3)
            if (r1 != 0) goto L30
            if (r9 != 0) goto L15
            r9 = -1
            return r9
        L15:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r8.k()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L30:
            int r1 = r8.f51506d
            int r2 = r8.f51507e
        L34:
            int r4 = r1 + 1
            char r5 = r0[r1]
            r6 = 10
            if (r5 != r6) goto L45
            int r1 = r8.f51508f
            int r1 = r1 + r3
            r8.f51508f = r1
            r8.f51509g = r4
            goto Lb2
        L45:
            r6 = 32
            if (r5 == r6) goto Lb2
            r6 = 13
            if (r5 == r6) goto Lb2
            r6 = 9
            if (r5 != r6) goto L52
            goto Lb2
        L52:
            r6 = 47
            if (r5 != r6) goto L9d
            r8.f51506d = r4
            r7 = 2
            if (r4 != r2) goto L69
            r8.f51506d = r1
            boolean r1 = r8.h(r7)
            int r2 = r8.f51506d
            int r2 = r2 + r3
            r8.f51506d = r2
            if (r1 != 0) goto L69
            goto L76
        L69:
            r8.a()
            int r1 = r8.f51506d
            char r2 = r0[r1]
            r3 = 42
            if (r2 == r3) goto L83
            if (r2 == r6) goto L77
        L76:
            return r5
        L77:
            int r1 = r1 + 1
            r8.f51506d = r1
            r8.O()
            int r1 = r8.f51506d
            int r2 = r8.f51507e
            goto L6
        L83:
            int r1 = r1 + 1
            r8.f51506d = r1
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r8.J(r1)
            if (r1 == 0) goto L96
            int r1 = r8.f51506d
            int r1 = r1 + r7
            int r2 = r8.f51507e
            goto L6
        L96:
            java.lang.String r9 = "Unterminated comment"
            java.io.IOException r9 = r8.Y(r9)
            throw r9
        L9d:
            r1 = 35
            if (r5 != r1) goto Laf
            r8.f51506d = r4
            r8.a()
            r8.O()
            int r1 = r8.f51506d
            int r2 = r8.f51507e
            goto L6
        Laf:
            r8.f51506d = r4
            return r5
        Lb2:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.m(boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f51506d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String q(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f51505c
            r1 = 0
        L3:
            int r2 = r9.f51506d
            int r3 = r9.f51507e
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f51506d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4d
            r9.f51506d = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L3e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L3e:
            r1.append(r0, r3, r2)
            char r2 = r9.E()
            r1.append(r2)
            int r2 = r9.f51506d
            int r3 = r9.f51507e
            goto L7
        L4d:
            r5 = 10
            if (r2 != r5) goto L58
            int r2 = r9.f51508f
            int r2 = r2 + r6
            r9.f51508f = r2
            r9.f51509g = r7
        L58:
            r2 = r7
            goto L9
        L5a:
            if (r1 != 0) goto L6a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f51506d = r2
            boolean r2 = r9.h(r6)
            if (r2 == 0) goto L78
            goto L3
        L78:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.Y(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.q(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String w() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f51506d
            int r4 = r3 + r2
            int r5 = r6.f51507e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f51505c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.a()
            goto L5c
        L4e:
            char[] r3 = r6.f51505c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.h(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f51505c
            int r4 = r6.f51506d
            r0.append(r3, r4, r2)
            int r3 = r6.f51506d
            int r3 = r3 + r2
            r6.f51506d = r3
            r2 = 1
            boolean r2 = r6.h(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f51505c
            int r3 = r6.f51506d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f51505c
            int r3 = r6.f51506d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f51506d
            int r2 = r2 + r1
            r6.f51506d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.w():java.lang.String");
    }

    private int z() {
        String str;
        String str2;
        int i10;
        char c10 = this.f51505c[this.f51506d];
        if (c10 == 't' || c10 == 'T') {
            str = com.amazon.a.a.o.b.f34640af;
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = com.amazon.a.a.o.b.f34641ag;
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f51506d + i11 >= this.f51507e && !h(i11 + 1)) {
                return 0;
            }
            char c11 = this.f51505c[this.f51506d + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f51506d + length < this.f51507e || h(length + 1)) && j(this.f51505c[this.f51506d + length])) {
            return 0;
        }
        this.f51506d += length;
        this.f51510h = i10;
        return i10;
    }

    public void B() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 3) {
            D(1);
            this.f51517o[this.f51515m - 1] = 0;
            this.f51510h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + k());
        }
    }

    public final void F(boolean z10) {
        this.f51504b = z10;
    }

    public String H0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = this.f51515m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f51514l[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(this.f51517o[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
                String str = this.f51516n[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public void I() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + k());
        }
        int i10 = this.f51515m;
        int i11 = i10 - 1;
        this.f51515m = i11;
        this.f51516n[i11] = null;
        int[] iArr = this.f51517o;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f51510h = 0;
    }

    public void W() throws IOException {
        int i10 = 0;
        do {
            int iG = this.f51510h;
            if (iG == 0) {
                iG = g();
            }
            if (iG == 3) {
                D(1);
            } else if (iG == 1) {
                D(3);
            } else if (iG == 4 || iG == 2) {
                this.f51515m--;
                i10--;
                this.f51510h = 0;
            } else {
                if (iG == 14 || iG == 10) {
                    S();
                } else if (iG == 8 || iG == 12) {
                    H('\'');
                } else if (iG == 9 || iG == 13) {
                    H('\"');
                } else if (iG == 16) {
                    this.f51506d += this.f51512j;
                }
                this.f51510h = 0;
            }
            i10++;
            this.f51510h = 0;
        } while (i10 != 0);
        int[] iArr = this.f51517o;
        int i11 = this.f51515m;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f51516n[i11 - 1] = "null";
    }

    public String X0() throws IOException {
        String str;
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 10) {
            str = w();
        } else if (iG == 8) {
            str = q('\'');
        } else if (iG == 9) {
            str = q('\"');
        } else if (iG == 11) {
            str = this.f51513k;
            this.f51513k = null;
        } else if (iG == 15) {
            str = Long.toString(this.f51511i);
        } else {
            if (iG != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + k());
            }
            str = new String(this.f51505c, this.f51506d, this.f51512j);
            this.f51506d += this.f51512j;
        }
        this.f51510h = 0;
        int[] iArr = this.f51517o;
        int i10 = this.f51515m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51510h = 0;
        this.f51514l[0] = 8;
        this.f51515m = 1;
        this.f51503a.close();
    }

    int g() throws IOException {
        int iM;
        int[] iArr = this.f51514l;
        int i10 = this.f51515m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iM2 = m(true);
            if (iM2 != 44) {
                if (iM2 != 59) {
                    if (iM2 != 93) {
                        throw Y("Unterminated array");
                    }
                    this.f51510h = 4;
                    return 4;
                }
                a();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iM = m(true)) != 44) {
                    if (iM != 59) {
                        if (iM != 125) {
                            throw Y("Unterminated object");
                        }
                        this.f51510h = 2;
                        return 2;
                    }
                    a();
                }
                int iM3 = m(true);
                if (iM3 == 34) {
                    this.f51510h = 13;
                    return 13;
                }
                if (iM3 == 39) {
                    a();
                    this.f51510h = 12;
                    return 12;
                }
                if (iM3 == 125) {
                    if (i11 == 5) {
                        throw Y("Expected name");
                    }
                    this.f51510h = 2;
                    return 2;
                }
                a();
                this.f51506d--;
                if (!j((char) iM3)) {
                    throw Y("Expected name");
                }
                this.f51510h = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iM4 = m(true);
                if (iM4 != 58) {
                    if (iM4 != 61) {
                        throw Y("Expected ':'");
                    }
                    a();
                    if (this.f51506d < this.f51507e || h(1)) {
                        char[] cArr = this.f51505c;
                        int i12 = this.f51506d;
                        if (cArr[i12] == '>') {
                            this.f51506d = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f51504b) {
                    b();
                }
                this.f51514l[this.f51515m - 1] = 7;
            } else if (i11 == 7) {
                if (m(false) == -1) {
                    this.f51510h = 17;
                    return 17;
                }
                a();
                this.f51506d--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM5 = m(true);
        if (iM5 == 34) {
            this.f51510h = 9;
            return 9;
        }
        if (iM5 == 39) {
            a();
            this.f51510h = 8;
            return 8;
        }
        if (iM5 != 44 && iM5 != 59) {
            if (iM5 == 91) {
                this.f51510h = 3;
                return 3;
            }
            if (iM5 != 93) {
                if (iM5 == 123) {
                    this.f51510h = 1;
                    return 1;
                }
                this.f51506d--;
                int iZ = z();
                if (iZ != 0) {
                    return iZ;
                }
                int iC = C();
                if (iC != 0) {
                    return iC;
                }
                if (!j(this.f51505c[this.f51506d])) {
                    throw Y("Expected value");
                }
                a();
                this.f51510h = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f51510h = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw Y("Unexpected value");
        }
        a();
        this.f51506d--;
        this.f51510h = 7;
        return 7;
    }

    public boolean hasNext() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        return (iG == 2 || iG == 4) ? false : true;
    }

    String k() {
        return " at line " + (this.f51508f + 1) + " column " + ((this.f51506d - this.f51509g) + 1) + " path " + H0();
    }

    public boolean l() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 5) {
            this.f51510h = 0;
            int[] iArr = this.f51517o;
            int i10 = this.f51515m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iG == 6) {
            this.f51510h = 0;
            int[] iArr2 = this.f51517o;
            int i11 = this.f51515m - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + peek() + k());
    }

    public double nextDouble() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.f51510h = 0;
            int[] iArr = this.f51517o;
            int i10 = this.f51515m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f51511i;
        }
        if (iG == 16) {
            this.f51513k = new String(this.f51505c, this.f51506d, this.f51512j);
            this.f51506d += this.f51512j;
        } else if (iG == 8 || iG == 9) {
            this.f51513k = q(iG == 8 ? '\'' : '\"');
        } else if (iG == 10) {
            this.f51513k = w();
        } else if (iG != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + k());
        }
        this.f51510h = 11;
        double d10 = Double.parseDouble(this.f51513k);
        if (!this.f51504b && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new d("JSON forbids NaN and infinities: " + d10 + k());
        }
        this.f51513k = null;
        this.f51510h = 0;
        int[] iArr2 = this.f51517o;
        int i11 = this.f51515m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int nextInt() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            long j10 = this.f51511i;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f51510h = 0;
                int[] iArr = this.f51517o;
                int i11 = this.f51515m - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f51511i + k());
        }
        if (iG == 16) {
            this.f51513k = new String(this.f51505c, this.f51506d, this.f51512j);
            this.f51506d += this.f51512j;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + k());
            }
            if (iG == 10) {
                this.f51513k = w();
            } else {
                this.f51513k = q(iG == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f51513k);
                this.f51510h = 0;
                int[] iArr2 = this.f51517o;
                int i13 = this.f51515m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f51510h = 11;
        double d10 = Double.parseDouble(this.f51513k);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f51513k + k());
        }
        this.f51513k = null;
        this.f51510h = 0;
        int[] iArr3 = this.f51517o;
        int i15 = this.f51515m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long nextLong() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.f51510h = 0;
            int[] iArr = this.f51517o;
            int i10 = this.f51515m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f51511i;
        }
        if (iG == 16) {
            this.f51513k = new String(this.f51505c, this.f51506d, this.f51512j);
            this.f51506d += this.f51512j;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + k());
            }
            if (iG == 10) {
                this.f51513k = w();
            } else {
                this.f51513k = q(iG == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f51513k);
                this.f51510h = 0;
                int[] iArr2 = this.f51517o;
                int i11 = this.f51515m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f51510h = 11;
        double d10 = Double.parseDouble(this.f51513k);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f51513k + k());
        }
        this.f51513k = null;
        this.f51510h = 0;
        int[] iArr3 = this.f51517o;
        int i12 = this.f51515m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public void o() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 7) {
            this.f51510h = 0;
            int[] iArr = this.f51517o;
            int i10 = this.f51515m - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + k());
    }

    public b peek() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        switch (iG) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String r0() throws IOException {
        String strQ;
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 14) {
            strQ = w();
        } else if (iG == 12) {
            strQ = q('\'');
        } else {
            if (iG != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + k());
            }
            strQ = q('\"');
        }
        this.f51510h = 0;
        this.f51516n[this.f51515m - 1] = strQ;
        return strQ;
    }

    public String toString() {
        return getClass().getSimpleName() + k();
    }

    public void x() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 1) {
            D(3);
            this.f51510h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + k());
        }
    }

    public void y() throws IOException {
        int iG = this.f51510h;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + k());
        }
        int i10 = this.f51515m;
        this.f51515m = i10 - 1;
        int[] iArr = this.f51517o;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f51510h = 0;
    }
}
