package com.facebook.yoga;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class t extends YogaNodeJNIBase {
    public t(c cVar) {
        super(cVar);
    }

    protected void finalize() throws Throwable {
        try {
            u0();
        } finally {
            super.finalize();
        }
    }

    public void u0() {
        long j10 = this.f38635f;
        if (j10 != 0) {
            this.f38635f = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }
}
