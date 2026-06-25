package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class Y implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f29257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f29259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f29260d;

    Y(K k10, String str, Object[] objArr) {
        this.f29257a = k10;
        this.f29258b = str;
        this.f29259c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f29260d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f29260d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public boolean a() {
        return (this.f29260d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public K b() {
        return this.f29257a;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public V c() {
        int i10 = this.f29260d;
        return (i10 & 1) != 0 ? V.PROTO2 : (i10 & 4) == 4 ? V.EDITIONS : V.PROTO3;
    }

    Object[] d() {
        return this.f29259c;
    }

    String e() {
        return this.f29258b;
    }
}
