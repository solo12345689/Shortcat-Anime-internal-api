package t;

import java.util.Map;
import je.InterfaceC5371a;

/* JADX INFO: renamed from: t.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C6535A implements Map.Entry, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f59956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f59957b;

    public C6535A(Object obj, Object obj2) {
        this.f59956a = obj;
        this.f59957b = obj2;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f59956a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f59957b;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
