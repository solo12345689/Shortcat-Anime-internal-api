package D0;

import K0.I0;
import K0.InterfaceC1794j;
import K0.J0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ N f3531a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(N n10) {
            super(1);
            this.f3531a = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(I0 i02) {
            boolean z10;
            if (i02.getNode().isAttached()) {
                this.f3531a.f52259a = i02;
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final I0 b(I0 i02) {
        N n10 = new N();
        J0.d(i02, new a(n10));
        return (I0) n10.f52259a;
    }

    public static final InterfaceC1794j c(D0.a aVar, b bVar) {
        return new c(aVar, bVar);
    }
}
