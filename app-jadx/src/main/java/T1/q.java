package T1;

import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends n implements K {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f17005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f17006c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17008e;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17006c = obj;
            this.f17008e |= Integer.MIN_VALUE;
            return q.this.d(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, A serializer) {
        super(file, serializer);
        AbstractC5504s.h(file, "file");
        AbstractC5504s.h(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // T1.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.Object r6, Zd.e r7) throws java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof T1.q.a
            if (r0 == 0) goto L13
            r0 = r7
            T1.q$a r0 = (T1.q.a) r0
            int r1 = r0.f17008e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17008e = r1
            goto L18
        L13:
            T1.q$a r0 = new T1.q$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f17006c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f17008e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f17005b
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            java.lang.Object r0 = r0.f17004a
            java.io.Closeable r0 = (java.io.Closeable) r0
            Td.v.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L62
        L31:
            r6 = move-exception
            goto L74
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            Td.v.b(r7)
            r5.f()
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.g()
            r7.<init>(r2)
            T1.A r2 = r5.h()     // Catch: java.lang.Throwable -> L72
            T1.I r4 = new T1.I     // Catch: java.lang.Throwable -> L72
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L72
            r0.f17004a = r7     // Catch: java.lang.Throwable -> L72
            r0.f17005b = r7     // Catch: java.lang.Throwable -> L72
            r0.f17008e = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r6 = r2.b(r6, r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r7
            r0 = r6
        L62:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L31
            r6.sync()     // Catch: java.lang.Throwable -> L31
            Td.L r6 = Td.L.f17438a     // Catch: java.lang.Throwable -> L31
            r6 = 0
            fe.c.a(r0, r6)
            Td.L r6 = Td.L.f17438a
            return r6
        L72:
            r6 = move-exception
            r0 = r7
        L74:
            throw r6     // Catch: java.lang.Throwable -> L75
        L75:
            r7 = move-exception
            fe.c.a(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.q.d(java.lang.Object, Zd.e):java.lang.Object");
    }
}
