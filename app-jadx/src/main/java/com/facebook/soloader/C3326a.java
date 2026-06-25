package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* JADX INFO: renamed from: com.facebook.soloader.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3326a extends E implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3331f f38568b;

    public C3326a(Context context, int i10) {
        this.f38567a = i10;
        this.f38568b = new C3331f(f(context), i10);
    }

    private static File f(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.w
    public E b(Context context) {
        this.f38568b = new C3331f(f(context), this.f38567a | 1);
        return this;
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return this.f38568b.d(str, i10, threadPolicy);
    }

    @Override // com.facebook.soloader.E
    protected void e(int i10) {
        this.f38568b.e(i10);
    }

    @Override // com.facebook.soloader.E
    public String toString() {
        return c() + "[" + this.f38568b.toString() + "]";
    }
}
