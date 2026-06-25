package L;

import E0.C1307q;
import E0.EnumC1308s;
import E0.InterfaceC1292b;
import E0.V;
import E0.X;
import K0.AbstractC1800m;
import K0.v0;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import q0.InterfaceC6058d;
import q0.n;
import z.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbstractC1800m implements v0, InterfaceC6058d {

    /* JADX INFO: renamed from: c */
    private InterfaceC5082a f11171c;

    /* JADX INFO: renamed from: d */
    private boolean f11172d;

    /* JADX INFO: renamed from: e */
    private final X f11173e = (X) E1(V.a(new C0176a(null)));

    /* JADX INFO: renamed from: L.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0176a extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f11174a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f11175b;

        /* JADX INFO: renamed from: L.a$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0177a extends k implements Function2 {

            /* JADX INFO: renamed from: a */
            Object f11177a;

            /* JADX INFO: renamed from: b */
            Object f11178b;

            /* JADX INFO: renamed from: c */
            int f11179c;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ Object f11180d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ a f11181e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0177a(a aVar, e eVar) {
                super(2, eVar);
                this.f11181e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0177a c0177a = new C0177a(this.f11181e, eVar);
                c0177a.f11180d = obj;
                return c0177a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC1292b interfaceC1292b, e eVar) {
                return ((C0177a) create(interfaceC1292b, eVar)).invokeSuspend(L.f17438a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:111:0x0059, code lost:
            
                if (r8 == r1) goto L166;
             */
            /* JADX WARN: Code restructure failed: missing block: B:138:0x00e8, code lost:
            
                if (r9 != r1) goto L140;
             */
            /* JADX WARN: Code restructure failed: missing block: B:165:0x0180, code lost:
            
                if (r5 != r1) goto L167;
             */
            /* JADX WARN: Code restructure failed: missing block: B:166:0x0182, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x00e8 -> B:140:0x00ec). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x0180 -> B:167:0x0183). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 455
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: L.a.C0176a.C0177a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        C0176a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            C0176a c0176a = a.this.new C0176a(eVar);
            c0176a.f11175b = obj;
            return c0176a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E0.L l10, e eVar) {
            return ((C0176a) create(l10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f11174a;
            if (i10 == 0) {
                v.b(obj);
                E0.L l10 = (E0.L) this.f11175b;
                C0177a c0177a = new C0177a(a.this, null);
                this.f11174a = 1;
                if (o.c(l10, c0177a, this) == objF) {
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

    public a(InterfaceC5082a interfaceC5082a) {
        this.f11171c = interfaceC5082a;
    }

    public final InterfaceC5082a L1() {
        return this.f11171c;
    }

    public final void M1(InterfaceC5082a interfaceC5082a) {
        this.f11171c = interfaceC5082a;
    }

    @Override // K0.v0
    public void S(C1307q c1307q, EnumC1308s enumC1308s, long j10) {
        this.f11173e.S(c1307q, enumC1308s, j10);
    }

    @Override // q0.InterfaceC6058d
    public void W0(n nVar) {
        this.f11172d = nVar.a();
    }

    @Override // K0.v0
    public void a1() {
        this.f11173e.a1();
    }
}
