package p0;

import i1.AbstractC5013f;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import r0.C6230l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class k implements InterfaceC5909d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f55686a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f55687b = C6230l.f58350b.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final EnumC5027t f55688c = EnumC5027t.f48573a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC5011d f55689d = AbstractC5013f.a(1.0f, 1.0f);

    private k() {
    }

    @Override // p0.InterfaceC5909d
    public long f() {
        return f55687b;
    }

    @Override // p0.InterfaceC5909d
    public InterfaceC5011d getDensity() {
        return f55689d;
    }

    @Override // p0.InterfaceC5909d
    public EnumC5027t getLayoutDirection() {
        return f55688c;
    }
}
