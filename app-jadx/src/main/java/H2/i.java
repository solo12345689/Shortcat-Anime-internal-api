package H2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q2.C6109x;
import q2.U;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i f7802n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f7804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f7805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f7806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f7807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f7808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C6109x f7809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f7810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f7811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f7812m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6109x f7814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7816d;

        public a(Uri uri, C6109x c6109x, String str, String str2) {
            this.f7813a = uri;
            this.f7814b = c6109x;
            this.f7815c = str;
            this.f7816d = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6109x f7818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f7821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f7822f;

        public b(Uri uri, C6109x c6109x, String str, String str2, String str3, String str4) {
            this.f7817a = uri;
            this.f7818b = c6109x;
            this.f7819c = str;
            this.f7820d = str2;
            this.f7821e = str3;
            this.f7822f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new C6109x.b().j0("0").W("application/x-mpegURL").P(), null, null, null, null);
        }

        public b a(C6109x c6109x) {
            return new b(this.f7817a, c6109x, this.f7819c, this.f7820d, this.f7821e, this.f7822f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f7802n = new i("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public i(String str, List list, List list2, List list3, List list4, List list5, List list6, C6109x c6109x, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        this.f7803d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f7804e = Collections.unmodifiableList(list2);
        this.f7805f = Collections.unmodifiableList(list3);
        this.f7806g = Collections.unmodifiableList(list4);
        this.f7807h = Collections.unmodifiableList(list5);
        this.f7808i = Collections.unmodifiableList(list6);
        this.f7809j = c6109x;
        this.f7810k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f7811l = Collections.unmodifiableMap(map);
        this.f7812m = Collections.unmodifiableList(list8);
    }

    private static void b(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f7813a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static List d(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    U u10 = (U) list2.get(i12);
                    if (u10.f56636b == i10 && u10.f56637c == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static i e(String str) {
        List listSingletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new i("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    private static List f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((b) list.get(i10)).f7817a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // L2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i a(List list) {
        String str = this.f7823a;
        List list2 = this.f7824b;
        List listD = d(this.f7804e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new i(str, list2, listD, list3, d(this.f7806g, 1, list), d(this.f7807h, 2, list), list3, this.f7809j, this.f7810k, this.f7825c, this.f7811l, this.f7812m);
    }
}
