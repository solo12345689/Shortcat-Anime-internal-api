package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3674h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final C3674h0 f40464b = new C3674h0(new a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C3674h0 f40465c = new C3674h0(new b("Failure.exception is unexpectedly null."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Throwable f40466a;

    C3674h0(Throwable th2) {
        th2.getClass();
        this.f40466a = th2;
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends Throwable {
        b(String str) {
            super("Failure.exception is unexpectedly null.");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }
}
