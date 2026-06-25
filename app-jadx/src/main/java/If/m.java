package If;

import Lf.B;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class m extends B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f9167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f9168f;

    public m(long j10, m mVar, e eVar, int i10) {
        super(j10, mVar, i10);
        this.f9167e = eVar;
        this.f9168f = new AtomicReferenceArray(f.f9140b * 2);
    }

    private final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f9168f;
    }

    public final Object A(int i10) {
        return z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().c1((this.f11547c * ((long) f.f9140b)) + ((long) i10));
        }
        t();
    }

    public final Object D(int i10) {
        Object objA = A(i10);
        w(i10);
        return objA;
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, Object obj) {
        E(i10, obj);
    }

    @Override // Lf.B
    public int r() {
        return f.f9140b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        r4 = y().f9134b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        Lf.x.a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // Lf.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r4, java.lang.Throwable r5, Zd.i r6) {
        /*
            r3 = this;
            int r5 = If.f.f9140b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.A(r4)
        Le:
            java.lang.Object r1 = r3.B(r4)
            boolean r2 = r1 instanceof Gf.h1
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof If.x
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            Lf.E r2 = If.f.j()
            if (r1 == r2) goto L62
            Lf.E r2 = If.f.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            Lf.E r2 = If.f.p()
            if (r1 == r2) goto Le
            Lf.E r2 = If.f.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            Lf.E r4 = If.f.f()
            if (r1 == r4) goto L99
            Lf.E r4 = If.f.f9142d
            if (r1 != r4) goto L40
            goto L99
        L40:
            Lf.E r4 = If.f.z()
            if (r1 != r4) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            r3.w(r4)
            if (r0 == 0) goto L99
            If.e r4 = r3.y()
            kotlin.jvm.functions.Function1 r4 = r4.f9134b
            if (r4 == 0) goto L99
            Lf.x.a(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            Lf.E r2 = If.f.j()
            goto L7e
        L7a:
            Lf.E r2 = If.f.i()
        L7e:
            boolean r1 = r3.v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.w(r4)
            r1 = r0 ^ 1
            r3.C(r4, r1)
            if (r0 == 0) goto L99
            If.e r4 = r3.y()
            kotlin.jvm.functions.Function1 r4 = r4.f9134b
            if (r4 == 0) goto L99
            Lf.x.a(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: If.m.s(int, java.lang.Throwable, Zd.i):void");
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return l.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final e y() {
        e eVar = this.f9167e;
        AbstractC5504s.e(eVar);
        return eVar;
    }
}
