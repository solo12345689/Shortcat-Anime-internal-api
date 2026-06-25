package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC2857k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class Q implements Parcelable {
    public static final Parcelable.Creator<Q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f29832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f29833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f29834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f29835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f29836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f29837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f29838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f29839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f29840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f29841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f29842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f29843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final String f29844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f29845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f29846o;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Q createFromParcel(Parcel parcel) {
            return new Q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Q[] newArray(int i10) {
            return new Q[i10];
        }
    }

    Q(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        this.f29832a = abstractComponentCallbacksC2838q.getClass().getName();
        this.f29833b = abstractComponentCallbacksC2838q.mWho;
        this.f29834c = abstractComponentCallbacksC2838q.mFromLayout;
        this.f29835d = abstractComponentCallbacksC2838q.mInDynamicContainer;
        this.f29836e = abstractComponentCallbacksC2838q.mFragmentId;
        this.f29837f = abstractComponentCallbacksC2838q.mContainerId;
        this.f29838g = abstractComponentCallbacksC2838q.mTag;
        this.f29839h = abstractComponentCallbacksC2838q.mRetainInstance;
        this.f29840i = abstractComponentCallbacksC2838q.mRemoving;
        this.f29841j = abstractComponentCallbacksC2838q.mDetached;
        this.f29842k = abstractComponentCallbacksC2838q.mHidden;
        this.f29843l = abstractComponentCallbacksC2838q.mMaxState.ordinal();
        this.f29844m = abstractComponentCallbacksC2838q.mTargetWho;
        this.f29845n = abstractComponentCallbacksC2838q.mTargetRequestCode;
        this.f29846o = abstractComponentCallbacksC2838q.mUserVisibleHint;
    }

    AbstractComponentCallbacksC2838q a(AbstractC2846z abstractC2846z, ClassLoader classLoader) {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qA = abstractC2846z.a(classLoader, this.f29832a);
        abstractComponentCallbacksC2838qA.mWho = this.f29833b;
        abstractComponentCallbacksC2838qA.mFromLayout = this.f29834c;
        abstractComponentCallbacksC2838qA.mInDynamicContainer = this.f29835d;
        abstractComponentCallbacksC2838qA.mRestored = true;
        abstractComponentCallbacksC2838qA.mFragmentId = this.f29836e;
        abstractComponentCallbacksC2838qA.mContainerId = this.f29837f;
        abstractComponentCallbacksC2838qA.mTag = this.f29838g;
        abstractComponentCallbacksC2838qA.mRetainInstance = this.f29839h;
        abstractComponentCallbacksC2838qA.mRemoving = this.f29840i;
        abstractComponentCallbacksC2838qA.mDetached = this.f29841j;
        abstractComponentCallbacksC2838qA.mHidden = this.f29842k;
        abstractComponentCallbacksC2838qA.mMaxState = AbstractC2857k.b.values()[this.f29843l];
        abstractComponentCallbacksC2838qA.mTargetWho = this.f29844m;
        abstractComponentCallbacksC2838qA.mTargetRequestCode = this.f29845n;
        abstractComponentCallbacksC2838qA.mUserVisibleHint = this.f29846o;
        return abstractComponentCallbacksC2838qA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f29832a);
        sb2.append(" (");
        sb2.append(this.f29833b);
        sb2.append(")}:");
        if (this.f29834c) {
            sb2.append(" fromLayout");
        }
        if (this.f29835d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f29837f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f29837f));
        }
        String str = this.f29838g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f29838g);
        }
        if (this.f29839h) {
            sb2.append(" retainInstance");
        }
        if (this.f29840i) {
            sb2.append(" removing");
        }
        if (this.f29841j) {
            sb2.append(" detached");
        }
        if (this.f29842k) {
            sb2.append(" hidden");
        }
        if (this.f29844m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f29844m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f29845n);
        }
        if (this.f29846o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f29832a);
        parcel.writeString(this.f29833b);
        parcel.writeInt(this.f29834c ? 1 : 0);
        parcel.writeInt(this.f29835d ? 1 : 0);
        parcel.writeInt(this.f29836e);
        parcel.writeInt(this.f29837f);
        parcel.writeString(this.f29838g);
        parcel.writeInt(this.f29839h ? 1 : 0);
        parcel.writeInt(this.f29840i ? 1 : 0);
        parcel.writeInt(this.f29841j ? 1 : 0);
        parcel.writeInt(this.f29842k ? 1 : 0);
        parcel.writeInt(this.f29843l);
        parcel.writeString(this.f29844m);
        parcel.writeInt(this.f29845n);
        parcel.writeInt(this.f29846o ? 1 : 0);
    }

    Q(Parcel parcel) {
        this.f29832a = parcel.readString();
        this.f29833b = parcel.readString();
        this.f29834c = parcel.readInt() != 0;
        this.f29835d = parcel.readInt() != 0;
        this.f29836e = parcel.readInt();
        this.f29837f = parcel.readInt();
        this.f29838g = parcel.readString();
        this.f29839h = parcel.readInt() != 0;
        this.f29840i = parcel.readInt() != 0;
        this.f29841j = parcel.readInt() != 0;
        this.f29842k = parcel.readInt() != 0;
        this.f29843l = parcel.readInt();
        this.f29844m = parcel.readString();
        this.f29845n = parcel.readInt();
        this.f29846o = parcel.readInt() != 0;
    }
}
