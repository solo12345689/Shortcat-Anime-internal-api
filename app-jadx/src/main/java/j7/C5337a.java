package j7;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5337a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WritableMap f51663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f51664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f51665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f51666e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5337a(String taskKey, WritableMap data, long j10, boolean z10) {
        this(taskKey, data, j10, z10, null, 16, null);
        AbstractC5504s.h(taskKey, "taskKey");
        AbstractC5504s.h(data, "data");
    }

    public final WritableMap a() {
        return this.f51663b;
    }

    public final g b() {
        return this.f51666e;
    }

    public final String c() {
        return this.f51662a;
    }

    public final long d() {
        return this.f51664c;
    }

    public final boolean e() {
        return this.f51665d;
    }

    public C5337a(String taskKey, WritableMap data, long j10, boolean z10, g gVar) {
        AbstractC5504s.h(taskKey, "taskKey");
        AbstractC5504s.h(data, "data");
        this.f51662a = taskKey;
        this.f51663b = data;
        this.f51664c = j10;
        this.f51665d = z10;
        this.f51666e = gVar;
    }

    public /* synthetic */ C5337a(String str, WritableMap writableMap, long j10, boolean z10, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, writableMap, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? h.f51683b : gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5337a(C5337a source) {
        AbstractC5504s.h(source, "source");
        String str = source.f51662a;
        WritableMap writableMapCopy = source.f51663b.copy();
        long j10 = source.f51664c;
        boolean z10 = source.f51665d;
        g gVar = source.f51666e;
        this(str, writableMapCopy, j10, z10, gVar != null ? gVar.copy() : null);
    }
}
