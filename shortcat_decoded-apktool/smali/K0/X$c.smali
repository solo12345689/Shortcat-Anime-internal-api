.class final LK0/X$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/X;-><init>(LK0/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/X;


# direct methods
.method constructor <init>(LK0/X;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/X$c;->a:LK0/X;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/X$c;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, LK0/X$c;->a:LK0/X;

    invoke-virtual {v0}, LK0/X;->R1()LK0/e0;

    move-result-object v0

    iget-object v1, p0, LK0/X$c;->a:LK0/X;

    invoke-static {v1}, LK0/X;->x1(LK0/X;)J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    return-void
.end method
