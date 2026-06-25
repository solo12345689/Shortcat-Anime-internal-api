package io.sentry;

import io.sentry.util.C5288a;

/* JADX INFO: renamed from: io.sentry.n2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5239n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C5239n2 f50873d = new C5239n2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f50875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5288a f50876c = new C5288a();

    private C5239n2() {
    }

    public static C5239n2 a() {
        return f50873d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean b(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            io.sentry.util.a r0 = r5.f50876c
            io.sentry.e0 r0 = r0.a()
            boolean r1 = r5.f50874a     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.Boolean r6 = r5.f50875b     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L11
            r0.close()
        L11:
            return r6
        L12:
            r6 = move-exception
            goto L54
        L14:
            if (r6 != 0) goto L1d
            r6 = 0
            if (r0 == 0) goto L1c
            r0.close()
        L1c:
            return r6
        L1d:
            r1 = 1
            r5.f50874a = r1     // Catch: java.lang.Throwable -> L12
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "last_crash"
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L12
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = ".sentry-native/last_crash"
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L12
            r6 = 0
            boolean r4 = r2.exists()     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L39
            r2.delete()     // Catch: java.lang.Throwable -> L46
            goto L46
        L39:
            boolean r2 = r3.exists()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L45
            if (r7 == 0) goto L46
            r3.delete()     // Catch: java.lang.Throwable -> L46
            goto L46
        L45:
            r1 = r6
        L46:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L12
            r5.f50875b = r6     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L51
            r0.close()
        L51:
            java.lang.Boolean r6 = r5.f50875b
            return r6
        L54:
            if (r0 == 0) goto L5e
            r0.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r7 = move-exception
            r6.addSuppressed(r7)
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C5239n2.b(java.lang.String, boolean):java.lang.Boolean");
    }

    public void c() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50876c.a();
        try {
            this.f50874a = false;
            this.f50875b = null;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void d(boolean z10) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50876c.a();
        try {
            if (!this.f50874a) {
                this.f50875b = Boolean.valueOf(z10);
                this.f50874a = true;
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
