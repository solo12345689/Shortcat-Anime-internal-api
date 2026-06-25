package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends l {
    public a(ContentResolver contentResolver, Uri uri, boolean z10) {
        super(contentResolver, uri, z10);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return AssetFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorG = g(uri);
        if (assetFileDescriptorG != null) {
            return assetFileDescriptorG;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
