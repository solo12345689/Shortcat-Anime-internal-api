package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.blob.BlobCollector;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/modules/blob/BlobCollector;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lcom/facebook/react/modules/blob/BlobModule;", "blobModule", "LTd/L;", "b", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/modules/blob/BlobModule;)V", "", "jsContext", "nativeInstall", "(Ljava/lang/Object;J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlobCollector {

    /* JADX INFO: renamed from: a */
    public static final BlobCollector f36945a = new BlobCollector();

    static {
        SoLoader.t("reactnativeblob");
    }

    private BlobCollector() {
    }

    public static final void b(final ReactContext reactContext, final BlobModule blobModule) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(blobModule, "blobModule");
        reactContext.runOnJSQueueThread(new Runnable() { // from class: o7.a
            @Override // java.lang.Runnable
            public final void run() {
                BlobCollector.c(reactContext, blobModule);
            }
        });
    }

    public static final void c(ReactContext reactContext, BlobModule blobModule) {
        JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
        if (javaScriptContextHolder == null || javaScriptContextHolder.getContext() == 0) {
            return;
        }
        f36945a.nativeInstall(blobModule, javaScriptContextHolder.getContext());
    }

    private final native void nativeInstall(Object blobModule, long jsContext);
}
