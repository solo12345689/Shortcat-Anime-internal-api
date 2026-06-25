package c0;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: c0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3059d extends AbstractC3056a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f33388c;

    public C3059d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f33388c = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f33388c;
        int iE = e();
        g(iE + 1);
        return objArr[iE];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f33388c;
        g(e() - 1);
        return objArr[e()];
    }
}
