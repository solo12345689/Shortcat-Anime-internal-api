package com.revenuecat.purchases.react.ui;

import Td.L;
import U6.c;
import Ud.AbstractC2279u;
import Ud.S;
import Y0.AbstractC2485u;
import android.content.Context;
import android.content.res.AssetManager;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper;
import com.revenuecat.purchases.react.ui.events.OnDismissEvent;
import com.revenuecat.purchases.react.ui.events.OnPerformPurchaseEvent;
import com.revenuecat.purchases.react.ui.events.OnPerformRestoreEvent;
import com.revenuecat.purchases.react.ui.events.OnPurchaseCancelledEvent;
import com.revenuecat.purchases.react.ui.events.OnPurchaseCompletedEvent;
import com.revenuecat.purchases.react.ui.events.OnPurchaseErrorEvent;
import com.revenuecat.purchases.react.ui.events.OnPurchasePackageInitiatedEvent;
import com.revenuecat.purchases.react.ui.events.OnPurchaseStartedEvent;
import com.revenuecat.purchases.react.ui.events.OnRestoreCompletedEvent;
import com.revenuecat.purchases.react.ui.events.OnRestoreErrorEvent;
import com.revenuecat.purchases.react.ui.events.OnRestoreStartedEvent;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.fonts.CustomFontProvider;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 Q*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001QB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ3\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170\u0016*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010!\u001a\u00020\t*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001fH\u0002¢\u0006\u0004\b!\u0010\"J-\u0010%\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010#\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J+\u0010-\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020+0\u001fH&¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\b\u00100\u001a\u0004\u0018\u00010/H&¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001fH\u0016¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u00106\u001a\u000205H&¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b9\u0010\u000bJ\u0017\u0010:\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010A\u001a\u00020>2\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b?\u0010@J%\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0B2\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\bC\u0010DJ+\u0010L\u001a\u00020\t2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030JH\u0004¢\u0006\u0004\bL\u0010MR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020/0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/revenuecat/purchases/react/ui/BasePaywallViewManager;", "Landroid/view/View;", "T", "Lcom/facebook/react/uimanager/SimpleViewManager;", "<init>", "()V", "view", "Lcom/facebook/react/bridge/ReadableMap;", BasePaywallViewManager.PROP_OPTIONS, "LTd/L;", "setOfferingIdProp", "(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V", "", "offeringIdentifier", "offeringMap", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "setFontFamilyProp", "setDisplayCloseButton", "setCustomVariablesProp", "setPurchaseLogicProp", "LU6/c$a;", "", "Lcom/revenuecat/purchases/react/ui/PaywallEventName;", "paywallEvent", "putEvent", "(LU6/c$a;Lcom/revenuecat/purchases/react/ui/PaywallEventName;)LU6/c$a;", "Lcom/facebook/react/bridge/WritableNativeMap;", "Lcom/revenuecat/purchases/react/ui/PaywallEventKey;", "keyMap", "", "dictionary", "putMap", "(Lcom/facebook/react/bridge/WritableNativeMap;Lcom/revenuecat/purchases/react/ui/PaywallEventKey;Ljava/util/Map;)V", "offeringId", BasePaywallViewManager.OPTION_OFFERING_AVAILABLE_PACKAGES_PRESENTED_OFFERING_CONTEXT, "setOfferingId", "(Landroid/view/View;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "", "display", "setDisplayDismissButton", "(Landroid/view/View;Z)V", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", BasePaywallViewManager.OPTION_CUSTOM_VARIABLES, "setCustomVariables", "(Landroid/view/View;Ljava/util/Map;)V", "Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;", "bridge", "setPurchaseLogic", "(Landroid/view/View;Lcom/revenuecat/purchases/hybridcommon/ui/HybridPurchaseLogicBridge;)V", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;", "customFontProvider", "setFontFamily", "(Landroid/view/View;Lcom/revenuecat/purchases/ui/revenuecatui/fonts/CustomFontProvider;)V", "setOptions", "onDropViewInstance", "(Landroid/view/View;)V", "Lcom/facebook/react/uimanager/b0;", "themedReactContext", "Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;", "createPaywallListenerWrapper$react_native_purchases_ui_release", "(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)Lcom/revenuecat/purchases/hybridcommon/ui/PaywallListenerWrapper;", "createPaywallListenerWrapper", "Lkotlin/Function0;", "getDismissHandler$react_native_purchases_ui_release", "(Lcom/facebook/react/uimanager/b0;Landroid/view/View;)Lie/a;", "getDismissHandler", "Lcom/facebook/react/bridge/ReactContext;", "context", "", "viewId", "Lcom/facebook/react/uimanager/events/d;", "event", "emitEvent", "(Lcom/facebook/react/bridge/ReactContext;ILcom/facebook/react/uimanager/events/d;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "purchaseLogicBridges", "Ljava/util/concurrent/ConcurrentHashMap;", "PropNames", "react-native-purchases-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BasePaywallViewManager<T extends View> extends SimpleViewManager<T> {
    private static final String OFFERING_IDENTIFIER = "identifier";
    private static final String OPTION_CUSTOM_VARIABLES = "customVariables";
    private static final String OPTION_DISPLAY_CLOSE_BUTTON = "displayCloseButton";
    private static final String OPTION_FONT_FAMILY = "fontFamily";
    private static final String OPTION_HAS_PURCHASE_LOGIC = "hasPurchaseLogic";
    private static final String OPTION_OFFERING = "offering";
    private static final String OPTION_OFFERING_AVAILABLE_PACKAGES = "availablePackages";
    private static final String OPTION_OFFERING_AVAILABLE_PACKAGES_PRESENTED_OFFERING_CONTEXT = "presentedOfferingContext";
    private static final String PROP_OPTIONS = "options";
    private final ConcurrentHashMap<Integer, HybridPurchaseLogicBridge> purchaseLogicBridges = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final L getDismissHandler$lambda$8(View view, BasePaywallViewManager basePaywallViewManager, C3284b0 c3284b0) {
        basePaywallViewManager.emitEvent(c3284b0, view.getId(), new OnDismissEvent(ViewExtensionsKt.getSurfaceId(view), view.getId()));
        return L.f17438a;
    }

    private final PresentedOfferingContext getPresentedOfferingContext(String offeringIdentifier, ReadableMap offeringMap) {
        ReadableArray array;
        ArrayList<Object> arrayList = (offeringMap == null || (array = offeringMap.getArray(OPTION_OFFERING_AVAILABLE_PACKAGES)) == null) ? null : array.toArrayList();
        Object objO0 = arrayList != null ? AbstractC2279u.o0(arrayList) : null;
        Map map = objO0 instanceof Map ? (Map) objO0 : null;
        Object obj = map != null ? map.get(OPTION_OFFERING_AVAILABLE_PACKAGES_PRESENTED_OFFERING_CONTEXT) : null;
        return RNPurchasesConverters.INSTANCE.presentedOfferingContext(offeringIdentifier, obj instanceof Map ? (Map) obj : null);
    }

    private final c.a putEvent(c.a aVar, PaywallEventName paywallEventName) {
        return aVar.b(paywallEventName.getEventName(), U6.c.c("registrationName", paywallEventName.getEventName()));
    }

    private final void putMap(WritableNativeMap writableNativeMap, PaywallEventKey paywallEventKey, Map<String, ? extends Object> map) {
        writableNativeMap.putMap(paywallEventKey.getKey(), RNPurchasesConverters.convertMapToWriteableMap(map));
    }

    private final void setCustomVariablesProp(T view, ReadableMap readableMap) {
        ReadableMap map;
        if (readableMap == null || (map = readableMap.getMap(OPTION_CUSTOM_VARIABLES)) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            int i10 = WhenMappings.$EnumSwitchMapping$0[map.getType(strNextKey).ordinal()];
            if (i10 == 1) {
                String string = map.getString(strNextKey);
                if (string != null) {
                    linkedHashMap.put(strNextKey, new CustomVariableValue.String(string));
                }
            } else if (i10 == 2) {
                linkedHashMap.put(strNextKey, new CustomVariableValue.Number(map.getDouble(strNextKey)));
            } else if (i10 == 3) {
                linkedHashMap.put(strNextKey, new CustomVariableValue.Boolean(map.getBoolean(strNextKey)));
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        setCustomVariables(view, linkedHashMap);
    }

    private final void setDisplayCloseButton(T view, ReadableMap readableMap) {
        if (!readableMap.hasKey(OPTION_DISPLAY_CLOSE_BUTTON)) {
            readableMap = null;
        }
        if (readableMap != null) {
            setDisplayDismissButton(view, readableMap.getBoolean(OPTION_DISPLAY_CLOSE_BUTTON));
        }
    }

    private final void setFontFamilyProp(T view, ReadableMap readableMap) {
        String string;
        if (readableMap == null || (string = readableMap.getString(OPTION_FONT_FAMILY)) == null) {
            return;
        }
        FontAssetManager fontAssetManager = FontAssetManager.INSTANCE;
        AssetManager assets = view.getResources().getAssets();
        AbstractC5504s.g(assets, "getAssets(...)");
        AbstractC2485u fontFamily = fontAssetManager.getFontFamily(string, assets);
        if (fontFamily != null) {
            setFontFamily(view, new CustomFontProvider(fontFamily));
        }
    }

    public static /* synthetic */ void setOfferingId$default(BasePaywallViewManager basePaywallViewManager, View view, String str, PresentedOfferingContext presentedOfferingContext, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOfferingId");
        }
        if ((i10 & 4) != 0) {
            presentedOfferingContext = null;
        }
        basePaywallViewManager.setOfferingId(view, str, presentedOfferingContext);
    }

    private final void setOfferingIdProp(T view, ReadableMap readableMap) {
        HashMap<String, Object> hashMap = readableMap != null ? readableMap.toHashMap() : null;
        if (hashMap == null || !hashMap.containsKey(OPTION_OFFERING) || hashMap.get(OPTION_OFFERING) == null) {
            return;
        }
        ReadableMap readableMapAsMap = readableMap.getDynamic(OPTION_OFFERING).asMap();
        String string = readableMapAsMap != null ? readableMapAsMap.getString(OFFERING_IDENTIFIER) : null;
        if (string == null) {
            return;
        }
        setOfferingId(view, string, getPresentedOfferingContext(string, readableMapAsMap));
    }

    private final void setPurchaseLogicProp(final T view, ReadableMap readableMap) {
        if (!readableMap.hasKey(OPTION_HAS_PURCHASE_LOGIC)) {
            readableMap = null;
        }
        if ((readableMap != null ? readableMap.getBoolean(OPTION_HAS_PURCHASE_LOGIC) : false) && !this.purchaseLogicBridges.containsKey(Integer.valueOf(view.getId()))) {
            Context context = view.getContext();
            final C3284b0 c3284b0 = context instanceof C3284b0 ? (C3284b0) context : null;
            if (c3284b0 == null) {
                return;
            }
            HybridPurchaseLogicBridge hybridPurchaseLogicBridge = new HybridPurchaseLogicBridge(new Function1() { // from class: com.revenuecat.purchases.react.ui.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePaywallViewManager.setPurchaseLogicProp$lambda$6(view, this, c3284b0, (Map) obj);
                }
            }, new Function1() { // from class: com.revenuecat.purchases.react.ui.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BasePaywallViewManager.setPurchaseLogicProp$lambda$7(view, this, c3284b0, (Map) obj);
                }
            });
            this.purchaseLogicBridges.put(Integer.valueOf(view.getId()), hybridPurchaseLogicBridge);
            setPurchaseLogic(view, hybridPurchaseLogicBridge);
        }
    }

    public static final L setPurchaseLogicProp$lambda$6(View view, BasePaywallViewManager basePaywallViewManager, C3284b0 c3284b0, Map eventData) {
        AbstractC5504s.h(eventData, "eventData");
        Object obj = eventData.get("requestId");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return L.f17438a;
        }
        Object obj2 = eventData.get(HybridPurchaseLogicBridge.EVENT_KEY_PACKAGE_BEING_PURCHASED);
        Map mapI = obj2 instanceof Map ? (Map) obj2 : null;
        if (mapI == null) {
            mapI = S.i();
        }
        basePaywallViewManager.emitEvent(c3284b0, view.getId(), new OnPerformPurchaseEvent(ViewExtensionsKt.getSurfaceId(view), view.getId(), mapI, str));
        return L.f17438a;
    }

    public static final L setPurchaseLogicProp$lambda$7(View view, BasePaywallViewManager basePaywallViewManager, C3284b0 c3284b0, Map eventData) {
        AbstractC5504s.h(eventData, "eventData");
        Object obj = eventData.get("requestId");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return L.f17438a;
        }
        basePaywallViewManager.emitEvent(c3284b0, view.getId(), new OnPerformRestoreEvent(ViewExtensionsKt.getSurfaceId(view), view.getId(), str));
        return L.f17438a;
    }

    public final PaywallListenerWrapper createPaywallListenerWrapper$react_native_purchases_ui_release(final C3284b0 themedReactContext, final View view) {
        AbstractC5504s.h(themedReactContext, "themedReactContext");
        AbstractC5504s.h(view, "view");
        return new PaywallListenerWrapper() { // from class: com.revenuecat.purchases.react.ui.BasePaywallViewManager$createPaywallListenerWrapper$1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper, com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onPurchaseCancelled() {
                this.emitEvent(themedReactContext, view.getId(), new OnPurchaseCancelledEvent(ViewExtensionsKt.getSurfaceId(view), view.getId()));
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseCompleted(Map<String, ? extends Object> customerInfo, Map<String, ? extends Object> storeTransaction) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                AbstractC5504s.h(storeTransaction, "storeTransaction");
                this.emitEvent(themedReactContext, view.getId(), new OnPurchaseCompletedEvent(ViewExtensionsKt.getSurfaceId(view), view.getId(), customerInfo, storeTransaction));
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseError(Map<String, ? extends Object> error) {
                AbstractC5504s.h(error, "error");
                this.emitEvent(themedReactContext, view.getId(), new OnPurchaseErrorEvent(ViewExtensionsKt.getSurfaceId(view), view.getId(), error));
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchasePackageInitiated(Map<String, ? extends Object> rcPackage, String requestId) {
                AbstractC5504s.h(rcPackage, "rcPackage");
                AbstractC5504s.h(requestId, "requestId");
                this.emitEvent(themedReactContext, view.getId(), new OnPurchasePackageInitiatedEvent(ViewExtensionsKt.getSurfaceId(view), view.getId(), rcPackage, requestId));
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onPurchaseStarted(Map<String, ? extends Object> rcPackage) {
                AbstractC5504s.h(rcPackage, "rcPackage");
                this.emitEvent(themedReactContext, view.getId(), new OnPurchaseStartedEvent(ViewExtensionsKt.getSurfaceId(view), view.getId(), rcPackage));
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onRestoreCompleted(Map<String, ? extends Object> customerInfo) {
                AbstractC5504s.h(customerInfo, "customerInfo");
                this.emitEvent(themedReactContext, view.getId(), new OnRestoreCompletedEvent(ViewExtensionsKt.getSurfaceId(view), view.getId(), customerInfo));
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper
            public void onRestoreError(Map<String, ? extends Object> error) {
                AbstractC5504s.h(error, "error");
                this.emitEvent(themedReactContext, view.getId(), new OnRestoreErrorEvent(ViewExtensionsKt.getSurfaceId(view), view.getId(), error));
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.revenuecat.purchases.hybridcommon.ui.PaywallListenerWrapper, com.revenuecat.purchases.ui.revenuecatui.PaywallListener
            public void onRestoreStarted() {
                this.emitEvent(themedReactContext, view.getId(), new OnRestoreStartedEvent(ViewExtensionsKt.getSurfaceId(view), view.getId()));
            }
        };
    }

    protected final void emitEvent(ReactContext context, int viewId, com.facebook.react.uimanager.events.d event) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(event, "event");
        EventDispatcher eventDispatcherC = f0.c(context, viewId);
        if (eventDispatcherC != null) {
            eventDispatcherC.d(event);
        }
    }

    public final InterfaceC5082a getDismissHandler$react_native_purchases_ui_release(final C3284b0 themedReactContext, final View view) {
        AbstractC5504s.h(themedReactContext, "themedReactContext");
        AbstractC5504s.h(view, "view");
        return new InterfaceC5082a() { // from class: com.revenuecat.purchases.react.ui.c
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return BasePaywallViewManager.getDismissHandler$lambda$8(view, this, themedReactContext);
            }
        };
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(putEvent(U6.c.a(), PaywallEventName.ON_PURCHASE_STARTED), PaywallEventName.ON_PURCHASE_COMPLETED), PaywallEventName.ON_PURCHASE_ERROR), PaywallEventName.ON_PURCHASE_CANCELLED), PaywallEventName.ON_RESTORE_STARTED), PaywallEventName.ON_RESTORE_COMPLETED), PaywallEventName.ON_RESTORE_ERROR), PaywallEventName.ON_DISMISS), PaywallEventName.ON_MEASURE), PaywallEventName.ON_PURCHASE_PACKAGE_INITIATED), PaywallEventName.ON_PERFORM_PURCHASE), PaywallEventName.ON_PERFORM_RESTORE).a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(T view) {
        AbstractC5504s.h(view, "view");
        HybridPurchaseLogicBridge hybridPurchaseLogicBridgeRemove = this.purchaseLogicBridges.remove(Integer.valueOf(view.getId()));
        if (hybridPurchaseLogicBridgeRemove != null) {
            hybridPurchaseLogicBridgeRemove.cancelPending();
        }
        super.onDropViewInstance(view);
    }

    public abstract void setCustomVariables(T view, Map<String, ? extends CustomVariableValue> map);

    public abstract void setDisplayDismissButton(T view, boolean display);

    public abstract void setFontFamily(T view, CustomFontProvider customFontProvider);

    public abstract void setOfferingId(T view, String offeringId, PresentedOfferingContext presentedOfferingContext);

    @B7.a(name = PROP_OPTIONS)
    public final void setOptions(T view, ReadableMap readableMap) {
        AbstractC5504s.h(view, "view");
        if (readableMap != null) {
            setPurchaseLogicProp(view, readableMap);
            setOfferingIdProp(view, readableMap);
            setFontFamilyProp(view, readableMap);
            setDisplayCloseButton(view, readableMap);
            setCustomVariablesProp(view, readableMap);
        }
    }

    public abstract void setPurchaseLogic(T view, HybridPurchaseLogicBridge bridge);
}
