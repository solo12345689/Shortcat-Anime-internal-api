package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.InterfaceC1138i;
import C.K;
import Td.L;
import Ud.AbstractC2279u;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import g0.i;
import ie.InterfaceC5096o;
import ie.q;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u001e\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u0011H\u0016¢\u0006\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR.\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScopeImpl;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/VerticalStackScope;", "Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "distribution", "Li1/h;", "spacing", "Lkotlin/Function1;", "", "LTd/L;", "fillSpaceSpacer", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "height", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;FLie/o;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ComponentStyle;", "items", "Lkotlin/Function3;", "LC/i;", "", "itemContent", "(Ljava/util/List;Lie/q;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "F", "Lie/o;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "", "hasAnyItemsWithFillHeight", "Z", "columnContent", "getColumnContent", "()Lie/o;", "setColumnContent", "(Lie/o;)V", "getShouldApplyFillSpacers", "()Z", "shouldApplyFillSpacers", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class VerticalStackScopeImpl implements VerticalStackScope {
    private InterfaceC5096o columnContent;
    private final FlexDistribution distribution;
    private final InterfaceC5096o fillSpaceSpacer;
    private boolean hasAnyItemsWithFillHeight;
    private final SizeConstraint height;
    private final float spacing;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.stack.VerticalStackScopeImpl$items$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/i;", "LTd/L;", "invoke", "(LC/i;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5096o {
        final /* synthetic */ q $itemContent;
        final /* synthetic */ List<ComponentStyle> $items;
        final /* synthetic */ VerticalStackScopeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<? extends ComponentStyle> list, q qVar, VerticalStackScopeImpl verticalStackScopeImpl) {
            super(3);
            this.$items = list;
            this.$itemContent = qVar;
            this.this$0 = verticalStackScopeImpl;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC1138i) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC1138i interfaceC1138i, InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC5504s.h(interfaceC1138i, "$this$null");
            int i11 = (i10 & 6) == 0 ? i10 | (interfaceC2425m.U(interfaceC1138i) ? 4 : 2) : i10;
            if ((i11 & 19) == 18 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(552023703, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.VerticalStackScopeImpl.items.<anonymous> (VerticalStack.kt:96)");
            }
            List<ComponentStyle> list = this.$items;
            q qVar = this.$itemContent;
            VerticalStackScopeImpl verticalStackScopeImpl = this.this$0;
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    AbstractC2279u.w();
                }
                ComponentStyle componentStyle = (ComponentStyle) obj;
                boolean z10 = i12 == list.size() - 1;
                qVar.invoke(interfaceC1138i, Integer.valueOf(i12), componentStyle, interfaceC2425m, Integer.valueOf(i11 & 14));
                interfaceC2425m.V(-1867284347);
                if (StackComponentViewKt.getUsesAllAvailableSpace(verticalStackScopeImpl.distribution) && !z10) {
                    K.a(s.k(e.f26613a, verticalStackScopeImpl.spacing, 0.0f, 2, null), interfaceC2425m, 0);
                    if (verticalStackScopeImpl.getShouldApplyFillSpacers()) {
                        verticalStackScopeImpl.fillSpaceSpacer.invoke(Float.valueOf(verticalStackScopeImpl.distribution == FlexDistribution.SPACE_AROUND ? 2.0f : 1.0f), interfaceC2425m, 0);
                    }
                }
                interfaceC2425m.O();
                i12 = i13;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    public /* synthetic */ VerticalStackScopeImpl(FlexDistribution flexDistribution, float f10, InterfaceC5096o interfaceC5096o, SizeConstraint sizeConstraint, DefaultConstructorMarker defaultConstructorMarker) {
        this(flexDistribution, f10, interfaceC5096o, sizeConstraint);
    }

    public final InterfaceC5096o getColumnContent() {
        return this.columnContent;
    }

    public final boolean getShouldApplyFillSpacers() {
        return (AbstractC5504s.c(this.height, SizeConstraint.Fit.INSTANCE) || this.hasAnyItemsWithFillHeight) ? false : true;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.stack.VerticalStackScope
    public void items(List<? extends ComponentStyle> items, q itemContent) {
        AbstractC5504s.h(items, "items");
        AbstractC5504s.h(itemContent, "itemContent");
        boolean z10 = false;
        if (items == null || !items.isEmpty()) {
            Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (AbstractC5504s.c(((ComponentStyle) it.next()).getSize().getHeight(), SizeConstraint.Fill.INSTANCE)) {
                    z10 = true;
                    break;
                }
            }
        }
        this.hasAnyItemsWithFillHeight = z10;
        this.columnContent = i.b(552023703, true, new AnonymousClass2(items, itemContent, this));
    }

    public final void setColumnContent(InterfaceC5096o interfaceC5096o) {
        AbstractC5504s.h(interfaceC5096o, "<set-?>");
        this.columnContent = interfaceC5096o;
    }

    private VerticalStackScopeImpl(FlexDistribution distribution, float f10, InterfaceC5096o fillSpaceSpacer, SizeConstraint height) {
        AbstractC5504s.h(distribution, "distribution");
        AbstractC5504s.h(fillSpaceSpacer, "fillSpaceSpacer");
        AbstractC5504s.h(height, "height");
        this.distribution = distribution;
        this.spacing = f10;
        this.fillSpaceSpacer = fillSpaceSpacer;
        this.height = height;
        this.columnContent = ComposableSingletons$VerticalStackKt.INSTANCE.m501getLambda1$revenuecatui_defaultsBc8Release();
    }
}
