.class final LQ/a$f$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/a$f;->a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lie/a;

.field final synthetic c:Z


# direct methods
.method constructor <init>(JLie/a;Z)V
    .locals 0

    .line 1
    iput-wide p1, p0, LQ/a$f$a;->a:J

    .line 2
    .line 3
    iput-object p3, p0, LQ/a$f$a;->b:Lie/a;

    .line 4
    .line 5
    iput-boolean p4, p0, LQ/a$f$a;->c:Z

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp0/f;

    invoke-virtual {p0, p1}, LQ/a$f$a;->invoke(Lp0/f;)Lp0/j;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lp0/f;)Lp0/j;
    .locals 7

    .line 2
    invoke-virtual {p1}, Lp0/f;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Lr0/l;->i(J)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    .line 3
    invoke-static {p1, v0}, LQ/a;->d(Lp0/f;F)Ls0/b1;

    move-result-object v0

    .line 4
    sget-object v1, Landroidx/compose/ui/graphics/d;->b:Landroidx/compose/ui/graphics/d$a;

    iget-wide v2, p0, LQ/a$f$a;->a:J

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/graphics/d$a;->b(Landroidx/compose/ui/graphics/d$a;JIILjava/lang/Object;)Landroidx/compose/ui/graphics/d;

    move-result-object v1

    .line 5
    new-instance v2, LQ/a$f$a$a;

    iget-object v3, p0, LQ/a$f$a;->b:Lie/a;

    iget-boolean v4, p0, LQ/a$f$a;->c:Z

    invoke-direct {v2, v3, v4, v0, v1}, LQ/a$f$a$a;-><init>(Lie/a;ZLs0/b1;Landroidx/compose/ui/graphics/d;)V

    invoke-virtual {p1, v2}, Lp0/f;->p(Lkotlin/jvm/functions/Function1;)Lp0/j;

    move-result-object p1

    return-object p1
.end method
