package Xf;

import Td.C2160k;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Xf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2364a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21965a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21967c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f21966b = new F();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private StringBuilder f21968d = new StringBuilder();

    private final int B(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        x(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new C2160k();
    }

    private final String L() {
        String str = this.f21967c;
        AbstractC5504s.e(str);
        this.f21967c = null;
        return str;
    }

    public static /* synthetic */ boolean O(AbstractC2364a abstractC2364a, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return abstractC2364a.N(z10);
    }

    private final boolean Q() {
        return C().charAt(this.f21965a - 1) != '\"';
    }

    private final int a(int i10) {
        int iH = H(i10);
        if (iH == -1) {
            x(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new C2160k();
        }
        int i11 = iH + 1;
        char cCharAt = C().charAt(iH);
        if (cCharAt == 'u') {
            return c(C(), i11);
        }
        char cB = AbstractC2365b.b(cCharAt);
        if (cB != 0) {
            this.f21968d.append(cB);
            return i11;
        }
        x(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new C2160k();
    }

    private final int b(int i10, int i11) {
        d(i10, i11);
        return a(i11 + 1);
    }

    private final int c(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f21968d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
            return i11;
        }
        this.f21965a = i10;
        u();
        if (this.f21965a + 4 < charSequence.length()) {
            return c(charSequence, this.f21965a);
        }
        x(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new C2160k();
    }

    private final boolean f(int i10) {
        int iH = H(i10);
        if (iH >= C().length() || iH == -1) {
            x(this, "EOF", 0, null, 6, null);
            throw new C2160k();
        }
        int i11 = iH + 1;
        int iCharAt = C().charAt(iH) | ' ';
        if (iCharAt == 102) {
            h("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            h("rue", i11);
            return true;
        }
        x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6, null);
        throw new C2160k();
    }

    private final void h(String str, int i10) {
        if (C().length() - i10 < str.length()) {
            x(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new C2160k();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (C().charAt(i10 + i11) | ' ')) {
                x(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6, null);
                throw new C2160k();
            }
        }
        this.f21965a = i10 + str.length();
    }

    private static final double n(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new Td.r();
    }

    private final String s(int i10, int i11) {
        d(i10, i11);
        String string = this.f21968d.toString();
        AbstractC5504s.g(string, "toString(...)");
        this.f21968d.setLength(0);
        return string;
    }

    public static /* synthetic */ Void x(AbstractC2364a abstractC2364a, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractC2364a.f21965a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return abstractC2364a.w(str, i10, str2);
    }

    public static /* synthetic */ Void z(AbstractC2364a abstractC2364a, byte b10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return abstractC2364a.y(b10, z10);
    }

    public final void A(String key) {
        AbstractC5504s.h(key, "key");
        w("Encountered an unknown key '" + key + '\'', Df.r.p0(K(0, this.f21965a), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new C2160k();
    }

    protected abstract CharSequence C();

    protected final boolean D(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    public abstract String E(String str, boolean z10);

    public byte F() {
        CharSequence charSequenceC = C();
        int i10 = this.f21965a;
        while (true) {
            int iH = H(i10);
            if (iH == -1) {
                this.f21965a = iH;
                return (byte) 10;
            }
            char cCharAt = charSequenceC.charAt(iH);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f21965a = iH;
                return AbstractC2365b.a(cCharAt);
            }
            i10 = iH + 1;
        }
    }

    public final String G(boolean z10) {
        String strO;
        byte bF = F();
        if (z10) {
            if (bF != 1 && bF != 0) {
                return null;
            }
            strO = q();
        } else {
            if (bF != 1) {
                return null;
            }
            strO = o();
        }
        this.f21967c = strO;
        return strO;
    }

    public abstract int H(int i10);

    public final void I(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte bF = F();
        if (bF != 8 && bF != 6) {
            q();
            return;
        }
        while (true) {
            byte bF2 = F();
            if (bF2 != 1) {
                if (bF2 == 8 || bF2 == 6) {
                    arrayList.add(Byte.valueOf(bF2));
                } else if (bF2 == 9) {
                    if (((Number) AbstractC2279u.y0(arrayList)).byteValue() != 8) {
                        throw C.f(this.f21965a, "found ] instead of } at path: " + this.f21966b, C());
                    }
                    AbstractC2279u.M(arrayList);
                } else if (bF2 == 7) {
                    if (((Number) AbstractC2279u.y0(arrayList)).byteValue() != 6) {
                        throw C.f(this.f21965a, "found } instead of ] at path: " + this.f21966b, C());
                    }
                    AbstractC2279u.M(arrayList);
                } else if (bF2 == 10) {
                    x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new C2160k();
                }
                j();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                q();
            } else {
                i();
            }
        }
    }

    public abstract int J();

    public String K(int i10, int i11) {
        return C().subSequence(i10, i11).toString();
    }

    public final boolean M() {
        int iJ = J();
        CharSequence charSequenceC = C();
        if (iJ >= charSequenceC.length() || iJ == -1 || charSequenceC.charAt(iJ) != ',') {
            return false;
        }
        this.f21965a++;
        return true;
    }

    public final boolean N(boolean z10) {
        int iH = H(J());
        int length = C().length() - iH;
        if (length < 4 || iH == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != C().charAt(iH + i10)) {
                return false;
            }
        }
        if (length > 4 && AbstractC2365b.a(C().charAt(iH + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f21965a = iH + 4;
        return true;
    }

    protected final void P(char c10) {
        int i10 = this.f21965a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f21965a = i10 - 1;
                String strQ = q();
                this.f21965a = i10;
                if (AbstractC5504s.c(strQ, "null")) {
                    w("Expected string literal but 'null' literal was found", this.f21965a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new C2160k();
                }
            } catch (Throwable th2) {
                this.f21965a = i10;
                throw th2;
            }
        }
        z(this, AbstractC2365b.a(c10), false, 2, null);
        throw new C2160k();
    }

    protected void d(int i10, int i11) {
        this.f21968d.append(C(), i10, i11);
    }

    public abstract boolean e();

    public final boolean g() {
        boolean z10;
        int iJ = J();
        if (iJ == C().length()) {
            x(this, "EOF", 0, null, 6, null);
            throw new C2160k();
        }
        if (C().charAt(iJ) == '\"') {
            iJ++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zF = f(iJ);
        if (!z10) {
            return zF;
        }
        if (this.f21965a == C().length()) {
            x(this, "EOF", 0, null, 6, null);
            throw new C2160k();
        }
        if (C().charAt(this.f21965a) == '\"') {
            this.f21965a++;
            return zF;
        }
        x(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new C2160k();
    }

    public abstract String i();

    public abstract byte j();

    public final byte k(byte b10) {
        byte bJ = j();
        if (bJ == b10) {
            return bJ;
        }
        z(this, b10, false, 2, null);
        throw new C2160k();
    }

    public abstract void l(char c10);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        x(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0201, code lost:
    
        throw new Td.C2160k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        x(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013e, code lost:
    
        throw new Td.C2160k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        if (r2 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        if (r1 == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        if (r9 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
    
        if (r1 == (r2 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
    
        if (C().charAt(r2) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015f, code lost:
    
        x(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        throw new Td.C2160k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0170, code lost:
    
        x(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        throw new Td.C2160k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
    
        r18.f21965a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
    
        if (r8 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        r1 = r10 * n(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        x(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
    
        throw new Td.C2160k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
    
        x(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d4, code lost:
    
        throw new Td.C2160k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d5, code lost:
    
        if (r9 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dc, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e0, code lost:
    
        x(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f0, code lost:
    
        throw new Td.C2160k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m() {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Xf.AbstractC2364a.m():long");
    }

    public final String o() {
        return this.f21967c != null ? L() : i();
    }

    protected final String p(CharSequence source, int i10, int i11) {
        AbstractC5504s.h(source, "source");
        char cCharAt = source.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iH = H(b(i10, i11));
                if (iH == -1) {
                    x(this, "Unexpected EOF", iH, null, 4, null);
                    throw new C2160k();
                }
                z10 = true;
                i10 = iH;
                i11 = i10;
            } else {
                i11++;
                if (i11 >= source.length()) {
                    d(i10, i11);
                    int iH2 = H(i11);
                    if (iH2 == -1) {
                        x(this, "Unexpected EOF", iH2, null, 4, null);
                        throw new C2160k();
                    }
                    i10 = iH2;
                    i11 = i10;
                    z10 = true;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(i11);
        }
        String strK = !z10 ? K(i10, i11) : s(i10, i11);
        this.f21965a = i11 + 1;
        return strK;
    }

    public final String q() {
        if (this.f21967c != null) {
            return L();
        }
        int iJ = J();
        if (iJ >= C().length() || iJ == -1) {
            x(this, "EOF", iJ, null, 4, null);
            throw new C2160k();
        }
        byte bA = AbstractC2365b.a(C().charAt(iJ));
        if (bA == 1) {
            return o();
        }
        if (bA != 0) {
            x(this, "Expected beginning of the string, but got " + C().charAt(iJ), 0, null, 6, null);
            throw new C2160k();
        }
        boolean z10 = false;
        while (AbstractC2365b.a(C().charAt(iJ)) == 0) {
            iJ++;
            if (iJ >= C().length()) {
                d(this.f21965a, iJ);
                int iH = H(iJ);
                if (iH == -1) {
                    this.f21965a = iJ;
                    return s(0, 0);
                }
                iJ = iH;
                z10 = true;
            }
        }
        String strK = !z10 ? K(this.f21965a, iJ) : s(this.f21965a, iJ);
        this.f21965a = iJ;
        return strK;
    }

    public final String r() {
        String strQ = q();
        if (!AbstractC5504s.c(strQ, "null") || !Q()) {
            return strQ;
        }
        x(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new C2160k();
    }

    public final void t() {
        this.f21967c = null;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) C()) + "', currentPosition=" + this.f21965a + ')';
    }

    public final void v() {
        if (j() == 10) {
            return;
        }
        x(this, "Expected EOF after parsing, but had " + C().charAt(this.f21965a - 1) + " instead", 0, null, 6, null);
        throw new C2160k();
    }

    public final Void w(String message, int i10, String hint) {
        String str;
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw C.f(i10, message + " at path: " + this.f21966b.a() + str, C());
    }

    public final Void y(byte b10, boolean z10) {
        String strC = AbstractC2365b.c(b10);
        int i10 = z10 ? this.f21965a - 1 : this.f21965a;
        x(this, "Expected " + strC + ", but had '" + ((this.f21965a == C().length() || i10 < 0) ? "EOF" : String.valueOf(C().charAt(i10))) + "' instead", i10, null, 4, null);
        throw new C2160k();
    }

    public void u() {
    }
}
