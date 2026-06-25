package M2;

import android.util.SparseArray;
import t2.AbstractC6614a;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC6627n f11988c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f11987b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11986a = -1;

    public i0(InterfaceC6627n interfaceC6627n) {
        this.f11988c = interfaceC6627n;
    }

    public void a(int i10, Object obj) {
        if (this.f11986a == -1) {
            AbstractC6614a.g(this.f11987b.size() == 0);
            this.f11986a = 0;
        }
        if (this.f11987b.size() > 0) {
            SparseArray sparseArray = this.f11987b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC6614a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                InterfaceC6627n interfaceC6627n = this.f11988c;
                SparseArray sparseArray2 = this.f11987b;
                interfaceC6627n.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f11987b.append(i10, obj);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f11987b.size(); i10++) {
            this.f11988c.accept(this.f11987b.valueAt(i10));
        }
        this.f11986a = -1;
        this.f11987b.clear();
    }

    public void c(int i10) {
        for (int size = this.f11987b.size() - 1; size >= 0 && i10 < this.f11987b.keyAt(size); size--) {
            this.f11988c.accept(this.f11987b.valueAt(size));
            this.f11987b.removeAt(size);
        }
        this.f11986a = this.f11987b.size() > 0 ? Math.min(this.f11986a, this.f11987b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f11987b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f11987b.keyAt(i12)) {
                return;
            }
            this.f11988c.accept(this.f11987b.valueAt(i11));
            this.f11987b.removeAt(i11);
            int i13 = this.f11986a;
            if (i13 > 0) {
                this.f11986a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public Object e(int i10) {
        if (this.f11986a == -1) {
            this.f11986a = 0;
        }
        while (true) {
            int i11 = this.f11986a;
            if (i11 <= 0 || i10 >= this.f11987b.keyAt(i11)) {
                break;
            }
            this.f11986a--;
        }
        while (this.f11986a < this.f11987b.size() - 1 && i10 >= this.f11987b.keyAt(this.f11986a + 1)) {
            this.f11986a++;
        }
        return this.f11987b.valueAt(this.f11986a);
    }

    public Object f() {
        return this.f11987b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f11987b.size() == 0;
    }
}
