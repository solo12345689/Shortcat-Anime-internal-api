package com.oblador.performance;

import android.os.SystemClock;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.oblador.performance.g;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class PerformanceModule extends ReactContextBaseJavaModule implements TurboModule, g.b {
    public static final String BRIDGE_SETUP_START = "bridgeSetupStart";
    public static final String PERFORMANCE_MODULE = "RNPerformanceManager";
    private static boolean eventsBuffered = true;
    private final ReactMarker.MarkerListener contentAppearedListener;
    private static final Queue<com.oblador.performance.a> markBuffer = new ConcurrentLinkedQueue();
    private static boolean didEmit = false;
    private static final ReactMarker.MarkerListener startupMarkerListener = new ReactMarker.MarkerListener() { // from class: com.oblador.performance.e
        @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
        public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
            PerformanceModule.a(reactMarkerConstants, str, i10);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43977a;

        static {
            int[] iArr = new int[ReactMarkerConstants.values().length];
            f43977a = iArr;
            try {
                iArr[ReactMarkerConstants.CONTENT_APPEARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43977a[ReactMarkerConstants.RELOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43977a[ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43977a[ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43977a[ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43977a[ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43977a[ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43977a[ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43977a[ReactMarkerConstants.CREATE_REACT_CONTEXT_END.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43977a[ReactMarkerConstants.CREATE_REACT_CONTEXT_START.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f43977a[ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f43977a[ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f43977a[ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f43977a[ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f43977a[ReactMarkerConstants.CREATE_VIEW_MANAGERS_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f43977a[ReactMarkerConstants.CREATE_VIEW_MANAGERS_START.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f43977a[ReactMarkerConstants.DOWNLOAD_END.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f43977a[ReactMarkerConstants.DOWNLOAD_START.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f43977a[ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f43977a[ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f43977a[ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f43977a[ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f43977a[ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f43977a[ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f43977a[ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f43977a[ReactMarkerConstants.REACT_CONTEXT_THREAD_END.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f43977a[ReactMarkerConstants.REACT_CONTEXT_THREAD_START.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f43977a[ReactMarkerConstants.RUN_JS_BUNDLE_END.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f43977a[ReactMarkerConstants.RUN_JS_BUNDLE_START.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f43977a[ReactMarkerConstants.SETUP_REACT_CONTEXT_END.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f43977a[ReactMarkerConstants.SETUP_REACT_CONTEXT_START.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f43977a[ReactMarkerConstants.VM_INIT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
        }
    }

    public PerformanceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.contentAppearedListener = new ReactMarker.MarkerListener() { // from class: com.oblador.performance.d
            @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
            public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
                this.f43984a.lambda$new$1(reactMarkerConstants, str, i10);
            }
        };
        setupMarkerListener();
        setupNativeMarkerListener();
    }

    public static /* synthetic */ void a(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        switch (a.f43977a[reactMarkerConstants.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
            case 32:
                addMark(new b(getMarkName(reactMarkerConstants), SystemClock.uptimeMillis()));
                break;
            case 2:
                clearMarkBuffer();
                addMark(new b(BRIDGE_SETUP_START, SystemClock.uptimeMillis()));
                break;
        }
    }

    private static void addMark(com.oblador.performance.a aVar) {
        markBuffer.add(aVar);
    }

    private static void clearMarkBuffer() {
        g.c().a();
        Iterator<com.oblador.performance.a> it = markBuffer.iterator();
        while (it.hasNext()) {
            if (it.next().d()) {
                it.remove();
            }
        }
    }

    private void emit(c cVar) {
        Arguments.createMap();
        throw null;
    }

    private void emitBufferedMarks() {
        didEmit = true;
        Iterator<com.oblador.performance.a> it = markBuffer.iterator();
        while (it.hasNext()) {
            emitMark(it.next());
        }
        emitNativeBufferedMarks();
    }

    private void emitMark(com.oblador.performance.a aVar) {
        if (aVar instanceof b) {
            emit((b) aVar);
        }
    }

    private void emitNativeBufferedMarks() {
        Iterator it = g.c().b().iterator();
        while (it.hasNext()) {
            emitMark((com.oblador.performance.a) it.next());
        }
    }

    private void emitNativeStartupTime() {
        safelyEmitMark(new b("nativeLaunchStart", StartTimeProvider.b()));
        safelyEmitMark(new b("nativeLaunchEnd", StartTimeProvider.a()));
    }

    private static String getMarkName(ReactMarkerConstants reactMarkerConstants) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : reactMarkerConstants.toString().toLowerCase().split("_")) {
            if (stringBuffer.length() == 0) {
                stringBuffer.append(str);
            } else {
                stringBuffer.append(Character.toUpperCase(str.charAt(0)));
                if (str.length() > 1) {
                    stringBuffer.append(str.substring(1, str.length()));
                }
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        int i11 = a.f43977a[reactMarkerConstants.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            eventsBuffered = true;
        } else {
            eventsBuffered = false;
            emitNativeStartupTime();
            emitBufferedMarks();
        }
    }

    private void safelyEmitMark(com.oblador.performance.a aVar) {
        if (eventsBuffered) {
            addMark(aVar);
        } else {
            emitMark(aVar);
        }
    }

    public static void setupListener() {
        ReactMarker.addListener(startupMarkerListener);
    }

    private void setupMarkerListener() {
        ReactMarker.addListener(this.contentAppearedListener);
    }

    private void setupNativeMarkerListener() {
        g.c().addListener(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNPerformanceManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        g.c().removeListener(this);
        ReactMarker.removeListener(this.contentAppearedListener);
    }

    public void logMarker(com.oblador.performance.a aVar) {
        if (didEmit) {
            emitMark(aVar);
        }
    }

    private void emit(b bVar) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("name", bVar.b());
        writableMapCreateMap.putDouble("startTime", bVar.c());
        if (bVar.a() != null) {
            writableMapCreateMap.putMap("detail", Arguments.fromBundle(bVar.a()));
        }
        if (getReactApplicationContext().hasActiveReactInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("mark", writableMapCreateMap);
        }
    }

    public void addListener(String str) {
    }

    public void removeListeners(double d10) {
    }
}
