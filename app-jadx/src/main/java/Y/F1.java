package Y;

import java.util.Iterator;
import je.InterfaceC5371a;
import k0.InterfaceC5421k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class F1 implements InterfaceC5421k, Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E1 f22119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22121c;

    public F1(E1 e12, int i10, int i11) {
        this.f22119a = e12;
        this.f22120b = i10;
        this.f22121c = i11;
    }

    private final void b() {
        if (this.f22119a.z() != this.f22121c) {
            G1.u();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        b();
        this.f22119a.L(this.f22120b);
        E1 e12 = this.f22119a;
        int i10 = this.f22120b;
        return new C2405f0(e12, i10 + 1, i10 + G1.o(e12.t(), this.f22120b));
    }
}
