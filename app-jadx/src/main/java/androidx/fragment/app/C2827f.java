package androidx.fragment.app;

import Ud.AbstractC2279u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.C2632b;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.AbstractC2757f0;
import androidx.fragment.app.AbstractC2843w;
import androidx.fragment.app.C2827f;
import androidx.fragment.app.c0;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import t.C6551a;

/* JADX INFO: renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2827f extends c0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends c0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f29984d;

        /* JADX INFO: renamed from: androidx.fragment.app.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class AnimationAnimationListenerC0510a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0.d f29985a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f29986b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f29987c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f29988d;

            AnimationAnimationListenerC0510a(c0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f29985a = dVar;
                this.f29986b = viewGroup;
                this.f29987c = view;
                this.f29988d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(ViewGroup container, View view, a this$0) {
                AbstractC5504s.h(container, "$container");
                AbstractC5504s.h(this$0, "this$0");
                container.endViewTransition(view);
                this$0.h().a().e(this$0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AbstractC5504s.h(animation, "animation");
                final ViewGroup viewGroup = this.f29986b;
                final View view = this.f29987c;
                final a aVar = this.f29988d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2827f.a.AnimationAnimationListenerC0510a.b(viewGroup, view, aVar);
                    }
                });
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f29985a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                AbstractC5504s.h(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                AbstractC5504s.h(animation, "animation");
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f29985a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b animationInfo) {
            AbstractC5504s.h(animationInfo, "animationInfo");
            this.f29984d = animationInfo;
        }

        @Override // androidx.fragment.app.c0.b
        public void c(ViewGroup container) {
            AbstractC5504s.h(container, "container");
            c0.d dVarA = this.f29984d.a();
            View view = dVarA.h().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.f29984d.a().e(this);
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.c0.b
        public void d(ViewGroup container) {
            AbstractC5504s.h(container, "container");
            if (this.f29984d.b()) {
                this.f29984d.a().e(this);
                return;
            }
            Context context = container.getContext();
            c0.d dVarA = this.f29984d.a();
            View view = dVarA.h().mView;
            b bVar = this.f29984d;
            AbstractC5504s.g(context, "context");
            AbstractC2843w.a aVarC = bVar.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.f30119a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (dVarA.g() != c0.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f29984d.a().e(this);
                return;
            }
            container.startViewTransition(view);
            AbstractC2843w.b bVar2 = new AbstractC2843w.b(animation, container, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0510a(dVarA, container, view, this));
            view.startAnimation(bVar2);
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has started.");
            }
        }

        public final b h() {
            return this.f29984d;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends C0511f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f29989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AbstractC2843w.a f29991d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c0.d operation, boolean z10) {
            super(operation);
            AbstractC5504s.h(operation, "operation");
            this.f29989b = z10;
        }

        public final AbstractC2843w.a c(Context context) {
            AbstractC5504s.h(context, "context");
            if (this.f29990c) {
                return this.f29991d;
            }
            AbstractC2843w.a aVarB = AbstractC2843w.b(context, a().h(), a().g() == c0.d.b.VISIBLE, this.f29989b);
            this.f29991d = aVarB;
            this.f29990c = true;
            return aVarB;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends c0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f29992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private AnimatorSet f29993e;

        /* JADX INFO: renamed from: androidx.fragment.app.f$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f29994a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f29995b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f29996c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c0.d f29997d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f29998e;

            a(ViewGroup viewGroup, View view, boolean z10, c0.d dVar, c cVar) {
                this.f29994a = viewGroup;
                this.f29995b = view;
                this.f29996c = z10;
                this.f29997d = dVar;
                this.f29998e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator anim) {
                AbstractC5504s.h(anim, "anim");
                this.f29994a.endViewTransition(this.f29995b);
                if (this.f29996c || this.f29997d.g() == c0.d.b.GONE) {
                    c0.d.b bVarG = this.f29997d.g();
                    View viewToAnimate = this.f29995b;
                    AbstractC5504s.g(viewToAnimate, "viewToAnimate");
                    bVarG.b(viewToAnimate, this.f29994a);
                }
                this.f29998e.h().a().e(this.f29998e);
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f29997d + " has ended.");
                }
            }
        }

        public c(b animatorInfo) {
            AbstractC5504s.h(animatorInfo, "animatorInfo");
            this.f29992d = animatorInfo;
        }

        @Override // androidx.fragment.app.c0.b
        public boolean b() {
            return true;
        }

        @Override // androidx.fragment.app.c0.b
        public void c(ViewGroup container) {
            AbstractC5504s.h(container, "container");
            AnimatorSet animatorSet = this.f29993e;
            if (animatorSet == null) {
                this.f29992d.a().e(this);
                return;
            }
            c0.d dVarA = this.f29992d.a();
            if (!dVarA.m()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.f30000a.a(animatorSet);
            }
            if (K.Q0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(dVarA);
                sb2.append(" has been canceled");
                sb2.append(dVarA.m() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // androidx.fragment.app.c0.b
        public void d(ViewGroup container) {
            AbstractC5504s.h(container, "container");
            c0.d dVarA = this.f29992d.a();
            AnimatorSet animatorSet = this.f29993e;
            if (animatorSet == null) {
                this.f29992d.a().e(this);
                return;
            }
            animatorSet.start();
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Animator from operation " + dVarA + " has started.");
            }
        }

        @Override // androidx.fragment.app.c0.b
        public void e(C2632b backEvent, ViewGroup container) {
            AbstractC5504s.h(backEvent, "backEvent");
            AbstractC5504s.h(container, "container");
            c0.d dVarA = this.f29992d.a();
            AnimatorSet animatorSet = this.f29993e;
            if (animatorSet == null) {
                this.f29992d.a().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !dVarA.h().mTransitioning) {
                return;
            }
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + dVarA);
            }
            long jA = d.f29999a.a(animatorSet);
            long jA2 = (long) (backEvent.a() * jA);
            if (jA2 == 0) {
                jA2 = 1;
            }
            if (jA2 == jA) {
                jA2 = jA - 1;
            }
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + jA2 + " for Animator " + animatorSet + " on operation " + dVarA);
            }
            e.f30000a.b(animatorSet, jA2);
        }

        @Override // androidx.fragment.app.c0.b
        public void f(ViewGroup container) {
            c cVar;
            AbstractC5504s.h(container, "container");
            if (this.f29992d.b()) {
                return;
            }
            Context context = container.getContext();
            b bVar = this.f29992d;
            AbstractC5504s.g(context, "context");
            AbstractC2843w.a aVarC = bVar.c(context);
            this.f29993e = aVarC != null ? aVarC.f30120b : null;
            c0.d dVarA = this.f29992d.a();
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qH = dVarA.h();
            boolean z10 = dVarA.g() == c0.d.b.GONE;
            View view = abstractComponentCallbacksC2838qH.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.f29993e;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(container, view, z10, dVarA, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f29993e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b h() {
            return this.f29992d;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f29999a = new d();

        private d() {
        }

        public final long a(AnimatorSet animatorSet) {
            AbstractC5504s.h(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f30000a = new e();

        private e() {
        }

        public final void a(AnimatorSet animatorSet) {
            AbstractC5504s.h(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j10) {
            AbstractC5504s.h(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0511f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0.d f30001a;

        public C0511f(c0.d operation) {
            AbstractC5504s.h(operation, "operation");
            this.f30001a = operation;
        }

        public final c0.d a() {
            return this.f30001a;
        }

        public final boolean b() {
            View view = this.f30001a.h().mView;
            c0.d.b bVarA = view != null ? c0.d.b.f29970a.a(view) : null;
            c0.d.b bVarG = this.f30001a.g();
            if (bVarA == bVarG) {
                return true;
            }
            c0.d.b bVar = c0.d.b.VISIBLE;
            return (bVarA == bVar || bVarG == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.fragment.app.f$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends c0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f30002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final c0.d f30003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c0.d f30004f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final X f30005g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Object f30006h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayList f30007i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final ArrayList f30008j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final C6551a f30009k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final ArrayList f30010l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final ArrayList f30011m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C6551a f30012n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final C6551a f30013o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f30014p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final G1.d f30015q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Object f30016r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f30017s;

        /* JADX INFO: renamed from: androidx.fragment.app.f$g$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f30019b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f30020c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f30019b = viewGroup;
                this.f30020c = obj;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m100invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m100invoke() {
                g.this.v().e(this.f30019b, this.f30020c);
            }
        }

        /* JADX INFO: renamed from: androidx.fragment.app.f$g$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f30022b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f30023c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f30024d;

            /* JADX INFO: renamed from: androidx.fragment.app.f$g$b$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class a extends AbstractC5506u implements InterfaceC5082a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f30025a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object f30026b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ViewGroup f30027c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f30025a = gVar;
                    this.f30026b = obj;
                    this.f30027c = viewGroup;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void c(g this$0, ViewGroup container) {
                    AbstractC5504s.h(this$0, "this$0");
                    AbstractC5504s.h(container, "$container");
                    Iterator it = this$0.w().iterator();
                    while (it.hasNext()) {
                        c0.d dVarA = ((h) it.next()).a();
                        View view = dVarA.h().getView();
                        if (view != null) {
                            dVarA.g().b(view, container);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void e(g this$0) {
                    AbstractC5504s.h(this$0, "this$0");
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    Iterator it = this$0.w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).a().e(this$0);
                    }
                }

                @Override // ie.InterfaceC5082a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m102invoke();
                    return Td.L.f17438a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m102invoke() {
                    List listW = this.f30025a.w();
                    if (listW == null || !listW.isEmpty()) {
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).a().m()) {
                                if (K.Q0(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                G1.d dVar = new G1.d();
                                X xV = this.f30025a.v();
                                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qH = ((h) this.f30025a.w().get(0)).a().h();
                                Object obj = this.f30026b;
                                final g gVar = this.f30025a;
                                xV.w(abstractComponentCallbacksC2838qH, obj, dVar, new Runnable() { // from class: androidx.fragment.app.n
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C2827f.g.b.a.e(gVar);
                                    }
                                });
                                dVar.a();
                                return;
                            }
                        }
                    }
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    X xV2 = this.f30025a.v();
                    Object objS = this.f30025a.s();
                    AbstractC5504s.e(objS);
                    final g gVar2 = this.f30025a;
                    final ViewGroup viewGroup = this.f30027c;
                    xV2.d(objS, new Runnable() { // from class: androidx.fragment.app.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2827f.g.b.a.c(gVar2, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ViewGroup viewGroup, Object obj, kotlin.jvm.internal.N n10) {
                super(0);
                this.f30022b = viewGroup;
                this.f30023c = obj;
                this.f30024d = n10;
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m101invoke();
                return Td.L.f17438a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m101invoke() {
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                g gVar = g.this;
                gVar.C(gVar.v().j(this.f30022b, this.f30023c));
                if (g.this.s() == null) {
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    g.this.D(true);
                    return;
                }
                this.f30024d.f52259a = new a(g.this, this.f30023c, this.f30022b);
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.t() + " to " + g.this.u());
                }
            }
        }

        public g(List transitionInfos, c0.d dVar, c0.d dVar2, X transitionImpl, Object obj, ArrayList sharedElementFirstOutViews, ArrayList sharedElementLastInViews, C6551a sharedElementNameMapping, ArrayList enteringNames, ArrayList exitingNames, C6551a firstOutViews, C6551a lastInViews, boolean z10) {
            AbstractC5504s.h(transitionInfos, "transitionInfos");
            AbstractC5504s.h(transitionImpl, "transitionImpl");
            AbstractC5504s.h(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            AbstractC5504s.h(sharedElementLastInViews, "sharedElementLastInViews");
            AbstractC5504s.h(sharedElementNameMapping, "sharedElementNameMapping");
            AbstractC5504s.h(enteringNames, "enteringNames");
            AbstractC5504s.h(exitingNames, "exitingNames");
            AbstractC5504s.h(firstOutViews, "firstOutViews");
            AbstractC5504s.h(lastInViews, "lastInViews");
            this.f30002d = transitionInfos;
            this.f30003e = dVar;
            this.f30004f = dVar2;
            this.f30005g = transitionImpl;
            this.f30006h = obj;
            this.f30007i = sharedElementFirstOutViews;
            this.f30008j = sharedElementLastInViews;
            this.f30009k = sharedElementNameMapping;
            this.f30010l = enteringNames;
            this.f30011m = exitingNames;
            this.f30012n = firstOutViews;
            this.f30013o = lastInViews;
            this.f30014p = z10;
            this.f30015q = new G1.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(c0.d operation, g this$0) {
            AbstractC5504s.h(operation, "$operation");
            AbstractC5504s.h(this$0, "this$0");
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        private final void B(ArrayList arrayList, ViewGroup viewGroup, InterfaceC5082a interfaceC5082a) {
            V.d(arrayList, 4);
            ArrayList arrayListQ = this.f30005g.q(this.f30008j);
            if (K.Q0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (Object sharedElementFirstOutViews : this.f30007i) {
                    AbstractC5504s.g(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = (View) sharedElementFirstOutViews;
                    Log.v("FragmentManager", "View: " + view + " Name: " + AbstractC2747a0.H(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (Object sharedElementLastInViews : this.f30008j) {
                    AbstractC5504s.g(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = (View) sharedElementLastInViews;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + AbstractC2747a0.H(view2));
                }
            }
            interfaceC5082a.invoke();
            this.f30005g.y(viewGroup, this.f30007i, this.f30008j, arrayListQ, this.f30009k);
            V.d(arrayList, 0);
            this.f30005g.A(this.f30006h, this.f30007i, this.f30008j);
        }

        private final void n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (AbstractC2757f0.c(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    AbstractC5504s.g(child, "child");
                    n(arrayList, child);
                }
            }
        }

        private final Pair o(ViewGroup viewGroup, c0.d dVar, final c0.d dVar2) {
            final c0.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.f30002d.iterator();
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((h) it.next()).g() && dVar2 != null && dVar3 != null && !this.f30009k.isEmpty() && this.f30006h != null) {
                    V.a(dVar3.h(), dVar2.h(), this.f30014p, this.f30012n, true);
                    androidx.core.view.L.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2827f.g.p(dVar3, dVar2, this);
                        }
                    });
                    this.f30007i.addAll(this.f30012n.values());
                    if (!this.f30011m.isEmpty()) {
                        Object obj = this.f30011m.get(0);
                        AbstractC5504s.g(obj, "exitingNames[0]");
                        view2 = (View) this.f30012n.get((String) obj);
                        this.f30005g.v(this.f30006h, view2);
                    }
                    this.f30008j.addAll(this.f30013o.values());
                    if (!this.f30010l.isEmpty()) {
                        Object obj2 = this.f30010l.get(0);
                        AbstractC5504s.g(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f30013o.get((String) obj2);
                        if (view3 != null) {
                            final X x10 = this.f30005g;
                            androidx.core.view.L.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2827f.g.q(x10, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.f30005g.z(this.f30006h, view, this.f30007i);
                    X x11 = this.f30005g;
                    Object obj3 = this.f30006h;
                    x11.s(obj3, null, null, null, null, obj3, this.f30008j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f30002d.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                c0.d dVarA = hVar.a();
                boolean z11 = z10;
                Object objH = this.f30005g.h(hVar.f());
                if (objH != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = it2;
                    View view4 = dVarA.h().mView;
                    AbstractC5504s.g(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f30006h != null && (dVarA == dVar2 || dVarA == dVar3)) {
                        if (dVarA == dVar2) {
                            arrayList2.removeAll(AbstractC2279u.f1(this.f30007i));
                        } else {
                            arrayList2.removeAll(AbstractC2279u.f1(this.f30008j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f30005g.a(objH, view);
                    } else {
                        this.f30005g.b(objH, arrayList2);
                        this.f30005g.s(objH, objH, arrayList2, null, null, null, null);
                        if (dVarA.g() == c0.d.b.GONE) {
                            dVarA.q(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(dVarA.h().mView);
                            this.f30005g.r(objH, dVarA.h().mView, arrayList3);
                            androidx.core.view.L.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2827f.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (dVarA.g() == c0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z11) {
                            this.f30005g.u(objH, rect);
                        }
                        if (K.Q0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (Object transitioningViews : arrayList2) {
                                AbstractC5504s.g(transitioningViews, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                            }
                        }
                    } else {
                        this.f30005g.v(objH, view2);
                        if (K.Q0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (Object transitioningViews2 : arrayList2) {
                                AbstractC5504s.g(transitioningViews2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                            }
                        }
                    }
                    if (hVar.h()) {
                        objP = this.f30005g.p(objP, objH, null);
                    } else {
                        objP2 = this.f30005g.p(objP2, objH, null);
                    }
                    dVar3 = dVar;
                    z10 = z11;
                    it2 = it3;
                } else {
                    dVar3 = dVar;
                    z10 = z11;
                }
            }
            Object objO = this.f30005g.o(objP, objP2, this.f30006h);
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objO + " for container " + viewGroup);
            }
            return new Pair(arrayList, objO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(c0.d dVar, c0.d dVar2, g this$0) {
            AbstractC5504s.h(this$0, "this$0");
            V.a(dVar.h(), dVar2.h(), this$0.f30014p, this$0.f30013o, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(X impl, View view, Rect lastInEpicenterRect) {
            AbstractC5504s.h(impl, "$impl");
            AbstractC5504s.h(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.k(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList transitioningViews) {
            AbstractC5504s.h(transitioningViews, "$transitioningViews");
            V.d(transitioningViews, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(c0.d operation, g this$0) {
            AbstractC5504s.h(operation, "$operation");
            AbstractC5504s.h(this$0, "this$0");
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
            }
            operation.e(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(kotlin.jvm.internal.N seekCancelLambda) {
            AbstractC5504s.h(seekCancelLambda, "$seekCancelLambda");
            InterfaceC5082a interfaceC5082a = (InterfaceC5082a) seekCancelLambda.f52259a;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
        }

        public final void C(Object obj) {
            this.f30016r = obj;
        }

        public final void D(boolean z10) {
            this.f30017s = z10;
        }

        @Override // androidx.fragment.app.c0.b
        public boolean b() {
            if (!this.f30005g.m()) {
                return false;
            }
            List<h> list = this.f30002d;
            if (list == null || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.f() == null || !this.f30005g.n(hVar.f())) {
                        return false;
                    }
                }
            }
            Object obj = this.f30006h;
            return obj == null || this.f30005g.n(obj);
        }

        @Override // androidx.fragment.app.c0.b
        public void c(ViewGroup container) {
            AbstractC5504s.h(container, "container");
            this.f30015q.a();
        }

        @Override // androidx.fragment.app.c0.b
        public void d(ViewGroup container) {
            AbstractC5504s.h(container, "container");
            if (!container.isLaidOut() || this.f30017s) {
                for (h hVar : this.f30002d) {
                    c0.d dVarA = hVar.a();
                    if (K.Q0(2)) {
                        if (this.f30017s) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + dVarA);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + dVarA);
                        }
                    }
                    hVar.a().e(this);
                }
                this.f30017s = false;
                return;
            }
            Object obj = this.f30016r;
            if (obj != null) {
                X x10 = this.f30005g;
                AbstractC5504s.e(obj);
                x10.c(obj);
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f30003e + " to " + this.f30004f);
                    return;
                }
                return;
            }
            Pair pairO = o(container, this.f30004f, this.f30003e);
            ArrayList arrayList = (ArrayList) pairO.getFirst();
            Object second = pairO.getSecond();
            List list = this.f30002d;
            ArrayList<c0.d> arrayList2 = new ArrayList(AbstractC2279u.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).a());
            }
            for (final c0.d dVar : arrayList2) {
                this.f30005g.w(dVar.h(), second, this.f30015q, new Runnable() { // from class: androidx.fragment.app.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2827f.g.y(dVar, this);
                    }
                });
            }
            B(arrayList, container, new a(container, second));
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f30003e + " to " + this.f30004f);
            }
        }

        @Override // androidx.fragment.app.c0.b
        public void e(C2632b backEvent, ViewGroup container) {
            AbstractC5504s.h(backEvent, "backEvent");
            AbstractC5504s.h(container, "container");
            Object obj = this.f30016r;
            if (obj != null) {
                this.f30005g.t(obj, backEvent.a());
            }
        }

        @Override // androidx.fragment.app.c0.b
        public void f(ViewGroup container) {
            AbstractC5504s.h(container, "container");
            if (!container.isLaidOut()) {
                Iterator it = this.f30002d.iterator();
                while (it.hasNext()) {
                    c0.d dVarA = ((h) it.next()).a();
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + dVarA);
                    }
                }
                return;
            }
            if (x() && this.f30006h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f30006h + " between " + this.f30003e + " and " + this.f30004f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                final kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
                Pair pairO = o(container, this.f30004f, this.f30003e);
                ArrayList arrayList = (ArrayList) pairO.getFirst();
                Object second = pairO.getSecond();
                List list = this.f30002d;
                ArrayList<c0.d> arrayList2 = new ArrayList(AbstractC2279u.x(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).a());
                }
                for (final c0.d dVar : arrayList2) {
                    this.f30005g.x(dVar.h(), second, this.f30015q, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2827f.g.z(n10);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2827f.g.A(dVar, this);
                        }
                    });
                }
                B(arrayList, container, new b(container, second, n10));
            }
        }

        public final Object s() {
            return this.f30016r;
        }

        public final c0.d t() {
            return this.f30003e;
        }

        public final c0.d u() {
            return this.f30004f;
        }

        public final X v() {
            return this.f30005g;
        }

        public final List w() {
            return this.f30002d;
        }

        public final boolean x() {
            List list = this.f30002d;
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().h().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class h extends C0511f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f30028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f30029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f30030d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(c0.d operation, boolean z10, boolean z11) {
            Object returnTransition;
            super(operation);
            AbstractC5504s.h(operation, "operation");
            c0.d.b bVarG = operation.g();
            c0.d.b bVar = c0.d.b.VISIBLE;
            if (bVarG == bVar) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qH = operation.h();
                returnTransition = z10 ? abstractComponentCallbacksC2838qH.getReenterTransition() : abstractComponentCallbacksC2838qH.getEnterTransition();
            } else {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qH2 = operation.h();
                returnTransition = z10 ? abstractComponentCallbacksC2838qH2.getReturnTransition() : abstractComponentCallbacksC2838qH2.getExitTransition();
            }
            this.f30028b = returnTransition;
            this.f30029c = operation.g() == bVar ? z10 ? operation.h().getAllowReturnTransitionOverlap() : operation.h().getAllowEnterTransitionOverlap() : true;
            this.f30030d = z11 ? z10 ? operation.h().getSharedElementReturnTransition() : operation.h().getSharedElementEnterTransition() : null;
        }

        private final X d(Object obj) {
            if (obj == null) {
                return null;
            }
            X x10 = V.f29888b;
            if (x10 != null && x10.g(obj)) {
                return x10;
            }
            X x11 = V.f29889c;
            if (x11 != null && x11.g(obj)) {
                return x11;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final X c() {
            X xD = d(this.f30028b);
            X xD2 = d(this.f30030d);
            if (xD == null || xD2 == null || xD == xD2) {
                return xD == null ? xD2 : xD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().h() + " returned Transition " + this.f30028b + " which uses a different Transition  type than its shared element transition " + this.f30030d).toString());
        }

        public final Object e() {
            return this.f30030d;
        }

        public final Object f() {
            return this.f30028b;
        }

        public final boolean g() {
            return this.f30030d != null;
        }

        public final boolean h() {
            return this.f30029c;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.f$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f30031a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection collection) {
            super(1);
            this.f30031a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry entry) {
            AbstractC5504s.h(entry, "entry");
            return Boolean.valueOf(AbstractC2279u.e0(this.f30031a, AbstractC2747a0.H((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2827f(ViewGroup container) {
        super(container);
        AbstractC5504s.h(container, "container");
    }

    private final void F(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2279u.D(arrayList2, ((b) it.next()).a().f());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            c0.d dVarA = bVar.a();
            AbstractC5504s.g(context, "context");
            AbstractC2843w.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f30120b == null) {
                    arrayList.add(bVar);
                } else {
                    AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qH = dVarA.h();
                    if (dVarA.f().isEmpty()) {
                        if (dVarA.g() == c0.d.b.GONE) {
                            dVarA.q(false);
                        }
                        dVarA.b(new c(bVar));
                        z10 = true;
                    } else if (K.Q0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC2838qH + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            c0.d dVarA2 = bVar2.a();
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qH2 = dVarA2.h();
            if (zIsEmpty) {
                if (!z10) {
                    dVarA2.b(new a(bVar2));
                } else if (K.Q0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC2838qH2 + " as Animations cannot run alongside Animators.");
                }
            } else if (K.Q0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC2838qH2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(C2827f this$0, c0.d operation) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(operation, "$operation");
        this$0.c(operation);
    }

    private final void H(List list, boolean z10, c0.d dVar, c0.d dVar2) {
        Object objB;
        Iterator it;
        ArrayList arrayList;
        Pair pairA;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((h) obj).b()) {
                arrayList2.add(obj);
            }
        }
        ArrayList<h> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((h) obj2).c() != null) {
                arrayList3.add(obj2);
            }
        }
        X x10 = null;
        for (h hVar : arrayList3) {
            X xC = hVar.c();
            if (x10 != null && xC != x10) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().h() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            x10 = xC;
        }
        if (x10 == null) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C6551a c6551a = new C6551a();
        ArrayList<String> arrayList6 = new ArrayList<>();
        ArrayList<String> arrayList7 = new ArrayList<>();
        C6551a c6551a2 = new C6551a();
        C6551a c6551a3 = new C6551a();
        ArrayList<String> sharedElementTargetNames = arrayList6;
        Iterator it2 = arrayList3.iterator();
        ArrayList<String> sharedElementSourceNames = arrayList7;
        loop3: while (true) {
            objB = null;
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (hVar2.g() && dVar != null && dVar2 != null) {
                    objB = x10.B(x10.h(hVar2.e()));
                    sharedElementSourceNames = dVar2.h().getSharedElementSourceNames();
                    AbstractC5504s.g(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames2 = dVar.h().getSharedElementSourceNames();
                    AbstractC5504s.g(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames2 = dVar.h().getSharedElementTargetNames();
                    AbstractC5504s.g(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames2.size();
                    it = it2;
                    int i10 = 0;
                    while (i10 < size) {
                        ArrayList arrayList8 = arrayList3;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i10));
                        int i11 = size;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i10));
                        }
                        i10++;
                        arrayList3 = arrayList8;
                        size = i11;
                    }
                    arrayList = arrayList3;
                    sharedElementTargetNames = dVar2.h().getSharedElementTargetNames();
                    AbstractC5504s.g(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                    if (z10) {
                        dVar.h().getEnterTransitionCallback();
                        dVar2.h().getExitTransitionCallback();
                        pairA = Td.z.a(null, null);
                    } else {
                        dVar.h().getExitTransitionCallback();
                        dVar2.h().getEnterTransitionCallback();
                        pairA = Td.z.a(null, null);
                    }
                    android.support.v4.media.session.b.a(pairA.getFirst());
                    android.support.v4.media.session.b.a(pairA.getSecond());
                    int i12 = 0;
                    for (int size2 = sharedElementSourceNames.size(); i12 < size2; size2 = size2) {
                        String str = sharedElementSourceNames.get(i12);
                        AbstractC5504s.g(str, "exitingNames[i]");
                        String str2 = sharedElementTargetNames.get(i12);
                        AbstractC5504s.g(str2, "enteringNames[i]");
                        c6551a.put(str, str2);
                        i12++;
                    }
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator<String> it3 = sharedElementTargetNames.iterator(); it3.hasNext(); it3 = it3) {
                            Log.v("FragmentManager", "Name: " + it3.next());
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator<String> it4 = sharedElementSourceNames.iterator(); it4.hasNext(); it4 = it4) {
                            Log.v("FragmentManager", "Name: " + it4.next());
                        }
                    }
                    View view = dVar.h().mView;
                    AbstractC5504s.g(view, "firstOut.fragment.mView");
                    I(c6551a2, view);
                    c6551a2.o(sharedElementSourceNames);
                    c6551a.o(c6551a2.keySet());
                    View view2 = dVar2.h().mView;
                    AbstractC5504s.g(view2, "lastIn.fragment.mView");
                    I(c6551a3, view2);
                    c6551a3.o(sharedElementTargetNames);
                    c6551a3.o(c6551a.values());
                    V.c(c6551a, c6551a3);
                    Collection collectionKeySet = c6551a.keySet();
                    AbstractC5504s.g(collectionKeySet, "sharedElementNameMapping.keys");
                    J(c6551a2, collectionKeySet);
                    Collection collectionValues = c6551a.values();
                    AbstractC5504s.g(collectionValues, "sharedElementNameMapping.values");
                    J(c6551a3, collectionValues);
                    if (c6551a.isEmpty()) {
                        break;
                    }
                } else {
                    it = it2;
                    arrayList = arrayList3;
                }
                it2 = it;
                arrayList3 = arrayList;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + objB + " between " + dVar + " and " + dVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList4.clear();
            arrayList5.clear();
            it2 = it;
            arrayList3 = arrayList;
        }
        ArrayList arrayList9 = arrayList3;
        if (objB == null) {
            if (arrayList9.isEmpty()) {
                return;
            }
            Iterator it5 = arrayList9.iterator();
            while (it5.hasNext()) {
                if (((h) it5.next()).f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList9, dVar, dVar2, x10, objB, arrayList4, arrayList5, c6551a, sharedElementTargetNames, sharedElementSourceNames, c6551a2, c6551a3, z10);
        Iterator it6 = arrayList9.iterator();
        while (it6.hasNext()) {
            ((h) it6.next()).a().b(gVar);
        }
    }

    private final void I(Map map, View view) {
        String strH = AbstractC2747a0.H(view);
        if (strH != null) {
            map.put(strH, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View child = viewGroup.getChildAt(i10);
                if (child.getVisibility() == 0) {
                    AbstractC5504s.g(child, "child");
                    I(map, child);
                }
            }
        }
    }

    private final void J(C6551a c6551a, Collection collection) {
        Set entries = c6551a.entrySet();
        AbstractC5504s.g(entries, "entries");
        AbstractC2279u.O(entries, new i(collection));
    }

    private final void K(List list) {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qH = ((c0.d) AbstractC2279u.y0(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0.d dVar = (c0.d) it.next();
            dVar.h().mAnimationInfo.f30090c = abstractComponentCallbacksC2838qH.mAnimationInfo.f30090c;
            dVar.h().mAnimationInfo.f30091d = abstractComponentCallbacksC2838qH.mAnimationInfo.f30091d;
            dVar.h().mAnimationInfo.f30092e = abstractComponentCallbacksC2838qH.mAnimationInfo.f30092e;
            dVar.h().mAnimationInfo.f30093f = abstractComponentCallbacksC2838qH.mAnimationInfo.f30093f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    @Override // androidx.fragment.app.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.util.List r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2827f.d(java.util.List, boolean):void");
    }
}
