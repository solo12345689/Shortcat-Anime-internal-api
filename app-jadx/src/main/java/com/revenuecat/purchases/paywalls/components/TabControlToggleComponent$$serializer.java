package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Rf.m;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2330h;
import Vf.C2337k0;
import Vf.E;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TabControlToggleComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class TabControlToggleComponent$$serializer implements E {
    public static final TabControlToggleComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        TabControlToggleComponent$$serializer tabControlToggleComponent$$serializer = new TabControlToggleComponent$$serializer();
        INSTANCE = tabControlToggleComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("tab_control_toggle", tabControlToggleComponent$$serializer, 5);
        c2337k0.g("default_value", false);
        c2337k0.g("thumb_color_on", false);
        c2337k0.g("thumb_color_off", false);
        c2337k0.g("track_color_on", false);
        c2337k0.g("track_color_off", false);
        descriptor = c2337k0;
    }

    private TabControlToggleComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        return new b[]{C2330h.f20193a, colorScheme$$serializer, colorScheme$$serializer, colorScheme$$serializer, colorScheme$$serializer};
    }

    @Override // Rf.a
    public TabControlToggleComponent deserialize(e decoder) {
        boolean zW;
        int i10;
        ColorScheme colorScheme;
        ColorScheme colorScheme2;
        ColorScheme colorScheme3;
        ColorScheme colorScheme4;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            zW = cVarB.w(descriptor2, 0);
            ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
            ColorScheme colorScheme5 = (ColorScheme) cVarB.e(descriptor2, 1, colorScheme$$serializer, null);
            ColorScheme colorScheme6 = (ColorScheme) cVarB.e(descriptor2, 2, colorScheme$$serializer, null);
            colorScheme3 = (ColorScheme) cVarB.e(descriptor2, 3, colorScheme$$serializer, null);
            colorScheme4 = (ColorScheme) cVarB.e(descriptor2, 4, colorScheme$$serializer, null);
            colorScheme2 = colorScheme6;
            colorScheme = colorScheme5;
            i10 = 31;
        } else {
            boolean z10 = true;
            zW = false;
            ColorScheme colorScheme7 = null;
            ColorScheme colorScheme8 = null;
            ColorScheme colorScheme9 = null;
            ColorScheme colorScheme10 = null;
            int i11 = 0;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    zW = cVarB.w(descriptor2, 0);
                    i11 |= 1;
                } else if (i12 == 1) {
                    colorScheme7 = (ColorScheme) cVarB.e(descriptor2, 1, ColorScheme$$serializer.INSTANCE, colorScheme7);
                    i11 |= 2;
                } else if (i12 == 2) {
                    colorScheme8 = (ColorScheme) cVarB.e(descriptor2, 2, ColorScheme$$serializer.INSTANCE, colorScheme8);
                    i11 |= 4;
                } else if (i12 == 3) {
                    colorScheme9 = (ColorScheme) cVarB.e(descriptor2, 3, ColorScheme$$serializer.INSTANCE, colorScheme9);
                    i11 |= 8;
                } else {
                    if (i12 != 4) {
                        throw new m(i12);
                    }
                    colorScheme10 = (ColorScheme) cVarB.e(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme10);
                    i11 |= 16;
                }
            }
            i10 = i11;
            colorScheme = colorScheme7;
            colorScheme2 = colorScheme8;
            colorScheme3 = colorScheme9;
            colorScheme4 = colorScheme10;
        }
        boolean z11 = zW;
        cVarB.c(descriptor2);
        return new TabControlToggleComponent(i10, z11, colorScheme, colorScheme2, colorScheme3, colorScheme4, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, TabControlToggleComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        TabControlToggleComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
