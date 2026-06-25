package com.facebook.yoga;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends e {
    public void c() {
        long j10 = this.f38660c;
        if (j10 != 0) {
            this.f38660c = 0L;
            YogaNative.jni_YGConfigFreeJNI(j10);
        }
    }

    protected void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
