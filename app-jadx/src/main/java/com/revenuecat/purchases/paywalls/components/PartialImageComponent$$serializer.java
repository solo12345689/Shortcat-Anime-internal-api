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
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialImageComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PartialImageComponent$$serializer implements E {
    public static final PartialImageComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PartialImageComponent$$serializer partialImageComponent$$serializer = new PartialImageComponent$$serializer();
        INSTANCE = partialImageComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.PartialImageComponent", partialImageComponent$$serializer, 11);
        c2337k0.g("visible", true);
        c2337k0.g("source", true);
        c2337k0.g("size", true);
        c2337k0.g("override_source_lid", true);
        c2337k0.g("fit_mode", true);
        c2337k0.g("mask_shape", true);
        c2337k0.g("color_overlay", true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        c2337k0.g("border", true);
        c2337k0.g("shadow", true);
        descriptor = c2337k0;
    }

    private PartialImageComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b bVarP = a.p(C2330h.f20193a);
        b bVarP2 = a.p(ThemeImageUrls$$serializer.INSTANCE);
        b bVarP3 = a.p(Size$$serializer.INSTANCE);
        b bVarP4 = a.p(LocalizationKey$$serializer.INSTANCE);
        b bVarP5 = a.p(FitModeDeserializer.INSTANCE);
        b bVarP6 = a.p(MaskShapeDeserializer.INSTANCE);
        b bVarP7 = a.p(ColorScheme$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVarP, bVarP2, bVarP3, bVarP4, bVarP5, bVarP6, bVarP7, a.p(padding$$serializer), a.p(padding$$serializer), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE)};
    }

    @Override // Rf.a
    public PartialImageComponent deserialize(e decoder) {
        Boolean bool;
        FitMode fitMode;
        ThemeImageUrls themeImageUrls;
        Size size;
        Padding padding;
        int i10;
        MaskShape maskShape;
        ColorScheme colorScheme;
        Padding padding2;
        Border border;
        Shadow shadow;
        String str;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 10;
        int i12 = 9;
        int i13 = 7;
        int i14 = 6;
        Border border2 = null;
        if (cVarB.p()) {
            bool = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, null);
            ThemeImageUrls themeImageUrls2 = (ThemeImageUrls) cVarB.B(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, null);
            Size size2 = (Size) cVarB.B(descriptor2, 2, Size$$serializer.INSTANCE, null);
            LocalizationKey localizationKey = (LocalizationKey) cVarB.B(descriptor2, 3, LocalizationKey$$serializer.INSTANCE, null);
            String strM349unboximpl = localizationKey != null ? localizationKey.m349unboximpl() : null;
            FitMode fitMode2 = (FitMode) cVarB.B(descriptor2, 4, FitModeDeserializer.INSTANCE, null);
            MaskShape maskShape2 = (MaskShape) cVarB.B(descriptor2, 5, MaskShapeDeserializer.INSTANCE, null);
            ColorScheme colorScheme2 = (ColorScheme) cVarB.B(descriptor2, 6, ColorScheme$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.B(descriptor2, 7, padding$$serializer, null);
            Padding padding4 = (Padding) cVarB.B(descriptor2, 8, padding$$serializer, null);
            Border border3 = (Border) cVarB.B(descriptor2, 9, Border$$serializer.INSTANCE, null);
            shadow = (Shadow) cVarB.B(descriptor2, 10, Shadow$$serializer.INSTANCE, null);
            border = border3;
            padding2 = padding3;
            colorScheme = colorScheme2;
            maskShape = maskShape2;
            str = strM349unboximpl;
            padding = padding4;
            fitMode = fitMode2;
            size = size2;
            themeImageUrls = themeImageUrls2;
            i10 = 2047;
        } else {
            boolean z10 = true;
            int i15 = 0;
            bool = null;
            Padding padding5 = null;
            MaskShape maskShape3 = null;
            ColorScheme colorScheme3 = null;
            Padding padding6 = null;
            Shadow shadow2 = null;
            String strM349unboximpl2 = null;
            FitMode fitMode3 = null;
            Size size3 = null;
            ThemeImageUrls themeImageUrls3 = null;
            while (z10) {
                int i16 = cVarB.i(descriptor2);
                switch (i16) {
                    case -1:
                        z10 = false;
                        i11 = 10;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 0:
                        bool = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, bool);
                        i15 |= 1;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 1:
                        themeImageUrls3 = (ThemeImageUrls) cVarB.B(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls3);
                        i15 |= 2;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 2:
                        size3 = (Size) cVarB.B(descriptor2, 2, Size$$serializer.INSTANCE, size3);
                        i15 |= 4;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        break;
                    case 3:
                        FitMode fitMode4 = fitMode3;
                        LocalizationKey localizationKey2 = (LocalizationKey) cVarB.B(descriptor2, 3, LocalizationKey$$serializer.INSTANCE, strM349unboximpl2 != null ? LocalizationKey.m343boximpl(strM349unboximpl2) : null);
                        strM349unboximpl2 = localizationKey2 != null ? localizationKey2.m349unboximpl() : null;
                        i15 |= 8;
                        fitMode3 = fitMode4;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        break;
                    case 4:
                        i15 |= 16;
                        fitMode3 = (FitMode) cVarB.B(descriptor2, 4, FitModeDeserializer.INSTANCE, fitMode3);
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 5:
                        maskShape3 = (MaskShape) cVarB.B(descriptor2, 5, MaskShapeDeserializer.INSTANCE, maskShape3);
                        i15 |= 32;
                        i11 = 10;
                        break;
                    case 6:
                        colorScheme3 = (ColorScheme) cVarB.B(descriptor2, i14, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i15 |= 64;
                        break;
                    case 7:
                        padding6 = (Padding) cVarB.B(descriptor2, i13, Padding$$serializer.INSTANCE, padding6);
                        i15 |= 128;
                        break;
                    case 8:
                        padding5 = (Padding) cVarB.B(descriptor2, 8, Padding$$serializer.INSTANCE, padding5);
                        i15 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        border2 = (Border) cVarB.B(descriptor2, i12, Border$$serializer.INSTANCE, border2);
                        i15 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        shadow2 = (Shadow) cVarB.B(descriptor2, i11, Shadow$$serializer.INSTANCE, shadow2);
                        i15 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    default:
                        throw new m(i16);
                }
            }
            fitMode = fitMode3;
            themeImageUrls = themeImageUrls3;
            size = size3;
            padding = padding5;
            i10 = i15;
            maskShape = maskShape3;
            colorScheme = colorScheme3;
            padding2 = padding6;
            border = border2;
            shadow = shadow2;
            str = strM349unboximpl2;
        }
        Boolean bool2 = bool;
        cVarB.c(descriptor2);
        return new PartialImageComponent(i10, bool2, themeImageUrls, size, str, fitMode, maskShape, colorScheme, padding2, padding, border, shadow, null, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PartialImageComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PartialImageComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
