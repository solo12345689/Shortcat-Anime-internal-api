package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.integration.avif.AvifGlideModule;
import com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule;
import com.github.penfeizhou.animation.glide.GlideAnimationModule;
import expo.modules.image.ExpoImageAppGlideModule;
import expo.modules.image.blurhash.BlurhashModule;
import expo.modules.image.dataurls.Base64Module;
import expo.modules.image.decodedsource.DecodedModule;
import expo.modules.image.okhttp.ExpoImageOkHttpClientGlideModule;
import expo.modules.image.svg.SVGModule;
import expo.modules.image.thumbhash.ThumbhashModule;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;", "Lcom/bumptech/glide/GeneratedAppGlideModule;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/bumptech/glide/b;", "glide", "Lcom/bumptech/glide/h;", "registry", "LTd/L;", "a", "(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V", "Lcom/bumptech/glide/c;", "builder", "b", "(Landroid/content/Context;Lcom/bumptech/glide/c;)V", "", "c", "()Z", "Lexpo/modules/image/ExpoImageAppGlideModule;", "Lexpo/modules/image/ExpoImageAppGlideModule;", "appGlideModule", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ExpoImageAppGlideModule appGlideModule;

    public GeneratedAppGlideModuleImpl(Context context) {
        AbstractC5504s.h(context, "context");
        this.appGlideModule = new ExpoImageAppGlideModule();
    }

    @Override // i5.AbstractC5037b
    public void a(Context context, b glide, h registry) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(glide, "glide");
        AbstractC5504s.h(registry, "registry");
        new GlideAnimationModule().a(context, glide, registry);
        new AvifGlideModule().a(context, glide, registry);
        new OkHttpLibraryGlideModule().a(context, glide, registry);
        new SVGModule().a(context, glide, registry);
        new BlurhashModule().a(context, glide, registry);
        new Base64Module().a(context, glide, registry);
        new DecodedModule().a(context, glide, registry);
        new ThumbhashModule().a(context, glide, registry);
        new ExpoImageOkHttpClientGlideModule().a(context, glide, registry);
        this.appGlideModule.a(context, glide, registry);
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public void b(Context context, c builder) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(builder, "builder");
        this.appGlideModule.b(context, builder);
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public boolean c() {
        return false;
    }
}
