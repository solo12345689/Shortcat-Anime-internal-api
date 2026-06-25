package io.sentry.android.core;

import io.sentry.C5322z3;
import io.sentry.M;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class Q implements io.sentry.transport.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f49577a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49578a;

        static {
            int[] iArr = new int[M.a.values().length];
            f49578a = iArr;
            try {
                iArr[M.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49578a[M.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49578a[M.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    Q(C5322z3 c5322z3) {
        this.f49577a = c5322z3;
    }

    @Override // io.sentry.transport.q
    public boolean A() {
        return a(this.f49577a.getConnectionStatusProvider().x0());
    }

    boolean a(M.a aVar) {
        int i10 = a.f49578a[aVar.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }
}
