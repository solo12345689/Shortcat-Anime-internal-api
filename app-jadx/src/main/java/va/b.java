package va;

import aa.C2595c;
import aa.InterfaceC2596d;
import aa.g;
import aa.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements i {
    public static /* synthetic */ Object b(String str, C2595c c2595c, InterfaceC2596d interfaceC2596d) {
        try {
            c.b(str);
            return c2595c.h().a(interfaceC2596d);
        } finally {
            c.a();
        }
    }

    @Override // aa.i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C2595c c2595cR : componentRegistrar.getComponents()) {
            final String strI = c2595cR.i();
            if (strI != null) {
                c2595cR = c2595cR.r(new g() { // from class: va.a
                    @Override // aa.g
                    public final Object a(InterfaceC2596d interfaceC2596d) {
                        return b.b(strI, c2595cR, interfaceC2596d);
                    }
                });
            }
            arrayList.add(c2595cR);
        }
        return arrayList;
    }
}
