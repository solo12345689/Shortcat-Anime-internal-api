package Wh;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Xh.a f20956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Xh.a f20957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Xh.a f20958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Xh.a f20959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Xh.a f20960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Xh.a f20961f;

    static {
        Xh.a aVarB = Xh.a.b().d('A', 'Z').d('a', 'z').b();
        f20956a = aVarB;
        f20957b = aVarB;
        f20958c = aVarB.c().d('0', '9').c('-').b();
        Xh.a aVarB2 = aVarB.c().c('_').c(':').b();
        f20959d = aVarB2;
        f20960e = aVarB2.c().d('0', '9').c(com.amazon.a.a.o.c.a.b.f34706a).c('-').b();
        f20961f = Xh.a.b().c(' ').c('\t').c('\n').c((char) 11).c('\f').c('\r').c('\"').c('\'').c('=').c('<').c('>').c('`').b();
    }

    private static j b(l lVar, m mVar) {
        String strC = mVar.d(lVar, mVar.o()).c();
        Yh.l lVar2 = new Yh.l();
        lVar2.n(strC);
        return j.b(lVar2, mVar.o());
    }

    private static boolean c(m mVar) {
        mVar.h();
        if (!mVar.j("CDATA[")) {
            return false;
        }
        while (mVar.b(']') >= 0) {
            if (mVar.j("]]>")) {
                return true;
            }
            mVar.h();
        }
        return false;
    }

    private static boolean d(m mVar) {
        mVar.h();
        if (mVar.f(f20957b) < 1) {
            return false;
        }
        mVar.f(f20958c);
        mVar.r();
        return mVar.i('>');
    }

    private static boolean e(m mVar) {
        mVar.h();
        if (mVar.i('-') && !mVar.i('>') && !mVar.j("->")) {
            while (mVar.b('-') >= 0) {
                if (mVar.j("--")) {
                    return mVar.i('>');
                }
                mVar.h();
            }
        }
        return false;
    }

    private static boolean f(m mVar) {
        mVar.f(f20956a);
        if (mVar.r() <= 0 || mVar.b('>') < 0) {
            return false;
        }
        mVar.h();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r4.r() < 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r4.i('=') == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r4.r();
        r0 = r4.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r0 != '\'') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r4.b('\'') >= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r0 != '\"') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r4.b('\"') >= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r4.c(Wh.g.f20961f) > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r4.r() < 1) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r4.i('/');
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        return r4.i('>');
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0013, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        if (r4.r() >= 1) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4.f(Wh.g.f20959d) < 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r4.f(Wh.g.f20960e);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006b -> B:4:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean g(Wh.m r4) {
        /*
            r4.h()
            Xh.a r0 = Wh.g.f20958c
            r4.f(r0)
            int r0 = r4.r()
            r1 = 0
            r2 = 1
            if (r0 < r2) goto L12
        L10:
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L6e
            Xh.a r0 = Wh.g.f20959d
            int r0 = r4.f(r0)
            if (r0 < r2) goto L6e
            Xh.a r0 = Wh.g.f20960e
            r4.f(r0)
            int r0 = r4.r()
            if (r0 < r2) goto L2a
            r0 = r2
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r3 = 61
            boolean r3 = r4.i(r3)
            if (r3 == 0) goto L13
            r4.r()
            char r0 = r4.l()
            r3 = 39
            if (r0 != r3) goto L4c
            r4.h()
            int r0 = r4.b(r3)
            if (r0 >= 0) goto L48
            return r1
        L48:
            r4.h()
            goto L67
        L4c:
            r3 = 34
            if (r0 != r3) goto L5e
            r4.h()
            int r0 = r4.b(r3)
            if (r0 >= 0) goto L5a
            return r1
        L5a:
            r4.h()
            goto L67
        L5e:
            Xh.a r0 = Wh.g.f20961f
            int r0 = r4.c(r0)
            if (r0 > 0) goto L67
            return r1
        L67:
            int r0 = r4.r()
            if (r0 < r2) goto L12
            goto L10
        L6e:
            r0 = 47
            r4.i(r0)
            r0 = 62
            boolean r4 = r4.i(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Wh.g.g(Wh.m):boolean");
    }

    private static boolean h(m mVar) {
        mVar.h();
        while (mVar.b('?') > 0) {
            mVar.h();
            if (mVar.i('>')) {
                return true;
            }
        }
        return false;
    }

    @Override // Wh.h
    public j a(i iVar) {
        m mVarA = iVar.a();
        l lVarO = mVarA.o();
        mVarA.h();
        char cL = mVarA.l();
        if (f20957b.a(cL)) {
            if (g(mVarA)) {
                return b(lVarO, mVarA);
            }
        } else if (cL == '/') {
            if (d(mVarA)) {
                return b(lVarO, mVarA);
            }
        } else if (cL == '?') {
            if (h(mVarA)) {
                return b(lVarO, mVarA);
            }
        } else if (cL == '!') {
            mVarA.h();
            char cL2 = mVarA.l();
            if (cL2 == '-') {
                if (e(mVarA)) {
                    return b(lVarO, mVarA);
                }
            } else if (cL2 == '[') {
                if (c(mVarA)) {
                    return b(lVarO, mVarA);
                }
            } else if (f20956a.a(cL2) && f(mVarA)) {
                return b(lVarO, mVarA);
            }
        }
        return j.a();
    }
}
