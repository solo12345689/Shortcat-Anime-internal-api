package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3781c2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f41119g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N f41121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f41122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f41123d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f41124e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f41125f = null;

    /* synthetic */ C3781c2(String str, Object obj, Object obj2, N n10, byte[] bArr) {
        this.f41120a = str;
        this.f41122c = obj;
        this.f41121b = n10;
    }

    public final String a() {
        return this.f41120a;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f41123d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L7
            return r4
        L7:
            com.google.android.gms.measurement.internal.f r4 = com.google.android.gms.measurement.internal.W1.f41005a
            if (r4 != 0) goto Le
            java.lang.Object r4 = r3.f41122c
            return r4
        Le:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C3781c2.f41119g
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.C3802f.a()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.f41125f     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.Object r0 = r3.f41122c     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            goto L66
        L20:
            java.lang.Object r0 = r3.f41125f     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r0
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = com.google.android.gms.measurement.internal.AbstractC3789d2.b()     // Catch: java.lang.SecurityException -> L5a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L5a
        L2d:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L5a
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L5a
            com.google.android.gms.measurement.internal.c2 r0 = (com.google.android.gms.measurement.internal.C3781c2) r0     // Catch: java.lang.SecurityException -> L5a
            boolean r1 = com.google.android.gms.measurement.internal.C3802f.a()     // Catch: java.lang.SecurityException -> L5a
            if (r1 != 0) goto L52
            r1 = 0
            com.google.android.gms.measurement.internal.N r2 = r0.f41121b     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
            if (r2 == 0) goto L48
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
        L48:
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C3781c2.f41119g     // Catch: java.lang.SecurityException -> L5a
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L5a
            r0.f41125f = r1     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L2d
        L4f:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L5a
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L5a
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L5a:
            com.google.android.gms.measurement.internal.N r4 = r3.f41121b
            if (r4 != 0) goto L61
        L5e:
            java.lang.Object r4 = r3.f41122c
            goto L65
        L61:
            java.lang.Object r4 = r4.zza()     // Catch: java.lang.Throwable -> L5e
        L65:
            return r4
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L68:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3781c2.b(java.lang.Object):java.lang.Object");
    }
}
