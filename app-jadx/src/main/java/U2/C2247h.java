package U2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: U2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2247h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19038a = new LinkedHashMap();

    public void a(C2246g c2246g) {
        long[] jArr = c2246g.f19036e;
        if (jArr.length <= 0 || this.f19038a.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        this.f19038a.put(Long.valueOf(c2246g.f19036e[0]), c2246g);
    }

    public C2246g b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C2246g c2246g : this.f19038a.values()) {
            arrayList.add(c2246g.f19033b);
            arrayList2.add(c2246g.f19034c);
            arrayList3.add(c2246g.f19035d);
            arrayList4.add(c2246g.f19036e);
        }
        return new C2246g(S9.f.f((int[][]) arrayList.toArray(new int[arrayList.size()][])), S9.h.b((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), S9.h.b((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), S9.h.b((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public int c() {
        return this.f19038a.size();
    }
}
