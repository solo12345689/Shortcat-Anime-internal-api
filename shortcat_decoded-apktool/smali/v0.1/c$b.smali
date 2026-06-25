.class final Lv0/c$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv0/c;-><init>(Lv0/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv0/c;


# direct methods
.method constructor <init>(Lv0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv0/c$b;->a:Lv0/c;

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

    invoke-virtual {p0, p1}, Lv0/c$b;->invoke(Lu0/f;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/f;)V
    .locals 7

    .line 2
    iget-object v0, p0, Lv0/c$b;->a:Lv0/c;

    invoke-static {v0}, Lv0/c;->b(Lv0/c;)Ls0/m1;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lv0/c$b;->a:Lv0/c;

    invoke-static {v1}, Lv0/c;->c(Lv0/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lv0/c$b;->a:Lv0/c;

    invoke-virtual {v1}, Lv0/c;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lv0/c$b;->a:Lv0/c;

    .line 5
    sget-object v2, Ls0/q0;->a:Ls0/q0$a;

    invoke-virtual {v2}, Ls0/q0$a;->b()I

    move-result v2

    .line 6
    invoke-interface {p1}, Lu0/f;->n1()Lu0/d;

    move-result-object v3

    .line 7
    invoke-interface {v3}, Lu0/d;->f()J

    move-result-wide v4

    .line 8
    invoke-interface {v3}, Lu0/d;->b()Ls0/j0;

    move-result-object v6

    invoke-interface {v6}, Ls0/j0;->p()V

    .line 9
    :try_start_0
    invoke-interface {v3}, Lu0/d;->a()Lu0/h;

    move-result-object v6

    .line 10
    invoke-interface {v6, v0, v2}, Lu0/h;->b(Ls0/m1;I)V

    .line 11
    invoke-static {v1, p1}, Lv0/c;->a(Lv0/c;Lu0/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    invoke-interface {v3}, Lu0/d;->b()Ls0/j0;

    move-result-object p1

    invoke-interface {p1}, Ls0/j0;->k()V

    .line 13
    invoke-interface {v3, v4, v5}, Lu0/d;->e(J)V

    return-void

    :catchall_0
    move-exception p1

    .line 14
    invoke-interface {v3}, Lu0/d;->b()Ls0/j0;

    move-result-object v0

    invoke-interface {v0}, Ls0/j0;->k()V

    .line 15
    invoke-interface {v3, v4, v5}, Lu0/d;->e(J)V

    throw p1

    .line 16
    :cond_0
    iget-object v0, p0, Lv0/c$b;->a:Lv0/c;

    invoke-static {v0, p1}, Lv0/c;->a(Lv0/c;Lu0/f;)V

    return-void
.end method
