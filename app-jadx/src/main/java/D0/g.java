package d0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class g extends AbstractC4554e implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: d */
    private final f f44915d;

    /* JADX INFO: renamed from: e */
    private Object f44916e;

    /* JADX INFO: renamed from: f */
    private boolean f44917f;

    /* JADX INFO: renamed from: g */
    private int f44918g;

    public g(f fVar, u[] uVarArr) {
        super(fVar.i(), uVarArr);
        this.f44915d = fVar;
        this.f44918g = fVar.g();
    }

    private final void j() {
        if (this.f44915d.g() != this.f44918g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (!this.f44917f) {
            throw new IllegalStateException();
        }
    }

    private final void l(int i10, t tVar, Object obj, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            f()[i11].m(tVar.p(), tVar.p().length, 0);
            while (!AbstractC5504s.c(f()[i11].b(), obj)) {
                f()[i11].j();
            }
            i(i11);
            return;
        }
        int iF = 1 << x.f(i10, i12);
        if (tVar.q(iF)) {
            f()[i11].m(tVar.p(), tVar.m() * 2, tVar.n(iF));
            i(i11);
        } else {
            int iO = tVar.O(iF);
            t tVarN = tVar.N(iO);
            f()[i11].m(tVar.p(), tVar.m() * 2, iO);
            l(i10, tVarN, obj, i11 + 1);
        }
    }

    public final void m(Object obj, Object obj2) {
        if (this.f44915d.containsKey(obj)) {
            if (hasNext()) {
                Object objD = d();
                this.f44915d.put(obj, obj2);
                l(objD != null ? objD.hashCode() : 0, this.f44915d.i(), objD, 0);
            } else {
                this.f44915d.put(obj, obj2);
            }
            this.f44918g = this.f44915d.g();
        }
    }

    @Override // d0.AbstractC4554e, java.util.Iterator
    public Object next() {
        j();
        this.f44916e = d();
        this.f44917f = true;
        return super.next();
    }

    @Override // d0.AbstractC4554e, java.util.Iterator
    public void remove() {
        k();
        if (hasNext()) {
            Object objD = d();
            V.c(this.f44915d).remove(this.f44916e);
            l(objD != null ? objD.hashCode() : 0, this.f44915d.i(), objD, 0);
        } else {
            V.c(this.f44915d).remove(this.f44916e);
        }
        this.f44916e = null;
        this.f44917f = false;
        this.f44918g = this.f44915d.g();
    }
}
