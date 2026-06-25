package K0;

import I0.AbstractC1675a;
import I0.C1685k;
import i1.C5021n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(T t10, AbstractC1675a abstractC1675a) {
        T tJ1 = t10.J1();
        if (!(tJ1 != null)) {
            H0.a.b("Child of " + t10 + " cannot be null when calculating alignment line");
        }
        if (t10.M1().z().containsKey(abstractC1675a)) {
            Integer num = (Integer) t10.M1().z().get(abstractC1675a);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iN = tJ1.N(abstractC1675a);
        if (iN == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        tJ1.b2(true);
        t10.a2(true);
        t10.Y1();
        tJ1.b2(false);
        t10.a2(false);
        return iN + (abstractC1675a instanceof C1685k ? C5021n.l(tJ1.P1()) : C5021n.k(tJ1.P1()));
    }
}
