package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f28894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f28895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f28896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f28897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f28898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f28899f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static Person a(u uVar) {
            return new Person.Builder().setName(uVar.c()).setIcon(uVar.a() != null ? uVar.a().n() : null).setUri(uVar.d()).setKey(uVar.b()).setBot(uVar.e()).setImportant(uVar.f()).build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f28900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IconCompat f28901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f28902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f28903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f28904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f28905f;

        public u a() {
            return new u(this);
        }

        public b b(boolean z10) {
            this.f28904e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f28901b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f28905f = z10;
            return this;
        }

        public b e(String str) {
            this.f28903d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f28900a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f28902c = str;
            return this;
        }
    }

    u(b bVar) {
        this.f28894a = bVar.f28900a;
        this.f28895b = bVar.f28901b;
        this.f28896c = bVar.f28902c;
        this.f28897d = bVar.f28903d;
        this.f28898e = bVar.f28904e;
        this.f28899f = bVar.f28905f;
    }

    public IconCompat a() {
        return this.f28895b;
    }

    public String b() {
        return this.f28897d;
    }

    public CharSequence c() {
        return this.f28894a;
    }

    public String d() {
        return this.f28896c;
    }

    public boolean e() {
        return this.f28898e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        String strB = b();
        String strB2 = uVar.b();
        return (strB == null && strB2 == null) ? Objects.equals(Objects.toString(c()), Objects.toString(uVar.c())) && Objects.equals(d(), uVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(uVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(uVar.f())) : Objects.equals(strB, strB2);
    }

    public boolean f() {
        return this.f28899f;
    }

    public String g() {
        String str = this.f28896c;
        if (str != null) {
            return str;
        }
        if (this.f28894a == null) {
            return "";
        }
        return "name:" + ((Object) this.f28894a);
    }

    public Person h() {
        return a.a(this);
    }

    public int hashCode() {
        String strB = b();
        return strB != null ? strB.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f28894a);
        IconCompat iconCompat = this.f28895b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m() : null);
        bundle.putString("uri", this.f28896c);
        bundle.putString(SubscriberAttributeKt.JSON_NAME_KEY, this.f28897d);
        bundle.putBoolean("isBot", this.f28898e);
        bundle.putBoolean("isImportant", this.f28899f);
        return bundle;
    }
}
