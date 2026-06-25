package Yc;

import android.content.Context;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Zc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f22902b;

    public b(Context context) {
        AbstractC5504s.h(context, "context");
        this.f22901a = context;
        this.f22902b = new h(context);
    }

    @Override // Zc.a
    public Pc.c a(Pc.c category) {
        AbstractC5504s.h(category, "category");
        return this.f22902b.e(category);
    }

    @Override // Zc.a
    public boolean b(String identifier) {
        AbstractC5504s.h(identifier, "identifier");
        return this.f22902b.d(identifier);
    }

    @Override // Zc.a
    public Collection c() {
        return this.f22902b.a();
    }
}
