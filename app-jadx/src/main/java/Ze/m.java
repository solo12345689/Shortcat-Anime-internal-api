package Ze;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class m extends AbstractList implements RandomAccess, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f23346b = new m().J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23347a;

    public m() {
        this.f23347a = new ArrayList();
    }

    private static d c(Object obj) {
        return obj instanceof d ? (d) obj : obj instanceof String ? d.i((String) obj) : d.e((byte[]) obj);
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).z() : j.b((byte[]) obj);
    }

    @Override // Ze.n
    public d G0(int i10) {
        Object obj = this.f23347a.get(i10);
        d dVarC = c(obj);
        if (dVarC != obj) {
            this.f23347a.set(i10, dVarC);
        }
        return dVarC;
    }

    @Override // Ze.n
    public n J() {
        return new w(this);
    }

    @Override // Ze.n
    public void S1(d dVar) {
        this.f23347a.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f23347a.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f23347a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f23347a.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strZ = dVar.z();
            if (dVar.s()) {
                this.f23347a.set(i10, strZ);
            }
            return strZ;
        }
        byte[] bArr = (byte[]) obj;
        String strB = j.b(bArr);
        if (j.a(bArr)) {
            this.f23347a.set(i10, strB);
        }
        return strB;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f23347a.remove(i10);
        ((AbstractList) this).modCount++;
        return d(objRemove);
    }

    @Override // Ze.n
    public List g() {
        return Collections.unmodifiableList(this.f23347a);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return d(this.f23347a.set(i10, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f23347a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        if (collection instanceof n) {
            collection = ((n) collection).g();
        }
        boolean zAddAll = this.f23347a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public m(n nVar) {
        this.f23347a = new ArrayList(nVar.size());
        addAll(nVar);
    }
}
