package D2;

import E2.i;
import E2.j;
import java.util.Map;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static o a(j jVar, String str, i iVar, int i10, Map map) {
        return new o.b().i(iVar.b(str)).h(iVar.f4254a).g(iVar.f4255b).f(b(jVar, iVar)).b(i10).e(map).a();
    }

    public static String b(j jVar, i iVar) {
        String strA = jVar.a();
        return strA != null ? strA : iVar.b(((E2.b) jVar.f4260c.get(0)).f4204a).toString();
    }
}
