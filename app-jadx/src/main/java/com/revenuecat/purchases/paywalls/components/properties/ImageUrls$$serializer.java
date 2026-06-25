package com.revenuecat.purchases.paywalls.components.properties;

import Rf.b;
import Rf.m;
import Td.D;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.E;
import Vf.H0;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/properties/ImageUrls.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class ImageUrls$$serializer implements E {
    public static final ImageUrls$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        ImageUrls$$serializer imageUrls$$serializer = new ImageUrls$$serializer();
        INSTANCE = imageUrls$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.properties.ImageUrls", imageUrls$$serializer, 5);
        c2337k0.g("original", false);
        c2337k0.g("webp", false);
        c2337k0.g("webp_low_res", false);
        c2337k0.g("width", false);
        c2337k0.g("height", false);
        descriptor = c2337k0;
    }

    private ImageUrls$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        H0 h02 = H0.f20139a;
        return new b[]{uRLSerializer, uRLSerializer, uRLSerializer, h02, h02};
    }

    @Override // Rf.a
    public ImageUrls deserialize(e decoder) {
        int i10;
        URL url;
        URL url2;
        URL url3;
        D d10;
        D d11;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        URL url4 = null;
        if (cVarB.p()) {
            URLSerializer uRLSerializer = URLSerializer.INSTANCE;
            URL url5 = (URL) cVarB.e(descriptor2, 0, uRLSerializer, null);
            URL url6 = (URL) cVarB.e(descriptor2, 1, uRLSerializer, null);
            URL url7 = (URL) cVarB.e(descriptor2, 2, uRLSerializer, null);
            H0 h02 = H0.f20139a;
            url3 = url7;
            d10 = (D) cVarB.e(descriptor2, 3, h02, null);
            d11 = (D) cVarB.e(descriptor2, 4, h02, null);
            i10 = 31;
            url2 = url6;
            url = url5;
        } else {
            boolean z10 = true;
            int i11 = 0;
            URL url8 = null;
            URL url9 = null;
            D d12 = null;
            D d13 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    url4 = (URL) cVarB.e(descriptor2, 0, URLSerializer.INSTANCE, url4);
                    i11 |= 1;
                } else if (i12 == 1) {
                    url8 = (URL) cVarB.e(descriptor2, 1, URLSerializer.INSTANCE, url8);
                    i11 |= 2;
                } else if (i12 == 2) {
                    url9 = (URL) cVarB.e(descriptor2, 2, URLSerializer.INSTANCE, url9);
                    i11 |= 4;
                } else if (i12 == 3) {
                    d12 = (D) cVarB.e(descriptor2, 3, H0.f20139a, d12);
                    i11 |= 8;
                } else {
                    if (i12 != 4) {
                        throw new m(i12);
                    }
                    d13 = (D) cVarB.e(descriptor2, 4, H0.f20139a, d13);
                    i11 |= 16;
                }
            }
            i10 = i11;
            url = url4;
            url2 = url8;
            url3 = url9;
            d10 = d12;
            d11 = d13;
        }
        cVarB.c(descriptor2);
        return new ImageUrls(i10, url, url2, url3, d10, d11, null, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, ImageUrls value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        ImageUrls.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
