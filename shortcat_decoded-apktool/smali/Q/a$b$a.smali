.class final LQ/a$b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/a$b;->invoke(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Z

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:LQ/i;


# direct methods
.method constructor <init>(JZLandroidx/compose/ui/e;LQ/i;)V
    .locals 0

    .line 1
    iput-wide p1, p0, LQ/a$b$a;->a:J

    .line 2
    .line 3
    iput-boolean p3, p0, LQ/a$b$a;->b:Z

    .line 4
    .line 5
    iput-object p4, p0, LQ/a$b$a;->c:Landroidx/compose/ui/e;

    .line 6
    .line 7
    iput-object p5, p0, LQ/a$b$a;->d:LQ/i;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LQ/a$b$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)"

    const v2, -0x5505aa6f

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-wide v0, p0, LQ/a$b$a;->a:J

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p2, v0, v2

    const/4 v0, 0x0

    if-eqz p2, :cond_a

    const p2, -0x31eeb398    # -6.0942592E8f

    invoke-interface {p1, p2}, LY/m;->V(I)V

    .line 5
    iget-boolean p2, p0, LQ/a$b$a;->b:Z

    if-eqz p2, :cond_3

    .line 6
    sget-object p2, LC/b$a;->a:LC/b$a;

    invoke-virtual {p2}, LC/b$a;->b()LC/b$e;

    move-result-object p2

    goto :goto_1

    .line 7
    :cond_3
    sget-object p2, LC/b$a;->a:LC/b$a;

    invoke-virtual {p2}, LC/b$a;->a()LC/b$e;

    move-result-object p2

    .line 8
    :goto_1
    iget-object v1, p0, LQ/a$b$a;->c:Landroidx/compose/ui/e;

    .line 9
    iget-wide v2, p0, LQ/a$b$a;->a:J

    invoke-static {v2, v3}, Li1/k;->h(J)F

    move-result v2

    .line 10
    iget-wide v3, p0, LQ/a$b$a;->a:J

    invoke-static {v3, v4}, Li1/k;->g(J)F

    move-result v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 11
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/s;->p(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 12
    iget-object v2, p0, LQ/a$b$a;->d:LQ/i;

    iget-boolean v3, p0, LQ/a$b$a;->b:Z

    .line 13
    sget-object v4, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v4}, Ll0/e$a;->l()Ll0/e$c;

    move-result-object v4

    .line 14
    invoke-static {p2, v4, p1, v0}, LC/G;->b(LC/b$e;Ll0/e$c;LY/m;I)LI0/B;

    move-result-object p2

    .line 15
    invoke-static {p1, v0}, LY/h;->a(LY/m;I)I

    move-result v0

    .line 16
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v4

    .line 17
    invoke-static {p1, v1}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    .line 18
    sget-object v5, LK0/g;->M:LK0/g$a;

    invoke-virtual {v5}, LK0/g$a;->a()Lie/a;

    move-result-object v6

    .line 19
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v7

    if-nez v7, :cond_4

    invoke-static {}, LY/h;->d()V

    .line 20
    :cond_4
    invoke-interface {p1}, LY/m;->I()V

    .line 21
    invoke-interface {p1}, LY/m;->e()Z

    move-result v7

    if-eqz v7, :cond_5

    .line 22
    invoke-interface {p1, v6}, LY/m;->h(Lie/a;)V

    goto :goto_2

    .line 23
    :cond_5
    invoke-interface {p1}, LY/m;->s()V

    .line 24
    :goto_2
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v6

    .line 25
    invoke-virtual {v5}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, p2, v7}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 26
    invoke-virtual {v5}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object p2

    invoke-static {v6, v4, p2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 27
    invoke-virtual {v5}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object p2

    .line 28
    invoke-interface {v6}, LY/m;->e()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-interface {v6}, LY/m;->D()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 29
    :cond_6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LY/m;->u(Ljava/lang/Object;)V

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0, p2}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 31
    :cond_7
    invoke-virtual {v5}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object p2

    invoke-static {v6, v1, p2}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 32
    sget-object p2, LC/J;->a:LC/J;

    .line 33
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 34
    invoke-interface {p1, v2}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v0

    .line 35
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    .line 36
    sget-object v0, LY/m;->a:LY/m$a;

    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_9

    .line 37
    :cond_8
    new-instance v1, LQ/a$b$a$a;

    invoke-direct {v1, v2}, LQ/a$b$a$a;-><init>(LQ/i;)V

    .line 38
    invoke-interface {p1, v1}, LY/m;->u(Ljava/lang/Object;)V

    .line 39
    :cond_9
    check-cast v1, Lie/a;

    const/4 v0, 0x6

    .line 40
    invoke-static {p2, v1, v3, p1, v0}, LQ/a;->c(Landroidx/compose/ui/e;Lie/a;ZLY/m;I)V

    .line 41
    invoke-interface {p1}, LY/m;->x()V

    .line 42
    invoke-interface {p1}, LY/m;->O()V

    goto :goto_3

    :cond_a
    const p2, -0x31e194f0

    .line 43
    invoke-interface {p1, p2}, LY/m;->V(I)V

    .line 44
    iget-object p2, p0, LQ/a$b$a;->c:Landroidx/compose/ui/e;

    .line 45
    iget-object v1, p0, LQ/a$b$a;->d:LQ/i;

    invoke-interface {p1, v1}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, LQ/a$b$a;->d:LQ/i;

    .line 46
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_b

    .line 47
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_c

    .line 48
    :cond_b
    new-instance v3, LQ/a$b$a$b;

    invoke-direct {v3, v2}, LQ/a$b$a$b;-><init>(LQ/i;)V

    .line 49
    invoke-interface {p1, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 50
    :cond_c
    check-cast v3, Lie/a;

    .line 51
    iget-boolean v1, p0, LQ/a$b$a;->b:Z

    .line 52
    invoke-static {p2, v3, v1, p1, v0}, LQ/a;->c(Landroidx/compose/ui/e;Lie/a;ZLY/m;I)V

    .line 53
    invoke-interface {p1}, LY/m;->O()V

    :goto_3
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-static {}, LY/w;->T()V

    :cond_d
    return-void
.end method
