package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f35693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f35694c;

    public b(AssetManager assetManager, String str) {
        this.f35693b = assetManager;
        this.f35692a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f35694c;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public S4.a d() {
        return S4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a aVar) {
        try {
            Object objF = f(this.f35693b, this.f35692a);
            this.f35694c = objF;
            aVar.f(objF);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }

    protected abstract Object f(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
