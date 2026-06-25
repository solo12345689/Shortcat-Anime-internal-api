package expo.modules.image.okhttp;

import android.content.Context;
import com.bumptech.glide.h;
import com.bumptech.glide.integration.okhttp3.a;
import dg.C4618A;
import expo.modules.image.okhttp.a;
import i5.AbstractC5037b;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/image/okhttp/ExpoImageOkHttpClientGlideModule;", "Li5/b;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/b;", "glide", "Lcom/bumptech/glide/h;", "registry", "LTd/L;", "a", "(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpoImageOkHttpClientGlideModule extends AbstractC5037b {
    @Override // i5.AbstractC5037b
    public void a(Context context, com.bumptech.glide.b glide, h registry) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(glide, "glide");
        AbstractC5504s.h(registry, "registry");
        C4618A c4618aC = new C4618A.a().g(b.f46107c).c();
        registry.u(Y4.h.class, InputStream.class, new a.C0598a(c4618aC));
        registry.p(Ob.b.class, InputStream.class, new a.C0731a(c4618aC));
    }
}
