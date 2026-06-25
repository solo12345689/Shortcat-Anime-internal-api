package Ta;

import android.animation.Animator;
import be.AbstractC3048a;
import com.swmansion.rnscreens.Y;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f17344e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y f17345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f17346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f17347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f17348d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17349a = new a("ENTER", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f17350b = new a("EXIT", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f17351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f17352d;

        static {
            a[] aVarArrA = a();
            f17351c = aVarArrA;
            f17352d = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f17349a, f17350b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f17351c.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f17353a = new c("INITIALIZED", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f17354b = new c("START_DISPATCHED", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f17355c = new c("END_DISPATCHED", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f17356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f17357e;

        static {
            c[] cVarArrA = a();
            f17356d = cVarArrA;
            f17357e = AbstractC3048a.a(cVarArrA);
        }

        private c(String str, int i10) {
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f17353a, f17354b, f17355c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f17356d.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f17359b;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f17353a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f17354b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f17355c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17358a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.f17349a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.f17350b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f17359b = iArr2;
        }
    }

    public e(Y wrapper, i iVar, a animationType) {
        AbstractC5504s.h(wrapper, "wrapper");
        AbstractC5504s.h(animationType, "animationType");
        this.f17345a = wrapper;
        this.f17346b = iVar;
        this.f17347c = animationType;
        this.f17348d = c.f17353a;
    }

    private final void a() {
        c cVar;
        int i10 = d.f17358a[this.f17348d.ordinal()];
        if (i10 == 1) {
            cVar = c.f17354b;
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new Td.r();
            }
            cVar = c.f17355c;
        }
        this.f17348d = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        AbstractC5504s.h(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        AbstractC5504s.h(animation, "animation");
        if (this.f17348d == c.f17354b) {
            a();
            animation.removeListener(this);
            int i10 = d.f17359b[this.f17347c.ordinal()];
            if (i10 == 1) {
                i iVar = this.f17346b;
                if (iVar != null) {
                    iVar.a();
                }
            } else {
                if (i10 != 2) {
                    throw new Td.r();
                }
                i iVar2 = this.f17346b;
                if (iVar2 != null) {
                    iVar2.b();
                }
            }
            boolean z10 = this.f17347c == a.f17350b;
            i iVar3 = this.f17346b;
            if (iVar3 != null) {
                iVar3.e(1.0f, z10, z10);
            }
            this.f17345a.k().k();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        AbstractC5504s.h(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        AbstractC5504s.h(animation, "animation");
        if (this.f17348d == c.f17353a) {
            a();
            int i10 = d.f17359b[this.f17347c.ordinal()];
            if (i10 == 1) {
                i iVar = this.f17346b;
                if (iVar != null) {
                    iVar.c();
                }
            } else {
                if (i10 != 2) {
                    throw new Td.r();
                }
                i iVar2 = this.f17346b;
                if (iVar2 != null) {
                    iVar2.d();
                }
            }
            boolean z10 = this.f17347c == a.f17350b;
            i iVar3 = this.f17346b;
            if (iVar3 != null) {
                iVar3.e(0.0f, z10, z10);
            }
        }
    }
}
