package c0;

import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC3056a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f33403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f33404d;

    public i(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        super(i10, i11);
        this.f33403c = objArr2;
        int iD = n.d(i11);
        this.f33404d = new m(objArr, AbstractC5874j.i(i10, iD), iD, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        b();
        if (this.f33404d.hasNext()) {
            g(e() + 1);
            return this.f33404d.next();
        }
        Object[] objArr = this.f33403c;
        int iE = e();
        g(iE + 1);
        return objArr[iE - this.f33404d.f()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        d();
        if (e() <= this.f33404d.f()) {
            g(e() - 1);
            return this.f33404d.previous();
        }
        Object[] objArr = this.f33403c;
        g(e() - 1);
        return objArr[e() - this.f33404d.f()];
    }
}
