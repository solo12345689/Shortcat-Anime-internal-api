package com.bumptech.glide.integration.avif;

import Q4.a;
import S4.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import b5.C2999a;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import i5.AbstractC5037b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class AvifGlideModule extends AbstractC5037b {
    @Override // i5.AbstractC5037b
    public void a(Context context, b bVar, h hVar) {
        a aVar = new a(bVar.g());
        hVar.q("Bitmap", ByteBuffer.class, Bitmap.class, aVar);
        hVar.q("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C2999a(context.getResources(), aVar));
        j bVar2 = new Q4.b(hVar.g(), aVar, bVar.f());
        hVar.q("Bitmap", InputStream.class, Bitmap.class, bVar2);
        hVar.q("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C2999a(context.getResources(), bVar2));
    }
}
