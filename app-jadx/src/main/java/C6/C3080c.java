package c6;

import android.graphics.Bitmap;
import b6.InterfaceC3025b;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3080c implements InterfaceC3025b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33524c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33525a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C5.a f33526b;

    /* JADX INFO: renamed from: c6.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final synchronized void a() {
        C5.a.m(this.f33526b);
        this.f33526b = null;
        this.f33525a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    @Override // b6.InterfaceC3025b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean H(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f33525a     // Catch: java.lang.Throwable -> Lf
            if (r2 != r0) goto L11
            C5.a r2 = r1.f33526b     // Catch: java.lang.Throwable -> Lf
            boolean r2 = C5.a.H(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        Lf:
            r2 = move-exception
            goto L14
        L11:
            r2 = 0
        L12:
            monitor-exit(r1)
            return r2
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.C3080c.H(int):boolean");
    }

    @Override // b6.InterfaceC3025b
    public void I(int i10, C5.a bitmapReference, int i11) {
        AbstractC5504s.h(bitmapReference, "bitmapReference");
    }

    @Override // b6.InterfaceC3025b
    public synchronized C5.a J(int i10) {
        return C5.a.j(this.f33526b);
    }

    @Override // b6.InterfaceC3025b
    public synchronized C5.a K(int i10, int i11, int i12) {
        try {
        } finally {
            a();
        }
        return C5.a.j(this.f33526b);
    }

    @Override // b6.InterfaceC3025b
    public synchronized void L(int i10, C5.a bitmapReference, int i11) {
        try {
            AbstractC5504s.h(bitmapReference, "bitmapReference");
            if (this.f33526b != null) {
                Object objC = bitmapReference.C();
                C5.a aVar = this.f33526b;
                if (AbstractC5504s.c(objC, aVar != null ? (Bitmap) aVar.C() : null)) {
                    return;
                }
            }
            C5.a.m(this.f33526b);
            this.f33526b = C5.a.j(bitmapReference);
            this.f33525a = i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // b6.InterfaceC3025b
    public synchronized C5.a M(int i10) {
        return this.f33525a == i10 ? C5.a.j(this.f33526b) : null;
    }

    @Override // b6.InterfaceC3025b
    public synchronized void clear() {
        a();
    }
}
