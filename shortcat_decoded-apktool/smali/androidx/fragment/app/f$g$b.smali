.class final Landroidx/fragment/app/f$g$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/f$g;->f(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/f$g;

.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Landroidx/fragment/app/f$g;Landroid/view/ViewGroup;Ljava/lang/Object;Lkotlin/jvm/internal/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/f$g$b;->a:Landroidx/fragment/app/f$g;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/f$g$b;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/fragment/app/f$g$b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/fragment/app/f$g$b;->d:Lkotlin/jvm/internal/N;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/f$g$b;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/K;->Q0(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    .line 3
    const-string v1, "Attempting to create TransitionSeekController"

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/f$g$b;->a:Landroidx/fragment/app/f$g;

    .line 5
    invoke-virtual {v1}, Landroidx/fragment/app/f$g;->v()Landroidx/fragment/app/X;

    move-result-object v3

    iget-object v4, p0, Landroidx/fragment/app/f$g$b;->b:Landroid/view/ViewGroup;

    iget-object v5, p0, Landroidx/fragment/app/f$g$b;->c:Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Landroidx/fragment/app/X;->j(Landroid/view/ViewGroup;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 6
    invoke-virtual {v1, v3}, Landroidx/fragment/app/f$g;->C(Ljava/lang/Object;)V

    .line 7
    iget-object v1, p0, Landroidx/fragment/app/f$g$b;->a:Landroidx/fragment/app/f$g;

    invoke-virtual {v1}, Landroidx/fragment/app/f$g;->s()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    .line 8
    invoke-static {v0}, Landroidx/fragment/app/K;->Q0(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    const-string v0, "TransitionSeekController was not created."

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/f$g$b;->a:Landroidx/fragment/app/f$g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/f$g;->D(Z)V

    return-void

    .line 11
    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/f$g$b;->d:Lkotlin/jvm/internal/N;

    new-instance v3, Landroidx/fragment/app/f$g$b$a;

    iget-object v4, p0, Landroidx/fragment/app/f$g$b;->a:Landroidx/fragment/app/f$g;

    iget-object v5, p0, Landroidx/fragment/app/f$g$b;->c:Ljava/lang/Object;

    iget-object v6, p0, Landroidx/fragment/app/f$g$b;->b:Landroid/view/ViewGroup;

    invoke-direct {v3, v4, v5, v6}, Landroidx/fragment/app/f$g$b$a;-><init>(Landroidx/fragment/app/f$g;Ljava/lang/Object;Landroid/view/ViewGroup;)V

    iput-object v3, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 12
    invoke-static {v0}, Landroidx/fragment/app/K;->Q0(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Started executing operations from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/f$g$b;->a:Landroidx/fragment/app/f$g;

    invoke-virtual {v1}, Landroidx/fragment/app/f$g;->t()Landroidx/fragment/app/c0$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/f$g$b;->a:Landroidx/fragment/app/f$g;

    invoke-virtual {v1}, Landroidx/fragment/app/f$g;->u()Landroidx/fragment/app/c0$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return-void
.end method
