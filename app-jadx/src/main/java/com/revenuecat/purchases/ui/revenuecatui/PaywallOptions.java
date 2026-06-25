package com.revenuecat.purchases.ui.revenuecatui;

import Ud.S;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\b\u0007\u0018\u0000 B2\u00020\u0001:\u0002CBB\u0085\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012 \b\u0002\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u0099\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2 \b\u0002\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00112\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R2\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b=\u0010>R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "offeringSelection", "", "shouldDisplayDismissButton", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "fontProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "purchaseLogic", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "mode", "Lkotlin/Function0;", "LTd/L;", "dismissRequest", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/Offering;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "dismissRequestWithExitOffering", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariables", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;ZLcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lie/a;Lkotlin/jvm/functions/Function2;Ljava/util/Map;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "builder", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;)V", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "copy$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;ZLcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;Lie/a;Lkotlin/jvm/functions/Function2;Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "copy", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "getOfferingSelection$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "Z", "getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release", "()Z", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "getFontProvider", "()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "getListener", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "getPurchaseLogic", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "getMode$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "Lie/a;", "getDismissRequest", "()Lie/a;", "Lkotlin/jvm/functions/Function2;", "getDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release", "()Lkotlin/jvm/functions/Function2;", "Ljava/util/Map;", "getCustomVariables", "()Ljava/util/Map;", "Companion", "Builder", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallOptions {
    public static final int $stable = 0;
    private static final int hashMultiplier = 31;
    private final Map<String, CustomVariableValue> customVariables;
    private final InterfaceC5082a dismissRequest;
    private final Function2 dismissRequestWithExitOffering;
    private final FontProvider fontProvider;
    private final PaywallListener listener;
    private final PaywallMode mode;
    private final OfferingSelection offeringSelection;
    private final PaywallPurchaseLogic purchaseLogic;
    private final boolean shouldDisplayDismissButton;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J/\u0010/\u001a\u00020\u00002\u001e\u0010,\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u0003\u0018\u00010*H\u0000¢\u0006\u0004\b-\u0010.J!\u00104\u001a\u00020\u00002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200¢\u0006\u0004\b4\u00105J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010;R\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>\"\u0004\b\u0012\u0010?R\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\"\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010&\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010T\u001a\u0004\bU\u0010V\"\u0004\b'\u0010WR:\u0010,\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u0003\u0018\u00010*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b-\u0010[R.\u0010\\\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "", "Lkotlin/Function0;", "LTd/L;", "dismissRequest", "<init>", "(Lie/a;)V", "Lcom/revenuecat/purchases/Offering;", "offering", "setOffering", "(Lcom/revenuecat/purchases/Offering;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;", "idAndPresentedOfferingContext", "setOfferingIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "setOfferingIdAndPresentedOfferingContext", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "offeringSelection", "setOfferingSelection$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "setOfferingSelection", "", "shouldDisplayDismissButton", "setShouldDisplayDismissButton", "(Z)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "fontProvider", "setFontProvider", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "listener", "setListener", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "purchaseLogic", "setPurchaseLogic", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "mode", "setMode$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "setMode", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "dismissRequestWithExitOffering", "setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release", "(Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "setDismissRequestWithExitOffering", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "variables", "setCustomVariables", "(Ljava/util/Map;)Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions$Builder;", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "build", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallOptions;", "Lie/a;", "getDismissRequest$revenuecatui_defaultsBc8Release", "()Lie/a;", "Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "getOfferingSelection$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;", "(Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection;)V", "Z", "getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release", "()Z", "setShouldDisplayDismissButton$revenuecatui_defaultsBc8Release", "(Z)V", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "getFontProvider$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;", "setFontProvider$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/ui/revenuecatui/fonts/FontProvider;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "getListener$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "setListener$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "getPurchaseLogic$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;", "setPurchaseLogic$revenuecatui_defaultsBc8Release", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallPurchaseLogic;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "getMode$revenuecatui_defaultsBc8Release", "()Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;", "(Lcom/revenuecat/purchases/ui/revenuecatui/PaywallMode;)V", "Lkotlin/jvm/functions/Function2;", "getDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "customVariables", "Ljava/util/Map;", "getCustomVariables$revenuecatui_defaultsBc8Release", "()Ljava/util/Map;", "setCustomVariables$revenuecatui_defaultsBc8Release", "(Ljava/util/Map;)V", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Map<String, ? extends CustomVariableValue> customVariables;
        private final InterfaceC5082a dismissRequest;
        private Function2 dismissRequestWithExitOffering;
        private FontProvider fontProvider;
        private PaywallListener listener;
        private PaywallMode mode;
        private OfferingSelection offeringSelection;
        private PaywallPurchaseLogic purchaseLogic;
        private boolean shouldDisplayDismissButton;

        public Builder(InterfaceC5082a dismissRequest) {
            AbstractC5504s.h(dismissRequest, "dismissRequest");
            this.dismissRequest = dismissRequest;
            this.offeringSelection = OfferingSelection.None.INSTANCE;
            this.mode = PaywallMode.INSTANCE.getDefault();
            this.customVariables = S.i();
        }

        public final PaywallOptions build() {
            return new PaywallOptions(this);
        }

        public final Map<String, CustomVariableValue> getCustomVariables$revenuecatui_defaultsBc8Release() {
            return this.customVariables;
        }

        /* JADX INFO: renamed from: getDismissRequest$revenuecatui_defaultsBc8Release, reason: from getter */
        public final InterfaceC5082a getDismissRequest() {
            return this.dismissRequest;
        }

        /* JADX INFO: renamed from: getDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release, reason: from getter */
        public final Function2 getDismissRequestWithExitOffering() {
            return this.dismissRequestWithExitOffering;
        }

        /* JADX INFO: renamed from: getFontProvider$revenuecatui_defaultsBc8Release, reason: from getter */
        public final FontProvider getFontProvider() {
            return this.fontProvider;
        }

        /* JADX INFO: renamed from: getListener$revenuecatui_defaultsBc8Release, reason: from getter */
        public final PaywallListener getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: getMode$revenuecatui_defaultsBc8Release, reason: from getter */
        public final PaywallMode getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: getOfferingSelection$revenuecatui_defaultsBc8Release, reason: from getter */
        public final OfferingSelection getOfferingSelection() {
            return this.offeringSelection;
        }

        /* JADX INFO: renamed from: getPurchaseLogic$revenuecatui_defaultsBc8Release, reason: from getter */
        public final PaywallPurchaseLogic getPurchaseLogic() {
            return this.purchaseLogic;
        }

        /* JADX INFO: renamed from: getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release, reason: from getter */
        public final boolean getShouldDisplayDismissButton() {
            return this.shouldDisplayDismissButton;
        }

        public final Builder setCustomVariables(Map<String, ? extends CustomVariableValue> variables) {
            AbstractC5504s.h(variables, "variables");
            this.customVariables = CustomVariableKeyValidator.INSTANCE.validateAndFilter(variables);
            return this;
        }

        public final void setCustomVariables$revenuecatui_defaultsBc8Release(Map<String, ? extends CustomVariableValue> map) {
            AbstractC5504s.h(map, "<set-?>");
            this.customVariables = map;
        }

        /* JADX INFO: renamed from: setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release */
        public final void m382x1d639bc0(Function2 function2) {
            this.dismissRequestWithExitOffering = function2;
        }

        public final Builder setFontProvider(FontProvider fontProvider) {
            this.fontProvider = fontProvider;
            return this;
        }

        public final void setFontProvider$revenuecatui_defaultsBc8Release(FontProvider fontProvider) {
            this.fontProvider = fontProvider;
        }

        public final Builder setListener(PaywallListener listener) {
            this.listener = listener;
            return this;
        }

        public final void setListener$revenuecatui_defaultsBc8Release(PaywallListener paywallListener) {
            this.listener = paywallListener;
        }

        /* JADX INFO: renamed from: setMode$revenuecatui_defaultsBc8Release */
        public final void m383setMode$revenuecatui_defaultsBc8Release(PaywallMode paywallMode) {
            AbstractC5504s.h(paywallMode, "<set-?>");
            this.mode = paywallMode;
        }

        public final Builder setOffering(Offering offering) {
            this.offeringSelection = offering != null ? new OfferingSelection.OfferingType(offering) : OfferingSelection.None.INSTANCE;
            return this;
        }

        public final Builder setOfferingIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release(OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext) {
            OfferingSelection offeringSelection = idAndPresentedOfferingContext;
            if (idAndPresentedOfferingContext == null) {
                offeringSelection = OfferingSelection.None.INSTANCE;
            }
            this.offeringSelection = offeringSelection;
            return this;
        }

        /* JADX INFO: renamed from: setOfferingSelection$revenuecatui_defaultsBc8Release */
        public final void m384setOfferingSelection$revenuecatui_defaultsBc8Release(OfferingSelection offeringSelection) {
            AbstractC5504s.h(offeringSelection, "<set-?>");
            this.offeringSelection = offeringSelection;
        }

        public final Builder setPurchaseLogic(PaywallPurchaseLogic purchaseLogic) {
            this.purchaseLogic = purchaseLogic;
            return this;
        }

        public final void setPurchaseLogic$revenuecatui_defaultsBc8Release(PaywallPurchaseLogic paywallPurchaseLogic) {
            this.purchaseLogic = paywallPurchaseLogic;
        }

        public final Builder setShouldDisplayDismissButton(boolean shouldDisplayDismissButton) {
            this.shouldDisplayDismissButton = shouldDisplayDismissButton;
            return this;
        }

        public final void setShouldDisplayDismissButton$revenuecatui_defaultsBc8Release(boolean z10) {
            this.shouldDisplayDismissButton = z10;
        }

        public final Builder setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release(Function2 dismissRequestWithExitOffering) {
            this.dismissRequestWithExitOffering = dismissRequestWithExitOffering;
            return this;
        }

        public final Builder setMode$revenuecatui_defaultsBc8Release(PaywallMode mode) {
            AbstractC5504s.h(mode, "mode");
            this.mode = mode;
            return this;
        }

        public final Builder setOfferingSelection$revenuecatui_defaultsBc8Release(OfferingSelection offeringSelection) {
            if (offeringSelection == null) {
                offeringSelection = OfferingSelection.None.INSTANCE;
            }
            this.offeringSelection = offeringSelection;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallOptions(OfferingSelection offeringSelection, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, PaywallMode mode, InterfaceC5082a dismissRequest, Function2 function2, Map<String, ? extends CustomVariableValue> customVariables) {
        AbstractC5504s.h(offeringSelection, "offeringSelection");
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(dismissRequest, "dismissRequest");
        AbstractC5504s.h(customVariables, "customVariables");
        this.offeringSelection = offeringSelection;
        this.shouldDisplayDismissButton = z10;
        this.fontProvider = fontProvider;
        this.listener = paywallListener;
        this.purchaseLogic = paywallPurchaseLogic;
        this.mode = mode;
        this.dismissRequest = dismissRequest;
        this.dismissRequestWithExitOffering = function2;
        this.customVariables = customVariables;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallOptions copy$revenuecatui_defaultsBc8Release$default(PaywallOptions paywallOptions, OfferingSelection offeringSelection, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, PaywallMode paywallMode, InterfaceC5082a interfaceC5082a, Function2 function2, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offeringSelection = paywallOptions.offeringSelection;
        }
        if ((i10 & 2) != 0) {
            z10 = paywallOptions.shouldDisplayDismissButton;
        }
        if ((i10 & 4) != 0) {
            fontProvider = paywallOptions.fontProvider;
        }
        if ((i10 & 8) != 0) {
            paywallListener = paywallOptions.listener;
        }
        if ((i10 & 16) != 0) {
            paywallPurchaseLogic = paywallOptions.purchaseLogic;
        }
        if ((i10 & 32) != 0) {
            paywallMode = paywallOptions.mode;
        }
        if ((i10 & 64) != 0) {
            interfaceC5082a = paywallOptions.dismissRequest;
        }
        if ((i10 & 128) != 0) {
            function2 = paywallOptions.dismissRequestWithExitOffering;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            map = paywallOptions.customVariables;
        }
        Function2 function22 = function2;
        Map map2 = map;
        PaywallMode paywallMode2 = paywallMode;
        InterfaceC5082a interfaceC5082a2 = interfaceC5082a;
        PaywallPurchaseLogic paywallPurchaseLogic2 = paywallPurchaseLogic;
        FontProvider fontProvider2 = fontProvider;
        return paywallOptions.copy$revenuecatui_defaultsBc8Release(offeringSelection, z10, fontProvider2, paywallListener, paywallPurchaseLogic2, paywallMode2, interfaceC5082a2, function22, map2);
    }

    public final PaywallOptions copy$revenuecatui_defaultsBc8Release(OfferingSelection offeringSelection, boolean shouldDisplayDismissButton, FontProvider fontProvider, PaywallListener listener, PaywallPurchaseLogic purchaseLogic, PaywallMode mode, InterfaceC5082a dismissRequest, Function2 dismissRequestWithExitOffering, Map<String, ? extends CustomVariableValue> customVariables) {
        AbstractC5504s.h(offeringSelection, "offeringSelection");
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(dismissRequest, "dismissRequest");
        AbstractC5504s.h(customVariables, "customVariables");
        return new PaywallOptions(offeringSelection, shouldDisplayDismissButton, fontProvider, listener, purchaseLogic, mode, dismissRequest, dismissRequestWithExitOffering, customVariables);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallOptions)) {
            return false;
        }
        PaywallOptions paywallOptions = (PaywallOptions) other;
        if (AbstractC5504s.c(this.offeringSelection, paywallOptions.offeringSelection) && this.shouldDisplayDismissButton == paywallOptions.shouldDisplayDismissButton && AbstractC5504s.c(this.fontProvider, paywallOptions.fontProvider) && AbstractC5504s.c(this.listener, paywallOptions.listener) && AbstractC5504s.c(this.purchaseLogic, paywallOptions.purchaseLogic) && this.mode == paywallOptions.mode && AbstractC5504s.c(this.customVariables, paywallOptions.customVariables)) {
            return AbstractC5504s.c(this.dismissRequest, paywallOptions.dismissRequest);
        }
        return false;
    }

    public final Map<String, CustomVariableValue> getCustomVariables() {
        return this.customVariables;
    }

    public final InterfaceC5082a getDismissRequest() {
        return this.dismissRequest;
    }

    /* JADX INFO: renamed from: getDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release, reason: from getter */
    public final Function2 getDismissRequestWithExitOffering() {
        return this.dismissRequestWithExitOffering;
    }

    public final FontProvider getFontProvider() {
        return this.fontProvider;
    }

    public final PaywallListener getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: getMode$revenuecatui_defaultsBc8Release, reason: from getter */
    public final PaywallMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: getOfferingSelection$revenuecatui_defaultsBc8Release, reason: from getter */
    public final OfferingSelection getOfferingSelection() {
        return this.offeringSelection;
    }

    public final PaywallPurchaseLogic getPurchaseLogic() {
        return this.purchaseLogic;
    }

    /* JADX INFO: renamed from: getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release, reason: from getter */
    public final boolean getShouldDisplayDismissButton() {
        return this.shouldDisplayDismissButton;
    }

    public int hashCode() {
        String offeringIdentifier = this.offeringSelection.getOfferingIdentifier();
        return ((((((offeringIdentifier != null ? offeringIdentifier.hashCode() : 0) * 31) + Boolean.hashCode(this.shouldDisplayDismissButton)) * 31) + this.mode.hashCode()) * 31) + this.customVariables.hashCode();
    }

    public String toString() {
        return "PaywallOptions(offeringSelection=" + this.offeringSelection + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", fontProvider=" + this.fontProvider + ", listener=" + this.listener + ", purchaseLogic=" + this.purchaseLogic + ", mode=" + this.mode + ", dismissRequest=" + this.dismissRequest + ", dismissRequestWithExitOffering=" + this.dismissRequestWithExitOffering + ", customVariables=" + this.customVariables + ')';
    }

    public /* synthetic */ PaywallOptions(OfferingSelection offeringSelection, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PaywallPurchaseLogic paywallPurchaseLogic, PaywallMode paywallMode, InterfaceC5082a interfaceC5082a, Function2 function2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(offeringSelection, z10, fontProvider, paywallListener, paywallPurchaseLogic, paywallMode, interfaceC5082a, (i10 & 128) != 0 ? null : function2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? S.i() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallOptions(Builder builder) {
        this(builder.getOfferingSelection(), builder.getShouldDisplayDismissButton(), builder.getFontProvider(), builder.getListener(), builder.getPurchaseLogic(), builder.getMode(), builder.getDismissRequest(), builder.getDismissRequestWithExitOffering(), builder.getCustomVariables$revenuecatui_defaultsBc8Release());
        AbstractC5504s.h(builder, "builder");
    }
}
