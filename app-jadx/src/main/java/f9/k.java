package f9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class k extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final i f46978f = new k(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f46979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f46980e;

    k(Object[] objArr, int i10) {
        this.f46979d = objArr;
        this.f46980e = i10;
    }

    @Override // f9.AbstractC4785d
    final Object[] b() {
        return this.f46979d;
    }

    @Override // f9.AbstractC4785d
    final int c() {
        return 0;
    }

    @Override // f9.AbstractC4785d
    final int d() {
        return this.f46980e;
    }

    @Override // f9.i, f9.AbstractC4785d
    final int e(Object[] objArr, int i10) {
        Object[] objArr2 = this.f46979d;
        int i11 = this.f46980e;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z.b(i10, this.f46980e, "index");
        Object obj = this.f46979d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46980e;
    }
}
