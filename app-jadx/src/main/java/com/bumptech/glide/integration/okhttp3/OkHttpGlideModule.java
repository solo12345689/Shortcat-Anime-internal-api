package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.integration.okhttp3.a;
import i5.InterfaceC5036a;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class OkHttpGlideModule implements InterfaceC5036a {
    @Override // i5.InterfaceC5036a
    public void b(Context context, b bVar, h hVar) {
        hVar.u(Y4.h.class, InputStream.class, new a.C0598a());
    }

    @Override // i5.InterfaceC5036a
    public void a(Context context, c cVar) {
    }
}
