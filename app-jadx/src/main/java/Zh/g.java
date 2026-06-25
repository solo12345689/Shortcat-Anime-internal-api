package Zh;

import Yh.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23489a = new ArrayList();

    public static g b() {
        return new g();
    }

    public static g g(f fVar) {
        g gVar = new g();
        gVar.a(fVar);
        return gVar;
    }

    public static g h(List list) {
        g gVar = new g();
        gVar.f23489a.addAll(list);
        return gVar;
    }

    public void a(f fVar) {
        this.f23489a.add(fVar);
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f23489a.size(); i10++) {
            if (i10 != 0) {
                sb2.append('\n');
            }
            sb2.append(((f) this.f23489a.get(i10)).a());
        }
        return sb2.toString();
    }

    public List d() {
        return this.f23489a;
    }

    public List e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f23489a.iterator();
        while (it.hasNext()) {
            x xVarB = ((f) it.next()).b();
            if (xVarB != null) {
                arrayList.add(xVarB);
            }
        }
        return arrayList;
    }

    public boolean f() {
        return this.f23489a.isEmpty();
    }
}
