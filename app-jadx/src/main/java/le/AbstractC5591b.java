package le;

import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6023m;

/* JADX INFO: renamed from: le.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5591b implements InterfaceC5593d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f52756a;

    public AbstractC5591b(Object obj) {
        this.f52756a = obj;
    }

    @Override // le.InterfaceC5593d, le.InterfaceC5592c
    public Object a(Object obj, InterfaceC6023m property) {
        AbstractC5504s.h(property, "property");
        return this.f52756a;
    }

    @Override // le.InterfaceC5593d
    public void b(Object obj, InterfaceC6023m property, Object obj2) {
        AbstractC5504s.h(property, "property");
        Object obj3 = this.f52756a;
        if (d(property, obj3, obj2)) {
            this.f52756a = obj2;
            c(property, obj3, obj2);
        }
    }

    protected void c(InterfaceC6023m property, Object obj, Object obj2) {
        AbstractC5504s.h(property, "property");
    }

    protected boolean d(InterfaceC6023m property, Object obj, Object obj2) {
        AbstractC5504s.h(property, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f52756a + ')';
    }
}
