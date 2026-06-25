package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o4 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3540o4 {

    /* JADX INFO: renamed from: g */
    private static final Object f39905g = new Object();

    /* JADX INFO: renamed from: h */
    private static volatile AbstractC3495j4 f39906h;

    /* JADX INFO: renamed from: i */
    private static final AtomicInteger f39907i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f39908j = 0;

    /* JADX INFO: renamed from: a */
    final C3486i4 f39909a;

    /* JADX INFO: renamed from: b */
    final String f39910b;

    /* JADX INFO: renamed from: c */
    private Object f39911c;

    /* JADX INFO: renamed from: d */
    private volatile int f39912d = -1;

    /* JADX INFO: renamed from: e */
    private volatile Object f39913e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f39914f;

    static {
        new AtomicReference();
        O9.n.k(C3522m4.f39853a, "BuildInfo must be non-null");
        f39907i = new AtomicInteger();
    }

    /* synthetic */ AbstractC3540o4(C3486i4 c3486i4, String str, Object obj, boolean z10, byte[] bArr) {
        if (c3486i4.f39789a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f39909a = c3486i4;
        this.f39910b = str;
        this.f39911c = obj;
        this.f39914f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.j4 r0 = com.google.android.gms.internal.measurement.AbstractC3540o4.f39906h
            if (r0 != 0) goto L4d
            if (r3 != 0) goto L7
            goto L4d
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.AbstractC3540o4.f39905g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.j4 r1 = com.google.android.gms.internal.measurement.AbstractC3540o4.f39906h     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.j4 r1 = com.google.android.gms.internal.measurement.AbstractC3540o4.f39906h     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L43
            goto L23
        L21:
            r3 = move-exception
            goto L45
        L23:
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.T3.f()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.C3558q4.d()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.Z3.e()     // Catch: java.lang.Throwable -> L21
        L2e:
            com.google.android.gms.internal.measurement.n4 r1 = new com.google.android.gms.internal.measurement.n4     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            O9.t r1 = O9.u.a(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.P3 r2 = new com.google.android.gms.internal.measurement.P3     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.AbstractC3540o4.f39906h = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.AbstractC3540o4.f39907i     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L49
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC3540o4.b(android.content.Context):void");
    }

    public static void c() {
        f39907i.incrementAndGet();
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:100:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004a A[PHI: r2
  0x004a: PHI (r2v1 O9.k) = (r2v0 O9.k), (r2v0 O9.k), (r2v7 O9.k) binds: [B:64:0x0016, B:66:0x001c, B:68:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:61:0x000b, B:63:0x000f, B:65:0x0018, B:67:0x001e, B:69:0x0034, B:76:0x0050, B:78:0x005b, B:80:0x0065, B:84:0x0088, B:86:0x0090, B:98:0x00b7, B:101:0x00bf, B:102:0x00c2, B:103:0x00c6, B:90:0x0099, B:92:0x009d, B:94:0x00ad, B:96:0x00b3, B:82:0x0076, B:104:0x00ca), top: B:110:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0076 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:61:0x000b, B:63:0x000f, B:65:0x0018, B:67:0x001e, B:69:0x0034, B:76:0x0050, B:78:0x005b, B:80:0x0065, B:84:0x0088, B:86:0x0090, B:98:0x00b7, B:101:0x00bf, B:102:0x00c2, B:103:0x00c6, B:90:0x0099, B:92:0x009d, B:94:0x00ad, B:96:0x00b3, B:82:0x0076, B:104:0x00ca), top: B:110:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0099 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:61:0x000b, B:63:0x000f, B:65:0x0018, B:67:0x001e, B:69:0x0034, B:76:0x0050, B:78:0x005b, B:80:0x0065, B:84:0x0088, B:86:0x0090, B:98:0x00b7, B:101:0x00bf, B:102:0x00c2, B:103:0x00c6, B:90:0x0099, B:92:0x009d, B:94:0x00ad, B:96:0x00b3, B:82:0x0076, B:104:0x00ca), top: B:110:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d() {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC3540o4.d():java.lang.Object");
    }
}
