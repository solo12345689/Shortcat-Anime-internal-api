package d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import d.InterfaceC4548a;

/* JADX INFO: renamed from: d.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C4549b implements Parcelable {
    public static final Parcelable.Creator<C4549b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f44890a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f44891b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    InterfaceC4548a f44892c;

    /* JADX INFO: renamed from: d.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4549b createFromParcel(Parcel parcel) {
            return new C4549b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4549b[] newArray(int i10) {
            return new C4549b[i10];
        }
    }

    /* JADX INFO: renamed from: d.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class BinderC0706b extends InterfaceC4548a.AbstractBinderC0704a {
        BinderC0706b() {
        }

        @Override // d.InterfaceC4548a
        public void H1(int i10, Bundle bundle) {
            C4549b c4549b = C4549b.this;
            Handler handler = c4549b.f44891b;
            if (handler != null) {
                handler.post(c4549b.new c(i10, bundle));
            } else {
                c4549b.a(i10, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: d.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f44894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f44895b;

        c(int i10, Bundle bundle) {
            this.f44894a = i10;
            this.f44895b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4549b.this.a(this.f44894a, this.f44895b);
        }
    }

    C4549b(Parcel parcel) {
        this.f44892c = InterfaceC4548a.AbstractBinderC0704a.c(parcel.readStrongBinder());
    }

    public void b(int i10, Bundle bundle) {
        if (this.f44890a) {
            Handler handler = this.f44891b;
            if (handler != null) {
                handler.post(new c(i10, bundle));
                return;
            } else {
                a(i10, bundle);
                return;
            }
        }
        InterfaceC4548a interfaceC4548a = this.f44892c;
        if (interfaceC4548a != null) {
            try {
                interfaceC4548a.H1(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f44892c == null) {
                    this.f44892c = new BinderC0706b();
                }
                parcel.writeStrongBinder(this.f44892c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void a(int i10, Bundle bundle) {
    }
}
