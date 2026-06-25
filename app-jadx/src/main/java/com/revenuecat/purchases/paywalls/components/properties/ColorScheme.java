package com.revenuecat.purchases.paywalls.components.properties;

import Rf.b;
import Rf.h;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.t0;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;LUf/d;LTf/e;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "getLight", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "getDark", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ColorScheme {
    private static final b[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ColorInfo dark;
    private final ColorInfo light;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return ColorScheme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        InterfaceC6014d interfaceC6014dB = O.b(ColorInfo.class);
        InterfaceC6014d[] interfaceC6014dArr = {O.b(ColorInfo.Alias.class), O.b(ColorInfo.Gradient.Linear.class), O.b(ColorInfo.Gradient.Radial.class), O.b(ColorInfo.Hex.class)};
        ColorInfo$Alias$$serializer colorInfo$Alias$$serializer = ColorInfo$Alias$$serializer.INSTANCE;
        ColorInfo$Gradient$Linear$$serializer colorInfo$Gradient$Linear$$serializer = ColorInfo$Gradient$Linear$$serializer.INSTANCE;
        ColorInfo$Gradient$Radial$$serializer colorInfo$Gradient$Radial$$serializer = ColorInfo$Gradient$Radial$$serializer.INSTANCE;
        ColorInfo$Hex$$serializer colorInfo$Hex$$serializer = ColorInfo$Hex$$serializer.INSTANCE;
        $childSerializers = new b[]{new h("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", interfaceC6014dB, interfaceC6014dArr, new b[]{colorInfo$Alias$$serializer, colorInfo$Gradient$Linear$$serializer, colorInfo$Gradient$Radial$$serializer, colorInfo$Hex$$serializer}, new Annotation[0]), new h("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", O.b(ColorInfo.class), new InterfaceC6014d[]{O.b(ColorInfo.Alias.class), O.b(ColorInfo.Gradient.Linear.class), O.b(ColorInfo.Gradient.Radial.class), O.b(ColorInfo.Hex.class)}, new b[]{colorInfo$Alias$$serializer, colorInfo$Gradient$Linear$$serializer, colorInfo$Gradient$Radial$$serializer, colorInfo$Hex$$serializer}, new Annotation[0])};
    }

    @InterfaceC2154e
    public /* synthetic */ ColorScheme(int i10, ColorInfo colorInfo, ColorInfo colorInfo2, t0 t0Var) {
        if (1 != (i10 & 1)) {
            AbstractC2327f0.a(i10, 1, ColorScheme$$serializer.INSTANCE.getDescriptor());
        }
        this.light = colorInfo;
        if ((i10 & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = colorInfo2;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ColorScheme self, d output, e serialDesc) {
        b[] bVarArr = $childSerializers;
        output.m(serialDesc, 0, bVarArr[0], self.light);
        if (!output.g(serialDesc, 1) && self.dark == null) {
            return;
        }
        output.f(serialDesc, 1, bVarArr[1], self.dark);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorScheme)) {
            return false;
        }
        ColorScheme colorScheme = (ColorScheme) obj;
        return AbstractC5504s.c(this.light, colorScheme.light) && AbstractC5504s.c(this.dark, colorScheme.dark);
    }

    public final /* synthetic */ ColorInfo getDark() {
        return this.dark;
    }

    public final /* synthetic */ ColorInfo getLight() {
        return this.light;
    }

    public int hashCode() {
        int iHashCode = this.light.hashCode() * 31;
        ColorInfo colorInfo = this.dark;
        return iHashCode + (colorInfo == null ? 0 : colorInfo.hashCode());
    }

    public String toString() {
        return "ColorScheme(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ColorScheme(ColorInfo light, ColorInfo colorInfo) {
        AbstractC5504s.h(light, "light");
        this.light = light;
        this.dark = colorInfo;
    }

    public /* synthetic */ ColorScheme(ColorInfo colorInfo, ColorInfo colorInfo2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorInfo, (i10 & 2) != 0 ? null : colorInfo2);
    }
}
