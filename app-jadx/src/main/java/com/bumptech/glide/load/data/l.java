package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f35716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f35717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f35718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f35719d;

    l(ContentResolver contentResolver, Uri uri, boolean z10) {
        this.f35718c = contentResolver;
        this.f35717b = uri;
        this.f35716a = z10;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f35719d;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public S4.a d() {
        return S4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.g gVar, d.a aVar) {
        try {
            Object objF = f(this.f35717b, this.f35718c);
            this.f35719d = objF;
            aVar.f(objF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    protected abstract Object f(Uri uri, ContentResolver contentResolver);

    protected AssetFileDescriptor g(Uri uri) {
        return (this.f35716a && T4.c.d(uri) && T4.c.c()) ? T4.c.h(uri, this.f35718c) : this.f35718c.openAssetFileDescriptor(uri, "r");
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
