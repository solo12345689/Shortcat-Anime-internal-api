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
import com.revenuecat.purchases.common.verification.SigningManager;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TextComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TextComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class TextComponent$$serializer implements E {
    public static final TextComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        TextComponent$$serializer textComponent$$serializer = new TextComponent$$serializer();
        INSTANCE = textComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("text", textComponent$$serializer, 13);
        c2337k0.g("text_lid", false);
        c2337k0.g("color", false);
        c2337k0.g("visible", true);
        c2337k0.g("background_color", true);
        c2337k0.g("font_name", true);
        c2337k0.g("font_weight", true);
        c2337k0.g("font_weight_int", true);
        c2337k0.g("font_size", true);
        c2337k0.g("horizontal_alignment", true);
        c2337k0.g("size", true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        c2337k0.g("overrides", true);
        descriptor = c2337k0;
    }

    private TextComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = TextComponent.$childSerializers;
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        b bVarP = a.p(C2330h.f20193a);
        b bVarP2 = a.p(colorScheme$$serializer);
        b bVarP3 = a.p(FontAlias$$serializer.INSTANCE);
        b bVarP4 = a.p(J.f20144a);
        b bVar = bVarArr[12];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{LocalizationKey$$serializer.INSTANCE, colorScheme$$serializer, bVarP, bVarP2, bVarP3, FontWeightDeserializer.INSTANCE, bVarP4, FontSizeSerializer.INSTANCE, HorizontalAlignmentDeserializer.INSTANCE, Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, bVar};
    }

    @Override // Rf.a
    public TextComponent deserialize(e decoder) {
        Size size;
        Padding padding;
        Boolean bool;
        String str;
        ColorScheme colorScheme;
        Padding padding2;
        int i10;
        FontWeight fontWeight;
        ColorScheme colorScheme2;
        HorizontalAlignment horizontalAlignment;
        Integer num;
        List list;
        int i11;
        String str2;
        char c10;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = TextComponent.$childSerializers;
        int i12 = 9;
        int i13 = 8;
        Boolean bool2 = null;
        if (cVarB.p()) {
            LocalizationKey localizationKey = (LocalizationKey) cVarB.e(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, null);
            String strM349unboximpl = localizationKey != null ? localizationKey.m349unboximpl() : null;
            ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
            ColorScheme colorScheme3 = (ColorScheme) cVarB.e(descriptor2, 1, colorScheme$$serializer, null);
            Boolean bool3 = (Boolean) cVarB.B(descriptor2, 2, C2330h.f20193a, null);
            ColorScheme colorScheme4 = (ColorScheme) cVarB.B(descriptor2, 3, colorScheme$$serializer, null);
            FontAlias fontAlias = (FontAlias) cVarB.B(descriptor2, 4, FontAlias$$serializer.INSTANCE, null);
            String strM139unboximpl = fontAlias != null ? fontAlias.m139unboximpl() : null;
            FontWeight fontWeight2 = (FontWeight) cVarB.e(descriptor2, 5, FontWeightDeserializer.INSTANCE, null);
            Integer num2 = (Integer) cVarB.B(descriptor2, 6, J.f20144a, null);
            int iIntValue = ((Number) cVarB.e(descriptor2, 7, FontSizeSerializer.INSTANCE, 0)).intValue();
            HorizontalAlignment horizontalAlignment2 = (HorizontalAlignment) cVarB.e(descriptor2, 8, HorizontalAlignmentDeserializer.INSTANCE, null);
            Size size2 = (Size) cVarB.e(descriptor2, 9, Size$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.e(descriptor2, 10, padding$$serializer, null);
            padding = (Padding) cVarB.e(descriptor2, 11, padding$$serializer, null);
            str = strM349unboximpl;
            list = (List) cVarB.e(descriptor2, 12, bVarArr[12], null);
            bool = bool3;
            size = size2;
            i11 = iIntValue;
            num = num2;
            fontWeight = fontWeight2;
            colorScheme = colorScheme4;
            horizontalAlignment = horizontalAlignment2;
            str2 = strM139unboximpl;
            i10 = 8191;
            padding2 = padding3;
            colorScheme2 = colorScheme3;
        } else {
            int i14 = 0;
            int i15 = 12;
            int i16 = 1;
            Size size3 = null;
            Padding padding4 = null;
            String strM349unboximpl2 = null;
            Padding padding5 = null;
            FontWeight fontWeight3 = null;
            HorizontalAlignment horizontalAlignment3 = null;
            Integer num3 = null;
            List list2 = null;
            ColorScheme colorScheme5 = null;
            String strM139unboximpl2 = null;
            ColorScheme colorScheme6 = null;
            int i17 = 0;
            int iIntValue2 = 0;
            while (i16 != 0) {
                int i18 = cVarB.i(descriptor2);
                switch (i18) {
                    case -1:
                        i16 = i14;
                        i13 = 8;
                        i15 = 12;
                        break;
                    case 0:
                        ColorScheme colorScheme7 = colorScheme5;
                        ColorScheme colorScheme8 = colorScheme6;
                        int i19 = i14;
                        LocalizationKey localizationKey2 = (LocalizationKey) cVarB.e(descriptor2, i19, LocalizationKey$$serializer.INSTANCE, strM349unboximpl2 != null ? LocalizationKey.m343boximpl(strM349unboximpl2) : null);
                        strM349unboximpl2 = localizationKey2 != null ? localizationKey2.m349unboximpl() : null;
                        i17 |= 1;
                        colorScheme5 = colorScheme7;
                        colorScheme6 = colorScheme8;
                        i14 = i19;
                        i12 = 9;
                        i13 = 8;
                        i15 = 12;
                        break;
                    case 1:
                        colorScheme6 = (ColorScheme) cVarB.e(descriptor2, 1, ColorScheme$$serializer.INSTANCE, colorScheme6);
                        i17 |= 2;
                        i12 = 9;
                        i13 = 8;
                        i15 = 12;
                        break;
                    case 2:
                        bool2 = (Boolean) cVarB.B(descriptor2, 2, C2330h.f20193a, bool2);
                        i17 |= 4;
                        i12 = 9;
                        i13 = 8;
                        i15 = 12;
                        break;
                    case 3:
                        colorScheme5 = (ColorScheme) cVarB.B(descriptor2, 3, ColorScheme$$serializer.INSTANCE, colorScheme5);
                        i17 |= 8;
                        i12 = 9;
                        i13 = 8;
                        i15 = 12;
                        break;
                    case 4:
                        FontAlias fontAlias2 = (FontAlias) cVarB.B(descriptor2, 4, FontAlias$$serializer.INSTANCE, strM139unboximpl2 != null ? FontAlias.m133boximpl(strM139unboximpl2) : null);
                        strM139unboximpl2 = fontAlias2 != null ? fontAlias2.m139unboximpl() : null;
                        i17 |= 16;
                        i12 = 9;
                        i13 = 8;
                        i15 = 12;
                        break;
                    case 5:
                        c10 = 7;
                        fontWeight3 = (FontWeight) cVarB.e(descriptor2, 5, FontWeightDeserializer.INSTANCE, fontWeight3);
                        i17 |= 32;
                        i12 = 9;
                        i13 = 8;
                        i15 = 12;
                        break;
                    case 6:
                        c10 = 7;
                        num3 = (Integer) cVarB.B(descriptor2, 6, J.f20144a, num3);
                        i17 |= 64;
                        i12 = 9;
                        i13 = 8;
                        i15 = 12;
                        break;
                    case 7:
                        c10 = 7;
                        iIntValue2 = ((Number) cVarB.e(descriptor2, 7, FontSizeSerializer.INSTANCE, Integer.valueOf(iIntValue2))).intValue();
                        i17 |= 128;
                        i12 = 9;
                        i13 = 8;
                        i15 = 12;
                        break;
                    case 8:
                        horizontalAlignment3 = (HorizontalAlignment) cVarB.e(descriptor2, i13, HorizontalAlignmentDeserializer.INSTANCE, horizontalAlignment3);
                        i17 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i15 = 12;
                        break;
                    case 9:
                        size3 = (Size) cVarB.e(descriptor2, i12, Size$$serializer.INSTANCE, size3);
                        i17 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        i15 = 12;
                        break;
                    case 10:
                        padding5 = (Padding) cVarB.e(descriptor2, 10, Padding$$serializer.INSTANCE, padding5);
                        i17 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        i15 = 12;
                        break;
                    case 11:
                        padding4 = (Padding) cVarB.e(descriptor2, 11, Padding$$serializer.INSTANCE, padding4);
                        i17 |= 2048;
                        i15 = 12;
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        list2 = (List) cVarB.e(descriptor2, i15, bVarArr[i15], list2);
                        i17 |= 4096;
                        break;
                    default:
                        throw new m(i18);
                }
            }
            size = size3;
            padding = padding4;
            bool = bool2;
            str = strM349unboximpl2;
            colorScheme = colorScheme5;
            padding2 = padding5;
            i10 = i17;
            fontWeight = fontWeight3;
            colorScheme2 = colorScheme6;
            horizontalAlignment = horizontalAlignment3;
            num = num3;
            list = list2;
            i11 = iIntValue2;
            str2 = strM139unboximpl2;
        }
        cVarB.c(descriptor2);
        return new TextComponent(i10, str, colorScheme2, bool, colorScheme, str2, fontWeight, num, i11, horizontalAlignment, size, padding2, padding, list, null, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, TextComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        TextComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
