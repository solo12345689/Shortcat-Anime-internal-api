package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f50710a;

    public g4(C5322z3 c5322z3) {
        this.f50710a = (C5322z3) io.sentry.util.w.c(c5322z3, "options are required");
    }

    private boolean b(Double d10, Double d11) {
        return d10.doubleValue() >= d11.doubleValue();
    }

    public h4 a(D1 d12) {
        Double dA = d12.a();
        h4 h4VarL = d12.b().l();
        if (h4VarL != null) {
            return io.sentry.util.A.a(h4VarL);
        }
        this.f50710a.getProfilesSampler();
        Double profilesSampleRate = this.f50710a.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && b(profilesSampleRate, dA));
        this.f50710a.getTracesSampler();
        h4 h4VarZ = d12.b().z();
        if (h4VarZ != null) {
            return io.sentry.util.A.a(h4VarZ);
        }
        Double tracesSampleRate = this.f50710a.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.f50710a.getBackpressureMonitor().a()));
        if (dValueOf != null) {
            return new h4(Boolean.valueOf(b(dValueOf, dA)), dValueOf, dA, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new h4(bool, null, dA, bool, null);
    }

    public boolean c(double d10) {
        Double profileSessionSampleRate = this.f50710a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && b(profileSessionSampleRate, Double.valueOf(d10));
    }
}
