package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class G implements F {
    G() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        E e10 = (E) obj;
        D d10 = (D) obj2;
        int iA = 0;
        if (e10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : e10.entrySet()) {
            iA += d10.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static E j(Object obj, Object obj2) {
        E eP = (E) obj;
        E e10 = (E) obj2;
        if (!e10.isEmpty()) {
            if (!eP.j()) {
                eP = eP.p();
            }
            eP.m(e10);
        }
        return eP;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public D.a b(Object obj) {
        return ((D) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public Map c(Object obj) {
        return (E) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public Object d(Object obj) {
        return E.f().p();
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public Map e(Object obj) {
        return (E) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public Object f(Object obj) {
        ((E) obj).k();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public boolean g(Object obj) {
        return !((E) obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.F
    public int h(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }
}
