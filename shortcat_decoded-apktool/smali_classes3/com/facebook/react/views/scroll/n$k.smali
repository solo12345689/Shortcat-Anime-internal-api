.class public final Lcom/facebook/react/views/scroll/n$k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/scroll/n;->v(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/n$k;->a:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    const-string v0, "animator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/views/scroll/n$k;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    check-cast p1, Lcom/facebook/react/views/scroll/n$c;

    .line 9
    .line 10
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/n$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/n$h;->j(Z)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/facebook/react/views/scroll/n$k;->a:Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/facebook/react/views/scroll/n;->r(Landroid/view/ViewGroup;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    const-string v0, "animator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/views/scroll/n$k;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    check-cast p1, Lcom/facebook/react/views/scroll/n$c;

    .line 9
    .line 10
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/n$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/n$h;->m(Z)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/facebook/react/views/scroll/n$k;->a:Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/facebook/react/views/scroll/n;->r(Landroid/view/ViewGroup;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/facebook/react/views/scroll/n$k;->a:Landroid/view/ViewGroup;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/facebook/react/views/scroll/n;->z(Landroid/view/ViewGroup;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    const-string v0, "animator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    const-string v0, "animator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/views/scroll/n$k;->a:Landroid/view/ViewGroup;

    .line 7
    .line 8
    check-cast p1, Lcom/facebook/react/views/scroll/n$c;

    .line 9
    .line 10
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/n$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/n$h;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/n$h;->j(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/n$h;->m(Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
