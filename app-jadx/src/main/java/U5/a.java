package U5;

import S5.c;
import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f19355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f19356c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19357d = -1;

    public a(b bVar) {
        this.f19355b = bVar;
    }

    @Override // S5.c, S5.d
    public void n(String id2, Object obj, Animatable animatable) {
        AbstractC5504s.h(id2, "id");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f19357d = jCurrentTimeMillis;
        b bVar = this.f19355b;
        if (bVar != null) {
            bVar.a(jCurrentTimeMillis - this.f19356c);
        }
    }

    @Override // S5.c, S5.d
    public void r(String id2, Object obj) {
        AbstractC5504s.h(id2, "id");
        this.f19356c = System.currentTimeMillis();
    }
}
