package S8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb2.append(str);
            sb2.append(" Parcel: pos=");
            sb2.append(iDataPosition);
            sb2.append(" size=");
            sb2.append(iDataSize);
            super(sb2.toString());
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iV);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iV);
        return bArrCreateByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iV);
        return iArrCreateIntArray;
    }

    public static ArrayList d(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iV);
        return arrayList;
    }

    public static Parcelable e(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iV);
        return parcelable;
    }

    public static String f(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iV);
        return string;
    }

    public static ArrayList g(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iV);
        return arrayListCreateStringArrayList;
    }

    public static Object[] h(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iV);
        return objArrCreateTypedArray;
    }

    public static ArrayList i(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iV);
        return arrayListCreateTypedArrayList;
    }

    public static void j(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    public static int k(int i10) {
        return (char) i10;
    }

    public static boolean l(Parcel parcel, int i10) {
        y(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean m(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        if (iV == 0) {
            return null;
        }
        z(parcel, i10, iV, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double n(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        if (iV == 0) {
            return null;
        }
        z(parcel, i10, iV, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float o(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        if (iV == 0) {
            return null;
        }
        z(parcel, i10, iV, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int p(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder q(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iV);
        return strongBinder;
    }

    public static int r(Parcel parcel, int i10) {
        y(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer s(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        if (iV == 0) {
            return null;
        }
        z(parcel, i10, iV, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long t(Parcel parcel, int i10) {
        y(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long u(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        if (iV == 0) {
            return null;
        }
        z(parcel, i10, iV, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int v(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void w(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + v(parcel, i10));
    }

    public static int x(Parcel parcel) {
        int iP = p(parcel);
        int iV = v(parcel, iP);
        int iK = k(iP);
        int iDataPosition = parcel.dataPosition();
        if (iK != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iP))), parcel);
        }
        int i10 = iV + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i10).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    private static void y(Parcel parcel, int i10, int i11) {
        int iV = v(parcel, i10);
        if (iV == i11) {
            return;
        }
        String hexString = Integer.toHexString(iV);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(iV).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(iV);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    private static void z(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i11).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }
}
