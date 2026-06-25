package i0;

import Td.C2160k;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import je.InterfaceC5371a;

/* JADX INFO: renamed from: i0.N */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4970N implements ListIterator, InterfaceC5371a {

    /* JADX INFO: renamed from: a */
    private final C4961E f48434a;

    /* JADX INFO: renamed from: b */
    private int f48435b;

    /* JADX INFO: renamed from: c */
    private int f48436c = -1;

    /* JADX INFO: renamed from: d */
    private int f48437d;

    public C4970N(C4961E c4961e, int i10) {
        this.f48434a = c4961e;
        this.f48435b = i10 - 1;
        this.f48437d = AbstractC4962F.h(c4961e);
    }

    private final void b() {
        if (AbstractC4962F.h(this.f48434a) != this.f48437d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        b();
        this.f48434a.add(this.f48435b + 1, obj);
        this.f48436c = -1;
        this.f48435b++;
        this.f48437d = AbstractC4962F.h(this.f48434a);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f48435b < this.f48434a.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f48435b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        b();
        int i10 = this.f48435b + 1;
        this.f48436c = i10;
        AbstractC4962F.m(i10, this.f48434a.size());
        Object obj = this.f48434a.get(i10);
        this.f48435b = i10;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f48435b + 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        b();
        AbstractC4962F.m(this.f48435b, this.f48434a.size());
        int i10 = this.f48435b;
        this.f48436c = i10;
        this.f48435b--;
        return this.f48434a.get(i10);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f48435b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        b();
        this.f48434a.remove(this.f48436c);
        this.f48435b--;
        this.f48436c = -1;
        this.f48437d = AbstractC4962F.h(this.f48434a);
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        b();
        int i10 = this.f48436c;
        if (i10 < 0) {
            AbstractC4962F.i();
            throw new C2160k();
        }
        this.f48434a.set(i10, obj);
        this.f48437d = AbstractC4962F.h(this.f48434a);
    }
}
