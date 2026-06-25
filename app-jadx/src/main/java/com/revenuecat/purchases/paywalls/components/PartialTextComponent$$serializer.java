package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Rf.m;
import Sf.a;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2330h;
import Vf.C2337k0;
import Vf.E;
import Vf.J;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.FontAlias$$serializer;
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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialTextComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PartialTextComponent$$serializer implements E {
    public static final PartialTextComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PartialTextComponent$$serializer partialTextComponent$$serializer = new PartialTextComponent$$serializer();
        INSTANCE = partialTextComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.PartialTextComponent", partialTextComponent$$serializer, 12);
        c2337k0.g("visible", true);
        c2337k0.g("text_lid", true);
        c2337k0.g("color", true);
        c2337k0.g("background_color", true);
        c2337k0.g("font_name", true);
        c2337k0.g("font_weight", true);
        c2337k0.g("font_weight_int", true);
        c2337k0.g("font_size", true);
        c2337k0.g("horizontal_alignment", true);
        c2337k0.g("size", true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        descriptor = c2337k0;
    }

    private PartialTextComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b bVarP = a.p(C2330h.f20193a);
        b bVarP2 = a.p(LocalizationKey$$serializer.INSTANCE);
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        b bVarP3 = a.p(colorScheme$$serializer);
        b bVarP4 = a.p(colorScheme$$serializer);
        b bVarP5 = a.p(FontAlias$$serializer.INSTANCE);
        b bVarP6 = a.p(FontWeightDeserializer.INSTANCE);
        b bVarP7 = a.p(J.f20144a);
        b bVarP8 = a.p(FontSizeSerializer.INSTANCE);
        b bVarP9 = a.p(HorizontalAlignmentDeserializer.INSTANCE);
        b bVarP10 = a.p(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVarP, bVarP2, bVarP3, bVarP4, bVarP5, bVarP6, bVarP7, bVarP8, bVarP9, bVarP10, a.p(padding$$serializer), a.p(padding$$serializer)};
    }

    @Override // Rf.a
    public PartialTextComponent deserialize(e decoder) {
        Boolean bool;
        ColorScheme colorScheme;
        ColorScheme colorScheme2;
        int i10;
        HorizontalAlignment horizontalAlignment;
        Integer num;
        FontWeight fontWeight;
        Integer num2;
        Size size;
        Padding padding;
        Padding padding2;
        String str;
        String str2;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 11;
        int i12 = 10;
        int i13 = 9;
        int i14 = 8;
        Padding padding3 = null;
        if (cVarB.p()) {
            bool = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, null);
            LocalizationKey localizationKey = (LocalizationKey) cVarB.B(descriptor2, 1, LocalizationKey$$serializer.INSTANCE, null);
            String strM349unboximpl = localizationKey != null ? localizationKey.m349unboximpl() : null;
            ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
            ColorScheme colorScheme3 = (ColorScheme) cVarB.B(descriptor2, 2, colorScheme$$serializer, null);
            ColorScheme colorScheme4 = (ColorScheme) cVarB.B(descriptor2, 3, colorScheme$$serializer, null);
            FontAlias fontAlias = (FontAlias) cVarB.B(descriptor2, 4, FontAlias$$serializer.INSTANCE, null);
            String strM139unboximpl = fontAlias != null ? fontAlias.m139unboximpl() : null;
            FontWeight fontWeight2 = (FontWeight) cVarB.B(descriptor2, 5, FontWeightDeserializer.INSTANCE, null);
            Integer num3 = (Integer) cVarB.B(descriptor2, 6, J.f20144a, null);
            Integer num4 = (Integer) cVarB.B(descriptor2, 7, FontSizeSerializer.INSTANCE, null);
            HorizontalAlignment horizontalAlignment2 = (HorizontalAlignment) cVarB.B(descriptor2, 8, HorizontalAlignmentDeserializer.INSTANCE, null);
            Size size2 = (Size) cVarB.B(descriptor2, 9, Size$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding4 = (Padding) cVarB.B(descriptor2, 10, padding$$serializer, null);
            padding2 = (Padding) cVarB.B(descriptor2, 11, padding$$serializer, null);
            padding = padding4;
            size = size2;
            num2 = num4;
            num = num3;
            fontWeight = fontWeight2;
            colorScheme2 = colorScheme4;
            horizontalAlignment = horizontalAlignment2;
            str = strM139unboximpl;
            colorScheme = colorScheme3;
            str2 = strM349unboximpl;
            i10 = 4095;
        } else {
            boolean z10 = true;
            int i15 = 0;
            bool = null;
            HorizontalAlignment horizontalAlignment3 = null;
            Integer num5 = null;
            FontWeight fontWeight3 = null;
            Integer num6 = null;
            Size size3 = null;
            Padding padding5 = null;
            ColorScheme colorScheme5 = null;
            String strM139unboximpl2 = null;
            ColorScheme colorScheme6 = null;
            String strM349unboximpl2 = null;
            while (z10) {
                int i16 = cVarB.i(descriptor2);
                switch (i16) {
                    case -1:
                        z10 = false;
                        i12 = 10;
                        i13 = 9;
                        i14 = 8;
                        break;
                    case 0:
                        bool = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, bool);
                        i15 |= 1;
                        i11 = 11;
                        i12 = 10;
                        i13 = 9;
                        i14 = 8;
                        break;
                    case 1:
                        ColorScheme colorScheme7 = colorScheme5;
                        ColorScheme colorScheme8 = colorScheme6;
                        LocalizationKey localizationKey2 = (LocalizationKey) cVarB.B(descriptor2, 1, LocalizationKey$$serializer.INSTANCE, strM349unboximpl2 != null ? LocalizationKey.m343boximpl(strM349unboximpl2) : null);
                        strM349unboximpl2 = localizationKey2 != null ? localizationKey2.m349unboximpl() : null;
                        i15 |= 2;
                        colorScheme6 = colorScheme8;
                        colorScheme5 = colorScheme7;
                        i11 = 11;
                        i12 = 10;
                        i13 = 9;
                        i14 = 8;
                        break;
                    case 2:
                        colorScheme6 = (ColorScheme) cVarB.B(descriptor2, 2, ColorScheme$$serializer.INSTANCE, colorScheme6);
                        i15 |= 4;
                        i11 = 11;
                        i12 = 10;
                        i13 = 9;
                        break;
                    case 3:
                        colorScheme5 = (ColorScheme) cVarB.B(descriptor2, 3, ColorScheme$$serializer.INSTANCE, colorScheme5);
                        i15 |= 8;
                        i11 = 11;
                        i12 = 10;
                        break;
                    case 4:
                        FontAlias fontAlias2 = (FontAlias) cVarB.B(descriptor2, 4, FontAlias$$serializer.INSTANCE, strM139unboximpl2 != null ? FontAlias.m133boximpl(strM139unboximpl2) : null);
                        strM139unboximpl2 = fontAlias2 != null ? fontAlias2.m139unboximpl() : null;
                        i15 |= 16;
                        i11 = 11;
                        i12 = 10;
                        break;
                    case 5:
                        fontWeight3 = (FontWeight) cVarB.B(descriptor2, 5, FontWeightDeserializer.INSTANCE, fontWeight3);
                        i15 |= 32;
                        i11 = 11;
                        break;
                    case 6:
                        num5 = (Integer) cVarB.B(descriptor2, 6, J.f20144a, num5);
                        i15 |= 64;
                        i11 = 11;
                        break;
                    case 7:
                        num6 = (Integer) cVarB.B(descriptor2, 7, FontSizeSerializer.INSTANCE, num6);
                        i15 |= 128;
                        i11 = 11;
                        break;
                    case 8:
                        horizontalAlignment3 = (HorizontalAlignment) cVarB.B(descriptor2, i14, HorizontalAlignmentDeserializer.INSTANCE, horizontalAlignment3);
                        i15 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        size3 = (Size) cVarB.B(descriptor2, i13, Size$$serializer.INSTANCE, size3);
                        i15 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        padding5 = (Padding) cVarB.B(descriptor2, i12, Padding$$serializer.INSTANCE, padding5);
                        i15 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    case 11:
                        padding3 = (Padding) cVarB.B(descriptor2, i11, Padding$$serializer.INSTANCE, padding3);
                        i15 |= 2048;
                        break;
                    default:
                        throw new m(i16);
                }
            }
            colorScheme = colorScheme6;
            colorScheme2 = colorScheme5;
            i10 = i15;
            horizontalAlignment = horizontalAlignment3;
            num = num5;
            fontWeight = fontWeight3;
            num2 = num6;
            size = size3;
            padding = padding5;
            padding2 = padding3;
            str = strM139unboximpl2;
            str2 = strM349unboximpl2;
        }
        Boolean bool2 = bool;
        cVarB.c(descriptor2);
        return new PartialTextComponent(i10, bool2, str2, colorScheme, colorScheme2, str, fontWeight, num, num2, horizontalAlignment, size, padding, padding2, null, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PartialTextComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PartialTextComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
