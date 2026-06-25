package c0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC3056a implements ListIterator, InterfaceC5371a {

    /* JADX INFO: renamed from: c */
    private final h f33405c;

    /* JADX INFO: renamed from: d */
    private int f33406d;

    /* JADX INFO: renamed from: e */
    private m f33407e;

    /* JADX INFO: renamed from: f */
    private int f33408f;

    public j(h hVar, int i10) {
        super(i10, hVar.size());
        this.f33405c = hVar;
        this.f33406d = hVar.l();
        this.f33408f = -1;
        m();
    }

    private final void j() {
        if (this.f33406d != this.f33405c.l()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (this.f33408f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void l() {
        i(this.f33405c.size());
        this.f33406d = this.f33405c.l();
        this.f33408f = -1;
        m();
    }

    private final void m() {
        Object[] objArrP = this.f33405c.p();
        if (objArrP == null) {
            this.f33407e = null;
            return;
        }
        int iD = n.d(this.f33405c.size());
        int i10 = AbstractC5874j.i(e(), iD);
        int iT = (this.f33405c.t() / 5) + 1;
        m mVar = this.f33407e;
        if (mVar == null) {
            this.f33407e = new m(objArrP, i10, iD, iT);
        } else {
            AbstractC5504s.e(mVar);
            mVar.m(objArrP, i10, iD, iT);
        }
    }

    @Override // c0.AbstractC3056a, java.util.ListIterator
    public void add(Object obj) {
        j();
        this.f33405c.add(e(), obj);
        g(e() + 1);
        l();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        j();
        b();
        this.f33408f = e();
        m mVar = this.f33407e;
        if (mVar == null) {
            Object[] objArrU = this.f33405c.u();
            int iE = e();
            g(iE + 1);
            return objArrU[iE];
        }
        if (mVar.hasNext()) {
            g(e() + 1);
            return mVar.next();
        }
        Object[] objArrU2 = this.f33405c.u();
        int iE2 = e();
        g(iE2 + 1);
        return objArrU2[iE2 - mVar.f()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        j();
        d();
        this.f33408f = e() - 1;
        m mVar = this.f33407e;
        if (mVar == null) {
            Object[] objArrU = this.f33405c.u();
            g(e() - 1);
            return objArrU[e()];
        }
        if (e() <= mVar.f()) {
            g(e() - 1);
            return mVar.previous();
        }
        Object[] objArrU2 = this.f33405c.u();
        g(e() - 1);
        return objArrU2[e() - mVar.f()];
    }

    @Override // c0.AbstractC3056a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        j();
        k();
        this.f33405c.remove(this.f33408f);
        if (this.f33408f < e()) {
            g(this.f33408f);
        }
        l();
    }

    @Override // c0.AbstractC3056a, java.util.ListIterator
    public void set(Object obj) {
        j();
        k();
        this.f33405c.set(this.f33408f, obj);
        this.f33406d = this.f33405c.l();
        m();
    }
}
