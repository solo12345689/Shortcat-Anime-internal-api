package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Rf.m;
import Sf.a;
import Td.D;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.E;
import Vf.H0;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/CarouselComponent.PageControl.Indicator.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl$Indicator;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CarouselComponent$PageControl$Indicator$$serializer implements E {
    public static final CarouselComponent$PageControl$Indicator$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = new CarouselComponent$PageControl$Indicator$$serializer();
        INSTANCE = carouselComponent$PageControl$Indicator$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Indicator", carouselComponent$PageControl$Indicator$$serializer, 5);
        c2337k0.g("width", false);
        c2337k0.g("height", false);
        c2337k0.g("color", false);
        c2337k0.g("stroke_color", true);
        c2337k0.g("stroke_width", true);
        descriptor = c2337k0;
    }

    private CarouselComponent$PageControl$Indicator$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        H0 h02 = H0.f20139a;
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        return new b[]{h02, h02, colorScheme$$serializer, a.p(colorScheme$$serializer), a.p(h02)};
    }

    @Override // Rf.a
    public CarouselComponent.PageControl.Indicator deserialize(e decoder) {
        int i10;
        D d10;
        D d11;
        ColorScheme colorScheme;
        ColorScheme colorScheme2;
        D d12;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        D d13 = null;
        if (cVarB.p()) {
            H0 h02 = H0.f20139a;
            D d14 = (D) cVarB.e(descriptor2, 0, h02, null);
            D d15 = (D) cVarB.e(descriptor2, 1, h02, null);
            ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
            ColorScheme colorScheme3 = (ColorScheme) cVarB.e(descriptor2, 2, colorScheme$$serializer, null);
            ColorScheme colorScheme4 = (ColorScheme) cVarB.B(descriptor2, 3, colorScheme$$serializer, null);
            d12 = (D) cVarB.B(descriptor2, 4, h02, null);
            colorScheme2 = colorScheme4;
            i10 = 31;
            colorScheme = colorScheme3;
            d11 = d15;
            d10 = d14;
        } else {
            boolean z10 = true;
            int i11 = 0;
            D d16 = null;
            ColorScheme colorScheme5 = null;
            ColorScheme colorScheme6 = null;
            D d17 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    d13 = (D) cVarB.e(descriptor2, 0, H0.f20139a, d13);
                    i11 |= 1;
                } else if (i12 == 1) {
                    d16 = (D) cVarB.e(descriptor2, 1, H0.f20139a, d16);
                    i11 |= 2;
                } else if (i12 == 2) {
                    colorScheme5 = (ColorScheme) cVarB.e(descriptor2, 2, ColorScheme$$serializer.INSTANCE, colorScheme5);
                    i11 |= 4;
                } else if (i12 == 3) {
                    colorScheme6 = (ColorScheme) cVarB.B(descriptor2, 3, ColorScheme$$serializer.INSTANCE, colorScheme6);
                    i11 |= 8;
                } else {
                    if (i12 != 4) {
                        throw new m(i12);
                    }
                    d17 = (D) cVarB.B(descriptor2, 4, H0.f20139a, d17);
                    i11 |= 16;
                }
            }
            i10 = i11;
            d10 = d13;
            d11 = d16;
            colorScheme = colorScheme5;
            colorScheme2 = colorScheme6;
            d12 = d17;
        }
        cVarB.c(descriptor2);
        return new CarouselComponent.PageControl.Indicator(i10, d10, d11, colorScheme, colorScheme2, d12, null, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CarouselComponent.PageControl.Indicator value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CarouselComponent.PageControl.Indicator.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
