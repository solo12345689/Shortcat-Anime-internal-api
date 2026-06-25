package Kb;

import Df.r;
import android.util.Base64;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a */
    private final String f10973a;

    public a(String data) {
        AbstractC5504s.h(data, "data");
        this.f10973a = data;
    }

    private final String c() {
        String strSubstring = this.f10973a.substring(r.i0(this.f10973a, ',', 0, false, 6, null) + 1);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return ByteBuffer.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public S4.a d() {
        return S4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(g priority, d.a callback) {
        AbstractC5504s.h(priority, "priority");
        AbstractC5504s.h(callback, "callback");
        callback.f(ByteBuffer.wrap(Base64.decode(c(), 0)));
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
