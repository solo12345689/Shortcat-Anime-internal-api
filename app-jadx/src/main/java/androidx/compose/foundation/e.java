package androidx.compose.foundation;

import R0.C2099h;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;
import x.InterfaceC6989I;
import z.AbstractC7254A;
import z.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class e extends androidx.compose.foundation.a {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        int f25851a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f25852b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ long f25853c;

        a(Zd.e eVar) {
            super(3, eVar);
        }

        public final Object a(r rVar, long j10, Zd.e eVar) {
            a aVar = e.this.new a(eVar);
            aVar.f25852b = rVar;
            aVar.f25853c = j10;
            return aVar.invokeSuspend(L.f17438a);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((r) obj, ((C6224f) obj2).u(), (Zd.e) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f25851a;
            if (i10 == 0) {
                v.b(obj);
                r rVar = (r) this.f25852b;
                long j10 = this.f25853c;
                if (e.this.W1()) {
                    e eVar = e.this;
                    this.f25851a = 1;
                    if (eVar.Y1(rVar, j10, this) == objF) {
                        return objF;
                    }
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

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        public final void a(long j10) {
            if (e.this.W1()) {
                e.this.X1().invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6224f) obj).u());
            return L.f17438a;
        }
    }

    public /* synthetic */ e(B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, interfaceC6989I, z10, str, c2099h, interfaceC5082a);
    }

    static /* synthetic */ Object d2(e eVar, E0.L l10, Zd.e eVar2) {
        Object objH = AbstractC7254A.h(l10, eVar.new a(null), eVar.new b(), eVar2);
        return objH == AbstractC2605b.f() ? objH : L.f17438a;
    }

    @Override // androidx.compose.foundation.a
    public Object R1(E0.L l10, Zd.e eVar) {
        return d2(this, l10, eVar);
    }

    public final void e2(B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        c2(mVar, interfaceC6989I, z10, str, c2099h, interfaceC5082a);
    }

    private e(B.m mVar, InterfaceC6989I interfaceC6989I, boolean z10, String str, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        super(mVar, interfaceC6989I, z10, str, c2099h, interfaceC5082a, null);
    }
}
