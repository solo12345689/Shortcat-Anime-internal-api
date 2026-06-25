package q2;

import android.view.View;

/* JADX INFO: renamed from: q2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6086a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f56694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56696c;

    /* JADX INFO: renamed from: q2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0865a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f56697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f56698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f56699c;

        public C0865a(View view, int i10) {
            this.f56697a = view;
            this.f56698b = i10;
        }

        public C6086a a() {
            return new C6086a(this.f56697a, this.f56698b, this.f56699c);
        }

        public C0865a b(String str) {
            this.f56699c = str;
            return this;
        }
    }

    public C6086a(View view, int i10, String str) {
        this.f56694a = view;
        this.f56695b = i10;
        this.f56696c = str;
    }
}
