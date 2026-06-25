package Ue;

import Se.r;
import Se.u;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a */
    private final List f19582a;

    public h(u typeTable) {
        AbstractC5504s.h(typeTable, "typeTable");
        List listB = typeTable.B();
        if (typeTable.C()) {
            int iY = typeTable.y();
            List listB2 = typeTable.B();
            AbstractC5504s.g(listB2, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listB2, 10));
            int i10 = 0;
            for (Object obj : listB2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2279u.w();
                }
                r rVarBuild = (r) obj;
                if (i10 >= iY) {
                    rVarBuild = rVarBuild.f().K(true).build();
                }
                arrayList.add(rVarBuild);
                i10 = i11;
            }
            listB = arrayList;
        }
        AbstractC5504s.g(listB, "run(...)");
        this.f19582a = listB;
    }

    public final r a(int i10) {
        return (r) this.f19582a.get(i10);
    }
}
