package f9;

import java.util.List;

/* JADX INFO: renamed from: f9.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C4788g extends i {

    /* JADX INFO: renamed from: d */
    private final transient i f46972d;

    C4788g(i iVar) {
        this.f46972d = iVar;
    }

    private final int w(int i10) {
        return (this.f46972d.size() - 1) - i10;
    }

    @Override // f9.i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f46972d.contains(obj);
    }

    @Override // f9.i
    public final i f() {
        return this.f46972d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i iVar = this.f46972d;
        z.b(i10, iVar.size(), "index");
        return iVar.get(w(i10));
    }

    @Override // f9.i
    /* JADX INFO: renamed from: i */
    public final i subList(int i10, int i11) {
        i iVar = this.f46972d;
        z.d(i10, i11, iVar.size());
        return iVar.subList(iVar.size() - i11, iVar.size() - i10).f();
    }

    @Override // f9.i, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f46972d.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return w(iLastIndexOf);
        }
        return -1;
    }

    @Override // f9.i, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f46972d.indexOf(obj);
        if (iIndexOf >= 0) {
            return w(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46972d.size();
    }

    @Override // f9.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
