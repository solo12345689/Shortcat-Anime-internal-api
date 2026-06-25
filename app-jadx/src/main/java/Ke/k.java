package Ke;

import He.E;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import ye.H;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a */
    private final d f11066a;

    /* JADX INFO: renamed from: b */
    private final p f11067b;

    /* JADX INFO: renamed from: c */
    private final Lazy f11068c;

    /* JADX INFO: renamed from: d */
    private final Me.e f11069d;

    public k(d components, p typeParameterResolver, Lazy delegateForDefaultTypeQualifiers) {
        AbstractC5504s.h(components, "components");
        AbstractC5504s.h(typeParameterResolver, "typeParameterResolver");
        AbstractC5504s.h(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f11066a = components;
        this.f11067b = typeParameterResolver;
        this.f11068c = delegateForDefaultTypeQualifiers;
        this.f11069d = new Me.e(this, typeParameterResolver);
    }

    public final d a() {
        return this.f11066a;
    }

    public final E b() {
        return (E) this.f11068c.getValue();
    }

    public final Lazy c() {
        return this.f11068c;
    }

    public final H d() {
        return this.f11066a.m();
    }

    public final pf.n e() {
        return this.f11066a.u();
    }

    public final p f() {
        return this.f11067b;
    }

    public final Me.e g() {
        return this.f11069d;
    }
}
