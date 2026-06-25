package com.revenuecat.purchases.paywalls.components.properties;

import Rf.b;
import Td.D;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.H0;
import Vf.t0;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.Checksum$$serializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,+BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fB]\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010$\u0012\u0004\b*\u0010#\u001a\u0004\b)\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "", "LTd/D;", "width", "height", "Ljava/net/URL;", "url", "Lcom/revenuecat/purchases/models/Checksum;", "checksum", "urlLowRes", "checksumLowRes", "<init>", "(IILjava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILTd/D;LTd/D;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;LVf/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;LUf/d;LTf/e;)V", "write$Self", "I", "getWidth-pVg5ArA", "()I", "getHeight-pVg5ArA", "Ljava/net/URL;", "getUrl", "()Ljava/net/URL;", "getUrl$annotations", "()V", "Lcom/revenuecat/purchases/models/Checksum;", "getChecksum", "()Lcom/revenuecat/purchases/models/Checksum;", "getUrlLowRes", "getUrlLowRes$annotations", "getChecksumLowRes", "getChecksumLowRes$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoUrls {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Checksum checksum;
    private final Checksum checksumLowRes;
    private final int height;
    private final URL url;
    private final URL urlLowRes;
    private final int width;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return VideoUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoUrls(int i10, int i11, URL url, Checksum checksum, URL url2, Checksum checksum2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, url, checksum, url2, checksum2);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(VideoUrls self, d output, e serialDesc) {
        H0 h02 = H0.f20139a;
        output.m(serialDesc, 0, h02, D.a(self.width));
        output.m(serialDesc, 1, h02, D.a(self.height));
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        output.m(serialDesc, 2, uRLSerializer, self.url);
        if (output.g(serialDesc, 3) || self.checksum != null) {
            output.f(serialDesc, 3, Checksum$$serializer.INSTANCE, self.checksum);
        }
        if (output.g(serialDesc, 4) || self.urlLowRes != null) {
            output.f(serialDesc, 4, uRLSerializer, self.urlLowRes);
        }
        if (!output.g(serialDesc, 5) && self.checksumLowRes == null) {
            return;
        }
        output.f(serialDesc, 5, Checksum$$serializer.INSTANCE, self.checksumLowRes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUrls)) {
            return false;
        }
        VideoUrls videoUrls = (VideoUrls) obj;
        return this.width == videoUrls.width && this.height == videoUrls.height && AbstractC5504s.c(this.url, videoUrls.url) && AbstractC5504s.c(this.checksum, videoUrls.checksum) && AbstractC5504s.c(this.urlLowRes, videoUrls.urlLowRes) && AbstractC5504s.c(this.checksumLowRes, videoUrls.checksumLowRes);
    }

    public final /* synthetic */ Checksum getChecksum() {
        return this.checksum;
    }

    public final /* synthetic */ Checksum getChecksumLowRes() {
        return this.checksumLowRes;
    }

    /* JADX INFO: renamed from: getHeight-pVg5ArA, reason: from getter */
    public final /* synthetic */ int getHeight() {
        return this.height;
    }

    public final /* synthetic */ URL getUrl() {
        return this.url;
    }

    public final /* synthetic */ URL getUrlLowRes() {
        return this.urlLowRes;
    }

    /* JADX INFO: renamed from: getWidth-pVg5ArA, reason: from getter */
    public final /* synthetic */ int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((this.width * 31) + this.height) * 31) + this.url.hashCode()) * 31;
        Checksum checksum = this.checksum;
        int iHashCode2 = (iHashCode + (checksum == null ? 0 : checksum.hashCode())) * 31;
        URL url = this.urlLowRes;
        int iHashCode3 = (iHashCode2 + (url == null ? 0 : url.hashCode())) * 31;
        Checksum checksum2 = this.checksumLowRes;
        return iHashCode3 + (checksum2 != null ? checksum2.hashCode() : 0);
    }

    public String toString() {
        return "VideoUrls(width=" + ((Object) D.k(this.width)) + ", height=" + ((Object) D.k(this.height)) + ", url=" + this.url + ", checksum=" + this.checksum + ", urlLowRes=" + this.urlLowRes + ", checksumLowRes=" + this.checksumLowRes + ')';
    }

    @InterfaceC2154e
    public /* synthetic */ VideoUrls(int i10, D d10, D d11, URL url, Checksum checksum, URL url2, Checksum checksum2, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, d10, d11, url, checksum, url2, checksum2, t0Var);
    }

    private VideoUrls(int i10, int i11, URL url, Checksum checksum, URL url2, Checksum checksum2) {
        AbstractC5504s.h(url, "url");
        this.width = i10;
        this.height = i11;
        this.url = url;
        this.checksum = checksum;
        this.urlLowRes = url2;
        this.checksumLowRes = checksum2;
    }

    private VideoUrls(int i10, D d10, D d11, URL url, Checksum checksum, URL url2, Checksum checksum2, t0 t0Var) {
        if (7 != (i10 & 7)) {
            AbstractC2327f0.a(i10, 7, VideoUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.width = d10.m();
        this.height = d11.m();
        this.url = url;
        if ((i10 & 8) == 0) {
            this.checksum = null;
        } else {
            this.checksum = checksum;
        }
        if ((i10 & 16) == 0) {
            this.urlLowRes = null;
        } else {
            this.urlLowRes = url2;
        }
        if ((i10 & 32) == 0) {
            this.checksumLowRes = null;
        } else {
            this.checksumLowRes = checksum2;
        }
    }

    public /* synthetic */ VideoUrls(int i10, int i11, URL url, Checksum checksum, URL url2, Checksum checksum2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, url, (i12 & 8) != 0 ? null : checksum, (i12 & 16) != 0 ? null : url2, (i12 & 32) != 0 ? null : checksum2, null);
    }

    public static /* synthetic */ void getChecksumLowRes$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static /* synthetic */ void getUrlLowRes$annotations() {
    }
}
