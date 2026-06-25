package Vh;

import Yh.AbstractC2491a;
import Yh.B;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class u extends ai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f20493a = new B();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends ai.b {
        @Override // ai.e
        public ai.f a(ai.h hVar, ai.g gVar) {
            if (hVar.b() >= 4) {
                return ai.f.c();
            }
            int iD = hVar.d();
            CharSequence charSequenceA = hVar.a().a();
            return u.k(charSequenceA, iD) ? ai.f.d(new u()).b(charSequenceA.length()) : ai.f.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i13++;
                } else if (cCharAt == '-') {
                    i11++;
                } else {
                    if (cCharAt != '_') {
                        return false;
                    }
                    i12++;
                }
            }
            i10++;
        }
        if (i11 >= 3 && i12 == 0 && i13 == 0) {
            return true;
        }
        if (i12 >= 3 && i11 == 0 && i13 == 0) {
            return true;
        }
        return i13 >= 3 && i11 == 0 && i12 == 0;
    }

    @Override // ai.d
    public AbstractC2491a f() {
        return this.f20493a;
    }

    @Override // ai.d
    public ai.c i(ai.h hVar) {
        return ai.c.d();
    }
}
