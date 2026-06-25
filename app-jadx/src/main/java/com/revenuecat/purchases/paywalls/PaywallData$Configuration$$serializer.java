package com.revenuecat.purchases.paywalls;

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
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PaywallData$Configuration$$serializer implements E {
    public static final PaywallData$Configuration$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PaywallData$Configuration$$serializer paywallData$Configuration$$serializer = new PaywallData$Configuration$$serializer();
        INSTANCE = paywallData$Configuration$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.PaywallData.Configuration", paywallData$Configuration$$serializer, 13);
        c2337k0.g("packages", true);
        c2337k0.g("default_package", true);
        c2337k0.g("images_webp", true);
        c2337k0.g("images", true);
        c2337k0.g("images_by_tier", true);
        c2337k0.g("blurred_background_image", true);
        c2337k0.g("display_restore_purchases", true);
        c2337k0.g("tos_url", true);
        c2337k0.g("privacy_url", true);
        c2337k0.g("colors", false);
        c2337k0.g("colors_by_tier", true);
        c2337k0.g("tiers", true);
        c2337k0.g("default_tier", true);
        descriptor = c2337k0;
    }

    private PaywallData$Configuration$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = PaywallData.Configuration.$childSerializers;
        b bVar = bVarArr[0];
        x0 x0Var = x0.f20253a;
        b bVarP = a.p(x0Var);
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
        b bVarP2 = a.p(paywallData$Configuration$Images$$serializer);
        b bVarP3 = a.p(paywallData$Configuration$Images$$serializer);
        b bVarP4 = a.p(bVarArr[4]);
        OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
        b bVarP5 = a.p(optionalURLSerializer);
        b bVarP6 = a.p(optionalURLSerializer);
        b bVarP7 = a.p(bVarArr[10]);
        b bVarP8 = a.p(bVarArr[11]);
        b bVarP9 = a.p(x0Var);
        C2330h c2330h = C2330h.f20193a;
        return new b[]{bVar, bVarP, bVarP2, bVarP3, bVarP4, c2330h, c2330h, bVarP5, bVarP6, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, bVarP7, bVarP8, bVarP9};
    }

    @Override // Rf.a
    public PaywallData.Configuration deserialize(e decoder) {
        int i10;
        String str;
        String str2;
        Map map;
        PaywallData.Configuration.ColorInformation colorInformation;
        URL url;
        Map map2;
        List list;
        PaywallData.Configuration.Images images;
        List list2;
        URL url2;
        PaywallData.Configuration.Images images2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = PaywallData.Configuration.$childSerializers;
        if (cVarB.p()) {
            List list3 = (List) cVarB.e(descriptor2, 0, bVarArr[0], null);
            x0 x0Var = x0.f20253a;
            String str3 = (String) cVarB.B(descriptor2, 1, x0Var, null);
            PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
            PaywallData.Configuration.Images images3 = (PaywallData.Configuration.Images) cVarB.B(descriptor2, 2, paywallData$Configuration$Images$$serializer, null);
            PaywallData.Configuration.Images images4 = (PaywallData.Configuration.Images) cVarB.B(descriptor2, 3, paywallData$Configuration$Images$$serializer, null);
            Map map3 = (Map) cVarB.B(descriptor2, 4, bVarArr[4], null);
            boolean zW = cVarB.w(descriptor2, 5);
            boolean zW2 = cVarB.w(descriptor2, 6);
            OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
            URL url3 = (URL) cVarB.B(descriptor2, 7, optionalURLSerializer, null);
            URL url4 = (URL) cVarB.B(descriptor2, 8, optionalURLSerializer, null);
            PaywallData.Configuration.ColorInformation colorInformation2 = (PaywallData.Configuration.ColorInformation) cVarB.e(descriptor2, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, null);
            Map map4 = (Map) cVarB.B(descriptor2, 10, bVarArr[10], null);
            i10 = 8191;
            list = (List) cVarB.B(descriptor2, 11, bVarArr[11], null);
            list2 = list3;
            str2 = (String) cVarB.B(descriptor2, 12, x0Var, null);
            colorInformation = colorInformation2;
            url2 = url3;
            z10 = zW2;
            z11 = zW;
            images = images4;
            url = url4;
            images2 = images3;
            map2 = map3;
            str = str3;
            map = map4;
        } else {
            boolean zW3 = false;
            boolean zW4 = false;
            String str4 = null;
            Map map5 = null;
            PaywallData.Configuration.ColorInformation colorInformation3 = null;
            URL url5 = null;
            Map map6 = null;
            List list4 = null;
            PaywallData.Configuration.Images images5 = null;
            List list5 = null;
            int i11 = 4;
            boolean z14 = true;
            i10 = 0;
            String str5 = null;
            URL url6 = null;
            PaywallData.Configuration.Images images6 = null;
            while (true) {
                boolean z15 = zW3;
                if (z14) {
                    int i12 = cVarB.i(descriptor2);
                    switch (i12) {
                        case -1:
                            z13 = zW4;
                            z14 = false;
                            zW3 = z15;
                            zW4 = z13;
                            i11 = 4;
                            break;
                        case 0:
                            z13 = zW4;
                            list5 = (List) cVarB.e(descriptor2, 0, bVarArr[0], list5);
                            i10 |= 1;
                            zW3 = z15;
                            zW4 = z13;
                            i11 = 4;
                            break;
                        case 1:
                            z13 = zW4;
                            str5 = (String) cVarB.B(descriptor2, 1, x0.f20253a, str5);
                            i10 |= 2;
                            zW3 = z15;
                            zW4 = z13;
                            i11 = 4;
                            break;
                        case 2:
                            z13 = zW4;
                            images6 = (PaywallData.Configuration.Images) cVarB.B(descriptor2, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, images6);
                            i10 |= 4;
                            zW3 = z15;
                            zW4 = z13;
                            i11 = 4;
                            break;
                        case 3:
                            z13 = zW4;
                            images5 = (PaywallData.Configuration.Images) cVarB.B(descriptor2, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, images5);
                            i10 |= 8;
                            zW3 = z15;
                            zW4 = z13;
                            i11 = 4;
                            break;
                        case 4:
                            z12 = zW4;
                            map6 = (Map) cVarB.B(descriptor2, i11, bVarArr[i11], map6);
                            i10 |= 16;
                            zW3 = z15;
                            zW4 = z12;
                            break;
                        case 5:
                            i10 |= 32;
                            zW4 = cVarB.w(descriptor2, 5);
                            zW3 = z15;
                            break;
                        case 6:
                            z12 = zW4;
                            i10 |= 64;
                            zW3 = cVarB.w(descriptor2, 6);
                            zW4 = z12;
                            break;
                        case 7:
                            z12 = zW4;
                            url6 = (URL) cVarB.B(descriptor2, 7, OptionalURLSerializer.INSTANCE, url6);
                            i10 |= 128;
                            zW3 = z15;
                            zW4 = z12;
                            break;
                        case 8:
                            z12 = zW4;
                            url5 = (URL) cVarB.B(descriptor2, 8, OptionalURLSerializer.INSTANCE, url5);
                            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            zW3 = z15;
                            zW4 = z12;
                            break;
                        case 9:
                            z12 = zW4;
                            colorInformation3 = (PaywallData.Configuration.ColorInformation) cVarB.e(descriptor2, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, colorInformation3);
                            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            zW3 = z15;
                            zW4 = z12;
                            break;
                        case 10:
                            z12 = zW4;
                            map5 = (Map) cVarB.B(descriptor2, 10, bVarArr[10], map5);
                            i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                            zW3 = z15;
                            zW4 = z12;
                            break;
                        case 11:
                            z12 = zW4;
                            list4 = (List) cVarB.B(descriptor2, 11, bVarArr[11], list4);
                            i10 |= 2048;
                            zW3 = z15;
                            zW4 = z12;
                            break;
                        case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                            z12 = zW4;
                            str4 = (String) cVarB.B(descriptor2, 12, x0.f20253a, str4);
                            i10 |= 4096;
                            zW3 = z15;
                            zW4 = z12;
                            break;
                        default:
                            throw new m(i12);
                    }
                } else {
                    str = str5;
                    str2 = str4;
                    map = map5;
                    colorInformation = colorInformation3;
                    url = url5;
                    map2 = map6;
                    list = list4;
                    images = images5;
                    list2 = list5;
                    url2 = url6;
                    images2 = images6;
                    z10 = z15;
                    z11 = zW4;
                }
            }
        }
        int i13 = i10;
        cVarB.c(descriptor2);
        return new PaywallData.Configuration(i13, list2, str, images2, images, map2, z11, z10, url2, url, colorInformation, map, list, str2, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PaywallData.Configuration value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PaywallData.Configuration.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
