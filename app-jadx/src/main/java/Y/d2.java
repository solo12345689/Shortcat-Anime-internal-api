package Y;

import Td.C2160k;
import java.util.ArrayList;
import java.util.Iterator;
import je.InterfaceC5371a;
import k0.InterfaceC5421k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class d2 implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E1 f22283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC2411h0 f22285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e2 f22286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22288f;

    public d2(E1 e12, int i10, AbstractC2411h0 abstractC2411h0, e2 e2Var) {
        this.f22283a = e12;
        this.f22284b = i10;
        this.f22285c = abstractC2411h0;
        this.f22286d = e2Var;
        this.f22287e = e12.z();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC5421k next() {
        Object obj;
        ArrayList arrayListE = this.f22285c.e();
        if (arrayListE != null) {
            int i10 = this.f22288f;
            this.f22288f = i10 + 1;
            obj = arrayListE.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof C2392b) {
            return new F1(this.f22283a, ((C2392b) obj).a(), this.f22287e);
        }
        if (obj instanceof AbstractC2411h0) {
            return new f2(this.f22283a, this.f22284b, (AbstractC2411h0) obj, new C2447t1(this.f22286d, this.f22288f - 1));
        }
        AbstractC2454w.u("Unexpected group information structure");
        throw new C2160k();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList arrayListE = this.f22285c.e();
        return arrayListE != null && this.f22288f < arrayListE.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
