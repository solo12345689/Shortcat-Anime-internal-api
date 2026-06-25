package Wh;

import Yh.x;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a */
    private final List f20966a;

    /* JADX INFO: renamed from: b */
    private int f20967b;

    /* JADX INFO: renamed from: c */
    private int f20968c;

    /* JADX INFO: renamed from: d */
    private Zh.f f20969d = Zh.f.c("", null);

    /* JADX INFO: renamed from: e */
    private int f20970e = 0;

    m(List list, int i10, int i11) {
        this.f20966a = list;
        this.f20967b = i10;
        this.f20968c = i11;
        if (list.isEmpty()) {
            return;
        }
        a(i10, i11);
        p((Zh.f) list.get(i10));
    }

    private void a(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f20966a.size()) {
            throw new IllegalArgumentException("Line index " + i10 + " out of range, number of lines: " + this.f20966a.size());
        }
        Zh.f fVar = (Zh.f) this.f20966a.get(i10);
        if (i11 < 0 || i11 > fVar.a().length()) {
            throw new IllegalArgumentException("Index " + i11 + " out of range, line length: " + fVar.a().length());
        }
    }

    public static m k(Zh.g gVar) {
        return new m(gVar.d(), 0, 0);
    }

    private void p(Zh.f fVar) {
        this.f20969d = fVar;
        this.f20970e = fVar.a().length();
    }

    public int b(char c10) {
        int i10 = 0;
        while (true) {
            char cL = l();
            if (cL == 0) {
                return -1;
            }
            if (cL == c10) {
                return i10;
            }
            i10++;
            h();
        }
    }

    public int c(Xh.b bVar) {
        int i10 = 0;
        while (true) {
            char cL = l();
            if (cL == 0) {
                return -1;
            }
            if (bVar.a(cL)) {
                return i10;
            }
            i10++;
            h();
        }
    }

    public Zh.g d(l lVar, l lVar2) {
        int i10 = lVar.f20964a;
        if (i10 == lVar2.f20964a) {
            Zh.f fVar = (Zh.f) this.f20966a.get(i10);
            CharSequence charSequenceSubSequence = fVar.a().subSequence(lVar.f20965b, lVar2.f20965b);
            x xVarB = fVar.b();
            return Zh.g.g(Zh.f.c(charSequenceSubSequence, xVarB != null ? x.d(xVarB.c(), xVarB.a() + lVar.f20965b, charSequenceSubSequence.length()) : null));
        }
        Zh.g gVarB = Zh.g.b();
        Zh.f fVar2 = (Zh.f) this.f20966a.get(lVar.f20964a);
        gVarB.a(fVar2.d(lVar.f20965b, fVar2.a().length()));
        int i11 = lVar.f20964a;
        while (true) {
            i11++;
            int i12 = lVar2.f20964a;
            if (i11 >= i12) {
                gVarB.a(((Zh.f) this.f20966a.get(i12)).d(0, lVar2.f20965b));
                return gVarB;
            }
            gVarB.a((Zh.f) this.f20966a.get(i11));
        }
    }

    public boolean e() {
        return this.f20968c < this.f20970e || this.f20967b < this.f20966a.size() - 1;
    }

    public int f(Xh.b bVar) {
        int i10 = 0;
        while (bVar.a(l())) {
            i10++;
            h();
        }
        return i10;
    }

    public int g(char c10) {
        int i10 = 0;
        while (l() == c10) {
            i10++;
            h();
        }
        return i10;
    }

    public void h() {
        int i10 = this.f20968c + 1;
        this.f20968c = i10;
        if (i10 > this.f20970e) {
            int i11 = this.f20967b + 1;
            this.f20967b = i11;
            if (i11 < this.f20966a.size()) {
                p((Zh.f) this.f20966a.get(this.f20967b));
            } else {
                p(Zh.f.c("", null));
            }
            this.f20968c = 0;
        }
    }

    public boolean i(char c10) {
        if (l() != c10) {
            return false;
        }
        h();
        return true;
    }

    public boolean j(String str) {
        int i10 = this.f20968c;
        if (i10 >= this.f20970e || i10 + str.length() > this.f20970e) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (this.f20969d.a().charAt(this.f20968c + i11) != str.charAt(i11)) {
                return false;
            }
        }
        this.f20968c += str.length();
        return true;
    }

    public char l() {
        return this.f20968c < this.f20970e ? this.f20969d.a().charAt(this.f20968c) : this.f20967b < this.f20966a.size() + (-1) ? '\n' : (char) 0;
    }

    public int m() {
        if (this.f20968c >= this.f20970e) {
            return this.f20967b < this.f20966a.size() + (-1) ? 10 : 0;
        }
        char cCharAt = this.f20969d.a().charAt(this.f20968c);
        if (!Character.isHighSurrogate(cCharAt) || this.f20968c + 1 >= this.f20970e) {
            return cCharAt;
        }
        char cCharAt2 = this.f20969d.a().charAt(this.f20968c + 1);
        return Character.isLowSurrogate(cCharAt2) ? Character.toCodePoint(cCharAt, cCharAt2) : cCharAt;
    }

    public int n() {
        int i10 = this.f20968c;
        if (i10 <= 0) {
            return this.f20967b > 0 ? 10 : 0;
        }
        int i11 = i10 - 1;
        char cCharAt = this.f20969d.a().charAt(i11);
        if (Character.isLowSurrogate(cCharAt) && i11 > 0) {
            char cCharAt2 = this.f20969d.a().charAt(i10 - 2);
            if (Character.isHighSurrogate(cCharAt2)) {
                return Character.toCodePoint(cCharAt2, cCharAt);
            }
        }
        return cCharAt;
    }

    public l o() {
        return new l(this.f20967b, this.f20968c);
    }

    public void q(l lVar) {
        a(lVar.f20964a, lVar.f20965b);
        int i10 = lVar.f20964a;
        this.f20967b = i10;
        this.f20968c = lVar.f20965b;
        p((Zh.f) this.f20966a.get(i10));
    }

    public int r() {
        int i10 = 0;
        while (true) {
            char cL = l();
            if (cL != ' ') {
                switch (cL) {
                    case '\t':
                    case '\n':
                    case 11:
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    case '\r':
                        break;
                    default:
                        return i10;
                }
            }
            i10++;
            h();
        }
    }
}
