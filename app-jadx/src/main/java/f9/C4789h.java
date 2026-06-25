package f9;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: f9.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C4789h extends i {

    /* JADX INFO: renamed from: d */
    final transient int f46973d;

    /* JADX INFO: renamed from: e */
    final transient int f46974e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ i f46975f;

    C4789h(i iVar, int i10, int i11) {
        Objects.requireNonNull(iVar);
        this.f46975f = iVar;
        this.f46973d = i10;
        this.f46974e = i11;
    }

    @Override // f9.AbstractC4785d
    final Object[] b() {
        return this.f46975f.b();
    }

    @Override // f9.AbstractC4785d
    final int c() {
        return this.f46975f.c() + this.f46973d;
    }

    @Override // f9.AbstractC4785d
    final int d() {
        return this.f46975f.c() + this.f46973d + this.f46974e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z.b(i10, this.f46974e, "index");
        return this.f46975f.get(i10 + this.f46973d);
    }

    @Override // f9.i
    /* JADX INFO: renamed from: i */
    public final i subList(int i10, int i11) {
        z.d(i10, i11, this.f46974e);
        int i12 = this.f46973d;
        return this.f46975f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46974e;
    }

    @Override // f9.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
