package E4;

import L4.j;
import Ud.S;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f5627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f5628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f5629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5630d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f5631e = true;

        public a(Context context) {
            this.f5627a = context;
            this.f5628b = j.e(context);
        }

        public final c a() {
            h aVar;
            i gVar = this.f5631e ? new g() : new E4.b();
            if (this.f5630d) {
                double d10 = this.f5628b;
                int iC = d10 > 0.0d ? j.c(this.f5627a, d10) : this.f5629c;
                aVar = iC > 0 ? new f(iC, gVar) : new E4.a(gVar);
            } else {
                aVar = new E4.a(gVar);
            }
            return new e(aVar, gVar);
        }
    }

    /* JADX INFO: renamed from: E4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0055c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f5635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f5636b;

        public C0055c(Bitmap bitmap, Map map) {
            this.f5635a = bitmap;
            this.f5636b = map;
        }

        public final Bitmap a() {
            return this.f5635a;
        }

        public final Map b() {
            return this.f5636b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0055c)) {
                return false;
            }
            C0055c c0055c = (C0055c) obj;
            return AbstractC5504s.c(this.f5635a, c0055c.f5635a) && AbstractC5504s.c(this.f5636b, c0055c.f5636b);
        }

        public int hashCode() {
            return (this.f5635a.hashCode() * 31) + this.f5636b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f5635a + ", extras=" + this.f5636b + ')';
        }
    }

    void a(int i10);

    C0055c b(b bVar);

    void c(b bVar, C0055c c0055c);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f5634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final C0054b f5632c = new C0054b(null);

        @Deprecated
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                AbstractC5504s.e(string);
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    String string2 = parcel.readString();
                    AbstractC5504s.e(string2);
                    String string3 = parcel.readString();
                    AbstractC5504s.e(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new b(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* JADX INFO: renamed from: E4.c$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0054b {
            public /* synthetic */ C0054b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0054b() {
            }
        }

        public b(String str, Map map) {
            this.f5633a = str;
            this.f5634b = map;
        }

        public static /* synthetic */ b b(b bVar, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f5633a;
            }
            if ((i10 & 2) != 0) {
                map = bVar.f5634b;
            }
            return bVar.a(str, map);
        }

        public final b a(String str, Map map) {
            return new b(str, map);
        }

        public final Map c() {
            return this.f5634b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(this.f5633a, bVar.f5633a) && AbstractC5504s.c(this.f5634b, bVar.f5634b);
        }

        public int hashCode() {
            return (this.f5633a.hashCode() * 31) + this.f5634b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f5633a + ", extras=" + this.f5634b + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f5633a);
            parcel.writeInt(this.f5634b.size());
            for (Map.Entry entry : this.f5634b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                parcel.writeString(str);
                parcel.writeString(str2);
            }
        }

        public /* synthetic */ b(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? S.i() : map);
        }
    }
}
