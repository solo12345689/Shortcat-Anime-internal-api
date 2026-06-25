package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.K;
import C.U;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import U.AbstractC2174k;
import U.C2171h;
import U.C2172i;
import U.D;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import android.graphics.Bitmap;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u001aw\u0010\u0010\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aF\u0010\u0019\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a6\u0010!\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\r\u001a\u00020\fH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u001a\u0010\"\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006(²\u0006\u0010\u0010&\u001a\u0004\u0018\u00010\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "packages", "selectedPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;", "warning", "Lkotlin/Function1;", "LTd/L;", "onSelectPackage", "Lkotlin/Function0;", "onPurchase", "onRestore", "Landroidx/compose/ui/e;", "modifier", "Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewOverrides;", "previewOverrides", "DefaultPaywallView", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;Lkotlin/jvm/functions/Function1;Lie/a;Lie/a;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewOverrides;LY/m;II)V", "", "purchaseEnabled", "Ls0/r0;", "mainColor", "foregroundOnAccentColor", "DefaultPaywallFooter-ZkgLGzA", "(Lie/a;Lie/a;ZJJLY/m;I)V", "DefaultPaywallFooter", "Landroid/graphics/Bitmap;", "bitmap", "", "appName", "shadowColor", "AppIconSection-cf5BqRc", "(Landroid/graphics/Bitmap;Ljava/lang/String;JLandroidx/compose/ui/e;LY/m;II)V", "AppIconSection", "RevenueCatBrandRed", "J", "getRevenueCatBrandRed$annotations", "()V", "appIconBitmap", "prominentColors", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DefaultPaywallViewKt {
    private static final long RevenueCatBrandRed = AbstractC6387s0.d(4294071387L);

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt$DefaultPaywallView$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ InterfaceC5082a $onPurchase;
        final /* synthetic */ InterfaceC5082a $onRestore;
        final /* synthetic */ Function1 $onSelectPackage;
        final /* synthetic */ List<TemplateConfiguration.PackageInfo> $packages;
        final /* synthetic */ DefaultPaywallPreviewOverrides $previewOverrides;
        final /* synthetic */ TemplateConfiguration.PackageInfo $selectedPackage;
        final /* synthetic */ PaywallWarning $warning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(List<TemplateConfiguration.PackageInfo> list, TemplateConfiguration.PackageInfo packageInfo, PaywallWarning paywallWarning, Function1 function1, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, e eVar, DefaultPaywallPreviewOverrides defaultPaywallPreviewOverrides, int i10, int i11) {
            super(2);
            this.$packages = list;
            this.$selectedPackage = packageInfo;
            this.$warning = paywallWarning;
            this.$onSelectPackage = function1;
            this.$onPurchase = interfaceC5082a;
            this.$onRestore = interfaceC5082a2;
            this.$modifier = eVar;
            this.$previewOverrides = defaultPaywallPreviewOverrides;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            DefaultPaywallViewKt.DefaultPaywallView(this.$packages, this.$selectedPackage, this.$warning, this.$onSelectPackage, this.$onPurchase, this.$onRestore, this.$modifier, this.$previewOverrides, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: AppIconSection-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m799AppIconSectioncf5BqRc(android.graphics.Bitmap r36, java.lang.String r37, long r38, androidx.compose.ui.e r40, Y.InterfaceC2425m r41, int r42, int r43) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.m799AppIconSectioncf5BqRc(android.graphics.Bitmap, java.lang.String, long, androidx.compose.ui.e, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: DefaultPaywallFooter-ZkgLGzA, reason: not valid java name */
    public static final void m800DefaultPaywallFooterZkgLGzA(InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, boolean z10, long j10, long j11, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        boolean z11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1968152504);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(interfaceC5082a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(interfaceC5082a2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            z11 = z10;
            i11 |= interfaceC2425mG.a(z11) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        } else {
            z11 = z10;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.d(j10) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.d(j11) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1968152504, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallFooter (DefaultPaywallView.kt:245)");
            }
            e.a aVar = e.f26613a;
            e eVarH = s.h(aVar, 0.0f, 1, null);
            D d10 = D.f17597a;
            int i12 = D.f17598b;
            e eVarD = b.d(eVarH, C6385r0.q(d10.a(interfaceC2425mG, i12).H(), 0.95f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            e.a aVar2 = l0.e.f52304a;
            B bH = f.h(aVar2.e(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarD);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bH, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            h hVar = h.f26161a;
            androidx.compose.ui.e eVarI = p.i(U.a(s.h(s.x(aVar, 0.0f, ReadableContentWidth.INSTANCE.m808getDpD9Ej5fM(), 1, null), 0.0f, 1, null)), C5015h.n(16));
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), aVar2.g(), interfaceC2425mG, 48);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarI);
            InterfaceC5082a interfaceC5082aA2 = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA2);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB2, bA, aVar3.e());
            m2.e(interfaceC2425mB2, iR2, aVar3.g());
            Function2 function2B2 = aVar3.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
            C1139j c1139j = C1139j.f2142a;
            C2172i c2172i = C2172i.f18372a;
            int i13 = C2172i.f18386o;
            C2171h c2171hB = c2172i.b(j10, j11, 0L, 0L, interfaceC2425mG, ((i11 >> 9) & 126) | (i13 << 12), 12);
            androidx.compose.ui.e eVarI2 = s.i(s.h(s.x(aVar, 0.0f, C5015h.n(480), 1, null), 0.0f, 1, null), C5015h.n(52));
            ComposableSingletons$DefaultPaywallViewKt composableSingletons$DefaultPaywallViewKt = ComposableSingletons$DefaultPaywallViewKt.INSTANCE;
            AbstractC2174k.a(interfaceC5082a, eVarI2, z11, null, c2171hB, null, null, null, null, composableSingletons$DefaultPaywallViewKt.m795getLambda2$revenuecatui_defaultsBc8Release(), interfaceC2425mG, (i11 & 14) | 805306416 | (i11 & 896), 488);
            K.a(s.i(aVar, C5015h.n(8)), interfaceC2425mG, 6);
            interfaceC2425m2 = interfaceC2425mG;
            AbstractC2174k.c(interfaceC5082a2, null, false, null, c2172i.r(0L, d10.a(interfaceC2425mG, i12).w(), 0L, 0L, interfaceC2425mG, i13 << 12, 13), null, null, null, null, composableSingletons$DefaultPaywallViewKt.m796getLambda3$revenuecatui_defaultsBc8Release(), interfaceC2425m2, ((i11 >> 3) & 14) | 805306368, 494);
            interfaceC2425m2.x();
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new DefaultPaywallViewKt$DefaultPaywallFooter$2(interfaceC5082a, interfaceC5082a2, z10, j10, j11, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DefaultPaywallView(java.util.List<com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageInfo> r39, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageInfo r40, com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning r41, kotlin.jvm.functions.Function1 r42, ie.InterfaceC5082a r43, ie.InterfaceC5082a r44, androidx.compose.ui.e r45, com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewOverrides r46, Y.InterfaceC2425m r47, int r48, int r49) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.DefaultPaywallView(java.util.List, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$PackageInfo, com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning, kotlin.jvm.functions.Function1, ie.a, ie.a, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewOverrides, Y.m, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap DefaultPaywallView$lambda$3(C0 c02) {
        return (Bitmap) c02.getValue();
    }

    private static final List<C6385r0> DefaultPaywallView$lambda$6(C0 c02) {
        return (List) c02.getValue();
    }

    private static /* synthetic */ void getRevenueCatBrandRed$annotations() {
    }
}
