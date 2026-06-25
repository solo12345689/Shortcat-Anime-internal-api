package com.facebook.yoga;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends c {

    /* JADX INFO: renamed from: c */
    long f38660c;

    private e(long j10) {
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f38660c = j10;
    }

    @Override // com.facebook.yoga.c
    public void a(k kVar) {
        YogaNative.jni_YGConfigSetErrataJNI(this.f38660c, kVar.b());
    }

    @Override // com.facebook.yoga.c
    public void b(float f10) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f38660c, f10);
    }

    e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
