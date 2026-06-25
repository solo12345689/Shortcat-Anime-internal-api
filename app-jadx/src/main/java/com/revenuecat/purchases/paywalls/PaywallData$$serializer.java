package com.revenuecat.purchases.paywalls;

import Rf.b;
import Rf.m;
import Sf.a;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.E;
import Vf.J;
import Vf.t0;
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PaywallData$$serializer implements E {
    public static final PaywallData$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PaywallData$$serializer paywallData$$serializer = new PaywallData$$serializer();
        INSTANCE = paywallData$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.PaywallData", paywallData$$serializer, 9);
        c2337k0.g(DiagnosticsEntry.ID_KEY, true);
        c2337k0.g("template_name", false);
        c2337k0.g("config", false);
        c2337k0.g("asset_base_url", false);
        c2337k0.g("revision", true);
        c2337k0.g("localized_strings", false);
        c2337k0.g("localized_strings_by_tier", true);
        c2337k0.g("zero_decimal_place_countries", true);
        c2337k0.g("default_locale", true);
        descriptor = c2337k0;
    }

    private PaywallData$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = PaywallData.$childSerializers;
        x0 x0Var = x0.f20253a;
        return new b[]{a.p(x0Var), x0Var, PaywallData$Configuration$$serializer.INSTANCE, URLSerializer.INSTANCE, J.f20144a, bVarArr[5], bVarArr[6], GoogleListSerializer.INSTANCE, a.p(x0Var)};
    }

    @Override // Rf.a
    public PaywallData deserialize(e decoder) {
        int i10;
        Map map;
        List list;
        Map map2;
        String str;
        URL url;
        PaywallData.Configuration configuration;
        int i11;
        String str2;
        String str3;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = PaywallData.$childSerializers;
        int i12 = 7;
        int i13 = 8;
        int i14 = 6;
        if (cVarB.p()) {
            x0 x0Var = x0.f20253a;
            String str4 = (String) cVarB.B(descriptor2, 0, x0Var, null);
            String strL = cVarB.l(descriptor2, 1);
            PaywallData.Configuration configuration2 = (PaywallData.Configuration) cVarB.e(descriptor2, 2, PaywallData$Configuration$$serializer.INSTANCE, null);
            URL url2 = (URL) cVarB.e(descriptor2, 3, URLSerializer.INSTANCE, null);
            int iM = cVarB.m(descriptor2, 4);
            Map map3 = (Map) cVarB.e(descriptor2, 5, bVarArr[5], null);
            Map map4 = (Map) cVarB.e(descriptor2, 6, bVarArr[6], null);
            List list2 = (List) cVarB.e(descriptor2, 7, GoogleListSerializer.INSTANCE, null);
            map = map4;
            str = (String) cVarB.B(descriptor2, 8, x0Var, null);
            list = list2;
            url = url2;
            i10 = 511;
            i11 = iM;
            configuration = configuration2;
            map2 = map3;
            str3 = strL;
            str2 = str4;
        } else {
            int i15 = 5;
            boolean z10 = true;
            int i16 = 0;
            Map map5 = null;
            List list3 = null;
            Map map6 = null;
            String str5 = null;
            URL url3 = null;
            String str6 = null;
            String strL2 = null;
            int iM2 = 0;
            PaywallData.Configuration configuration3 = null;
            while (z10) {
                int i17 = i14;
                int i18 = cVarB.i(descriptor2);
                switch (i18) {
                    case -1:
                        z10 = false;
                        i13 = 8;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 0:
                        str6 = (String) cVarB.B(descriptor2, 0, x0.f20253a, str6);
                        i16 |= 1;
                        i12 = 7;
                        i13 = 8;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 1:
                        strL2 = cVarB.l(descriptor2, 1);
                        i16 |= 2;
                        i12 = 7;
                        i13 = 8;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 2:
                        configuration3 = (PaywallData.Configuration) cVarB.e(descriptor2, 2, PaywallData$Configuration$$serializer.INSTANCE, configuration3);
                        i16 |= 4;
                        i12 = 7;
                        i13 = 8;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 3:
                        url3 = (URL) cVarB.e(descriptor2, 3, URLSerializer.INSTANCE, url3);
                        i16 |= 8;
                        i12 = 7;
                        i13 = 8;
                        i14 = 6;
                        i15 = 5;
                        break;
                    case 4:
                        iM2 = cVarB.m(descriptor2, 4);
                        i16 |= 16;
                        i12 = 7;
                        i14 = 6;
                        break;
                    case 5:
                        map6 = (Map) cVarB.e(descriptor2, i15, bVarArr[i15], map6);
                        i16 |= 32;
                        i12 = 7;
                        i14 = 6;
                        break;
                    case 6:
                        map5 = (Map) cVarB.e(descriptor2, i17, bVarArr[i17], map5);
                        i16 |= 64;
                        i14 = i17;
                        i12 = 7;
                        break;
                    case 7:
                        list3 = (List) cVarB.e(descriptor2, i12, GoogleListSerializer.INSTANCE, list3);
                        i16 |= 128;
                        i14 = i17;
                        break;
                    case 8:
                        str5 = (String) cVarB.B(descriptor2, i13, x0.f20253a, str5);
                        i16 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i14 = i17;
                        break;
                    default:
                        throw new m(i18);
                }
            }
            i10 = i16;
            map = map5;
            list = list3;
            map2 = map6;
            str = str5;
            url = url3;
            configuration = configuration3;
            i11 = iM2;
            str2 = str6;
            str3 = strL2;
        }
        cVarB.c(descriptor2);
        return new PaywallData(i10, str2, str3, configuration, url, i11, map2, map, list, str, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PaywallData value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
