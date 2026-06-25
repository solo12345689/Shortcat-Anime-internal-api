package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Ud.AbstractC2279u;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.C2324e;
import Vf.C2330h;
import Vf.t0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0007\u0018\u0000 R2\u00020\u0001:\u0002SRB\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017¢\u0006\u0004\b\u001b\u0010\u001cB§\u0001\b\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J(\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%HÁ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R(\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b<\u00108\u001a\u0004\b:\u0010;R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\b@\u00108\u001a\u0004\b>\u0010?R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bD\u00108\u001a\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bH\u0010GR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bM\u0010NR#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010O\u001a\u0004\bP\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "source", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "overrideSourceLid", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "maskShape", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colorOverlay", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "overrides", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/ImageComponent;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getSource", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q", "()Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImageComponent implements PaywallComponent {
    private final Border border;
    private final ColorScheme colorOverlay;
    private final FitMode fitMode;
    private final Padding margin;
    private final MaskShape maskShape;
    private final String overrideSourceLid;
    private final List<ComponentOverride<PartialImageComponent>> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Size size;
    private final ThemeImageUrls source;
    private final Boolean visible;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new C2324e(ComponentOverride.INSTANCE.serializer(PartialImageComponent$$serializer.INSTANCE))};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ImageComponent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return ImageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ ImageComponent(int i10, ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, themeImageUrls, bool, size, str, maskShape, colorScheme, fitMode, padding, padding2, border, shadow, (List<ComponentOverride<PartialImageComponent>>) list, t0Var);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ImageComponent self, d output, e serialDesc) {
        b[] bVarArr = $childSerializers;
        output.m(serialDesc, 0, ThemeImageUrls$$serializer.INSTANCE, self.source);
        if (output.g(serialDesc, 1) || self.visible != null) {
            output.f(serialDesc, 1, C2330h.f20193a, self.visible);
        }
        if (output.g(serialDesc, 2) || !AbstractC5504s.c(self.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            output.m(serialDesc, 2, Size$$serializer.INSTANCE, self.size);
        }
        if (output.g(serialDesc, 3) || self.overrideSourceLid != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = self.overrideSourceLid;
            output.f(serialDesc, 3, localizationKey$$serializer, str != null ? LocalizationKey.m343boximpl(str) : null);
        }
        if (output.g(serialDesc, 4) || self.maskShape != null) {
            output.f(serialDesc, 4, MaskShapeDeserializer.INSTANCE, self.maskShape);
        }
        if (output.g(serialDesc, 5) || self.colorOverlay != null) {
            output.f(serialDesc, 5, ColorScheme$$serializer.INSTANCE, self.colorOverlay);
        }
        if (output.g(serialDesc, 6) || self.fitMode != FitMode.FIT) {
            output.m(serialDesc, 6, FitModeDeserializer.INSTANCE, self.fitMode);
        }
        if (output.g(serialDesc, 7) || !AbstractC5504s.c(self.padding, Padding.INSTANCE.getZero())) {
            output.m(serialDesc, 7, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.g(serialDesc, 8) || !AbstractC5504s.c(self.margin, Padding.INSTANCE.getZero())) {
            output.m(serialDesc, 8, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.g(serialDesc, 9) || self.border != null) {
            output.f(serialDesc, 9, Border$$serializer.INSTANCE, self.border);
        }
        if (output.g(serialDesc, 10) || self.shadow != null) {
            output.f(serialDesc, 10, Shadow$$serializer.INSTANCE, self.shadow);
        }
        if (!output.g(serialDesc, 11) && AbstractC5504s.c(self.overrides, AbstractC2279u.m())) {
            return;
        }
        output.m(serialDesc, 11, bVarArr[11], self.overrides);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.ImageComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revenuecat.purchases.paywalls.components.ImageComponent r5 = (com.revenuecat.purchases.paywalls.components.ImageComponent) r5
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r1 = r4.source
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r3 = r5.source
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Boolean r1 = r4.visible
            java.lang.Boolean r3 = r5.visible
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.overrideSourceLid
            java.lang.String r3 = r5.overrideSourceLid
            if (r1 != 0) goto L39
            if (r3 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r3 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m346equalsimpl0(r1, r3)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r1 = r4.maskShape
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r3 = r5.maskShape
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.colorOverlay
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.colorOverlay
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            com.revenuecat.purchases.paywalls.components.properties.FitMode r1 = r4.fitMode
            com.revenuecat.purchases.paywalls.components.properties.FitMode r3 = r5.fitMode
            if (r1 == r3) goto L60
            return r2
        L60:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L6b
            return r2
        L6b:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.margin
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L76
            return r2
        L76:
            com.revenuecat.purchases.paywalls.components.properties.Border r1 = r4.border
            com.revenuecat.purchases.paywalls.components.properties.Border r3 = r5.border
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L81
            return r2
        L81:
            com.revenuecat.purchases.paywalls.components.properties.Shadow r1 = r4.shadow
            com.revenuecat.purchases.paywalls.components.properties.Shadow r3 = r5.shadow
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L8c
            return r2
        L8c:
            java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<com.revenuecat.purchases.paywalls.components.PartialImageComponent>> r1 = r4.overrides
            java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<com.revenuecat.purchases.paywalls.components.PartialImageComponent>> r5 = r5.overrides
            boolean r5 = kotlin.jvm.internal.AbstractC5504s.c(r1, r5)
            if (r5 != 0) goto L97
            return r2
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.ImageComponent.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ ColorScheme getColorOverlay() {
        return this.colorOverlay;
    }

    public final /* synthetic */ FitMode getFitMode() {
        return this.fitMode;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ MaskShape getMaskShape() {
        return this.maskShape;
    }

    /* JADX INFO: renamed from: getOverrideSourceLid-sa7TU9Q, reason: from getter */
    public final /* synthetic */ String getOverrideSourceLid() {
        return this.overrideSourceLid;
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

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ ThemeImageUrls getSource() {
        return this.source;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        Boolean bool = this.visible;
        int iHashCode2 = (((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.size.hashCode()) * 31;
        String str = this.overrideSourceLid;
        int iM347hashCodeimpl = (iHashCode2 + (str == null ? 0 : LocalizationKey.m347hashCodeimpl(str))) * 31;
        MaskShape maskShape = this.maskShape;
        int iHashCode3 = (iM347hashCodeimpl + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int iHashCode4 = (((((((iHashCode3 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31) + this.fitMode.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        Border border = this.border;
        int iHashCode5 = (iHashCode4 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        return ((iHashCode5 + (shadow != null ? shadow.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ImageComponent(source=");
        sb2.append(this.source);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb2.append((Object) (str == null ? "null" : LocalizationKey.m348toStringimpl(str)));
        sb2.append(", maskShape=");
        sb2.append(this.maskShape);
        sb2.append(", colorOverlay=");
        sb2.append(this.colorOverlay);
        sb2.append(", fitMode=");
        sb2.append(this.fitMode);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", border=");
        sb2.append(this.border);
        sb2.append(", shadow=");
        sb2.append(this.shadow);
        sb2.append(", overrides=");
        sb2.append(this.overrides);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ ImageComponent(ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(themeImageUrls, bool, size, str, maskShape, colorScheme, fitMode, padding, padding2, border, shadow, list);
    }

    private ImageComponent(int i10, ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List<ComponentOverride<PartialImageComponent>> list, t0 t0Var) {
        if (1 != (i10 & 1)) {
            AbstractC2327f0.a(i10, 1, ImageComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.source = themeImageUrls;
        if ((i10 & 2) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i10 & 4) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i10 & 8) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
        if ((i10 & 16) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape;
        }
        if ((i10 & 32) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i10 & 64) == 0) {
            this.fitMode = FitMode.FIT;
        } else {
            this.fitMode = fitMode;
        }
        if ((i10 & 128) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i10 & 2048) == 0) {
            this.overrides = AbstractC2279u.m();
        } else {
            this.overrides = list;
        }
    }

    private ImageComponent(ThemeImageUrls source, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding margin, Border border, Shadow shadow, List<ComponentOverride<PartialImageComponent>> overrides) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(fitMode, "fitMode");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(overrides, "overrides");
        this.source = source;
        this.visible = bool;
        this.size = size;
        this.overrideSourceLid = str;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.fitMode = fitMode;
        this.padding = padding;
        this.margin = margin;
        this.border = border;
        this.shadow = shadow;
        this.overrides = overrides;
    }

    public static /* synthetic */ void getColorOverlay$annotations() {
    }

    public static /* synthetic */ void getFitMode$annotations() {
    }

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    /* JADX INFO: renamed from: getOverrideSourceLid-sa7TU9Q$annotations */
    public static /* synthetic */ void m285getOverrideSourceLidsa7TU9Q$annotations() {
    }

    public /* synthetic */ ImageComponent(ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(themeImageUrls, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : maskShape, (i10 & 32) != 0 ? null : colorScheme, (i10 & 64) != 0 ? FitMode.FIT : fitMode, (i10 & 128) != 0 ? Padding.INSTANCE.getZero() : padding, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? Padding.INSTANCE.getZero() : padding2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : border, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : shadow, (i10 & 2048) != 0 ? AbstractC2279u.m() : list, null);
    }
}
