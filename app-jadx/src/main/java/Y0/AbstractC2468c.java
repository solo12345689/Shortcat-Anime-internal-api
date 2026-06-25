package Y0;

import Y0.K;
import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Y0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2468c implements InterfaceC2484t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f22650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K.d f22651c;

    /* JADX INFO: renamed from: Y0.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        Object a(Context context, AbstractC2468c abstractC2468c, Zd.e eVar);

        Typeface b(Context context, AbstractC2468c abstractC2468c);
    }

    public /* synthetic */ AbstractC2468c(int i10, a aVar, K.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, aVar, dVar);
    }

    @Override // Y0.InterfaceC2484t
    public final int a() {
        return this.f22649a;
    }

    public final a d() {
        return this.f22650b;
    }

    public final K.d e() {
        return this.f22651c;
    }

    private AbstractC2468c(int i10, a aVar, K.d dVar) {
        this.f22649a = i10;
        this.f22650b = aVar;
        this.f22651c = dVar;
    }
}
