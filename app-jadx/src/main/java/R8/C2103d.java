package R8;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k9.C5456a;
import t.C6552b;

/* JADX INFO: renamed from: R8.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2103d {

    /* JADX INFO: renamed from: a */
    private final Account f15270a;

    /* JADX INFO: renamed from: b */
    private final Set f15271b;

    /* JADX INFO: renamed from: c */
    private final Set f15272c;

    /* JADX INFO: renamed from: d */
    private final Map f15273d;

    /* JADX INFO: renamed from: e */
    private final int f15274e;

    /* JADX INFO: renamed from: f */
    private final View f15275f;

    /* JADX INFO: renamed from: g */
    private final String f15276g;

    /* JADX INFO: renamed from: h */
    private final String f15277h;

    /* JADX INFO: renamed from: i */
    private final C5456a f15278i;

    /* JADX INFO: renamed from: j */
    private Integer f15279j;

    /* JADX INFO: renamed from: R8.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Account f15280a;

        /* JADX INFO: renamed from: b */
        private C6552b f15281b;

        /* JADX INFO: renamed from: c */
        private String f15282c;

        /* JADX INFO: renamed from: d */
        private String f15283d;

        /* JADX INFO: renamed from: e */
        private final C5456a f15284e = C5456a.f52134j;

        public C2103d a() {
            return new C2103d(this.f15280a, this.f15281b, null, 0, null, this.f15282c, this.f15283d, this.f15284e, false);
        }

        public a b(String str) {
            this.f15282c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f15281b == null) {
                this.f15281b = new C6552b();
            }
            this.f15281b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f15280a = account;
            return this;
        }

        public final a e(String str) {
            this.f15283d = str;
            return this;
        }
    }

    public C2103d(Account account, Set set, Map map, int i10, View view, String str, String str2, C5456a c5456a, boolean z10) {
        this.f15270a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f15271b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f15273d = map;
        this.f15275f = view;
        this.f15274e = i10;
        this.f15276g = str;
        this.f15277h = str2;
        this.f15278i = c5456a == null ? C5456a.f52134j : c5456a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f15272c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f15270a;
    }

    public String b() {
        Account account = this.f15270a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f15270a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set d() {
        return this.f15272c;
    }

    public Set e(P8.a aVar) {
        android.support.v4.media.session.b.a(this.f15273d.get(aVar));
        return this.f15271b;
    }

    public String f() {
        return this.f15276g;
    }

    public Set g() {
        return this.f15271b;
    }

    public final C5456a h() {
        return this.f15278i;
    }

    public final Integer i() {
        return this.f15279j;
    }

    public final String j() {
        return this.f15277h;
    }

    public final void k(Integer num) {
        this.f15279j = num;
    }
}
