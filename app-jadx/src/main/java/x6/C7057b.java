package x6;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import kotlin.jvm.internal.AbstractC5504s;
import s5.InterfaceC6433d;

/* JADX INFO: renamed from: x6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7057b implements InterfaceC6433d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y6.g f63935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y6.h f63936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y6.d f63937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC6433d f63938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f63939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f63940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f63941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f63942i;

    public C7057b(String sourceString, y6.g gVar, y6.h rotationOptions, y6.d imageDecodeOptions, InterfaceC6433d interfaceC6433d, String str) {
        AbstractC5504s.h(sourceString, "sourceString");
        AbstractC5504s.h(rotationOptions, "rotationOptions");
        AbstractC5504s.h(imageDecodeOptions, "imageDecodeOptions");
        this.f63934a = sourceString;
        this.f63935b = gVar;
        this.f63936c = rotationOptions;
        this.f63937d = imageDecodeOptions;
        this.f63938e = interfaceC6433d;
        this.f63939f = str;
        this.f63941h = (((((((((sourceString.hashCode() * 31) + (gVar != null ? gVar.hashCode() : 0)) * 31) + rotationOptions.hashCode()) * 31) + imageDecodeOptions.hashCode()) * 31) + (interfaceC6433d != null ? interfaceC6433d.hashCode() : 0)) * 31) + (str != null ? str.hashCode() : 0);
        this.f63942i = RealtimeSinceBootClock.get().now();
    }

    @Override // s5.InterfaceC6433d
    public String a() {
        return this.f63934a;
    }

    @Override // s5.InterfaceC6433d
    public boolean b(Uri uri) {
        AbstractC5504s.h(uri, "uri");
        String strA = a();
        String string = uri.toString();
        AbstractC5504s.g(string, "toString(...)");
        return Df.r.W(strA, string, false, 2, null);
    }

    @Override // s5.InterfaceC6433d
    public boolean c() {
        return false;
    }

    public final void d(Object obj) {
        this.f63940g = obj;
    }

    @Override // s5.InterfaceC6433d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC5504s.c(C7057b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC5504s.f(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.cache.BitmapMemoryCacheKey");
        C7057b c7057b = (C7057b) obj;
        return AbstractC5504s.c(this.f63934a, c7057b.f63934a) && AbstractC5504s.c(this.f63935b, c7057b.f63935b) && AbstractC5504s.c(this.f63936c, c7057b.f63936c) && AbstractC5504s.c(this.f63937d, c7057b.f63937d) && AbstractC5504s.c(this.f63938e, c7057b.f63938e) && AbstractC5504s.c(this.f63939f, c7057b.f63939f);
    }

    @Override // s5.InterfaceC6433d
    public int hashCode() {
        return this.f63941h;
    }

    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.f63934a + ", resizeOptions=" + this.f63935b + ", rotationOptions=" + this.f63936c + ", imageDecodeOptions=" + this.f63937d + ", postprocessorCacheKey=" + this.f63938e + ", postprocessorName=" + this.f63939f + ")";
    }
}
