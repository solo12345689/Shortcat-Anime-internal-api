package com.revenuecat.purchases.paywalls.components.properties;

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
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.Checksum$$serializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/properties/VideoUrls.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class VideoUrls$$serializer implements E {
    public static final VideoUrls$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        VideoUrls$$serializer videoUrls$$serializer = new VideoUrls$$serializer();
        INSTANCE = videoUrls$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.properties.VideoUrls", videoUrls$$serializer, 6);
        c2337k0.g("width", false);
        c2337k0.g("height", false);
        c2337k0.g("url", false);
        c2337k0.g("checksum", true);
        c2337k0.g("url_low_res", true);
        c2337k0.g("checksum_low_res", true);
        descriptor = c2337k0;
    }

    private VideoUrls$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        Checksum$$serializer checksum$$serializer = Checksum$$serializer.INSTANCE;
        b bVarP = a.p(checksum$$serializer);
        b bVarP2 = a.p(uRLSerializer);
        b bVarP3 = a.p(checksum$$serializer);
        H0 h02 = H0.f20139a;
        return new b[]{h02, h02, uRLSerializer, bVarP, bVarP2, bVarP3};
    }

    @Override // Rf.a
    public VideoUrls deserialize(e decoder) {
        int i10;
        D d10;
        D d11;
        URL url;
        Checksum checksum;
        URL url2;
        Checksum checksum2;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 5;
        D d12 = null;
        if (cVarB.p()) {
            H0 h02 = H0.f20139a;
            D d13 = (D) cVarB.e(descriptor2, 0, h02, null);
            D d14 = (D) cVarB.e(descriptor2, 1, h02, null);
            URLSerializer uRLSerializer = URLSerializer.INSTANCE;
            URL url3 = (URL) cVarB.e(descriptor2, 2, uRLSerializer, null);
            Checksum$$serializer checksum$$serializer = Checksum$$serializer.INSTANCE;
            Checksum checksum3 = (Checksum) cVarB.B(descriptor2, 3, checksum$$serializer, null);
            URL url4 = (URL) cVarB.B(descriptor2, 4, uRLSerializer, null);
            d11 = d14;
            checksum2 = (Checksum) cVarB.B(descriptor2, 5, checksum$$serializer, null);
            checksum = checksum3;
            url2 = url4;
            url = url3;
            i10 = 63;
            d10 = d13;
        } else {
            boolean z10 = true;
            int i12 = 0;
            D d15 = null;
            URL url5 = null;
            Checksum checksum4 = null;
            URL url6 = null;
            Checksum checksum5 = null;
            while (z10) {
                int i13 = cVarB.i(descriptor2);
                switch (i13) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        d12 = (D) cVarB.e(descriptor2, 0, H0.f20139a, d12);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        d15 = (D) cVarB.e(descriptor2, 1, H0.f20139a, d15);
                        i12 |= 2;
                        break;
                    case 2:
                        url5 = (URL) cVarB.e(descriptor2, 2, URLSerializer.INSTANCE, url5);
                        i12 |= 4;
                        break;
                    case 3:
                        checksum4 = (Checksum) cVarB.B(descriptor2, 3, Checksum$$serializer.INSTANCE, checksum4);
                        i12 |= 8;
                        break;
                    case 4:
                        url6 = (URL) cVarB.B(descriptor2, 4, URLSerializer.INSTANCE, url6);
                        i12 |= 16;
                        break;
                    case 5:
                        checksum5 = (Checksum) cVarB.B(descriptor2, i11, Checksum$$serializer.INSTANCE, checksum5);
                        i12 |= 32;
                        break;
                    default:
                        throw new m(i13);
                }
            }
            i10 = i12;
            d10 = d12;
            d11 = d15;
            url = url5;
            checksum = checksum4;
            url2 = url6;
            checksum2 = checksum5;
        }
        cVarB.c(descriptor2);
        return new VideoUrls(i10, d10, d11, url, checksum, url2, checksum2, null, null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, VideoUrls value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        VideoUrls.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
