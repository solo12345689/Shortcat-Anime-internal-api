package com.revenuecat.purchases.ui.revenuecatui.customercenter.composables;

import C.I;
import Td.L;
import U.D;
import U.K;
import U.j0;
import U0.Y0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.amazon.a.a.o.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aA\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u000f\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u000f\u0010\u0019\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0019\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"", b.f34626S, "Lkotlin/Function0;", "LTd/L;", "onClick", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;", "config", "Landroidx/compose/ui/e;", "modifier", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;", "style", "SettingsButton", "(Ljava/lang/String;Lie/a;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;Landroidx/compose/ui/e;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonStyle;LY/m;II)V", "", "loading", "Ls0/r0;", "loadingColor", "ButtonContent-XO-JAsU", "(Ljava/lang/String;ZJLY/m;I)V", "ButtonContent", "SettingsButton_Preview", "(LY/m;I)V", "SettingsButtonOutlined_Preview", "SettingsButtonLoading_Preview", "SettingsButtonOutlinedLoading_Preview", "SettingsButtonDisabled_Preview", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class SettingsButtonKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButton$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ SettingsButtonConfig $config;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, SettingsButtonConfig settingsButtonConfig) {
            super(3);
            this.$title = str;
            this.$config = settingsButtonConfig;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((I) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(I Button, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(Button, "$this$Button");
            if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1433762825, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButton.<anonymous> (SettingsButton.kt:52)");
            }
            SettingsButtonKt.m680ButtonContentXOJAsU(this.$title, this.$config.getLoading(), D.f17597a.a(interfaceC2425m, D.f17598b).s(), interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButton$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ SettingsButtonConfig $config;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, SettingsButtonConfig settingsButtonConfig) {
            super(3);
            this.$title = str;
            this.$config = settingsButtonConfig;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((I) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(I OutlinedButton, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(OutlinedButton, "$this$OutlinedButton");
            if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(397195892, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButton.<anonymous> (SettingsButton.kt:70)");
            }
            SettingsButtonKt.m680ButtonContentXOJAsU(this.$title, this.$config.getLoading(), D.f17597a.a(interfaceC2425m, D.f17598b).C(), interfaceC2425m, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButton$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ SettingsButtonConfig $config;
        final /* synthetic */ e $modifier;
        final /* synthetic */ InterfaceC5082a $onClick;
        final /* synthetic */ SettingsButtonStyle $style;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str, InterfaceC5082a interfaceC5082a, SettingsButtonConfig settingsButtonConfig, e eVar, SettingsButtonStyle settingsButtonStyle, int i10, int i11) {
            super(2);
            this.$title = str;
            this.$onClick = interfaceC5082a;
            this.$config = settingsButtonConfig;
            this.$modifier = eVar;
            this.$style = settingsButtonStyle;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SettingsButtonKt.SettingsButton(this.$title, this.$onClick, this.$config, this.$modifier, this.$style, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButtonDisabled_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43301 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43301 INSTANCE = new C43301();

        C43301() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m682invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m682invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButtonDisabled_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43312 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43312(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SettingsButtonKt.SettingsButtonDisabled_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButtonLoading_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43321 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43321 INSTANCE = new C43321();

        C43321() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m683invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m683invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButtonLoading_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43332 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43332(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SettingsButtonKt.SettingsButtonLoading_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButtonOutlinedLoading_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43341 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43341 INSTANCE = new C43341();

        C43341() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m684invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m684invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButtonOutlinedLoading_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43352 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43352(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SettingsButtonKt.SettingsButtonOutlinedLoading_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButtonOutlined_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43361 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43361 INSTANCE = new C43361();

        C43361() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m685invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m685invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButtonOutlined_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43372 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43372(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SettingsButtonKt.SettingsButtonOutlined_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButton_Preview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43381 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43381 INSTANCE = new C43381();

        C43381() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m686invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m686invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt$SettingsButton_Preview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43392 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43392(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            SettingsButtonKt.SettingsButton_Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingsButtonStyle.values().length];
            try {
                iArr[SettingsButtonStyle.FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingsButtonStyle.OUTLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: ButtonContent-XO-JAsU */
    public static final void m680ButtonContentXOJAsU(String str, boolean z10, long j10, InterfaceC2425m interfaceC2425m, int i10) {
        String str2;
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(483726370);
        if ((i10 & 6) == 0) {
            str2 = str;
            i11 = (interfaceC2425mG.U(str2) ? 4 : 2) | i10;
        } else {
            str2 = str;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.d(j10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(483726370, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.ButtonContent (SettingsButton.kt:85)");
            }
            if (z10) {
                interfaceC2425mG.V(-945467054);
                K.a(s.r(e.f26613a, C5015h.n(20)), j10, C5015h.n(2), 0L, 0, interfaceC2425mG, ((i11 >> 3) & 112) | 390, 24);
                interfaceC2425mG.O();
                interfaceC2425m2 = interfaceC2425mG;
            } else {
                interfaceC2425mG.V(-945298848);
                interfaceC2425m2 = interfaceC2425mG;
                j0.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, Y0.e(D.f17597a.c(interfaceC2425mG, D.f17598b).b(), 0L, 0L, Y0.L.f22613b.f(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), interfaceC2425m2, i11 & 14, 0, 65534);
                interfaceC2425m2.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new SettingsButtonKt$ButtonContent$1(str, z10, j10, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void SettingsButton(java.lang.String r30, ie.InterfaceC5082a r31, com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonConfig r32, androidx.compose.ui.e r33, com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonStyle r34, Y.InterfaceC2425m r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt.SettingsButton(java.lang.String, ie.a, com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonConfig, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonStyle, Y.m, int, int):void");
    }

    public static final void SettingsButtonDisabled_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1257236177);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1257236177, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonDisabled_Preview (SettingsButton.kt:147)");
            }
            SettingsButton("Restore purchases", C43301.INSTANCE, new SettingsButtonConfig(false, false, 2, null), null, null, interfaceC2425mG, 54, 24);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43312(i10));
        }
    }

    public static final void SettingsButtonLoading_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1692829163);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1692829163, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonLoading_Preview (SettingsButton.kt:126)");
            }
            SettingsButton("Restore purchases", C43321.INSTANCE, new SettingsButtonConfig(false, true, 1, null), null, null, interfaceC2425mG, 54, 24);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43332(i10));
        }
    }

    public static final void SettingsButtonOutlinedLoading_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-919118185);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-919118185, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonOutlinedLoading_Preview (SettingsButton.kt:136)");
            }
            SettingsButtonStyle settingsButtonStyle = SettingsButtonStyle.OUTLINED;
            SettingsButton("Restore purchases", C43341.INSTANCE, new SettingsButtonConfig(false, true, 1, null), null, settingsButtonStyle, interfaceC2425mG, 24630, 8);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43352(i10));
        }
    }

    public static final void SettingsButtonOutlined_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1472127241);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1472127241, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonOutlined_Preview (SettingsButton.kt:115)");
            }
            SettingsButtonStyle settingsButtonStyle = SettingsButtonStyle.OUTLINED;
            SettingsButton("Restore purchases", C43361.INSTANCE, new SettingsButtonConfig(false, false, 3, null), null, settingsButtonStyle, interfaceC2425mG, 24630, 8);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43372(i10));
        }
    }

    public static final void SettingsButton_Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-745433269);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-745433269, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButton_Preview (SettingsButton.kt:104)");
            }
            SettingsButtonStyle settingsButtonStyle = SettingsButtonStyle.FILLED;
            SettingsButton("Cancel subscription", C43381.INSTANCE, new SettingsButtonConfig(false, false, 3, null), null, settingsButtonStyle, interfaceC2425mG, 24630, 8);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43392(i10));
        }
    }
}
