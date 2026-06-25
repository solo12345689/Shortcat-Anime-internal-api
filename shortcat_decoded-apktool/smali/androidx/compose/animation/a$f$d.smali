.class final Landroidx/compose/animation/a$f$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f;->invoke(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li0/E;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/animation/e;

.field final synthetic d:Lie/p;


# direct methods
.method constructor <init>(Li0/E;Ljava/lang/Object;Landroidx/compose/animation/e;Lie/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/a$f$d;->a:Li0/E;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/a$f$d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/animation/a$f$d;->c:Landroidx/compose/animation/e;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/animation/a$f$d;->d:Lie/p;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv/e;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/animation/a$f$d;->invoke(Lv/e;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lv/e;LY/m;I)V
    .locals 5

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-interface {p2, p1}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-interface {p2, p1}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr p3, v0

    :cond_2
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_4

    .line 2
    invoke-interface {p2}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    .line 3
    :cond_3
    invoke-interface {p2}, LY/m;->K()V

    return-void

    .line 4
    :cond_4
    :goto_2
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:793)"

    const v2, -0x24ba65ea

    invoke-static {v2, p3, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_5
    iget-object v0, p0, Landroidx/compose/animation/a$f$d;->a:Li0/E;

    invoke-interface {p2, v0}, LY/m;->U(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Landroidx/compose/animation/a$f$d;->b:Ljava/lang/Object;

    invoke-interface {p2, v1}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/animation/a$f$d;->c:Landroidx/compose/animation/e;

    invoke-interface {p2, v1}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/animation/a$f$d;->a:Li0/E;

    iget-object v2, p0, Landroidx/compose/animation/a$f$d;->b:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/compose/animation/a$f$d;->c:Landroidx/compose/animation/e;

    .line 5
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_6

    .line 6
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_7

    .line 7
    :cond_6
    new-instance v4, Landroidx/compose/animation/a$f$d$a;

    invoke-direct {v4, v1, v2, v3}, Landroidx/compose/animation/a$f$d$a;-><init>(Li0/E;Ljava/lang/Object;Landroidx/compose/animation/e;)V

    .line 8
    invoke-interface {p2, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 9
    :cond_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    and-int/lit8 p3, p3, 0xe

    invoke-static {p1, v4, p2, p3}, LY/b0;->b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LY/m;I)V

    .line 10
    iget-object p3, p0, Landroidx/compose/animation/a$f$d;->c:Landroidx/compose/animation/e;

    invoke-virtual {p3}, Landroidx/compose/animation/e;->h()Lt/P;

    move-result-object p3

    iget-object v0, p0, Landroidx/compose/animation/a$f$d;->b:Ljava/lang/Object;

    .line 11
    const-string v1, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lv/f;

    invoke-virtual {v1}, Lv/f;->a()LY/C0;

    move-result-object v1

    .line 12
    invoke-virtual {p3, v0, v1}, Lt/P;->x(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object p3

    .line 14
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p3, v0, :cond_8

    .line 15
    new-instance p3, Landroidx/compose/animation/c;

    invoke-direct {p3, p1}, Landroidx/compose/animation/c;-><init>(Lv/e;)V

    .line 16
    invoke-interface {p2, p3}, LY/m;->u(Ljava/lang/Object;)V

    .line 17
    :cond_8
    check-cast p3, Landroidx/compose/animation/c;

    iget-object p1, p0, Landroidx/compose/animation/a$f$d;->d:Lie/p;

    iget-object v0, p0, Landroidx/compose/animation/a$f$d;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, p3, v0, p2, v1}, Lie/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LY/w;->T()V

    :cond_9
    return-void
.end method
