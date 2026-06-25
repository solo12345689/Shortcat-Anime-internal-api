package d0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;

/* JADX INFO: renamed from: d0.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4554e implements Iterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a */
    private final u[] f44906a;

    /* JADX INFO: renamed from: b */
    private int f44907b;

    /* JADX INFO: renamed from: c */
    private boolean f44908c = true;

    public AbstractC4554e(t tVar, u[] uVarArr) {
        this.f44906a = uVarArr;
        uVarArr[0].l(tVar.p(), tVar.m() * 2);
        this.f44907b = 0;
        e();
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void e() {
        if (this.f44906a[this.f44907b].g()) {
            return;
        }
        for (int i10 = this.f44907b; -1 < i10; i10--) {
            int iG = g(i10);
            if (iG == -1 && this.f44906a[i10].i()) {
                this.f44906a[i10].k();
                iG = g(i10);
            }
            if (iG != -1) {
                this.f44907b = iG;
                return;
            }
            if (i10 > 0) {
                this.f44906a[i10 - 1].k();
            }
            this.f44906a[i10].l(t.f44926e.a().p(), 0);
        }
        this.f44908c = false;
    }

    private final int g(int i10) {
        if (this.f44906a[i10].g()) {
            return i10;
        }
        if (!this.f44906a[i10].i()) {
            return -1;
        }
        t tVarD = this.f44906a[i10].d();
        if (i10 == 6) {
            this.f44906a[i10 + 1].l(tVarD.p(), tVarD.p().length);
        } else {
            this.f44906a[i10 + 1].l(tVarD.p(), tVarD.m() * 2);
        }
        return g(i10 + 1);
    }

    protected final Object d() {
        b();
        return this.f44906a[this.f44907b].b();
    }

    protected final u[] f() {
        return this.f44906a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f44908c;
    }

    protected final void i(int i10) {
        this.f44907b = i10;
    }

    @Override // java.util.Iterator
    public Object next() {
        b();
        Object next = this.f44906a[this.f44907b].next();
        e();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
