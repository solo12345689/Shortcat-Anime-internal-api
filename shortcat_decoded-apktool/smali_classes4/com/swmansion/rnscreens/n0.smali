.class public final Lcom/swmansion/rnscreens/n0;
.super Lcom/facebook/react/views/view/g;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/n0$a;,
        Lcom/swmansion/rnscreens/n0$b;
    }
.end annotation


# instance fields
.field private a:Lcom/swmansion/rnscreens/n0$b;

.field private b:Lcom/swmansion/rnscreens/n0$a;

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/Integer;

.field private e:Ljava/lang/Integer;

.field private f:Ljava/lang/Integer;

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Lcom/swmansion/rnscreens/o0;

.field private l:Z

.field private final m:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/g;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/swmansion/rnscreens/n0$b;->a:Lcom/swmansion/rnscreens/n0$b;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/n0;->a:Lcom/swmansion/rnscreens/n0$b;

    .line 7
    .line 8
    sget-object p1, Lcom/swmansion/rnscreens/n0$a;->a:Lcom/swmansion/rnscreens/n0$a;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/swmansion/rnscreens/n0;->b:Lcom/swmansion/rnscreens/n0$a;

    .line 11
    .line 12
    const-string p1, ""

    .line 13
    .line 14
    iput-object p1, p0, Lcom/swmansion/rnscreens/n0;->g:Ljava/lang/String;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/n0;->h:Z

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/n0;->j:Z

    .line 20
    .line 21
    invoke-static {p0}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput p1, p0, Lcom/swmansion/rnscreens/n0;->m:I

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic B(Lcom/swmansion/rnscreens/n0;Lcom/swmansion/rnscreens/d;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/n0;->S(Lcom/swmansion/rnscreens/n0;Lcom/swmansion/rnscreens/d;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic C(Lcom/swmansion/rnscreens/n0;Landroid/view/View;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/swmansion/rnscreens/n0;->V(Lcom/swmansion/rnscreens/n0;Landroid/view/View;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic D(Lcom/swmansion/rnscreens/n0;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/n0;->W(Lcom/swmansion/rnscreens/n0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic E(Lcom/swmansion/rnscreens/n0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/n0;->X(Lcom/swmansion/rnscreens/n0;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic F(Lcom/swmansion/rnscreens/n0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/n0;->P(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic G(Lcom/swmansion/rnscreens/n0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/n0;->Q(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final K()V
    .locals 3

    .line 1
    new-instance v0, LTa/o;

    .line 2
    .line 3
    iget v1, p0, Lcom/swmansion/rnscreens/n0;->m:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v0, v1, v2}, LTa/o;-><init>(II)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n0;->U(Lcom/facebook/react/uimanager/events/d;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n0;->setToolbarElementsVisibility(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private final L(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p1, LTa/p;

    .line 4
    .line 5
    iget v0, p0, Lcom/swmansion/rnscreens/n0;->m:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {p1, v0, v1}, LTa/p;-><init>(II)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, LTa/m;

    .line 16
    .line 17
    iget v0, p0, Lcom/swmansion/rnscreens/n0;->m:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-direct {p1, v0, v1}, LTa/m;-><init>(II)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/n0;->U(Lcom/facebook/react/uimanager/events/d;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private final N()V
    .locals 3

    .line 1
    new-instance v0, LTa/q;

    .line 2
    .line 3
    iget v1, p0, Lcom/swmansion/rnscreens/n0;->m:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v0, v1, v2}, LTa/q;-><init>(II)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n0;->U(Lcom/facebook/react/uimanager/events/d;)V

    .line 13
    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n0;->setToolbarElementsVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final P(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, LTa/n;

    .line 2
    .line 3
    iget v1, p0, Lcom/swmansion/rnscreens/n0;->m:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v0, v1, v2, p1}, LTa/n;-><init>(IILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n0;->U(Lcom/facebook/react/uimanager/events/d;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final Q(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, LTa/r;

    .line 2
    .line 3
    iget v1, p0, Lcom/swmansion/rnscreens/n0;->m:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-direct {v0, v1, v2, p1}, LTa/r;-><init>(IILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n0;->U(Lcom/facebook/react/uimanager/events/d;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final S(Lcom/swmansion/rnscreens/n0;Lcom/swmansion/rnscreens/d;)LTd/L;
    .locals 1

    .line 1
    const-string v0, "newSearchView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/n0;->k:Lcom/swmansion/rnscreens/o0;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/swmansion/rnscreens/o0;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/o0;-><init>(Landroidx/appcompat/widget/SearchView;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/swmansion/rnscreens/n0;->k:Lcom/swmansion/rnscreens/o0;

    .line 16
    .line 17
    :cond_0
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->Y()V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, Lcom/swmansion/rnscreens/n0;->i:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getScreenStackFragment()Lcom/swmansion/rnscreens/X;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/X;->c0()Lcom/swmansion/rnscreens/d;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/d;->q0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    sget-object p0, LTd/L;->a:LTd/L;

    .line 40
    .line 41
    return-object p0
.end method

.method private final U(Lcom/facebook/react/uimanager/events/d;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/f0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {v0, p1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->d(Lcom/facebook/react/uimanager/events/d;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method private static final V(Lcom/swmansion/rnscreens/n0;Landroid/view/View;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/swmansion/rnscreens/n0;->L(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final W(Lcom/swmansion/rnscreens/n0;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->K()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0
.end method

.method private static final X(Lcom/swmansion/rnscreens/n0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->N()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final Y()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getScreenStackFragment()Lcom/swmansion/rnscreens/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/X;->c0()Lcom/swmansion/rnscreens/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_7

    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/n0;->l:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/n0;->setSearchViewListeners(Landroidx/appcompat/widget/SearchView;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iput-boolean v1, p0, Lcom/swmansion/rnscreens/n0;->l:Z

    .line 24
    .line 25
    :cond_1
    iget-object v1, p0, Lcom/swmansion/rnscreens/n0;->a:Lcom/swmansion/rnscreens/n0$b;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/swmansion/rnscreens/n0;->b:Lcom/swmansion/rnscreens/n0$a;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/n0$b;->b(Lcom/swmansion/rnscreens/n0$a;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->setInputType(I)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/swmansion/rnscreens/n0;->k:Lcom/swmansion/rnscreens/o0;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Lcom/swmansion/rnscreens/n0;->c:Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/o0;->h(Ljava/lang/Integer;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object v1, p0, Lcom/swmansion/rnscreens/n0;->k:Lcom/swmansion/rnscreens/o0;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    iget-object v2, p0, Lcom/swmansion/rnscreens/n0;->d:Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/o0;->i(Ljava/lang/Integer;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iget-object v1, p0, Lcom/swmansion/rnscreens/n0;->k:Lcom/swmansion/rnscreens/o0;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-object v2, p0, Lcom/swmansion/rnscreens/n0;->e:Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/o0;->e(Ljava/lang/Integer;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iget-object v1, p0, Lcom/swmansion/rnscreens/n0;->k:Lcom/swmansion/rnscreens/o0;

    .line 64
    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    iget-object v2, p0, Lcom/swmansion/rnscreens/n0;->f:Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/o0;->f(Ljava/lang/Integer;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    iget-object v1, p0, Lcom/swmansion/rnscreens/n0;->k:Lcom/swmansion/rnscreens/o0;

    .line 73
    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    iget-object v2, p0, Lcom/swmansion/rnscreens/n0;->g:Ljava/lang/String;

    .line 77
    .line 78
    iget-boolean v3, p0, Lcom/swmansion/rnscreens/n0;->j:Z

    .line 79
    .line 80
    invoke-virtual {v1, v2, v3}, Lcom/swmansion/rnscreens/o0;->g(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    :cond_6
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/n0;->h:Z

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/d;->setOverrideBackAction(Z)V

    .line 86
    .line 87
    .line 88
    :cond_7
    return-void
.end method

.method private final getHeaderConfig()Lcom/swmansion/rnscreens/a0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/swmansion/rnscreens/d0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/swmansion/rnscreens/d0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/d0;->getConfig()Lcom/swmansion/rnscreens/a0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method private final getScreenStackFragment()Lcom/swmansion/rnscreens/X;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getHeaderConfig()Lcom/swmansion/rnscreens/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/a0;->getScreenFragment()Lcom/swmansion/rnscreens/X;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method private final setSearchViewListeners(Landroidx/appcompat/widget/SearchView;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/n0$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/n0$c;-><init>(Lcom/swmansion/rnscreens/n0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$m;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/swmansion/rnscreens/k0;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/k0;-><init>(Lcom/swmansion/rnscreens/n0;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcom/swmansion/rnscreens/l0;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/l0;-><init>(Lcom/swmansion/rnscreens/n0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnCloseListener(Landroidx/appcompat/widget/SearchView$l;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/swmansion/rnscreens/m0;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/m0;-><init>(Lcom/swmansion/rnscreens/n0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setOnSearchClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private final setToolbarElementsVisibility(I)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getHeaderConfig()Lcom/swmansion/rnscreens/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/a0;->getConfigSubviewsCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    if-ltz v0, :cond_4

    .line 17
    .line 18
    :goto_1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getHeaderConfig()Lcom/swmansion/rnscreens/a0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lcom/swmansion/rnscreens/a0;->g(I)Lcom/swmansion/rnscreens/d0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    move-object v2, v3

    .line 31
    :goto_2
    if-eqz v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/d0;->getType()Lcom/swmansion/rnscreens/d0$a;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    :cond_2
    sget-object v4, Lcom/swmansion/rnscreens/d0$a;->e:Lcom/swmansion/rnscreens/d0$a;

    .line 38
    .line 39
    if-eq v3, v4, :cond_3

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    :cond_3
    if-eq v1, v0, :cond_4

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    return-void
.end method


# virtual methods
.method public final H()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getScreenStackFragment()Lcom/swmansion/rnscreens/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/X;->c0()Lcom/swmansion/rnscreens/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final I()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getScreenStackFragment()Lcom/swmansion/rnscreens/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/X;->c0()Lcom/swmansion/rnscreens/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/d;->o0()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final J()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getScreenStackFragment()Lcom/swmansion/rnscreens/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/X;->c0()Lcom/swmansion/rnscreens/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/d;->p0()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final M()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getScreenStackFragment()Lcom/swmansion/rnscreens/X;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/X;->c0()Lcom/swmansion/rnscreens/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/d;->q0()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final O(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getScreenStackFragment()Lcom/swmansion/rnscreens/X;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/X;->c0()Lcom/swmansion/rnscreens/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/swmansion/rnscreens/d;->setText(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final R(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final T()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->Y()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final getAutoCapitalize()Lcom/swmansion/rnscreens/n0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n0;->b:Lcom/swmansion/rnscreens/n0$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAutoFocus()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/n0;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHeaderIconColor()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n0;->e:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHintTextColor()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n0;->f:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInputType()Lcom/swmansion/rnscreens/n0$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n0;->a:Lcom/swmansion/rnscreens/n0$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaceholder()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n0;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShouldOverrideBackButton()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/n0;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getShouldShowHintSearchIcon()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/n0;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTextColor()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n0;->c:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTintColor()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/n0;->d:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/facebook/react/views/view/g;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/swmansion/rnscreens/n0;->getScreenStackFragment()Lcom/swmansion/rnscreens/X;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v1, Lcom/swmansion/rnscreens/j0;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/swmansion/rnscreens/j0;-><init>(Lcom/swmansion/rnscreens/n0;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/X;->n0(Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final setAutoCapitalize(Lcom/swmansion/rnscreens/n0$a;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/n0;->b:Lcom/swmansion/rnscreens/n0$a;

    .line 7
    .line 8
    return-void
.end method

.method public final setAutoFocus(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/n0;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHeaderIconColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/n0;->e:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setHintTextColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/n0;->f:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setInputType(Lcom/swmansion/rnscreens/n0$b;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/n0;->a:Lcom/swmansion/rnscreens/n0$b;

    .line 7
    .line 8
    return-void
.end method

.method public final setPlaceholder(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/n0;->g:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setShouldOverrideBackButton(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/n0;->h:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setShouldShowHintSearchIcon(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/n0;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setTextColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/n0;->c:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setTintColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/n0;->d:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method
