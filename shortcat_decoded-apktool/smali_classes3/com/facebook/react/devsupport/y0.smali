.class public final Lcom/facebook/react/devsupport/y0;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/y0$a;,
        Lcom/facebook/react/devsupport/y0$b;
    }
.end annotation


# instance fields
.field private final a:Lc7/f;

.field private b:Landroid/widget/ListView;

.field private final c:Lc7/j$a;

.field private final d:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc7/f;Lc7/j;)V
    .locals 0

    .line 1
    const-string p3, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/facebook/react/devsupport/y0;->a:Lc7/f;

    .line 10
    .line 11
    new-instance p1, Lcom/facebook/react/devsupport/y0$c;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/y0$c;-><init>(Lcom/facebook/react/devsupport/y0;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/facebook/react/devsupport/y0;->c:Lc7/j$a;

    .line 17
    .line 18
    new-instance p1, Lcom/facebook/react/devsupport/v0;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/v0;-><init>(Lcom/facebook/react/devsupport/y0;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/facebook/react/devsupport/y0;->d:Landroid/view/View$OnClickListener;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/devsupport/y0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/y0;->e(Lcom/facebook/react/devsupport/y0;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/devsupport/y0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/y0;->f(Lcom/facebook/react/devsupport/y0;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/devsupport/y0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/y0;->h(Lcom/facebook/react/devsupport/y0;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final e(Lcom/facebook/react/devsupport/y0;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/y0;->a:Lc7/f;

    .line 2
    .line 3
    invoke-interface {p0}, Lc7/f;->B()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final f(Lcom/facebook/react/devsupport/y0;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/y0;->a:Lc7/f;

    .line 2
    .line 3
    invoke-interface {p0}, Lc7/f;->p()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final h(Lcom/facebook/react/devsupport/y0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Lcom/facebook/react/n;->g:I

    .line 10
    .line 11
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/facebook/react/l;->A:I

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/widget/ListView;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/facebook/react/devsupport/y0;->b:Landroid/widget/ListView;

    .line 26
    .line 27
    sget v0, Lcom/facebook/react/l;->z:I

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/widget/Button;

    .line 34
    .line 35
    new-instance v1, Lcom/facebook/react/devsupport/w0;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/w0;-><init>(Lcom/facebook/react/devsupport/y0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    sget v0, Lcom/facebook/react/l;->y:I

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Landroid/widget/Button;

    .line 50
    .line 51
    new-instance v1, Lcom/facebook/react/devsupport/x0;

    .line 52
    .line 53
    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/x0;-><init>(Lcom/facebook/react/devsupport/y0;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/y0;->a:Lc7/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lc7/f;->k()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/devsupport/y0;->a:Lc7/f;

    .line 8
    .line 9
    invoke-interface {v1}, Lc7/f;->z()[Lc7/k;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    new-array v1, v1, [Lc7/k;

    .line 17
    .line 18
    :cond_0
    iget-object v2, p0, Lcom/facebook/react/devsupport/y0;->a:Lc7/f;

    .line 19
    .line 20
    invoke-interface {v2}, Lc7/f;->t()Lc7/g;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, "Required value was null."

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    iget-object v2, p0, Lcom/facebook/react/devsupport/y0;->a:Lc7/f;

    .line 29
    .line 30
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "create(...)"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v2, v0}, Lc7/f;->r(Landroid/util/Pair;)Landroid/util/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 46
    .line 47
    const-string v2, "first"

    .line 48
    .line 49
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 55
    .line 56
    const-string v2, "second"

    .line 57
    .line 58
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    check-cast v0, [Lc7/k;

    .line 62
    .line 63
    invoke-virtual {p0, v1, v0}, Lcom/facebook/react/devsupport/y0;->i(Ljava/lang/String;[Lc7/k;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/facebook/react/devsupport/y0;->a:Lc7/f;

    .line 67
    .line 68
    invoke-interface {v0}, Lc7/f;->x()Lc7/j;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method

.method public final i(Ljava/lang/String;[Lc7/k;)V
    .locals 2

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "stack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/devsupport/y0;->b:Landroid/widget/ListView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "stackView"

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :cond_0
    new-instance v1, Lcom/facebook/react/devsupport/y0$b;

    .line 22
    .line 23
    invoke-direct {v1, p1, p2}, Lcom/facebook/react/devsupport/y0$b;-><init>(Ljava/lang/String;[Lc7/k;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    const-string p1, "view"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/facebook/react/devsupport/y0$a;

    .line 7
    .line 8
    iget-object p2, p0, Lcom/facebook/react/devsupport/y0;->a:Lc7/f;

    .line 9
    .line 10
    invoke-direct {p1, p2}, Lcom/facebook/react/devsupport/y0$a;-><init>(Lc7/f;)V

    .line 11
    .line 12
    .line 13
    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    const/4 p4, 0x1

    .line 16
    new-array p4, p4, [Lc7/k;

    .line 17
    .line 18
    iget-object p5, p0, Lcom/facebook/react/devsupport/y0;->b:Landroid/widget/ListView;

    .line 19
    .line 20
    if-nez p5, :cond_0

    .line 21
    .line 22
    const-string p5, "stackView"

    .line 23
    .line 24
    invoke-static {p5}, Lkotlin/jvm/internal/s;->u(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p5, 0x0

    .line 28
    :cond_0
    invoke-virtual {p5}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    invoke-interface {p5, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    const-string p5, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.StackFrame"

    .line 37
    .line 38
    invoke-static {p3, p5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p5, 0x0

    .line 42
    aput-object p3, p4, p5

    .line 43
    .line 44
    invoke-virtual {p1, p2, p4}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 45
    .line 46
    .line 47
    return-void
.end method
