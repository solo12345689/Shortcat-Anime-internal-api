.class public final Landroidx/compose/foundation/lazy/layout/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/d$a;,
        Landroidx/compose/foundation/lazy/layout/d$b;
    }
.end annotation


# instance fields
.field private final a:LF/N;

.field private final b:Lkotlin/jvm/functions/Function1;

.field private final c:LF/K;

.field private d:Landroidx/compose/foundation/lazy/layout/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LF/N;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/d;->a:LF/N;

    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/d;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    new-instance p1, LF/K;

    invoke-direct {p1}, LF/K;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/d;->c:LF/K;

    return-void
.end method

.method public synthetic constructor <init>(LF/N;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/d;-><init>(LF/N;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(Landroidx/compose/foundation/lazy/layout/d;)LF/K;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/d;->c:LF/K;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/d;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v1, Landroidx/compose/foundation/lazy/layout/d$a;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/layout/d$a;-><init>(Landroidx/compose/foundation/lazy/layout/d;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/d$a;->b()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final c()Landroidx/compose/foundation/lazy/layout/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/d;->d:Landroidx/compose/foundation/lazy/layout/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LF/N;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/d;->a:LF/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(IJ)Landroidx/compose/foundation/lazy/layout/d$b;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/d;->d:Landroidx/compose/foundation/lazy/layout/h;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/d;->c:LF/K;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3, v1}, Landroidx/compose/foundation/lazy/layout/h;->d(IJLF/K;)Landroidx/compose/foundation/lazy/layout/d$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object p1

    .line 15
    :cond_1
    :goto_0
    sget-object p1, Landroidx/compose/foundation/lazy/layout/a;->a:Landroidx/compose/foundation/lazy/layout/a;

    .line 16
    .line 17
    return-object p1
.end method

.method public final f(Landroidx/compose/foundation/lazy/layout/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/d;->d:Landroidx/compose/foundation/lazy/layout/h;

    .line 2
    .line 3
    return-void
.end method
