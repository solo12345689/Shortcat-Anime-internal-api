package s0;

import i1.EnumC5027t;
import i1.InterfaceC5011d;
import r0.AbstractC6231m;
import s0.AbstractC6362i1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E1 f59001a = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements E1 {
        a() {
        }

        @Override // s0.E1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC6362i1.b mo6createOutlinePq9zytI(long j10, EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d) {
            return new AbstractC6362i1.b(AbstractC6231m.c(j10));
        }

        public String toString() {
            return "RectangleShape";
        }
    }

    public static final E1 a() {
        return f59001a;
    }
}
