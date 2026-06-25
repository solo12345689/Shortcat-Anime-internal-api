package L8;

import R8.AbstractC2115p;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends S8.a {
    public static final Parcelable.Creator<d> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11323b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f11324a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11325b = false;

        public d a() {
            return new d(this.f11324a, this.f11325b);
        }

        public a b(boolean z10) {
            this.f11325b = z10;
            return this;
        }
    }

    d(List list, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            }
            AbstractC2115p.p(z11, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f11323b = z10;
        this.f11322a = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractC2115p.g(str, "Element in keys cannot be null or empty");
                this.f11322a.add(str);
            }
        }
    }

    public List c() {
        return Collections.unmodifiableList(this.f11322a);
    }

    public boolean d() {
        return this.f11323b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.r(parcel, 1, c(), false);
        S8.c.c(parcel, 2, d());
        S8.c.b(parcel, iA);
    }
}
