package Xf;

import Td.C2160k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class X extends AbstractC2364a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f21964e;

    public X(String source) {
        AbstractC5504s.h(source, "source");
        this.f21964e = source;
    }

    @Override // Xf.AbstractC2364a
    public String E(String keyToMatch, boolean z10) {
        AbstractC5504s.h(keyToMatch, "keyToMatch");
        int i10 = this.f21965a;
        try {
            if (j() == 6 && AbstractC5504s.c(G(z10), keyToMatch)) {
                t();
                if (j() == 5) {
                    return G(z10);
                }
            }
            return null;
        } finally {
            this.f21965a = i10;
            t();
        }
    }

    @Override // Xf.AbstractC2364a
    public int H(int i10) {
        if (i10 < C().length()) {
            return i10;
        }
        return -1;
    }

    @Override // Xf.AbstractC2364a
    public int J() {
        char cCharAt;
        int i10 = this.f21965a;
        if (i10 == -1) {
            return i10;
        }
        String strC = C();
        while (i10 < strC.length() && ((cCharAt = strC.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f21965a = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Xf.AbstractC2364a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f21964e;
    }

    @Override // Xf.AbstractC2364a
    public boolean e() {
        int i10 = this.f21965a;
        if (i10 == -1) {
            return false;
        }
        String strC = C();
        while (i10 < strC.length()) {
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f21965a = i10;
                return D(cCharAt);
            }
            i10++;
        }
        this.f21965a = i10;
        return false;
    }

    @Override // Xf.AbstractC2364a
    public String i() {
        l('\"');
        int i10 = this.f21965a;
        int iI0 = Df.r.i0(C(), '\"', i10, false, 4, null);
        if (iI0 == -1) {
            q();
            y((byte) 1, false);
            throw new C2160k();
        }
        for (int i11 = i10; i11 < iI0; i11++) {
            if (C().charAt(i11) == '\\') {
                return p(C(), this.f21965a, i11);
            }
        }
        this.f21965a = iI0 + 1;
        String strSubstring = C().substring(i10, iI0);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // Xf.AbstractC2364a
    public byte j() {
        String strC = C();
        int i10 = this.f21965a;
        while (i10 != -1 && i10 < strC.length()) {
            int i11 = i10 + 1;
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f21965a = i11;
                return AbstractC2365b.a(cCharAt);
            }
            i10 = i11;
        }
        this.f21965a = strC.length();
        return (byte) 10;
    }

    @Override // Xf.AbstractC2364a
    public void l(char c10) {
        if (this.f21965a == -1) {
            P(c10);
        }
        String strC = C();
        int i10 = this.f21965a;
        while (i10 < strC.length()) {
            int i11 = i10 + 1;
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f21965a = i11;
                if (cCharAt == c10) {
                    return;
                } else {
                    P(c10);
                }
            }
            i10 = i11;
        }
        this.f21965a = -1;
        P(c10);
    }
}
