package Xf;

import Td.C2160k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class Z extends X {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(String source) {
        super(source);
        AbstractC5504s.h(source, "source");
    }

    @Override // Xf.AbstractC2364a
    public byte F() {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            return (byte) 10;
        }
        this.f21965a = iJ;
        return AbstractC2365b.a(strC.charAt(iJ));
    }

    @Override // Xf.X, Xf.AbstractC2364a
    public int J() {
        int i10;
        int iI0 = this.f21965a;
        if (iI0 == -1) {
            return iI0;
        }
        String strC = C();
        while (iI0 < strC.length()) {
            char cCharAt = strC.charAt(iI0);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iI0 + 1) >= strC.length()) {
                    break;
                }
                char cCharAt2 = strC.charAt(i10);
                if (cCharAt2 == '*') {
                    int iJ0 = Df.r.j0(strC, "*/", iI0 + 2, false, 4, null);
                    if (iJ0 == -1) {
                        this.f21965a = strC.length();
                        AbstractC2364a.x(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new C2160k();
                    }
                    iI0 = iJ0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iI0 = Df.r.i0(strC, '\n', iI0 + 2, false, 4, null);
                    iI0 = iI0 == -1 ? strC.length() : iI0 + 1;
                }
            }
        }
        this.f21965a = iI0;
        return iI0;
    }

    @Override // Xf.X, Xf.AbstractC2364a
    public boolean e() {
        int iJ = J();
        if (iJ >= C().length() || iJ == -1) {
            return false;
        }
        return D(C().charAt(iJ));
    }

    @Override // Xf.X, Xf.AbstractC2364a
    public byte j() {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            return (byte) 10;
        }
        this.f21965a = iJ + 1;
        return AbstractC2365b.a(strC.charAt(iJ));
    }

    @Override // Xf.X, Xf.AbstractC2364a
    public void l(char c10) {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            this.f21965a = -1;
            P(c10);
        }
        char cCharAt = strC.charAt(iJ);
        this.f21965a = iJ + 1;
        if (cCharAt == c10) {
            return;
        }
        P(c10);
    }
}
