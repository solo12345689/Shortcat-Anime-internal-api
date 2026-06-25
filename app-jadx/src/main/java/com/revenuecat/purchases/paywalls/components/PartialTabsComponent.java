package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.C2330h;
import Vf.t0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 >2\u00020\u0001:\u0002?>Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bw\b\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", AppStateModule.APP_STATE_BACKGROUND, "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialTabsComponent implements PartialComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Padding margin;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Boolean visible;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return PartialTabsComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialTabsComponent() {
        this((Boolean) null, (Size) null, (Padding) null, (Padding) null, (ColorScheme) null, (Background) null, (Shape) null, (Border) null, (Shadow) null, 511, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialTabsComponent self, d output, e serialDesc) {
        if (output.g(serialDesc, 0) || !AbstractC5504s.c(self.visible, Boolean.TRUE)) {
            output.f(serialDesc, 0, C2330h.f20193a, self.visible);
        }
        if (output.g(serialDesc, 1) || self.size != null) {
            output.f(serialDesc, 1, Size$$serializer.INSTANCE, self.size);
        }
        if (output.g(serialDesc, 2) || self.padding != null) {
            output.f(serialDesc, 2, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.g(serialDesc, 3) || self.margin != null) {
            output.f(serialDesc, 3, Padding$$serializer.INSTANCE, self.margin);
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
        if (!output.g(serialDesc, 8) && self.shadow == null) {
            return;
        }
        output.f(serialDesc, 8, Shadow$$serializer.INSTANCE, self.shadow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialTabsComponent)) {
            return false;
        }
        PartialTabsComponent partialTabsComponent = (PartialTabsComponent) obj;
        return AbstractC5504s.c(this.visible, partialTabsComponent.visible) && AbstractC5504s.c(this.size, partialTabsComponent.size) && AbstractC5504s.c(this.padding, partialTabsComponent.padding) && AbstractC5504s.c(this.margin, partialTabsComponent.margin) && AbstractC5504s.c(this.backgroundColor, partialTabsComponent.backgroundColor) && AbstractC5504s.c(this.background, partialTabsComponent.background) && AbstractC5504s.c(this.shape, partialTabsComponent.shape) && AbstractC5504s.c(this.border, partialTabsComponent.border) && AbstractC5504s.c(this.shadow, partialTabsComponent.shadow);
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

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
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

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Size size = this.size;
        int iHashCode2 = (iHashCode + (size == null ? 0 : size.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode3 = (iHashCode2 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int iHashCode4 = (iHashCode3 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int iHashCode6 = (iHashCode5 + (background == null ? 0 : background.hashCode())) * 31;
        Shape shape = this.shape;
        int iHashCode7 = (iHashCode6 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int iHashCode8 = (iHashCode7 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        return iHashCode8 + (shadow != null ? shadow.hashCode() : 0);
    }

    public String toString() {
        return "PartialTabsComponent(visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ')';
    }

    @InterfaceC2154e
    public /* synthetic */ PartialTabsComponent(int i10, Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, t0 t0Var) {
        this.visible = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i10 & 4) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i10 & 8) == 0) {
            this.margin = null;
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
    }

    public PartialTabsComponent(Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow) {
        this.visible = bool;
        this.size = size;
        this.padding = padding;
        this.margin = padding2;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PartialTabsComponent(java.lang.Boolean r2, com.revenuecat.purchases.paywalls.components.properties.Size r3, com.revenuecat.purchases.paywalls.components.properties.Padding r4, com.revenuecat.purchases.paywalls.components.properties.Padding r5, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r6, com.revenuecat.purchases.paywalls.components.common.Background r7, com.revenuecat.purchases.paywalls.components.properties.Shape r8, com.revenuecat.purchases.paywalls.components.properties.Border r9, com.revenuecat.purchases.paywalls.components.properties.Shadow r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L6:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto Lc
            r3 = r0
        Lc:
            r12 = r11 & 4
            if (r12 == 0) goto L11
            r4 = r0
        L11:
            r12 = r11 & 8
            if (r12 == 0) goto L16
            r5 = r0
        L16:
            r12 = r11 & 16
            if (r12 == 0) goto L1b
            r6 = r0
        L1b:
            r12 = r11 & 32
            if (r12 == 0) goto L20
            r7 = r0
        L20:
            r12 = r11 & 64
            if (r12 == 0) goto L25
            r8 = r0
        L25:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L2a
            r9 = r0
        L2a:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L39
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L43
        L39:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L43:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialTabsComponent.<init>(java.lang.Boolean, com.revenuecat.purchases.paywalls.components.properties.Size, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.common.Background, com.revenuecat.purchases.paywalls.components.properties.Shape, com.revenuecat.purchases.paywalls.components.properties.Border, com.revenuecat.purchases.paywalls.components.properties.Shadow, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }
}
