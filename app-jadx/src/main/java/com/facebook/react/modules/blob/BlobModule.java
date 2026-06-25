package com.facebook.react.modules.blob;

import Td.z;
import Ud.S;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.adjust.sdk.Constants;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import dg.D;
import dg.x;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.L;
import tg.C6686k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC5454a(name = "BlobModule")
@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0003;CF\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001NB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\nJ)\u0010$\u001a\u0004\u0018\u00010\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b$\u0010(J\u0017\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b$\u0010+J\u000f\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010\u0014J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010/J\u001f\u00101\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)2\u0006\u0010-\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00122\u0006\u00104\u001a\u0002032\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\"R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u0004\u0018\u00010I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O"}, d2 = {"Lcom/facebook/react/modules/blob/BlobModule;", "Lcom/facebook/fbreact/specs/NativeBlobModuleSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/net/Uri;", "contentUri", "", "getBytesFromUri", "(Landroid/net/Uri;)[B", "", "getNameFromUri", "(Landroid/net/Uri;)Ljava/lang/String;", "", "getLastModifiedFromUri", "(Landroid/net/Uri;)D", "getMimeTypeFromUri", "LTd/L;", "initialize", "()V", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "data", ProductResponseJsonKeys.STORE, "([B)Ljava/lang/String;", "blobId", "([BLjava/lang/String;)V", "", "getLengthOfBlob", "(Ljava/lang/String;)J", "remove", "(Ljava/lang/String;)V", "uri", "resolve", "", com.amazon.device.iap.internal.c.b.as, "size", "(Ljava/lang/String;II)[B", "Lcom/facebook/react/bridge/ReadableMap;", "blob", "(Lcom/facebook/react/bridge/ReadableMap;)[B", "addNetworkingHandler", "idDouble", "addWebSocketHandler", "(D)V", "removeWebSocketHandler", "sendOverSocket", "(Lcom/facebook/react/bridge/ReadableMap;D)V", "Lcom/facebook/react/bridge/ReadableArray;", "parts", "createFromParts", "(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;)V", "release", "Ljava/util/HashMap;", "blobs", "Ljava/util/HashMap;", "com/facebook/react/modules/blob/BlobModule$e", "webSocketContentHandler", "Lcom/facebook/react/modules/blob/BlobModule$e;", "Lcom/facebook/react/modules/network/NetworkingModule$d;", "networkingUriHandler", "Lcom/facebook/react/modules/network/NetworkingModule$d;", "getNetworkingUriHandler$ReactAndroid_release", "()Lcom/facebook/react/modules/network/NetworkingModule$d;", "com/facebook/react/modules/blob/BlobModule$b", "networkingRequestBodyHandler", "Lcom/facebook/react/modules/blob/BlobModule$b;", "com/facebook/react/modules/blob/BlobModule$c", "networkingResponseHandler", "Lcom/facebook/react/modules/blob/BlobModule$c;", "Lcom/facebook/react/modules/websocket/WebSocketModule;", "getWebSocketModule", "()Lcom/facebook/react/modules/websocket/WebSocketModule;", "webSocketModule", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlobModule extends NativeBlobModuleSpec {
    public static final String NAME = "BlobModule";
    private final HashMap<String, byte[]> blobs;
    private final b networkingRequestBodyHandler;
    private final c networkingResponseHandler;
    private final NetworkingModule.d networkingUriHandler;
    private final e webSocketContentHandler;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements NetworkingModule.b {
        b() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.b
        public boolean a(ReadableMap map) {
            AbstractC5504s.h(map, "map");
            return map.hasKey("blob");
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.b
        public D b(ReadableMap map, String str) {
            String string;
            AbstractC5504s.h(map, "map");
            if (map.hasKey("type") && (string = map.getString("type")) != null && string.length() != 0) {
                str = map.getString("type");
            }
            if (str == null) {
                str = "application/octet-stream";
            }
            ReadableMap map2 = map.getMap("blob");
            if (map2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            byte[] bArrResolve = BlobModule.this.resolve(map2.getString("blobId"), map2.getInt(com.amazon.device.iap.internal.c.b.as), map2.getInt("size"));
            if (bArrResolve != null) {
                return D.a.i(D.f45262a, x.f45605e.a(str), bArrResolve, 0, 0, 12, null);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements NetworkingModule.c {
        c() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.c
        public WritableMap a(byte[] data) {
            AbstractC5504s.h(data, "data");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("blobId", BlobModule.this.store(data));
            writableMapCreateMap.putInt(com.amazon.device.iap.internal.c.b.as, 0);
            writableMapCreateMap.putInt("size", data.length);
            return writableMapCreateMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.c
        public boolean b(String responseType) {
            AbstractC5504s.h(responseType, "responseType");
            return AbstractC5504s.c(responseType, "blob");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements NetworkingModule.d {
        d() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.d
        public Pair a(Uri uri) throws IOException {
            AbstractC5504s.h(uri, "uri");
            byte[] bytesFromUri = BlobModule.this.getBytesFromUri(uri);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("blobId", BlobModule.this.store(bytesFromUri));
            writableMapCreateMap.putInt(com.amazon.device.iap.internal.c.b.as, 0);
            writableMapCreateMap.putInt("size", bytesFromUri.length);
            writableMapCreateMap.putString("type", BlobModule.this.getMimeTypeFromUri(uri));
            writableMapCreateMap.putString("name", BlobModule.this.getNameFromUri(uri));
            writableMapCreateMap.putDouble("lastModified", BlobModule.this.getLastModifiedFromUri(uri));
            return z.a(writableMapCreateMap, bytesFromUri);
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.d
        public boolean b(Uri uri, String responseType) {
            AbstractC5504s.h(uri, "uri");
            AbstractC5504s.h(responseType, "responseType");
            String scheme = uri.getScheme();
            return (AbstractC5504s.c(scheme, "http") || AbstractC5504s.c(scheme, Constants.SCHEME) || !AbstractC5504s.c(responseType, "blob")) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements WebSocketModule.b {
        e() {
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public void a(String text, WritableMap params) {
            AbstractC5504s.h(text, "text");
            AbstractC5504s.h(params, "params");
            params.putString("data", text);
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public void b(C6686k byteString, WritableMap params) {
            AbstractC5504s.h(byteString, "byteString");
            AbstractC5504s.h(params, "params");
            byte[] bArrP = byteString.P();
            BlobModule blobModule = BlobModule.this;
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("blobId", blobModule.store(bArrP));
            readableMapBuilder.put(com.amazon.device.iap.internal.c.b.as, 0);
            readableMapBuilder.put("size", bArrP.length);
            params.putMap("data", writableMapCreateMap);
            params.putString("type", "blob");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlobModule(ReactApplicationContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.blobs = new HashMap<>();
        this.webSocketContentHandler = new e();
        this.networkingUriHandler = new d();
        this.networkingRequestBodyHandler = new b();
        this.networkingResponseHandler = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getBytesFromUri(Uri contentUri) throws IOException {
        InputStream inputStreamOpenInputStream = getReactApplicationContext().getContentResolver().openInputStream(contentUri);
        if (inputStreamOpenInputStream == null) {
            throw new FileNotFoundException("File not found for " + contentUri);
        }
        try {
            byte[] bArr = new byte[Math.max(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, inputStreamOpenInputStream.available())];
            L l10 = new L();
            byte[] bArr2 = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i10 = 0;
            while (true) {
                int i11 = inputStreamOpenInputStream.read(bArr);
                l10.f52257a = i11;
                if (i11 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, i10);
                i10 = l10.f52257a;
                byte[] bArr3 = bArr2;
                bArr2 = bArr;
                bArr = bArr3;
            }
            if (byteArrayOutputStream.size() == 0 && bArr2.length == i10) {
                inputStreamOpenInputStream.close();
                return bArr2;
            }
            byteArrayOutputStream.write(bArr2, 0, i10);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC5504s.g(byteArray, "toByteArray(...)");
            inputStreamOpenInputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            inputStreamOpenInputStream.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getLastModifiedFromUri(Uri contentUri) {
        if (AbstractC5504s.c(contentUri.getScheme(), "file")) {
            return new File(contentUri.toString()).lastModified();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMimeTypeFromUri(Uri contentUri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(contentUri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(contentUri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? "" : type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getNameFromUri(Uri contentUri) throws IOException {
        if (AbstractC5504s.c(contentUri.getScheme(), "file")) {
            return contentUri.getLastPathSegment();
        }
        Cursor cursorQuery = getReactApplicationContext().getContentResolver().query(contentUri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(0);
                    fe.c.a(cursorQuery, null);
                    return string;
                }
                Td.L l10 = Td.L.f17438a;
                fe.c.a(cursorQuery, null);
            } finally {
            }
        }
        return contentUri.getLastPathSegment();
    }

    private final WebSocketModule getWebSocketModule() {
        return (WebSocketModule) getReactApplicationContext().getNativeModule(WebSocketModule.class);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addNetworkingHandler() {
        NativeModule nativeModule = getReactApplicationContext().getNativeModule((Class<NativeModule>) NetworkingModule.class);
        if (nativeModule == null) {
            throw new IllegalStateException("Required value was null.");
        }
        NetworkingModule networkingModule = (NetworkingModule) nativeModule;
        networkingModule.addUriHandler$ReactAndroid_release(this.networkingUriHandler);
        networkingModule.addRequestBodyHandler$ReactAndroid_release(this.networkingRequestBodyHandler);
        networkingModule.addResponseHandler$ReactAndroid_release(this.networkingResponseHandler);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addWebSocketHandler(double idDouble) {
        int i10 = (int) idDouble;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i10, this.webSocketContentHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void createFromParts(ReadableArray parts, String blobId) {
        AbstractC5504s.h(parts, "parts");
        AbstractC5504s.h(blobId, "blobId");
        ArrayList arrayList = new ArrayList(parts.size());
        int size = parts.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = parts.getMap(i10);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String string = map.getString("type");
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (AbstractC5504s.c(string, "blob")) {
                ReadableMap map2 = map.getMap("data");
                if (map2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                length += map2.getInt("size");
                byte[] bArrResolve = resolve(map2);
                if (bArrResolve == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(i10, bArrResolve);
            } else {
                if (!AbstractC5504s.c(string, "string")) {
                    throw new IllegalArgumentException("Invalid type for blob: " + map.getString("type"));
                }
                String string2 = map.getString("data");
                if (string2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Charset charsetForName = Charset.forName(Constants.ENCODING);
                AbstractC5504s.g(charsetForName, "forName(...)");
                byte[] bytes = string2.getBytes(charsetForName);
                AbstractC5504s.g(bytes, "getBytes(...)");
                length += bytes.length;
                arrayList.add(i10, bytes);
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator it = arrayList.iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC5504s.g(next, "next(...)");
            byteBufferAllocate.put((byte[]) next);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        AbstractC5504s.g(bArrArray, "array(...)");
        store(bArrArray, blobId);
    }

    public final long getLengthOfBlob(String blobId) {
        long length;
        AbstractC5504s.h(blobId, "blobId");
        synchronized (this.blobs) {
            length = this.blobs.get(blobId) != null ? r4.length : 0L;
        }
        return length;
    }

    /* JADX INFO: renamed from: getNetworkingUriHandler$ReactAndroid_release, reason: from getter */
    public final NetworkingModule.d getNetworkingUriHandler() {
        return this.networkingUriHandler;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public Map<String, Object> getTypedExportedConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        return identifier == 0 ? S.i() : S.l(z.a("BLOB_URI_SCHEME", "content"), z.a("BLOB_URI_HOST", resources.getString(identifier)));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        AbstractC5504s.g(reactApplicationContext, "getReactApplicationContext(...)");
        BlobCollector.b(reactApplicationContext, this);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void release(String blobId) {
        AbstractC5504s.h(blobId, "blobId");
        remove(blobId);
    }

    public final void remove(String blobId) {
        AbstractC5504s.h(blobId, "blobId");
        synchronized (this.blobs) {
            this.blobs.remove(blobId);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void removeWebSocketHandler(double idDouble) {
        int i10 = (int) idDouble;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i10, null);
        }
    }

    public final byte[] resolve(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter(com.amazon.device.iap.internal.c.b.as);
        int i10 = queryParameter != null ? Integer.parseInt(queryParameter) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, i10, queryParameter2 != null ? Integer.parseInt(queryParameter2) : -1);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void sendOverSocket(ReadableMap blob, double idDouble) {
        byte[] bArrResolve;
        AbstractC5504s.h(blob, "blob");
        int i10 = (int) idDouble;
        WebSocketModule webSocketModule = getWebSocketModule();
        if (webSocketModule == null || (bArrResolve = resolve(blob.getString("blobId"), blob.getInt(com.amazon.device.iap.internal.c.b.as), blob.getInt("size"))) == null) {
            return;
        }
        C6686k.a aVar = C6686k.f61044d;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrResolve);
        AbstractC5504s.g(byteBufferWrap, "wrap(...)");
        webSocketModule.sendBinary(aVar.c(byteBufferWrap), i10);
    }

    public final String store(byte[] data) {
        AbstractC5504s.h(data, "data");
        String string = UUID.randomUUID().toString();
        AbstractC5504s.g(string, "toString(...)");
        store(data, string);
        return string;
    }

    public final void store(byte[] data, String blobId) {
        AbstractC5504s.h(data, "data");
        AbstractC5504s.h(blobId, "blobId");
        synchronized (this.blobs) {
            this.blobs.put(blobId, data);
            Td.L l10 = Td.L.f17438a;
        }
    }

    public final byte[] resolve(String blobId, int offset, int size) {
        synchronized (this.blobs) {
            try {
                byte[] bArr = this.blobs.get(blobId);
                if (bArr == null) {
                    return null;
                }
                if (size == -1) {
                    size = bArr.length - offset;
                }
                if (offset <= 0 && size == bArr.length) {
                    return bArr;
                }
                return Arrays.copyOfRange(bArr, offset, size + offset);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] resolve(ReadableMap blob) {
        AbstractC5504s.h(blob, "blob");
        return resolve(blob.getString("blobId"), blob.getInt(com.amazon.device.iap.internal.c.b.as), blob.getInt("size"));
    }
}
