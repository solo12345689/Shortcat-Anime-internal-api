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
import com.revenuecat.purchases.common.verification.SigningManager;
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
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/VideoComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/VideoComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/VideoComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/VideoComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class VideoComponent$$serializer implements E {
    public static final VideoComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        VideoComponent$$serializer videoComponent$$serializer = new VideoComponent$$serializer();
        INSTANCE = videoComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("video", videoComponent$$serializer, 17);
        c2337k0.g("source", false);
        c2337k0.g("fallback_source", false);
        c2337k0.g("visible", false);
        c2337k0.g("show_controls", false);
        c2337k0.g("auto_play", false);
        c2337k0.g("loop", false);
        c2337k0.g("mute_audio", false);
        c2337k0.g("size", false);
        c2337k0.g("fit_mode", false);
        c2337k0.g("mask_shape", false);
        c2337k0.g("color_overlay", false);
        c2337k0.g("padding", false);
        c2337k0.g("margin", false);
        c2337k0.g("border", false);
        c2337k0.g("shadow", false);
        c2337k0.g("overrides", false);
        c2337k0.g("override_source_lid", true);
        descriptor = c2337k0;
    }

    private VideoComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = VideoComponent.$childSerializers;
        b bVarP = a.p(ThemeImageUrls$$serializer.INSTANCE);
        C2330h c2330h = C2330h.f20193a;
        b bVarP2 = a.p(c2330h);
        b bVarP3 = a.p(MaskShapeDeserializer.INSTANCE);
        b bVarP4 = a.p(ColorScheme$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{ThemeVideoUrls$$serializer.INSTANCE, bVarP, bVarP2, c2330h, c2330h, c2330h, c2330h, Size$$serializer.INSTANCE, FitModeDeserializer.INSTANCE, bVarP3, bVarP4, a.p(padding$$serializer), a.p(padding$$serializer), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE), a.p(bVarArr[15]), a.p(LocalizationKey$$serializer.INSTANCE)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Rf.a
    public VideoComponent deserialize(e decoder) {
        Padding padding;
        List list;
        Shadow shadow;
        Border border;
        Padding padding2;
        Boolean bool;
        ThemeImageUrls themeImageUrls;
        FitMode fitMode;
        Size size;
        ColorScheme colorScheme;
        MaskShape maskShape;
        ThemeVideoUrls themeVideoUrls;
        int i10;
        boolean z10;
        String strM349unboximpl;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = VideoComponent.$childSerializers;
        int i11 = 10;
        char c11 = '\t';
        char c12 = '\b';
        if (cVarB.p()) {
            ThemeVideoUrls themeVideoUrls2 = (ThemeVideoUrls) cVarB.e(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, null);
            ThemeImageUrls themeImageUrls2 = (ThemeImageUrls) cVarB.B(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, null);
            Boolean bool2 = (Boolean) cVarB.B(descriptor2, 2, C2330h.f20193a, null);
            boolean zW = cVarB.w(descriptor2, 3);
            boolean zW2 = cVarB.w(descriptor2, 4);
            boolean zW3 = cVarB.w(descriptor2, 5);
            boolean zW4 = cVarB.w(descriptor2, 6);
            Size size2 = (Size) cVarB.e(descriptor2, 7, Size$$serializer.INSTANCE, null);
            FitMode fitMode2 = (FitMode) cVarB.e(descriptor2, 8, FitModeDeserializer.INSTANCE, null);
            MaskShape maskShape2 = (MaskShape) cVarB.B(descriptor2, 9, MaskShapeDeserializer.INSTANCE, null);
            ColorScheme colorScheme2 = (ColorScheme) cVarB.B(descriptor2, 10, ColorScheme$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.B(descriptor2, 11, padding$$serializer, null);
            Padding padding4 = (Padding) cVarB.B(descriptor2, 12, padding$$serializer, null);
            Border border2 = (Border) cVarB.B(descriptor2, 13, Border$$serializer.INSTANCE, null);
            Shadow shadow2 = (Shadow) cVarB.B(descriptor2, 14, Shadow$$serializer.INSTANCE, null);
            List list2 = (List) cVarB.B(descriptor2, 15, bVarArr[15], null);
            LocalizationKey localizationKey = (LocalizationKey) cVarB.B(descriptor2, 16, LocalizationKey$$serializer.INSTANCE, null);
            i10 = 131071;
            themeVideoUrls = themeVideoUrls2;
            bool = bool2;
            themeImageUrls = themeImageUrls2;
            z10 = zW;
            strM349unboximpl = localizationKey != null ? localizationKey.m349unboximpl() : null;
            colorScheme = colorScheme2;
            maskShape = maskShape2;
            size = size2;
            z11 = zW4;
            z12 = zW3;
            z13 = zW2;
            fitMode = fitMode2;
            shadow = shadow2;
            border = border2;
            list = list2;
            padding2 = padding4;
            padding = padding3;
        } else {
            boolean z14 = true;
            int i12 = 0;
            boolean zW5 = false;
            boolean zW6 = false;
            boolean zW7 = false;
            boolean zW8 = false;
            Padding padding5 = null;
            List list3 = null;
            Shadow shadow3 = null;
            Border border3 = null;
            FitMode fitMode3 = null;
            Size size3 = null;
            ColorScheme colorScheme3 = null;
            MaskShape maskShape3 = null;
            ThemeVideoUrls themeVideoUrls3 = null;
            Boolean bool3 = null;
            ThemeImageUrls themeImageUrls3 = null;
            String strM349unboximpl2 = null;
            while (z14) {
                int i13 = cVarB.i(descriptor2);
                switch (i13) {
                    case -1:
                        z14 = false;
                        i12 = i12;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 0:
                        themeVideoUrls3 = (ThemeVideoUrls) cVarB.e(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, themeVideoUrls3);
                        i12 |= 1;
                        i11 = 10;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 1:
                        themeImageUrls3 = (ThemeImageUrls) cVarB.B(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls3);
                        i12 |= 2;
                        i11 = 10;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 2:
                        bool3 = (Boolean) cVarB.B(descriptor2, 2, C2330h.f20193a, bool3);
                        i12 |= 4;
                        i11 = 10;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 3:
                        zW5 = cVarB.w(descriptor2, 3);
                        i12 |= 8;
                        i11 = 10;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 4:
                        zW8 = cVarB.w(descriptor2, 4);
                        i12 |= 16;
                        i11 = 10;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 5:
                        zW7 = cVarB.w(descriptor2, 5);
                        i12 |= 32;
                        i11 = 10;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 6:
                        c10 = 7;
                        zW6 = cVarB.w(descriptor2, 6);
                        i12 |= 64;
                        i11 = 10;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 7:
                        c10 = 7;
                        size3 = (Size) cVarB.e(descriptor2, 7, Size$$serializer.INSTANCE, size3);
                        i12 |= 128;
                        i11 = 10;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 8:
                        fitMode3 = (FitMode) cVarB.e(descriptor2, 8, FitModeDeserializer.INSTANCE, fitMode3);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        c12 = '\b';
                        i11 = 10;
                        c11 = '\t';
                        break;
                    case 9:
                        maskShape3 = (MaskShape) cVarB.B(descriptor2, 9, MaskShapeDeserializer.INSTANCE, maskShape3);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        c11 = '\t';
                        i11 = 10;
                        c12 = '\b';
                        break;
                    case 10:
                        colorScheme3 = (ColorScheme) cVarB.B(descriptor2, i11, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 11:
                        padding5 = (Padding) cVarB.B(descriptor2, 11, Padding$$serializer.INSTANCE, padding5);
                        i12 |= 2048;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        obj = (Padding) cVarB.B(descriptor2, 12, Padding$$serializer.INSTANCE, obj);
                        i12 |= 4096;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 13:
                        border3 = (Border) cVarB.B(descriptor2, 13, Border$$serializer.INSTANCE, border3);
                        i12 |= 8192;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 14:
                        shadow3 = (Shadow) cVarB.B(descriptor2, 14, Shadow$$serializer.INSTANCE, shadow3);
                        i12 |= 16384;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 15:
                        list3 = (List) cVarB.B(descriptor2, 15, bVarArr[15], list3);
                        i12 |= 32768;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    case 16:
                        LocalizationKey localizationKey2 = (LocalizationKey) cVarB.B(descriptor2, 16, LocalizationKey$$serializer.INSTANCE, strM349unboximpl2 != null ? LocalizationKey.m343boximpl(strM349unboximpl2) : null);
                        strM349unboximpl2 = localizationKey2 != null ? localizationKey2.m349unboximpl() : null;
                        i12 |= 65536;
                        c11 = '\t';
                        c12 = '\b';
                        break;
                    default:
                        throw new m(i13);
                }
            }
            padding = padding5;
            list = list3;
            shadow = shadow3;
            border = border3;
            padding2 = obj;
            bool = bool3;
            themeImageUrls = themeImageUrls3;
            fitMode = fitMode3;
            size = size3;
            colorScheme = colorScheme3;
            maskShape = maskShape3;
            themeVideoUrls = themeVideoUrls3;
            i10 = i12;
            z10 = zW5;
            strM349unboximpl = strM349unboximpl2;
            z11 = zW6;
            z12 = zW7;
            z13 = zW8;
        }
        cVarB.c(descriptor2);
        return new VideoComponent(i10, themeVideoUrls, themeImageUrls, bool, z10, z13, z12, z11, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, list, strM349unboximpl, null, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, VideoComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        VideoComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
