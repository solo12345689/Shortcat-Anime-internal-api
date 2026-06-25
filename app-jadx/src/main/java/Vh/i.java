package Vh;

import Yh.AbstractC2491a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class i extends ai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yh.h f20434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f20436c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends ai.b {
        @Override // ai.e
        public ai.f a(ai.h hVar, ai.g gVar) {
            int iB = hVar.b();
            if (iB >= Xh.f.f22055a) {
                return ai.f.c();
            }
            int iD = hVar.d();
            i iVarL = i.l(hVar.a().a(), iD, iB);
            return iVarL != null ? ai.f.d(iVarL).b(iD + iVarL.f20434a.q()) : ai.f.c();
        }
    }

    public i(char c10, int i10, int i11) {
        Yh.h hVar = new Yh.h();
        this.f20434a = hVar;
        this.f20436c = new StringBuilder();
        hVar.s(c10);
        hVar.u(i10);
        hVar.t(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i l(CharSequence charSequence, int i10, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i10; i14 < length; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt == '`') {
                i12++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i13++;
            }
        }
        if (i12 >= 3 && i13 == 0) {
            if (Xh.f.b('`', charSequence, i10 + i12) != -1) {
                return null;
            }
            return new i('`', i12, i11);
        }
        if (i13 < 3 || i12 != 0) {
            return null;
        }
        return new i('~', i13, i11);
    }

    private boolean m(CharSequence charSequence, int i10) {
        char cO = this.f20434a.o();
        int iQ = this.f20434a.q();
        int iM = Xh.f.m(cO, charSequence, i10, charSequence.length()) - i10;
        return iM >= iQ && Xh.f.o(charSequence, i10 + iM, charSequence.length()) == charSequence.length();
    }

    @Override // ai.a, ai.d
    public void e(Zh.f fVar) {
        if (this.f20435b == null) {
            this.f20435b = fVar.a().toString();
        } else {
            this.f20436c.append(fVar.a());
            this.f20436c.append('\n');
        }
    }

    @Override // ai.d
    public AbstractC2491a f() {
        return this.f20434a;
    }

    @Override // ai.a, ai.d
    public void h() {
        this.f20434a.v(Xh.c.d(this.f20435b.trim()));
        this.f20434a.w(this.f20436c.toString());
    }

    @Override // ai.d
    public ai.c i(ai.h hVar) {
        int iD = hVar.d();
        int index = hVar.getIndex();
        CharSequence charSequenceA = hVar.a().a();
        if (hVar.b() < Xh.f.f22055a && iD < charSequenceA.length() && charSequenceA.charAt(iD) == this.f20434a.o() && m(charSequenceA, iD)) {
            return ai.c.c();
        }
        int length = charSequenceA.length();
        for (int iP = this.f20434a.p(); iP > 0 && index < length && charSequenceA.charAt(index) == ' '; iP--) {
            index++;
        }
        return ai.c.b(index);
    }
}
