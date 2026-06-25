package com.facebook.imagepipeline.nativecode;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f36001a;

    public static synchronized void a() {
        if (!f36001a) {
            R7.a.d("native-imagetranscoder");
            f36001a = true;
        }
    }
}
