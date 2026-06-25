package T1;

/* JADX INFO: renamed from: T1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2142f extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f16797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16798c;

    public C2142f(Object obj, int i10, int i11) {
        super(i11, null);
        this.f16797b = obj;
        this.f16798c = i10;
    }

    public final void b() {
        Object obj = this.f16797b;
        if ((obj != null ? obj.hashCode() : 0) != this.f16798c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f16797b;
    }
}
