.class public final LAd/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:LAd/a;

.field private b:Ljava/lang/ref/WeakReference;

.field private c:Ljava/lang/ref/WeakReference;

.field private d:Z

.field private final e:LGf/O;

.field private final f:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LAd/d;->e:LGf/O;

    .line 13
    .line 14
    new-instance v0, LAd/b;

    .line 15
    .line 16
    invoke-direct {v0, p0}, LAd/b;-><init>(LAd/d;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LAd/d;->f:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a(LAd/d;Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LAd/d;->f(LAd/d;Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LAd/d;LAd/e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LAd/d;->e(LAd/d;LAd/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d()V
    .locals 4

    .line 1
    iget-object v0, p0, LAd/d;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LAd/e;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, LAd/d;->a:LAd/a;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, LAd/a;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-wide/16 v2, 0x12c

    .line 35
    .line 36
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, LAd/c;

    .line 41
    .line 42
    invoke-direct {v2, p0, v0}, LAd/c;-><init>(LAd/d;LAd/e;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-direct {p0, v0}, LAd/d;->g(LAd/e;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    return-void
.end method

.method private static final e(LAd/d;LAd/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LAd/d;->g(LAd/e;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final f(LAd/d;Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    .locals 6

    .line 1
    const-string p2, "name"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p2, Lcom/facebook/react/bridge/ReactMarkerConstants;->RUN_JS_BUNDLE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 7
    .line 8
    if-ne p1, p2, :cond_0

    .line 9
    .line 10
    iget-boolean p1, p0, LAd/d;->d:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LAd/d;->e:LGf/O;

    .line 15
    .line 16
    new-instance v3, LAd/d$a;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-direct {v3, p0, p1}, LAd/d$a;-><init>(LAd/d;LZd/e;)V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method private final g(LAd/e;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iput-object v2, p0, LAd/d;->b:Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    iget-object p1, p0, LAd/d;->f:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/facebook/react/bridge/ReactMarker;->removeListener(Lcom/facebook/react/bridge/ReactMarker$MarkerListener;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final j(Landroid/app/Activity;)V
    .locals 7

    .line 1
    iget-object v0, p0, LAd/d;->a:LAd/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, LAd/a;->g:LAd/a$a;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, LAd/a$a;->a(Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;)LAd/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    new-instance v1, LAd/e;

    .line 13
    .line 14
    const/4 v5, 0x6

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v2, p1

    .line 19
    invoke-direct/range {v1 .. v6}, LAd/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, LAd/e;->h(LAd/a;)V

    .line 23
    .line 24
    .line 25
    const p1, 0x1020002

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Landroid/view/ViewGroup;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 37
    .line 38
    const/4 v2, -0x1

    .line 39
    invoke-direct {v0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    invoke-direct {p1, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, LAd/d;->b:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LAd/d;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0}, LAd/d;->d()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, LAd/d;->d:Z

    .line 11
    .line 12
    return-void
.end method

.method public final h(Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;)V
    .locals 1

    .line 1
    sget-object v0, LAd/a;->g:LAd/a$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LAd/a$a;->a(Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;)LAd/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, LAd/d;->a:LAd/a;

    .line 8
    .line 9
    return-void
.end method

.method public final i(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LAd/d;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, LAd/d;->f:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->addListener(Lcom/facebook/react/bridge/ReactMarker$MarkerListener;)V

    .line 9
    .line 10
    .line 11
    if-nez p1, :cond_2

    .line 12
    .line 13
    iget-object p1, p0, LAd/d;->c:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/app/Activity;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    :cond_2
    :goto_0
    if-nez p1, :cond_3

    .line 26
    .line 27
    :goto_1
    return-void

    .line 28
    :cond_3
    invoke-direct {p0, p1}, LAd/d;->j(Landroid/app/Activity;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, LAd/d;->d:Z

    .line 33
    .line 34
    return-void
.end method
