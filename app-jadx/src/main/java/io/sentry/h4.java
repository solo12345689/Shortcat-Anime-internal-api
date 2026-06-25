package io.sentry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f50729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f50730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Double f50731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f50732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Double f50733e;

    public h4(Boolean bool) {
        this(bool, null);
    }

    public Double a() {
        return this.f50733e;
    }

    public Boolean b() {
        return this.f50732d;
    }

    public Double c() {
        return this.f50731c;
    }

    public Double d() {
        return this.f50730b;
    }

    public Boolean e() {
        return this.f50729a;
    }

    public h4(Boolean bool, Double d10) {
        this(bool, d10, null, Boolean.FALSE, null);
    }

    public h4(Boolean bool, Double d10, Double d11) {
        this(bool, d10, d11, Boolean.FALSE, null);
    }

    public h4(Boolean bool, Double d10, Boolean bool2, Double d11) {
        this(bool, d10, null, bool2, d11);
    }

    public h4(Boolean bool, Double d10, Double d11, Boolean bool2, Double d12) {
        this.f50729a = bool;
        this.f50730b = d10;
        this.f50731c = d11;
        this.f50732d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f50733e = d12;
    }
}
