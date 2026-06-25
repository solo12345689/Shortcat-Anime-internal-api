package h0;

import Df.AbstractC1268a;
import Y.AbstractC2394b1;
import Y.H;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import t.C6550P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a */
    private static final AbstractC2394b1 f47580a = H.j(new InterfaceC5082a() { // from class: h0.r
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return s.b();
        }
    });

    public static final p b() {
        return null;
    }

    public static final p c(Map map, Function1 function1) {
        return new q(map, function1);
    }

    public static final boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!AbstractC1268a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final AbstractC2394b1 g() {
        return f47580a;
    }

    public static final C6550P h(Map map) {
        C6550P c6550p = new C6550P(map.size());
        c6550p.s(map);
        return c6550p;
    }
}
