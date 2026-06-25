package O8;

import R8.AbstractC2113n;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends S8.a {
    public static final Parcelable.Creator<c> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f13052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f13053d;

    public c(String str, int i10, long j10, boolean z10) {
        this.f13050a = str;
        this.f13051b = i10;
        this.f13052c = j10;
        this.f13053d = z10;
    }

    public boolean c() {
        return this.f13053d;
    }

    public long d() {
        long j10 = this.f13052c;
        return j10 == -1 ? this.f13051b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (AbstractC2113n.a(getName(), cVar.getName()) && d() == cVar.d() && c() == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f13050a;
    }

    public final int hashCode() {
        return AbstractC2113n.b(getName(), Long.valueOf(d()), Boolean.valueOf(c()));
    }

    public final String toString() {
        AbstractC2113n.a aVarC = AbstractC2113n.c(this);
        aVarC.a("name", getName());
        aVarC.a(DiagnosticsEntry.VERSION_KEY, Long.valueOf(d()));
        aVarC.a("is_fully_rolled_out", Boolean.valueOf(c()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.q(parcel, 1, getName(), false);
        S8.c.j(parcel, 2, this.f13051b);
        S8.c.n(parcel, 3, d());
        S8.c.c(parcel, 4, c());
        S8.c.b(parcel, iA);
    }

    public c(String str, long j10) {
        this(str, -1, j10, false);
    }
}
