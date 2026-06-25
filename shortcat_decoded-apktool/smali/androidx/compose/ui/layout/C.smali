.class public final Landroidx/compose/ui/layout/C;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/layout/C$a;
    }
.end annotation


# static fields
.field public static final f:I = 0x8


# instance fields
.field private final a:Landroidx/compose/ui/layout/D;

.field private b:Landroidx/compose/ui/layout/j;

.field private final c:Lkotlin/jvm/functions/Function2;

.field private final d:Lkotlin/jvm/functions/Function2;

.field private final e:Lkotlin/jvm/functions/Function2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 5
    sget-object v0, Landroidx/compose/ui/layout/m;->a:Landroidx/compose/ui/layout/m;

    invoke-direct {p0, v0}, Landroidx/compose/ui/layout/C;-><init>(Landroidx/compose/ui/layout/D;)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/layout/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/C;->a:Landroidx/compose/ui/layout/D;

    .line 2
    new-instance p1, Landroidx/compose/ui/layout/C$d;

    invoke-direct {p1, p0}, Landroidx/compose/ui/layout/C$d;-><init>(Landroidx/compose/ui/layout/C;)V

    iput-object p1, p0, Landroidx/compose/ui/layout/C;->c:Lkotlin/jvm/functions/Function2;

    .line 3
    new-instance p1, Landroidx/compose/ui/layout/C$b;

    invoke-direct {p1, p0}, Landroidx/compose/ui/layout/C$b;-><init>(Landroidx/compose/ui/layout/C;)V

    iput-object p1, p0, Landroidx/compose/ui/layout/C;->d:Lkotlin/jvm/functions/Function2;

    .line 4
    new-instance p1, Landroidx/compose/ui/layout/C$c;

    invoke-direct {p1, p0}, Landroidx/compose/ui/layout/C$c;-><init>(Landroidx/compose/ui/layout/C;)V

    iput-object p1, p0, Landroidx/compose/ui/layout/C;->e:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public static final synthetic a(Landroidx/compose/ui/layout/C;)Landroidx/compose/ui/layout/D;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/layout/C;->a:Landroidx/compose/ui/layout/D;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Landroidx/compose/ui/layout/C;)Landroidx/compose/ui/layout/j;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/layout/C;->h()Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Landroidx/compose/ui/layout/C;Landroidx/compose/ui/layout/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/C;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    return-void
.end method

.method private final h()Landroidx/compose/ui/layout/j;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/C;->b:Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v1, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method


# virtual methods
.method public final d()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/layout/C;->h()Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/layout/j;->B()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final e()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/C;->d:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/C;->e:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lkotlin/jvm/functions/Function2;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/C;->c:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/C$a;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/layout/C;->h()Landroidx/compose/ui/layout/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/layout/j;->J(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/C$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
