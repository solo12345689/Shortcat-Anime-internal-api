package Ue;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends Ue.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f19574h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f19575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f19576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f19577k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19578g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        c cVar = new c(2, 1, 0);
        f19575i = cVar;
        f19576j = cVar.m();
        f19577k = new c(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        AbstractC5504s.h(versionArray, "versionArray");
        this.f19578g = z10;
    }

    private final boolean i(c cVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(cVar);
    }

    private final boolean l(c cVar) {
        if (a() > cVar.a()) {
            return true;
        }
        return a() >= cVar.a() && b() > cVar.b();
    }

    public final boolean h(c metadataVersionFromLanguageVersion) {
        AbstractC5504s.h(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        return i(metadataVersionFromLanguageVersion.k(this.f19578g));
    }

    public final boolean j() {
        return this.f19578g;
    }

    public final c k(boolean z10) {
        c cVar = z10 ? f19575i : f19576j;
        return cVar.l(this) ? cVar : this;
    }

    public final c m() {
        return (a() == 1 && b() == 9) ? new c(2, 0, 0) : new c(a(), b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int... numbers) {
        this(numbers, false);
        AbstractC5504s.h(numbers, "numbers");
    }
}
