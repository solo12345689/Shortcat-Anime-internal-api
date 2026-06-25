package Vh;

import Yh.AbstractC2491a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class q extends ai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yh.q f20478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20480c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends ai.b {
        @Override // ai.e
        public ai.f a(ai.h hVar, ai.g gVar) {
            ai.d dVarA = gVar.a();
            if (hVar.b() >= Xh.f.f22055a) {
                return ai.f.c();
            }
            b bVarO = q.o(hVar.a().a(), hVar.d(), hVar.getColumn() + hVar.b(), !gVar.b().f());
            if (bVarO == null) {
                return ai.f.c();
            }
            int i10 = bVarO.f20482b;
            r rVar = new r(i10 - hVar.getColumn());
            if ((dVarA instanceof q) && q.n((Yh.q) dVarA.f(), bVarO.f20481a)) {
                return ai.f.d(rVar).a(i10);
            }
            q qVar = new q(bVarO.f20481a);
            bVarO.f20481a.o(true);
            return ai.f.d(qVar, rVar).a(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Yh.q f20481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f20482b;

        b(Yh.q qVar, int i10) {
            this.f20481a = qVar;
            this.f20482b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Yh.q f20483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f20484b;

        c(Yh.q qVar, int i10) {
            this.f20483a = qVar;
            this.f20484b = i10;
        }
    }

    public q(Yh.q qVar) {
        this.f20478a = qVar;
    }

    private static boolean l(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static boolean m(CharSequence charSequence, int i10) {
        char cCharAt;
        return i10 >= charSequence.length() || (cCharAt = charSequence.charAt(i10)) == '\t' || cCharAt == ' ';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(Yh.q qVar, Yh.q qVar2) {
        if ((qVar instanceof Yh.c) && (qVar2 instanceof Yh.c)) {
            return l(Character.valueOf(((Yh.c) qVar).p()), Character.valueOf(((Yh.c) qVar2).p()));
        }
        if ((qVar instanceof Yh.u) && (qVar2 instanceof Yh.u)) {
            return l(Character.valueOf(((Yh.u) qVar).p()), Character.valueOf(((Yh.u) qVar2).p()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b o(CharSequence charSequence, int i10, int i11, boolean z10) {
        boolean z11;
        c cVarP = p(charSequence, i10);
        if (cVarP == null) {
            return null;
        }
        Yh.q qVar = cVarP.f20483a;
        int i12 = cVarP.f20484b;
        int i13 = i11 + (i12 - i10);
        int length = charSequence.length();
        int iA = i13;
        while (true) {
            if (i12 >= length) {
                z11 = false;
                break;
            }
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt != '\t') {
                if (cCharAt != ' ') {
                    z11 = true;
                    break;
                }
                iA++;
            } else {
                iA += Xh.f.a(iA);
            }
            i12++;
        }
        if (z10 && (((qVar instanceof Yh.u) && ((Yh.u) qVar).q() != 1) || !z11)) {
            return null;
        }
        if (!z11 || iA - i13 > Xh.f.f22055a) {
            iA = i13 + 1;
        }
        return new b(qVar, iA);
    }

    private static c p(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '*' && cCharAt != '+' && cCharAt != '-') {
            return q(charSequence, i10);
        }
        int i11 = i10 + 1;
        if (!m(charSequence, i11)) {
            return null;
        }
        Yh.c cVar = new Yh.c();
        cVar.q(cCharAt);
        return new c(cVar, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static Vh.q.c q(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = 0
            r2 = r7
        L6:
            r3 = 0
            if (r2 >= r0) goto L4b
            char r4 = r6.charAt(r2)
            r5 = 41
            if (r4 == r5) goto L23
            r5 = 46
            if (r4 == r5) goto L23
            switch(r4) {
                case 48: goto L19;
                case 49: goto L19;
                case 50: goto L19;
                case 51: goto L19;
                case 52: goto L19;
                case 53: goto L19;
                case 54: goto L19;
                case 55: goto L19;
                case 56: goto L19;
                case 57: goto L19;
                default: goto L18;
            }
        L18:
            return r3
        L19:
            int r1 = r1 + 1
            r4 = 9
            if (r1 <= r4) goto L20
            return r3
        L20:
            int r2 = r2 + 1
            goto L6
        L23:
            r0 = 1
            if (r1 < r0) goto L4b
            int r0 = r2 + 1
            boolean r1 = m(r6, r0)
            if (r1 == 0) goto L4b
            java.lang.CharSequence r6 = r6.subSequence(r7, r2)
            java.lang.String r6 = r6.toString()
            Yh.u r7 = new Yh.u
            r7.<init>()
            int r6 = java.lang.Integer.parseInt(r6)
            r7.s(r6)
            r7.r(r4)
            Vh.q$c r6 = new Vh.q$c
            r6.<init>(r7, r0)
            return r6
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Vh.q.q(java.lang.CharSequence, int):Vh.q$c");
    }

    @Override // ai.a, ai.d
    public boolean a() {
        return true;
    }

    @Override // ai.a, ai.d
    public boolean c(AbstractC2491a abstractC2491a) {
        if (!(abstractC2491a instanceof Yh.r)) {
            return false;
        }
        if (this.f20479b && this.f20480c == 1) {
            this.f20478a.o(false);
            this.f20479b = false;
        }
        return true;
    }

    @Override // ai.d
    public AbstractC2491a f() {
        return this.f20478a;
    }

    @Override // ai.d
    public ai.c i(ai.h hVar) {
        if (hVar.c()) {
            this.f20479b = true;
            this.f20480c = 0;
        } else if (this.f20479b) {
            this.f20480c++;
        }
        return ai.c.b(hVar.getIndex());
    }
}
