package expo.modules.kotlin.types;

import cc.s;
import expo.modules.kotlin.types.b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements b {
    @Override // expo.modules.kotlin.types.b
    public Object a(Object obj, Ub.d dVar, boolean z10) throws s {
        if (obj != null) {
            return d(obj, dVar, z10);
        }
        throw new s();
    }

    @Override // expo.modules.kotlin.types.b
    public boolean b() {
        return b.a.b(this);
    }

    public abstract Object d(Object obj, Ub.d dVar, boolean z10);
}
