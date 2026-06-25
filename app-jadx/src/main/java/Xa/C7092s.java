package xa;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: xa.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7092s extends AbstractC7077c implements InterfaceC7093t, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C7092s f64267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC7093t f64268d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f64269b;

    static {
        C7092s c7092s = new C7092s(false);
        f64267c = c7092s;
        f64268d = c7092s;
    }

    private C7092s(boolean z10) {
        super(z10);
        this.f64269b = Collections.EMPTY_LIST;
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC7079e ? ((AbstractC7079e) obj).A() : AbstractC7091q.i((byte[]) obj);
    }

    @Override // xa.AbstractC7077c, xa.AbstractC7091q.b
    public /* bridge */ /* synthetic */ boolean C() {
        return super.C();
    }

    @Override // xa.InterfaceC7093t
    public InterfaceC7093t J() {
        return C() ? new b0(this) : this;
    }

    @Override // xa.InterfaceC7093t
    public void S(AbstractC7079e abstractC7079e) {
        b();
        this.f64269b.add(abstractC7079e);
        ((AbstractList) this).modCount++;
    }

    @Override // xa.AbstractC7077c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        b();
        this.f64269b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // xa.AbstractC7077c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f64269b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f64269b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC7079e) {
            AbstractC7079e abstractC7079e = (AbstractC7079e) obj;
            String strA = abstractC7079e.A();
            if (abstractC7079e.s()) {
                this.f64269b.set(i10, strA);
            }
            return strA;
        }
        byte[] bArr = (byte[]) obj;
        String strI = AbstractC7091q.i(bArr);
        if (AbstractC7091q.g(bArr)) {
            this.f64269b.set(i10, strI);
        }
        return strI;
    }

    @Override // xa.AbstractC7077c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // xa.AbstractC7091q.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C7092s E(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f64269b);
        return new C7092s(arrayList);
    }

    @Override // xa.InterfaceC7093t
    public List g() {
        return Collections.unmodifiableList(this.f64269b);
    }

    @Override // xa.AbstractC7077c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // xa.AbstractC7077c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        b();
        Object objRemove = this.f64269b.remove(i10);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        b();
        return d(this.f64269b.set(i10, str));
    }

    @Override // xa.AbstractC7077c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // xa.AbstractC7077c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f64269b.size();
    }

    @Override // xa.AbstractC7077c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // xa.AbstractC7077c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof InterfaceC7093t) {
            collection = ((InterfaceC7093t) collection).g();
        }
        boolean zAddAll = this.f64269b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // xa.AbstractC7077c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C7092s(int i10) {
        this(new ArrayList(i10));
    }

    private C7092s(ArrayList arrayList) {
        this.f64269b = arrayList;
    }
}
