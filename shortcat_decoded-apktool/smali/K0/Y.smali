.class public abstract LK0/Y;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/e$b;


# static fields
.field public static final $stable:I


# instance fields
.field private _inspectorValues:Landroidx/compose/ui/platform/V0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final a()Landroidx/compose/ui/platform/V0;
    .locals 2

    .line 1
    iget-object v0, p0, LK0/Y;->_inspectorValues:Landroidx/compose/ui/platform/V0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/platform/V0;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/compose/ui/platform/V0;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Lpe/d;->v()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/V0;->d(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, LK0/Y;->inspectableProperties(Landroidx/compose/ui/platform/V0;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LK0/Y;->_inspectorValues:Landroidx/compose/ui/platform/V0;

    .line 29
    .line 30
    :cond_0
    return-object v0
.end method


# virtual methods
.method public abstract create()Landroidx/compose/ui/e$c;
.end method

.method public final getInspectableElements()LCf/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LCf/i;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, LK0/Y;->a()Landroidx/compose/ui/platform/V0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getNameFallback()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/Y;->a()Landroidx/compose/ui/platform/V0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/platform/V0;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getValueOverride()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/Y;->a()Landroidx/compose/ui/platform/V0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/platform/V0;->c()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/V0;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Ll0/d;->c(Landroidx/compose/ui/platform/V0;LK0/Y;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract update(Landroidx/compose/ui/e$c;)V
.end method
