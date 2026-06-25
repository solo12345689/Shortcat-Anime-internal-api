package E0;

import E0.AbstractC1310u;
import K0.AbstractC1792i;
import K0.AbstractC1805s;
import K0.F0;
import K0.H0;
import K0.I0;
import K0.InterfaceC1790h;
import K0.J0;
import K0.v0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC2739w0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: E0.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1296f extends e.c implements I0, v0, InterfaceC1790h {

    /* JADX INFO: renamed from: a */
    private InterfaceC1313x f4145a;

    /* JADX INFO: renamed from: b */
    private boolean f4146b;

    /* JADX INFO: renamed from: c */
    private boolean f4147c;

    /* JADX INFO: renamed from: E0.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.N f4148a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.N n10) {
            super(1);
            this.f4148a = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(AbstractC1296f abstractC1296f) {
            if (this.f4148a.f52259a == null && abstractC1296f.f4147c) {
                this.f4148a.f52259a = abstractC1296f;
            } else if (this.f4148a.f52259a != null && abstractC1296f.M1() && abstractC1296f.f4147c) {
                this.f4148a.f52259a = abstractC1296f;
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: E0.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.J f4149a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.J j10) {
            super(1);
            this.f4149a = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final H0 invoke(AbstractC1296f abstractC1296f) {
            if (!abstractC1296f.f4147c) {
                return H0.f10420a;
            }
            this.f4149a.f52255a = false;
            return H0.f10422c;
        }
    }

    /* JADX INFO: renamed from: E0.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.N f4150a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.jvm.internal.N n10) {
            super(1);
            this.f4150a = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final H0 invoke(AbstractC1296f abstractC1296f) {
            H0 h02 = H0.f10420a;
            if (abstractC1296f.f4147c) {
                this.f4150a.f52259a = abstractC1296f;
                if (abstractC1296f.M1()) {
                    return H0.f10421b;
                }
            }
            return h02;
        }
    }

    /* JADX INFO: renamed from: E0.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.N f4151a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.jvm.internal.N n10) {
            super(1);
            this.f4151a = n10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(AbstractC1296f abstractC1296f) {
            if (abstractC1296f.M1() && abstractC1296f.f4147c) {
                this.f4151a.f52259a = abstractC1296f;
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ AbstractC1296f(InterfaceC1313x interfaceC1313x, boolean z10, AbstractC1805s abstractC1805s, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1313x, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : abstractC1805s);
    }

    private final void F1() {
        InterfaceC1313x interfaceC1313x;
        AbstractC1296f abstractC1296fL1 = L1();
        if (abstractC1296fL1 == null || (interfaceC1313x = abstractC1296fL1.f4145a) == null) {
            interfaceC1313x = this.f4145a;
        }
        G1(interfaceC1313x);
    }

    private final void H1() {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        J0.d(this, new a(n10));
        AbstractC1296f abstractC1296f = (AbstractC1296f) n10.f52259a;
        if (abstractC1296f != null) {
            abstractC1296f.F1();
        } else {
            G1(null);
        }
    }

    private final void I1() {
        AbstractC1296f abstractC1296fK1;
        if (this.f4147c) {
            if (this.f4146b || (abstractC1296fK1 = K1()) == null) {
                abstractC1296fK1 = this;
            }
            abstractC1296fK1.F1();
        }
    }

    private final void J1() {
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        j10.f52255a = true;
        if (!this.f4146b) {
            J0.f(this, new b(j10));
        }
        if (j10.f52255a) {
            F1();
        }
    }

    private final AbstractC1296f K1() {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        J0.f(this, new c(n10));
        return (AbstractC1296f) n10.f52259a;
    }

    private final AbstractC1296f L1() {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        J0.d(this, new d(n10));
        return (AbstractC1296f) n10.f52259a;
    }

    private final void P1() {
        this.f4147c = true;
        J1();
    }

    private final void Q1() {
        if (this.f4147c) {
            this.f4147c = false;
            if (isAttached()) {
                H1();
            }
        }
    }

    @Override // K0.v0
    public long G0() {
        return F0.f10418a.b();
    }

    public abstract void G1(InterfaceC1313x interfaceC1313x);

    public final boolean M1() {
        return this.f4146b;
    }

    protected final z N1() {
        return (z) AbstractC1792i.a(this, AbstractC2739w0.l());
    }

    public abstract boolean O1(int i10);

    public final void R1(InterfaceC1313x interfaceC1313x) {
        if (AbstractC5504s.c(this.f4145a, interfaceC1313x)) {
            return;
        }
        this.f4145a = interfaceC1313x;
        if (this.f4147c) {
            J1();
        }
    }

    @Override // K0.v0
    public void S(C1307q c1307q, EnumC1308s enumC1308s, long j10) {
        if (enumC1308s == EnumC1308s.f4179b) {
            List listC = c1307q.c();
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (O1(((C) listC.get(i10)).n())) {
                    int iF = c1307q.f();
                    AbstractC1310u.a aVar = AbstractC1310u.f4183a;
                    if (AbstractC1310u.i(iF, aVar.a())) {
                        P1();
                        return;
                    } else {
                        if (AbstractC1310u.i(c1307q.f(), aVar.b())) {
                            Q1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void S1(boolean z10) {
        if (this.f4146b != z10) {
            this.f4146b = z10;
            if (z10) {
                if (this.f4147c) {
                    F1();
                }
            } else if (this.f4147c) {
                I1();
            }
        }
    }

    @Override // K0.v0
    public void a1() {
        Q1();
    }

    @Override // androidx.compose.ui.e.c
    public void onDetach() {
        Q1();
        super.onDetach();
    }

    public AbstractC1296f(InterfaceC1313x interfaceC1313x, boolean z10, AbstractC1805s abstractC1805s) {
        this.f4145a = interfaceC1313x;
        this.f4146b = z10;
    }
}
