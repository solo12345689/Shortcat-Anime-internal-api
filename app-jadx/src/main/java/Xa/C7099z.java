package xa;

import java.util.Map;
import xa.C7096w;

/* JADX INFO: renamed from: xa.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C7099z implements InterfaceC7098y {
    C7099z() {
    }

    private static C7097x h(Object obj, Object obj2) {
        C7097x c7097xP = (C7097x) obj;
        C7097x c7097x = (C7097x) obj2;
        if (!c7097x.isEmpty()) {
            if (!c7097xP.j()) {
                c7097xP = c7097xP.p();
            }
            c7097xP.m(c7097x);
        }
        return c7097xP;
    }

    @Override // xa.InterfaceC7098y
    public Object a(Object obj, Object obj2) {
        return h(obj, obj2);
    }

    @Override // xa.InterfaceC7098y
    public C7096w.a b(Object obj) {
        return ((C7096w) obj).a();
    }

    @Override // xa.InterfaceC7098y
    public Map c(Object obj) {
        return (C7097x) obj;
    }

    @Override // xa.InterfaceC7098y
    public Object d(Object obj) {
        return C7097x.f().p();
    }

    @Override // xa.InterfaceC7098y
    public Map e(Object obj) {
        return (C7097x) obj;
    }

    @Override // xa.InterfaceC7098y
    public Object f(Object obj) {
        ((C7097x) obj).k();
        return obj;
    }

    @Override // xa.InterfaceC7098y
    public boolean g(Object obj) {
        return !((C7097x) obj).j();
    }
}
