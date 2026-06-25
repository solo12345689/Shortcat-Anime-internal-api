package Zh;

import Yh.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f23487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f23488b;

    private f(CharSequence charSequence, x xVar) {
        if (charSequence == null) {
            throw new NullPointerException("content must not be null");
        }
        this.f23487a = charSequence;
        this.f23488b = xVar;
    }

    public static f c(CharSequence charSequence, x xVar) {
        return new f(charSequence, xVar);
    }

    public CharSequence a() {
        return this.f23487a;
    }

    public x b() {
        return this.f23488b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Zh.f d(int r3, int r4) {
        /*
            r2 = this;
            java.lang.CharSequence r0 = r2.f23487a
            java.lang.CharSequence r0 = r0.subSequence(r3, r4)
            Yh.x r1 = r2.f23488b
            if (r1 == 0) goto L1d
            int r1 = r1.a()
            int r1 = r1 + r3
            int r4 = r4 - r3
            if (r4 == 0) goto L1d
            Yh.x r3 = r2.f23488b
            int r3 = r3.c()
            Yh.x r3 = Yh.x.d(r3, r1, r4)
            goto L1e
        L1d:
            r3 = 0
        L1e:
            Zh.f r3 = c(r0, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Zh.f.d(int, int):Zh.f");
    }
}
