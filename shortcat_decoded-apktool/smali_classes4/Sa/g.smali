.class public final LSa/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSa/g$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/react/uimanager/b0;

.field private final b:LSa/d;

.field private final c:F

.field private d:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/b0;Lcom/swmansion/rnscreens/y;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "screen"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LSa/g;->a:Lcom/facebook/react/uimanager/b0;

    .line 15
    .line 16
    invoke-direct {p0, p2}, LSa/g;->b(Lcom/swmansion/rnscreens/y;)LSa/d;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LSa/g;->b:LSa/d;

    .line 21
    .line 22
    const p1, 0x3e99999a    # 0.3f

    .line 23
    .line 24
    .line 25
    iput p1, p0, LSa/g;->c:F

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a(Lcom/swmansion/rnscreens/y;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LSa/g;->c(Lcom/swmansion/rnscreens/y;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final b(Lcom/swmansion/rnscreens/y;)LSa/d;
    .locals 3

    .line 1
    new-instance v0, LSa/d;

    .line 2
    .line 3
    iget-object v1, p0, LSa/g;->a:Lcom/facebook/react/uimanager/b0;

    .line 4
    .line 5
    iget v2, p0, LSa/g;->c:F

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LSa/d;-><init>(Landroid/content/Context;F)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, LSa/e;

    .line 20
    .line 21
    invoke-direct {v1, p1}, LSa/e;-><init>(Lcom/swmansion/rnscreens/y;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method private static final c(Lcom/swmansion/rnscreens/y;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getSheetClosesOnTouchOutside()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getFragment()Landroidx/fragment/app/q;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p1, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment"

    .line 12
    .line 13
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p0, Lcom/swmansion/rnscreens/X;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/X;->Z()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private final i(Lcom/swmansion/rnscreens/y;Z)Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;
    .locals 2

    .line 1
    iget-object v0, p0, LSa/g;->d:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    :cond_0
    new-instance p2, LSa/g$a;

    .line 8
    .line 9
    iget-object v0, p0, LSa/g;->b:LSa/d;

    .line 10
    .line 11
    iget v1, p0, LSa/g;->c:F

    .line 12
    .line 13
    invoke-direct {p2, p1, v0, v1}, LSa/g$a;-><init>(Lcom/swmansion/rnscreens/y;Landroid/view/View;F)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, LSa/g;->d:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;

    .line 17
    .line 18
    :cond_1
    iget-object p1, p0, LSa/g;->d:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method


# virtual methods
.method public final d()LSa/d;
    .locals 1

    .line 1
    iget-object v0, p0, LSa/g;->b:LSa/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()F
    .locals 1

    .line 1
    iget v0, p0, LSa/g;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public final f(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    .line 1
    iget-object v0, p0, LSa/g;->d:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->D0(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final g(Lcom/swmansion/rnscreens/y;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "behavior"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p0, p1, v0}, LSa/g;->i(Lcom/swmansion/rnscreens/y;Z)Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p2, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final h(Lcom/swmansion/rnscreens/y;Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "root"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LSa/g;->b:LSa/d;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p2, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetInitialDetentIndex()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p0, p1, p2}, LSa/g;->j(Lcom/swmansion/rnscreens/y;I)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, LSa/g;->b:LSa/d;

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object p1, p0, LSa/g;->b:LSa/d;

    .line 35
    .line 36
    iget p2, p0, LSa/g;->c:F

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final j(Lcom/swmansion/rnscreens/y;I)Z
    .locals 1

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getSheetLargestUndimmedDetentIndex()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-le p2, p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method
