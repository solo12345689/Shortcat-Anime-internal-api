package Vh;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f20477a = new LinkedHashMap();

    public void a(Yh.p pVar) {
        String strB = Xh.c.b(pVar.o());
        if (this.f20477a.containsKey(strB)) {
            return;
        }
        this.f20477a.put(strB, pVar);
    }

    public Yh.p b(String str) {
        return (Yh.p) this.f20477a.get(Xh.c.b(str));
    }
}
