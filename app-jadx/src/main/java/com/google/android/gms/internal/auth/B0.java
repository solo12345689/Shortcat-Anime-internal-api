package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B0 extends AbstractC3335a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0 f39057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C0 f39058b;

    protected B0(C0 c02) {
        this.f39057a = c02;
        if (c02.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f39058b = c02.c();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B0 clone() {
        B0 b02 = (B0) this.f39057a.o(5, null, null);
        b02.f39058b = l();
        return b02;
    }

    @Override // com.google.android.gms.internal.auth.Y0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0 l() {
        if (!this.f39058b.n()) {
            return this.f39058b;
        }
        this.f39058b.h();
        return this.f39058b;
    }
}
