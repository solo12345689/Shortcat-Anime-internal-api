.class public final Lcom/facebook/react/devsupport/i0;
.super Landroid/app/Dialog;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Lcom/facebook/react/p;->b:I

    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lcom/facebook/react/devsupport/i0;->a:Landroid/view/View;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 15
    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static synthetic a(ILandroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/devsupport/i0;->c(ILandroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function2;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/devsupport/i0;->d(Lkotlin/jvm/functions/Function2;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(ILandroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 2

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "windowInsets"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p0}, Landroidx/core/view/L0;->f(I)LA1/b;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p2, "getInsets(...)"

    .line 16
    .line 17
    invoke-static {p0, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string p2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 25
    .line 26
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 30
    .line 31
    iget p2, p0, LA1/b;->a:I

    .line 32
    .line 33
    iget v0, p0, LA1/b;->b:I

    .line 34
    .line 35
    iget v1, p0, LA1/b;->c:I

    .line 36
    .line 37
    iget p0, p0, LA1/b;->d:I

    .line 38
    .line 39
    invoke-virtual {p1, p2, v0, v1, p0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Landroidx/core/view/L0;->b:Landroidx/core/view/L0;

    .line 43
    .line 44
    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function2;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 1

    .line 1
    const-string v0, "p0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "p1"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroidx/core/view/L0;

    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 11
    .line 12
    const/high16 v1, -0x1000000

    .line 13
    .line 14
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/devsupport/i0;->a:Landroid/view/View;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-static {}, Landroidx/core/view/L0$p;->i()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {}, Landroidx/core/view/L0$p;->c()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    or-int/2addr v0, v1

    .line 33
    new-instance v1, Lcom/facebook/react/devsupport/g0;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lcom/facebook/react/devsupport/g0;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lcom/facebook/react/devsupport/h0;

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/h0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method
