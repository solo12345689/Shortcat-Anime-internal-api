.class final LK/a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/a;->a(LQ/i;Landroidx/compose/ui/e;JLY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Landroidx/compose/ui/e;


# direct methods
.method constructor <init>(JLandroidx/compose/ui/e;)V
    .locals 0

    .line 1
    iput-wide p1, p0, LK/a$a;->a:J

    .line 2
    .line 3
    iput-object p3, p0, LK/a$a;->b:Landroidx/compose/ui/e;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
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

    invoke-virtual {p0, p1, p2}, LK/a$a;->invoke(LY/m;I)V

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

    const-string v1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)"

    const v2, -0x628ed1fe

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-wide v0, p0, LK/a$a;->a:J

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p2, v0, v2

    const/4 v0, 0x0

    if-eqz p2, :cond_7

    const p2, 0x6d028268

    invoke-interface {p1, p2}, LY/m;->V(I)V

    .line 5
    iget-object v1, p0, LK/a$a;->b:Landroidx/compose/ui/e;

    .line 6
    iget-wide v2, p0, LK/a$a;->a:J

    invoke-static {v2, v3}, Li1/k;->h(J)F

    move-result v2

    .line 7
    iget-wide v3, p0, LK/a$a;->a:J

    invoke-static {v3, v4}, Li1/k;->g(J)F

    move-result v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 8
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/s;->p(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 9
    sget-object v1, Ll0/e;->a:Ll0/e$a;

    invoke-virtual {v1}, Ll0/e$a;->m()Ll0/e;

    move-result-object v1

    .line 10
    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/f;->h(Ll0/e;Z)LI0/B;

    move-result-object v1

    .line 11
    invoke-static {p1, v0}, LY/h;->a(LY/m;I)I

    move-result v2

    .line 12
    invoke-interface {p1}, LY/m;->r()LY/I;

    move-result-object v3

    .line 13
    invoke-static {p1, p2}, Landroidx/compose/ui/c;->f(LY/m;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    .line 14
    sget-object v4, LK0/g;->M:LK0/g$a;

    invoke-virtual {v4}, LK0/g$a;->a()Lie/a;

    move-result-object v5

    .line 15
    invoke-interface {p1}, LY/m;->j()LY/d;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-static {}, LY/h;->d()V

    .line 16
    :cond_3
    invoke-interface {p1}, LY/m;->I()V

    .line 17
    invoke-interface {p1}, LY/m;->e()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 18
    invoke-interface {p1, v5}, LY/m;->h(Lie/a;)V

    goto :goto_1

    .line 19
    :cond_4
    invoke-interface {p1}, LY/m;->s()V

    .line 20
    :goto_1
    invoke-static {p1}, LY/m2;->b(LY/m;)LY/m;

    move-result-object v5

    .line 21
    invoke-virtual {v4}, LK0/g$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v5, v1, v6}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 22
    invoke-virtual {v4}, LK0/g$a;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v3, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    invoke-virtual {v4}, LK0/g$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 24
    invoke-interface {v5}, LY/m;->e()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v5}, LY/m;->D()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 25
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LY/m;->u(Ljava/lang/Object;)V

    .line 26
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v1}, LY/m;->m(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 27
    :cond_6
    invoke-virtual {v4}, LK0/g$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, p2, v1}, LY/m2;->e(LY/m;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 28
    sget-object p2, Landroidx/compose/foundation/layout/h;->a:Landroidx/compose/foundation/layout/h;

    const/4 p2, 0x0

    const/4 v1, 0x1

    .line 29
    invoke-static {p2, p1, v0, v1}, LK/a;->c(Landroidx/compose/ui/e;LY/m;II)V

    .line 30
    invoke-interface {p1}, LY/m;->x()V

    .line 31
    invoke-interface {p1}, LY/m;->O()V

    goto :goto_2

    :cond_7
    const p2, 0x6d07a484

    .line 32
    invoke-interface {p1, p2}, LY/m;->V(I)V

    .line 33
    iget-object p2, p0, LK/a$a;->b:Landroidx/compose/ui/e;

    invoke-static {p2, p1, v0, v0}, LK/a;->c(Landroidx/compose/ui/e;LY/m;II)V

    .line 34
    invoke-interface {p1}, LY/m;->O()V

    :goto_2
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LY/w;->T()V

    :cond_8
    return-void
.end method
