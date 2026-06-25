package Y;

import java.util.Iterator;
import je.InterfaceC5371a;
import k0.InterfaceC5421k;

/* JADX INFO: renamed from: Y.f0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2405f0 implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a */
    private final E1 f22308a;

    /* JADX INFO: renamed from: b */
    private final int f22309b;

    /* JADX INFO: renamed from: c */
    private int f22310c;

    /* JADX INFO: renamed from: d */
    private final int f22311d;

    public C2405f0(E1 e12, int i10, int i11) {
        this.f22308a = e12;
        this.f22309b = i11;
        this.f22310c = i10;
        this.f22311d = e12.z();
        if (e12.A()) {
            G1.u();
        }
    }

    private final void d() {
        if (this.f22308a.z() != this.f22311d) {
            G1.u();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b */
    public InterfaceC5421k next() {
        d();
        int i10 = this.f22310c;
        this.f22310c = G1.o(this.f22308a.t(), i10) + i10;
        return new F1(this.f22308a, i10, this.f22311d);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22310c < this.f22309b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
