package xa;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class O extends AbstractC7077c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final O f64105d = new O(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f64106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f64107c;

    private O(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f64106b = objArr;
        this.f64107c = i10;
    }

    private static Object[] c(int i10) {
        return new Object[i10];
    }

    public static O d() {
        return f64105d;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f64107c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    private String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f64107c;
    }

    @Override // xa.AbstractC7077c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b();
        int i10 = this.f64107c;
        Object[] objArr = this.f64106b;
        if (i10 == objArr.length) {
            this.f64106b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f64106b;
        int i11 = this.f64107c;
        this.f64107c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        e(i10);
        return this.f64106b[i10];
    }

    @Override // xa.AbstractC7091q.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public O E(int i10) {
        if (i10 >= this.f64107c) {
            return new O(Arrays.copyOf(this.f64106b, i10), this.f64107c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // xa.AbstractC7077c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        b();
        e(i10);
        Object[] objArr = this.f64106b;
        Object obj = objArr[i10];
        if (i10 < this.f64107c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f64107c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        b();
        e(i10);
        Object[] objArr = this.f64106b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f64107c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f64107c)) {
            Object[] objArr = this.f64106b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrC = c(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f64106b, 0, objArrC, 0, i10);
                System.arraycopy(this.f64106b, i10, objArrC, i10 + 1, this.f64107c - i10);
                this.f64106b = objArrC;
            }
            this.f64106b[i10] = obj;
            this.f64107c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i10));
    }
}
