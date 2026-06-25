package com.facebook.react.modules.image;

import C5.a;
import Td.L;
import android.net.Uri;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.image.f;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import u7.C6742b;
import w5.C6944a;
import z6.C7305t;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "ImageLoader")
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001AB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010:R$\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "Lz6/t;", "imagePipeline", "Lcom/facebook/react/views/image/f;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lz6/t;Lcom/facebook/react/views/image/f;)V", "", "requestId", "LI5/c;", "Ljava/lang/Void;", "request", "LTd/L;", "registerRequest", "(ILI5/c;)V", "removeRequest", "(I)LI5/c;", "", "uriString", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "Lz6/t;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "Lcom/facebook/react/views/image/f;", "getCallerContext", "()Ljava/lang/Object;", "value", "getImagePipeline", "()Lz6/t;", "setImagePipeline", "(Lz6/t;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private C7305t _imagePipeline;
    private final Object callerContext;
    private f callerContextFactory;
    private final Object enqueuedRequestMonitor;
    private final SparseArray<I5.c> enqueuedRequests;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends I5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f37031a;

        b(Promise promise) {
            this.f37031a = promise;
        }

        @Override // I5.b
        protected void e(I5.c dataSource) {
            AbstractC5504s.h(dataSource, "dataSource");
            this.f37031a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, dataSource.c());
        }

        @Override // I5.b
        protected void f(I5.c dataSource) {
            AbstractC5504s.h(dataSource, "dataSource");
            if (dataSource.isFinished()) {
                a aVar = (a) dataSource.a();
                try {
                    if (aVar == null) {
                        this.f37031a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                        return;
                    }
                    Object objC = aVar.C();
                    AbstractC5504s.g(objC, "get(...)");
                    E6.e eVar = (E6.e) objC;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                    readableMapBuilder.put("width", eVar.getWidth());
                    readableMapBuilder.put("height", eVar.getHeight());
                    this.f37031a.resolve(writableMapCreateMap);
                } catch (Exception e10) {
                    this.f37031a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e10);
                } finally {
                    a.m(aVar);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends I5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f37032a;

        c(Promise promise) {
            this.f37032a = promise;
        }

        @Override // I5.b
        protected void e(I5.c dataSource) {
            AbstractC5504s.h(dataSource, "dataSource");
            this.f37032a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, dataSource.c());
        }

        @Override // I5.b
        protected void f(I5.c dataSource) {
            AbstractC5504s.h(dataSource, "dataSource");
            if (dataSource.isFinished()) {
                a aVar = (a) dataSource.a();
                try {
                    if (aVar == null) {
                        this.f37032a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                        return;
                    }
                    Object objC = aVar.C();
                    AbstractC5504s.g(objC, "get(...)");
                    E6.e eVar = (E6.e) objC;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
                    readableMapBuilder.put("width", eVar.getWidth());
                    readableMapBuilder.put("height", eVar.getHeight());
                    this.f37032a.resolve(writableMapCreateMap);
                } catch (Exception e10) {
                    this.f37032a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e10);
                } finally {
                    a.m(aVar);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends I5.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f37035c;

        d(int i10, Promise promise) {
            this.f37034b = i10;
            this.f37035c = promise;
        }

        @Override // I5.b
        protected void e(I5.c dataSource) {
            AbstractC5504s.h(dataSource, "dataSource");
            try {
                ImageLoaderModule.this.removeRequest(this.f37034b);
                this.f37035c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, dataSource.c());
            } finally {
                dataSource.close();
            }
        }

        @Override // I5.b
        protected void f(I5.c dataSource) {
            AbstractC5504s.h(dataSource, "dataSource");
            if (dataSource.isFinished()) {
                try {
                    ImageLoaderModule.this.removeRequest(this.f37034b);
                    this.f37035c.resolve(Boolean.TRUE);
                } catch (Exception e10) {
                    this.f37035c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, e10);
                } finally {
                    dataSource.close();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f37036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageLoaderModule f37037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReadableArray f37038c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Promise promise, ImageLoaderModule imageLoaderModule, ReadableArray readableArray, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f37036a = promise;
            this.f37037b = imageLoaderModule;
            this.f37038c = readableArray;
            AbstractC5504s.e(reactApplicationContext);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... params) {
            AbstractC5504s.h(params, "params");
            ImageLoaderModule imageLoaderModule = this.f37037b;
            ReadableArray readableArray = this.f37038c;
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            C7305t imagePipeline = imageLoaderModule.getImagePipeline();
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                String string = readableArray.getString(i10);
                if (string != null && string.length() != 0) {
                    Uri uri = Uri.parse(string);
                    if (imagePipeline.u(uri)) {
                        readableMapBuilder.put(string, "memory");
                    } else if (imagePipeline.w(uri)) {
                        readableMapBuilder.put(string, "disk");
                    }
                }
            }
            this.f37036a.resolve(writableMapCreateMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    private final Object getCallerContext() {
        return this.callerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7305t getImagePipeline() {
        C7305t c7305t = this._imagePipeline;
        if (c7305t != null) {
            return c7305t;
        }
        C7305t c7305tA = O5.d.a();
        AbstractC5504s.g(c7305tA, "getImagePipeline(...)");
        return c7305tA;
    }

    private final void registerRequest(int requestId, I5.c request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
            L l10 = L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final I5.c removeRequest(int requestId) {
        I5.c cVar;
        synchronized (this.enqueuedRequestMonitor) {
            cVar = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return cVar;
    }

    private final void setImagePipeline(C7305t c7305t) {
        this._imagePipeline = c7305t;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        I5.c cVarRemoveRequest = removeRequest((int) requestId);
        if (cVarRemoveRequest != null) {
            cVarRemoveRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String uriString, Promise promise) {
        AbstractC5504s.h(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        K6.b bVarA = K6.c.x(new N7.a(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).f()).a();
        AbstractC5504s.g(bVarA, "build(...)");
        getImagePipeline().k(bVarA, getCallerContext()).f(new b(promise), C6944a.b());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String uriString, ReadableMap headers, Promise promise) {
        AbstractC5504s.h(promise, "promise");
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        K6.c cVarX = K6.c.x(new N7.a(reactApplicationContext, uriString, 0.0d, 0.0d, null, 28, null).f());
        AbstractC5504s.g(cVarX, "newBuilderWithSource(...)");
        getImagePipeline().k(C6742b.a.b(C6742b.f61408D, cVarX, headers, null, 4, null), getCallerContext()).f(new c(promise), C6944a.b());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i10 = 0; i10 < size; i10++) {
                    I5.c cVarValueAt = this.enqueuedRequests.valueAt(i10);
                    AbstractC5504s.g(cVarValueAt, "valueAt(...)");
                    cVarValueAt.close();
                }
                this.enqueuedRequests.clear();
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String uriString, double requestIdAsDouble, Promise promise) {
        AbstractC5504s.h(promise, "promise");
        int i10 = (int) requestIdAsDouble;
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        K6.b bVarA = K6.c.x(Uri.parse(uriString)).a();
        AbstractC5504s.g(bVarA, "build(...)");
        I5.c cVarB = getImagePipeline().B(bVarA, getCallerContext());
        d dVar = new d(i10, promise);
        registerRequest(i10, cVarB);
        cVarB.f(dVar, C6944a.b());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray uris, Promise promise) {
        AbstractC5504s.h(uris, "uris");
        AbstractC5504s.h(promise, "promise");
        new e(promise, this, uris, getReactApplicationContext()).executeOnExecutor(GuardedAsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, Object obj) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactContext, C7305t imagePipeline, f callerContextFactory) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(imagePipeline, "imagePipeline");
        AbstractC5504s.h(callerContextFactory, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        setImagePipeline(imagePipeline);
        this.callerContext = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
