package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Ud.AbstractC2279u;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.C2324e;
import Vf.C2330h;
import Vf.J;
import Vf.t0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.FontAlias$$serializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignmentDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0007\u0018\u0000 S2\u00020\u0001:\u0002TSB\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017¢\u0006\u0004\b\u001b\u0010\u001cBµ\u0001\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\r\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J(\u0010)\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$HÁ\u0001¢\u0006\u0004\b'\u0010(R&\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b6\u0010.\u001a\u0004\b5\u00101R(\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010,R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b<\u0010.\u001a\u0004\b:\u0010;R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R \u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bD\u0010.\u001a\u0004\bB\u0010CR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010E\u0012\u0004\bH\u0010.\u001a\u0004\bF\u0010GR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bO\u0010NR#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010P\u001a\u0004\bQ\u0010R\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "text", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "", "visible", "backgroundColor", "Lcom/revenuecat/purchases/FontAlias;", "fontName", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "fontWeight", "", "fontWeightInt", "fontSize", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "horizontalAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "overrides", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Ljava/lang/Integer;ILcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Ljava/lang/Integer;ILcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/TextComponent;LUf/d;LTf/e;)V", "write$Self", "Ljava/lang/String;", "getText-z7Tp-4o", "()Ljava/lang/String;", "getText-z7Tp-4o$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "getBackgroundColor", "getBackgroundColor$annotations", "getFontName-ARcRonI", "getFontName-ARcRonI$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "getFontWeight", "()Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "getFontWeight$annotations", "Ljava/lang/Integer;", "getFontWeightInt", "()Ljava/lang/Integer;", "getFontWeightInt$annotations", "I", "getFontSize", "()I", "getFontSize$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getHorizontalAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getHorizontalAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextComponent implements PaywallComponent {
    private final ColorScheme backgroundColor;
    private final ColorScheme color;
    private final String fontName;
    private final int fontSize;
    private final FontWeight fontWeight;
    private final Integer fontWeightInt;
    private final HorizontalAlignment horizontalAlignment;
    private final Padding margin;
    private final List<ComponentOverride<PartialTextComponent>> overrides;
    private final Padding padding;
    private final Size size;
    private final String text;
    private final Boolean visible;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new C2324e(ComponentOverride.INSTANCE.serializer(PartialTextComponent$$serializer.INSTANCE))};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TextComponent$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return TextComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ TextComponent(int i10, String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i11, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, colorScheme, bool, colorScheme2, str2, fontWeight, num, i11, horizontalAlignment, size, padding, padding2, (List<ComponentOverride<PartialTextComponent>>) list, t0Var);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(TextComponent self, d output, e serialDesc) {
        b[] bVarArr = $childSerializers;
        output.m(serialDesc, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m343boximpl(self.text));
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        output.m(serialDesc, 1, colorScheme$$serializer, self.color);
        if (output.g(serialDesc, 2) || self.visible != null) {
            output.f(serialDesc, 2, C2330h.f20193a, self.visible);
        }
        if (output.g(serialDesc, 3) || self.backgroundColor != null) {
            output.f(serialDesc, 3, colorScheme$$serializer, self.backgroundColor);
        }
        if (output.g(serialDesc, 4) || self.fontName != null) {
            FontAlias$$serializer fontAlias$$serializer = FontAlias$$serializer.INSTANCE;
            String str = self.fontName;
            output.f(serialDesc, 4, fontAlias$$serializer, str != null ? FontAlias.m133boximpl(str) : null);
        }
        if (output.g(serialDesc, 5) || self.fontWeight != FontWeight.REGULAR) {
            output.m(serialDesc, 5, FontWeightDeserializer.INSTANCE, self.fontWeight);
        }
        if (output.g(serialDesc, 6) || self.fontWeightInt != null) {
            output.f(serialDesc, 6, J.f20144a, self.fontWeightInt);
        }
        if (output.g(serialDesc, 7) || self.fontSize != 15) {
            output.m(serialDesc, 7, FontSizeSerializer.INSTANCE, Integer.valueOf(self.fontSize));
        }
        if (output.g(serialDesc, 8) || self.horizontalAlignment != HorizontalAlignment.CENTER) {
            output.m(serialDesc, 8, HorizontalAlignmentDeserializer.INSTANCE, self.horizontalAlignment);
        }
        if (output.g(serialDesc, 9) || !AbstractC5504s.c(self.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            output.m(serialDesc, 9, Size$$serializer.INSTANCE, self.size);
        }
        if (output.g(serialDesc, 10) || !AbstractC5504s.c(self.padding, Padding.INSTANCE.getZero())) {
            output.m(serialDesc, 10, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.g(serialDesc, 11) || !AbstractC5504s.c(self.margin, Padding.INSTANCE.getZero())) {
            output.m(serialDesc, 11, Padding$$serializer.INSTANCE, self.margin);
        }
        if (!output.g(serialDesc, 12) && AbstractC5504s.c(self.overrides, AbstractC2279u.m())) {
            return;
        }
        output.m(serialDesc, 12, bVarArr[12], self.overrides);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0042  */
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
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.TextComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revenuecat.purchases.paywalls.components.TextComponent r5 = (com.revenuecat.purchases.paywalls.components.TextComponent) r5
            java.lang.String r1 = r4.text
            java.lang.String r3 = r5.text
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m346equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.color
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.color
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Boolean r1 = r4.visible
            java.lang.Boolean r3 = r5.visible
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.backgroundColor
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.backgroundColor
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.fontName
            java.lang.String r3 = r5.fontName
            if (r1 != 0) goto L44
            if (r3 != 0) goto L42
            r1 = r0
            goto L4b
        L42:
            r1 = r2
            goto L4b
        L44:
            if (r3 != 0) goto L47
            goto L42
        L47:
            boolean r1 = com.revenuecat.purchases.FontAlias.m136equalsimpl0(r1, r3)
        L4b:
            if (r1 != 0) goto L4e
            return r2
        L4e:
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r1 = r4.fontWeight
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r3 = r5.fontWeight
            if (r1 == r3) goto L55
            return r2
        L55:
            java.lang.Integer r1 = r4.fontWeightInt
            java.lang.Integer r3 = r5.fontWeightInt
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            int r1 = r4.fontSize
            int r3 = r5.fontSize
            if (r1 == r3) goto L67
            return r2
        L67:
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r1 = r4.horizontalAlignment
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r3 = r5.horizontalAlignment
            if (r1 == r3) goto L6e
            return r2
        L6e:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L79
            return r2
        L79:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L84
            return r2
        L84:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.margin
            boolean r1 = kotlin.jvm.internal.AbstractC5504s.c(r1, r3)
            if (r1 != 0) goto L8f
            return r2
        L8f:
            java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<com.revenuecat.purchases.paywalls.components.PartialTextComponent>> r1 = r4.overrides
            java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<com.revenuecat.purchases.paywalls.components.PartialTextComponent>> r5 = r5.overrides
            boolean r5 = kotlin.jvm.internal.AbstractC5504s.c(r1, r5)
            if (r5 != 0) goto L9a
            return r2
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TextComponent.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getFontName-ARcRonI, reason: from getter */
    public final /* synthetic */ String getFontName() {
        return this.fontName;
    }

    public final /* synthetic */ int getFontSize() {
        return this.fontSize;
    }

    public final /* synthetic */ FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final /* synthetic */ Integer getFontWeightInt() {
        return this.fontWeightInt;
    }

    public final /* synthetic */ HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
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

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getText-z7Tp-4o, reason: from getter */
    public final /* synthetic */ String getText() {
        return this.text;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iM347hashCodeimpl = ((LocalizationKey.m347hashCodeimpl(this.text) * 31) + this.color.hashCode()) * 31;
        Boolean bool = this.visible;
        int iHashCode = (iM347hashCodeimpl + (bool == null ? 0 : bool.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode2 = (iHashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        String str = this.fontName;
        int iM137hashCodeimpl = (((iHashCode2 + (str == null ? 0 : FontAlias.m137hashCodeimpl(str))) * 31) + this.fontWeight.hashCode()) * 31;
        Integer num = this.fontWeightInt;
        return ((((((((((((iM137hashCodeimpl + (num != null ? num.hashCode() : 0)) * 31) + this.fontSize) * 31) + this.horizontalAlignment.hashCode()) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TextComponent(text=");
        sb2.append((Object) LocalizationKey.m348toStringimpl(this.text));
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", fontName=");
        String str = this.fontName;
        sb2.append((Object) (str == null ? "null" : FontAlias.m138toStringimpl(str)));
        sb2.append(", fontWeight=");
        sb2.append(this.fontWeight);
        sb2.append(", fontWeightInt=");
        sb2.append(this.fontWeightInt);
        sb2.append(", fontSize=");
        sb2.append(this.fontSize);
        sb2.append(", horizontalAlignment=");
        sb2.append(this.horizontalAlignment);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", overrides=");
        sb2.append(this.overrides);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ TextComponent(String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i10, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, colorScheme, bool, colorScheme2, str2, fontWeight, num, i10, horizontalAlignment, size, padding, padding2, list);
    }

    private TextComponent(int i10, String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i11, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List<ComponentOverride<PartialTextComponent>> list, t0 t0Var) {
        if (3 != (i10 & 3)) {
            AbstractC2327f0.a(i10, 3, TextComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.color = colorScheme;
        if ((i10 & 4) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i10 & 8) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme2;
        }
        if ((i10 & 16) == 0) {
            this.fontName = null;
        } else {
            this.fontName = str2;
        }
        if ((i10 & 32) == 0) {
            this.fontWeight = FontWeight.REGULAR;
        } else {
            this.fontWeight = fontWeight;
        }
        if ((i10 & 64) == 0) {
            this.fontWeightInt = null;
        } else {
            this.fontWeightInt = num;
        }
        if ((i10 & 128) == 0) {
            this.fontSize = 15;
        } else {
            this.fontSize = i11;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.horizontalAlignment = HorizontalAlignment.CENTER;
        } else {
            this.horizontalAlignment = horizontalAlignment;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i10 & 2048) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        this.overrides = (i10 & 4096) == 0 ? AbstractC2279u.m() : list;
    }

    private TextComponent(String text, ColorScheme color, Boolean bool, ColorScheme colorScheme, String str, FontWeight fontWeight, Integer num, int i10, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding margin, List<ComponentOverride<PartialTextComponent>> overrides) {
        AbstractC5504s.h(text, "text");
        AbstractC5504s.h(color, "color");
        AbstractC5504s.h(fontWeight, "fontWeight");
        AbstractC5504s.h(horizontalAlignment, "horizontalAlignment");
        AbstractC5504s.h(size, "size");
        AbstractC5504s.h(padding, "padding");
        AbstractC5504s.h(margin, "margin");
        AbstractC5504s.h(overrides, "overrides");
        this.text = text;
        this.color = color;
        this.visible = bool;
        this.backgroundColor = colorScheme;
        this.fontName = str;
        this.fontWeight = fontWeight;
        this.fontWeightInt = num;
        this.fontSize = i10;
        this.horizontalAlignment = horizontalAlignment;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.overrides = overrides;
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    /* JADX INFO: renamed from: getFontName-ARcRonI$annotations */
    public static /* synthetic */ void m300getFontNameARcRonI$annotations() {
    }

    public static /* synthetic */ void getFontSize$annotations() {
    }

    public static /* synthetic */ void getFontWeight$annotations() {
    }

    public static /* synthetic */ void getFontWeightInt$annotations() {
    }

    public static /* synthetic */ void getHorizontalAlignment$annotations() {
    }

    /* JADX INFO: renamed from: getText-z7Tp-4o$annotations */
    public static /* synthetic */ void m301getTextz7Tp4o$annotations() {
    }

    public /* synthetic */ TextComponent(String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i10, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, colorScheme, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : colorScheme2, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? FontWeight.REGULAR : fontWeight, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? 15 : i10, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? Padding.INSTANCE.getZero() : padding, (i11 & 2048) != 0 ? Padding.INSTANCE.getZero() : padding2, (i11 & 4096) != 0 ? AbstractC2279u.m() : list, null);
    }
}
