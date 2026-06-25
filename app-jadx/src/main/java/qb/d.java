package Qb;

import android.graphics.Bitmap;
import android.util.Base64;
import com.bumptech.glide.load.data.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14797a;

    public d(String str) {
        this.f14797a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public S4.a d() {
        return S4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g priority, d.a callback) {
        AbstractC5504s.h(priority, "priority");
        AbstractC5504s.h(callback, "callback");
        try {
            byte[] bArrDecode = Base64.decode(this.f14797a, 0);
            a aVar = a.f14786a;
            AbstractC5504s.e(bArrDecode);
            callback.f(aVar.b(bArrDecode));
        } catch (Exception e10) {
            callback.c(new b(this.f14797a, e10));
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
