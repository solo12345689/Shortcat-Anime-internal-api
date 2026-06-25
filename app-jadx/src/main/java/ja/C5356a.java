package ja;

import aa.AbstractC2590C;

/* JADX INFO: renamed from: ja.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5356a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f51726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f51727b;

    public C5356a(Class cls, Object obj) {
        this.f51726a = (Class) AbstractC2590C.b(cls);
        this.f51727b = AbstractC2590C.b(obj);
    }

    public Object a() {
        return this.f51727b;
    }

    public Class b() {
        return this.f51726a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f51726a, this.f51727b);
    }
}
