package R0;

import ie.InterfaceC5082a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5082a f14972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5082a f14973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14974c;

    public j(InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, boolean z10) {
        this.f14972a = interfaceC5082a;
        this.f14973b = interfaceC5082a2;
        this.f14974c = z10;
    }

    public final InterfaceC5082a a() {
        return this.f14973b;
    }

    public final boolean b() {
        return this.f14974c;
    }

    public final InterfaceC5082a c() {
        return this.f14972a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f14972a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f14973b.invoke()).floatValue() + ", reverseScrolling=" + this.f14974c + ')';
    }
}
