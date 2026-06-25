package T1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class n implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f16969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f16970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f16971c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f16974c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16976e;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16974c = obj;
            this.f16976e |= Integer.MIN_VALUE;
            return n.i(n.this, this);
        }
    }

    public n(File file, A serializer) {
        AbstractC5504s.h(file, "file");
        AbstractC5504s.h(serializer, "serializer");
        this.f16969a = file;
        this.f16970b = serializer;
        this.f16971c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [T1.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [T1.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [T1.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object i(T1.n r7, Zd.e r8) throws java.io.IOException {
        /*
            boolean r0 = r8 instanceof T1.n.a
            if (r0 == 0) goto L13
            r0 = r8
            T1.n$a r0 = (T1.n.a) r0
            int r1 = r0.f16976e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16976e = r1
            goto L18
        L13:
            T1.n$a r0 = new T1.n$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f16974c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f16976e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.f16972a
            java.io.Closeable r7 = (java.io.Closeable) r7
            Td.v.b(r8)     // Catch: java.lang.Throwable -> L32
            goto L9d
        L32:
            r8 = move-exception
            goto La5
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.f16973b
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.f16972a
            T1.n r2 = (T1.n) r2
            Td.v.b(r8)     // Catch: java.lang.Throwable -> L49
            goto L6b
        L49:
            r8 = move-exception
            goto L76
        L4b:
            Td.v.b(r8)
            r7.f()
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7c
            java.io.File r2 = r7.f16969a     // Catch: java.io.FileNotFoundException -> L7c
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7c
            T1.A r2 = r7.f16970b     // Catch: java.lang.Throwable -> L71
            r0.f16972a = r7     // Catch: java.lang.Throwable -> L71
            r0.f16973b = r8     // Catch: java.lang.Throwable -> L71
            r0.f16976e = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.a(r8, r0)     // Catch: java.lang.Throwable -> L71
            if (r2 != r1) goto L67
            goto L99
        L67:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6b:
            fe.c.a(r7, r5)     // Catch: java.io.FileNotFoundException -> L6f
            return r8
        L6f:
            r7 = r2
            goto L7c
        L71:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L76:
            throw r8     // Catch: java.lang.Throwable -> L77
        L77:
            r4 = move-exception
            fe.c.a(r7, r8)     // Catch: java.io.FileNotFoundException -> L6f
            throw r4     // Catch: java.io.FileNotFoundException -> L6f
        L7c:
            java.io.File r8 = r7.f16969a
            boolean r8 = r8.exists()
            if (r8 == 0) goto Lab
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r2 = r7.f16969a
            r8.<init>(r2)
            T1.A r7 = r7.f16970b     // Catch: java.lang.Throwable -> La1
            r0.f16972a = r8     // Catch: java.lang.Throwable -> La1
            r0.f16973b = r5     // Catch: java.lang.Throwable -> La1
            r0.f16976e = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r7 = r7.a(r8, r0)     // Catch: java.lang.Throwable -> La1
            if (r7 != r1) goto L9a
        L99:
            return r1
        L9a:
            r6 = r8
            r8 = r7
            r7 = r6
        L9d:
            fe.c.a(r7, r5)
            return r8
        La1:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La5:
            throw r8     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            fe.c.a(r7, r8)
            throw r0
        Lab:
            T1.A r7 = r7.f16970b
            java.lang.Object r7 = r7.c()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.n.i(T1.n, Zd.e):java.lang.Object");
    }

    @Override // T1.InterfaceC2139c
    public void close() {
        this.f16971c.set(true);
    }

    @Override // T1.y
    public Object e(Zd.e eVar) {
        return i(this, eVar);
    }

    protected final void f() {
        if (this.f16971c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    protected final File g() {
        return this.f16969a;
    }

    protected final A h() {
        return this.f16970b;
    }
}
