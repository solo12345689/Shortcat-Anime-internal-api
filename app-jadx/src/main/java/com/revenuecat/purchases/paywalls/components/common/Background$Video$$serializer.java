package com.revenuecat.purchases.paywalls.components.common;

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
import Vf.t0;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/Background.Video.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class Background$Video$$serializer implements E {
    public static final Background$Video$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        Background$Video$$serializer background$Video$$serializer = new Background$Video$$serializer();
        INSTANCE = background$Video$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.common.Background.Video", background$Video$$serializer, 6);
        c2337k0.g("value", false);
        c2337k0.g("fallback_image", false);
        c2337k0.g("loop", false);
        c2337k0.g("mute_audio", false);
        c2337k0.g("fit_mode", true);
        c2337k0.g("color_overlay", true);
        descriptor = c2337k0;
    }

    private Background$Video$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b bVarP = a.p(ColorScheme$$serializer.INSTANCE);
        C2330h c2330h = C2330h.f20193a;
        return new b[]{ThemeVideoUrls$$serializer.INSTANCE, ThemeImageUrls$$serializer.INSTANCE, c2330h, c2330h, FitModeDeserializer.INSTANCE, bVarP};
    }

    @Override // Rf.a
    public Background.Video deserialize(e decoder) {
        boolean z10;
        boolean z11;
        int i10;
        ThemeVideoUrls themeVideoUrls;
        ThemeImageUrls themeImageUrls;
        FitMode fitMode;
        ColorScheme colorScheme;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 5;
        if (cVarB.p()) {
            ThemeVideoUrls themeVideoUrls2 = (ThemeVideoUrls) cVarB.e(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, null);
            ThemeImageUrls themeImageUrls2 = (ThemeImageUrls) cVarB.e(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, null);
            boolean zW = cVarB.w(descriptor2, 2);
            boolean zW2 = cVarB.w(descriptor2, 3);
            FitMode fitMode2 = (FitMode) cVarB.e(descriptor2, 4, FitModeDeserializer.INSTANCE, null);
            themeVideoUrls = themeVideoUrls2;
            colorScheme = (ColorScheme) cVarB.B(descriptor2, 5, ColorScheme$$serializer.INSTANCE, null);
            z10 = zW2;
            fitMode = fitMode2;
            z11 = zW;
            themeImageUrls = themeImageUrls2;
            i10 = 63;
        } else {
            boolean z12 = true;
            boolean zW3 = false;
            int i12 = 0;
            ThemeVideoUrls themeVideoUrls3 = null;
            ThemeImageUrls themeImageUrls3 = null;
            FitMode fitMode3 = null;
            ColorScheme colorScheme2 = null;
            boolean zW4 = false;
            while (z12) {
                int i13 = cVarB.i(descriptor2);
                switch (i13) {
                    case -1:
                        z12 = false;
                        i11 = 5;
                        break;
                    case 0:
                        themeVideoUrls3 = (ThemeVideoUrls) cVarB.e(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, themeVideoUrls3);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        themeImageUrls3 = (ThemeImageUrls) cVarB.e(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls3);
                        i12 |= 2;
                        break;
                    case 2:
                        zW4 = cVarB.w(descriptor2, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        zW3 = cVarB.w(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        fitMode3 = (FitMode) cVarB.e(descriptor2, 4, FitModeDeserializer.INSTANCE, fitMode3);
                        i12 |= 16;
                        break;
                    case 5:
                        colorScheme2 = (ColorScheme) cVarB.B(descriptor2, i11, ColorScheme$$serializer.INSTANCE, colorScheme2);
                        i12 |= 32;
                        break;
                    default:
                        throw new m(i13);
                }
            }
            z10 = zW3;
            z11 = zW4;
            i10 = i12;
            themeVideoUrls = themeVideoUrls3;
            themeImageUrls = themeImageUrls3;
            fitMode = fitMode3;
            colorScheme = colorScheme2;
        }
        cVarB.c(descriptor2);
        return new Background.Video(i10, themeVideoUrls, themeImageUrls, z11, z10, fitMode, colorScheme, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, Background.Video value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        Background.Video.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
