package U4;

import android.util.Log;
import g5.InterfaceC4854e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f19220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4854e f19222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K1.d f19223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f19224e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        v a(v vVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, InterfaceC4854e interfaceC4854e, K1.d dVar) {
        this.f19220a = cls;
        this.f19221b = list;
        this.f19222c = interfaceC4854e;
        this.f19223d = dVar;
        this.f19224e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, int i10, int i11, S4.h hVar) {
        List list = (List) o5.k.e((List) this.f19223d.b());
        try {
            return c(eVar, i10, i11, hVar, list);
        } finally {
            this.f19223d.a(list);
        }
    }

    private v c(com.bumptech.glide.load.data.e eVar, int i10, int i11, S4.h hVar, List list) throws q {
        int size = this.f19221b.size();
        v vVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            S4.j jVar = (S4.j) this.f19221b.get(i12);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    vVarA = jVar.a(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f19224e, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, int i10, int i11, S4.h hVar, a aVar) {
        return this.f19222c.a(aVar.a(b(eVar, i10, i11, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f19220a + ", decoders=" + this.f19221b + ", transcoder=" + this.f19222c + '}';
    }
}
