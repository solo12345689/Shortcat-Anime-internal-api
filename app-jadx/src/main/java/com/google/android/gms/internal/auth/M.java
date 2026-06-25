package com.google.android.gms.internal.auth;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class M {

    /* JADX INFO: renamed from: g */
    private static volatile K f39090g;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f39094k = 0;

    /* JADX INFO: renamed from: a */
    final I f39095a;

    /* JADX INFO: renamed from: b */
    final String f39096b;

    /* JADX INFO: renamed from: c */
    private final Object f39097c;

    /* JADX INFO: renamed from: d */
    private volatile int f39098d = -1;

    /* JADX INFO: renamed from: e */
    private volatile Object f39099e;

    /* JADX INFO: renamed from: f */
    private static final Object f39089f = new Object();

    /* JADX INFO: renamed from: h */
    private static final AtomicReference f39091h = new AtomicReference();

    /* JADX INFO: renamed from: i */
    private static final O f39092i = new O(D.f39060a);

    /* JADX INFO: renamed from: j */
    private static final AtomicInteger f39093j = new AtomicInteger();

    /* synthetic */ M(I i10, String str, Object obj, boolean z10, L l10) {
        if (i10.f39071a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f39095a = i10;
        this.f39096b = str;
        this.f39097c = obj;
    }

    public static void c() {
        f39093j.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0045, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x004a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.auth.K r0 = com.google.android.gms.internal.auth.M.f39090g
            if (r0 != 0) goto L4b
            if (r3 != 0) goto L7
            goto L4b
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.auth.M.f39089f
            monitor-enter(r0)
            com.google.android.gms.internal.auth.K r1 = com.google.android.gms.internal.auth.M.f39090g     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L47
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.auth.K r1 = com.google.android.gms.internal.auth.M.f39090g     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L21
            if (r1 == r3) goto L41
            goto L23
        L21:
            r3 = move-exception
            goto L43
        L23:
            com.google.android.gms.internal.auth.C3382q.d()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.N.c()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.C3402x.e()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.C r1 = new com.google.android.gms.internal.auth.C     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.U r1 = com.google.android.gms.internal.auth.Z.a(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.n r2 = new com.google.android.gms.internal.auth.n     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.M.f39090g = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.auth.M.f39093j     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L47
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L45
        L45:
            r3 = move-exception
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r3
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.M.d(android.content.Context):void");
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003e A[PHI: r2
  0x003e: PHI (r2v1 com.google.android.gms.internal.auth.S) = (r2v0 com.google.android.gms.internal.auth.S), (r2v5 com.google.android.gms.internal.auth.S) binds: [B:65:0x0016, B:67:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0084 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:62:0x000b, B:64:0x000f, B:66:0x0018, B:68:0x0028, B:74:0x0043, B:76:0x0049, B:78:0x0053, B:82:0x0074, B:84:0x007c, B:87:0x0084, B:89:0x008a, B:93:0x009c, B:95:0x00a2, B:92:0x009a, B:97:0x00a8, B:99:0x00ac, B:102:0x00b4, B:103:0x00b7, B:104:0x00bb, B:80:0x0068, B:105:0x00c0, B:106:0x00c5, B:107:0x00c6), top: B:113:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.M.b():java.lang.Object");
    }
}
