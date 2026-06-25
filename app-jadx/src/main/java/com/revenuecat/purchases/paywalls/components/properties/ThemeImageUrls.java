package com.revenuecat.purchases.paywalls.components.properties;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "getLight", "()Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "getDark", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThemeImageUrls {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ImageUrls dark;
    private final ImageUrls light;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return ThemeImageUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ ThemeImageUrls(int i10, ImageUrls imageUrls, ImageUrls imageUrls2, t0 t0Var) {
        if (1 != (i10 & 1)) {
            AbstractC2327f0.a(i10, 1, ThemeImageUrls$$serializer.INSTANCE.getDescriptor());
        }
        this.light = imageUrls;
        if ((i10 & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = imageUrls2;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ThemeImageUrls self, d output, e serialDesc) {
        ImageUrls$$serializer imageUrls$$serializer = ImageUrls$$serializer.INSTANCE;
        output.m(serialDesc, 0, imageUrls$$serializer, self.light);
        if (!output.g(serialDesc, 1) && self.dark == null) {
            return;
        }
        output.f(serialDesc, 1, imageUrls$$serializer, self.dark);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeImageUrls)) {
            return false;
        }
        ThemeImageUrls themeImageUrls = (ThemeImageUrls) obj;
        return AbstractC5504s.c(this.light, themeImageUrls.light) && AbstractC5504s.c(this.dark, themeImageUrls.dark);
    }

    public final /* synthetic */ ImageUrls getDark() {
        return this.dark;
    }

    public final /* synthetic */ ImageUrls getLight() {
        return this.light;
    }

    public int hashCode() {
        int iHashCode = this.light.hashCode() * 31;
        ImageUrls imageUrls = this.dark;
        return iHashCode + (imageUrls == null ? 0 : imageUrls.hashCode());
    }

    public String toString() {
        return "ThemeImageUrls(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ThemeImageUrls(ImageUrls light, ImageUrls imageUrls) {
        AbstractC5504s.h(light, "light");
        this.light = light;
        this.dark = imageUrls;
    }

    public /* synthetic */ ThemeImageUrls(ImageUrls imageUrls, ImageUrls imageUrls2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageUrls, (i10 & 2) != 0 ? null : imageUrls2);
    }
}
