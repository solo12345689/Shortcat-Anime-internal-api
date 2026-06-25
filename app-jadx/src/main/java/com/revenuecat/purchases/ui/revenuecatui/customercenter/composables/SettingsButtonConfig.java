package com.revenuecat.purchases.ui.revenuecatui.customercenter.composables;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/composables/SettingsButtonConfig;", "", "enabled", "", "loading", "(ZZ)V", "getEnabled", "()Z", "getLoading", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SettingsButtonConfig {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean loading;

    /* JADX WARN: Illegal instructions before constructor call */
    public SettingsButtonConfig() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    public static /* synthetic */ SettingsButtonConfig copy$default(SettingsButtonConfig settingsButtonConfig, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = settingsButtonConfig.enabled;
        }
        if ((i10 & 2) != 0) {
            z11 = settingsButtonConfig.loading;
        }
        return settingsButtonConfig.copy(z10, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final SettingsButtonConfig copy(boolean enabled, boolean loading) {
        return new SettingsButtonConfig(enabled, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsButtonConfig)) {
            return false;
        }
        SettingsButtonConfig settingsButtonConfig = (SettingsButtonConfig) other;
        return this.enabled == settingsButtonConfig.enabled && this.loading == settingsButtonConfig.loading;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "SettingsButtonConfig(enabled=" + this.enabled + ", loading=" + this.loading + ')';
    }

    public SettingsButtonConfig(boolean z10, boolean z11) {
        this.enabled = z10;
        this.loading = z11;
    }

    public /* synthetic */ SettingsButtonConfig(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11);
    }
}
