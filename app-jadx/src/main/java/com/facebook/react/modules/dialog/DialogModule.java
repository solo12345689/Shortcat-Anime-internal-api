package com.facebook.react.modules.dialog;

import Td.z;
import Ud.S;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.K;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "DialogManagerAndroid")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0003\"#$B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u000eR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0018\u00010\u001dR\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/dialog/DialogModule;", "Lcom/facebook/fbreact/specs/NativeDialogManagerAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "LTd/L;", "initialize", "()V", "onHostPause", "onHostDestroy", "onHostResume", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Callback;", "errorCallback", "actionCallback", "showAlert", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "invalidate", "", "isInForeground", "Z", "Lcom/facebook/react/modules/dialog/DialogModule$c;", "getFragmentManagerHelper", "()Lcom/facebook/react/modules/dialog/DialogModule$c;", "fragmentManagerHelper", "Companion", "c", "a", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    public static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    private static final String KEY_CANCELABLE = "cancelable";
    private static final String KEY_ITEMS = "items";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    private boolean isInForeground;
    public static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    public static final String ACTION_DISMISSED = "dismissed";
    private static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    private static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    private static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    private static final Map<String, Object> CONSTANTS = S.l(z.a(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED), z.a(ACTION_DISMISSED, ACTION_DISMISSED), z.a(KEY_BUTTON_POSITIVE, -1), z.a(KEY_BUTTON_NEGATIVE, -2), z.a(KEY_BUTTON_NEUTRAL, -3));

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class a implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Callback f37017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DialogModule f37019c;

        public a(DialogModule dialogModule, Callback callback) {
            AbstractC5504s.h(callback, "callback");
            this.f37019c = dialogModule;
            this.f37017a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int i10) {
            AbstractC5504s.h(dialog, "dialog");
            if (this.f37018b || !this.f37019c.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f37017a.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i10));
            this.f37018b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f37018b || !this.f37019c.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f37017a.invoke(DialogModule.ACTION_DISMISSED);
            this.f37018b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f37020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.facebook.react.modules.dialog.a f37021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DialogModule f37022c;

        public c(DialogModule dialogModule, K fragmentManager) {
            AbstractC5504s.h(fragmentManager, "fragmentManager");
            this.f37022c = dialogModule;
            this.f37020a = fragmentManager;
        }

        public final void a() {
            com.facebook.react.modules.dialog.a aVar;
            if (this.f37022c.isInForeground && (aVar = (com.facebook.react.modules.dialog.a) this.f37020a.q0(DialogModule.FRAGMENT_TAG)) != null && aVar.isResumed()) {
                aVar.z();
            }
        }

        public final void b(Bundle arguments, Callback callback) {
            AbstractC5504s.h(arguments, "arguments");
            UiThreadUtil.assertOnUiThread();
            a();
            com.facebook.react.modules.dialog.a aVar = new com.facebook.react.modules.dialog.a(callback != null ? new a(this.f37022c, callback) : null, arguments);
            if (!this.f37022c.isInForeground || this.f37020a.X0()) {
                this.f37021b = aVar;
                return;
            }
            if (arguments.containsKey(DialogModule.KEY_CANCELABLE)) {
                aVar.J(arguments.getBoolean(DialogModule.KEY_CANCELABLE));
            }
            aVar.M(this.f37020a, DialogModule.FRAGMENT_TAG);
        }

        public final void c() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(this.f37022c.isInForeground, "showPendingAlert() called in background");
            com.facebook.react.modules.dialog.a aVar = this.f37021b;
            if (aVar == null) {
                return;
            }
            a();
            aVar.M(this.f37020a, DialogModule.FRAGMENT_TAG);
            this.f37021b = null;
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final c getFragmentManagerHelper() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (!(currentActivity instanceof AbstractActivityC2842v)) {
            return null;
        }
        K kC = ((AbstractActivityC2842v) currentActivity).C();
        AbstractC5504s.g(kC, "getSupportFragmentManager(...)");
        return new c(this, kC);
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.c();
        } else {
            AbstractC7283a.E(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(ReadableMap options, Callback errorCallback, final Callback actionCallback) {
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(errorCallback, "errorCallback");
        AbstractC5504s.h(actionCallback, "actionCallback");
        final c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            errorCallback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        final Bundle bundle = new Bundle();
        if (options.hasKey("title")) {
            bundle.putString("title", options.getString("title"));
        }
        if (options.hasKey(KEY_MESSAGE)) {
            bundle.putString(KEY_MESSAGE, options.getString(KEY_MESSAGE));
        }
        if (options.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", options.getString(KEY_BUTTON_POSITIVE));
        }
        if (options.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", options.getString(KEY_BUTTON_NEGATIVE));
        }
        if (options.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", options.getString(KEY_BUTTON_NEUTRAL));
        }
        if (options.hasKey(KEY_ITEMS)) {
            ReadableArray array = options.getArray(KEY_ITEMS);
            if (array == null) {
                throw new IllegalStateException("Required value was null.");
            }
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            int size = array.size();
            for (int i10 = 0; i10 < size; i10++) {
                charSequenceArr[i10] = array.getString(i10);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (options.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, options.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.dialog.b
            @Override // java.lang.Runnable
            public final void run() {
                fragmentManagerHelper.b(bundle, actionCallback);
            }
        });
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }
}
