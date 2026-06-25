package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2816u;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class A implements InterfaceC2821z {
    A() {
    }

    static AbstractC2816u.b d(Object obj, long j10) {
        return (AbstractC2816u.b) k0.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2821z
    public void a(Object obj, long j10) {
        d(obj, j10).q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2821z
    public void b(Object obj, Object obj2, long j10) {
        AbstractC2816u.b bVarD = d(obj, j10);
        AbstractC2816u.b bVarD2 = d(obj2, j10);
        int size = bVarD.size();
        int size2 = bVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!bVarD.C()) {
                bVarD = bVarD.E(size2 + size);
            }
            bVarD.addAll(bVarD2);
        }
        if (size > 0) {
            bVarD2 = bVarD;
        }
        k0.O(obj, j10, bVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2821z
    public List c(Object obj, long j10) {
        AbstractC2816u.b bVarD = d(obj, j10);
        if (bVarD.C()) {
            return bVarD;
        }
        int size = bVarD.size();
        AbstractC2816u.b bVarE = bVarD.E(size == 0 ? 10 : size * 2);
        k0.O(obj, j10, bVarE);
        return bVarE;
    }
}
