.class final Lx0/m$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/m;-><init>(Lx0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx0/m;


# direct methods
.method constructor <init>(Lx0/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx0/m$b;->a:Lx0/m;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu0/f;

    invoke-virtual {p0, p1}, Lx0/m$b;->invoke(Lu0/f;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/f;)V
    .locals 9

    .line 2
    iget-object v0, p0, Lx0/m$b;->a:Lx0/m;

    invoke-virtual {v0}, Lx0/m;->l()Lx0/c;

    move-result-object v0

    iget-object v1, p0, Lx0/m$b;->a:Lx0/m;

    invoke-static {v1}, Lx0/m;->f(Lx0/m;)F

    move-result v2

    invoke-static {v1}, Lx0/m;->g(Lx0/m;)F

    move-result v1

    sget-object v3, Lr0/f;->b:Lr0/f$a;

    invoke-virtual {v3}, Lr0/f$a;->c()J

    move-result-wide v3

    .line 3
    invoke-interface {p1}, Lu0/f;->n1()Lu0/d;

    move-result-object v5

    .line 4
    invoke-interface {v5}, Lu0/d;->f()J

    move-result-wide v6

    .line 5
    invoke-interface {v5}, Lu0/d;->b()Ls0/j0;

    move-result-object v8

    invoke-interface {v8}, Ls0/j0;->p()V

    .line 6
    :try_start_0
    invoke-interface {v5}, Lu0/d;->a()Lu0/h;

    move-result-object v8

    .line 7
    invoke-interface {v8, v2, v1, v3, v4}, Lu0/h;->f(FFJ)V

    .line 8
    invoke-virtual {v0, p1}, Lx0/c;->a(Lu0/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    invoke-interface {v5}, Lu0/d;->b()Ls0/j0;

    move-result-object p1

    invoke-interface {p1}, Ls0/j0;->k()V

    .line 10
    invoke-interface {v5, v6, v7}, Lu0/d;->e(J)V

    return-void

    :catchall_0
    move-exception p1

    .line 11
    invoke-interface {v5}, Lu0/d;->b()Ls0/j0;

    move-result-object v0

    invoke-interface {v0}, Ls0/j0;->k()V

    .line 12
    invoke-interface {v5, v6, v7}, Lu0/d;->e(J)V

    throw p1
.end method
