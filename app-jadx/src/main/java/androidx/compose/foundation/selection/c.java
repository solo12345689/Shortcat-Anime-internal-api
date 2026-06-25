package androidx.compose.foundation.selection;

import B.l;
import B.m;
import R0.C2099h;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.foundation.j;
import androidx.compose.ui.e;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import x.InterfaceC6987G;
import x.InterfaceC6989I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6987G f26424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f26425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f26426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2099h f26427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f26428e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6987G interfaceC6987G, boolean z10, boolean z11, C2099h c2099h, Function1 function1) {
            super(3);
            this.f26424a = interfaceC6987G;
            this.f26425b = z10;
            this.f26426c = z11;
            this.f26427d = c2099h;
            this.f26428e = function1;
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
            e eVarThen = j.b(e.f26613a, mVar, this.f26424a).then(new ToggleableElement(this.f26425b, mVar, null, this.f26426c, this.f26427d, this.f26428e, null));
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

    public static final e a(e eVar, boolean z10, m mVar, InterfaceC6987G interfaceC6987G, boolean z11, C2099h c2099h, Function1 function1) {
        return eVar.then(interfaceC6987G instanceof InterfaceC6989I ? new ToggleableElement(z10, mVar, (InterfaceC6989I) interfaceC6987G, z11, c2099h, function1, null) : interfaceC6987G == null ? new ToggleableElement(z10, mVar, null, z11, c2099h, function1, null) : mVar != null ? j.b(e.f26613a, mVar, interfaceC6987G).then(new ToggleableElement(z10, mVar, null, z11, c2099h, function1, null)) : androidx.compose.ui.c.c(e.f26613a, null, new a(interfaceC6987G, z10, z11, c2099h, function1), 1, null));
    }
}
