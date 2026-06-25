package c0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC3056a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f33415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33416e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public m(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f33414c = i12;
        Object[] objArr2 = new Object[i12];
        this.f33415d = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f33416e = r52;
        objArr2[0] = objArr;
        k(i10 - r52, 1);
    }

    private final Object j() {
        int iE = e() & 31;
        Object obj = this.f33415d[this.f33414c - 1];
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[iE];
    }

    private final void k(int i10, int i11) {
        int i12 = (this.f33414c - i11) * 5;
        while (i11 < this.f33414c) {
            Object[] objArr = this.f33415d;
            Object obj = objArr[i11 - 1];
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[n.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    private final void l(int i10) {
        int i11 = 0;
        while (n.a(e(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            k(e(), ((this.f33414c - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void m(Object[] objArr, int i10, int i11, int i12) {
        g(i10);
        i(i11);
        this.f33414c = i12;
        if (this.f33415d.length < i12) {
            this.f33415d = new Object[i12];
        }
        this.f33415d[0] = objArr;
        ?? r02 = i10 == i11 ? 1 : 0;
        this.f33416e = r02;
        k(i10 - r02, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objJ = j();
        g(e() + 1);
        if (e() == f()) {
            this.f33416e = true;
            return objJ;
        }
        l(0);
        return objJ;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        g(e() - 1);
        if (this.f33416e) {
            this.f33416e = false;
            return j();
        }
        l(31);
        return j();
    }
}
