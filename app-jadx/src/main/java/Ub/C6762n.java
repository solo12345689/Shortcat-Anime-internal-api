package ub;

import Gf.AbstractC1615j;
import Gf.AbstractC1617k;
import Gf.C0;
import Gf.C1639v0;
import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ub.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6762n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final If.g f61497a = If.j.b(-2, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f61498b = AbstractC1617k.d(C1639v0.f7613a, null, null, new b(null), 3, null);

    /* JADX INFO: renamed from: ub.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f61499a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5082a f61501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5082a interfaceC5082a, Zd.e eVar) {
            super(2, eVar);
            this.f61501c = interfaceC5082a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C6762n.this.new a(this.f61501c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f61499a;
            if (i10 == 0) {
                v.b(obj);
                If.g gVar = C6762n.this.f61497a;
                InterfaceC5082a interfaceC5082a = this.f61501c;
                this.f61499a = 1;
                if (gVar.e(interfaceC5082a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ub.n$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f61502a;

        b(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C6762n.this.new b(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:12:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r3.f61502a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Td.v.b(r4)
                goto L29
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                Td.v.b(r4)
            L1a:
                ub.n r4 = ub.C6762n.this
                If.g r4 = ub.C6762n.a(r4)
                r3.f61502a = r2
                java.lang.Object r4 = r4.a(r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                ie.a r4 = (ie.InterfaceC5082a) r4
                r4.invoke()
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: ub.C6762n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void b(InterfaceC5082a block) {
        AbstractC5504s.h(block, "block");
        AbstractC1615j.b(null, new a(block, null), 1, null);
    }
}
