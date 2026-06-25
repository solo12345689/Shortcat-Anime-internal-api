package U4;

import U4.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f19316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K1.d f19317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f19318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19319d;

    public t(Class cls, Class cls2, Class cls3, List list, K1.d dVar) {
        this.f19316a = cls;
        this.f19317b = dVar;
        this.f19318c = (List) o5.k.d(list);
        this.f19319d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, S4.h hVar, int i10, int i11, i.a aVar, List list) throws q {
        int size = this.f19318c.size();
        v vVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVarA = ((i) this.f19318c.get(i12)).a(eVar, i10, i11, hVar, aVar);
            } catch (q e10) {
                list.add(e10);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f19319d, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, S4.h hVar, int i10, int i11, i.a aVar) {
        List list = (List) o5.k.e((List) this.f19317b.b());
        try {
            return b(eVar, hVar, i10, i11, aVar, list);
        } finally {
            this.f19317b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f19318c.toArray()) + '}';
    }
}
