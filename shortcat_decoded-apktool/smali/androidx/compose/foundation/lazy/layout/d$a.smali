.class final Landroidx/compose/foundation/lazy/layout/d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/lazy/layout/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field final synthetic b:Landroidx/compose/foundation/lazy/layout/d;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/d$a;->b:Landroidx/compose/foundation/lazy/layout/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/d$a;->a:Ljava/util/List;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/foundation/lazy/layout/e;->a()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, p1, v0, v1}, Landroidx/compose/foundation/lazy/layout/d$a;->c(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/d$a;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(IJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/d$a;->b:Landroidx/compose/foundation/lazy/layout/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/d;->c()Landroidx/compose/foundation/lazy/layout/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/d$a;->a:Ljava/util/List;

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/d$a;->b:Landroidx/compose/foundation/lazy/layout/d;

    .line 13
    .line 14
    invoke-static {v2}, Landroidx/compose/foundation/lazy/layout/d;->a(Landroidx/compose/foundation/lazy/layout/d;)LF/K;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, p1, p2, p3, v2}, Landroidx/compose/foundation/lazy/layout/h;->c(IJLF/K;)LF/L;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method
