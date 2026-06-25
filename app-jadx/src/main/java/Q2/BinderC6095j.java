package q2;

import P9.AbstractC2011u;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: q2.j */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC6095j extends Binder {

    /* JADX INFO: renamed from: b */
    private static final int f56890b;

    /* JADX INFO: renamed from: a */
    private final AbstractC2011u f56891a;

    static {
        f56890b = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BinderC6095j(List list) {
        this.f56891a = AbstractC2011u.w(list);
    }

    public static AbstractC2011u a(IBinder iBinder) {
        return iBinder instanceof BinderC6095j ? ((BinderC6095j) iBinder).f56891a : b(iBinder);
    }

    static AbstractC2011u b(IBinder iBinder) {
        int i10;
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        int i11 = 0;
        int i12 = 1;
        while (i12 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i11);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            aVarT.a((Bundle) AbstractC6614a.e(parcelObtain2.readBundle()));
                            i11++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i12 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return aVarT.k();
    }

    @Override // android.os.Binder
    protected boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f56891a.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f56890b) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) this.f56891a.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}
