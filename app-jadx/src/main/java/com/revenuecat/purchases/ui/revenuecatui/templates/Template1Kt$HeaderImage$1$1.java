package com.revenuecat.purchases.ui.revenuecatui.templates;

import I0.InterfaceC1680f;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class Template1Kt$HeaderImage$1$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ boolean $landscapeLayout;
    final /* synthetic */ Uri $uri;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$HeaderImage$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final e invoke(e conditional) {
            AbstractC5504s.h(conditional, "$this$conditional");
            return c.b(conditional, 1.2f, false, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template1Kt$HeaderImage$1$1(Uri uri, boolean z10) {
        super(2);
        this.$uri = uri;
        this.$landscapeLayout = z10;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        if ((i10 & 3) == 2 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1134746342, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage.<anonymous>.<anonymous> (Template1.kt:142)");
        }
        int i11 = ((Configuration) interfaceC2425m.n(AndroidCompositionLocals_androidKt.f())).screenHeightDp;
        String string = this.$uri.toString();
        AbstractC5504s.g(string, "uri.toString()");
        e eVarConditional = ModifierExtensionsKt.conditional(e.f26613a, !this.$landscapeLayout, AnonymousClass1.INSTANCE);
        boolean z10 = this.$landscapeLayout;
        interfaceC2425m.V(-910575415);
        boolean zC = interfaceC2425m.c(i11);
        Object objD = interfaceC2425m.D();
        if (zC || objD == InterfaceC2425m.f22370a.a()) {
            objD = new Template1Kt$HeaderImage$1$1$2$1(i11);
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        RemoteImageKt.RemoteImage(string, ModifierExtensionsKt.conditional(eVarConditional, z10, (Function1) objD), null, InterfaceC1680f.f8703a.a(), null, null, 0.0f, null, interfaceC2425m, 3072, 244);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
