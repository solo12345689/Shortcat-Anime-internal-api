package Y;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class H0 implements InterfaceC2398d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2398d f22127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22129c;

    public H0(InterfaceC2398d interfaceC2398d, int i10) {
        this.f22127a = interfaceC2398d;
        this.f22128b = i10;
    }

    @Override // Y.InterfaceC2398d
    public Object a() {
        return this.f22127a.a();
    }

    @Override // Y.InterfaceC2398d
    public void b(int i10, int i11) {
        this.f22127a.b(i10 + (this.f22129c == 0 ? this.f22128b : 0), i11);
    }

    @Override // Y.InterfaceC2398d
    public void c(int i10, int i11, int i12) {
        int i13 = this.f22129c == 0 ? this.f22128b : 0;
        this.f22127a.c(i10 + i13, i11 + i13, i12);
    }

    @Override // Y.InterfaceC2398d
    public void clear() {
        AbstractC2454w.t("Clear is not valid on OffsetApplier");
    }

    @Override // Y.InterfaceC2398d
    public void d(Function2 function2, Object obj) {
        this.f22127a.d(function2, obj);
    }

    @Override // Y.InterfaceC2398d
    public void e(int i10, Object obj) {
        this.f22127a.e(i10 + (this.f22129c == 0 ? this.f22128b : 0), obj);
    }

    @Override // Y.InterfaceC2398d
    public void g(int i10, Object obj) {
        this.f22127a.g(i10 + (this.f22129c == 0 ? this.f22128b : 0), obj);
    }

    @Override // Y.InterfaceC2398d
    public void h(Object obj) {
        this.f22129c++;
        this.f22127a.h(obj);
    }

    @Override // Y.InterfaceC2398d
    public void i() {
        this.f22127a.i();
    }

    @Override // Y.InterfaceC2398d
    public void k() {
        if (!(this.f22129c > 0)) {
            AbstractC2454w.t("OffsetApplier up called with no corresponding down");
        }
        this.f22129c--;
        this.f22127a.k();
    }
}
