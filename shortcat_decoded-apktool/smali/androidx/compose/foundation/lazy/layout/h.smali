.class public final Landroidx/compose/foundation/lazy/layout/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/h$a;
    }
.end annotation


# instance fields
.field private final a:LF/o;

.field private final b:Landroidx/compose/ui/layout/C;

.field private final c:LF/N;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LF/o;Landroidx/compose/ui/layout/C;LF/N;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/h;->a:LF/o;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/h;->b:Landroidx/compose/ui/layout/C;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/h;->c:LF/N;

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic a(Landroidx/compose/foundation/lazy/layout/h;)LF/o;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/h;->a:LF/o;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Landroidx/compose/foundation/lazy/layout/h;)Landroidx/compose/ui/layout/C;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/h;->b:Landroidx/compose/ui/layout/C;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final c(IJLF/K;)LF/L;
    .locals 7

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/layout/h$a;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move v2, p1

    .line 6
    move-wide v3, p2

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/lazy/layout/h$a;-><init>(Landroidx/compose/foundation/lazy/layout/h;IJLF/K;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final d(IJLF/K;)Landroidx/compose/foundation/lazy/layout/d$b;
    .locals 7

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/layout/h$a;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move v2, p1

    .line 6
    move-wide v3, p2

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/lazy/layout/h$a;-><init>(Landroidx/compose/foundation/lazy/layout/h;IJLF/K;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v1, Landroidx/compose/foundation/lazy/layout/h;->c:LF/N;

    .line 12
    .line 13
    invoke-interface {p1, v0}, LF/N;->a(LF/L;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
