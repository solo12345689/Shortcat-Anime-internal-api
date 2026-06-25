.class final Lz/f$c$a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/f$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/f;

.field final synthetic b:Lz/E;

.field final synthetic c:Lz/d;


# direct methods
.method constructor <init>(Lz/f;Lz/E;Lz/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/f$c$a$b;->a:Lz/f;

    .line 2
    .line 3
    iput-object p2, p0, Lz/f$c$a$b;->b:Lz/E;

    .line 4
    .line 5
    iput-object p3, p0, Lz/f$c$a$b;->c:Lz/d;

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
    invoke-virtual {p0}, Lz/f$c$a$b;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 2
    iget-object v0, p0, Lz/f$c$a$b;->a:Lz/f;

    invoke-static {v0}, Lz/f;->F1(Lz/f;)Lz/c;

    move-result-object v0

    iget-object v1, p0, Lz/f$c$a$b;->a:Lz/f;

    .line 3
    :goto_0
    invoke-static {v0}, Lz/c;->a(Lz/c;)La0/c;

    move-result-object v2

    invoke-virtual {v2}, La0/c;->t()Z

    move-result v2

    const/4 v7, 0x1

    if-eqz v2, :cond_1

    .line 4
    invoke-static {v0}, Lz/c;->a(Lz/c;)La0/c;

    move-result-object v2

    invoke-virtual {v2}, La0/c;->u()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz/f$a;

    invoke-virtual {v2}, Lz/f$a;->b()Lie/a;

    move-result-object v2

    invoke-interface {v2}, Lie/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr0/h;

    if-nez v2, :cond_0

    move v2, v7

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    .line 5
    invoke-static/range {v1 .. v6}, Lz/f;->W1(Lz/f;Lr0/h;JILjava/lang/Object;)Z

    move-result v2

    :goto_1
    if-eqz v2, :cond_1

    .line 6
    invoke-static {v0}, Lz/c;->a(Lz/c;)La0/c;

    move-result-object v2

    invoke-static {v0}, Lz/c;->a(Lz/c;)La0/c;

    move-result-object v3

    .line 7
    invoke-virtual {v3}, La0/c;->p()I

    move-result v3

    sub-int/2addr v3, v7

    .line 8
    invoke-virtual {v2, v3}, La0/c;->y(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz/f$a;

    invoke-virtual {v2}, Lz/f$a;->a()LGf/n;

    move-result-object v2

    sget-object v3, LTd/L;->a:LTd/L;

    invoke-static {v3}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v0, p0, Lz/f$c$a$b;->a:Lz/f;

    invoke-static {v0}, Lz/f;->J1(Lz/f;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, p0, Lz/f$c$a$b;->a:Lz/f;

    invoke-static {v0}, Lz/f;->G1(Lz/f;)Lr0/h;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    iget-object v1, p0, Lz/f$c$a$b;->a:Lz/f;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, Lz/f;->W1(Lz/f;Lr0/h;JILjava/lang/Object;)Z

    move-result v1

    if-ne v1, v7, :cond_2

    goto :goto_2

    :cond_2
    move v7, v0

    :goto_2
    if-eqz v7, :cond_3

    .line 11
    iget-object v1, p0, Lz/f$c$a$b;->a:Lz/f;

    invoke-static {v1, v0}, Lz/f;->N1(Lz/f;Z)V

    .line 12
    :cond_3
    iget-object v0, p0, Lz/f$c$a$b;->b:Lz/E;

    iget-object v1, p0, Lz/f$c$a$b;->a:Lz/f;

    iget-object v2, p0, Lz/f$c$a$b;->c:Lz/d;

    invoke-static {v1, v2}, Lz/f;->E1(Lz/f;Lz/d;)F

    move-result v1

    invoke-virtual {v0, v1}, Lz/E;->j(F)V

    return-void
.end method
