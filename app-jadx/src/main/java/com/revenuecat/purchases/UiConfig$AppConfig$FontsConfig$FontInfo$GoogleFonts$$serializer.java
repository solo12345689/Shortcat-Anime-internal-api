package com.revenuecat.purchases;

import Td.InterfaceC2154e;
import Vf.C2337k0;
import Vf.E;
import Vf.t0;
import Vf.x0;
import com.revenuecat.purchases.UiConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer implements E {
    public static final UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer uiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer = new UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer();
        INSTANCE = uiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer;
        C2337k0 c2337k0 = new C2337k0("google_fonts", uiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer, 1);
        c2337k0.g("value", false);
        descriptor = c2337k0;
    }

    private UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        return new Rf.b[]{x0.f20253a};
    }

    @Override // Rf.a
    public UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts deserialize(Uf.e decoder) {
        String strL;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        Uf.c cVarB = decoder.b(descriptor2);
        int i10 = 1;
        t0 t0Var = null;
        if (cVarB.p()) {
            strL = cVarB.l(descriptor2, 0);
        } else {
            boolean z10 = true;
            int i11 = 0;
            strL = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else {
                    if (i12 != 0) {
                        throw new Rf.m(i12);
                    }
                    strL = cVarB.l(descriptor2, 0);
                    i11 = 1;
                }
            }
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts(i10, strL, t0Var);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(Uf.f encoder, UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        Uf.d dVarB = encoder.b(descriptor2);
        dVarB.k(descriptor2, 0, value.value);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
