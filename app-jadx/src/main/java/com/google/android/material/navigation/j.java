package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements androidx.appcompat.view.menu.j {

    /* JADX INFO: renamed from: a */
    private i f42746a;

    /* JADX INFO: renamed from: b */
    private boolean f42747b = false;

    /* JADX INFO: renamed from: c */
    private int f42748c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0644a();

        /* JADX INFO: renamed from: a */
        int f42749a;

        /* JADX INFO: renamed from: b */
        com.google.android.material.internal.g f42750b;

        /* JADX INFO: renamed from: com.google.android.material.navigation.j$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0644a implements Parcelable.Creator {
            C0644a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f42749a);
            parcel.writeParcelable(this.f42750b, 0);
        }

        a(Parcel parcel) {
            this.f42749a = parcel.readInt();
            this.f42750b = (com.google.android.material.internal.g) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void b(int i10) {
        this.f42748c = i10;
    }

    public void c(i iVar) {
        this.f42746a = iVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.f42746a.s(aVar.f42749a);
            this.f42746a.q(q9.c.c(this.f42746a.getContext(), aVar.f42750b));
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(androidx.appcompat.view.menu.m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f42748c;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        a aVar = new a();
        aVar.f42749a = this.f42746a.getSelectedItemId();
        aVar.f42750b = q9.c.d(this.f42746a.getBadgeDrawables());
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        if (this.f42747b) {
            return;
        }
        if (z10) {
            this.f42746a.d();
        } else {
            this.f42746a.t();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f42746a.a(eVar);
    }

    public void m(boolean z10) {
        this.f42747b = z10;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
    }
}
