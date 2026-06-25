package com.facebook.react.modules.blob;

import android.util.Base64;
import com.amazon.device.iap.internal.c.b;
import com.facebook.fbreact.specs.NativeFileReaderModuleSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.nio.charset.Charset;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = NativeFileReaderModuleSpec.NAME)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/modules/blob/FileReaderModule;", "Lcom/facebook/fbreact/specs/NativeFileReaderModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "reason", "Lcom/facebook/react/modules/blob/BlobModule;", "getBlobModule", "(Ljava/lang/String;)Lcom/facebook/react/modules/blob/BlobModule;", "Lcom/facebook/react/bridge/ReadableMap;", "blob", "encoding", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "LTd/L;", "readAsText", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "readAsDataURL", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileReaderModule extends NativeFileReaderModuleSpec {
    private static final String ERROR_INVALID_BLOB = "ERROR_INVALID_BLOB";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String NAME = NativeFileReaderModuleSpec.NAME;

    /* JADX INFO: renamed from: com.facebook.react.modules.blob.FileReaderModule$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return FileReaderModule.NAME;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReaderModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
    }

    private final BlobModule getBlobModule(String reason) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (BlobModule) reactApplicationContextIfActiveOrWarn.getNativeModule(BlobModule.class);
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsDataURL(ReadableMap blob, Promise promise) {
        String string;
        AbstractC5504s.h(blob, "blob");
        AbstractC5504s.h(promise, "promise");
        BlobModule blobModule = getBlobModule("readAsDataURL");
        if (blobModule == null) {
            promise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        String string2 = blob.getString("blobId");
        if (string2 == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob does not contain a blobId");
            return;
        }
        byte[] bArrResolve = blobModule.resolve(string2, blob.getInt(b.as), blob.getInt("size"));
        if (bArrResolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("data:");
            if (!blob.hasKey("type") || (string = blob.getString("type")) == null || string.length() == 0) {
                sb2.append("application/octet-stream");
            } else {
                sb2.append(blob.getString("type"));
            }
            sb2.append(";base64,");
            sb2.append(Base64.encodeToString(bArrResolve, 2));
            promise.resolve(sb2.toString());
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeFileReaderModuleSpec
    public void readAsText(ReadableMap blob, String encoding, Promise promise) {
        AbstractC5504s.h(blob, "blob");
        AbstractC5504s.h(encoding, "encoding");
        AbstractC5504s.h(promise, "promise");
        BlobModule blobModule = getBlobModule("readAsText");
        if (blobModule == null) {
            promise.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        String string = blob.getString("blobId");
        if (string == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob does not contain a blobId");
            return;
        }
        byte[] bArrResolve = blobModule.resolve(string, blob.getInt(b.as), blob.getInt("size"));
        if (bArrResolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            Charset charsetForName = Charset.forName(encoding);
            AbstractC5504s.g(charsetForName, "forName(...)");
            promise.resolve(new String(bArrResolve, charsetForName));
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }
}
