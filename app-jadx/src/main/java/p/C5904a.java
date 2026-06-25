package p;

import java.util.HashMap;
import java.util.Map;
import p.C5905b;

/* JADX INFO: renamed from: p.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5904a extends C5905b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f55656e = new HashMap();

    @Override // p.C5905b
    protected C5905b.c c(Object obj) {
        return (C5905b.c) this.f55656e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f55656e.containsKey(obj);
    }

    @Override // p.C5905b
    public Object i(Object obj, Object obj2) {
        C5905b.c cVarC = c(obj);
        if (cVarC != null) {
            return cVarC.f55662b;
        }
        this.f55656e.put(obj, f(obj, obj2));
        return null;
    }

    @Override // p.C5905b
    public Object l(Object obj) {
        Object objL = super.l(obj);
        this.f55656e.remove(obj);
        return objL;
    }

    public Map.Entry n(Object obj) {
        if (contains(obj)) {
            return ((C5905b.c) this.f55656e.get(obj)).f55664d;
        }
        return null;
    }
}
