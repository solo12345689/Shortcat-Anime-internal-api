package g6;

import a6.InterfaceC2583d;
import kotlin.jvm.internal.AbstractC5504s;
import r6.InterfaceC6273a;

/* JADX INFO: renamed from: g6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4856a implements InterfaceC2583d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6273a f47355a;

    public C4856a(InterfaceC6273a animatedDrawableBackend) {
        AbstractC5504s.h(animatedDrawableBackend, "animatedDrawableBackend");
        this.f47355a = animatedDrawableBackend;
    }

    @Override // a6.InterfaceC2583d
    public int a() {
        return this.f47355a.a();
    }

    @Override // a6.InterfaceC2583d
    public int b() {
        return this.f47355a.b();
    }

    @Override // a6.InterfaceC2583d
    public int g() {
        return this.f47355a.getHeight();
    }

    @Override // a6.InterfaceC2583d
    public int j() {
        return this.f47355a.d();
    }

    @Override // a6.InterfaceC2583d
    public int k(int i10) {
        return this.f47355a.g(i10);
    }

    @Override // a6.InterfaceC2583d
    public int m() {
        return this.f47355a.getWidth();
    }
}
