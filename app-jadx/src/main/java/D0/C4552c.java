package d0;

import java.util.Map;
import je.InterfaceC5375e;

/* JADX INFO: renamed from: d0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C4552c extends C4551b implements Map.Entry, InterfaceC5375e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f44899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f44900d;

    public C4552c(i iVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f44899c = iVar;
        this.f44900d = obj2;
    }

    public void a(Object obj) {
        this.f44900d = obj;
    }

    @Override // d0.C4551b, java.util.Map.Entry
    public Object getValue() {
        return this.f44900d;
    }

    @Override // d0.C4551b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        a(obj);
        this.f44899c.d(getKey(), obj);
        return value;
    }
}
