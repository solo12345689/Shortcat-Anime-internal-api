package com.revenuecat.purchases;

import Td.InterfaceC2154e;
import Vf.C2337k0;
import Vf.E;
import Vf.J;
import Vf.t0;
import Vf.x0;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/UiConfig.AppConfig.FontsConfig.FontInfo.Name.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer implements E {
    public static final UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer uiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer = new UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer();
        INSTANCE = uiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer;
        C2337k0 c2337k0 = new C2337k0("name", uiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer, 6);
        c2337k0.g("value", false);
        c2337k0.g("url", true);
        c2337k0.g("hash", true);
        c2337k0.g("family", true);
        c2337k0.g("weight", true);
        c2337k0.g("style", true);
        descriptor = c2337k0;
    }

    private UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        x0 x0Var = x0.f20253a;
        return new Rf.b[]{x0Var, Sf.a.p(x0Var), Sf.a.p(x0Var), Sf.a.p(x0Var), Sf.a.p(J.f20144a), Sf.a.p(FontStyleDeserializer.INSTANCE)};
    }

    @Override // Rf.a
    public UiConfig.AppConfig.FontsConfig.FontInfo.Name deserialize(Uf.e decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        FontStyle fontStyle;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        Uf.c cVarB = decoder.b(descriptor2);
        String strL = null;
        if (cVarB.p()) {
            String strL2 = cVarB.l(descriptor2, 0);
            x0 x0Var = x0.f20253a;
            String str5 = (String) cVarB.B(descriptor2, 1, x0Var, null);
            String str6 = (String) cVarB.B(descriptor2, 2, x0Var, null);
            String str7 = (String) cVarB.B(descriptor2, 3, x0Var, null);
            Integer num2 = (Integer) cVarB.B(descriptor2, 4, J.f20144a, null);
            str = strL2;
            fontStyle = (FontStyle) cVarB.B(descriptor2, 5, FontStyleDeserializer.INSTANCE, null);
            str4 = str7;
            num = num2;
            str3 = str6;
            str2 = str5;
            i10 = 63;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Integer num3 = null;
            FontStyle fontStyle2 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                switch (i12) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strL = cVarB.l(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        str8 = (String) cVarB.B(descriptor2, 1, x0.f20253a, str8);
                        i11 |= 2;
                        break;
                    case 2:
                        str9 = (String) cVarB.B(descriptor2, 2, x0.f20253a, str9);
                        i11 |= 4;
                        break;
                    case 3:
                        str10 = (String) cVarB.B(descriptor2, 3, x0.f20253a, str10);
                        i11 |= 8;
                        break;
                    case 4:
                        num3 = (Integer) cVarB.B(descriptor2, 4, J.f20144a, num3);
                        i11 |= 16;
                        break;
                    case 5:
                        fontStyle2 = (FontStyle) cVarB.B(descriptor2, 5, FontStyleDeserializer.INSTANCE, fontStyle2);
                        i11 |= 32;
                        break;
                    default:
                        throw new Rf.m(i12);
                }
            }
            i10 = i11;
            str = strL;
            str2 = str8;
            str3 = str9;
            str4 = str10;
            num = num3;
            fontStyle = fontStyle2;
        }
        cVarB.c(descriptor2);
        return new UiConfig.AppConfig.FontsConfig.FontInfo.Name(i10, str, str2, str3, str4, num, fontStyle, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(Uf.f encoder, UiConfig.AppConfig.FontsConfig.FontInfo.Name value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        Uf.d dVarB = encoder.b(descriptor2);
        UiConfig.AppConfig.FontsConfig.FontInfo.Name.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
