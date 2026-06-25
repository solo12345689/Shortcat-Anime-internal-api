.class final Landroidx/compose/animation/e$b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/e$b;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/animation/e;

.field final synthetic b:Landroidx/compose/ui/layout/s;

.field final synthetic c:J


# direct methods
.method constructor <init>(Landroidx/compose/animation/e;Landroidx/compose/ui/layout/s;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/e$b$a;->a:Landroidx/compose/animation/e;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/e$b$a;->b:Landroidx/compose/ui/layout/s;

    .line 4
    .line 5
    iput-wide p3, p0, Landroidx/compose/animation/e$b$a;->c:J

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
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/e$b$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 14

    .line 2
    iget-object v0, p0, Landroidx/compose/animation/e$b$a;->a:Landroidx/compose/animation/e;

    invoke-virtual {v0}, Landroidx/compose/animation/e;->g()Ll0/e;

    move-result-object v1

    .line 3
    iget-object v0, p0, Landroidx/compose/animation/e$b$a;->b:Landroidx/compose/ui/layout/s;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v0

    iget-object v2, p0, Landroidx/compose/animation/e$b$a;->b:Landroidx/compose/ui/layout/s;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v2

    invoke-static {v0, v2}, Li1/s;->a(II)J

    move-result-wide v2

    iget-wide v4, p0, Landroidx/compose/animation/e$b$a;->c:J

    sget-object v6, Li1/t;->a:Li1/t;

    .line 4
    invoke-interface/range {v1 .. v6}, Ll0/e;->a(JJLi1/t;)J

    move-result-wide v9

    .line 5
    iget-object v8, p0, Landroidx/compose/animation/e$b$a;->b:Landroidx/compose/ui/layout/s;

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/s$a;->U(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;JFILjava/lang/Object;)V

    return-void
.end method
