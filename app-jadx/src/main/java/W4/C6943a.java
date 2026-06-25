package w4;

import H4.i;
import I0.A;
import I0.C;
import I0.v;
import Jf.AbstractC1744g;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Jf.K;
import Jf.u;
import Td.L;
import Zd.e;
import ae.AbstractC2605b;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import coil.compose.c;
import i1.C5009b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: w4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6943a implements i, v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f62907b = K.a(C5009b.a(c.c()));

    /* JADX INFO: renamed from: w4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0943a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f62908a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0943a(s sVar) {
            super(1);
            this.f62908a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.N(aVar, this.f62908a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: renamed from: w4.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC1742e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1742e f62909a;

        /* JADX INFO: renamed from: w4.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0944a implements InterfaceC1743f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC1743f f62910a;

            /* JADX INFO: renamed from: w4.a$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class C0945a extends d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f62911a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f62912b;

                public C0945a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f62911a = obj;
                    this.f62912b |= Integer.MIN_VALUE;
                    return C0944a.this.emit(null, this);
                }
            }

            public C0944a(InterfaceC1743f interfaceC1743f) {
                this.f62910a = interfaceC1743f;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Jf.InterfaceC1743f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, Zd.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof w4.C6943a.b.C0944a.C0945a
                    if (r0 == 0) goto L13
                    r0 = r8
                    w4.a$b$a$a r0 = (w4.C6943a.b.C0944a.C0945a) r0
                    int r1 = r0.f62912b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f62912b = r1
                    goto L18
                L13:
                    w4.a$b$a$a r0 = new w4.a$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f62911a
                    java.lang.Object r1 = ae.AbstractC2605b.f()
                    int r2 = r0.f62912b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Td.v.b(r8)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    Td.v.b(r8)
                    Jf.f r8 = r6.f62910a
                    i1.b r7 = (i1.C5009b) r7
                    long r4 = r7.r()
                    H4.h r7 = coil.compose.a.d(r4)
                    if (r7 == 0) goto L4b
                    r0.f62912b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L4b
                    return r1
                L4b:
                    Td.L r7 = Td.L.f17438a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: w4.C6943a.b.C0944a.emit(java.lang.Object, Zd.e):java.lang.Object");
            }
        }

        public b(InterfaceC1742e interfaceC1742e) {
            this.f62909a = interfaceC1742e;
        }

        @Override // Jf.InterfaceC1742e
        public Object collect(InterfaceC1743f interfaceC1743f, e eVar) {
            Object objCollect = this.f62909a.collect(new C0944a(interfaceC1743f), eVar);
            return objCollect == AbstractC2605b.f() ? objCollect : L.f17438a;
        }
    }

    @Override // H4.i
    public Object c(e eVar) {
        return AbstractC1744g.n(new b(this.f62907b), eVar);
    }

    @Override // I0.v
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo2measure3p2s80s(l lVar, A a10, long j10) {
        this.f62907b.setValue(C5009b.a(j10));
        s sVarV0 = a10.v0(j10);
        return l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new C0943a(sVarV0), 4, null);
    }
}
