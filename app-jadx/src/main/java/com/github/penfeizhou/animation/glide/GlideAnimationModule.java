package com.github.penfeizhou.animation.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.h;
import i5.AbstractC5037b;
import i8.c;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class GlideAnimationModule extends AbstractC5037b {
    @Override // i5.AbstractC5037b
    public void a(Context context, com.bumptech.glide.b bVar, h hVar) {
        super.a(context, bVar, hVar);
        i8.b bVar2 = new i8.b();
        hVar.o(InputStream.class, com.github.penfeizhou.animation.decode.b.class, new c(bVar2));
        hVar.o(ByteBuffer.class, com.github.penfeizhou.animation.decode.b.class, bVar2);
        hVar.t(com.github.penfeizhou.animation.decode.b.class, Drawable.class, new b());
        hVar.t(com.github.penfeizhou.animation.decode.b.class, Bitmap.class, new a(bVar.g()));
    }
}
