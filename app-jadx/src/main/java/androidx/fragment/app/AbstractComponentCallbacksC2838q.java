package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.AbstractC2785u;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.AbstractC2870y;
import androidx.lifecycle.C2865t;
import androidx.lifecycle.InterfaceC2854h;
import androidx.lifecycle.InterfaceC2861o;
import androidx.lifecycle.W;
import com.revenuecat.purchases.common.Constants;
import f2.C4755c;
import g.AbstractC4814d;
import g.AbstractC4816f;
import g.InterfaceC4812b;
import g.InterfaceC4813c;
import g.InterfaceC4817g;
import h.AbstractC4888a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import m2.AbstractC5628a;
import m2.C5629b;
import q.InterfaceC6054a;

/* JADX INFO: renamed from: androidx.fragment.app.q */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC2838q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.Y, InterfaceC2854h, P3.i, InterfaceC4813c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    W.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    K mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    A mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C2865t mLifecycleRegistry;
    AbstractComponentCallbacksC2838q mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    P3.h mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    AbstractComponentCallbacksC2838q mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    Y mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    K mChildFragmentManager = new L();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new b();
    AbstractC2857k.b mMaxState = AbstractC2857k.b.f30239e;
    androidx.lifecycle.A mViewLifecycleOwnerLiveData = new androidx.lifecycle.A();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<m> mOnPreAttachedListeners = new ArrayList<>();
    private final m mSavedStateAttachListener = new c();

    /* JADX INFO: renamed from: androidx.fragment.app.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC4814d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AtomicReference f30070a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC4888a f30071b;

        a(AtomicReference atomicReference, AbstractC4888a abstractC4888a) {
            this.f30070a = atomicReference;
            this.f30071b = abstractC4888a;
        }

        @Override // g.AbstractC4814d
        public void b(Object obj, androidx.core.app.c cVar) {
            AbstractC4814d abstractC4814d = (AbstractC4814d) this.f30070a.get();
            if (abstractC4814d == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC4814d.b(obj, cVar);
        }

        @Override // g.AbstractC4814d
        public void c() {
            AbstractC4814d abstractC4814d = (AbstractC4814d) this.f30070a.getAndSet(null);
            if (abstractC4814d != null) {
                abstractC4814d.c();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC2838q.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends m {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q.m
        void a() {
            AbstractComponentCallbacksC2838q.this.mSavedStateRegistryController.c();
            androidx.lifecycle.L.c(AbstractComponentCallbacksC2838q.this);
            Bundle bundle = AbstractComponentCallbacksC2838q.this.mSavedFragmentState;
            AbstractComponentCallbacksC2838q.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC2838q.this.callStartTransitionListener(false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c0 f30076a;

        e(c0 c0Var) {
            this.f30076a = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f30076a.y()) {
                this.f30076a.n();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends AbstractC2844x {
        f() {
        }

        @Override // androidx.fragment.app.AbstractC2844x
        public View c(int i10) {
            View view = AbstractComponentCallbacksC2838q.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + AbstractComponentCallbacksC2838q.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC2844x
        public boolean d() {
            return AbstractComponentCallbacksC2838q.this.mView != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g implements InterfaceC2861o {
        g() {
        }

        @Override // androidx.lifecycle.InterfaceC2861o
        public void g(androidx.lifecycle.r rVar, AbstractC2857k.a aVar) {
            View view;
            if (aVar != AbstractC2857k.a.ON_STOP || (view = AbstractComponentCallbacksC2838q.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h implements InterfaceC6054a {
        h() {
        }

        @Override // q.InterfaceC6054a
        /* JADX INFO: renamed from: a */
        public AbstractC4816f apply(Void r32) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = AbstractComponentCallbacksC2838q.this;
            Object obj = abstractComponentCallbacksC2838q.mHost;
            return obj instanceof InterfaceC4817g ? ((InterfaceC4817g) obj).getActivityResultRegistry() : abstractComponentCallbacksC2838q.requireActivity().getActivityResultRegistry();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i implements InterfaceC6054a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC4816f f30081a;

        i(AbstractC4816f abstractC4816f) {
            this.f30081a = abstractC4816f;
        }

        @Override // q.InterfaceC6054a
        /* JADX INFO: renamed from: a */
        public AbstractC4816f apply(Void r12) {
            return this.f30081a;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class j extends m {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6054a f30083a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AtomicReference f30084b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC4888a f30085c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC4812b f30086d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC6054a interfaceC6054a, AtomicReference atomicReference, AbstractC4888a abstractC4888a, InterfaceC4812b interfaceC4812b) {
            super(null);
            this.f30083a = interfaceC6054a;
            this.f30084b = atomicReference;
            this.f30085c = abstractC4888a;
            this.f30086d = interfaceC4812b;
        }

        @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q.m
        void a() {
            String strGenerateActivityResultKey = AbstractComponentCallbacksC2838q.this.generateActivityResultKey();
            this.f30084b.set(((AbstractC4816f) this.f30083a.apply(null)).l(strGenerateActivityResultKey, AbstractComponentCallbacksC2838q.this, this.f30085c, this.f30086d));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class k {

        /* JADX INFO: renamed from: a */
        View f30088a;

        /* JADX INFO: renamed from: b */
        boolean f30089b;

        /* JADX INFO: renamed from: c */
        int f30090c;

        /* JADX INFO: renamed from: d */
        int f30091d;

        /* JADX INFO: renamed from: e */
        int f30092e;

        /* JADX INFO: renamed from: f */
        int f30093f;

        /* JADX INFO: renamed from: g */
        int f30094g;

        /* JADX INFO: renamed from: h */
        ArrayList f30095h;

        /* JADX INFO: renamed from: i */
        ArrayList f30096i;

        /* JADX INFO: renamed from: j */
        Object f30097j = null;

        /* JADX INFO: renamed from: k */
        Object f30098k;

        /* JADX INFO: renamed from: l */
        Object f30099l;

        /* JADX INFO: renamed from: m */
        Object f30100m;

        /* JADX INFO: renamed from: n */
        Object f30101n;

        /* JADX INFO: renamed from: o */
        Object f30102o;

        /* JADX INFO: renamed from: p */
        Boolean f30103p;

        /* JADX INFO: renamed from: q */
        Boolean f30104q;

        /* JADX INFO: renamed from: r */
        float f30105r;

        /* JADX INFO: renamed from: s */
        View f30106s;

        /* JADX INFO: renamed from: t */
        boolean f30107t;

        k() {
            Object obj = AbstractComponentCallbacksC2838q.USE_DEFAULT_TRANSITION;
            this.f30098k = obj;
            this.f30099l = null;
            this.f30100m = obj;
            this.f30101n = null;
            this.f30102o = obj;
            this.f30105r = 1.0f;
            this.f30106s = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class m {
        private m() {
        }

        abstract void a();

        /* synthetic */ m(b bVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        final Bundle f30108a;

        /* JADX INFO: renamed from: androidx.fragment.app.q$n$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f30108a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f30108a);
        }
    }

    public AbstractComponentCallbacksC2838q() {
        s();
    }

    public static /* synthetic */ void g(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        abstractComponentCallbacksC2838q.mViewLifecycleOwner.d(abstractComponentCallbacksC2838q.mSavedViewRegistryState);
        abstractComponentCallbacksC2838q.mSavedViewRegistryState = null;
    }

    private k h() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    private int i() {
        AbstractC2857k.b bVar = this.mMaxState;
        return (bVar == AbstractC2857k.b.f30236b || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.i());
    }

    @Deprecated
    public static AbstractComponentCallbacksC2838q instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private AbstractComponentCallbacksC2838q j(boolean z10) {
        String str;
        if (z10) {
            C4755c.j(this);
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = this.mTarget;
        if (abstractComponentCallbacksC2838q != null) {
            return abstractComponentCallbacksC2838q;
        }
        K k10 = this.mFragmentManager;
        if (k10 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return k10.m0(str);
    }

    private void s() {
        this.mLifecycleRegistry = new C2865t(this);
        this.mSavedStateRegistryController = P3.h.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        u(this.mSavedStateAttachListener);
    }

    private AbstractC4814d t(AbstractC4888a abstractC4888a, InterfaceC6054a interfaceC6054a, InterfaceC4812b interfaceC4812b) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            u(new j(interfaceC6054a, atomicReference, abstractC4888a, interfaceC4812b));
            return new a(atomicReference, abstractC4888a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void u(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    private void v() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        K k10;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f30107t = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (k10 = this.mFragmentManager) == null) {
            return;
        }
        c0 c0VarU = c0.u(viewGroup, k10);
        c0VarU.z();
        if (z10) {
            this.mHost.h().post(new e(c0VarU));
        } else {
            c0VarU.n();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    AbstractC2844x createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qJ = j(false);
        if (abstractComponentCallbacksC2838qJ != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC2838qJ);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        this.mChildFragmentManager.d0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    AbstractComponentCallbacksC2838q findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.r0(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final AbstractActivityC2842v getActivity() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return (AbstractActivityC2842v) a10.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f30104q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f30103p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f30088a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final K getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return a10.f();
    }

    @Override // androidx.lifecycle.InterfaceC2854h
    public AbstractC5628a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && K.Q0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C5629b c5629b = new C5629b();
        if (application != null) {
            c5629b.c(W.a.f30212e, application);
        }
        c5629b.c(androidx.lifecycle.L.f30172a, this);
        c5629b.c(androidx.lifecycle.L.f30173b, this);
        if (getArguments() != null) {
            c5629b.c(androidx.lifecycle.L.f30174c, getArguments());
        }
        return c5629b;
    }

    @Override // androidx.lifecycle.InterfaceC2854h
    public W.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && K.Q0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.P(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f30090c;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f30097j;
    }

    androidx.core.app.x getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f30091d;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f30099l;
    }

    androidx.core.app.x getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f30106s;
    }

    @Deprecated
    public final K getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        A a10 = this.mHost;
        if (a10 == null) {
            return null;
        }
        return a10.j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.r
    public AbstractC2857k getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f30094g;
    }

    public final AbstractComponentCallbacksC2838q getParentFragment() {
        return this.mParentFragment;
    }

    public final K getParentFragmentManager() {
        K k10 = this.mFragmentManager;
        if (k10 != null) {
            return k10;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f30089b;
    }

    int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f30092e;
    }

    int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f30093f;
    }

    float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f30105r;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f30100m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C4755c.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f30098k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // P3.i
    public final P3.f getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f30101n;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f30102o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f30095h) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f30096i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final AbstractComponentCallbacksC2838q getTargetFragment() {
        return j(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C4755c.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.r getViewLifecycleOwner() {
        Y y10 = this.mViewLifecycleOwner;
        if (y10 != null) {
            return y10;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public AbstractC2870y getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.Y
    public androidx.lifecycle.X getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() != AbstractC2857k.b.f30236b.ordinal()) {
            return this.mFragmentManager.L0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        s();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new L();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        K k10 = this.mFragmentManager;
        return k10 != null && k10.T0(this.mParentFragment);
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        K k10 = this.mFragmentManager;
        return k10 == null || k10.U0(this.mParentFragment);
    }

    boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f30107t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        K k10 = this.mFragmentManager;
        if (k10 == null) {
            return false;
        }
        return k10.X0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.c1();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (K.Q0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        A a10 = this.mHost;
        Activity activityE = a10 == null ? null : a10.e();
        if (activityE != null) {
            this.mCalled = false;
            onAttach(activityE);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.W0(1)) {
            return;
        }
        this.mChildFragmentManager.I();
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        A a10 = this.mHost;
        Activity activityE = a10 == null ? null : a10.e();
        if (activityE != null) {
            this.mCalled = false;
            onInflate(activityE, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.c1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            v();
            this.mChildFragmentManager.E();
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.q(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.O(this);
            this.mChildFragmentManager.F();
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.H(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.c1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.g(AbstractC2857k.a.ON_CREATE);
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return this.mChildFragmentManager.J(menu, menuInflater) | z10;
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.c1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new Y(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.p
            @Override // java.lang.Runnable
            public final void run() {
                AbstractComponentCallbacksC2838q.g(this.f30069a);
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (K.Q0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.Z.b(this.mView, this.mViewLifecycleOwner);
        androidx.lifecycle.a0.b(this.mView, this.mViewLifecycleOwner);
        P3.m.b(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.n(this.mViewLifecycleOwner);
    }

    void performDestroy() {
        this.mChildFragmentManager.K();
        this.mLifecycleRegistry.g(AbstractC2857k.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.L();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getCurrentState().b(AbstractC2857k.b.f30237c)) {
            this.mViewLifecycleOwner.a(AbstractC2857k.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.b(this).d();
            this.mPerformedCreateView = false;
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.P0()) {
                return;
            }
            this.mChildFragmentManager.K();
            this.mChildFragmentManager = new L();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.Q(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.R(menu);
    }

    void performPause() {
        this.mChildFragmentManager.T();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC2857k.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.g(AbstractC2857k.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return this.mChildFragmentManager.V(menu) | z10;
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zV0 = this.mFragmentManager.V0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zV0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zV0);
            onPrimaryNavigationFragmentChanged(zV0);
            this.mChildFragmentManager.W();
        }
    }

    void performResume() {
        this.mChildFragmentManager.c1();
        this.mChildFragmentManager.h0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new e0("Fragment " + this + " did not call through to super.onResume()");
        }
        C2865t c2865t = this.mLifecycleRegistry;
        AbstractC2857k.a aVar = AbstractC2857k.a.ON_RESUME;
        c2865t.g(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.X();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    void performStart() {
        this.mChildFragmentManager.c1();
        this.mChildFragmentManager.h0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new e0("Fragment " + this + " did not call through to super.onStart()");
        }
        C2865t c2865t = this.mLifecycleRegistry;
        AbstractC2857k.a aVar = AbstractC2857k.a.ON_START;
        c2865t.g(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.Y();
    }

    void performStop() {
        this.mChildFragmentManager.a0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC2857k.a.ON_STOP);
        }
        this.mLifecycleRegistry.g(AbstractC2857k.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.b0();
    }

    public void postponeEnterTransition() {
        h().f30107t = true;
    }

    @Override // g.InterfaceC4813c
    public final <I, O> AbstractC4814d registerForActivityResult(AbstractC4888a abstractC4888a, InterfaceC4812b interfaceC4812b) {
        return t(abstractC4888a, new h(), interfaceC4812b);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().Y0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final AbstractActivityC2842v requireActivity() {
        AbstractActivityC2842v activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final K requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final AbstractComponentCallbacksC2838q requireParentFragment() {
        AbstractComponentCallbacksC2838q parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.t1(bundle);
        this.mChildFragmentManager.I();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(AbstractC2857k.a.ON_CREATE);
            }
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        h().f30104q = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        h().f30103p = Boolean.valueOf(z10);
    }

    void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        h().f30090c = i10;
        h().f30091d = i11;
        h().f30092e = i12;
        h().f30093f = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.x xVar) {
        h().getClass();
    }

    public void setEnterTransition(Object obj) {
        h().f30097j = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.x xVar) {
        h().getClass();
    }

    public void setExitTransition(Object obj) {
        h().f30099l = obj;
    }

    void setFocusedView(View view) {
        h().f30106s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.p();
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.f30108a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.p();
            }
        }
    }

    void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        h();
        this.mAnimationInfo.f30094g = i10;
    }

    void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        h().f30089b = z10;
    }

    void setPostOnViewCreatedAlpha(float f10) {
        h().f30105r = f10;
    }

    public void setReenterTransition(Object obj) {
        h().f30100m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        C4755c.k(this);
        this.mRetainInstance = z10;
        K k10 = this.mFragmentManager;
        if (k10 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            k10.o(this);
        } else {
            k10.r1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        h().f30098k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        h().f30101n = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        h();
        k kVar = this.mAnimationInfo;
        kVar.f30095h = arrayList;
        kVar.f30096i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        h().f30102o = obj;
    }

    @Deprecated
    public void setTargetFragment(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, int i10) {
        if (abstractComponentCallbacksC2838q != null) {
            C4755c.l(this, abstractComponentCallbacksC2838q, i10);
        }
        K k10 = this.mFragmentManager;
        K k11 = abstractComponentCallbacksC2838q != null ? abstractComponentCallbacksC2838q.mFragmentManager : null;
        if (k10 != null && k11 != null && k10 != k11) {
            throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2838q + " must share the same FragmentManager to be set as a target fragment");
        }
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qJ = abstractComponentCallbacksC2838q; abstractComponentCallbacksC2838qJ != null; abstractComponentCallbacksC2838qJ = abstractComponentCallbacksC2838qJ.j(false)) {
            if (abstractComponentCallbacksC2838qJ.equals(this)) {
                throw new IllegalArgumentException("Setting " + abstractComponentCallbacksC2838q + " as the target of " + this + " would create a target cycle");
            }
        }
        if (abstractComponentCallbacksC2838q == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || abstractComponentCallbacksC2838q.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = abstractComponentCallbacksC2838q;
        } else {
            this.mTargetWho = abstractComponentCallbacksC2838q.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        C4755c.m(this, z10);
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            K k10 = this.mFragmentManager;
            k10.e1(k10.C(this));
        }
        this.mUserVisibleHint = z10;
        this.mDeferStart = this.mState < 5 && !z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        A a10 = this.mHost;
        if (a10 != null) {
            return a10.m(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Bundle bundle2;
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (K.Q0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fragment ");
            sb2.append(this);
            sb2.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb2.append(i10);
            sb2.append(" IntentSender: ");
            sb2.append(intentSender);
            sb2.append(" fillInIntent: ");
            sb2.append(intent);
            sb2.append(" options: ");
            bundle2 = bundle;
            sb2.append(bundle2);
            Log.v("FragmentManager", sb2.toString());
        } else {
            bundle2 = bundle;
        }
        getParentFragmentManager().a1(this, intentSender, i10, intent, i11, i12, i13, bundle2);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !h().f30107t) {
            return;
        }
        if (this.mHost == null) {
            h().f30107t = false;
        } else if (Looper.myLooper() != this.mHost.h().getLooper()) {
            this.mHost.h().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static AbstractComponentCallbacksC2838q instantiate(Context context, String str, Bundle bundle) {
        try {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = (AbstractComponentCallbacksC2838q) AbstractC2846z.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return abstractComponentCallbacksC2838q;
            }
            bundle.setClassLoader(abstractComponentCallbacksC2838q.getClass().getClassLoader());
            abstractComponentCallbacksC2838q.setArguments(bundle);
            return abstractComponentCallbacksC2838q;
        } catch (IllegalAccessException e10) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        h().f30107t = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        K k10 = this.mFragmentManager;
        if (k10 != null) {
            this.mPostponedHandler = k10.D0().h();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> AbstractC4814d registerForActivityResult(AbstractC4888a abstractC4888a, AbstractC4816f abstractC4816f, InterfaceC4812b interfaceC4812b) {
        return t(abstractC4888a, new i(abstractC4816f), interfaceC4812b);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        A a10 = this.mHost;
        if (a10 != null) {
            a10.n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().Z0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        A a10 = this.mHost;
        if (a10 != null) {
            LayoutInflater layoutInflaterK = a10.k();
            AbstractC2785u.a(layoutInflaterK, this.mChildFragmentManager.E0());
            return layoutInflaterK;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }
}
