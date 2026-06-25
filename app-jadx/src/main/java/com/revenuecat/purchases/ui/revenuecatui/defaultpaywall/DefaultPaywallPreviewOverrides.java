package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\n\u0010\u0014¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewOverrides;", "", "", "appName", "Landroid/graphics/Bitmap;", "appIconBitmap", "", "Ls0/r0;", "prominentColors", "", "isDebugBuild", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/util/List;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroid/graphics/Bitmap;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/util/List;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DefaultPaywallPreviewOverrides;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppName", "Landroid/graphics/Bitmap;", "getAppIconBitmap", "Ljava/util/List;", "getProminentColors", "Ljava/lang/Boolean;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DefaultPaywallPreviewOverrides {
    public static final int $stable = 8;
    private final Bitmap appIconBitmap;
    private final String appName;
    private final Boolean isDebugBuild;
    private final List<C6385r0> prominentColors;

    public DefaultPaywallPreviewOverrides() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultPaywallPreviewOverrides copy$default(DefaultPaywallPreviewOverrides defaultPaywallPreviewOverrides, String str, Bitmap bitmap, List list, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = defaultPaywallPreviewOverrides.appName;
        }
        if ((i10 & 2) != 0) {
            bitmap = defaultPaywallPreviewOverrides.appIconBitmap;
        }
        if ((i10 & 4) != 0) {
            list = defaultPaywallPreviewOverrides.prominentColors;
        }
        if ((i10 & 8) != 0) {
            bool = defaultPaywallPreviewOverrides.isDebugBuild;
        }
        return defaultPaywallPreviewOverrides.copy(str, bitmap, list, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Bitmap getAppIconBitmap() {
        return this.appIconBitmap;
    }

    public final List<C6385r0> component3() {
        return this.prominentColors;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsDebugBuild() {
        return this.isDebugBuild;
    }

    public final DefaultPaywallPreviewOverrides copy(String appName, Bitmap appIconBitmap, List<C6385r0> prominentColors, Boolean isDebugBuild) {
        return new DefaultPaywallPreviewOverrides(appName, appIconBitmap, prominentColors, isDebugBuild);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultPaywallPreviewOverrides)) {
            return false;
        }
        DefaultPaywallPreviewOverrides defaultPaywallPreviewOverrides = (DefaultPaywallPreviewOverrides) other;
        return AbstractC5504s.c(this.appName, defaultPaywallPreviewOverrides.appName) && AbstractC5504s.c(this.appIconBitmap, defaultPaywallPreviewOverrides.appIconBitmap) && AbstractC5504s.c(this.prominentColors, defaultPaywallPreviewOverrides.prominentColors) && AbstractC5504s.c(this.isDebugBuild, defaultPaywallPreviewOverrides.isDebugBuild);
    }

    public final Bitmap getAppIconBitmap() {
        return this.appIconBitmap;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final List<C6385r0> getProminentColors() {
        return this.prominentColors;
    }

    public int hashCode() {
        String str = this.appName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Bitmap bitmap = this.appIconBitmap;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        List<C6385r0> list = this.prominentColors;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isDebugBuild;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isDebugBuild() {
        return this.isDebugBuild;
    }

    public String toString() {
        return "DefaultPaywallPreviewOverrides(appName=" + this.appName + ", appIconBitmap=" + this.appIconBitmap + ", prominentColors=" + this.prominentColors + ", isDebugBuild=" + this.isDebugBuild + ')';
    }

    public DefaultPaywallPreviewOverrides(String str, Bitmap bitmap, List<C6385r0> list, Boolean bool) {
        this.appName = str;
        this.appIconBitmap = bitmap;
        this.prominentColors = list;
        this.isDebugBuild = bool;
    }

    public /* synthetic */ DefaultPaywallPreviewOverrides(String str, Bitmap bitmap, List list, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bitmap, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : bool);
    }
}
