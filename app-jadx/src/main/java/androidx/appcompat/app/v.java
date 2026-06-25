package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class v {
    private static G1.i a(G1.i iVar, G1.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < iVar.g() + iVar2.g()) {
            Locale localeC = i10 < iVar.g() ? iVar.c(i10) : iVar2.c(i10 - iVar.g());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i10++;
        }
        return G1.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static G1.i b(G1.i iVar, G1.i iVar2) {
        return (iVar == null || iVar.f()) ? G1.i.e() : a(iVar, iVar2);
    }
}
