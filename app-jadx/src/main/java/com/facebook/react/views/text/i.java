package com.facebook.react.views.text;

import android.text.Spannable;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f38276k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spannable f38277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f38280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f38281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f38282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f38283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f38284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f38285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f38286j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(Spannable text, int i10, int i11, int i12, int i13) {
            AbstractC5504s.h(text, "text");
            return new i(text, i10, false, i11, i12, i13);
        }

        private a() {
        }
    }

    public i(Spannable text, int i10, boolean z10, float f10, float f11, float f12, float f13, int i11, int i12, int i13) {
        AbstractC5504s.h(text, "text");
        this.f38277a = text;
        this.f38278b = i10;
        this.f38279c = z10;
        this.f38280d = f10;
        this.f38281e = f11;
        this.f38282f = f12;
        this.f38283g = f13;
        this.f38284h = i11;
        this.f38285i = i12;
        this.f38286j = i13;
    }

    public final boolean a() {
        return this.f38279c;
    }

    public final int b() {
        return this.f38278b;
    }

    public final int c() {
        return this.f38286j;
    }

    public final float d() {
        return this.f38283g;
    }

    public final float e() {
        return this.f38280d;
    }

    public final float f() {
        return this.f38282f;
    }

    public final float g() {
        return this.f38281e;
    }

    public final Spannable h() {
        return this.f38277a;
    }

    public final int i() {
        return this.f38284h;
    }

    public final int j() {
        return this.f38285i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Spannable text, int i10, boolean z10, int i11, int i12, int i13) {
        this(text, i10, z10, -1.0f, -1.0f, -1.0f, -1.0f, i11, i12, i13);
        AbstractC5504s.h(text, "text");
    }
}
