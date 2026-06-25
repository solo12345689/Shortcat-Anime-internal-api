.class final LK0/V$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/V;->e2(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/V;

.field final synthetic b:J


# direct methods
.method constructor <init>(LK0/V;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/V$d;->a:LK0/V;

    .line 2
    .line 3
    iput-wide p2, p0, LK0/V$d;->b:J

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/V$d;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, LK0/V$d;->a:LK0/V;

    invoke-static {v0}, LK0/V;->z1(LK0/V;)LK0/e0;

    move-result-object v0

    invoke-virtual {v0}, LK0/e0;->I2()LK0/U;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    iget-wide v1, p0, LK0/V$d;->b:J

    invoke-interface {v0, v1, v2}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    return-void
.end method
