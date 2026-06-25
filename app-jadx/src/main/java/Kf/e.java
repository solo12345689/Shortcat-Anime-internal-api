package Kf;

import Gf.O;
import Gf.P;
import Gf.Q;
import Gf.T;
import Jf.AbstractC1744g;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e implements m {

    /* JADX INFO: renamed from: a */
    public final Zd.i f11084a;

    /* JADX INFO: renamed from: b */
    public final int f11085b;

    /* JADX INFO: renamed from: c */
    public final If.a f11086c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f11087a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f11088b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC1743f f11089c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ e f11090d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1743f interfaceC1743f, e eVar, Zd.e eVar2) {
            super(2, eVar2);
            this.f11089c = interfaceC1743f;
            this.f11090d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            a aVar = new a(this.f11089c, this.f11090d, eVar);
            aVar.f11088b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f11087a;
            if (i10 == 0) {
                Td.v.b(obj);
                O o10 = (O) this.f11088b;
                InterfaceC1743f interfaceC1743f = this.f11089c;
                If.v vVarM = this.f11090d.m(o10);
                this.f11087a = 1;
                if (AbstractC1744g.k(interfaceC1743f, vVarM, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f11091a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f11092b;

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(If.u uVar, Zd.e eVar) {
            return ((b) create(uVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = e.this.new b(eVar);
            bVar.f11092b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f11091a;
            if (i10 == 0) {
                Td.v.b(obj);
                If.u uVar = (If.u) this.f11092b;
                e eVar = e.this;
                this.f11091a = 1;
                if (eVar.g(uVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    public e(Zd.i iVar, int i10, If.a aVar) {
        this.f11084a = iVar;
        this.f11085b = i10;
        this.f11086c = aVar;
    }

    static /* synthetic */ Object d(e eVar, InterfaceC1743f interfaceC1743f, Zd.e eVar2) {
        Object objE = P.e(new a(interfaceC1743f, eVar, null), eVar2);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    @Override // Kf.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Jf.InterfaceC1742e a(Zd.i r2, int r3, If.a r4) {
        /*
            r1 = this;
            Zd.i r0 = r1.f11084a
            Zd.i r2 = r2.w(r0)
            If.a r0 = If.a.f9114a
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f11085b
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            If.a r4 = r1.f11086c
        L25:
            Zd.i r0 = r1.f11084a
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f11085b
            if (r3 != r0) goto L36
            If.a r0 = r1.f11086c
            if (r4 != r0) goto L36
            return r1
        L36:
            Kf.e r2 = r1.i(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Kf.e.a(Zd.i, int, If.a):Jf.e");
    }

    protected String b() {
        return null;
    }

    @Override // Jf.InterfaceC1742e
    public Object collect(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
        return d(this, interfaceC1743f, eVar);
    }

    protected abstract Object g(If.u uVar, Zd.e eVar);

    protected abstract e i(Zd.i iVar, int i10, If.a aVar);

    public InterfaceC1742e j() {
        return null;
    }

    public final Function2 k() {
        return new b(null);
    }

    public final int l() {
        int i10 = this.f11085b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public If.v m(O o10) {
        return If.s.c(o10, this.f11084a, l(), this.f11086c, Q.f7531c, null, k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        if (this.f11084a != Zd.j.f23275a) {
            arrayList.add("context=" + this.f11084a);
        }
        if (this.f11085b != -3) {
            arrayList.add("capacity=" + this.f11085b);
        }
        if (this.f11086c != If.a.f9114a) {
            arrayList.add("onBufferOverflow=" + this.f11086c);
        }
        return T.a(this) + '[' + AbstractC2279u.w0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
