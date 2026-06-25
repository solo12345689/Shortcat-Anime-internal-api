package io.sentry.android.replay.video;

import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f50449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f50454f;

    public a(File file, int i10, int i11, int i12, int i13, String mimeType) {
        AbstractC5504s.h(file, "file");
        AbstractC5504s.h(mimeType, "mimeType");
        this.f50449a = file;
        this.f50450b = i10;
        this.f50451c = i11;
        this.f50452d = i12;
        this.f50453e = i13;
        this.f50454f = mimeType;
    }

    public final int a() {
        return this.f50453e;
    }

    public final File b() {
        return this.f50449a;
    }

    public final int c() {
        return this.f50452d;
    }

    public final String d() {
        return this.f50454f;
    }

    public final int e() {
        return this.f50451c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC5504s.c(this.f50449a, aVar.f50449a) && this.f50450b == aVar.f50450b && this.f50451c == aVar.f50451c && this.f50452d == aVar.f50452d && this.f50453e == aVar.f50453e && AbstractC5504s.c(this.f50454f, aVar.f50454f);
    }

    public final int f() {
        return this.f50450b;
    }

    public int hashCode() {
        return (((((((((this.f50449a.hashCode() * 31) + Integer.hashCode(this.f50450b)) * 31) + Integer.hashCode(this.f50451c)) * 31) + Integer.hashCode(this.f50452d)) * 31) + Integer.hashCode(this.f50453e)) * 31) + this.f50454f.hashCode();
    }

    public String toString() {
        return "MuxerConfig(file=" + this.f50449a + ", recordingWidth=" + this.f50450b + ", recordingHeight=" + this.f50451c + ", frameRate=" + this.f50452d + ", bitRate=" + this.f50453e + ", mimeType=" + this.f50454f + ')';
    }

    public /* synthetic */ a(File file, int i10, int i11, int i12, int i13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i10, i11, i12, i13, (i14 & 32) != 0 ? "video/avc" : str);
    }
}
