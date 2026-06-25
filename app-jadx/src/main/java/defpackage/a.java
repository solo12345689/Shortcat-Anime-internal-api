package defpackage;

import H4.h;
import Zd.e;
import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements J4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f23491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23492c;

    public a(Context context, float f10) {
        AbstractC5504s.h(context, "context");
        this.f23490a = context;
        this.f23491b = f10;
        this.f23492c = a.class.getName() + '-' + f10;
    }

    @Override // J4.a
    public String a() {
        return this.f23492c;
    }

    @Override // J4.a
    public Object b(Bitmap bitmap, h hVar, e eVar) {
        return b.b(bitmap, this.f23490a, this.f23491b, false, 4, null);
    }
}
