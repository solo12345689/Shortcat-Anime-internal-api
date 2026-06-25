.class final Landroidx/compose/ui/platform/L1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/x;
.implements Landroidx/lifecycle/o;


# instance fields
.field private final a:Landroidx/compose/ui/platform/AndroidComposeView;

.field private final b:LY/x;

.field private c:Z

.field private d:Landroidx/lifecycle/k;

.field private e:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;LY/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/L1;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/platform/L1;->b:LY/x;

    .line 7
    .line 8
    sget-object p1, Landroidx/compose/ui/platform/u0;->a:Landroidx/compose/ui/platform/u0;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/compose/ui/platform/u0;->a()Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Landroidx/compose/ui/platform/L1;->e:Lkotlin/jvm/functions/Function2;

    .line 15
    .line 16
    return-void
.end method

.method public static final synthetic A(Landroidx/compose/ui/platform/L1;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/ui/platform/L1;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic B(Landroidx/compose/ui/platform/L1;Landroidx/lifecycle/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/L1;->d:Landroidx/lifecycle/k;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic C(Landroidx/compose/ui/platform/L1;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/L1;->e:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic z(Landroidx/compose/ui/platform/L1;)Landroidx/lifecycle/k;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/L1;->d:Landroidx/lifecycle/k;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final D()LY/x;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/L1;->b:LY/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Landroidx/compose/ui/platform/AndroidComposeView;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/L1;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    return-object v0
.end method

.method public dispose()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/L1;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Landroidx/compose/ui/platform/L1;->c:Z

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/ui/platform/L1;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget v1, Ll0/l;->L:I

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Landroidx/compose/ui/platform/L1;->d:Landroidx/lifecycle/k;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->removeObserver(Landroidx/lifecycle/q;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/L1;->b:LY/x;

    .line 28
    .line 29
    invoke-interface {v0}, LY/x;->dispose()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public g(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/platform/L1;->dispose()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Landroidx/compose/ui/platform/L1;->c:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/compose/ui/platform/L1;->e:Lkotlin/jvm/functions/Function2;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/L1;->h(Lkotlin/jvm/functions/Function2;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public h(Lkotlin/jvm/functions/Function2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/L1;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/ui/platform/L1$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Landroidx/compose/ui/platform/L1$a;-><init>(Landroidx/compose/ui/platform/L1;Lkotlin/jvm/functions/Function2;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->setOnViewTreeOwnersAvailable(Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
