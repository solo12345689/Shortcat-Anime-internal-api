.class public final synthetic Lr4/s0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/common/util/concurrent/d;


# instance fields
.field public final synthetic a:Landroidx/work/b;

.field public final synthetic b:Landroidx/concurrent/futures/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/b;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/s0;->a:Landroidx/work/b;

    .line 5
    .line 6
    iput-object p2, p0, Lr4/s0;->b:Landroidx/concurrent/futures/c$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/p;
    .locals 2

    .line 1
    iget-object v0, p0, Lr4/s0;->a:Landroidx/work/b;

    .line 2
    .line 3
    iget-object v1, p0, Lr4/s0;->b:Landroidx/concurrent/futures/c$a;

    .line 4
    .line 5
    check-cast p1, Lcg/v;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lr4/E0;->i(Landroidx/work/b;Landroidx/concurrent/futures/c$a;Lcg/v;)Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
