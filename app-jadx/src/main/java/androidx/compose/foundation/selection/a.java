package androidx.compose.foundation.selection;

import B.l;
import B.m;
import R0.C2099h;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.foundation.j;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.platform.V0;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import x.InterfaceC6987G;
import x.InterfaceC6989I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.selection.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0458a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f26410a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f26411b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C2099h f26412c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5082a f26413d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0458a(boolean z10, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
            super(3);
            this.f26410a = z10;
            this.f26411b = z11;
            this.f26412c = c2099h;
            this.f26413d = interfaceC5082a;
        }

        public final e a(e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            m mVar;
            interfaceC2425m.V(-2124609672);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-2124609672, i10, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:76)");
            }
            InterfaceC6987G interfaceC6987G = (InterfaceC6987G) interfaceC2425m.n(j.a());
            if (interfaceC6987G instanceof InterfaceC6989I) {
                interfaceC2425m.V(-1412264498);
                interfaceC2425m.O();
                mVar = null;
            } else {
                interfaceC2425m.V(-1412156525);
                Object objD = interfaceC2425m.D();
                if (objD == InterfaceC2425m.f22370a.a()) {
                    objD = l.a();
                    interfaceC2425m.u(objD);
                }
                mVar = (m) objD;
                interfaceC2425m.O();
            }
            e eVarA = a.a(e.f26613a, this.f26410a, mVar, interfaceC6987G, this.f26411b, this.f26412c, this.f26413d);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarA;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6987G f26414a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f26415b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f26416c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C2099h f26417d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC5082a f26418e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6987G interfaceC6987G, boolean z10, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
            super(3);
            this.f26414a = interfaceC6987G;
            this.f26415b = z10;
            this.f26416c = z11;
            this.f26417d = c2099h;
            this.f26418e = interfaceC5082a;
        }

        public final e a(e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(-1525724089);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object objD = interfaceC2425m.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = l.a();
                interfaceC2425m.u(objD);
            }
            m mVar = (m) objD;
            e eVarThen = j.b(e.f26613a, mVar, this.f26414a).then(new SelectableElement(this.f26415b, mVar, null, this.f26416c, this.f26417d, this.f26418e, null));
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarThen;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f26419a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f26420b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C2099h f26421c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5082a f26422d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
            super(1);
            this.f26419a = z10;
            this.f26420b = z11;
            this.f26421c = c2099h;
            this.f26422d = interfaceC5082a;
        }

        public final void a(V0 v02) {
            v02.d("selectable");
            v02.b().c("selected", Boolean.valueOf(this.f26419a));
            v02.b().c("enabled", Boolean.valueOf(this.f26420b));
            v02.b().c("role", this.f26421c);
            v02.b().c("onClick", this.f26422d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return L.f17438a;
        }
    }

    public static final e a(e eVar, boolean z10, m mVar, InterfaceC6987G interfaceC6987G, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        return eVar.then(interfaceC6987G instanceof InterfaceC6989I ? new SelectableElement(z10, mVar, (InterfaceC6989I) interfaceC6987G, z11, c2099h, interfaceC5082a, null) : interfaceC6987G == null ? new SelectableElement(z10, mVar, null, z11, c2099h, interfaceC5082a, null) : mVar != null ? j.b(e.f26613a, mVar, interfaceC6987G).then(new SelectableElement(z10, mVar, null, z11, c2099h, interfaceC5082a, null)) : androidx.compose.ui.c.c(e.f26613a, null, new b(interfaceC6987G, z10, z11, c2099h, interfaceC5082a), 1, null));
    }

    public static final e b(e eVar, boolean z10, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a) {
        return androidx.compose.ui.c.b(eVar, T0.b() ? new c(z10, z11, c2099h, interfaceC5082a) : T0.a(), new C0458a(z10, z11, c2099h, interfaceC5082a));
    }

    public static /* synthetic */ e c(e eVar, boolean z10, boolean z11, C2099h c2099h, InterfaceC5082a interfaceC5082a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            c2099h = null;
        }
        return b(eVar, z10, z11, c2099h, interfaceC5082a);
    }
}
