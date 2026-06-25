package com.revenuecat.purchases.paywalls.components.common;

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
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/PaywallComponentsData.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PaywallComponentsData$$serializer implements E {
    public static final PaywallComponentsData$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PaywallComponentsData$$serializer paywallComponentsData$$serializer = new PaywallComponentsData$$serializer();
        INSTANCE = paywallComponentsData$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData", paywallComponentsData$$serializer, 10);
        c2337k0.g(DiagnosticsEntry.ID_KEY, true);
        c2337k0.g("template_name", false);
        c2337k0.g("asset_base_url", false);
        c2337k0.g("components_config", false);
        c2337k0.g("components_localizations", false);
        c2337k0.g("default_locale", false);
        c2337k0.g("revision", true);
        c2337k0.g("zero_decimal_place_countries", true);
        c2337k0.g("exit_offers", true);
        c2337k0.g("play_store_product_change_mode", true);
        descriptor = c2337k0;
    }

    private PaywallComponentsData$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = PaywallComponentsData.$childSerializers;
        x0 x0Var = x0.f20253a;
        return new b[]{a.p(x0Var), x0Var, URLSerializer.INSTANCE, ComponentsConfig$$serializer.INSTANCE, bVarArr[4], LocaleId$$serializer.INSTANCE, J.f20144a, GoogleListSerializer.INSTANCE, a.p(ExitOffers$$serializer.INSTANCE), a.p(ProductChangeConfigSerializer.INSTANCE)};
    }

    @Override // Rf.a
    public PaywallComponentsData deserialize(e decoder) {
        Map map;
        URL url;
        int i10;
        ExitOffers exitOffers;
        ComponentsConfig componentsConfig;
        List list;
        ProductChangeConfig productChangeConfig;
        String str;
        int i11;
        String str2;
        String str3;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = PaywallComponentsData.$childSerializers;
        int i12 = 9;
        int i13 = 7;
        int i14 = 6;
        int i15 = 4;
        ProductChangeConfig productChangeConfig2 = null;
        if (cVarB.p()) {
            String str4 = (String) cVarB.B(descriptor2, 0, x0.f20253a, null);
            String strL = cVarB.l(descriptor2, 1);
            URL url2 = (URL) cVarB.e(descriptor2, 2, URLSerializer.INSTANCE, null);
            ComponentsConfig componentsConfig2 = (ComponentsConfig) cVarB.e(descriptor2, 3, ComponentsConfig$$serializer.INSTANCE, null);
            Map map2 = (Map) cVarB.e(descriptor2, 4, bVarArr[4], null);
            LocaleId localeId = (LocaleId) cVarB.e(descriptor2, 5, LocaleId$$serializer.INSTANCE, null);
            String strM313unboximpl = localeId != null ? localeId.m313unboximpl() : null;
            int iM = cVarB.m(descriptor2, 6);
            List list2 = (List) cVarB.e(descriptor2, 7, GoogleListSerializer.INSTANCE, null);
            ExitOffers exitOffers2 = (ExitOffers) cVarB.B(descriptor2, 8, ExitOffers$$serializer.INSTANCE, null);
            map = map2;
            str = str4;
            productChangeConfig = (ProductChangeConfig) cVarB.B(descriptor2, 9, ProductChangeConfigSerializer.INSTANCE, null);
            list = list2;
            i11 = iM;
            str2 = strM313unboximpl;
            componentsConfig = componentsConfig2;
            exitOffers = exitOffers2;
            url = url2;
            i10 = 1023;
            str3 = strL;
        } else {
            boolean z10 = true;
            int i16 = 0;
            int iM2 = 0;
            Map map3 = null;
            ExitOffers exitOffers3 = null;
            ComponentsConfig componentsConfig3 = null;
            List list3 = null;
            String str5 = null;
            String strM313unboximpl2 = null;
            URL url3 = null;
            String strL2 = null;
            while (z10) {
                int i17 = i15;
                int i18 = cVarB.i(descriptor2);
                switch (i18) {
                    case -1:
                        i15 = i17;
                        z10 = false;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 0:
                        i15 = i17;
                        str5 = (String) cVarB.B(descriptor2, 0, x0.f20253a, str5);
                        i16 |= 1;
                        i12 = 9;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 1:
                        i15 = i17;
                        strL2 = cVarB.l(descriptor2, 1);
                        i16 |= 2;
                        i12 = 9;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 2:
                        i15 = i17;
                        url3 = (URL) cVarB.e(descriptor2, 2, URLSerializer.INSTANCE, url3);
                        i16 |= 4;
                        i12 = 9;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 3:
                        i15 = i17;
                        componentsConfig3 = (ComponentsConfig) cVarB.e(descriptor2, 3, ComponentsConfig$$serializer.INSTANCE, componentsConfig3);
                        i16 |= 8;
                        i12 = 9;
                        i13 = 7;
                        break;
                    case 4:
                        i15 = i17;
                        map3 = (Map) cVarB.e(descriptor2, i15, bVarArr[i17], map3);
                        i16 |= 16;
                        i12 = 9;
                        break;
                    case 5:
                        LocaleId localeId2 = (LocaleId) cVarB.e(descriptor2, 5, LocaleId$$serializer.INSTANCE, strM313unboximpl2 != null ? LocaleId.m307boximpl(strM313unboximpl2) : null);
                        strM313unboximpl2 = localeId2 != null ? localeId2.m313unboximpl() : null;
                        i16 |= 32;
                        i15 = i17;
                        i12 = 9;
                        break;
                    case 6:
                        iM2 = cVarB.m(descriptor2, i14);
                        i16 |= 64;
                        i15 = i17;
                        break;
                    case 7:
                        list3 = (List) cVarB.e(descriptor2, i13, GoogleListSerializer.INSTANCE, list3);
                        i16 |= 128;
                        i15 = i17;
                        break;
                    case 8:
                        exitOffers3 = (ExitOffers) cVarB.B(descriptor2, 8, ExitOffers$$serializer.INSTANCE, exitOffers3);
                        i16 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i15 = i17;
                        break;
                    case 9:
                        productChangeConfig2 = (ProductChangeConfig) cVarB.B(descriptor2, i12, ProductChangeConfigSerializer.INSTANCE, productChangeConfig2);
                        i16 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        i15 = i17;
                        break;
                    default:
                        throw new m(i18);
                }
            }
            map = map3;
            url = url3;
            i10 = i16;
            exitOffers = exitOffers3;
            componentsConfig = componentsConfig3;
            list = list3;
            productChangeConfig = productChangeConfig2;
            str = str5;
            i11 = iM2;
            str2 = strM313unboximpl2;
            str3 = strL2;
        }
        cVarB.c(descriptor2);
        return new PaywallComponentsData(i10, str, str3, url, componentsConfig, map, str2, i11, list, exitOffers, productChangeConfig, null, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PaywallComponentsData value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallComponentsData.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
