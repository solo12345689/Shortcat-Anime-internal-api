package G1;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f6984a;

    k(Object obj) {
        this.f6984a = (LocaleList) obj;
    }

    @Override // G1.j
    public String a() {
        return this.f6984a.toLanguageTags();
    }

    @Override // G1.j
    public Object b() {
        return this.f6984a;
    }

    public boolean equals(Object obj) {
        return this.f6984a.equals(((j) obj).b());
    }

    @Override // G1.j
    public Locale get(int i10) {
        return this.f6984a.get(i10);
    }

    public int hashCode() {
        return this.f6984a.hashCode();
    }

    @Override // G1.j
    public boolean isEmpty() {
        return this.f6984a.isEmpty();
    }

    @Override // G1.j
    public int size() {
        return this.f6984a.size();
    }

    public String toString() {
        return this.f6984a.toString();
    }
}
