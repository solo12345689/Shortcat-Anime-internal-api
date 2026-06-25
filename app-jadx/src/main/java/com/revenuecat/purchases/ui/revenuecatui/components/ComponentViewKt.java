package com.revenuecat.purchases.ui.revenuecatui.components;

import Td.L;
import Td.r;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent.IconComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.pkg.PackageComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.stickyfooter.StickyFooterComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CountdownComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.PackageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StickyFooterComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlToggleComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlButtonViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlToggleViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabsComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.video.VideoComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "state", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "LZd/e;", "LTd/L;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "ComponentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class ComponentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewKt$ComponentView$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function2 $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComponentStyle componentStyle, PaywallState.Loaded.Components components, Function2 function2, e eVar, int i10, int i11) {
            super(2);
            this.$style = componentStyle;
            this.$state = components;
            this.$onClick = function2;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ComponentViewKt.ComponentView(this.$style, this.$state, this.$onClick, this.$modifier, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final /* synthetic */ void ComponentView(ComponentStyle style, PaywallState.Loaded.Components state, Function2 onClick, e eVar, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        PaywallState.Loaded.Components components;
        Function2 function2;
        e eVar2;
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(onClick, "onClick");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-294729441);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(style) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.U(state) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.F(onClick) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        int i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC2425mG.U(eVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i12 & 1171) == 1170 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            components = state;
            function2 = onClick;
            eVar2 = eVar;
        } else {
            if (i13 != 0) {
                eVar = e.f26613a;
            }
            e eVar3 = eVar;
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-294729441, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.components.ComponentView (ComponentView.kt:49)");
            }
            if (style instanceof StackComponentStyle) {
                interfaceC2425mG.V(754737591);
                components = state;
                function2 = onClick;
                StackComponentViewKt.StackComponentView((StackComponentStyle) style, components, function2, eVar3, 0.0f, interfaceC2425mG, i12 & 8176, 16);
                interfaceC2425mG = interfaceC2425mG;
                interfaceC2425mG.O();
            } else {
                components = state;
                Function2 function22 = onClick;
                if (style instanceof TextComponentStyle) {
                    interfaceC2425mG.V(754742742);
                    TextComponentViewKt.TextComponentView((TextComponentStyle) style, components, eVar3, interfaceC2425mG, (i12 & 112) | ((i12 >> 3) & 896), 0);
                    interfaceC2425mG = interfaceC2425mG;
                    eVar3 = eVar3;
                    interfaceC2425mG.O();
                } else if (style instanceof ImageComponentStyle) {
                    interfaceC2425mG.V(754746872);
                    ImageComponentViewKt.ImageComponentView((ImageComponentStyle) style, components, eVar3, interfaceC2425mG, (i12 & 112) | ((i12 >> 3) & 896), 0);
                    interfaceC2425mG = interfaceC2425mG;
                    eVar3 = eVar3;
                    interfaceC2425mG.O();
                } else if (style instanceof VideoComponentStyle) {
                    interfaceC2425mG.V(1922417707);
                    VideoComponentViewKt.VideoComponentView((VideoComponentStyle) style, components, eVar3, null, interfaceC2425mG, (i12 & 112) | ((i12 >> 3) & 896), 8);
                    eVar3 = eVar3;
                    interfaceC2425mG.O();
                } else if (style instanceof ButtonComponentStyle) {
                    interfaceC2425mG.V(754755340);
                    function2 = function22;
                    ButtonComponentViewKt.ButtonComponentView((ButtonComponentStyle) style, components, function2, eVar3, interfaceC2425mG, i12 & 8176, 0);
                    interfaceC2425mG.O();
                } else {
                    function2 = function22;
                    if (style instanceof StickyFooterComponentStyle) {
                        interfaceC2425mG.V(754759454);
                        StickyFooterComponentViewKt.StickyFooterComponentView((StickyFooterComponentStyle) style, components, function2, eVar3, interfaceC2425mG, i12 & 8176, 0);
                        interfaceC2425mG.O();
                    } else if (style instanceof PackageComponentStyle) {
                        interfaceC2425mG.V(754764953);
                        PackageComponentViewKt.PackageComponentView((PackageComponentStyle) style, components, function2, eVar3, interfaceC2425mG, i12 & 8176, 0);
                        interfaceC2425mG.O();
                    } else {
                        function22 = function2;
                        if (style instanceof IconComponentStyle) {
                            interfaceC2425mG.V(754770135);
                            IconComponentViewKt.IconComponentView((IconComponentStyle) style, components, eVar3, interfaceC2425mG, (i12 & 112) | ((i12 >> 3) & 896), 0);
                            interfaceC2425mG = interfaceC2425mG;
                            eVar3 = eVar3;
                            interfaceC2425mG.O();
                        } else if (style instanceof TimelineComponentStyle) {
                            interfaceC2425mG.V(754773403);
                            TimelineComponentViewKt.TimelineComponentView((TimelineComponentStyle) style, components, eVar3, interfaceC2425mG, (i12 & 112) | ((i12 >> 3) & 896), 0);
                            interfaceC2425mG = interfaceC2425mG;
                            eVar3 = eVar3;
                            interfaceC2425mG.O();
                        } else if (style instanceof CarouselComponentStyle) {
                            interfaceC2425mG.V(754776858);
                            function2 = function22;
                            CarouselComponentViewKt.CarouselComponentView((CarouselComponentStyle) style, components, function2, eVar3, interfaceC2425mG, i12 & 8176, 0);
                            interfaceC2425mG.O();
                        } else {
                            function2 = function22;
                            if (style instanceof TabsComponentStyle) {
                                interfaceC2425mG.V(754782134);
                                TabsComponentViewKt.TabsComponentView((TabsComponentStyle) style, components, function2, eVar3, interfaceC2425mG, i12 & 8176, 0);
                                interfaceC2425mG.O();
                            } else if (style instanceof TabControlStyle.Buttons) {
                                interfaceC2425mG.V(754790045);
                                StackComponentViewKt.StackComponentView(((TabControlStyle.Buttons) style).getStack(), components, function2, eVar3, 0.0f, interfaceC2425mG, i12 & 8176, 16);
                                interfaceC2425mG = interfaceC2425mG;
                                interfaceC2425mG.O();
                            } else if (style instanceof TabControlStyle.Toggle) {
                                interfaceC2425mG.V(754798109);
                                StackComponentViewKt.StackComponentView(((TabControlStyle.Toggle) style).getStack(), components, function2, eVar3, 0.0f, interfaceC2425mG, i12 & 8176, 16);
                                interfaceC2425mG = interfaceC2425mG;
                                interfaceC2425mG.O();
                            } else {
                                function22 = function2;
                                if (style instanceof TabControlButtonComponentStyle) {
                                    interfaceC2425mG.V(754803833);
                                    TabControlButtonViewKt.TabControlButtonView((TabControlButtonComponentStyle) style, components, eVar3, interfaceC2425mG, (i12 & 112) | ((i12 >> 3) & 896), 0);
                                    interfaceC2425mG = interfaceC2425mG;
                                    eVar3 = eVar3;
                                    interfaceC2425mG.O();
                                } else if (style instanceof TabControlToggleComponentStyle) {
                                    interfaceC2425mG.V(754808441);
                                    TabControlToggleViewKt.TabControlToggleView((TabControlToggleComponentStyle) style, components, eVar3, interfaceC2425mG, (i12 & 112) | ((i12 >> 3) & 896), 0);
                                    interfaceC2425mG = interfaceC2425mG;
                                    eVar3 = eVar3;
                                    interfaceC2425mG.O();
                                } else {
                                    if (!(style instanceof CountdownComponentStyle)) {
                                        interfaceC2425mG.V(754634387);
                                        interfaceC2425mG.O();
                                        throw new r();
                                    }
                                    interfaceC2425mG.V(754812854);
                                    function2 = function22;
                                    CountdownComponentViewKt.CountdownComponentView((CountdownComponentStyle) style, components, function2, eVar3, interfaceC2425mG, i12 & 8176, 0);
                                    interfaceC2425mG.O();
                                }
                            }
                        }
                    }
                }
                function2 = function22;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            eVar2 = eVar3;
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(style, components, function2, eVar2, i10, i11));
        }
    }
}
