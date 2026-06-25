.class final LU/d$m;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/d;->g(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LU0/Y0;FLkotlin/jvm/functions/Function2;LU0/Y0;Lkotlin/jvm/functions/Function2;Lie/o;FFLC/P;LU/k0;LU/m0;LY/m;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LU/m0;

.field final synthetic b:Lkotlin/jvm/internal/K;

.field final synthetic c:Lkotlin/jvm/internal/K;


# direct methods
.method constructor <init>(LU/m0;Lkotlin/jvm/internal/K;Lkotlin/jvm/internal/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/d$m;->a:LU/m0;

    .line 2
    .line 3
    iput-object p2, p0, LU/d$m;->b:Lkotlin/jvm/internal/K;

    .line 4
    .line 5
    iput-object p3, p0, LU/d$m;->c:Lkotlin/jvm/internal/K;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LU/d$m;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, LU/d$m;->a:LU/m0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LU/m0;->getState()LU/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LU/n0;->e()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, LU/d$m;->b:Lkotlin/jvm/internal/K;

    iget v2, v2, Lkotlin/jvm/internal/K;->a:F

    iget-object v3, p0, LU/d$m;->c:Lkotlin/jvm/internal/K;

    iget v3, v3, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr v2, v3

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->b(Ljava/lang/Float;F)Z

    move-result v0

    if-nez v0, :cond_3

    .line 3
    iget-object v0, p0, LU/d$m;->a:LU/m0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LU/m0;->getState()LU/n0;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, LU/d$m;->b:Lkotlin/jvm/internal/K;

    iget v0, v0, Lkotlin/jvm/internal/K;->a:F

    iget-object v2, p0, LU/d$m;->c:Lkotlin/jvm/internal/K;

    iget v2, v2, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr v0, v2

    invoke-virtual {v1, v0}, LU/n0;->i(F)V

    :cond_3
    :goto_1
    return-void
.end method
