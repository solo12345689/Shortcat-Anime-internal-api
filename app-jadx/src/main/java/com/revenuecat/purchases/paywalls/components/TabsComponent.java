package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Rf.h;
import Td.InterfaceC2154e;
import Tf.e;
import Ud.AbstractC2279u;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.C2324e;
import Vf.C2330h;
import Vf.t0;
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u0000 S2\u00020\u0001:\u0004TSUVB¥\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0015¢\u0006\u0004\b\u001d\u0010\u001eB³\u0001\b\u0011\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0014\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u0015\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J(\u0010,\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÁ\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b6\u00105R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\bL\u0010MR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010N\u0012\u0004\bQ\u0010;\u001a\u0004\bO\u0010PR#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010K\u001a\u0004\bR\u0010M¨\u0006W"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "control", "", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "tabs", "", "defaultTabId", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "overrides", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;Ljava/util/List;Ljava/lang/String;Ljava/util/List;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "getControl", "()Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Ljava/lang/String;", "getDefaultTabId", "()Ljava/lang/String;", "getDefaultTabId$annotations", "getOverrides", "Companion", "$serializer", "Tab", "TabControl", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabsComponent implements PaywallComponent {
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final TabControl control;
    private final String defaultTabId;
    private final Padding margin;
    private final List<ComponentOverride<PartialTabsComponent>> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final List<Tab> tabs;
    private final Boolean visible;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, new h("com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl", O.b(TabControl.class), new InterfaceC6014d[]{O.b(TabControl.Buttons.class), O.b(TabControl.Toggle.class)}, new b[]{TabsComponent$TabControl$Buttons$$serializer.INSTANCE, TabsComponent$TabControl$Toggle$$serializer.INSTANCE}, new Annotation[0]), new C2324e(TabsComponent$Tab$$serializer.INSTANCE), null, new C2324e(ComponentOverride.INSTANCE.serializer(PartialTabsComponent$$serializer.INSTANCE))};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return TabsComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "", "", DiagnosticsEntry.ID_KEY, "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/StackComponent;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Tab {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String id;
        private final StackComponent stack;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$Tab;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b serializer() {
                return TabsComponent$Tab$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC2154e
        public /* synthetic */ Tab(int i10, String str, StackComponent stackComponent, t0 t0Var) {
            if (3 != (i10 & 3)) {
                AbstractC2327f0.a(i10, 3, TabsComponent$Tab$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.stack = stackComponent;
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Tab self, d output, e serialDesc) {
            output.k(serialDesc, 0, self.id);
            output.m(serialDesc, 1, StackComponent$$serializer.INSTANCE, self.stack);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) obj;
            return AbstractC5504s.c(this.id, tab.id) && AbstractC5504s.c(this.stack, tab.stack);
        }

        public final /* synthetic */ String getId() {
            return this.id;
        }

        public final /* synthetic */ StackComponent getStack() {
            return this.stack;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.stack.hashCode();
        }

        public String toString() {
            return "Tab(id=" + this.id + ", stack=" + this.stack + ')';
        }

        public Tab(String id2, StackComponent stack) {
            AbstractC5504s.h(id2, "id");
            AbstractC5504s.h(stack, "stack");
            this.id = id2;
            this.stack = stack;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "", "Buttons", "Companion", "Toggle", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TabControl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Buttons implements TabControl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final StackComponent stack;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Buttons;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return TabsComponent$TabControl$Buttons$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ Buttons(int i10, StackComponent stackComponent, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    AbstractC2327f0.a(i10, 1, TabsComponent$TabControl$Buttons$$serializer.INSTANCE.getDescriptor());
                }
                this.stack = stackComponent;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Buttons) && AbstractC5504s.c(this.stack, ((Buttons) obj).stack);
            }

            public final /* synthetic */ StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                return this.stack.hashCode();
            }

            public String toString() {
                return "Buttons(stack=" + this.stack + ')';
            }

            public Buttons(StackComponent stack) {
                AbstractC5504s.h(stack, "stack");
                this.stack = stack;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b serializer() {
                return new h("com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl", O.b(TabControl.class), new InterfaceC6014d[]{O.b(Buttons.class), O.b(Toggle.class)}, new b[]{TabsComponent$TabControl$Buttons$$serializer.INSTANCE, TabsComponent$TabControl$Toggle$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Toggle implements TabControl {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final StackComponent stack;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent$TabControl$Toggle;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b serializer() {
                    return TabsComponent$TabControl$Toggle$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InterfaceC2154e
            public /* synthetic */ Toggle(int i10, StackComponent stackComponent, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    AbstractC2327f0.a(i10, 1, TabsComponent$TabControl$Toggle$$serializer.INSTANCE.getDescriptor());
                }
                this.stack = stackComponent;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Toggle) && AbstractC5504s.c(this.stack, ((Toggle) obj).stack);
            }

            public final /* synthetic */ StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                return this.stack.hashCode();
            }

            public String toString() {
                return "Toggle(stack=" + this.stack + ')';
            }

            public Toggle(StackComponent stack) {
                AbstractC5504s.h(stack, "stack");
                this.stack = stack;
            }
        }
    }

    @InterfaceC2154e
    public /* synthetic */ TabsComponent(int i10, Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, TabControl tabControl, List list, String str, List list2, t0 t0Var) {
        if (1536 != (i10 & 1536)) {
            AbstractC2327f0.a(i10, 1536, TabsComponent$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i10 & 2) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i10 & 4) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i10 & 8) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i10 & 16) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i10 & 32) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        if ((i10 & 64) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i10 & 128) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        this.control = tabControl;
        this.tabs = list;
        if ((i10 & 2048) == 0) {
            this.defaultTabId = null;
        } else {
            this.defaultTabId = str;
        }
        this.overrides = (i10 & 4096) == 0 ? AbstractC2279u.m() : list2;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(TabsComponent self, d output, e serialDesc) {
        b[] bVarArr = $childSerializers;
        if (output.g(serialDesc, 0) || self.visible != null) {
            output.f(serialDesc, 0, C2330h.f20193a, self.visible);
        }
        if (output.g(serialDesc, 1) || !AbstractC5504s.c(self.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            output.m(serialDesc, 1, Size$$serializer.INSTANCE, self.size);
        }
        if (output.g(serialDesc, 2) || !AbstractC5504s.c(self.padding, Padding.INSTANCE.getZero())) {
            output.m(serialDesc, 2, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.g(serialDesc, 3) || !AbstractC5504s.c(self.margin, Padding.INSTANCE.getZero())) {
            output.m(serialDesc, 3, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.g(serialDesc, 4) || self.backgroundColor != null) {
            output.f(serialDesc, 4, ColorScheme$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.g(serialDesc, 5) || self.background != null) {
            output.f(serialDesc, 5, BackgroundDeserializer.INSTANCE, self.background);
        }
        if (output.g(serialDesc, 6) || self.shape != null) {
            output.f(serialDesc, 6, ShapeDeserializer.INSTANCE, self.shape);
        }
        if (output.g(serialDesc, 7) || self.border != null) {
            output.f(serialDesc, 7, Border$$serializer.INSTANCE, self.border);
        }
        if (output.g(serialDesc, 8) || self.shadow != null) {
            output.f(serialDesc, 8, Shadow$$serializer.INSTANCE, self.shadow);
        }
        output.m(serialDesc, 9, bVarArr[9], self.control);
        output.m(serialDesc, 10, bVarArr[10], self.tabs);
        if (output.g(serialDesc, 11) || self.defaultTabId != null) {
            output.f(serialDesc, 11, x0.f20253a, self.defaultTabId);
        }
        if (!output.g(serialDesc, 12) && AbstractC5504s.c(self.overrides, AbstractC2279u.m())) {
            return;
        }
        output.m(serialDesc, 12, bVarArr[12], self.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabsComponent)) {
            return false;
        }
        TabsComponent tabsComponent = (TabsComponent) obj;
        return AbstractC5504s.c(this.visible, tabsComponent.visible) && AbstractC5504s.c(this.size, tabsComponent.size) && AbstractC5504s.c(this.padding, tabsComponent.padding) && AbstractC5504s.c(this.margin, tabsComponent.margin) && AbstractC5504s.c(this.backgroundColor, tabsComponent.backgroundColor) && AbstractC5504s.c(this.background, tabsComponent.background) && AbstractC5504s.c(this.shape, tabsComponent.shape) && AbstractC5504s.c(this.border, tabsComponent.border) && AbstractC5504s.c(this.shadow, tabsComponent.shadow) && AbstractC5504s.c(this.control, tabsComponent.control) && AbstractC5504s.c(this.tabs, tabsComponent.tabs) && AbstractC5504s.c(this.defaultTabId, tabsComponent.defaultTabId) && AbstractC5504s.c(this.overrides, tabsComponent.overrides);
    }

    public final /* synthetic */ Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ TabControl getControl() {
        return this.control;
    }

    public final /* synthetic */ String getDefaultTabId() {
        return this.defaultTabId;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ List getTabs() {
        return this.tabs;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int iHashCode = (((((((bool == null ? 0 : bool.hashCode()) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode2 = (iHashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int iHashCode3 = (iHashCode2 + (background == null ? 0 : background.hashCode())) * 31;
        Shape shape = this.shape;
        int iHashCode4 = (iHashCode3 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int iHashCode5 = (iHashCode4 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int iHashCode6 = (((((iHashCode5 + (shadow == null ? 0 : shadow.hashCode())) * 31) + this.control.hashCode()) * 31) + this.tabs.hashCode()) * 31;
        String str = this.defaultTabId;
        return ((iHashCode6 + (str != null ? str.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "TabsComponent(visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", control=" + this.control + ", tabs=" + this.tabs + ", defaultTabId=" + this.defaultTabId + ", overrides=" + this.overrides + ')';
    }

    public TabsComponent(Boolean bool, Size size, Padding padding, Padding margin, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, TabControl control, List<Tab> tabs, String str, List<ComponentOverride<PartialTabsComponent>> overrides) {
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(control, "control");
        AbstractC5504s.h(tabs, "tabs");
        AbstractC5504s.h(overrides, "overrides");
        this.visible = bool;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.control = control;
        this.tabs = tabs;
        this.defaultTabId = str;
        this.overrides = overrides;
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getDefaultTabId$annotations() {
    }

    public /* synthetic */ TabsComponent(Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, TabControl tabControl, List list, String str, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i10 & 4) != 0 ? Padding.INSTANCE.getZero() : padding, (i10 & 8) != 0 ? Padding.INSTANCE.getZero() : padding2, (i10 & 16) != 0 ? null : colorScheme, (i10 & 32) != 0 ? null : background, (i10 & 64) != 0 ? null : shape, (i10 & 128) != 0 ? null : border, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : shadow, tabControl, list, (i10 & 2048) != 0 ? null : str, (i10 & 4096) != 0 ? AbstractC2279u.m() : list2);
    }
}
