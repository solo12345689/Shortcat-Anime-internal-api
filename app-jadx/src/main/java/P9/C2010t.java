package P9;

import java.io.Serializable;

/* JADX INFO: renamed from: P9.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C2010t extends AbstractC1996e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f13722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f13723b;

    C2010t(Object obj, Object obj2) {
        this.f13722a = obj;
        this.f13723b = obj2;
    }

    @Override // P9.AbstractC1996e, java.util.Map.Entry
    public final Object getKey() {
        return this.f13722a;
    }

    @Override // P9.AbstractC1996e, java.util.Map.Entry
    public final Object getValue() {
        return this.f13723b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
