package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class I extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36061d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f36062e = {"_id", "_data"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f36063c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Executor executor, B5.i pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(pooledByteBufferFactory, "pooledByteBufferFactory");
        AbstractC5504s.h(contentResolver, "contentResolver");
        this.f36063c = contentResolver;
    }

    private final E6.k g(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f36063c.openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            E6.k kVarE = e(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
            AbstractC5504s.g(kVarE, "getEncodedImage(...)");
            parcelFileDescriptorOpenFileDescriptor.close();
            return kVarE;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected E6.k d(K6.b imageRequest) throws IOException {
        E6.k kVarG;
        InputStream inputStreamCreateInputStream;
        AbstractC5504s.h(imageRequest, "imageRequest");
        Uri uriV = imageRequest.v();
        AbstractC5504s.g(uriV, "getSourceUri(...)");
        if (!G5.f.j(uriV)) {
            if (G5.f.i(uriV) && (kVarG = g(uriV)) != null) {
                return kVarG;
            }
            InputStream inputStreamOpenInputStream = this.f36063c.openInputStream(uriV);
            if (inputStreamOpenInputStream != null) {
                return e(inputStreamOpenInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String string = uriV.toString();
        AbstractC5504s.g(string, "toString(...)");
        if (Df.r.A(string, "/photo", false, 2, null)) {
            inputStreamCreateInputStream = this.f36063c.openInputStream(uriV);
        } else {
            String string2 = uriV.toString();
            AbstractC5504s.g(string2, "toString(...)");
            if (Df.r.A(string2, "/display_photo", false, 2, null)) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f36063c.openAssetFileDescriptor(uriV, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + uriV);
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f36063c, uriV);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + uriV);
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return e(inputStreamCreateInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalContentUriFetchProducer";
    }
}
