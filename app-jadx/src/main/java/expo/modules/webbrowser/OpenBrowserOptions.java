package expo.modules.webbrowser;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016Jp\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0011R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0011R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u0014R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010\u0016R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010\u0016R \u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010\u0016R \u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b6\u0010(\u001a\u0004\b5\u0010\u0016R \u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010.\u0012\u0004\b8\u0010(\u001a\u0004\b7\u0010\u0016R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010.\u0012\u0004\b:\u0010(\u001a\u0004\b9\u0010\u0016¨\u0006;"}, d2 = {"Lexpo/modules/webbrowser/OpenBrowserOptions;", "Ljc/b;", "", "toolbarColor", "secondaryToolbarColor", "", "browserPackage", "", "showTitle", "enableDefaultShareMenuItem", "enableBarCollapsing", "showInRecents", "shouldCreateTask", "useProxyActivity", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZZZZZZ)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZZZZZZ)Lexpo/modules/webbrowser/OpenBrowserOptions;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getToolbarColor", "getToolbarColor$annotations", "()V", "getSecondaryToolbarColor", "getSecondaryToolbarColor$annotations", "Ljava/lang/String;", "getBrowserPackage", "getBrowserPackage$annotations", "Z", "getShowTitle", "getShowTitle$annotations", "getEnableDefaultShareMenuItem", "getEnableDefaultShareMenuItem$annotations", "getEnableBarCollapsing", "getEnableBarCollapsing$annotations", "getShowInRecents", "getShowInRecents$annotations", "getShouldCreateTask", "getShouldCreateTask$annotations", "getUseProxyActivity", "getUseProxyActivity$annotations", "expo-web-browser_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OpenBrowserOptions implements InterfaceC5364b {
    private final String browserPackage;
    private final boolean enableBarCollapsing;
    private final boolean enableDefaultShareMenuItem;
    private final Integer secondaryToolbarColor;
    private final boolean shouldCreateTask;
    private final boolean showInRecents;
    private final boolean showTitle;
    private final Integer toolbarColor;
    private final boolean useProxyActivity;

    public OpenBrowserOptions() {
        this(null, null, null, false, false, false, false, false, false, 511, null);
    }

    public static /* synthetic */ OpenBrowserOptions copy$default(OpenBrowserOptions openBrowserOptions, Integer num, Integer num2, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = openBrowserOptions.toolbarColor;
        }
        if ((i10 & 2) != 0) {
            num2 = openBrowserOptions.secondaryToolbarColor;
        }
        if ((i10 & 4) != 0) {
            str = openBrowserOptions.browserPackage;
        }
        if ((i10 & 8) != 0) {
            z10 = openBrowserOptions.showTitle;
        }
        if ((i10 & 16) != 0) {
            z11 = openBrowserOptions.enableDefaultShareMenuItem;
        }
        if ((i10 & 32) != 0) {
            z12 = openBrowserOptions.enableBarCollapsing;
        }
        if ((i10 & 64) != 0) {
            z13 = openBrowserOptions.showInRecents;
        }
        if ((i10 & 128) != 0) {
            z14 = openBrowserOptions.shouldCreateTask;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            z15 = openBrowserOptions.useProxyActivity;
        }
        boolean z16 = z14;
        boolean z17 = z15;
        boolean z18 = z12;
        boolean z19 = z13;
        boolean z20 = z11;
        String str2 = str;
        return openBrowserOptions.copy(num, num2, str2, z10, z20, z18, z19, z16, z17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getToolbarColor() {
        return this.toolbarColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSecondaryToolbarColor() {
        return this.secondaryToolbarColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBrowserPackage() {
        return this.browserPackage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowTitle() {
        return this.showTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnableDefaultShareMenuItem() {
        return this.enableDefaultShareMenuItem;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getEnableBarCollapsing() {
        return this.enableBarCollapsing;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowInRecents() {
        return this.showInRecents;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShouldCreateTask() {
        return this.shouldCreateTask;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getUseProxyActivity() {
        return this.useProxyActivity;
    }

    public final OpenBrowserOptions copy(Integer toolbarColor, Integer secondaryToolbarColor, String browserPackage, boolean showTitle, boolean enableDefaultShareMenuItem, boolean enableBarCollapsing, boolean showInRecents, boolean shouldCreateTask, boolean useProxyActivity) {
        return new OpenBrowserOptions(toolbarColor, secondaryToolbarColor, browserPackage, showTitle, enableDefaultShareMenuItem, enableBarCollapsing, showInRecents, shouldCreateTask, useProxyActivity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenBrowserOptions)) {
            return false;
        }
        OpenBrowserOptions openBrowserOptions = (OpenBrowserOptions) other;
        return AbstractC5504s.c(this.toolbarColor, openBrowserOptions.toolbarColor) && AbstractC5504s.c(this.secondaryToolbarColor, openBrowserOptions.secondaryToolbarColor) && AbstractC5504s.c(this.browserPackage, openBrowserOptions.browserPackage) && this.showTitle == openBrowserOptions.showTitle && this.enableDefaultShareMenuItem == openBrowserOptions.enableDefaultShareMenuItem && this.enableBarCollapsing == openBrowserOptions.enableBarCollapsing && this.showInRecents == openBrowserOptions.showInRecents && this.shouldCreateTask == openBrowserOptions.shouldCreateTask && this.useProxyActivity == openBrowserOptions.useProxyActivity;
    }

    public final String getBrowserPackage() {
        return this.browserPackage;
    }

    public final boolean getEnableBarCollapsing() {
        return this.enableBarCollapsing;
    }

    public final boolean getEnableDefaultShareMenuItem() {
        return this.enableDefaultShareMenuItem;
    }

    public final Integer getSecondaryToolbarColor() {
        return this.secondaryToolbarColor;
    }

    public final boolean getShouldCreateTask() {
        return this.shouldCreateTask;
    }

    public final boolean getShowInRecents() {
        return this.showInRecents;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    public final Integer getToolbarColor() {
        return this.toolbarColor;
    }

    public final boolean getUseProxyActivity() {
        return this.useProxyActivity;
    }

    public int hashCode() {
        Integer num = this.toolbarColor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.secondaryToolbarColor;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.browserPackage;
        return ((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.showTitle)) * 31) + Boolean.hashCode(this.enableDefaultShareMenuItem)) * 31) + Boolean.hashCode(this.enableBarCollapsing)) * 31) + Boolean.hashCode(this.showInRecents)) * 31) + Boolean.hashCode(this.shouldCreateTask)) * 31) + Boolean.hashCode(this.useProxyActivity);
    }

    public String toString() {
        return "OpenBrowserOptions(toolbarColor=" + this.toolbarColor + ", secondaryToolbarColor=" + this.secondaryToolbarColor + ", browserPackage=" + this.browserPackage + ", showTitle=" + this.showTitle + ", enableDefaultShareMenuItem=" + this.enableDefaultShareMenuItem + ", enableBarCollapsing=" + this.enableBarCollapsing + ", showInRecents=" + this.showInRecents + ", shouldCreateTask=" + this.shouldCreateTask + ", useProxyActivity=" + this.useProxyActivity + ")";
    }

    public OpenBrowserOptions(Integer num, Integer num2, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.toolbarColor = num;
        this.secondaryToolbarColor = num2;
        this.browserPackage = str;
        this.showTitle = z10;
        this.enableDefaultShareMenuItem = z11;
        this.enableBarCollapsing = z12;
        this.showInRecents = z13;
        this.shouldCreateTask = z14;
        this.useProxyActivity = z15;
    }

    public /* synthetic */ OpenBrowserOptions(Integer num, Integer num2, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? false : z12, (i10 & 64) != 0 ? false : z13, (i10 & 128) != 0 ? true : z14, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? true : z15);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getBrowserPackage$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getEnableBarCollapsing$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getEnableDefaultShareMenuItem$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getSecondaryToolbarColor$annotations() {
    }

    @InterfaceC5363a(key = "createTask")
    public static /* synthetic */ void getShouldCreateTask$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShowInRecents$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getShowTitle$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getToolbarColor$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getUseProxyActivity$annotations() {
    }
}
