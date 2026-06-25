package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC2747a0;
import androidx.fragment.app.c0;
import androidx.lifecycle.AbstractC2857k;
import e2.AbstractC4641b;
import f2.C4755c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class S {

    /* JADX INFO: renamed from: a */
    private final D f29847a;

    /* JADX INFO: renamed from: b */
    private final T f29848b;

    /* JADX INFO: renamed from: c */
    private final AbstractComponentCallbacksC2838q f29849c;

    /* JADX INFO: renamed from: d */
    private boolean f29850d = false;

    /* JADX INFO: renamed from: e */
    private int f29851e = -1;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f29854a;

        static {
            int[] iArr = new int[AbstractC2857k.b.values().length];
            f29854a = iArr;
            try {
                iArr[AbstractC2857k.b.f30239e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29854a[AbstractC2857k.b.f30238d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29854a[AbstractC2857k.b.f30237c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29854a[AbstractC2857k.b.f30236b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    S(D d10, T t10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        this.f29847a = d10;
        this.f29848b = t10;
        this.f29849c = abstractComponentCallbacksC2838q;
    }

    private boolean l(View view) {
        if (view == this.f29849c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f29849c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f29849c);
        }
        Bundle bundle = this.f29849c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f29849c.performActivityCreated(bundle2);
        this.f29847a.a(this.f29849c, bundle2, false);
    }

    void b() {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qT0 = K.t0(this.f29849c.mContainer);
        AbstractComponentCallbacksC2838q parentFragment = this.f29849c.getParentFragment();
        if (abstractComponentCallbacksC2838qT0 != null && !abstractComponentCallbacksC2838qT0.equals(parentFragment)) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
            C4755c.o(abstractComponentCallbacksC2838q, abstractComponentCallbacksC2838qT0, abstractComponentCallbacksC2838q.mContainerId);
        }
        int iJ = this.f29848b.j(this.f29849c);
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = this.f29849c;
        abstractComponentCallbacksC2838q2.mContainer.addView(abstractComponentCallbacksC2838q2.mView, iJ);
    }

    void c() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f29849c);
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = abstractComponentCallbacksC2838q.mTarget;
        S sN = null;
        if (abstractComponentCallbacksC2838q2 != null) {
            S sN2 = this.f29848b.n(abstractComponentCallbacksC2838q2.mWho);
            if (sN2 == null) {
                throw new IllegalStateException("Fragment " + this.f29849c + " declared target fragment " + this.f29849c.mTarget + " that does not belong to this FragmentManager!");
            }
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q3 = this.f29849c;
            abstractComponentCallbacksC2838q3.mTargetWho = abstractComponentCallbacksC2838q3.mTarget.mWho;
            abstractComponentCallbacksC2838q3.mTarget = null;
            sN = sN2;
        } else {
            String str = abstractComponentCallbacksC2838q.mTargetWho;
            if (str != null && (sN = this.f29848b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f29849c + " declared target fragment " + this.f29849c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (sN != null) {
            sN.m();
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q4 = this.f29849c;
        abstractComponentCallbacksC2838q4.mHost = abstractComponentCallbacksC2838q4.mFragmentManager.D0();
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q5 = this.f29849c;
        abstractComponentCallbacksC2838q5.mParentFragment = abstractComponentCallbacksC2838q5.mFragmentManager.G0();
        this.f29847a.g(this.f29849c, false);
        this.f29849c.performAttach();
        this.f29847a.b(this.f29849c, false);
    }

    int d() {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
        if (abstractComponentCallbacksC2838q.mFragmentManager == null) {
            return abstractComponentCallbacksC2838q.mState;
        }
        int iMin = this.f29851e;
        int i10 = b.f29854a[abstractComponentCallbacksC2838q.mMaxState.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = this.f29849c;
        if (abstractComponentCallbacksC2838q2.mFromLayout) {
            if (abstractComponentCallbacksC2838q2.mInLayout) {
                iMin = Math.max(this.f29851e, 2);
                View view = this.f29849c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f29851e < 4 ? Math.min(iMin, abstractComponentCallbacksC2838q2.mState) : Math.min(iMin, 1);
            }
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q3 = this.f29849c;
        if (abstractComponentCallbacksC2838q3.mInDynamicContainer && abstractComponentCallbacksC2838q3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f29849c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q4 = this.f29849c;
        ViewGroup viewGroup = abstractComponentCallbacksC2838q4.mContainer;
        c0.d.a aVarS = viewGroup != null ? c0.u(viewGroup, abstractComponentCallbacksC2838q4.getParentFragmentManager()).s(this) : null;
        if (aVarS == c0.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == c0.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q5 = this.f29849c;
            if (abstractComponentCallbacksC2838q5.mRemoving) {
                iMin = abstractComponentCallbacksC2838q5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q6 = this.f29849c;
        if (abstractComponentCallbacksC2838q6.mDeferStart && abstractComponentCallbacksC2838q6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f29849c.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (K.Q0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f29849c);
        }
        return iMin;
    }

    void e() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f29849c);
        }
        Bundle bundle = this.f29849c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
        if (abstractComponentCallbacksC2838q.mIsCreated) {
            abstractComponentCallbacksC2838q.mState = 1;
            abstractComponentCallbacksC2838q.restoreChildFragmentState();
        } else {
            this.f29847a.h(abstractComponentCallbacksC2838q, bundle2, false);
            this.f29849c.performCreate(bundle2);
            this.f29847a.c(this.f29849c, bundle2, false);
        }
    }

    void f() {
        String resourceName;
        if (this.f29849c.mFromLayout) {
            return;
        }
        if (K.Q0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f29849c);
        }
        Bundle bundle = this.f29849c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f29849c.performGetLayoutInflater(bundle2);
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
        ViewGroup viewGroup2 = abstractComponentCallbacksC2838q.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = abstractComponentCallbacksC2838q.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f29849c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC2838q.mFragmentManager.z0().c(this.f29849c.mContainerId);
                if (viewGroup == null) {
                    AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = this.f29849c;
                    if (!abstractComponentCallbacksC2838q2.mRestored && !abstractComponentCallbacksC2838q2.mInDynamicContainer) {
                        try {
                            resourceName = abstractComponentCallbacksC2838q2.getResources().getResourceName(this.f29849c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f29849c.mContainerId) + " (" + resourceName + ") for fragment " + this.f29849c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C4755c.n(this.f29849c, viewGroup);
                }
            }
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q3 = this.f29849c;
        abstractComponentCallbacksC2838q3.mContainer = viewGroup;
        abstractComponentCallbacksC2838q3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f29849c.mView != null) {
            if (K.Q0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f29849c);
            }
            this.f29849c.mView.setSaveFromParentEnabled(false);
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q4 = this.f29849c;
            abstractComponentCallbacksC2838q4.mView.setTag(AbstractC4641b.f45785a, abstractComponentCallbacksC2838q4);
            if (viewGroup != null) {
                b();
            }
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q5 = this.f29849c;
            if (abstractComponentCallbacksC2838q5.mHidden) {
                abstractComponentCallbacksC2838q5.mView.setVisibility(8);
            }
            if (this.f29849c.mView.isAttachedToWindow()) {
                AbstractC2747a0.h0(this.f29849c.mView);
            } else {
                View view = this.f29849c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f29849c.performViewCreated();
            D d10 = this.f29847a;
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q6 = this.f29849c;
            d10.m(abstractComponentCallbacksC2838q6, abstractComponentCallbacksC2838q6.mView, bundle2, false);
            int visibility = this.f29849c.mView.getVisibility();
            this.f29849c.setPostOnViewCreatedAlpha(this.f29849c.mView.getAlpha());
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q7 = this.f29849c;
            if (abstractComponentCallbacksC2838q7.mContainer != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC2838q7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f29849c.setFocusedView(viewFindFocus);
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f29849c);
                    }
                }
                this.f29849c.mView.setAlpha(0.0f);
            }
        }
        this.f29849c.mState = 2;
    }

    void g() {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qF;
        if (K.Q0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f29849c);
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = abstractComponentCallbacksC2838q.mRemoving && !abstractComponentCallbacksC2838q.isInBackStack();
        if (z10) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = this.f29849c;
            if (!abstractComponentCallbacksC2838q2.mBeingSaved) {
                this.f29848b.B(abstractComponentCallbacksC2838q2.mWho, null);
            }
        }
        if (!z10 && !this.f29848b.p().m(this.f29849c)) {
            String str = this.f29849c.mTargetWho;
            if (str != null && (abstractComponentCallbacksC2838qF = this.f29848b.f(str)) != null && abstractComponentCallbacksC2838qF.mRetainInstance) {
                this.f29849c.mTarget = abstractComponentCallbacksC2838qF;
            }
            this.f29849c.mState = 0;
            return;
        }
        A a10 = this.f29849c.mHost;
        if (a10 instanceof androidx.lifecycle.Y) {
            zIsChangingConfigurations = this.f29848b.p().j();
        } else if (a10.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) a10.f()).isChangingConfigurations();
        }
        if ((z10 && !this.f29849c.mBeingSaved) || zIsChangingConfigurations) {
            this.f29848b.p().b(this.f29849c, false);
        }
        this.f29849c.performDestroy();
        this.f29847a.d(this.f29849c, false);
        for (S s10 : this.f29848b.k()) {
            if (s10 != null) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
                if (this.f29849c.mWho.equals(abstractComponentCallbacksC2838qK.mTargetWho)) {
                    abstractComponentCallbacksC2838qK.mTarget = this.f29849c;
                    abstractComponentCallbacksC2838qK.mTargetWho = null;
                }
            }
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q3 = this.f29849c;
        String str2 = abstractComponentCallbacksC2838q3.mTargetWho;
        if (str2 != null) {
            abstractComponentCallbacksC2838q3.mTarget = this.f29848b.f(str2);
        }
        this.f29848b.s(this);
    }

    void h() {
        View view;
        if (K.Q0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f29849c);
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
        ViewGroup viewGroup = abstractComponentCallbacksC2838q.mContainer;
        if (viewGroup != null && (view = abstractComponentCallbacksC2838q.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f29849c.performDestroyView();
        this.f29847a.n(this.f29849c, false);
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = this.f29849c;
        abstractComponentCallbacksC2838q2.mContainer = null;
        abstractComponentCallbacksC2838q2.mView = null;
        abstractComponentCallbacksC2838q2.mViewLifecycleOwner = null;
        abstractComponentCallbacksC2838q2.mViewLifecycleOwnerLiveData.n(null);
        this.f29849c.mInLayout = false;
    }

    void i() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f29849c);
        }
        this.f29849c.performDetach();
        this.f29847a.e(this.f29849c, false);
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
        abstractComponentCallbacksC2838q.mState = -1;
        abstractComponentCallbacksC2838q.mHost = null;
        abstractComponentCallbacksC2838q.mParentFragment = null;
        abstractComponentCallbacksC2838q.mFragmentManager = null;
        if ((!abstractComponentCallbacksC2838q.mRemoving || abstractComponentCallbacksC2838q.isInBackStack()) && !this.f29848b.p().m(this.f29849c)) {
            return;
        }
        if (K.Q0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f29849c);
        }
        this.f29849c.initState();
    }

    void j() {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
        if (abstractComponentCallbacksC2838q.mFromLayout && abstractComponentCallbacksC2838q.mInLayout && !abstractComponentCallbacksC2838q.mPerformedCreateView) {
            if (K.Q0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f29849c);
            }
            Bundle bundle = this.f29849c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = this.f29849c;
            abstractComponentCallbacksC2838q2.performCreateView(abstractComponentCallbacksC2838q2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f29849c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q3 = this.f29849c;
                abstractComponentCallbacksC2838q3.mView.setTag(AbstractC4641b.f45785a, abstractComponentCallbacksC2838q3);
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q4 = this.f29849c;
                if (abstractComponentCallbacksC2838q4.mHidden) {
                    abstractComponentCallbacksC2838q4.mView.setVisibility(8);
                }
                this.f29849c.performViewCreated();
                D d10 = this.f29847a;
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q5 = this.f29849c;
                d10.m(abstractComponentCallbacksC2838q5, abstractComponentCallbacksC2838q5.mView, bundle2, false);
                this.f29849c.mState = 2;
            }
        }
    }

    AbstractComponentCallbacksC2838q k() {
        return this.f29849c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f29850d) {
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f29850d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
                int i10 = abstractComponentCallbacksC2838q.mState;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && abstractComponentCallbacksC2838q.mRemoving && !abstractComponentCallbacksC2838q.isInBackStack() && !this.f29849c.mBeingSaved) {
                        if (K.Q0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f29849c);
                        }
                        this.f29848b.p().b(this.f29849c, true);
                        this.f29848b.s(this);
                        if (K.Q0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f29849c);
                        }
                        this.f29849c.initState();
                    }
                    AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = this.f29849c;
                    if (abstractComponentCallbacksC2838q2.mHiddenChanged) {
                        if (abstractComponentCallbacksC2838q2.mView != null && (viewGroup = abstractComponentCallbacksC2838q2.mContainer) != null) {
                            c0 c0VarU = c0.u(viewGroup, abstractComponentCallbacksC2838q2.getParentFragmentManager());
                            if (this.f29849c.mHidden) {
                                c0VarU.k(this);
                            } else {
                                c0VarU.m(this);
                            }
                        }
                        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q3 = this.f29849c;
                        K k10 = abstractComponentCallbacksC2838q3.mFragmentManager;
                        if (k10 != null) {
                            k10.O0(abstractComponentCallbacksC2838q3);
                        }
                        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q4 = this.f29849c;
                        abstractComponentCallbacksC2838q4.mHiddenChanged = false;
                        abstractComponentCallbacksC2838q4.onHiddenChanged(abstractComponentCallbacksC2838q4.mHidden);
                        this.f29849c.mChildFragmentManager.P();
                    }
                    this.f29850d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC2838q.mBeingSaved && this.f29848b.q(abstractComponentCallbacksC2838q.mWho) == null) {
                                this.f29848b.B(this.f29849c.mWho, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f29849c.mState = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC2838q.mInLayout = false;
                            abstractComponentCallbacksC2838q.mState = 2;
                            break;
                        case 3:
                            if (K.Q0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f29849c);
                            }
                            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q5 = this.f29849c;
                            if (abstractComponentCallbacksC2838q5.mBeingSaved) {
                                this.f29848b.B(abstractComponentCallbacksC2838q5.mWho, q());
                            } else if (abstractComponentCallbacksC2838q5.mView != null && abstractComponentCallbacksC2838q5.mSavedViewState == null) {
                                r();
                            }
                            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q6 = this.f29849c;
                            if (abstractComponentCallbacksC2838q6.mView != null && (viewGroup2 = abstractComponentCallbacksC2838q6.mContainer) != null) {
                                c0.u(viewGroup2, abstractComponentCallbacksC2838q6.getParentFragmentManager()).l(this);
                            }
                            this.f29849c.mState = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            abstractComponentCallbacksC2838q.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC2838q.mView != null && (viewGroup3 = abstractComponentCallbacksC2838q.mContainer) != null) {
                                c0.u(viewGroup3, abstractComponentCallbacksC2838q.getParentFragmentManager()).j(c0.d.b.c(this.f29849c.mView.getVisibility()), this);
                            }
                            this.f29849c.mState = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            abstractComponentCallbacksC2838q.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th2) {
            this.f29850d = false;
            throw th2;
        }
    }

    void n() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f29849c);
        }
        this.f29849c.performPause();
        this.f29847a.f(this.f29849c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f29849c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f29849c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f29849c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
            abstractComponentCallbacksC2838q.mSavedViewState = abstractComponentCallbacksC2838q.mSavedFragmentState.getSparseParcelableArray("viewState");
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = this.f29849c;
            abstractComponentCallbacksC2838q2.mSavedViewRegistryState = abstractComponentCallbacksC2838q2.mSavedFragmentState.getBundle("viewRegistryState");
            Q q10 = (Q) this.f29849c.mSavedFragmentState.getParcelable("state");
            if (q10 != null) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q3 = this.f29849c;
                abstractComponentCallbacksC2838q3.mTargetWho = q10.f29844m;
                abstractComponentCallbacksC2838q3.mTargetRequestCode = q10.f29845n;
                Boolean bool = abstractComponentCallbacksC2838q3.mSavedUserVisibleHint;
                if (bool != null) {
                    abstractComponentCallbacksC2838q3.mUserVisibleHint = bool.booleanValue();
                    this.f29849c.mSavedUserVisibleHint = null;
                } else {
                    abstractComponentCallbacksC2838q3.mUserVisibleHint = q10.f29846o;
                }
            }
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q4 = this.f29849c;
            if (abstractComponentCallbacksC2838q4.mUserVisibleHint) {
                return;
            }
            abstractComponentCallbacksC2838q4.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    void p() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f29849c);
        }
        View focusedView = this.f29849c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (K.Q0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f29849c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f29849c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f29849c.setFocusedView(null);
        this.f29849c.performResume();
        this.f29847a.i(this.f29849c, false);
        this.f29848b.B(this.f29849c.mWho, null);
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
        abstractComponentCallbacksC2838q.mSavedFragmentState = null;
        abstractComponentCallbacksC2838q.mSavedViewState = null;
        abstractComponentCallbacksC2838q.mSavedViewRegistryState = null;
    }

    Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.f29849c;
        if (abstractComponentCallbacksC2838q.mState == -1 && (bundle = abstractComponentCallbacksC2838q.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new Q(this.f29849c));
        if (this.f29849c.mState > 0) {
            Bundle bundle3 = new Bundle();
            this.f29849c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f29847a.j(this.f29849c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f29849c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleV1 = this.f29849c.mChildFragmentManager.v1();
            if (!bundleV1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleV1);
            }
            if (this.f29849c.mView != null) {
                r();
            }
            SparseArray<Parcelable> sparseArray = this.f29849c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f29849c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f29849c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void r() {
        if (this.f29849c.mView == null) {
            return;
        }
        if (K.Q0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f29849c + " with view " + this.f29849c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f29849c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f29849c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f29849c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f29849c.mSavedViewRegistryState = bundle;
    }

    void s(int i10) {
        this.f29851e = i10;
    }

    void t() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f29849c);
        }
        this.f29849c.performStart();
        this.f29847a.k(this.f29849c, false);
    }

    void u() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f29849c);
        }
        this.f29849c.performStop();
        this.f29847a.l(this.f29849c, false);
    }

    S(D d10, T t10, ClassLoader classLoader, AbstractC2846z abstractC2846z, Bundle bundle) {
        this.f29847a = d10;
        this.f29848b = t10;
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qA = ((Q) bundle.getParcelable("state")).a(abstractC2846z, classLoader);
        this.f29849c = abstractComponentCallbacksC2838qA;
        abstractComponentCallbacksC2838qA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC2838qA.setArguments(bundle2);
        if (K.Q0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC2838qA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f29852a;

        a(View view) {
            this.f29852a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f29852a.removeOnAttachStateChangeListener(this);
            AbstractC2747a0.h0(this.f29852a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    S(D d10, T t10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Bundle bundle) {
        this.f29847a = d10;
        this.f29848b = t10;
        this.f29849c = abstractComponentCallbacksC2838q;
        abstractComponentCallbacksC2838q.mSavedViewState = null;
        abstractComponentCallbacksC2838q.mSavedViewRegistryState = null;
        abstractComponentCallbacksC2838q.mBackStackNesting = 0;
        abstractComponentCallbacksC2838q.mInLayout = false;
        abstractComponentCallbacksC2838q.mAdded = false;
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = abstractComponentCallbacksC2838q.mTarget;
        abstractComponentCallbacksC2838q.mTargetWho = abstractComponentCallbacksC2838q2 != null ? abstractComponentCallbacksC2838q2.mWho : null;
        abstractComponentCallbacksC2838q.mTarget = null;
        abstractComponentCallbacksC2838q.mSavedFragmentState = bundle;
        abstractComponentCallbacksC2838q.mArguments = bundle.getBundle("arguments");
    }
}
