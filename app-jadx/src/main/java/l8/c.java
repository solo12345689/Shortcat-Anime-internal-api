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
public class c extends S8.a {
    public static final Parcelable.Creator<c> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11319b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f11320a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11321b = false;

        public c a() {
            return new c(this.f11320a, this.f11321b);
        }

        public a b(List list) {
            AbstractC2115p.m(list, "Keys cannot be set to null");
            this.f11320a = list;
            return this;
        }
    }

    c(List list, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            }
            AbstractC2115p.p(z11, "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f11319b = z10;
        this.f11318a = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractC2115p.g(str, "Element in keys cannot be null or empty");
                this.f11318a.add(str);
            }
        }
    }

    public boolean c() {
        return this.f11319b;
    }

    public List d() {
        return Collections.unmodifiableList(this.f11318a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.r(parcel, 1, d(), false);
        S8.c.c(parcel, 2, c());
        S8.c.b(parcel, iA);
    }
}
